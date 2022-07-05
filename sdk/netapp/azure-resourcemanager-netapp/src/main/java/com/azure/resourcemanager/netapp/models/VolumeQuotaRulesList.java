// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.netapp.fluent.models.VolumeQuotaRuleInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Volume Quota Rules. */
@Fluent
public final class VolumeQuotaRulesList {
    /*
     * A list of Volume Quota Rules
     */
    @JsonProperty(value = "value")
    private List<VolumeQuotaRuleInner> value;

    /**
     * Get the value property: A list of Volume Quota Rules.
     *
     * @return the value value.
     */
    public List<VolumeQuotaRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of Volume Quota Rules.
     *
     * @param value the value value to set.
     * @return the VolumeQuotaRulesList object itself.
     */
    public VolumeQuotaRulesList withValue(List<VolumeQuotaRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}