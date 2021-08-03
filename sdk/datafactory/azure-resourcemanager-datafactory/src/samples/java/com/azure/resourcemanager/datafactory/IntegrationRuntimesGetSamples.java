// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory;

import com.azure.core.util.Context;

/** Samples for IntegrationRuntimes Get. */
public final class IntegrationRuntimesGetSamples {
    /**
     * Sample code: IntegrationRuntimes_Get.
     *
     * @param dataFactoryManager Entry point to DataFactoryManager. The Azure Data Factory V2 management API provides a
     *     RESTful set of web services that interact with Azure Data Factory V2 services.
     */
    public static void integrationRuntimesGet(
        com.azure.resourcemanager.datafactory.DataFactoryManager dataFactoryManager) {
        dataFactoryManager
            .integrationRuntimes()
            .getWithResponse(
                "exampleResourceGroup", "exampleFactoryName", "exampleIntegrationRuntime", null, Context.NONE);
    }
}