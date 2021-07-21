// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BundleType. */
public final class BundleType extends ExpandableStringEnum<BundleType> {
    /** Static value AppServices for BundleType. */
    public static final BundleType APP_SERVICES = fromString("AppServices");

    /** Static value DNS for BundleType. */
    public static final BundleType DNS = fromString("DNS");

    /** Static value KeyVaults for BundleType. */
    public static final BundleType KEY_VAULTS = fromString("KeyVaults");

    /** Static value KubernetesService for BundleType. */
    public static final BundleType KUBERNETES_SERVICE = fromString("KubernetesService");

    /** Static value ResourceManager for BundleType. */
    public static final BundleType RESOURCE_MANAGER = fromString("ResourceManager");

    /** Static value SqlServers for BundleType. */
    public static final BundleType SQL_SERVERS = fromString("SqlServers");

    /** Static value StorageAccounts for BundleType. */
    public static final BundleType STORAGE_ACCOUNTS = fromString("StorageAccounts");

    /** Static value VirtualMachines for BundleType. */
    public static final BundleType VIRTUAL_MACHINES = fromString("VirtualMachines");

    /**
     * Creates or finds a BundleType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BundleType.
     */
    @JsonCreator
    public static BundleType fromString(String name) {
        return fromString(name, BundleType.class);
    }

    /** @return known BundleType values. */
    public static Collection<BundleType> values() {
        return values(BundleType.class);
    }
}