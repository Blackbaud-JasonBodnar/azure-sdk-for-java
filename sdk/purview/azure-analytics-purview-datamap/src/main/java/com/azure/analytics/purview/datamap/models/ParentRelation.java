// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The lineage parents relation with GUID of the parent entity and to child entity.
 */
@Immutable
public final class ParentRelation {
    /*
     * The GUID of child entity.
     */
    @Generated
    @JsonProperty(value = "childEntityId")
    private String childEntityId;

    /*
     * The GUID of relationship.
     */
    @Generated
    @JsonProperty(value = "relationshipId")
    private String relationshipId;

    /*
     * The GUID of parent entity.
     */
    @Generated
    @JsonProperty(value = "parentEntityId")
    private String parentEntityId;

    /**
     * Creates an instance of ParentRelation class.
     */
    @Generated
    private ParentRelation() {
    }

    /**
     * Get the childEntityId property: The GUID of child entity.
     * 
     * @return the childEntityId value.
     */
    @Generated
    public String getChildEntityId() {
        return this.childEntityId;
    }

    /**
     * Get the relationshipId property: The GUID of relationship.
     * 
     * @return the relationshipId value.
     */
    @Generated
    public String getRelationshipId() {
        return this.relationshipId;
    }

    /**
     * Get the parentEntityId property: The GUID of parent entity.
     * 
     * @return the parentEntityId value.
     */
    @Generated
    public String getParentEntityId() {
        return this.parentEntityId;
    }
}
