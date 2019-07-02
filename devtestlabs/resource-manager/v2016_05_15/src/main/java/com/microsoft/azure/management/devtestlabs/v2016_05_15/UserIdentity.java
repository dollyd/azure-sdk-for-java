/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Identity attributes of a lab user.
 */
public class UserIdentity {
    /**
     * Set to the principal name / UPN of the client JWT making the request.
     */
    @JsonProperty(value = "principalName")
    private String principalName;

    /**
     * Set to the principal Id of the client JWT making the request. Service
     * principal will not have the principal Id.
     */
    @JsonProperty(value = "principalId")
    private String principalId;

    /**
     * Set to the tenant ID of the client JWT making the request.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * Set to the object Id of the client JWT making the request. Not all users
     * have object Id. For CSP (reseller) scenarios for example, object Id is
     * not available.
     */
    @JsonProperty(value = "objectId")
    private String objectId;

    /**
     * Set to the app Id of the client JWT making the request.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /**
     * Get set to the principal name / UPN of the client JWT making the request.
     *
     * @return the principalName value
     */
    public String principalName() {
        return this.principalName;
    }

    /**
     * Set set to the principal name / UPN of the client JWT making the request.
     *
     * @param principalName the principalName value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withPrincipalName(String principalName) {
        this.principalName = principalName;
        return this;
    }

    /**
     * Get set to the principal Id of the client JWT making the request. Service principal will not have the principal Id.
     *
     * @return the principalId value
     */
    public String principalId() {
        return this.principalId;
    }

    /**
     * Set set to the principal Id of the client JWT making the request. Service principal will not have the principal Id.
     *
     * @param principalId the principalId value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get set to the tenant ID of the client JWT making the request.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set set to the tenant ID of the client JWT making the request.
     *
     * @param tenantId the tenantId value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get set to the object Id of the client JWT making the request. Not all users have object Id. For CSP (reseller) scenarios for example, object Id is not available.
     *
     * @return the objectId value
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Set set to the object Id of the client JWT making the request. Not all users have object Id. For CSP (reseller) scenarios for example, object Id is not available.
     *
     * @param objectId the objectId value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    /**
     * Get set to the app Id of the client JWT making the request.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set set to the app Id of the client JWT making the request.
     *
     * @param appId the appId value to set
     * @return the UserIdentity object itself.
     */
    public UserIdentity withAppId(String appId) {
        this.appId = appId;
        return this;
    }

}
