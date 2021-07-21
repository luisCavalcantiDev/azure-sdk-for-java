// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of rules results. */
@Fluent
public final class RulesResultsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RulesResultsInner.class);

    /*
     * List of rule results.
     */
    @JsonProperty(value = "value")
    private List<RuleResultsInner> value;

    /**
     * Get the value property: List of rule results.
     *
     * @return the value value.
     */
    public List<RuleResultsInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of rule results.
     *
     * @param value the value value to set.
     * @return the RulesResultsInner object itself.
     */
    public RulesResultsInner withValue(List<RuleResultsInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}