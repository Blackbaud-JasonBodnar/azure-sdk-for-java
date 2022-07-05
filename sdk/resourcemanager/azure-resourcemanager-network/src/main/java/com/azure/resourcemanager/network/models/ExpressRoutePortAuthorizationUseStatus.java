// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExpressRoutePortAuthorizationUseStatus. */
public final class ExpressRoutePortAuthorizationUseStatus
    extends ExpandableStringEnum<ExpressRoutePortAuthorizationUseStatus> {
    /** Static value Available for ExpressRoutePortAuthorizationUseStatus. */
    public static final ExpressRoutePortAuthorizationUseStatus AVAILABLE = fromString("Available");

    /** Static value InUse for ExpressRoutePortAuthorizationUseStatus. */
    public static final ExpressRoutePortAuthorizationUseStatus IN_USE = fromString("InUse");

    /**
     * Creates or finds a ExpressRoutePortAuthorizationUseStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExpressRoutePortAuthorizationUseStatus.
     */
    @JsonCreator
    public static ExpressRoutePortAuthorizationUseStatus fromString(String name) {
        return fromString(name, ExpressRoutePortAuthorizationUseStatus.class);
    }

    /**
     * Gets known ExpressRoutePortAuthorizationUseStatus values.
     *
     * @return known ExpressRoutePortAuthorizationUseStatus values.
     */
    public static Collection<ExpressRoutePortAuthorizationUseStatus> values() {
        return values(ExpressRoutePortAuthorizationUseStatus.class);
    }
}