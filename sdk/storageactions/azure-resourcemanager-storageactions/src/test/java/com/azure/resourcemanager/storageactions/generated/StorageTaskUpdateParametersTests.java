// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storageactions.models.ElseCondition;
import com.azure.resourcemanager.storageactions.models.IfCondition;
import com.azure.resourcemanager.storageactions.models.ManagedServiceIdentity;
import com.azure.resourcemanager.storageactions.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.storageactions.models.OnFailure;
import com.azure.resourcemanager.storageactions.models.OnSuccess;
import com.azure.resourcemanager.storageactions.models.StorageTaskAction;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperation;
import com.azure.resourcemanager.storageactions.models.StorageTaskOperationName;
import com.azure.resourcemanager.storageactions.models.StorageTaskProperties;
import com.azure.resourcemanager.storageactions.models.StorageTaskUpdateParameters;
import com.azure.resourcemanager.storageactions.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class StorageTaskUpdateParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageTaskUpdateParameters model = BinaryData.fromString(
            "{\"identity\":{\"principalId\":\"420e56ab-ec1e-461b-a795-2283ac80f946\",\"tenantId\":\"9481aa93-0af4-463c-a199-e281d8165022\",\"type\":\"None\",\"userAssignedIdentities\":{\"bdxkqpxokaj\":{\"principalId\":\"69920218-4471-49e7-a35e-acb644abe102\",\"clientId\":\"17505a17-f98c-476b-ae2d-cff2ac30ec0e\"},\"pimexgstxgcpodg\":{\"principalId\":\"3d014324-4819-48e2-ad99-9041cef9a290\",\"clientId\":\"40460eb0-b187-4fac-9696-8aacb6896bea\"},\"jrmvdjwzrlo\":{\"principalId\":\"09a96325-100a-499f-9ae5-54486760a915\",\"clientId\":\"a2350f52-3d8e-4218-a582-c9580f266c87\"},\"lwhijcoejctbzaq\":{\"principalId\":\"69e520ad-8c41-444d-9741-ada98a58689d\",\"clientId\":\"4a000af0-b8dc-4aed-9d4d-be3bb0cd380e\"}}},\"tags\":{\"bkbfkgukdkex\":\"y\",\"ocjjxhvpmouexh\":\"ppofmxaxcfjpgdd\"},\"properties\":{\"taskVersion\":986313719569038785,\"enabled\":true,\"description\":\"eojnxqbzvddn\",\"action\":{\"if\":{\"condition\":\"wndeicbtwnp\",\"operations\":[{\"name\":\"SetBlobLegalHold\",\"parameters\":{\"jthjqkwpyei\":\"uhrhcffcyddgl\",\"q\":\"xmqci\",\"xuigdtopbobj\":\"hkh\",\"uhrzayvvt\":\"ghmewuam\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"},{\"name\":\"SetBlobTags\",\"parameters\":{\"efgugnxk\":\"tkftutqxlngx\",\"hjybigehoqfbo\":\"xdqmidtthzrvqdra\",\"zlcuiywgqywgndrv\":\"skanyk\",\"ocpecfvmmco\":\"nhzgpphrcgyn\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"}]},\"else\":{\"operations\":[{\"name\":\"SetBlobTags\",\"parameters\":{\"jqabcypmivkwlzuv\":\"m\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"},{\"name\":\"DeleteBlob\",\"parameters\":{\"nlebxetqgtzxd\":\"acfi\",\"feallnwsu\":\"nqbqqwxr\",\"c\":\"isnjampmngnz\",\"ochcbonqvpkvl\":\"aqw\"},\"onSuccess\":\"continue\",\"onFailure\":\"break\"}]}},\"provisioningState\":\"Failed\",\"creationTimeInUtc\":\"2021-02-05T10:28:18Z\"}}")
            .toObject(StorageTaskUpdateParameters.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("y", model.tags().get("bkbfkgukdkex"));
        Assertions.assertEquals(true, model.properties().enabled());
        Assertions.assertEquals("eojnxqbzvddn", model.properties().description());
        Assertions.assertEquals("wndeicbtwnp", model.properties().action().ifProperty().condition());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_LEGAL_HOLD,
            model.properties().action().ifProperty().operations().get(0).name());
        Assertions.assertEquals("uhrhcffcyddgl",
            model.properties().action().ifProperty().operations().get(0).parameters().get("jthjqkwpyei"));
        Assertions.assertEquals(OnSuccess.CONTINUE,
            model.properties().action().ifProperty().operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK,
            model.properties().action().ifProperty().operations().get(0).onFailure());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_TAGS,
            model.properties().action().elseProperty().operations().get(0).name());
        Assertions.assertEquals("m",
            model.properties().action().elseProperty().operations().get(0).parameters().get("jqabcypmivkwlzuv"));
        Assertions.assertEquals(OnSuccess.CONTINUE,
            model.properties().action().elseProperty().operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK,
            model.properties().action().elseProperty().operations().get(0).onFailure());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageTaskUpdateParameters model
            = new StorageTaskUpdateParameters()
                .withIdentity(
                    new ManagedServiceIdentity().withType(ManagedServiceIdentityType.NONE)
                        .withUserAssignedIdentities(mapOf(
                            "bdxkqpxokaj", new UserAssignedIdentity(), "pimexgstxgcpodg", new UserAssignedIdentity(),
                            "jrmvdjwzrlo", new UserAssignedIdentity(), "lwhijcoejctbzaq", new UserAssignedIdentity())))
                .withTags(mapOf("bkbfkgukdkex", "y", "ocjjxhvpmouexh", "ppofmxaxcfjpgdd"))
                .withProperties(new StorageTaskProperties().withEnabled(true).withDescription("eojnxqbzvddn")
                    .withAction(new StorageTaskAction()
                        .withIfProperty(new IfCondition().withCondition("wndeicbtwnp").withOperations(Arrays.asList(
                            new StorageTaskOperation().withName(StorageTaskOperationName.SET_BLOB_LEGAL_HOLD)
                                .withParameters(mapOf("jthjqkwpyei", "uhrhcffcyddgl", "q", "xmqci", "xuigdtopbobj",
                                    "hkh", "uhrzayvvt", "ghmewuam"))
                                .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK),
                            new StorageTaskOperation().withName(StorageTaskOperationName.SET_BLOB_TAGS)
                                .withParameters(mapOf("efgugnxk", "tkftutqxlngx", "hjybigehoqfbo", "xdqmidtthzrvqdra",
                                    "zlcuiywgqywgndrv", "skanyk", "ocpecfvmmco", "nhzgpphrcgyn"))
                                .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK))))
                        .withElseProperty(new ElseCondition().withOperations(Arrays.asList(
                            new StorageTaskOperation().withName(StorageTaskOperationName.SET_BLOB_TAGS)
                                .withParameters(mapOf("jqabcypmivkwlzuv", "m")).withOnSuccess(OnSuccess.CONTINUE)
                                .withOnFailure(OnFailure.BREAK),
                            new StorageTaskOperation().withName(StorageTaskOperationName.DELETE_BLOB)
                                .withParameters(mapOf("nlebxetqgtzxd", "acfi", "feallnwsu", "nqbqqwxr", "c",
                                    "isnjampmngnz", "ochcbonqvpkvl", "aqw"))
                                .withOnSuccess(OnSuccess.CONTINUE).withOnFailure(OnFailure.BREAK))))));
        model = BinaryData.fromObject(model).toObject(StorageTaskUpdateParameters.class);
        Assertions.assertEquals(ManagedServiceIdentityType.NONE, model.identity().type());
        Assertions.assertEquals("y", model.tags().get("bkbfkgukdkex"));
        Assertions.assertEquals(true, model.properties().enabled());
        Assertions.assertEquals("eojnxqbzvddn", model.properties().description());
        Assertions.assertEquals("wndeicbtwnp", model.properties().action().ifProperty().condition());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_LEGAL_HOLD,
            model.properties().action().ifProperty().operations().get(0).name());
        Assertions.assertEquals("uhrhcffcyddgl",
            model.properties().action().ifProperty().operations().get(0).parameters().get("jthjqkwpyei"));
        Assertions.assertEquals(OnSuccess.CONTINUE,
            model.properties().action().ifProperty().operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK,
            model.properties().action().ifProperty().operations().get(0).onFailure());
        Assertions.assertEquals(StorageTaskOperationName.SET_BLOB_TAGS,
            model.properties().action().elseProperty().operations().get(0).name());
        Assertions.assertEquals("m",
            model.properties().action().elseProperty().operations().get(0).parameters().get("jqabcypmivkwlzuv"));
        Assertions.assertEquals(OnSuccess.CONTINUE,
            model.properties().action().elseProperty().operations().get(0).onSuccess());
        Assertions.assertEquals(OnFailure.BREAK,
            model.properties().action().elseProperty().operations().get(0).onFailure());
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
