// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.ResourceGuardResourceInner;
import com.azure.resourcemanager.dataprotection.models.ResourceGuard;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ResourceGuardResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceGuardResourceInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"provisioningState\":\"Succeeded\",\"allowAutoApprovals\":false,\"resourceGuardOperations\":[{\"vaultCriticalOperation\":\"fb\",\"requestResourceType\":\"kcvqvpke\"},{\"vaultCriticalOperation\":\"cvdrhvoodsot\",\"requestResourceType\":\"bzdopcj\"},{\"vaultCriticalOperation\":\"nhdldwmgxcx\",\"requestResourceType\":\"lpmutwuoegrpkhj\"},{\"vaultCriticalOperation\":\"iyq\",\"requestResourceType\":\"uicpd\"}],\"vaultCriticalOperationExclusionList\":[\"zzlvmbmpaxmodfv\",\"efyw\",\"bpfvm\",\"yhrfouyftaakcpw\"],\"description\":\"zvqtmnubexkp\"},\"eTag\":\"smond\",\"location\":\"quxvypomgkop\",\"tags\":{\"qgxy\":\"ojvpa\",\"xozap\":\"mocmbqfqvmk\",\"dd\":\"helxprglya\",\"rjxgciqib\":\"kcbcue\"},\"id\":\"hos\",\"name\":\"sdqrhzoymibmrq\",\"type\":\"ibahwflus\"}")
                .toObject(ResourceGuardResourceInner.class);
        Assertions.assertEquals("quxvypomgkop", model.location());
        Assertions.assertEquals("ojvpa", model.tags().get("qgxy"));
        Assertions.assertEquals("smond", model.etag());
        Assertions.assertEquals("zzlvmbmpaxmodfv", model.properties().vaultCriticalOperationExclusionList().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceGuardResourceInner model =
            new ResourceGuardResourceInner()
                .withLocation("quxvypomgkop")
                .withTags(mapOf("qgxy", "ojvpa", "xozap", "mocmbqfqvmk", "dd", "helxprglya", "rjxgciqib", "kcbcue"))
                .withEtag("smond")
                .withProperties(
                    new ResourceGuard()
                        .withVaultCriticalOperationExclusionList(
                            Arrays.asList("zzlvmbmpaxmodfv", "efyw", "bpfvm", "yhrfouyftaakcpw")));
        model = BinaryData.fromObject(model).toObject(ResourceGuardResourceInner.class);
        Assertions.assertEquals("quxvypomgkop", model.location());
        Assertions.assertEquals("ojvpa", model.tags().get("qgxy"));
        Assertions.assertEquals("smond", model.etag());
        Assertions.assertEquals("zzlvmbmpaxmodfv", model.properties().vaultCriticalOperationExclusionList().get(0));
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
