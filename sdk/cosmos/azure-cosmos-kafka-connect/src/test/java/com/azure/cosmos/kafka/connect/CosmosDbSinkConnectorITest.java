// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.kafka.connect;

import com.azure.cosmos.CosmosAsyncClient;
import com.azure.cosmos.CosmosAsyncContainer;
import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.kafka.connect.implementation.CosmosClientStore;
import com.azure.cosmos.kafka.connect.implementation.sink.CosmosSinkConfig;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.connect.json.JsonConverter;
import org.apache.kafka.connect.storage.StringConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CosmosDbSinkConnectorITest extends KafkaCosmosIntegrationTestSuiteBase {
    private static final Logger logger = LoggerFactory.getLogger(CosmosDbSinkConnectorITest.class);

    // TODO[public preview]: add more integration tests
    @Test(groups = { "kafka-integration"}, timeOut = TIMEOUT)
    public void sinkToSingleContainer() throws InterruptedException {
        Map<String, String> sinkConnectorConfig = new HashMap<>();

        sinkConnectorConfig.put("topics", singlePartitionContainerName);
        sinkConnectorConfig.put("value.converter", JsonConverter.class.getName());
        // TODO[Public Preview]: add tests for with schema
        sinkConnectorConfig.put("value.converter.schemas.enable", "false");
        sinkConnectorConfig.put("key.converter", StringConverter.class.getName());
        sinkConnectorConfig.put("connector.class", "com.azure.cosmos.kafka.connect.CosmosDBSinkConnector");
        sinkConnectorConfig.put("kafka.connect.cosmos.accountEndpoint", KafkaCosmosTestConfigurations.HOST);
        sinkConnectorConfig.put("kafka.connect.cosmos.accountKey", KafkaCosmosTestConfigurations.MASTER_KEY);
        sinkConnectorConfig.put("kafka.connect.cosmos.applicationName", "Test");
        sinkConnectorConfig.put("kafka.connect.cosmos.sink.database.name", databaseName);
        sinkConnectorConfig.put("kafka.connect.cosmos.sink.containers.topicMap", singlePartitionContainerName + "#" + singlePartitionContainerName);

        // Create topic ahead of time
        kafkaCosmosConnectContainer.createTopic(singlePartitionContainerName, 1);

        CosmosSinkConfig sinkConfig = new CosmosSinkConfig(sinkConnectorConfig);
        CosmosAsyncClient client = CosmosClientStore.getCosmosClient(sinkConfig.getAccountConfig());
        CosmosAsyncContainer container = client.getDatabase(databaseName).getContainer(singlePartitionContainerName);

        String connectorName = "simpleTest-" + UUID.randomUUID();
        try {
            // register the sink connector
            kafkaCosmosConnectContainer.registerConnector(connectorName, sinkConnectorConfig);

            KafkaProducer<String, JsonNode> kafkaProducer = kafkaCosmosConnectContainer.getProducer();

            // first create few records in the topic
            logger.info("Creating sink records...");
            List<String> recordValueIds = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                TestItem testItem = TestItem.createNewItem();
                ProducerRecord<String, JsonNode> record =
                    new ProducerRecord<>(singlePartitionContainerName, testItem.getId(), Utils.getSimpleObjectMapper().valueToTree(testItem));
                kafkaProducer.send(record);
                recordValueIds.add(testItem.getId());
            }

            // Wait for some time for the sink connector to process all records
            Thread.sleep(5000);
            // read from the container and verify all the items are created
            String query = "select * from c";
            List<String> createdItemIds = container.queryItems(query, TestItem.class)
                .byPage()
                .flatMapIterable(response -> response.getResults())
                .map(TestItem::getId)
                .collectList()
                .block();
            assertThat(createdItemIds.size()).isEqualTo(recordValueIds.size());
            assertThat(createdItemIds.containsAll(recordValueIds)).isTrue();

        } finally {
            if (client != null) {
                logger.info("cleaning container {}", singlePartitionContainerName);
                cleanUpContainer(client, databaseName, singlePartitionContainerName);
                client.close();
            }

            // IMPORTANT: remove the connector after use
            if (kafkaCosmosConnectContainer != null) {
                kafkaCosmosConnectContainer.deleteConnector(connectorName);
            }
        }
    }
}
