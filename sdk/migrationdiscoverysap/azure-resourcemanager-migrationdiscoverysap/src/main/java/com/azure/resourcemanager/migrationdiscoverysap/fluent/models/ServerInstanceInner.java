// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migrationdiscoverysap.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.migrationdiscoverysap.models.ConfigurationData;
import com.azure.resourcemanager.migrationdiscoverysap.models.OperatingSystem;
import com.azure.resourcemanager.migrationdiscoverysap.models.PerformanceData;
import com.azure.resourcemanager.migrationdiscoverysap.models.ProvisioningState;
import com.azure.resourcemanager.migrationdiscoverysap.models.SapInstanceType;
import com.azure.resourcemanager.migrationdiscoverysap.models.SapMigrateError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Define the Server Instance resource.
 */
@Immutable
public final class ServerInstanceInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties")
    private ServerInstanceProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Creates an instance of ServerInstanceInner class.
     */
    public ServerInstanceInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     * 
     * @return the innerProperties value.
     */
    private ServerInstanceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the serverName property: This is the Virtual Machine Name of the SAP system. Add all the virtual machines
     * attached to an SAP system which you wish to migrate to Azure. Keeping this not equal to ID as for single tier
     * all InstanceTypes would be on same server, leading to multiple resources with same servername.
     * 
     * @return the serverName value.
     */
    public String serverName() {
        return this.innerProperties() == null ? null : this.innerProperties().serverName();
    }

    /**
     * Get the sapInstanceType property: Defines the type SAP instance on this server instance.
     * 
     * @return the sapInstanceType value.
     */
    public SapInstanceType sapInstanceType() {
        return this.innerProperties() == null ? null : this.innerProperties().sapInstanceType();
    }

    /**
     * Get the instanceSid property: This is the Instance SID for ASCS/AP/DB instance. An SAP system with HANA
     * database for example could have a different SID for database Instance than that of ASCS instance.
     * 
     * @return the instanceSid value.
     */
    public String instanceSid() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceSid();
    }

    /**
     * Get the sapProduct property: This is the SAP Application Component; e.g. SAP S/4HANA 2022, SAP ERP ENHANCE
     * PACKAGE.
     * 
     * @return the sapProduct value.
     */
    public String sapProduct() {
        return this.innerProperties() == null ? null : this.innerProperties().sapProduct();
    }

    /**
     * Get the sapProductVersion property: Provide the product version of the SAP product.
     * 
     * @return the sapProductVersion value.
     */
    public String sapProductVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().sapProductVersion();
    }

    /**
     * Get the operatingSystem property: This is Operating System on which the host server is running.
     * 
     * @return the operatingSystem value.
     */
    public OperatingSystem operatingSystem() {
        return this.innerProperties() == null ? null : this.innerProperties().operatingSystem();
    }

    /**
     * Get the configurationData property: Configuration data for this server instance.
     * 
     * @return the configurationData value.
     */
    public ConfigurationData configurationData() {
        return this.innerProperties() == null ? null : this.innerProperties().configurationData();
    }

    /**
     * Get the performanceData property: Configuration data for this server instance.
     * 
     * @return the performanceData value.
     */
    public PerformanceData performanceData() {
        return this.innerProperties() == null ? null : this.innerProperties().performanceData();
    }

    /**
     * Get the provisioningState property: Defines the provisioning states.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the errors property: Defines the errors related to SAP Instance resource.
     * 
     * @return the errors value.
     */
    public SapMigrateError errors() {
        return this.innerProperties() == null ? null : this.innerProperties().errors();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
