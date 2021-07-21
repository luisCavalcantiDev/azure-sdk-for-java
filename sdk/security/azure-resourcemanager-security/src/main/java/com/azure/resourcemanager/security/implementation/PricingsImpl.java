// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.PricingsClient;
import com.azure.resourcemanager.security.fluent.models.PricingInner;
import com.azure.resourcemanager.security.fluent.models.PricingListInner;
import com.azure.resourcemanager.security.models.Pricing;
import com.azure.resourcemanager.security.models.PricingList;
import com.azure.resourcemanager.security.models.Pricings;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PricingsImpl implements Pricings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PricingsImpl.class);

    private final PricingsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public PricingsImpl(PricingsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PricingList list() {
        PricingListInner inner = this.serviceClient().list();
        if (inner != null) {
            return new PricingListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PricingList> listWithResponse(Context context) {
        Response<PricingListInner> inner = this.serviceClient().listWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PricingListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Pricing get(String pricingName) {
        PricingInner inner = this.serviceClient().get(pricingName);
        if (inner != null) {
            return new PricingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Pricing> getWithResponse(String pricingName, Context context) {
        Response<PricingInner> inner = this.serviceClient().getWithResponse(pricingName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PricingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public Pricing update(String pricingName, PricingInner pricing) {
        PricingInner inner = this.serviceClient().update(pricingName, pricing);
        if (inner != null) {
            return new PricingImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Pricing> updateWithResponse(String pricingName, PricingInner pricing, Context context) {
        Response<PricingInner> inner = this.serviceClient().updateWithResponse(pricingName, pricing, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PricingImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private PricingsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}