// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourceconnector.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Appliances. */
public interface Appliances {
    /**
     * Lists all available Appliances operations.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lists of Appliances operations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApplianceOperation> listOperations();

    /**
     * Lists all available Appliances operations.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return lists of Appliances operations as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ApplianceOperation> listOperations(Context context);

    /**
     * Gets a list of Appliances in the specified subscription. The operation returns properties of each Appliance.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Appliances in the specified subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Appliance> list();

    /**
     * Gets a list of Appliances in the specified subscription. The operation returns properties of each Appliance.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Appliances in the specified subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Appliance> list(Context context);

    /**
     * Gets a list of Appliances in the specified subscription and resource group. The operation returns properties of
     * each Appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Appliances in the specified subscription and resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<Appliance> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of Appliances in the specified subscription and resource group. The operation returns properties of
     * each Appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Appliances in the specified subscription and resource group as paginated response with {@link
     *     PagedIterable}.
     */
    PagedIterable<Appliance> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the details of an Appliance with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Appliance with a specified resource group and name.
     */
    Appliance getByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Gets the details of an Appliance with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Appliance with a specified resource group and name along with {@link Response}.
     */
    Response<Appliance> getByResourceGroupWithResponse(String resourceGroupName, String resourceName, Context context);

    /**
     * Deletes an Appliance with the specified Resource Name, Resource Group, and Subscription Id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String resourceName);

    /**
     * Deletes an Appliance with the specified Resource Name, Resource Group, and Subscription Id.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String resourceName, Context context);

    /**
     * Returns the cluster customer user credentials for the dedicated appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster Customer User Credential Results appliance.
     */
    ApplianceListClusterCustomerUserCredentialResults listClusterCustomerUserCredential(
        String resourceGroupName, String resourceName);

    /**
     * Returns the cluster customer user credentials for the dedicated appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster Customer User Credential Results appliance along with {@link Response}.
     */
    Response<ApplianceListClusterCustomerUserCredentialResults> listClusterCustomerUserCredentialWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Returns the cluster user credentials for the dedicated appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster User Credential appliance.
     */
    ApplianceListCredentialResults listClusterUserCredential(String resourceGroupName, String resourceName);

    /**
     * Returns the cluster user credentials for the dedicated appliance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Cluster User Credential appliance along with {@link Response}.
     */
    Response<ApplianceListCredentialResults> listClusterUserCredentialWithResponse(
        String resourceGroupName, String resourceName, Context context);

    /**
     * Gets the upgrade graph of an Appliance with a specified resource group and name and specific release train.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @param upgradeGraph Upgrade graph version, ex - stable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upgrade graph of an Appliance with a specified resource group and name and specific release train.
     */
    UpgradeGraph getUpgradeGraph(String resourceGroupName, String resourceName, String upgradeGraph);

    /**
     * Gets the upgrade graph of an Appliance with a specified resource group and name and specific release train.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName Appliances name.
     * @param upgradeGraph Upgrade graph version, ex - stable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the upgrade graph of an Appliance with a specified resource group and name and specific release train
     *     along with {@link Response}.
     */
    Response<UpgradeGraph> getUpgradeGraphWithResponse(
        String resourceGroupName, String resourceName, String upgradeGraph, Context context);

    /**
     * Gets the details of an Appliance with a specified resource group and name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Appliance with a specified resource group and name along with {@link Response}.
     */
    Appliance getById(String id);

    /**
     * Gets the details of an Appliance with a specified resource group and name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of an Appliance with a specified resource group and name along with {@link Response}.
     */
    Response<Appliance> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an Appliance with the specified Resource Name, Resource Group, and Subscription Id.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an Appliance with the specified Resource Name, Resource Group, and Subscription Id.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Appliance resource.
     *
     * @param name resource name.
     * @return the first stage of the new Appliance definition.
     */
    Appliance.DefinitionStages.Blank define(String name);
}