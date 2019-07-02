/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import java.util.List;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a cost target.
 */
public class TargetCostProperties {
    /**
     * Target cost status. Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "status")
    private TargetCostStatus status;

    /**
     * Lab target cost.
     */
    @JsonProperty(value = "target")
    private Integer target;

    /**
     * Cost thresholds.
     */
    @JsonProperty(value = "costThresholds")
    private List<CostThresholdProperties> costThresholds;

    /**
     * Reporting cycle start date.
     */
    @JsonProperty(value = "cycleStartDateTime")
    private DateTime cycleStartDateTime;

    /**
     * Reporting cycle end date.
     */
    @JsonProperty(value = "cycleEndDateTime")
    private DateTime cycleEndDateTime;

    /**
     * Reporting cycle type. Possible values include: 'CalendarMonth',
     * 'Custom'.
     */
    @JsonProperty(value = "cycleType")
    private ReportingCycleType cycleType;

    /**
     * Get target cost status. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the status value
     */
    public TargetCostStatus status() {
        return this.status;
    }

    /**
     * Set target cost status. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param status the status value to set
     * @return the TargetCostProperties object itself.
     */
    public TargetCostProperties withStatus(TargetCostStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get lab target cost.
     *
     * @return the target value
     */
    public Integer target() {
        return this.target;
    }

    /**
     * Set lab target cost.
     *
     * @param target the target value to set
     * @return the TargetCostProperties object itself.
     */
    public TargetCostProperties withTarget(Integer target) {
        this.target = target;
        return this;
    }

    /**
     * Get cost thresholds.
     *
     * @return the costThresholds value
     */
    public List<CostThresholdProperties> costThresholds() {
        return this.costThresholds;
    }

    /**
     * Set cost thresholds.
     *
     * @param costThresholds the costThresholds value to set
     * @return the TargetCostProperties object itself.
     */
    public TargetCostProperties withCostThresholds(List<CostThresholdProperties> costThresholds) {
        this.costThresholds = costThresholds;
        return this;
    }

    /**
     * Get reporting cycle start date.
     *
     * @return the cycleStartDateTime value
     */
    public DateTime cycleStartDateTime() {
        return this.cycleStartDateTime;
    }

    /**
     * Set reporting cycle start date.
     *
     * @param cycleStartDateTime the cycleStartDateTime value to set
     * @return the TargetCostProperties object itself.
     */
    public TargetCostProperties withCycleStartDateTime(DateTime cycleStartDateTime) {
        this.cycleStartDateTime = cycleStartDateTime;
        return this;
    }

    /**
     * Get reporting cycle end date.
     *
     * @return the cycleEndDateTime value
     */
    public DateTime cycleEndDateTime() {
        return this.cycleEndDateTime;
    }

    /**
     * Set reporting cycle end date.
     *
     * @param cycleEndDateTime the cycleEndDateTime value to set
     * @return the TargetCostProperties object itself.
     */
    public TargetCostProperties withCycleEndDateTime(DateTime cycleEndDateTime) {
        this.cycleEndDateTime = cycleEndDateTime;
        return this;
    }

    /**
     * Get reporting cycle type. Possible values include: 'CalendarMonth', 'Custom'.
     *
     * @return the cycleType value
     */
    public ReportingCycleType cycleType() {
        return this.cycleType;
    }

    /**
     * Set reporting cycle type. Possible values include: 'CalendarMonth', 'Custom'.
     *
     * @param cycleType the cycleType value to set
     * @return the TargetCostProperties object itself.
     */
    public TargetCostProperties withCycleType(ReportingCycleType cycleType) {
        this.cycleType = cycleType;
        return this;
    }

}
