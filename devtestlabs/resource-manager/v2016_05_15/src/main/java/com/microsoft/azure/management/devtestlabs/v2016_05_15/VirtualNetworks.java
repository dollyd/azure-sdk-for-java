/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation.VirtualNetworksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualNetworks.
 */
public interface VirtualNetworks extends SupportsCreating<VirtualNetwork.DefinitionStages.Blank>, HasInner<VirtualNetworksInner> {
    /**
     * Get virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetwork> getAsync(String resourceGroupName, String labName, String name);

    /**
     * List virtual networks in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualNetwork> listAsync(final String resourceGroupName, final String labName);

    /**
     * Delete virtual network. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labName, String name);

}
