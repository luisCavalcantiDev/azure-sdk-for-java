// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurearcdata.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Properties of sqlManagedInstance. */
@Fluent
public final class SqlManagedInstanceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SqlManagedInstanceProperties.class);

    /*
     * null
     */
    @JsonProperty(value = "dataControllerId")
    private String dataControllerId;

    /*
     * The instance admin user
     */
    @JsonProperty(value = "admin")
    private String admin;

    /*
     * The instance start time
     */
    @JsonProperty(value = "startTime")
    private String startTime;

    /*
     * The instance end time
     */
    @JsonProperty(value = "endTime")
    private String endTime;

    /*
     * The raw kubernetes information
     */
    @JsonProperty(value = "k8sRaw")
    private SqlManagedInstanceK8SRaw k8SRaw;

    /*
     * Username and password for basic authentication.
     */
    @JsonProperty(value = "basicLoginInformation")
    private BasicLoginInformation basicLoginInformation;

    /*
     * Last uploaded date from Kubernetes cluster. Defaults to current date
     * time
     */
    @JsonProperty(value = "lastUploadedDate")
    private OffsetDateTime lastUploadedDate;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The license type to apply for this managed instance.
     */
    @JsonProperty(value = "licenseType")
    private ArcSqlManagedInstanceLicenseType licenseType;

    /*
     * If a CustomLocation is provided, this contains the ARM id of the
     * connected cluster the custom location belongs to.
     */
    @JsonProperty(value = "clusterId")
    private String clusterId;

    /*
     * If a CustomLocation is provided, this contains the ARM id of the
     * extension the custom location belongs to.
     */
    @JsonProperty(value = "extensionId")
    private String extensionId;

    /**
     * Get the dataControllerId property: null.
     *
     * @return the dataControllerId value.
     */
    public String dataControllerId() {
        return this.dataControllerId;
    }

    /**
     * Set the dataControllerId property: null.
     *
     * @param dataControllerId the dataControllerId value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withDataControllerId(String dataControllerId) {
        this.dataControllerId = dataControllerId;
        return this;
    }

    /**
     * Get the admin property: The instance admin user.
     *
     * @return the admin value.
     */
    public String admin() {
        return this.admin;
    }

    /**
     * Set the admin property: The instance admin user.
     *
     * @param admin the admin value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withAdmin(String admin) {
        this.admin = admin;
        return this;
    }

    /**
     * Get the startTime property: The instance start time.
     *
     * @return the startTime value.
     */
    public String startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The instance start time.
     *
     * @param startTime the startTime value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: The instance end time.
     *
     * @return the endTime value.
     */
    public String endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The instance end time.
     *
     * @param endTime the endTime value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the k8SRaw property: The raw kubernetes information.
     *
     * @return the k8SRaw value.
     */
    public SqlManagedInstanceK8SRaw k8SRaw() {
        return this.k8SRaw;
    }

    /**
     * Set the k8SRaw property: The raw kubernetes information.
     *
     * @param k8SRaw the k8SRaw value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withK8SRaw(SqlManagedInstanceK8SRaw k8SRaw) {
        this.k8SRaw = k8SRaw;
        return this;
    }

    /**
     * Get the basicLoginInformation property: Username and password for basic authentication.
     *
     * @return the basicLoginInformation value.
     */
    public BasicLoginInformation basicLoginInformation() {
        return this.basicLoginInformation;
    }

    /**
     * Set the basicLoginInformation property: Username and password for basic authentication.
     *
     * @param basicLoginInformation the basicLoginInformation value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withBasicLoginInformation(BasicLoginInformation basicLoginInformation) {
        this.basicLoginInformation = basicLoginInformation;
        return this;
    }

    /**
     * Get the lastUploadedDate property: Last uploaded date from Kubernetes cluster. Defaults to current date time.
     *
     * @return the lastUploadedDate value.
     */
    public OffsetDateTime lastUploadedDate() {
        return this.lastUploadedDate;
    }

    /**
     * Set the lastUploadedDate property: Last uploaded date from Kubernetes cluster. Defaults to current date time.
     *
     * @param lastUploadedDate the lastUploadedDate value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withLastUploadedDate(OffsetDateTime lastUploadedDate) {
        this.lastUploadedDate = lastUploadedDate;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the licenseType property: The license type to apply for this managed instance.
     *
     * @return the licenseType value.
     */
    public ArcSqlManagedInstanceLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type to apply for this managed instance.
     *
     * @param licenseType the licenseType value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withLicenseType(ArcSqlManagedInstanceLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the clusterId property: If a CustomLocation is provided, this contains the ARM id of the connected cluster
     * the custom location belongs to.
     *
     * @return the clusterId value.
     */
    public String clusterId() {
        return this.clusterId;
    }

    /**
     * Set the clusterId property: If a CustomLocation is provided, this contains the ARM id of the connected cluster
     * the custom location belongs to.
     *
     * @param clusterId the clusterId value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * Get the extensionId property: If a CustomLocation is provided, this contains the ARM id of the extension the
     * custom location belongs to.
     *
     * @return the extensionId value.
     */
    public String extensionId() {
        return this.extensionId;
    }

    /**
     * Set the extensionId property: If a CustomLocation is provided, this contains the ARM id of the extension the
     * custom location belongs to.
     *
     * @param extensionId the extensionId value to set.
     * @return the SqlManagedInstanceProperties object itself.
     */
    public SqlManagedInstanceProperties withExtensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (k8SRaw() != null) {
            k8SRaw().validate();
        }
        if (basicLoginInformation() != null) {
            basicLoginInformation().validate();
        }
    }
}