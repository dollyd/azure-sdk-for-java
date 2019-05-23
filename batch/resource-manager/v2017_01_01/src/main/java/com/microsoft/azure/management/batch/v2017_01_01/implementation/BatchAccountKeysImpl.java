/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_01_01.implementation;

import com.microsoft.azure.management.batch.v2017_01_01.BatchAccountKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class BatchAccountKeysImpl extends WrapperImpl<BatchAccountKeysInner> implements BatchAccountKeys {
    private final BatchManager manager;
    BatchAccountKeysImpl(BatchAccountKeysInner inner, BatchManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public BatchManager manager() {
        return this.manager;
    }

    @Override
    public String primary() {
        return this.inner().primary();
    }

    @Override
    public String secondary() {
        return this.inner().secondary();
    }

}
