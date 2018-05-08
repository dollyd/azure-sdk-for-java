/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.batchai.v2018_05_01.implementation.ExperimentsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Experiments.
 */
public interface Experiments extends SupportsCreating<Experiment.DefinitionStages.Blank>, HasInner<ExperimentsInner> {

    /**
     * @return Entry point to manage Experiment Job.
     */
    Jobs jobs();

    /**
     * Gets a list of Experiments within the specified Workspace.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Experiment> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName);

    /**
     * Gets information about an Experiment.
    *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Experiment> getByWorkspaceAsync(String resourceGroupName, String workspaceName, String experimentName);

    /**
     * Deletes an Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteByWorkspaceAsync(String resourceGroupName, String workspaceName, String experimentName);
}