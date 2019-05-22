/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.engagementfabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Locations and zones info for SKU.
 */
public class SkuLocationInfoItem {
    /**
     * The available location of the SKU.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The available zone of the SKU.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get the available location of the SKU.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the available location of the SKU.
     *
     * @param location the location value to set
     * @return the SkuLocationInfoItem object itself.
     */
    public SkuLocationInfoItem withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the available zone of the SKU.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the available zone of the SKU.
     *
     * @param zones the zones value to set
     * @return the SkuLocationInfoItem object itself.
     */
    public SkuLocationInfoItem withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

}
