/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.anomalydetector.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TimeSeriesList model.
 */
public class TimeSeriesList {
    /**
     * Array of TimeSeries objects.
     */
    @JsonProperty(value = "series", required = true)
    private List<TimeSeries> series;

    /**
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get array of TimeSeries objects.
     *
     * @return the series value
     */
    public List<TimeSeries> series() {
        return this.series;
    }

    /**
     * Set array of TimeSeries objects.
     *
     * @param series the series value to set
     * @return the TimeSeriesList object itself.
     */
    public TimeSeriesList withSeries(List<TimeSeries> series) {
        this.series = series;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the TimeSeriesList object itself.
     */
    public TimeSeriesList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
