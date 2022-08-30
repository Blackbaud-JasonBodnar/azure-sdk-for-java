// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Usage Names. */
@Fluent
public final class UsageName {
    /*
     * The localized name of the resource.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the localizedValue property: The localized name of the resource.
     *
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: The localized name of the resource.
     *
     * @param localizedValue the localizedValue value to set.
     * @return the UsageName object itself.
     */
    public UsageName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

    /**
     * Get the value property: The name of the resource.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The name of the resource.
     *
     * @param value the value value to set.
     * @return the UsageName object itself.
     */
    public UsageName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}