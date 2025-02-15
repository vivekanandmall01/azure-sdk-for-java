// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.hybridcontainerservice.fluent.models.HybridIdentityMetadataInner;
import com.azure.resourcemanager.hybridcontainerservice.models.HybridIdentityMetadata;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterIdentity;

public final class HybridIdentityMetadataImpl
    implements HybridIdentityMetadata, HybridIdentityMetadata.Definition, HybridIdentityMetadata.Update {
    private HybridIdentityMetadataInner innerObject;

    private final com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceUid() {
        return this.innerModel().resourceUid();
    }

    public String publicKey() {
        return this.innerModel().publicKey();
    }

    public ProvisionedClusterIdentity identity() {
        return this.innerModel().identity();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public HybridIdentityMetadataInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String resourceName;

    private String hybridIdentityMetadataResourceName;

    public HybridIdentityMetadataImpl withExistingProvisionedCluster(String resourceGroupName, String resourceName) {
        this.resourceGroupName = resourceGroupName;
        this.resourceName = resourceName;
        return this;
    }

    public HybridIdentityMetadata create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .putWithResponse(
                    resourceGroupName,
                    resourceName,
                    hybridIdentityMetadataResourceName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public HybridIdentityMetadata create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .putWithResponse(
                    resourceGroupName, resourceName, hybridIdentityMetadataResourceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    HybridIdentityMetadataImpl(
        String name, com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerObject = new HybridIdentityMetadataInner();
        this.serviceManager = serviceManager;
        this.hybridIdentityMetadataResourceName = name;
    }

    public HybridIdentityMetadataImpl update() {
        return this;
    }

    public HybridIdentityMetadata apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .putWithResponse(
                    resourceGroupName,
                    resourceName,
                    hybridIdentityMetadataResourceName,
                    this.innerModel(),
                    Context.NONE)
                .getValue();
        return this;
    }

    public HybridIdentityMetadata apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .putWithResponse(
                    resourceGroupName, resourceName, hybridIdentityMetadataResourceName, this.innerModel(), context)
                .getValue();
        return this;
    }

    HybridIdentityMetadataImpl(
        HybridIdentityMetadataInner innerObject,
        com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.resourceName = Utils.getValueFromIdByName(innerObject.id(), "provisionedClusters");
        this.hybridIdentityMetadataResourceName =
            Utils.getValueFromIdByName(innerObject.id(), "hybridIdentityMetadata");
    }

    public HybridIdentityMetadata refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .getWithResponse(resourceGroupName, resourceName, hybridIdentityMetadataResourceName, Context.NONE)
                .getValue();
        return this;
    }

    public HybridIdentityMetadata refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getHybridIdentityMetadatas()
                .getWithResponse(resourceGroupName, resourceName, hybridIdentityMetadataResourceName, context)
                .getValue();
        return this;
    }

    public HybridIdentityMetadataImpl withResourceUid(String resourceUid) {
        this.innerModel().withResourceUid(resourceUid);
        return this;
    }

    public HybridIdentityMetadataImpl withPublicKey(String publicKey) {
        this.innerModel().withPublicKey(publicKey);
        return this;
    }

    public HybridIdentityMetadataImpl withIdentity(ProvisionedClusterIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }
}
