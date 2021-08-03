// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.azure.resourcemanager.datafactory.models.SftpAuthenticationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to this linked service type. */
@Fluent
public final class SftpServerLinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SftpServerLinkedServiceTypeProperties.class);

    /*
     * The SFTP server host name. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "host", required = true)
    private Object host;

    /*
     * The TCP port number that the SFTP server uses to listen for client
     * connections. Default value is 22. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     */
    @JsonProperty(value = "port")
    private Object port;

    /*
     * The authentication type to be used to connect to the FTP server.
     */
    @JsonProperty(value = "authenticationType")
    private SftpAuthenticationType authenticationType;

    /*
     * The username used to log on to the SFTP server. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "userName")
    private Object username;

    /*
     * Password to logon the SFTP server for Basic authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /*
     * The SSH private key file path for SshPublicKey authentication. Only
     * valid for on-premises copy. For on-premises copy with SshPublicKey
     * authentication, either PrivateKeyPath or PrivateKeyContent should be
     * specified. SSH private key should be OpenSSH format. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "privateKeyPath")
    private Object privateKeyPath;

    /*
     * Base64 encoded SSH private key content for SshPublicKey authentication.
     * For on-premises copy with SshPublicKey authentication, either
     * PrivateKeyPath or PrivateKeyContent should be specified. SSH private key
     * should be OpenSSH format.
     */
    @JsonProperty(value = "privateKeyContent")
    private SecretBase privateKeyContent;

    /*
     * The password to decrypt the SSH private key if the SSH private key is
     * encrypted.
     */
    @JsonProperty(value = "passPhrase")
    private SecretBase passPhrase;

    /*
     * If true, skip the SSH host key validation. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "skipHostKeyValidation")
    private Object skipHostKeyValidation;

    /*
     * The host key finger-print of the SFTP server. When SkipHostKeyValidation
     * is false, HostKeyFingerprint should be specified. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "hostKeyFingerprint")
    private Object hostKeyFingerprint;

    /**
     * Get the host property: The SFTP server host name. Type: string (or Expression with resultType string).
     *
     * @return the host value.
     */
    public Object host() {
        return this.host;
    }

    /**
     * Set the host property: The SFTP server host name. Type: string (or Expression with resultType string).
     *
     * @param host the host value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the SFTP server uses to listen for client connections. Default
     * value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @return the port value.
     */
    public Object port() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the SFTP server uses to listen for client connections. Default
     * value is 22. Type: integer (or Expression with resultType integer), minimum: 0.
     *
     * @param port the port value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the FTP server.
     *
     * @return the authenticationType value.
     */
    public SftpAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the FTP server.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withAuthenticationType(SftpAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: The username used to log on to the SFTP server. Type: string (or Expression with
     * resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: The username used to log on to the SFTP server. Type: string (or Expression with
     * resultType string).
     *
     * @param username the username value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password to logon the SFTP server for Basic authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password to logon the SFTP server for Basic authentication.
     *
     * @param password the password value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the privateKeyPath property: The SSH private key file path for SshPublicKey authentication. Only valid for
     * on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or
     * PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with
     * resultType string).
     *
     * @return the privateKeyPath value.
     */
    public Object privateKeyPath() {
        return this.privateKeyPath;
    }

    /**
     * Set the privateKeyPath property: The SSH private key file path for SshPublicKey authentication. Only valid for
     * on-premises copy. For on-premises copy with SshPublicKey authentication, either PrivateKeyPath or
     * PrivateKeyContent should be specified. SSH private key should be OpenSSH format. Type: string (or Expression with
     * resultType string).
     *
     * @param privateKeyPath the privateKeyPath value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPrivateKeyPath(Object privateKeyPath) {
        this.privateKeyPath = privateKeyPath;
        return this;
    }

    /**
     * Get the privateKeyContent property: Base64 encoded SSH private key content for SshPublicKey authentication. For
     * on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be
     * specified. SSH private key should be OpenSSH format.
     *
     * @return the privateKeyContent value.
     */
    public SecretBase privateKeyContent() {
        return this.privateKeyContent;
    }

    /**
     * Set the privateKeyContent property: Base64 encoded SSH private key content for SshPublicKey authentication. For
     * on-premises copy with SshPublicKey authentication, either PrivateKeyPath or PrivateKeyContent should be
     * specified. SSH private key should be OpenSSH format.
     *
     * @param privateKeyContent the privateKeyContent value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPrivateKeyContent(SecretBase privateKeyContent) {
        this.privateKeyContent = privateKeyContent;
        return this;
    }

    /**
     * Get the passPhrase property: The password to decrypt the SSH private key if the SSH private key is encrypted.
     *
     * @return the passPhrase value.
     */
    public SecretBase passPhrase() {
        return this.passPhrase;
    }

    /**
     * Set the passPhrase property: The password to decrypt the SSH private key if the SSH private key is encrypted.
     *
     * @param passPhrase the passPhrase value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withPassPhrase(SecretBase passPhrase) {
        this.passPhrase = passPhrase;
        return this;
    }

    /**
     * Get the skipHostKeyValidation property: If true, skip the SSH host key validation. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @return the skipHostKeyValidation value.
     */
    public Object skipHostKeyValidation() {
        return this.skipHostKeyValidation;
    }

    /**
     * Set the skipHostKeyValidation property: If true, skip the SSH host key validation. Default value is false. Type:
     * boolean (or Expression with resultType boolean).
     *
     * @param skipHostKeyValidation the skipHostKeyValidation value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withSkipHostKeyValidation(Object skipHostKeyValidation) {
        this.skipHostKeyValidation = skipHostKeyValidation;
        return this;
    }

    /**
     * Get the hostKeyFingerprint property: The host key finger-print of the SFTP server. When SkipHostKeyValidation is
     * false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     *
     * @return the hostKeyFingerprint value.
     */
    public Object hostKeyFingerprint() {
        return this.hostKeyFingerprint;
    }

    /**
     * Set the hostKeyFingerprint property: The host key finger-print of the SFTP server. When SkipHostKeyValidation is
     * false, HostKeyFingerprint should be specified. Type: string (or Expression with resultType string).
     *
     * @param hostKeyFingerprint the hostKeyFingerprint value to set.
     * @return the SftpServerLinkedServiceTypeProperties object itself.
     */
    public SftpServerLinkedServiceTypeProperties withHostKeyFingerprint(Object hostKeyFingerprint) {
        this.hostKeyFingerprint = hostKeyFingerprint;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (host() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property host in model SftpServerLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
        if (privateKeyContent() != null) {
            privateKeyContent().validate();
        }
        if (passPhrase() != null) {
            passPhrase().validate();
        }
    }
}