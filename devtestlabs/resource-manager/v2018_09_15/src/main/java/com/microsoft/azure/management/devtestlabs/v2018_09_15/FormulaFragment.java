/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * A formula for creating a VM, specifying an image base and other parameters.
 */
@JsonFlatten
public class FormulaFragment extends UpdateResource {
    /**
     * The description of the formula.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The author of the formula.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * The OS type of the formula.
     */
    @JsonProperty(value = "properties.osType")
    private String osType;

    /**
     * The content of the formula.
     */
    @JsonProperty(value = "properties.formulaContent")
    private LabVirtualMachineCreationParameterFragment formulaContent;

    /**
     * Information about a VM from which a formula is to be created.
     */
    @JsonProperty(value = "properties.vm")
    private FormulaPropertiesFromVmFragment vm;

    /**
     * Get the description of the formula.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the formula.
     *
     * @param description the description value to set
     * @return the FormulaFragment object itself.
     */
    public FormulaFragment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the author of the formula.
     *
     * @return the author value
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author of the formula.
     *
     * @param author the author value to set
     * @return the FormulaFragment object itself.
     */
    public FormulaFragment withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the OS type of the formula.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the formula.
     *
     * @param osType the osType value to set
     * @return the FormulaFragment object itself.
     */
    public FormulaFragment withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the content of the formula.
     *
     * @return the formulaContent value
     */
    public LabVirtualMachineCreationParameterFragment formulaContent() {
        return this.formulaContent;
    }

    /**
     * Set the content of the formula.
     *
     * @param formulaContent the formulaContent value to set
     * @return the FormulaFragment object itself.
     */
    public FormulaFragment withFormulaContent(LabVirtualMachineCreationParameterFragment formulaContent) {
        this.formulaContent = formulaContent;
        return this;
    }

    /**
     * Get information about a VM from which a formula is to be created.
     *
     * @return the vm value
     */
    public FormulaPropertiesFromVmFragment vm() {
        return this.vm;
    }

    /**
     * Set information about a VM from which a formula is to be created.
     *
     * @param vm the vm value to set
     * @return the FormulaFragment object itself.
     */
    public FormulaFragment withVm(FormulaPropertiesFromVmFragment vm) {
        this.vm = vm;
        return this;
    }

}
