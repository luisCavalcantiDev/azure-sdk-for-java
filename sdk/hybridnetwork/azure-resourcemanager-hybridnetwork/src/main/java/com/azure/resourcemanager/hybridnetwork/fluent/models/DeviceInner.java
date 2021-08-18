// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.models.ProvisioningState;
import com.azure.resourcemanager.hybridnetwork.models.Status;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** Device resource. */
@Fluent
public final class DeviceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeviceInner.class);

    /*
     * Device properties.
     */
    @JsonProperty(value = "properties")
    private DevicePropertiesFormat innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Device properties.
     *
     * @return the innerProperties value.
     */
    private DevicePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public DeviceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DeviceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the status property: The current device status.
     *
     * @return the status value.
     */
    public Status status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the provisioningState property: The provisioning state of the device resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the azureStackEdge property: The reference to the Azure stack edge device. Once set, it cannot be updated.
     *
     * @return the azureStackEdge value.
     */
    public SubResource azureStackEdge() {
        return this.innerProperties() == null ? null : this.innerProperties().azureStackEdge();
    }

    /**
     * Set the azureStackEdge property: The reference to the Azure stack edge device. Once set, it cannot be updated.
     *
     * @param azureStackEdge the azureStackEdge value to set.
     * @return the DeviceInner object itself.
     */
    public DeviceInner withAzureStackEdge(SubResource azureStackEdge) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DevicePropertiesFormat();
        }
        this.innerProperties().withAzureStackEdge(azureStackEdge);
        return this;
    }

    /**
     * Get the networkFunctions property: The list of network functions deployed on the device.
     *
     * @return the networkFunctions value.
     */
    public List<SubResource> networkFunctions() {
        return this.innerProperties() == null ? null : this.innerProperties().networkFunctions();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}