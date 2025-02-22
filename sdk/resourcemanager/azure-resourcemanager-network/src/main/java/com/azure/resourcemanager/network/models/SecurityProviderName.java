// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SecurityProviderName. */
public final class SecurityProviderName extends ExpandableStringEnum<SecurityProviderName> {
    /** Static value ZScaler for SecurityProviderName. */
    public static final SecurityProviderName ZSCALER = fromString("ZScaler");

    /** Static value IBoss for SecurityProviderName. */
    public static final SecurityProviderName IBOSS = fromString("IBoss");

    /** Static value Checkpoint for SecurityProviderName. */
    public static final SecurityProviderName CHECKPOINT = fromString("Checkpoint");

    /**
     * Creates or finds a SecurityProviderName from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SecurityProviderName.
     */
    @JsonCreator
    public static SecurityProviderName fromString(String name) {
        return fromString(name, SecurityProviderName.class);
    }

    /**
     * Gets known SecurityProviderName values.
     *
     * @return known SecurityProviderName values.
     */
    public static Collection<SecurityProviderName> values() {
        return values(SecurityProviderName.class);
    }
}
