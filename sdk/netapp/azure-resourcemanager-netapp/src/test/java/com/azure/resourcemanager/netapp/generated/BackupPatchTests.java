// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.BackupPatch;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupPatchTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupPatch model =
            BinaryData
                .fromString(
                    "{\"tags\":{\"hykojoxafnndlpic\":\"kuwhh\",\"h\":\"koymkcd\",\"reqnovvqfov\":\"pkkpw\",\"rsndsytgadgvra\":\"jxywsuws\"},\"properties\":{\"backupId\":\"neqn\",\"creationDate\":\"2021-12-02T13:04:58Z\",\"provisioningState\":\"wlquuijfqkace\",\"size\":9040428680411345053,\"label\":\"pubjibw\",\"backupType\":\"Manual\",\"failureReason\":\"ohqkvpuvksgpls\",\"volumeName\":\"nynfsynljphuo\",\"useExistingSnapshot\":true}}")
                .toObject(BackupPatch.class);
        Assertions.assertEquals("kuwhh", model.tags().get("hykojoxafnndlpic"));
        Assertions.assertEquals("pubjibw", model.label());
        Assertions.assertEquals(true, model.useExistingSnapshot());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupPatch model =
            new BackupPatch()
                .withTags(
                    mapOf(
                        "hykojoxafnndlpic",
                        "kuwhh",
                        "h",
                        "koymkcd",
                        "reqnovvqfov",
                        "pkkpw",
                        "rsndsytgadgvra",
                        "jxywsuws"))
                .withLabel("pubjibw")
                .withUseExistingSnapshot(true);
        model = BinaryData.fromObject(model).toObject(BackupPatch.class);
        Assertions.assertEquals("kuwhh", model.tags().get("hykojoxafnndlpic"));
        Assertions.assertEquals("pubjibw", model.label());
        Assertions.assertEquals(true, model.useExistingSnapshot());
    }

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
