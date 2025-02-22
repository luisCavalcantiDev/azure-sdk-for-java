// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.models.SubscriptionState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters supplied to the Create subscription operation. */
@Fluent
public final class SubscriptionCreateParameterProperties {
    /*
     * User (user id path) for whom subscription is being created in form
     * /users/{userId}
     */
    @JsonProperty(value = "ownerId")
    private String ownerId;

    /*
     * Scope like /products/{productId} or /apis or /apis/{apiId}.
     */
    @JsonProperty(value = "scope", required = true)
    private String scope;

    /*
     * Subscription name.
     */
    @JsonProperty(value = "displayName", required = true)
    private String displayName;

    /*
     * Primary subscription key. If not specified during request key will be
     * generated automatically.
     */
    @JsonProperty(value = "primaryKey")
    private String primaryKey;

    /*
     * Secondary subscription key. If not specified during request key will be
     * generated automatically.
     */
    @JsonProperty(value = "secondaryKey")
    private String secondaryKey;

    /*
     * Initial subscription state. If no value is specified, subscription is
     * created with Submitted state. Possible states are * active – the
     * subscription is active, * suspended – the subscription is blocked, and
     * the subscriber cannot call any APIs of the product, * submitted – the
     * subscription request has been made by the developer, but has not yet
     * been approved or rejected, * rejected – the subscription request has
     * been denied by an administrator, * cancelled – the subscription has been
     * cancelled by the developer or administrator, * expired – the
     * subscription reached its expiration date and was deactivated.
     */
    @JsonProperty(value = "state")
    private SubscriptionState state;

    /*
     * Determines whether tracing can be enabled
     */
    @JsonProperty(value = "allowTracing")
    private Boolean allowTracing;

    /**
     * Get the ownerId property: User (user id path) for whom subscription is being created in form /users/{userId}.
     *
     * @return the ownerId value.
     */
    public String ownerId() {
        return this.ownerId;
    }

    /**
     * Set the ownerId property: User (user id path) for whom subscription is being created in form /users/{userId}.
     *
     * @param ownerId the ownerId value to set.
     * @return the SubscriptionCreateParameterProperties object itself.
     */
    public SubscriptionCreateParameterProperties withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Get the scope property: Scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: Scope like /products/{productId} or /apis or /apis/{apiId}.
     *
     * @param scope the scope value to set.
     * @return the SubscriptionCreateParameterProperties object itself.
     */
    public SubscriptionCreateParameterProperties withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the displayName property: Subscription name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Subscription name.
     *
     * @param displayName the displayName value to set.
     * @return the SubscriptionCreateParameterProperties object itself.
     */
    public SubscriptionCreateParameterProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the primaryKey property: Primary subscription key. If not specified during request key will be generated
     * automatically.
     *
     * @return the primaryKey value.
     */
    public String primaryKey() {
        return this.primaryKey;
    }

    /**
     * Set the primaryKey property: Primary subscription key. If not specified during request key will be generated
     * automatically.
     *
     * @param primaryKey the primaryKey value to set.
     * @return the SubscriptionCreateParameterProperties object itself.
     */
    public SubscriptionCreateParameterProperties withPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
        return this;
    }

    /**
     * Get the secondaryKey property: Secondary subscription key. If not specified during request key will be generated
     * automatically.
     *
     * @return the secondaryKey value.
     */
    public String secondaryKey() {
        return this.secondaryKey;
    }

    /**
     * Set the secondaryKey property: Secondary subscription key. If not specified during request key will be generated
     * automatically.
     *
     * @param secondaryKey the secondaryKey value to set.
     * @return the SubscriptionCreateParameterProperties object itself.
     */
    public SubscriptionCreateParameterProperties withSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
        return this;
    }

    /**
     * Get the state property: Initial subscription state. If no value is specified, subscription is created with
     * Submitted state. Possible states are * active – the subscription is active, * suspended – the subscription is
     * blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been
     * made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been
     * denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator,
     * * expired – the subscription reached its expiration date and was deactivated.
     *
     * @return the state value.
     */
    public SubscriptionState state() {
        return this.state;
    }

    /**
     * Set the state property: Initial subscription state. If no value is specified, subscription is created with
     * Submitted state. Possible states are * active – the subscription is active, * suspended – the subscription is
     * blocked, and the subscriber cannot call any APIs of the product, * submitted – the subscription request has been
     * made by the developer, but has not yet been approved or rejected, * rejected – the subscription request has been
     * denied by an administrator, * cancelled – the subscription has been cancelled by the developer or administrator,
     * * expired – the subscription reached its expiration date and was deactivated.
     *
     * @param state the state value to set.
     * @return the SubscriptionCreateParameterProperties object itself.
     */
    public SubscriptionCreateParameterProperties withState(SubscriptionState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the allowTracing property: Determines whether tracing can be enabled.
     *
     * @return the allowTracing value.
     */
    public Boolean allowTracing() {
        return this.allowTracing;
    }

    /**
     * Set the allowTracing property: Determines whether tracing can be enabled.
     *
     * @param allowTracing the allowTracing value to set.
     * @return the SubscriptionCreateParameterProperties object itself.
     */
    public SubscriptionCreateParameterProperties withAllowTracing(Boolean allowTracing) {
        this.allowTracing = allowTracing;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scope() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property scope in model SubscriptionCreateParameterProperties"));
        }
        if (displayName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property displayName in model SubscriptionCreateParameterProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SubscriptionCreateParameterProperties.class);
}
