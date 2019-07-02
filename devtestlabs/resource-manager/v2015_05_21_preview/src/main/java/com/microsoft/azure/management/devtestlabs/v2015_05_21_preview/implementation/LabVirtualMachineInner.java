/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.ArtifactInstallProperties;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.ArtifactDeploymentStatusProperties;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.GalleryImageReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A virtual machine.
 */
@JsonFlatten
public class LabVirtualMachineInner extends Resource {
    /**
     * The notes of the virtual machine.
     */
    @JsonProperty(value = "properties.notes")
    private String notes;

    /**
     * The object identifier of the owner of the virtual machine.
     */
    @JsonProperty(value = "properties.ownerObjectId")
    private String ownerObjectId;

    /**
     * The object identifier of the creator of the virtual machine.
     */
    @JsonProperty(value = "properties.createdByUserId")
    private String createdByUserId;

    /**
     * The email address of creator of the virtual machine.
     */
    @JsonProperty(value = "properties.createdByUser")
    private String createdByUser;

    /**
     * The resource identifier (Microsoft.Compute) of the virtual machine.
     */
    @JsonProperty(value = "properties.computeId")
    private String computeId;

    /**
     * The custom image identifier of the virtual machine.
     */
    @JsonProperty(value = "properties.customImageId")
    private String customImageId;

    /**
     * The OS type of the virtual machine.
     */
    @JsonProperty(value = "properties.osType")
    private String osType;

    /**
     * The size of the virtual machine.
     */
    @JsonProperty(value = "properties.size")
    private String size;

    /**
     * The user name of the virtual machine.
     */
    @JsonProperty(value = "properties.userName")
    private String userName;

    /**
     * The password of the virtual machine administrator.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * The SSH key of the virtual machine administrator.
     */
    @JsonProperty(value = "properties.sshKey")
    private String sshKey;

    /**
     * A value indicating whether this virtual machine uses an SSH key for
     * authentication.
     */
    @JsonProperty(value = "properties.isAuthenticationWithSshKey")
    private Boolean isAuthenticationWithSshKey;

    /**
     * The fully-qualified domain name of the virtual machine.
     */
    @JsonProperty(value = "properties.fqdn")
    private String fqdn;

    /**
     * The lab subnet name of the virtual machine.
     */
    @JsonProperty(value = "properties.labSubnetName")
    private String labSubnetName;

    /**
     * The lab virtual network identifier of the virtual machine.
     */
    @JsonProperty(value = "properties.labVirtualNetworkId")
    private String labVirtualNetworkId;

    /**
     * Indicates whether the virtual machine is to be created without a public
     * IP address.
     */
    @JsonProperty(value = "properties.disallowPublicIpAddress")
    private Boolean disallowPublicIpAddress;

    /**
     * The artifacts to be installed on the virtual machine.
     */
    @JsonProperty(value = "properties.artifacts")
    private List<ArtifactInstallProperties> artifacts;

    /**
     * The artifact deployment status for the virtual machine.
     */
    @JsonProperty(value = "properties.artifactDeploymentStatus")
    private ArtifactDeploymentStatusProperties artifactDeploymentStatus;

    /**
     * The Microsoft Azure Marketplace image reference of the virtual machine.
     */
    @JsonProperty(value = "properties.galleryImageReference")
    private GalleryImageReference galleryImageReference;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Get the notes of the virtual machine.
     *
     * @return the notes value
     */
    public String notes() {
        return this.notes;
    }

    /**
     * Set the notes of the virtual machine.
     *
     * @param notes the notes value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withNotes(String notes) {
        this.notes = notes;
        return this;
    }

    /**
     * Get the object identifier of the owner of the virtual machine.
     *
     * @return the ownerObjectId value
     */
    public String ownerObjectId() {
        return this.ownerObjectId;
    }

    /**
     * Set the object identifier of the owner of the virtual machine.
     *
     * @param ownerObjectId the ownerObjectId value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withOwnerObjectId(String ownerObjectId) {
        this.ownerObjectId = ownerObjectId;
        return this;
    }

    /**
     * Get the object identifier of the creator of the virtual machine.
     *
     * @return the createdByUserId value
     */
    public String createdByUserId() {
        return this.createdByUserId;
    }

    /**
     * Set the object identifier of the creator of the virtual machine.
     *
     * @param createdByUserId the createdByUserId value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withCreatedByUserId(String createdByUserId) {
        this.createdByUserId = createdByUserId;
        return this;
    }

    /**
     * Get the email address of creator of the virtual machine.
     *
     * @return the createdByUser value
     */
    public String createdByUser() {
        return this.createdByUser;
    }

    /**
     * Set the email address of creator of the virtual machine.
     *
     * @param createdByUser the createdByUser value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
        return this;
    }

    /**
     * Get the resource identifier (Microsoft.Compute) of the virtual machine.
     *
     * @return the computeId value
     */
    public String computeId() {
        return this.computeId;
    }

    /**
     * Set the resource identifier (Microsoft.Compute) of the virtual machine.
     *
     * @param computeId the computeId value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withComputeId(String computeId) {
        this.computeId = computeId;
        return this;
    }

    /**
     * Get the custom image identifier of the virtual machine.
     *
     * @return the customImageId value
     */
    public String customImageId() {
        return this.customImageId;
    }

    /**
     * Set the custom image identifier of the virtual machine.
     *
     * @param customImageId the customImageId value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withCustomImageId(String customImageId) {
        this.customImageId = customImageId;
        return this;
    }

    /**
     * Get the OS type of the virtual machine.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the virtual machine.
     *
     * @param osType the osType value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the size of the virtual machine.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size of the virtual machine.
     *
     * @param size the size value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * Get the user name of the virtual machine.
     *
     * @return the userName value
     */
    public String userName() {
        return this.userName;
    }

    /**
     * Set the user name of the virtual machine.
     *
     * @param userName the userName value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password of the virtual machine administrator.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password of the virtual machine administrator.
     *
     * @param password the password value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the SSH key of the virtual machine administrator.
     *
     * @return the sshKey value
     */
    public String sshKey() {
        return this.sshKey;
    }

    /**
     * Set the SSH key of the virtual machine administrator.
     *
     * @param sshKey the sshKey value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withSshKey(String sshKey) {
        this.sshKey = sshKey;
        return this;
    }

    /**
     * Get a value indicating whether this virtual machine uses an SSH key for authentication.
     *
     * @return the isAuthenticationWithSshKey value
     */
    public Boolean isAuthenticationWithSshKey() {
        return this.isAuthenticationWithSshKey;
    }

    /**
     * Set a value indicating whether this virtual machine uses an SSH key for authentication.
     *
     * @param isAuthenticationWithSshKey the isAuthenticationWithSshKey value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withIsAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey) {
        this.isAuthenticationWithSshKey = isAuthenticationWithSshKey;
        return this;
    }

    /**
     * Get the fully-qualified domain name of the virtual machine.
     *
     * @return the fqdn value
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fully-qualified domain name of the virtual machine.
     *
     * @param fqdn the fqdn value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the lab subnet name of the virtual machine.
     *
     * @return the labSubnetName value
     */
    public String labSubnetName() {
        return this.labSubnetName;
    }

    /**
     * Set the lab subnet name of the virtual machine.
     *
     * @param labSubnetName the labSubnetName value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withLabSubnetName(String labSubnetName) {
        this.labSubnetName = labSubnetName;
        return this;
    }

    /**
     * Get the lab virtual network identifier of the virtual machine.
     *
     * @return the labVirtualNetworkId value
     */
    public String labVirtualNetworkId() {
        return this.labVirtualNetworkId;
    }

    /**
     * Set the lab virtual network identifier of the virtual machine.
     *
     * @param labVirtualNetworkId the labVirtualNetworkId value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withLabVirtualNetworkId(String labVirtualNetworkId) {
        this.labVirtualNetworkId = labVirtualNetworkId;
        return this;
    }

    /**
     * Get indicates whether the virtual machine is to be created without a public IP address.
     *
     * @return the disallowPublicIpAddress value
     */
    public Boolean disallowPublicIpAddress() {
        return this.disallowPublicIpAddress;
    }

    /**
     * Set indicates whether the virtual machine is to be created without a public IP address.
     *
     * @param disallowPublicIpAddress the disallowPublicIpAddress value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withDisallowPublicIpAddress(Boolean disallowPublicIpAddress) {
        this.disallowPublicIpAddress = disallowPublicIpAddress;
        return this;
    }

    /**
     * Get the artifacts to be installed on the virtual machine.
     *
     * @return the artifacts value
     */
    public List<ArtifactInstallProperties> artifacts() {
        return this.artifacts;
    }

    /**
     * Set the artifacts to be installed on the virtual machine.
     *
     * @param artifacts the artifacts value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withArtifacts(List<ArtifactInstallProperties> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    /**
     * Get the artifact deployment status for the virtual machine.
     *
     * @return the artifactDeploymentStatus value
     */
    public ArtifactDeploymentStatusProperties artifactDeploymentStatus() {
        return this.artifactDeploymentStatus;
    }

    /**
     * Set the artifact deployment status for the virtual machine.
     *
     * @param artifactDeploymentStatus the artifactDeploymentStatus value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withArtifactDeploymentStatus(ArtifactDeploymentStatusProperties artifactDeploymentStatus) {
        this.artifactDeploymentStatus = artifactDeploymentStatus;
        return this;
    }

    /**
     * Get the Microsoft Azure Marketplace image reference of the virtual machine.
     *
     * @return the galleryImageReference value
     */
    public GalleryImageReference galleryImageReference() {
        return this.galleryImageReference;
    }

    /**
     * Set the Microsoft Azure Marketplace image reference of the virtual machine.
     *
     * @param galleryImageReference the galleryImageReference value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withGalleryImageReference(GalleryImageReference galleryImageReference) {
        this.galleryImageReference = galleryImageReference;
        return this;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

}
