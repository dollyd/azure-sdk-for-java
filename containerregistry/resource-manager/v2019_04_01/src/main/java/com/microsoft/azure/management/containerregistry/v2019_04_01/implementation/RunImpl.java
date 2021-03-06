/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01.implementation;

import com.microsoft.azure.management.containerregistry.v2019_04_01.Run;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2019_04_01.AgentProperties;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2019_04_01.ImageUpdateTrigger;
import com.microsoft.azure.management.containerregistry.v2019_04_01.ImageDescriptor;
import com.microsoft.azure.management.containerregistry.v2019_04_01.PlatformProperties;
import com.microsoft.azure.management.containerregistry.v2019_04_01.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2019_04_01.RunType;
import com.microsoft.azure.management.containerregistry.v2019_04_01.SourceTriggerDescriptor;
import com.microsoft.azure.management.containerregistry.v2019_04_01.RunStatus;
import com.microsoft.azure.management.containerregistry.v2019_04_01.TimerTriggerDescriptor;

class RunImpl extends CreatableUpdatableImpl<Run, RunInner, RunImpl> implements Run, Run.Update {
    private final ContainerRegistryManager manager;
    private String resourceGroupName;
    private String registryName;
    private String runId;
    private Boolean uisArchiveEnabled;

    RunImpl(String name, ContainerRegistryManager manager) {
        super(name, new RunInner());
        this.manager = manager;
        // Set resource name
        this.runId = name;
        //
    }

    RunImpl(RunInner inner, ContainerRegistryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.runId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.registryName = IdParsingUtils.getValueFromIdByName(inner.id(), "registries");
        this.runId = IdParsingUtils.getValueFromIdByName(inner.id(), "runs");
        //
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Run> createResourceAsync() {
        RunsInner client = this.manager().inner().runs();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<Run> updateResourceAsync() {
        RunsInner client = this.manager().inner().runs();
        return client.updateAsync(this.resourceGroupName, this.registryName, this.runId, this.uisArchiveEnabled)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RunInner> getInnerAsync() {
        RunsInner client = this.manager().inner().runs();
        return client.getAsync(this.resourceGroupName, this.registryName, this.runId);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AgentProperties agentConfiguration() {
        return this.inner().agentConfiguration();
    }

    @Override
    public DateTime createTime() {
        return this.inner().createTime();
    }

    @Override
    public List<String> customRegistries() {
        return this.inner().customRegistries();
    }

    @Override
    public DateTime finishTime() {
        return this.inner().finishTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ImageUpdateTrigger imageUpdateTrigger() {
        return this.inner().imageUpdateTrigger();
    }

    @Override
    public Boolean isArchiveEnabled() {
        return this.inner().isArchiveEnabled();
    }

    @Override
    public DateTime lastUpdatedTime() {
        return this.inner().lastUpdatedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<ImageDescriptor> outputImages() {
        return this.inner().outputImages();
    }

    @Override
    public PlatformProperties platform() {
        return this.inner().platform();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String runErrorMessage() {
        return this.inner().runErrorMessage();
    }

    @Override
    public String runId() {
        return this.inner().runId();
    }

    @Override
    public RunType runType() {
        return this.inner().runType();
    }

    @Override
    public String sourceRegistryAuth() {
        return this.inner().sourceRegistryAuth();
    }

    @Override
    public SourceTriggerDescriptor sourceTrigger() {
        return this.inner().sourceTrigger();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public RunStatus status() {
        return this.inner().status();
    }

    @Override
    public String task() {
        return this.inner().task();
    }

    @Override
    public TimerTriggerDescriptor timerTrigger() {
        return this.inner().timerTrigger();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public RunImpl withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.uisArchiveEnabled = isArchiveEnabled;
        return this;
    }

}
