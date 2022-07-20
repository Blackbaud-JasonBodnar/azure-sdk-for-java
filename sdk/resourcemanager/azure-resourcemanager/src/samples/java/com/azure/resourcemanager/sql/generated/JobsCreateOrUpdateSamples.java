// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.JobInner;
import com.azure.resourcemanager.sql.models.JobSchedule;
import com.azure.resourcemanager.sql.models.JobScheduleType;
import java.time.OffsetDateTime;

/** Samples for Jobs CreateOrUpdate. */
public final class JobsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/CreateOrUpdateJobMin.json
     */
    /**
     * Sample code: Create a job with default properties.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAJobWithDefaultProperties(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getJobs()
            .createOrUpdateWithResponse("group1", "server1", "agent1", "job1", new JobInner(), Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2017-03-01-preview/examples/CreateOrUpdateJobMax.json
     */
    /**
     * Sample code: Create a job with all properties specified.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createAJobWithAllPropertiesSpecified(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getJobs()
            .createOrUpdateWithResponse(
                "group1",
                "server1",
                "agent1",
                "job1",
                new JobInner()
                    .withDescription("my favourite job")
                    .withSchedule(
                        new JobSchedule()
                            .withStartTime(OffsetDateTime.parse("2015-09-24T18:30:01Z"))
                            .withEndTime(OffsetDateTime.parse("2015-09-24T23:59:59Z"))
                            .withType(JobScheduleType.RECURRING)
                            .withEnabled(true)
                            .withInterval("PT5M")),
                Context.NONE);
    }
}