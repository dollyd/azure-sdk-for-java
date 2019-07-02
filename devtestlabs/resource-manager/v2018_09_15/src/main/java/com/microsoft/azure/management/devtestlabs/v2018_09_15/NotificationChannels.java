/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation.NotificationChannelsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing NotificationChannels.
 */
public interface NotificationChannels extends SupportsCreating<NotificationChannel.DefinitionStages.Blank>, HasInner<NotificationChannelsInner> {
    /**
     * Send notification to provided channel.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the notificationChannel.
     * @param notifyParameters Properties for generating a Notification.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable notifyAsync(String resourceGroupName, String labName, String name, NotifyParameters notifyParameters);

    /**
     * Get notification channel.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the notificationChannel.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NotificationChannel> getAsync(String resourceGroupName, String labName, String name);

    /**
     * List notification channels in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<NotificationChannel> listAsync(final String resourceGroupName, final String labName);

    /**
     * Delete notification channel.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the notificationChannel.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labName, String name);

}
