/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.translatortext.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LanguagesResultTransliterationLanguageCode model.
 */
public class LanguagesResultTransliterationLanguageCode {
    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The nativeName property.
     */
    @JsonProperty(value = "nativeName")
    private String nativeName;

    /**
     * The scripts property.
     */
    @JsonProperty(value = "scripts")
    private List<LanguagesResultTransliterationLanguageCodeScriptsItem> scripts;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the LanguagesResultTransliterationLanguageCode object itself.
     */
    public LanguagesResultTransliterationLanguageCode withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the nativeName value.
     *
     * @return the nativeName value
     */
    public String nativeName() {
        return this.nativeName;
    }

    /**
     * Set the nativeName value.
     *
     * @param nativeName the nativeName value to set
     * @return the LanguagesResultTransliterationLanguageCode object itself.
     */
    public LanguagesResultTransliterationLanguageCode withNativeName(String nativeName) {
        this.nativeName = nativeName;
        return this;
    }

    /**
     * Get the scripts value.
     *
     * @return the scripts value
     */
    public List<LanguagesResultTransliterationLanguageCodeScriptsItem> scripts() {
        return this.scripts;
    }

    /**
     * Set the scripts value.
     *
     * @param scripts the scripts value to set
     * @return the LanguagesResultTransliterationLanguageCode object itself.
     */
    public LanguagesResultTransliterationLanguageCode withScripts(List<LanguagesResultTransliterationLanguageCodeScriptsItem> scripts) {
        this.scripts = scripts;
        return this;
    }

}
