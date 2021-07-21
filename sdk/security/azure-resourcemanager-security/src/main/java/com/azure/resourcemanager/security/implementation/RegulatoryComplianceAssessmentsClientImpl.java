// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.RegulatoryComplianceAssessmentsClient;
import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceAssessmentInner;
import com.azure.resourcemanager.security.models.RegulatoryComplianceAssessmentList;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RegulatoryComplianceAssessmentsClient. */
public final class RegulatoryComplianceAssessmentsClientImpl implements RegulatoryComplianceAssessmentsClient {
    private final ClientLogger logger = new ClientLogger(RegulatoryComplianceAssessmentsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RegulatoryComplianceAssessmentsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of RegulatoryComplianceAssessmentsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RegulatoryComplianceAssessmentsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy
                .create(
                    RegulatoryComplianceAssessmentsService.class,
                    client.getHttpPipeline(),
                    client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterRegulatoryComplianceAssessments to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterRegula")
    private interface RegulatoryComplianceAssessmentsService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Security/regulatoryComplianceStandards"
                + "/{regulatoryComplianceStandardName}/regulatoryComplianceControls/{regulatoryComplianceControlName}"
                + "/regulatoryComplianceAssessments")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceAssessmentList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("regulatoryComplianceStandardName") String regulatoryComplianceStandardName,
            @PathParam("regulatoryComplianceControlName") String regulatoryComplianceControlName,
            @QueryParam("$filter") String filter,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/providers/Microsoft.Security/regulatoryComplianceStandards"
                + "/{regulatoryComplianceStandardName}/regulatoryComplianceControls/{regulatoryComplianceControlName}"
                + "/regulatoryComplianceAssessments/{regulatoryComplianceAssessmentName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceAssessmentInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("regulatoryComplianceStandardName") String regulatoryComplianceStandardName,
            @PathParam("regulatoryComplianceControlName") String regulatoryComplianceControlName,
            @PathParam("regulatoryComplianceAssessmentName") String regulatoryComplianceAssessmentName,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RegulatoryComplianceAssessmentList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param filter OData filter. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceAssessmentInner>> listSinglePageAsync(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName, String filter) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        if (regulatoryComplianceControlName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceControlName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            regulatoryComplianceStandardName,
                            regulatoryComplianceControlName,
                            filter,
                            accept,
                            context))
            .<PagedResponse<RegulatoryComplianceAssessmentInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceAssessmentInner>> listSinglePageAsync(
        String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName,
        String filter,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        if (regulatoryComplianceControlName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceControlName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                regulatoryComplianceStandardName,
                regulatoryComplianceControlName,
                filter,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param filter OData filter. Optional.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceAssessmentInner> listAsync(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName, String filter) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(regulatoryComplianceStandardName, regulatoryComplianceControlName, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceAssessmentInner> listAsync(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName) {
        final String filter = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(regulatoryComplianceStandardName, regulatoryComplianceControlName, filter),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<RegulatoryComplianceAssessmentInner> listAsync(
        String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName,
        String filter,
        Context context) {
        return new PagedFlux<>(
            () ->
                listSinglePageAsync(regulatoryComplianceStandardName, regulatoryComplianceControlName, filter, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RegulatoryComplianceAssessmentInner> list(
        String regulatoryComplianceStandardName, String regulatoryComplianceControlName) {
        final String filter = null;
        return new PagedIterable<>(
            listAsync(regulatoryComplianceStandardName, regulatoryComplianceControlName, filter));
    }

    /**
     * Details and state of assessments mapped to selected regulatory compliance control.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param filter OData filter. Optional.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RegulatoryComplianceAssessmentInner> list(
        String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName,
        String filter,
        Context context) {
        return new PagedIterable<>(
            listAsync(regulatoryComplianceStandardName, regulatoryComplianceControlName, filter, context));
    }

    /**
     * Supported regulatory compliance details and state for selected assessment.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param regulatoryComplianceAssessmentName Name of the regulatory compliance assessment object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance assessment details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RegulatoryComplianceAssessmentInner>> getWithResponseAsync(
        String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName,
        String regulatoryComplianceAssessmentName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        if (regulatoryComplianceControlName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceControlName is required and cannot be null."));
        }
        if (regulatoryComplianceAssessmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceAssessmentName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            regulatoryComplianceStandardName,
                            regulatoryComplianceControlName,
                            regulatoryComplianceAssessmentName,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Supported regulatory compliance details and state for selected assessment.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param regulatoryComplianceAssessmentName Name of the regulatory compliance assessment object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance assessment details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RegulatoryComplianceAssessmentInner>> getWithResponseAsync(
        String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName,
        String regulatoryComplianceAssessmentName,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (regulatoryComplianceStandardName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceStandardName is required and cannot be null."));
        }
        if (regulatoryComplianceControlName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceControlName is required and cannot be null."));
        }
        if (regulatoryComplianceAssessmentName == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter regulatoryComplianceAssessmentName is required and cannot be null."));
        }
        final String apiVersion = "2019-01-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                regulatoryComplianceStandardName,
                regulatoryComplianceControlName,
                regulatoryComplianceAssessmentName,
                accept,
                context);
    }

    /**
     * Supported regulatory compliance details and state for selected assessment.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param regulatoryComplianceAssessmentName Name of the regulatory compliance assessment object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance assessment details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<RegulatoryComplianceAssessmentInner> getAsync(
        String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName,
        String regulatoryComplianceAssessmentName) {
        return getWithResponseAsync(
                regulatoryComplianceStandardName, regulatoryComplianceControlName, regulatoryComplianceAssessmentName)
            .flatMap(
                (Response<RegulatoryComplianceAssessmentInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Supported regulatory compliance details and state for selected assessment.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param regulatoryComplianceAssessmentName Name of the regulatory compliance assessment object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance assessment details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RegulatoryComplianceAssessmentInner get(
        String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName,
        String regulatoryComplianceAssessmentName) {
        return getAsync(
                regulatoryComplianceStandardName, regulatoryComplianceControlName, regulatoryComplianceAssessmentName)
            .block();
    }

    /**
     * Supported regulatory compliance details and state for selected assessment.
     *
     * @param regulatoryComplianceStandardName Name of the regulatory compliance standard object.
     * @param regulatoryComplianceControlName Name of the regulatory compliance control object.
     * @param regulatoryComplianceAssessmentName Name of the regulatory compliance assessment object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return regulatory compliance assessment details and state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RegulatoryComplianceAssessmentInner> getWithResponse(
        String regulatoryComplianceStandardName,
        String regulatoryComplianceControlName,
        String regulatoryComplianceAssessmentName,
        Context context) {
        return getWithResponseAsync(
                regulatoryComplianceStandardName,
                regulatoryComplianceControlName,
                regulatoryComplianceAssessmentName,
                context)
            .block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceAssessmentInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<RegulatoryComplianceAssessmentInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of regulatory compliance assessment response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<RegulatoryComplianceAssessmentInner>> listNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}