// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs;

import com.azure.core.util.Context;
import com.azure.resourcemanager.avs.models.PortMirroringDirectionEnum;
import com.azure.resourcemanager.avs.models.WorkloadNetworkPortMirroring;

/** Samples for WorkloadNetworks UpdatePortMirroring. */
public final class WorkloadNetworksUpdatePortMirroringSamples {
    /**
     * Sample code: WorkloadNetworks_UpdatePortMirroring.
     *
     * @param avsManager Entry point to AvsManager. Azure VMware Solution API.
     */
    public static void workloadNetworksUpdatePortMirroring(com.azure.resourcemanager.avs.AvsManager avsManager) {
        WorkloadNetworkPortMirroring resource =
            avsManager
                .workloadNetworks()
                .getPortMirroringWithResponse("group1", "cloud1", "portMirroring1", Context.NONE)
                .getValue();
        resource
            .update()
            .withDirection(PortMirroringDirectionEnum.fromString("BIDIRECTIONAL"))
            .withSource("vmGroup1")
            .withDestination("vmGroup2")
            .withRevision(1L)
            .apply();
    }
}