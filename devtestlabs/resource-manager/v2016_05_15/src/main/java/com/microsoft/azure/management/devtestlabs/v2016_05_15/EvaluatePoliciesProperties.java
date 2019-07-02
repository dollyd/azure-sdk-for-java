/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for evaluating a policy set.
 */
public class EvaluatePoliciesProperties {
    /**
     * The fact name.
     */
    @JsonProperty(value = "factName")
    private String factName;

    /**
     * The fact data.
     */
    @JsonProperty(value = "factData")
    private String factData;

    /**
     * The value offset.
     */
    @JsonProperty(value = "valueOffset")
    private String valueOffset;

    /**
     * Get the fact name.
     *
     * @return the factName value
     */
    public String factName() {
        return this.factName;
    }

    /**
     * Set the fact name.
     *
     * @param factName the factName value to set
     * @return the EvaluatePoliciesProperties object itself.
     */
    public EvaluatePoliciesProperties withFactName(String factName) {
        this.factName = factName;
        return this;
    }

    /**
     * Get the fact data.
     *
     * @return the factData value
     */
    public String factData() {
        return this.factData;
    }

    /**
     * Set the fact data.
     *
     * @param factData the factData value to set
     * @return the EvaluatePoliciesProperties object itself.
     */
    public EvaluatePoliciesProperties withFactData(String factData) {
        this.factData = factData;
        return this;
    }

    /**
     * Get the value offset.
     *
     * @return the valueOffset value
     */
    public String valueOffset() {
        return this.valueOffset;
    }

    /**
     * Set the value offset.
     *
     * @param valueOffset the valueOffset value to set
     * @return the EvaluatePoliciesProperties object itself.
     */
    public EvaluatePoliciesProperties withValueOffset(String valueOffset) {
        this.valueOffset = valueOffset;
        return this;
    }

}
