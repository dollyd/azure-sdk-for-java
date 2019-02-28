/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TransliterateResultItem model.
 */
public class TransliterateResultItem {
    /**
     * The text property.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * The script property.
     */
    @JsonProperty(value = "script")
    private String script;

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the TransliterateResultItem object itself.
     */
    public TransliterateResultItem withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the script value.
     *
     * @return the script value
     */
    public String script() {
        return this.script;
    }

    /**
     * Set the script value.
     *
     * @param script the script value to set
     * @return the TransliterateResultItem object itself.
     */
    public TransliterateResultItem withScript(String script) {
        this.script = script;
        return this;
    }

}
