// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The folder that this data flow is in. If not specified, Data flow will appear at the root level. */
@Fluent
public final class DataFlowFolder {
    /*
     * The name of the folder that this data flow is in.
     */
    @JsonProperty(value = "name")
    private String name;

    /** Creates an instance of DataFlowFolder class. */
    public DataFlowFolder() {
    }

    /**
     * Get the name property: The name of the folder that this data flow is in.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the folder that this data flow is in.
     *
     * @param name the name value to set.
     * @return the DataFlowFolder object itself.
     */
    public DataFlowFolder withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
