// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.OperationInner;
import com.azure.resourcemanager.managednetworkfabric.models.OperationDisplay;

public final class OperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"cmuapcvhd\",\"isDataAction\":false,\"display\":{\"provider\":\"qxeysko\",\"resource\":\"zinkfkbgbzbowxeq\",\"operation\":\"ljmygvkzqkjjeokb\",\"description\":\"fezrx\"},\"origin\":\"user\",\"actionType\":\"Internal\"}")
                .toObject(OperationInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationInner model = new OperationInner().withDisplay(new OperationDisplay());
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
    }
}
