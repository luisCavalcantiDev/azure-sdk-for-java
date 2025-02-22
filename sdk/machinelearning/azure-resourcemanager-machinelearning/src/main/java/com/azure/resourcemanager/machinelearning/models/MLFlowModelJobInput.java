// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The MLFlowModelJobInput model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobInputType")
@JsonTypeName("MLFlowModel")
@Fluent
public final class MLFlowModelJobInput extends JobInput {
    /*
     * Input Asset Delivery Mode.
     */
    @JsonProperty(value = "mode")
    private InputDeliveryMode mode;

    /*
     * [Required] Input Asset URI.
     */
    @JsonProperty(value = "uri", required = true)
    private String uri;

    /**
     * Get the mode property: Input Asset Delivery Mode.
     *
     * @return the mode value.
     */
    public InputDeliveryMode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Input Asset Delivery Mode.
     *
     * @param mode the mode value to set.
     * @return the MLFlowModelJobInput object itself.
     */
    public MLFlowModelJobInput withMode(InputDeliveryMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the uri property: [Required] Input Asset URI.
     *
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: [Required] Input Asset URI.
     *
     * @param uri the uri value to set.
     * @return the MLFlowModelJobInput object itself.
     */
    public MLFlowModelJobInput withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MLFlowModelJobInput withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (uri() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property uri in model MLFlowModelJobInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MLFlowModelJobInput.class);
}
