// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegment;
import com.azure.resourcemanager.avs.models.WorkloadNetworkSegmentSubnet;
import java.util.Arrays;

/** Samples for WorkloadNetworks UpdateSegments. */
public final class WorkloadNetworksUpdateSegmentsSamples {
    /**
     * Sample code: WorkloadNetworks_UpdateSegments.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksUpdateSegments(com.azure.resourcemanager.avs.AvsManager avsManager) {
        WorkloadNetworkSegment resource =
            avsManager
                .workloadNetworks()
                .getSegmentWithResponse("group1", "cloud1", "segment1", Context.NONE)
                .getValue();
        resource
            .update()
            .withConnectedGateway("/infra/tier-1s/gateway")
            .withSubnet(
                new WorkloadNetworkSegmentSubnet()
                    .withDhcpRanges(Arrays.asList("40.20.0.0-40.20.0.1"))
                    .withGatewayAddress("40.20.20.20/16"))
            .withRevision(1L)
            .apply();
    }
}