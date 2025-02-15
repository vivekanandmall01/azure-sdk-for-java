// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

import com.azure.core.util.Context;

/** Samples for AutoscaleSettings GetByResourceGroup. */
public final class AutoscaleSettingsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/monitor/resource-manager/Microsoft.Insights/stable/2022-10-01/examples/getAutoscaleSetting.json
     */
    /**
     * Sample code: Get an autoscale setting.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAnAutoscaleSetting(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .diagnosticSettings()
            .manager()
            .serviceClient()
            .getAutoscaleSettings()
            .getByResourceGroupWithResponse("TestingMetricsScaleSet", "MySetting", Context.NONE);
    }
}
