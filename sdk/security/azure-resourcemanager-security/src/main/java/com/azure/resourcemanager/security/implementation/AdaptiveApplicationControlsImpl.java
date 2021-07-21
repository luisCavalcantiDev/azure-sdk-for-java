// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.AdaptiveApplicationControlsClient;
import com.azure.resourcemanager.security.fluent.models.AdaptiveApplicationControlGroupInner;
import com.azure.resourcemanager.security.fluent.models.AdaptiveApplicationControlGroupsInner;
import com.azure.resourcemanager.security.models.AdaptiveApplicationControlGroup;
import com.azure.resourcemanager.security.models.AdaptiveApplicationControlGroups;
import com.azure.resourcemanager.security.models.AdaptiveApplicationControls;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AdaptiveApplicationControlsImpl implements AdaptiveApplicationControls {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AdaptiveApplicationControlsImpl.class);

    private final AdaptiveApplicationControlsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public AdaptiveApplicationControlsImpl(
        AdaptiveApplicationControlsClient innerClient,
        com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public AdaptiveApplicationControlGroups list() {
        AdaptiveApplicationControlGroupsInner inner = this.serviceClient().list();
        if (inner != null) {
            return new AdaptiveApplicationControlGroupsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AdaptiveApplicationControlGroups> listWithResponse(
        Boolean includePathRecommendations, Boolean summary, Context context) {
        Response<AdaptiveApplicationControlGroupsInner> inner =
            this.serviceClient().listWithResponse(includePathRecommendations, summary, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AdaptiveApplicationControlGroupsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public AdaptiveApplicationControlGroup get(String ascLocation, String groupName) {
        AdaptiveApplicationControlGroupInner inner = this.serviceClient().get(ascLocation, groupName);
        if (inner != null) {
            return new AdaptiveApplicationControlGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<AdaptiveApplicationControlGroup> getWithResponse(
        String ascLocation, String groupName, Context context) {
        Response<AdaptiveApplicationControlGroupInner> inner =
            this.serviceClient().getWithResponse(ascLocation, groupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new AdaptiveApplicationControlGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String ascLocation, String groupName) {
        this.serviceClient().delete(ascLocation, groupName);
    }

    public Response<Void> deleteWithResponse(String ascLocation, String groupName, Context context) {
        return this.serviceClient().deleteWithResponse(ascLocation, groupName, context);
    }

    public AdaptiveApplicationControlGroup getById(String id) {
        String ascLocation = Utils.getValueFromIdByName(id, "locations");
        if (ascLocation == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String groupName = Utils.getValueFromIdByName(id, "applicationWhitelistings");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'applicationWhitelistings'.",
                                id)));
        }
        return this.getWithResponse(ascLocation, groupName, Context.NONE).getValue();
    }

    public Response<AdaptiveApplicationControlGroup> getByIdWithResponse(String id, Context context) {
        String ascLocation = Utils.getValueFromIdByName(id, "locations");
        if (ascLocation == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String groupName = Utils.getValueFromIdByName(id, "applicationWhitelistings");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'applicationWhitelistings'.",
                                id)));
        }
        return this.getWithResponse(ascLocation, groupName, context);
    }

    public void deleteById(String id) {
        String ascLocation = Utils.getValueFromIdByName(id, "locations");
        if (ascLocation == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String groupName = Utils.getValueFromIdByName(id, "applicationWhitelistings");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'applicationWhitelistings'.",
                                id)));
        }
        this.deleteWithResponse(ascLocation, groupName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String ascLocation = Utils.getValueFromIdByName(id, "locations");
        if (ascLocation == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'locations'.", id)));
        }
        String groupName = Utils.getValueFromIdByName(id, "applicationWhitelistings");
        if (groupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'applicationWhitelistings'.",
                                id)));
        }
        return this.deleteWithResponse(ascLocation, groupName, context);
    }

    private AdaptiveApplicationControlsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }

    public AdaptiveApplicationControlGroupImpl define(String name) {
        return new AdaptiveApplicationControlGroupImpl(name, this.manager());
    }
}