/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArtifactInstallProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ArtifactDeploymentStatusProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.GalleryImageReference;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ComputeVmProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.NetworkInterfaceProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.VirtualMachineCreationSource;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.DataDiskProperties;
import com.microsoft.azure.management.devtestlabs.v2018_09_15.ScheduleCreationParameter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * A virtual machine.
 */
@JsonFlatten
@SkipParentValidation
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
     * The user principal name of the virtual machine owner.
     */
    @JsonProperty(value = "properties.ownerUserPrincipalName")
    private String ownerUserPrincipalName;

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
     * The creation date of the virtual machine.
     */
    @JsonProperty(value = "properties.createdDate")
    private DateTime createdDate;

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
     * Indicates whether this virtual machine uses an SSH key for
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
     * The id of the plan associated with the virtual machine image.
     */
    @JsonProperty(value = "properties.planId")
    private String planId;

    /**
     * The compute virtual machine properties.
     */
    @JsonProperty(value = "properties.computeVm", access = JsonProperty.Access.WRITE_ONLY)
    private ComputeVmProperties computeVm;

    /**
     * The network interface properties.
     */
    @JsonProperty(value = "properties.networkInterface")
    private NetworkInterfaceProperties networkInterface;

    /**
     * The applicable schedule for the virtual machine.
     */
    @JsonProperty(value = "properties.applicableSchedule", access = JsonProperty.Access.WRITE_ONLY)
    private ApplicableScheduleInner applicableSchedule;

    /**
     * The expiration date for VM.
     */
    @JsonProperty(value = "properties.expirationDate")
    private DateTime expirationDate;

    /**
     * Indicates whether another user can take ownership of the virtual
     * machine.
     */
    @JsonProperty(value = "properties.allowClaim")
    private Boolean allowClaim;

    /**
     * Storage type to use for virtual machine (i.e. Standard, Premium).
     */
    @JsonProperty(value = "properties.storageType")
    private String storageType;

    /**
     * Tells source of creation of lab virtual machine. Output property only.
     * Possible values include: 'FromCustomImage', 'FromGalleryImage'.
     */
    @JsonProperty(value = "properties.virtualMachineCreationSource")
    private VirtualMachineCreationSource virtualMachineCreationSource;

    /**
     * The resource ID of the environment that contains this virtual machine,
     * if any.
     */
    @JsonProperty(value = "properties.environmentId")
    private String environmentId;

    /**
     * New or existing data disks to attach to the virtual machine after
     * creation.
     */
    @JsonProperty(value = "properties.dataDiskParameters")
    private List<DataDiskProperties> dataDiskParameters;

    /**
     * Virtual Machine schedules to be created.
     */
    @JsonProperty(value = "properties.scheduleParameters")
    private List<ScheduleCreationParameter> scheduleParameters;

    /**
     * Last known compute power state captured in DTL.
     */
    @JsonProperty(value = "properties.lastKnownPowerState")
    private String lastKnownPowerState;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String uniqueIdentifier;

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
     * Get the user principal name of the virtual machine owner.
     *
     * @return the ownerUserPrincipalName value
     */
    public String ownerUserPrincipalName() {
        return this.ownerUserPrincipalName;
    }

    /**
     * Set the user principal name of the virtual machine owner.
     *
     * @param ownerUserPrincipalName the ownerUserPrincipalName value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withOwnerUserPrincipalName(String ownerUserPrincipalName) {
        this.ownerUserPrincipalName = ownerUserPrincipalName;
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
     * Get the creation date of the virtual machine.
     *
     * @return the createdDate value
     */
    public DateTime createdDate() {
        return this.createdDate;
    }

    /**
     * Set the creation date of the virtual machine.
     *
     * @param createdDate the createdDate value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
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
     * Get indicates whether this virtual machine uses an SSH key for authentication.
     *
     * @return the isAuthenticationWithSshKey value
     */
    public Boolean isAuthenticationWithSshKey() {
        return this.isAuthenticationWithSshKey;
    }

    /**
     * Set indicates whether this virtual machine uses an SSH key for authentication.
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
     * Get the id of the plan associated with the virtual machine image.
     *
     * @return the planId value
     */
    public String planId() {
        return this.planId;
    }

    /**
     * Set the id of the plan associated with the virtual machine image.
     *
     * @param planId the planId value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * Get the compute virtual machine properties.
     *
     * @return the computeVm value
     */
    public ComputeVmProperties computeVm() {
        return this.computeVm;
    }

    /**
     * Get the network interface properties.
     *
     * @return the networkInterface value
     */
    public NetworkInterfaceProperties networkInterface() {
        return this.networkInterface;
    }

    /**
     * Set the network interface properties.
     *
     * @param networkInterface the networkInterface value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withNetworkInterface(NetworkInterfaceProperties networkInterface) {
        this.networkInterface = networkInterface;
        return this;
    }

    /**
     * Get the applicable schedule for the virtual machine.
     *
     * @return the applicableSchedule value
     */
    public ApplicableScheduleInner applicableSchedule() {
        return this.applicableSchedule;
    }

    /**
     * Get the expiration date for VM.
     *
     * @return the expirationDate value
     */
    public DateTime expirationDate() {
        return this.expirationDate;
    }

    /**
     * Set the expiration date for VM.
     *
     * @param expirationDate the expirationDate value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withExpirationDate(DateTime expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Get indicates whether another user can take ownership of the virtual machine.
     *
     * @return the allowClaim value
     */
    public Boolean allowClaim() {
        return this.allowClaim;
    }

    /**
     * Set indicates whether another user can take ownership of the virtual machine.
     *
     * @param allowClaim the allowClaim value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withAllowClaim(Boolean allowClaim) {
        this.allowClaim = allowClaim;
        return this;
    }

    /**
     * Get storage type to use for virtual machine (i.e. Standard, Premium).
     *
     * @return the storageType value
     */
    public String storageType() {
        return this.storageType;
    }

    /**
     * Set storage type to use for virtual machine (i.e. Standard, Premium).
     *
     * @param storageType the storageType value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * Get tells source of creation of lab virtual machine. Output property only. Possible values include: 'FromCustomImage', 'FromGalleryImage'.
     *
     * @return the virtualMachineCreationSource value
     */
    public VirtualMachineCreationSource virtualMachineCreationSource() {
        return this.virtualMachineCreationSource;
    }

    /**
     * Set tells source of creation of lab virtual machine. Output property only. Possible values include: 'FromCustomImage', 'FromGalleryImage'.
     *
     * @param virtualMachineCreationSource the virtualMachineCreationSource value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withVirtualMachineCreationSource(VirtualMachineCreationSource virtualMachineCreationSource) {
        this.virtualMachineCreationSource = virtualMachineCreationSource;
        return this;
    }

    /**
     * Get the resource ID of the environment that contains this virtual machine, if any.
     *
     * @return the environmentId value
     */
    public String environmentId() {
        return this.environmentId;
    }

    /**
     * Set the resource ID of the environment that contains this virtual machine, if any.
     *
     * @param environmentId the environmentId value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    /**
     * Get new or existing data disks to attach to the virtual machine after creation.
     *
     * @return the dataDiskParameters value
     */
    public List<DataDiskProperties> dataDiskParameters() {
        return this.dataDiskParameters;
    }

    /**
     * Set new or existing data disks to attach to the virtual machine after creation.
     *
     * @param dataDiskParameters the dataDiskParameters value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withDataDiskParameters(List<DataDiskProperties> dataDiskParameters) {
        this.dataDiskParameters = dataDiskParameters;
        return this;
    }

    /**
     * Get virtual Machine schedules to be created.
     *
     * @return the scheduleParameters value
     */
    public List<ScheduleCreationParameter> scheduleParameters() {
        return this.scheduleParameters;
    }

    /**
     * Set virtual Machine schedules to be created.
     *
     * @param scheduleParameters the scheduleParameters value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withScheduleParameters(List<ScheduleCreationParameter> scheduleParameters) {
        this.scheduleParameters = scheduleParameters;
        return this;
    }

    /**
     * Get last known compute power state captured in DTL.
     *
     * @return the lastKnownPowerState value
     */
    public String lastKnownPowerState() {
        return this.lastKnownPowerState;
    }

    /**
     * Set last known compute power state captured in DTL.
     *
     * @param lastKnownPowerState the lastKnownPowerState value to set
     * @return the LabVirtualMachineInner object itself.
     */
    public LabVirtualMachineInner withLastKnownPowerState(String lastKnownPowerState) {
        this.lastKnownPowerState = lastKnownPowerState;
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
     * Get the unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

}
