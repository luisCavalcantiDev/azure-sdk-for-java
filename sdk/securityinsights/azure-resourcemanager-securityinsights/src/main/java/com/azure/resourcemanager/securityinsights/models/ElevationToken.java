// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for ElevationToken. */
public enum ElevationToken {
    /** Enum value Default. */
    DEFAULT("Default"),

    /** Enum value Full. */
    FULL("Full"),

    /** Enum value Limited. */
    LIMITED("Limited");

    /** The actual serialized value for a ElevationToken instance. */
    private final String value;

    ElevationToken(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a ElevationToken instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ElevationToken object, or null if unable to parse.
     */
    @JsonCreator
    public static ElevationToken fromString(String value) {
        ElevationToken[] items = ElevationToken.values();
        for (ElevationToken item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
