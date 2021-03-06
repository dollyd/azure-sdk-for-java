/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.notificationhubs.v2014_09_01.implementation.NotificationHubsManager;
import com.microsoft.azure.management.notificationhubs.v2014_09_01.implementation.CheckAvailabilityResourceInner;
import java.util.Map;

/**
 * Type representing CheckAvailabilityResource.
 */
public interface CheckAvailabilityResource extends HasInner<CheckAvailabilityResourceInner>, HasManager<NotificationHubsManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isAvailiable value.
     */
    Boolean isAvailiable();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
