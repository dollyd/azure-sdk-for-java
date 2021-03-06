// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.data.cosmos.internal.changefeed.implementation;

import com.azure.data.cosmos.CosmosItemProperties;
import com.azure.data.cosmos.internal.changefeed.ChangeFeedObserver;
import com.azure.data.cosmos.internal.changefeed.ChangeFeedObserverCloseReason;
import com.azure.data.cosmos.internal.changefeed.ChangeFeedObserverContext;
import com.azure.data.cosmos.internal.changefeed.CheckpointFrequency;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Auto check-pointer implementation for {@link ChangeFeedObserver}.
 */
class AutoCheckpointer implements ChangeFeedObserver {
    private final CheckpointFrequency checkpointFrequency;
    private final ChangeFeedObserver observer;
    private volatile int processedDocCount;
    private volatile ZonedDateTime lastCheckpointTime;

    public AutoCheckpointer(CheckpointFrequency checkpointFrequency, ChangeFeedObserver observer) {
        if (checkpointFrequency == null) {
            throw new IllegalArgumentException("checkpointFrequency");
        }

        if (observer == null) {
            throw new IllegalArgumentException("observer");
        }

        this.checkpointFrequency = checkpointFrequency;
        this.observer = observer;
        this.lastCheckpointTime = ZonedDateTime.now(ZoneId.of("UTC"));
    }

    @Override
    public void open(ChangeFeedObserverContext context) {
        this.observer.open(context);
    }

    @Override
    public void close(ChangeFeedObserverContext context, ChangeFeedObserverCloseReason reason) {
        this.observer.close(context, reason);
    }

    @Override
    public Mono<Void> processChanges(ChangeFeedObserverContext context, List<CosmosItemProperties> docs) {
        return this.observer.processChanges(context, docs)
            .then(this.afterProcessChanges(context));
    }

    private Mono<Void> afterProcessChanges(ChangeFeedObserverContext context) {
        this.processedDocCount ++;

        if (this.isCheckpointNeeded()) {
            return context.checkpoint()
                .doOnSuccess((Void) -> {
                    this.processedDocCount = 0;
                    this.lastCheckpointTime = ZonedDateTime.now(ZoneId.of("UTC"));
                });
        }
        return Mono.empty();
    }

    private boolean isCheckpointNeeded() {
        if (this.checkpointFrequency.getProcessedDocumentCount() == 0 && this.checkpointFrequency.getTimeInterval() == null) {
            return true;
        }

        if (this.processedDocCount >= this.checkpointFrequency.getProcessedDocumentCount()) {
            return true;
        }

        Duration delta = Duration.between(this.lastCheckpointTime, ZonedDateTime.now(ZoneId.of("UTC")));

        return delta.compareTo(this.checkpointFrequency.getTimeInterval()) >= 0;
    }
}
