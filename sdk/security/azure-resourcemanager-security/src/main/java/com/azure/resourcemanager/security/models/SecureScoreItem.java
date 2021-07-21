// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.SecureScoreItemInner;

/** An immutable client-side representation of SecureScoreItem. */
public interface SecureScoreItem {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the displayName property: The initiative’s name.
     *
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the weight property: The relative weight for each subscription. Used when calculating an aggregated secure
     * score for multiple subscriptions.
     *
     * @return the weight value.
     */
    Long weight();

    /**
     * Gets the max property: Maximum score available.
     *
     * @return the max value.
     */
    Integer max();

    /**
     * Gets the current property: Current score.
     *
     * @return the current value.
     */
    Double current();

    /**
     * Gets the percentage property: Ratio of the current score divided by the maximum. Rounded to 4 digits after the
     * decimal point.
     *
     * @return the percentage value.
     */
    Double percentage();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.SecureScoreItemInner object.
     *
     * @return the inner object.
     */
    SecureScoreItemInner innerModel();
}