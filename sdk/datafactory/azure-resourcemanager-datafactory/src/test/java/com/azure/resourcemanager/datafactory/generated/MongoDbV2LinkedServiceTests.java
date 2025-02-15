// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.MongoDbV2LinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class MongoDbV2LinkedServiceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MongoDbV2LinkedService model = BinaryData.fromString(
            "{\"type\":\"MongoDbV2\",\"typeProperties\":{\"connectionString\":\"datasxiaj\",\"database\":\"datacrsdgtj\"},\"connectVia\":{\"referenceName\":\"opnccaxtp\",\"parameters\":{\"feabzjp\":\"datazehijlw\",\"ceqaklsfxlrx\":\"datahjmg\"}},\"description\":\"ymfqmvnhsfjxtusb\",\"parameters\":{\"onalpwa\":{\"type\":\"Float\",\"defaultValue\":\"datakkdptsppgtp\"},\"wnwnjdrnfgtmupbl\":{\"type\":\"Array\",\"defaultValue\":\"datawuyas\"}},\"annotations\":[\"dataqvz\",\"dataikxufuwcajyezlk\",\"dataiveftugiwsvlfp\",\"databpnrgnxwrfu\"],\"\":{\"fzuvuoxzy\":\"datay\"}}")
            .toObject(MongoDbV2LinkedService.class);
        Assertions.assertEquals("opnccaxtp", model.connectVia().referenceName());
        Assertions.assertEquals("ymfqmvnhsfjxtusb", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("onalpwa").type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MongoDbV2LinkedService model = new MongoDbV2LinkedService()
            .withConnectVia(new IntegrationRuntimeReference().withReferenceName("opnccaxtp")
                .withParameters(mapOf("feabzjp", "datazehijlw", "ceqaklsfxlrx", "datahjmg")))
            .withDescription("ymfqmvnhsfjxtusb")
            .withParameters(mapOf("onalpwa",
                new ParameterSpecification().withType(ParameterType.FLOAT).withDefaultValue("datakkdptsppgtp"),
                "wnwnjdrnfgtmupbl",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datawuyas")))
            .withAnnotations(Arrays.asList("dataqvz", "dataikxufuwcajyezlk", "dataiveftugiwsvlfp", "databpnrgnxwrfu"))
            .withConnectionString("datasxiaj").withDatabase("datacrsdgtj");
        model = BinaryData.fromObject(model).toObject(MongoDbV2LinkedService.class);
        Assertions.assertEquals("opnccaxtp", model.connectVia().referenceName());
        Assertions.assertEquals("ymfqmvnhsfjxtusb", model.description());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("onalpwa").type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
