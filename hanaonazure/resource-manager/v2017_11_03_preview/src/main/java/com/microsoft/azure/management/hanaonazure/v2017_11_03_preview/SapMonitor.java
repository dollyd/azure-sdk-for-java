/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation.HanaOnAzureManager;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation.SapMonitorInner;

/**
 * Type representing SapMonitor.
 */
public interface SapMonitor extends HasInner<SapMonitorInner>, Resource, GroupableResourceCore<HanaOnAzureManager, SapMonitorInner>, HasResourceGroup, Refreshable<SapMonitor>, Updatable<SapMonitor.Update>, HasManager<HanaOnAzureManager> {
    /**
     * @return the hanaDbName value.
     */
    String hanaDbName();

    /**
     * @return the hanaDbPassword value.
     */
    String hanaDbPassword();

    /**
     * @return the hanaDbSqlPort value.
     */
    Integer hanaDbSqlPort();

    /**
     * @return the hanaDbUsername value.
     */
    String hanaDbUsername();

    /**
     * @return the hanaHostname value.
     */
    String hanaHostname();

    /**
     * @return the hanaSubnet value.
     */
    String hanaSubnet();

    /**
     * @return the provisioningState value.
     */
    HanaProvisioningStatesEnum provisioningState();

    /**
     * The entirety of the SapMonitor definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SapMonitor definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SapMonitor definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the SapMonitor definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the sapmonitor definition allowing to specify HanaDbName.
         */
        interface WithHanaDbName {
            /**
             * Specifies hanaDbName.
             * @param hanaDbName Database name of the HANA instance
             * @return the next definition stage
             */
            WithCreate withHanaDbName(String hanaDbName);
        }

        /**
         * The stage of the sapmonitor definition allowing to specify HanaDbPassword.
         */
        interface WithHanaDbPassword {
            /**
             * Specifies hanaDbPassword.
             * @param hanaDbPassword Database password of the HANA instance
             * @return the next definition stage
             */
            WithCreate withHanaDbPassword(String hanaDbPassword);
        }

        /**
         * The stage of the sapmonitor definition allowing to specify HanaDbSqlPort.
         */
        interface WithHanaDbSqlPort {
            /**
             * Specifies hanaDbSqlPort.
             * @param hanaDbSqlPort Database port of the HANA instance
             * @return the next definition stage
             */
            WithCreate withHanaDbSqlPort(Integer hanaDbSqlPort);
        }

        /**
         * The stage of the sapmonitor definition allowing to specify HanaDbUsername.
         */
        interface WithHanaDbUsername {
            /**
             * Specifies hanaDbUsername.
             * @param hanaDbUsername Database username of the HANA instance
             * @return the next definition stage
             */
            WithCreate withHanaDbUsername(String hanaDbUsername);
        }

        /**
         * The stage of the sapmonitor definition allowing to specify HanaHostname.
         */
        interface WithHanaHostname {
            /**
             * Specifies hanaHostname.
             * @param hanaHostname Hostname of the HANA instance
             * @return the next definition stage
             */
            WithCreate withHanaHostname(String hanaHostname);
        }

        /**
         * The stage of the sapmonitor definition allowing to specify HanaSubnet.
         */
        interface WithHanaSubnet {
            /**
             * Specifies hanaSubnet.
             * @param hanaSubnet Specifies the SAP monitor unique ID
             * @return the next definition stage
             */
            WithCreate withHanaSubnet(String hanaSubnet);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SapMonitor>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithHanaDbName, DefinitionStages.WithHanaDbPassword, DefinitionStages.WithHanaDbSqlPort, DefinitionStages.WithHanaDbUsername, DefinitionStages.WithHanaHostname, DefinitionStages.WithHanaSubnet {
        }
    }
    /**
     * The template for a SapMonitor update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SapMonitor>, Resource.UpdateWithTags<Update>, UpdateStages.WithHanaDbName, UpdateStages.WithHanaDbPassword, UpdateStages.WithHanaDbSqlPort, UpdateStages.WithHanaDbUsername, UpdateStages.WithHanaHostname, UpdateStages.WithHanaSubnet {
    }

    /**
     * Grouping of SapMonitor update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the sapmonitor update allowing to specify HanaDbName.
         */
        interface WithHanaDbName {
            /**
             * Specifies hanaDbName.
             * @param hanaDbName Database name of the HANA instance
             * @return the next update stage
             */
            Update withHanaDbName(String hanaDbName);
        }

        /**
         * The stage of the sapmonitor update allowing to specify HanaDbPassword.
         */
        interface WithHanaDbPassword {
            /**
             * Specifies hanaDbPassword.
             * @param hanaDbPassword Database password of the HANA instance
             * @return the next update stage
             */
            Update withHanaDbPassword(String hanaDbPassword);
        }

        /**
         * The stage of the sapmonitor update allowing to specify HanaDbSqlPort.
         */
        interface WithHanaDbSqlPort {
            /**
             * Specifies hanaDbSqlPort.
             * @param hanaDbSqlPort Database port of the HANA instance
             * @return the next update stage
             */
            Update withHanaDbSqlPort(Integer hanaDbSqlPort);
        }

        /**
         * The stage of the sapmonitor update allowing to specify HanaDbUsername.
         */
        interface WithHanaDbUsername {
            /**
             * Specifies hanaDbUsername.
             * @param hanaDbUsername Database username of the HANA instance
             * @return the next update stage
             */
            Update withHanaDbUsername(String hanaDbUsername);
        }

        /**
         * The stage of the sapmonitor update allowing to specify HanaHostname.
         */
        interface WithHanaHostname {
            /**
             * Specifies hanaHostname.
             * @param hanaHostname Hostname of the HANA instance
             * @return the next update stage
             */
            Update withHanaHostname(String hanaHostname);
        }

        /**
         * The stage of the sapmonitor update allowing to specify HanaSubnet.
         */
        interface WithHanaSubnet {
            /**
             * Specifies hanaSubnet.
             * @param hanaSubnet Specifies the SAP monitor unique ID
             * @return the next update stage
             */
            Update withHanaSubnet(String hanaSubnet);
        }

    }
}
