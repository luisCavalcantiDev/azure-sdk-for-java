// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** IP Address information. */
@Immutable
public final class IpAddress {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpAddress.class);

    /*
     * IPV4 address
     */
    @JsonProperty(value = "v4Address", access = JsonProperty.Access.WRITE_ONLY)
    private String v4Address;

    /*
     * Detection time of the ip address.
     */
    @JsonProperty(value = "detectionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime detectionTime;

    /*
     * Subnet Classless Inter-Domain Routing
     */
    @JsonProperty(value = "subnetCidr", access = JsonProperty.Access.WRITE_ONLY)
    private String subnetCidr;

    /*
     * Fully qualified domain name
     */
    @JsonProperty(value = "fqdn", access = JsonProperty.Access.WRITE_ONLY)
    private String fqdn;

    /*
     * FQDN last lookup time.
     */
    @JsonProperty(value = "fqdnLastLookupTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime fqdnLastLookupTime;

    /**
     * Get the v4Address property: IPV4 address.
     *
     * @return the v4Address value.
     */
    public String v4Address() {
        return this.v4Address;
    }

    /**
     * Get the detectionTime property: Detection time of the ip address.
     *
     * @return the detectionTime value.
     */
    public OffsetDateTime detectionTime() {
        return this.detectionTime;
    }

    /**
     * Get the subnetCidr property: Subnet Classless Inter-Domain Routing.
     *
     * @return the subnetCidr value.
     */
    public String subnetCidr() {
        return this.subnetCidr;
    }

    /**
     * Get the fqdn property: Fully qualified domain name.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the fqdnLastLookupTime property: FQDN last lookup time.
     *
     * @return the fqdnLastLookupTime value.
     */
    public OffsetDateTime fqdnLastLookupTime() {
        return this.fqdnLastLookupTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}