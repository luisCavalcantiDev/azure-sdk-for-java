// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.models.WorkloadNetworkDhcpEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NSX DHCP. */
@Fluent
public final class WorkloadNetworkDhcpInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WorkloadNetworkDhcpInner.class);

    /*
     * DHCP properties.
     */
    @JsonProperty(value = "properties")
    private WorkloadNetworkDhcpEntity properties;

    /**
     * Get the properties property: DHCP properties.
     *
     * @return the properties value.
     */
    public WorkloadNetworkDhcpEntity properties() {
        return this.properties;
    }

    /**
     * Set the properties property: DHCP properties.
     *
     * @param properties the properties value to set.
     * @return the WorkloadNetworkDhcpInner object itself.
     */
    public WorkloadNetworkDhcpInner withProperties(WorkloadNetworkDhcpEntity properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}