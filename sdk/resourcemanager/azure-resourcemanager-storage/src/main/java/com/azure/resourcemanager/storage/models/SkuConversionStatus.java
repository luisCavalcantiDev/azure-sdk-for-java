// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SkuConversionStatus. */
public final class SkuConversionStatus extends ExpandableStringEnum<SkuConversionStatus> {
    /** Static value InProgress for SkuConversionStatus. */
    public static final SkuConversionStatus IN_PROGRESS = fromString("InProgress");

    /** Static value Succeeded for SkuConversionStatus. */
    public static final SkuConversionStatus SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for SkuConversionStatus. */
    public static final SkuConversionStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a SkuConversionStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SkuConversionStatus.
     */
    @JsonCreator
    public static SkuConversionStatus fromString(String name) {
        return fromString(name, SkuConversionStatus.class);
    }

    /**
     * Gets known SkuConversionStatus values.
     *
     * @return known SkuConversionStatus values.
     */
    public static Collection<SkuConversionStatus> values() {
        return values(SkuConversionStatus.class);
    }
}
