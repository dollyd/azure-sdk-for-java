// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.data.cosmos.rx;

import com.azure.data.cosmos.CosmosClient;
import com.azure.data.cosmos.CosmosClientBuilder;
import com.azure.data.cosmos.CosmosClientException;
import com.azure.data.cosmos.CosmosContainer;
import com.azure.data.cosmos.CosmosStoredProcedureProperties;
import com.azure.data.cosmos.FeedOptions;
import com.azure.data.cosmos.FeedResponse;
import com.azure.data.cosmos.internal.FailureValidator;
import com.azure.data.cosmos.internal.FeedResponseListValidator;
import com.azure.data.cosmos.internal.FeedResponseValidator;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

//FIXME beforeCLass times out inconsistently
@Ignore
public class StoredProcedureQueryTest extends TestSuiteBase {

    private CosmosContainer createdCollection;
    private List<CosmosStoredProcedureProperties> createdStoredProcs = new ArrayList<>();

    private CosmosClient client;

    @Factory(dataProvider = "clientBuildersWithDirect")
    public StoredProcedureQueryTest(CosmosClientBuilder clientBuilder) {
        super(clientBuilder);
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void queryWithFilter() throws Exception {

        String filterId = createdStoredProcs.get(0).id();
        String query = String.format("SELECT * from c where c.id = '%s'", filterId);

        FeedOptions options = new FeedOptions();
        options.maxItemCount(5);
        Flux<FeedResponse<CosmosStoredProcedureProperties>> queryObservable = createdCollection.getScripts()
                .queryStoredProcedures(query, options);

        List<CosmosStoredProcedureProperties> expectedDocs = createdStoredProcs.stream()
                .filter(sp -> filterId.equals(sp.id())).collect(Collectors.toList());
        assertThat(expectedDocs).isNotEmpty();

        int expectedPageSize = (expectedDocs.size() + options.maxItemCount() - 1) / options.maxItemCount();

        FeedResponseListValidator<CosmosStoredProcedureProperties> validator = new FeedResponseListValidator.Builder<CosmosStoredProcedureProperties>()
                .totalSize(expectedDocs.size())
                .exactlyContainsInAnyOrder(expectedDocs.stream().map(d -> d.resourceId()).collect(Collectors.toList()))
                .numberOfPages(expectedPageSize)
                .pageSatisfy(0, new FeedResponseValidator.Builder<CosmosStoredProcedureProperties>()
                        .requestChargeGreaterThanOrEqualTo(1.0).build())
                .build();

        validateQuerySuccess(queryObservable, validator, 10000);
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void query_NoResults() throws Exception {

        String query = "SELECT * from root r where r.id = '2'";
        FeedOptions options = new FeedOptions();
        options.enableCrossPartitionQuery(true);
        Flux<FeedResponse<CosmosStoredProcedureProperties>> queryObservable = createdCollection.getScripts()
                .queryStoredProcedures(query, options);

        FeedResponseListValidator<CosmosStoredProcedureProperties> validator = new FeedResponseListValidator.Builder<CosmosStoredProcedureProperties>()
                .containsExactly(new ArrayList<>()).numberOfPages(1)
                .pageSatisfy(0, new FeedResponseValidator.Builder<CosmosStoredProcedureProperties>()
                        .requestChargeGreaterThanOrEqualTo(1.0).build())
                .build();
        validateQuerySuccess(queryObservable, validator);
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void queryAll() throws Exception {

        String query = "SELECT * from root";
        FeedOptions options = new FeedOptions();
        options.maxItemCount(3);
        options.enableCrossPartitionQuery(true);
        Flux<FeedResponse<CosmosStoredProcedureProperties>> queryObservable = createdCollection.getScripts()
                .queryStoredProcedures(query, options);

        List<CosmosStoredProcedureProperties> expectedDocs = createdStoredProcs;

        int expectedPageSize = (expectedDocs.size() + options.maxItemCount() - 1) / options.maxItemCount();

        FeedResponseListValidator<CosmosStoredProcedureProperties> validator = new FeedResponseListValidator.Builder<CosmosStoredProcedureProperties>()
                .exactlyContainsInAnyOrder(expectedDocs.stream().map(d -> d.resourceId()).collect(Collectors.toList()))
                .numberOfPages(expectedPageSize)
                .allPagesSatisfy(new FeedResponseValidator.Builder<CosmosStoredProcedureProperties>()
                        .requestChargeGreaterThanOrEqualTo(1.0).build())
                .build();

        validateQuerySuccess(queryObservable, validator);
    }

    @Test(groups = { "simple" }, timeOut = TIMEOUT)
    public void invalidQuerySytax() throws Exception {
        String query = "I am an invalid query";
        FeedOptions options = new FeedOptions();
        options.enableCrossPartitionQuery(true);
        Flux<FeedResponse<CosmosStoredProcedureProperties>> queryObservable = createdCollection.getScripts()
                .queryStoredProcedures(query, options);

        FailureValidator validator = new FailureValidator.Builder().instanceOf(CosmosClientException.class)
                .statusCode(400).notNullActivityId().build();
        validateQueryFailure(queryObservable, validator);
    }

    public CosmosStoredProcedureProperties createStoredProc(CosmosContainer cosmosContainer) {
        CosmosStoredProcedureProperties storedProcedure = getStoredProcedureDef();
        return cosmosContainer.getScripts().createStoredProcedure(storedProcedure).block().properties();
    }

    @BeforeClass(groups = { "simple" }, timeOut = SETUP_TIMEOUT)
    public void beforeClass() throws Exception {
        client = clientBuilder().build();
        createdCollection = getSharedMultiPartitionCosmosContainer(client);
        truncateCollection(createdCollection);

        for (int i = 0; i < 5; i++) {
            createdStoredProcs.add(createStoredProc(createdCollection));
        }

        waitIfNeededForReplicasToCatchUp(clientBuilder());
    }

    @AfterClass(groups = { "simple" }, timeOut = SHUTDOWN_TIMEOUT, alwaysRun = true)
    public void afterClass() {
        safeClose(client);
    }

    private static CosmosStoredProcedureProperties getStoredProcedureDef() {
        CosmosStoredProcedureProperties storedProcedureDef = new CosmosStoredProcedureProperties();
        storedProcedureDef.id(UUID.randomUUID().toString());
        storedProcedureDef.body("function() {var x = 10;}");
        return storedProcedureDef;
    }
}
