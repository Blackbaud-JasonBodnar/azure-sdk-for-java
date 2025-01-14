// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * class that captures details of a constraint.
 */
@Fluent
public final class AtlasConstraintDef {
    /*
     * The parameters of the constraint definition.
     */
    @Generated
    @JsonProperty(value = "params")
    private Map<String, Object> params;

    /*
     * The type of the constraint.
     */
    @Generated
    @JsonProperty(value = "type")
    private String type;

    /**
     * Creates an instance of AtlasConstraintDef class.
     */
    @Generated
    public AtlasConstraintDef() {
    }

    /**
     * Get the params property: The parameters of the constraint definition.
     * 
     * @return the params value.
     */
    @Generated
    public Map<String, Object> getParams() {
        return this.params;
    }

    /**
     * Set the params property: The parameters of the constraint definition.
     * 
     * @param params the params value to set.
     * @return the AtlasConstraintDef object itself.
     */
    @Generated
    public AtlasConstraintDef setParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    /**
     * Get the type property: The type of the constraint.
     * 
     * @return the type value.
     */
    @Generated
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type of the constraint.
     * 
     * @param type the type value to set.
     * @return the AtlasConstraintDef object itself.
     */
    @Generated
    public AtlasConstraintDef setType(String type) {
        this.type = type;
        return this;
    }
}
