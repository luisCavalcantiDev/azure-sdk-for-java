// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;
import com.azure.resourcemanager.mediaservices.models.Job;
import com.azure.resourcemanager.mediaservices.models.JobInput;
import com.azure.resourcemanager.mediaservices.models.JobOutput;
import com.azure.resourcemanager.mediaservices.models.Priority;
import java.util.Arrays;

/** Samples for Jobs Update. */
public final class JobsUpdateSamples {
    /**
     * Sample code: Update a Job.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void updateAJob(com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        Job resource =
            mediaServicesManager
                .jobs()
                .getWithResponse("contosoresources", "contosomedia", "exampleTransform", "job1", Context.NONE)
                .getValue();
        resource
            .update()
            .withDescription("Example job to illustrate update.")
            .withInput(new JobInput())
            .withOutputs(Arrays.asList(new JobOutput()))
            .withPriority(Priority.HIGH)
            .apply();
    }
}