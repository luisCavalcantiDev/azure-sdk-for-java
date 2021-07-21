// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents the publisher information of a process/rule. */
@Fluent
public final class PublisherInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PublisherInfo.class);

    /*
     * The Subject field of the x.509 certificate used to sign the code, using
     * the following fields -  O = Organization, L = Locality, S = State or
     * Province, and C = Country
     */
    @JsonProperty(value = "publisherName")
    private String publisherName;

    /*
     * The product name taken from the file's version resource
     */
    @JsonProperty(value = "productName")
    private String productName;

    /*
     * The "OriginalName" field taken from the file's version resource
     */
    @JsonProperty(value = "binaryName")
    private String binaryName;

    /*
     * The binary file version taken from the file's version resource
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the publisherName property: The Subject field of the x.509 certificate used to sign the code, using the
     * following fields - O = Organization, L = Locality, S = State or Province, and C = Country.
     *
     * @return the publisherName value.
     */
    public String publisherName() {
        return this.publisherName;
    }

    /**
     * Set the publisherName property: The Subject field of the x.509 certificate used to sign the code, using the
     * following fields - O = Organization, L = Locality, S = State or Province, and C = Country.
     *
     * @param publisherName the publisherName value to set.
     * @return the PublisherInfo object itself.
     */
    public PublisherInfo withPublisherName(String publisherName) {
        this.publisherName = publisherName;
        return this;
    }

    /**
     * Get the productName property: The product name taken from the file's version resource.
     *
     * @return the productName value.
     */
    public String productName() {
        return this.productName;
    }

    /**
     * Set the productName property: The product name taken from the file's version resource.
     *
     * @param productName the productName value to set.
     * @return the PublisherInfo object itself.
     */
    public PublisherInfo withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * Get the binaryName property: The "OriginalName" field taken from the file's version resource.
     *
     * @return the binaryName value.
     */
    public String binaryName() {
        return this.binaryName;
    }

    /**
     * Set the binaryName property: The "OriginalName" field taken from the file's version resource.
     *
     * @param binaryName the binaryName value to set.
     * @return the PublisherInfo object itself.
     */
    public PublisherInfo withBinaryName(String binaryName) {
        this.binaryName = binaryName;
        return this;
    }

    /**
     * Get the version property: The binary file version taken from the file's version resource.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The binary file version taken from the file's version resource.
     *
     * @param version the version value to set.
     * @return the PublisherInfo object itself.
     */
    public PublisherInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}