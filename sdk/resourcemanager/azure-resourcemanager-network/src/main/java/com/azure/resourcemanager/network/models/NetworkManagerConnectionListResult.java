// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.NetworkManagerConnectionInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of network manager connections. */
@Fluent
public final class NetworkManagerConnectionListResult {
    /*
     * List of network manager connections.
     */
    @JsonProperty(value = "value")
    private List<NetworkManagerConnectionInner> value;

    /*
     * Gets the URL to get the next page of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of network manager connections.
     *
     * @return the value value.
     */
    public List<NetworkManagerConnectionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of network manager connections.
     *
     * @param value the value value to set.
     * @return the NetworkManagerConnectionListResult object itself.
     */
    public NetworkManagerConnectionListResult withValue(List<NetworkManagerConnectionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the URL to get the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the URL to get the next page of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkManagerConnectionListResult object itself.
     */
    public NetworkManagerConnectionListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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