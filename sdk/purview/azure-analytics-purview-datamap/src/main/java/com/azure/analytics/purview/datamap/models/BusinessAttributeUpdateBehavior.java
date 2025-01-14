// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.analytics.purview.datamap.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enum for business attribute update behavior.
 */
public final class BusinessAttributeUpdateBehavior extends ExpandableStringEnum<BusinessAttributeUpdateBehavior> {
    /**
     * Ignore the business attribute payload for update.
     */
    @Generated
    public static final BusinessAttributeUpdateBehavior IGNORE = fromString("ignore");

    /**
     * Replace all the business attributes using the payload.
     */
    @Generated
    public static final BusinessAttributeUpdateBehavior REPLACE = fromString("replace");

    /**
     * Merge the business attributes. Business attributes will not be updated if not provided.
     */
    @Generated
    public static final BusinessAttributeUpdateBehavior MERGE = fromString("merge");

    /**
     * Creates a new instance of BusinessAttributeUpdateBehavior value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public BusinessAttributeUpdateBehavior() {
    }

    /**
     * Creates or finds a BusinessAttributeUpdateBehavior from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BusinessAttributeUpdateBehavior.
     */
    @Generated
    @JsonCreator
    public static BusinessAttributeUpdateBehavior fromString(String name) {
        return fromString(name, BusinessAttributeUpdateBehavior.class);
    }

    /**
     * Gets known BusinessAttributeUpdateBehavior values.
     * 
     * @return known BusinessAttributeUpdateBehavior values.
     */
    @Generated
    public static Collection<BusinessAttributeUpdateBehavior> values() {
        return values(BusinessAttributeUpdateBehavior.class);
    }
}
