---
title: "deviceManagement resource type"
description: "Singleton that acts as container for a collection of UserPFXCertificate entities."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagement resource type

Namespace: microsoft.graph



Singleton that acts as container for a collection of UserPFXCertificate entities.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get deviceManagement](../api/devicemanagement-get.md)|[deviceManagement](../resources/devicemanagement.md)|Read the properties and relationships of a [deviceManagement](../resources/devicemanagement.md) object.|
|[Update deviceManagement](../api/devicemanagement-update.md)|[deviceManagement](../resources/devicemanagement.md)|Update the properties of a [deviceManagement](../resources/devicemanagement.md) object.|
|[enableAndroidDeviceAdministratorEnrollment](../api/devicemanagement-enableandroiddeviceadministratorenrollment.md)|None|**TODO: Add Description**|
|[enableLegacyPcManagement](../api/devicemanagement-enablelegacypcmanagement.md)|None|**TODO: Add Description**|
|[enableUnlicensedAdminstrators](../api/devicemanagement-enableunlicensedadminstrators.md)|None|**TODO: Add Description**|
|[getAssignmentFiltersStatusDetails](../api/devicemanagement-getassignmentfiltersstatusdetails.md)|[assignmentFilterStatusDetails](../resources/assignmentfilterstatusdetails.md)|**TODO: Add Description**|
|[sendCustomNotificationToCompanyPortal](../api/devicemanagement-sendcustomnotificationtocompanyportal.md)|None|**TODO: Add Description**|
|[getAssignedRoleDetails](../api/devicemanagement-getassignedroledetails.md)|[deviceAndAppManagementAssignedRoleDetails](../resources/deviceandappmanagementassignedroledetails.md)|**TODO: Add Description**|
|[getComanagedDevicesSummary](../api/devicemanagement-getcomanageddevicessummary.md)|[comanagedDevicesSummary](../resources/comanageddevicessummary.md)|**TODO: Add Description**|
|[getComanagementEligibleDevicesSummary](../api/devicemanagement-getcomanagementeligibledevicessummary.md)|[comanagementEligibleDevicesSummary](../resources/comanagementeligibledevicessummary.md)|**TODO: Add Description**|
|[getEffectivePermissions](../api/devicemanagement-geteffectivepermissions.md)|String collection|**TODO: Add Description**|
|[getEffectivePermissions](../api/devicemanagement-geteffectivepermissions.md)|[rolePermission](../resources/rolepermission.md) collection|**TODO: Add Description**|
|[getRoleScopeTagsByIds](../api/devicemanagement-getrolescopetagsbyids.md)|[roleScopeTag](../resources/rolescopetag.md) collection|**TODO: Add Description**|
|[getRoleScopeTagsByResource](../api/devicemanagement-getrolescopetagsbyresource.md)|[roleScopeTag](../resources/rolescopetag.md) collection|**TODO: Add Description**|
|[getSuggestedEnrollmentLimit](../api/devicemanagement-getsuggestedenrollmentlimit.md)|[suggestedEnrollmentLimit](../resources/suggestedenrollmentlimit.md)|**TODO: Add Description**|
|[scopedForResource](../api/devicemanagement-scopedforresource.md)|Boolean|**TODO: Add Description**|
|[userExperienceAnalyticsSummarizeWorkFromAnywhereDevices](../api/devicemanagement-userexperienceanalyticssummarizeworkfromanywheredevices.md)|[userExperienceAnalyticsWorkFromAnywhereDevicesSummary](../resources/userexperienceanalyticsworkfromanywheredevicessummary.md)|**TODO: Add Description**|
|[List advancedThreatProtectionOnboardingStateSummary](../api/devicemanagement-list-advancedthreatprotectiononboardingstatesummary.md)|[advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md) collection|Get the advancedThreatProtectionOnboardingStateSummary resources from the advancedThreatProtectionOnboardingStateSummary navigation property.|
|[Create advancedThreatProtectionOnboardingStateSummary](../api/devicemanagement-post-advancedthreatprotectiononboardingstatesummary.md)|[advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md)|Create a new advancedThreatProtectionOnboardingStateSummary object.|
|[List androidDeviceOwnerEnrollmentProfiles](../api/devicemanagement-list-androiddeviceownerenrollmentprofiles.md)|[androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) collection|Get the androidDeviceOwnerEnrollmentProfile resources from the androidDeviceOwnerEnrollmentProfiles navigation property.|
|[Create androidDeviceOwnerEnrollmentProfile](../api/devicemanagement-post-androiddeviceownerenrollmentprofiles.md)|[androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md)|Create a new androidDeviceOwnerEnrollmentProfile object.|
|[List androidForWorkAppConfigurationSchemas](../api/devicemanagement-list-androidforworkappconfigurationschemas.md)|[androidForWorkAppConfigurationSchema](../resources/androidforworkappconfigurationschema.md) collection|Get the androidForWorkAppConfigurationSchema resources from the androidForWorkAppConfigurationSchemas navigation property.|
|[Create androidForWorkAppConfigurationSchema](../api/devicemanagement-post-androidforworkappconfigurationschemas.md)|[androidForWorkAppConfigurationSchema](../resources/androidforworkappconfigurationschema.md)|Create a new androidForWorkAppConfigurationSchema object.|
|[List androidForWorkEnrollmentProfiles](../api/devicemanagement-list-androidforworkenrollmentprofiles.md)|[androidForWorkEnrollmentProfile](../resources/androidforworkenrollmentprofile.md) collection|Get the androidForWorkEnrollmentProfile resources from the androidForWorkEnrollmentProfiles navigation property.|
|[Create androidForWorkEnrollmentProfile](../api/devicemanagement-post-androidforworkenrollmentprofiles.md)|[androidForWorkEnrollmentProfile](../resources/androidforworkenrollmentprofile.md)|Create a new androidForWorkEnrollmentProfile object.|
|[List androidForWorkSettings](../api/devicemanagement-list-androidforworksettings.md)|[androidForWorkSettings](../resources/androidforworksettings.md) collection|Get the androidForWorkSettings resources from the androidForWorkSettings navigation property.|
|[Create androidForWorkSettings](../api/devicemanagement-post-androidforworksettings.md)|[androidForWorkSettings](../resources/androidforworksettings.md)|Create a new androidForWorkSettings object.|
|[List androidManagedStoreAccountEnterpriseSettings](../api/devicemanagement-list-androidmanagedstoreaccountenterprisesettings.md)|[androidManagedStoreAccountEnterpriseSettings](../resources/androidmanagedstoreaccountenterprisesettings.md) collection|Get the androidManagedStoreAccountEnterpriseSettings resources from the androidManagedStoreAccountEnterpriseSettings navigation property.|
|[Create androidManagedStoreAccountEnterpriseSettings](../api/devicemanagement-post-androidmanagedstoreaccountenterprisesettings.md)|[androidManagedStoreAccountEnterpriseSettings](../resources/androidmanagedstoreaccountenterprisesettings.md)|Create a new androidManagedStoreAccountEnterpriseSettings object.|
|[List androidManagedStoreAppConfigurationSchemas](../api/devicemanagement-list-androidmanagedstoreappconfigurationschemas.md)|[androidManagedStoreAppConfigurationSchema](../resources/androidmanagedstoreappconfigurationschema.md) collection|Get the androidManagedStoreAppConfigurationSchema resources from the androidManagedStoreAppConfigurationSchemas navigation property.|
|[Create androidManagedStoreAppConfigurationSchema](../api/devicemanagement-post-androidmanagedstoreappconfigurationschemas.md)|[androidManagedStoreAppConfigurationSchema](../resources/androidmanagedstoreappconfigurationschema.md)|Create a new androidManagedStoreAppConfigurationSchema object.|
|[List appleUserInitiatedEnrollmentProfiles](../api/devicemanagement-list-appleuserinitiatedenrollmentprofiles.md)|[appleUserInitiatedEnrollmentProfile](../resources/appleuserinitiatedenrollmentprofile.md) collection|Get the appleUserInitiatedEnrollmentProfile resources from the appleUserInitiatedEnrollmentProfiles navigation property.|
|[Create appleUserInitiatedEnrollmentProfile](../api/devicemanagement-post-appleuserinitiatedenrollmentprofiles.md)|[appleUserInitiatedEnrollmentProfile](../resources/appleuserinitiatedenrollmentprofile.md)|Create a new appleUserInitiatedEnrollmentProfile object.|
|[List assignmentFilters](../api/devicemanagement-list-assignmentfilters.md)|[deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) collection|Get the deviceAndAppManagementAssignmentFilter resources from the assignmentFilters navigation property.|
|[Create deviceAndAppManagementAssignmentFilter](../api/devicemanagement-post-assignmentfilters.md)|[deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md)|Create a new deviceAndAppManagementAssignmentFilter object.|
|[List auditEvents](../api/devicemanagement-list-auditevents.md)|[auditEvent](../resources/auditevent.md) collection|Get the auditEvent resources from the auditEvents navigation property.|
|[Create auditEvent](../api/devicemanagement-post-auditevents.md)|[auditEvent](../resources/auditevent.md)|Create a new auditEvent object.|
|[List autopilotEvents](../api/devicemanagement-list-autopilotevents.md)|[deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) collection|Get the deviceManagementAutopilotEvent resources from the autopilotEvents navigation property.|
|[Create deviceManagementAutopilotEvent](../api/devicemanagement-post-autopilotevents.md)|[deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md)|Create a new deviceManagementAutopilotEvent object.|
|[List cartToClassAssociations](../api/devicemanagement-list-carttoclassassociations.md)|[cartToClassAssociation](../resources/carttoclassassociation.md) collection|Get the cartToClassAssociation resources from the cartToClassAssociations navigation property.|
|[Create cartToClassAssociation](../api/devicemanagement-post-carttoclassassociations.md)|[cartToClassAssociation](../resources/carttoclassassociation.md)|Create a new cartToClassAssociation object.|
|[List categories](../api/devicemanagement-list-categories.md)|[deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) collection|Get the deviceManagementSettingCategory resources from the categories navigation property.|
|[Create deviceManagementSettingCategory](../api/devicemanagement-post-categories.md)|[deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|Create a new deviceManagementSettingCategory object.|
|[List chromeOSOnboardingSettings](../api/devicemanagement-list-chromeosonboardingsettings.md)|[chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) collection|Get the chromeOSOnboardingSettings resources from the chromeOSOnboardingSettings navigation property.|
|[Create chromeOSOnboardingSettings](../api/devicemanagement-post-chromeosonboardingsettings.md)|[chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md)|Create a new chromeOSOnboardingSettings object.|
|[List comanagedDevices](../api/devicemanagement-list-comanageddevices.md)|[managedDevice](../resources/manageddevice.md) collection|Get the managedDevice resources from the comanagedDevices navigation property.|
|[Create managedDevice](../api/devicemanagement-post-comanageddevices.md)|[managedDevice](../resources/manageddevice.md)|Create a new managedDevice object.|
|[List comanagementEligibleDevices](../api/devicemanagement-list-comanagementeligibledevices.md)|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md) collection|Get the comanagementEligibleDevice resources from the comanagementEligibleDevices navigation property.|
|[Create comanagementEligibleDevice](../api/devicemanagement-post-comanagementeligibledevices.md)|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md)|Create a new comanagementEligibleDevice object.|
|[List configManagerCollections](../api/devicemanagement-list-configmanagercollections.md)|[configManagerCollection](../resources/configmanagercollection.md) collection|Get the configManagerCollection resources from the configManagerCollections navigation property.|
|[Create configManagerCollection](../api/devicemanagement-post-configmanagercollections.md)|[configManagerCollection](../resources/configmanagercollection.md)|Create a new configManagerCollection object.|
|[List configurationCategories](../api/devicemanagement-list-configurationcategories.md)|[deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md) collection|Get the deviceManagementConfigurationCategory resources from the configurationCategories navigation property.|
|[Create deviceManagementConfigurationCategory](../api/devicemanagement-post-configurationcategories.md)|[deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md)|Create a new deviceManagementConfigurationCategory object.|
|[List configurationPolicies](../api/devicemanagement-list-configurationpolicies.md)|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) collection|Get the deviceManagementConfigurationPolicy resources from the configurationPolicies navigation property.|
|[Create deviceManagementConfigurationPolicy](../api/devicemanagement-post-configurationpolicies.md)|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md)|Create a new deviceManagementConfigurationPolicy object.|
|[List configurationSettings](../api/devicemanagement-list-configurationsettings.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) collection|Get the deviceManagementConfigurationSettingDefinition resources from the configurationSettings navigation property.|
|[Create deviceManagementConfigurationSettingDefinition](../api/devicemanagement-post-configurationsettings.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|Create a new deviceManagementConfigurationSettingDefinition object.|
|[List dataSharingConsents](../api/devicemanagement-list-datasharingconsents.md)|[dataSharingConsent](../resources/datasharingconsent.md) collection|Get the dataSharingConsent resources from the dataSharingConsents navigation property.|
|[Create dataSharingConsent](../api/devicemanagement-post-datasharingconsents.md)|[dataSharingConsent](../resources/datasharingconsent.md)|Create a new dataSharingConsent object.|
|[List depOnboardingSettings](../api/devicemanagement-list-deponboardingsettings.md)|[depOnboardingSetting](../resources/deponboardingsetting.md) collection|Get the depOnboardingSetting resources from the depOnboardingSettings navigation property.|
|[Create depOnboardingSetting](../api/devicemanagement-post-deponboardingsettings.md)|[depOnboardingSetting](../resources/deponboardingsetting.md)|Create a new depOnboardingSetting object.|
|[List derivedCredentials](../api/devicemanagement-list-derivedcredentials.md)|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md) collection|Get the deviceManagementDerivedCredentialSettings resources from the derivedCredentials navigation property.|
|[Create deviceManagementDerivedCredentialSettings](../api/devicemanagement-post-derivedcredentials.md)|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md)|Create a new deviceManagementDerivedCredentialSettings object.|
|[List deviceComplianceScripts](../api/devicemanagement-list-devicecompliancescripts.md)|[deviceComplianceScript](../resources/devicecompliancescript.md) collection|Get the deviceComplianceScript resources from the deviceComplianceScripts navigation property.|
|[Create deviceComplianceScript](../api/devicemanagement-post-devicecompliancescripts.md)|[deviceComplianceScript](../resources/devicecompliancescript.md)|Create a new deviceComplianceScript object.|
|[List deviceConfigurationConflictSummary](../api/devicemanagement-list-deviceconfigurationconflictsummary.md)|[deviceConfigurationConflictSummary](../resources/deviceconfigurationconflictsummary.md) collection|Get the deviceConfigurationConflictSummary resources from the deviceConfigurationConflictSummary navigation property.|
|[Create deviceConfigurationConflictSummary](../api/devicemanagement-post-deviceconfigurationconflictsummary.md)|[deviceConfigurationConflictSummary](../resources/deviceconfigurationconflictsummary.md)|Create a new deviceConfigurationConflictSummary object.|
|[List deviceConfigurationRestrictedAppsViolations](../api/devicemanagement-list-deviceconfigurationrestrictedappsviolations.md)|[restrictedAppsViolation](../resources/restrictedappsviolation.md) collection|Get the restrictedAppsViolation resources from the deviceConfigurationRestrictedAppsViolations navigation property.|
|[Create restrictedAppsViolation](../api/devicemanagement-post-deviceconfigurationrestrictedappsviolations.md)|[restrictedAppsViolation](../resources/restrictedappsviolation.md)|Create a new restrictedAppsViolation object.|
|[List deviceConfigurationsAllManagedDeviceCertificateStates](../api/devicemanagement-list-deviceconfigurationsallmanageddevicecertificatestates.md)|[managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) collection|Get the managedAllDeviceCertificateState resources from the deviceConfigurationsAllManagedDeviceCertificateStates navigation property.|
|[Create managedAllDeviceCertificateState](../api/devicemanagement-post-deviceconfigurationsallmanageddevicecertificatestates.md)|[managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md)|Create a new managedAllDeviceCertificateState object.|
|[List deviceConfigurationUserStateSummary](../api/devicemanagement-list-deviceconfigurationuserstatesummaries.md)|[deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md) collection|Get the deviceConfigurationUserStateSummary resources from the deviceConfigurationUserStateSummaries navigation property.|
|[Create deviceConfigurationUserStateSummary](../api/devicemanagement-post-deviceconfigurationuserstatesummaries.md)|[deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md)|Create a new deviceConfigurationUserStateSummary object.|
|[List deviceCustomAttributeShellScripts](../api/devicemanagement-list-devicecustomattributeshellscripts.md)|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) collection|Get the deviceCustomAttributeShellScript resources from the deviceCustomAttributeShellScripts navigation property.|
|[Create deviceCustomAttributeShellScript](../api/devicemanagement-post-devicecustomattributeshellscripts.md)|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md)|Create a new deviceCustomAttributeShellScript object.|
|[List deviceHealthScripts](../api/devicemanagement-list-devicehealthscripts.md)|[deviceHealthScript](../resources/devicehealthscript.md) collection|Get the deviceHealthScript resources from the deviceHealthScripts navigation property.|
|[Create deviceHealthScript](../api/devicemanagement-post-devicehealthscripts.md)|[deviceHealthScript](../resources/devicehealthscript.md)|Create a new deviceHealthScript object.|
|[List deviceManagementScripts](../api/devicemanagement-list-devicemanagementscripts.md)|[deviceManagementScript](../resources/devicemanagementscript.md) collection|Get the deviceManagementScript resources from the deviceManagementScripts navigation property.|
|[Create deviceManagementScript](../api/devicemanagement-post-devicemanagementscripts.md)|[deviceManagementScript](../resources/devicemanagementscript.md)|Create a new deviceManagementScript object.|
|[List deviceShellScripts](../api/devicemanagement-list-deviceshellscripts.md)|[deviceShellScript](../resources/deviceshellscript.md) collection|Get the deviceShellScript resources from the deviceShellScripts navigation property.|
|[Create deviceShellScript](../api/devicemanagement-post-deviceshellscripts.md)|[deviceShellScript](../resources/deviceshellscript.md)|Create a new deviceShellScript object.|
|[List domainJoinConnectors](../api/devicemanagement-list-domainjoinconnectors.md)|[deviceManagementDomainJoinConnector](../resources/devicemanagementdomainjoinconnector.md) collection|Get the deviceManagementDomainJoinConnector resources from the domainJoinConnectors navigation property.|
|[Create deviceManagementDomainJoinConnector](../api/devicemanagement-post-domainjoinconnectors.md)|[deviceManagementDomainJoinConnector](../resources/devicemanagementdomainjoinconnector.md)|Create a new deviceManagementDomainJoinConnector object.|
|[List embeddedSIMActivationCodePools](../api/devicemanagement-list-embeddedsimactivationcodepools.md)|[embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) collection|Get the embeddedSIMActivationCodePool resources from the embeddedSIMActivationCodePools navigation property.|
|[Create embeddedSIMActivationCodePool](../api/devicemanagement-post-embeddedsimactivationcodepools.md)|[embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md)|Create a new embeddedSIMActivationCodePool object.|
|[List exchangeOnPremisesPolicies](../api/devicemanagement-list-exchangeonpremisespolicies.md)|[deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md) collection|Get the deviceManagementExchangeOnPremisesPolicy resources from the exchangeOnPremisesPolicies navigation property.|
|[Create deviceManagementExchangeOnPremisesPolicy](../api/devicemanagement-post-exchangeonpremisespolicies.md)|[deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md)|Create a new deviceManagementExchangeOnPremisesPolicy object.|
|[List deviceManagementExchangeOnPremisesPolicy](../api/devicemanagement-list-exchangeonpremisespolicy.md)|[deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md) collection|Get the deviceManagementExchangeOnPremisesPolicy resources from the exchangeOnPremisesPolicy navigation property.|
|[Create deviceManagementExchangeOnPremisesPolicy](../api/devicemanagement-post-exchangeonpremisespolicy.md)|[deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md)|Create a new deviceManagementExchangeOnPremisesPolicy object.|
|[List groupPolicyCategories](../api/devicemanagement-list-grouppolicycategories.md)|[groupPolicyCategory](../resources/grouppolicycategory.md) collection|Get the groupPolicyCategory resources from the groupPolicyCategories navigation property.|
|[Create groupPolicyCategory](../api/devicemanagement-post-grouppolicycategories.md)|[groupPolicyCategory](../resources/grouppolicycategory.md)|Create a new groupPolicyCategory object.|
|[List groupPolicyConfigurations](../api/devicemanagement-list-grouppolicyconfigurations.md)|[groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) collection|Get the groupPolicyConfiguration resources from the groupPolicyConfigurations navigation property.|
|[Create groupPolicyConfiguration](../api/devicemanagement-post-grouppolicyconfigurations.md)|[groupPolicyConfiguration](../resources/grouppolicyconfiguration.md)|Create a new groupPolicyConfiguration object.|
|[List groupPolicyDefinitionFiles](../api/devicemanagement-list-grouppolicydefinitionfiles.md)|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) collection|Get the groupPolicyDefinitionFile resources from the groupPolicyDefinitionFiles navigation property.|
|[Create groupPolicyDefinitionFile](../api/devicemanagement-post-grouppolicydefinitionfiles.md)|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md)|Create a new groupPolicyDefinitionFile object.|
|[List groupPolicyDefinitions](../api/devicemanagement-list-grouppolicydefinitions.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|Get the groupPolicyDefinition resources from the groupPolicyDefinitions navigation property.|
|[Create groupPolicyDefinition](../api/devicemanagement-post-grouppolicydefinitions.md)|[groupPolicyDefinition](../resources/grouppolicydefinition.md)|Create a new groupPolicyDefinition object.|
|[List groupPolicyMigrationReports](../api/devicemanagement-list-grouppolicymigrationreports.md)|[groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) collection|Get the groupPolicyMigrationReport resources from the groupPolicyMigrationReports navigation property.|
|[Create groupPolicyMigrationReport](../api/devicemanagement-post-grouppolicymigrationreports.md)|[groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md)|Create a new groupPolicyMigrationReport object.|
|[List groupPolicyObjectFiles](../api/devicemanagement-list-grouppolicyobjectfiles.md)|[groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) collection|Get the groupPolicyObjectFile resources from the groupPolicyObjectFiles navigation property.|
|[Create groupPolicyObjectFile](../api/devicemanagement-post-grouppolicyobjectfiles.md)|[groupPolicyObjectFile](../resources/grouppolicyobjectfile.md)|Create a new groupPolicyObjectFile object.|
|[List groupPolicyUploadedDefinitionFiles](../api/devicemanagement-list-grouppolicyuploadeddefinitionfiles.md)|[groupPolicyUploadedDefinitionFile](../resources/grouppolicyuploadeddefinitionfile.md) collection|Get the groupPolicyUploadedDefinitionFile resources from the groupPolicyUploadedDefinitionFiles navigation property.|
|[Create groupPolicyUploadedDefinitionFile](../api/devicemanagement-post-grouppolicyuploadeddefinitionfiles.md)|[groupPolicyUploadedDefinitionFile](../resources/grouppolicyuploadeddefinitionfile.md)|Create a new groupPolicyUploadedDefinitionFile object.|
|[List importedDeviceIdentities](../api/devicemanagement-list-importeddeviceidentities.md)|[importedDeviceIdentity](../resources/importeddeviceidentity.md) collection|Get the importedDeviceIdentity resources from the importedDeviceIdentities navigation property.|
|[Create importedDeviceIdentity](../api/devicemanagement-post-importeddeviceidentities.md)|[importedDeviceIdentity](../resources/importeddeviceidentity.md)|Create a new importedDeviceIdentity object.|
|[List importedWindowsAutopilotDeviceIdentities](../api/devicemanagement-list-importedwindowsautopilotdeviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) collection|Get the importedWindowsAutopilotDeviceIdentity resources from the importedWindowsAutopilotDeviceIdentities navigation property.|
|[Create importedWindowsAutopilotDeviceIdentity](../api/devicemanagement-post-importedwindowsautopilotdeviceidentities.md)|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md)|Create a new importedWindowsAutopilotDeviceIdentity object.|
|[List intents](../api/devicemanagement-list-intents.md)|[deviceManagementIntent](../resources/devicemanagementintent.md) collection|Get the deviceManagementIntent resources from the intents navigation property.|
|[Create deviceManagementIntent](../api/devicemanagement-post-intents.md)|[deviceManagementIntent](../resources/devicemanagementintent.md)|Create a new deviceManagementIntent object.|
|[List intuneBrandingProfiles](../api/devicemanagement-list-intunebrandingprofiles.md)|[intuneBrandingProfile](../resources/intunebrandingprofile.md) collection|Get the intuneBrandingProfile resources from the intuneBrandingProfiles navigation property.|
|[Create intuneBrandingProfile](../api/devicemanagement-post-intunebrandingprofiles.md)|[intuneBrandingProfile](../resources/intunebrandingprofile.md)|Create a new intuneBrandingProfile object.|
|[List macOSSoftwareUpdateAccountSummaries](../api/devicemanagement-list-macossoftwareupdateaccountsummaries.md)|[macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) collection|Get the macOSSoftwareUpdateAccountSummary resources from the macOSSoftwareUpdateAccountSummaries navigation property.|
|[Create macOSSoftwareUpdateAccountSummary](../api/devicemanagement-post-macossoftwareupdateaccountsummaries.md)|[macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md)|Create a new macOSSoftwareUpdateAccountSummary object.|
|[List managedDeviceEncryptionStates](../api/devicemanagement-list-manageddeviceencryptionstates.md)|[managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md) collection|Get the managedDeviceEncryptionState resources from the managedDeviceEncryptionStates navigation property.|
|[Create managedDeviceEncryptionState](../api/devicemanagement-post-manageddeviceencryptionstates.md)|[managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md)|Create a new managedDeviceEncryptionState object.|
|[List managementConditions](../api/devicemanagement-list-managementconditions.md)|[managementCondition](../resources/managementcondition.md) collection|Get the managementCondition resources from the managementConditions navigation property.|
|[Create managementCondition](../api/devicemanagement-post-managementconditions.md)|[managementCondition](../resources/managementcondition.md)|Create a new managementCondition object.|
|[List managementConditionStatements](../api/devicemanagement-list-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Create managementConditionStatement](../api/devicemanagement-post-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md)|Create a new managementConditionStatement object.|
|[List microsoftTunnelConfigurations](../api/devicemanagement-list-microsofttunnelconfigurations.md)|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) collection|Get the microsoftTunnelConfiguration resources from the microsoftTunnelConfigurations navigation property.|
|[Create microsoftTunnelConfiguration](../api/devicemanagement-post-microsofttunnelconfigurations.md)|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md)|Create a new microsoftTunnelConfiguration object.|
|[List microsoftTunnelHealthThresholds](../api/devicemanagement-list-microsofttunnelhealththresholds.md)|[microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) collection|Get the microsoftTunnelHealthThreshold resources from the microsoftTunnelHealthThresholds navigation property.|
|[Create microsoftTunnelHealthThreshold](../api/devicemanagement-post-microsofttunnelhealththresholds.md)|[microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md)|Create a new microsoftTunnelHealthThreshold object.|
|[List microsoftTunnelServerLogCollectionResponses](../api/devicemanagement-list-microsofttunnelserverlogcollectionresponses.md)|[microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) collection|Get the microsoftTunnelServerLogCollectionResponse resources from the microsoftTunnelServerLogCollectionResponses navigation property.|
|[Create microsoftTunnelServerLogCollectionResponse](../api/devicemanagement-post-microsofttunnelserverlogcollectionresponses.md)|[microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md)|Create a new microsoftTunnelServerLogCollectionResponse object.|
|[List microsoftTunnelSites](../api/devicemanagement-list-microsofttunnelsites.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md) collection|Get the microsoftTunnelSite resources from the microsoftTunnelSites navigation property.|
|[Create microsoftTunnelSite](../api/devicemanagement-post-microsofttunnelsites.md)|[microsoftTunnelSite](../resources/microsofttunnelsite.md)|Create a new microsoftTunnelSite object.|
|[List mobileAppTroubleshootingEvents](../api/devicemanagement-list-mobileapptroubleshootingevents.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) collection|Get the mobileAppTroubleshootingEvent resources from the mobileAppTroubleshootingEvents navigation property.|
|[Create mobileAppTroubleshootingEvent](../api/devicemanagement-post-mobileapptroubleshootingevents.md)|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md)|Create a new mobileAppTroubleshootingEvent object.|
|[List ndesConnectors](../api/devicemanagement-list-ndesconnectors.md)|[ndesConnector](../resources/ndesconnector.md) collection|Get the ndesConnector resources from the ndesConnectors navigation property.|
|[Create ndesConnector](../api/devicemanagement-post-ndesconnectors.md)|[ndesConnector](../resources/ndesconnector.md)|Create a new ndesConnector object.|
|[List remoteActionAudits](../api/devicemanagement-list-remoteactionaudits.md)|[remoteActionAudit](../resources/remoteactionaudit.md) collection|Get the remoteActionAudit resources from the remoteActionAudits navigation property.|
|[Create remoteActionAudit](../api/devicemanagement-post-remoteactionaudits.md)|[remoteActionAudit](../resources/remoteactionaudit.md)|Create a new remoteActionAudit object.|
|[List deviceManagementReports](../api/devicemanagement-list-reports.md)|[deviceManagementReports](../resources/devicemanagementreports.md) collection|Get the deviceManagementReports resources from the reports navigation property.|
|[Create deviceManagementReports](../api/devicemanagement-post-reports.md)|[deviceManagementReports](../resources/devicemanagementreports.md)|Create a new deviceManagementReports object.|
|[List resourceAccessProfiles](../api/devicemanagement-list-resourceaccessprofiles.md)|[deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) collection|Get the deviceManagementResourceAccessProfileBase resources from the resourceAccessProfiles navigation property.|
|[Create deviceManagementResourceAccessProfileBase](../api/devicemanagement-post-resourceaccessprofiles.md)|[deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|Create a new deviceManagementResourceAccessProfileBase object.|
|[List roleScopeTags](../api/devicemanagement-list-rolescopetags.md)|[roleScopeTag](../resources/rolescopetag.md) collection|Get the roleScopeTag resources from the roleScopeTags navigation property.|
|[Create roleScopeTag](../api/devicemanagement-post-rolescopetags.md)|[roleScopeTag](../resources/rolescopetag.md)|Create a new roleScopeTag object.|
|[List settingDefinitions](../api/devicemanagement-list-settingdefinitions.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|Get the deviceManagementSettingDefinition resources from the settingDefinitions navigation property.|
|[Create deviceManagementSettingDefinition](../api/devicemanagement-post-settingdefinitions.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|Create a new deviceManagementSettingDefinition object.|
|[List templates](../api/devicemanagement-list-templates.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md) collection|Get the deviceManagementTemplate resources from the templates navigation property.|
|[Create deviceManagementTemplate](../api/devicemanagement-post-templates.md)|[deviceManagementTemplate](../resources/devicemanagementtemplate.md)|Create a new deviceManagementTemplate object.|
|[List userExperienceAnalyticsAppHealthApplicationPerformance](../api/devicemanagement-list-userexperienceanalyticsapphealthapplicationperformance.md)|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/userexperienceanalyticsapphealthapplicationperformance.md) collection|Get the userExperienceAnalyticsAppHealthApplicationPerformance resources from the userExperienceAnalyticsAppHealthApplicationPerformance navigation property.|
|[Create userExperienceAnalyticsAppHealthApplicationPerformance](../api/devicemanagement-post-userexperienceanalyticsapphealthapplicationperformance.md)|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/userexperienceanalyticsapphealthapplicationperformance.md)|Create a new userExperienceAnalyticsAppHealthApplicationPerformance object.|
|[List userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion](../api/devicemanagement-list-userexperienceanalyticsapphealthapplicationperformancebyappversion.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) collection|Get the userExperienceAnalyticsAppHealthAppPerformanceByAppVersion resources from the userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion navigation property.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../api/devicemanagement-post-userexperienceanalyticsapphealthapplicationperformancebyappversion.md)|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md)|Create a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersion object.|
|[List userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion](../api/devicemanagement-list-userexperienceanalyticsapphealthapplicationperformancebyosversion.md)|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) collection|Get the userExperienceAnalyticsAppHealthAppPerformanceByOSVersion resources from the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion navigation property.|
|[Create userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../api/devicemanagement-post-userexperienceanalyticsapphealthapplicationperformancebyosversion.md)|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md)|Create a new userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object.|
|[List userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/devicemanagement-list-userexperienceanalyticsapphealthdevicemodelperformance.md)|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) collection|Get the userExperienceAnalyticsAppHealthDeviceModelPerformance resources from the userExperienceAnalyticsAppHealthDeviceModelPerformance navigation property.|
|[Create userExperienceAnalyticsAppHealthDeviceModelPerformance](../api/devicemanagement-post-userexperienceanalyticsapphealthdevicemodelperformance.md)|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md)|Create a new userExperienceAnalyticsAppHealthDeviceModelPerformance object.|
|[List userExperienceAnalyticsAppHealthDevicePerformance](../api/devicemanagement-list-userexperienceanalyticsapphealthdeviceperformance.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) collection|Get the userExperienceAnalyticsAppHealthDevicePerformance resources from the userExperienceAnalyticsAppHealthDevicePerformance navigation property.|
|[Create userExperienceAnalyticsAppHealthDevicePerformance](../api/devicemanagement-post-userexperienceanalyticsapphealthdeviceperformance.md)|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md)|Create a new userExperienceAnalyticsAppHealthDevicePerformance object.|
|[List userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/devicemanagement-list-userexperienceanalyticsapphealthdeviceperformancedetails.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) collection|Get the userExperienceAnalyticsAppHealthDevicePerformanceDetails resources from the userExperienceAnalyticsAppHealthDevicePerformanceDetails navigation property.|
|[Create userExperienceAnalyticsAppHealthDevicePerformanceDetails](../api/devicemanagement-post-userexperienceanalyticsapphealthdeviceperformancedetails.md)|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md)|Create a new userExperienceAnalyticsAppHealthDevicePerformanceDetails object.|
|[List userExperienceAnalyticsAppHealthOSVersionPerformance](../api/devicemanagement-list-userexperienceanalyticsapphealthosversionperformance.md)|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) collection|Get the userExperienceAnalyticsAppHealthOSVersionPerformance resources from the userExperienceAnalyticsAppHealthOSVersionPerformance navigation property.|
|[Create userExperienceAnalyticsAppHealthOSVersionPerformance](../api/devicemanagement-post-userexperienceanalyticsapphealthosversionperformance.md)|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md)|Create a new userExperienceAnalyticsAppHealthOSVersionPerformance object.|
|[List userExperienceAnalyticsCategory](../api/devicemanagement-list-userexperienceanalyticsapphealthoverview.md)|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md) collection|Get the userExperienceAnalyticsCategory resources from the userExperienceAnalyticsAppHealthOverview navigation property.|
|[Create userExperienceAnalyticsCategory](../api/devicemanagement-post-userexperienceanalyticsapphealthoverview.md)|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md)|Create a new userExperienceAnalyticsCategory object.|
|[List userExperienceAnalyticsBaselines](../api/devicemanagement-list-userexperienceanalyticsbaselines.md)|[userExperienceAnalyticsBaseline](../resources/userexperienceanalyticsbaseline.md) collection|Get the userExperienceAnalyticsBaseline resources from the userExperienceAnalyticsBaselines navigation property.|
|[Create userExperienceAnalyticsBaseline](../api/devicemanagement-post-userexperienceanalyticsbaselines.md)|[userExperienceAnalyticsBaseline](../resources/userexperienceanalyticsbaseline.md)|Create a new userExperienceAnalyticsBaseline object.|
|[List userExperienceAnalyticsCategories](../api/devicemanagement-list-userexperienceanalyticscategories.md)|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md) collection|Get the userExperienceAnalyticsCategory resources from the userExperienceAnalyticsCategories navigation property.|
|[Create userExperienceAnalyticsCategory](../api/devicemanagement-post-userexperienceanalyticscategories.md)|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md)|Create a new userExperienceAnalyticsCategory object.|
|[List userExperienceAnalyticsDeviceMetricHistory](../api/devicemanagement-list-userexperienceanalyticsdevicemetrichistory.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|Get the userExperienceAnalyticsMetricHistory resources from the userExperienceAnalyticsDeviceMetricHistory navigation property.|
|[Create userExperienceAnalyticsMetricHistory](../api/devicemanagement-post-userexperienceanalyticsdevicemetrichistory.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md)|Create a new userExperienceAnalyticsMetricHistory object.|
|[List userExperienceAnalyticsDevicePerformance](../api/devicemanagement-list-userexperienceanalyticsdeviceperformance.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) collection|Get the userExperienceAnalyticsDevicePerformance resources from the userExperienceAnalyticsDevicePerformance navigation property.|
|[Create userExperienceAnalyticsDevicePerformance](../api/devicemanagement-post-userexperienceanalyticsdeviceperformance.md)|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md)|Create a new userExperienceAnalyticsDevicePerformance object.|
|[List userExperienceAnalyticsDeviceStartupHistory](../api/devicemanagement-list-userexperienceanalyticsdevicestartuphistory.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) collection|Get the userExperienceAnalyticsDeviceStartupHistory resources from the userExperienceAnalyticsDeviceStartupHistory navigation property.|
|[Create userExperienceAnalyticsDeviceStartupHistory](../api/devicemanagement-post-userexperienceanalyticsdevicestartuphistory.md)|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md)|Create a new userExperienceAnalyticsDeviceStartupHistory object.|
|[List userExperienceAnalyticsDeviceStartupProcesses](../api/devicemanagement-list-userexperienceanalyticsdevicestartupprocesses.md)|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) collection|Get the userExperienceAnalyticsDeviceStartupProcess resources from the userExperienceAnalyticsDeviceStartupProcesses navigation property.|
|[Create userExperienceAnalyticsDeviceStartupProcess](../api/devicemanagement-post-userexperienceanalyticsdevicestartupprocesses.md)|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md)|Create a new userExperienceAnalyticsDeviceStartupProcess object.|
|[List userExperienceAnalyticsDeviceStartupProcessPerformance](../api/devicemanagement-list-userexperienceanalyticsdevicestartupprocessperformance.md)|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) collection|Get the userExperienceAnalyticsDeviceStartupProcessPerformance resources from the userExperienceAnalyticsDeviceStartupProcessPerformance navigation property.|
|[Create userExperienceAnalyticsDeviceStartupProcessPerformance](../api/devicemanagement-post-userexperienceanalyticsdevicestartupprocessperformance.md)|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md)|Create a new userExperienceAnalyticsDeviceStartupProcessPerformance object.|
|[List userExperienceAnalyticsDevicesWithoutCloudIdentity](../api/devicemanagement-list-userexperienceanalyticsdeviceswithoutcloudidentity.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) collection|Get the userExperienceAnalyticsDeviceWithoutCloudIdentity resources from the userExperienceAnalyticsDevicesWithoutCloudIdentity navigation property.|
|[Create userExperienceAnalyticsDeviceWithoutCloudIdentity](../api/devicemanagement-post-userexperienceanalyticsdeviceswithoutcloudidentity.md)|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md)|Create a new userExperienceAnalyticsDeviceWithoutCloudIdentity object.|
|[List userExperienceAnalyticsImpactingProcess](../api/devicemanagement-list-userexperienceanalyticsimpactingprocess.md)|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) collection|Get the userExperienceAnalyticsImpactingProcess resources from the userExperienceAnalyticsImpactingProcess navigation property.|
|[Create userExperienceAnalyticsImpactingProcess](../api/devicemanagement-post-userexperienceanalyticsimpactingprocess.md)|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md)|Create a new userExperienceAnalyticsImpactingProcess object.|
|[List userExperienceAnalyticsMetricHistory](../api/devicemanagement-list-userexperienceanalyticsmetrichistory.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|Get the userExperienceAnalyticsMetricHistory resources from the userExperienceAnalyticsMetricHistory navigation property.|
|[Create userExperienceAnalyticsMetricHistory](../api/devicemanagement-post-userexperienceanalyticsmetrichistory.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md)|Create a new userExperienceAnalyticsMetricHistory object.|
|[List userExperienceAnalyticsNotAutopilotReadyDevice](../api/devicemanagement-list-userexperienceanalyticsnotautopilotreadydevice.md)|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) collection|Get the userExperienceAnalyticsNotAutopilotReadyDevice resources from the userExperienceAnalyticsNotAutopilotReadyDevice navigation property.|
|[Create userExperienceAnalyticsNotAutopilotReadyDevice](../api/devicemanagement-post-userexperienceanalyticsnotautopilotreadydevice.md)|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md)|Create a new userExperienceAnalyticsNotAutopilotReadyDevice object.|
|[List userExperienceAnalyticsOverview](../api/devicemanagement-list-userexperienceanalyticsoverview.md)|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md) collection|Get the userExperienceAnalyticsOverview resources from the userExperienceAnalyticsOverview navigation property.|
|[Create userExperienceAnalyticsOverview](../api/devicemanagement-post-userexperienceanalyticsoverview.md)|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md)|Create a new userExperienceAnalyticsOverview object.|
|[List userExperienceAnalyticsRegressionSummary](../api/devicemanagement-list-userexperienceanalyticsregressionsummary.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md) collection|Get the userExperienceAnalyticsRegressionSummary resources from the userExperienceAnalyticsRegressionSummary navigation property.|
|[Create userExperienceAnalyticsRegressionSummary](../api/devicemanagement-post-userexperienceanalyticsregressionsummary.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md)|Create a new userExperienceAnalyticsRegressionSummary object.|
|[List userExperienceAnalyticsRemoteConnection](../api/devicemanagement-list-userexperienceanalyticsremoteconnection.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) collection|Get the userExperienceAnalyticsRemoteConnection resources from the userExperienceAnalyticsRemoteConnection navigation property.|
|[Create userExperienceAnalyticsRemoteConnection](../api/devicemanagement-post-userexperienceanalyticsremoteconnection.md)|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md)|Create a new userExperienceAnalyticsRemoteConnection object.|
|[List userExperienceAnalyticsResourcePerformance](../api/devicemanagement-list-userexperienceanalyticsresourceperformance.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) collection|Get the userExperienceAnalyticsResourcePerformance resources from the userExperienceAnalyticsResourcePerformance navigation property.|
|[Create userExperienceAnalyticsResourcePerformance](../api/devicemanagement-post-userexperienceanalyticsresourceperformance.md)|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md)|Create a new userExperienceAnalyticsResourcePerformance object.|
|[List userExperienceAnalyticsScoreHistory](../api/devicemanagement-list-userexperienceanalyticsscorehistory.md)|[userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) collection|Get the userExperienceAnalyticsScoreHistory resources from the userExperienceAnalyticsScoreHistory navigation property.|
|[Create userExperienceAnalyticsScoreHistory](../api/devicemanagement-post-userexperienceanalyticsscorehistory.md)|[userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md)|Create a new userExperienceAnalyticsScoreHistory object.|
|[List userPfxCertificates](../api/devicemanagement-list-userpfxcertificates.md)|[userPFXCertificate](../resources/userpfxcertificate.md) collection|Get the userPFXCertificate resources from the userPfxCertificates navigation property.|
|[Create userPFXCertificate](../api/devicemanagement-post-userpfxcertificates.md)|[userPFXCertificate](../resources/userpfxcertificate.md)|Create a new userPFXCertificate object.|
|[List virtualEndpoint](../api/devicemanagement-list-virtualendpoint.md)|[virtualEndpoint](../resources/virtualendpoint.md) collection|Get the virtualEndpoint resources from the virtualEndpoint navigation property.|
|[Create virtualEndpoint](../api/devicemanagement-post-virtualendpoint.md)|[virtualEndpoint](../resources/virtualendpoint.md)|Create a new virtualEndpoint object.|
|[List windowsAutopilotDeploymentProfiles](../api/devicemanagement-list-windowsautopilotdeploymentprofiles.md)|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md) collection|Get the windowsAutopilotDeploymentProfile resources from the windowsAutopilotDeploymentProfiles navigation property.|
|[Create windowsAutopilotDeploymentProfile](../api/devicemanagement-post-windowsautopilotdeploymentprofiles.md)|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md)|Create a new windowsAutopilotDeploymentProfile object.|
|[List windowsAutopilotDeviceIdentities](../api/devicemanagement-list-windowsautopilotdeviceidentities.md)|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) collection|Get the windowsAutopilotDeviceIdentity resources from the windowsAutopilotDeviceIdentities navigation property.|
|[Create windowsAutopilotDeviceIdentity](../api/devicemanagement-post-windowsautopilotdeviceidentities.md)|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md)|Create a new windowsAutopilotDeviceIdentity object.|
|[List windowsAutopilotSettings](../api/devicemanagement-list-windowsautopilotsettings.md)|[windowsAutopilotSettings](../resources/windowsautopilotsettings.md) collection|Get the windowsAutopilotSettings resources from the windowsAutopilotSettings navigation property.|
|[Create windowsAutopilotSettings](../api/devicemanagement-post-windowsautopilotsettings.md)|[windowsAutopilotSettings](../resources/windowsautopilotsettings.md)|Create a new windowsAutopilotSettings object.|
|[List windowsFeatureUpdateProfiles](../api/devicemanagement-list-windowsfeatureupdateprofiles.md)|[windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) collection|Get the windowsFeatureUpdateProfile resources from the windowsFeatureUpdateProfiles navigation property.|
|[Create windowsFeatureUpdateProfile](../api/devicemanagement-post-windowsfeatureupdateprofiles.md)|[windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md)|Create a new windowsFeatureUpdateProfile object.|
|[List windowsMalwareInformation](../api/devicemanagement-list-windowsmalwareinformation.md)|[windowsMalwareInformation](../resources/windowsmalwareinformation.md) collection|Get the windowsMalwareInformation resources from the windowsMalwareInformation navigation property.|
|[Create windowsMalwareInformation](../api/devicemanagement-post-windowsmalwareinformation.md)|[windowsMalwareInformation](../resources/windowsmalwareinformation.md)|Create a new windowsMalwareInformation object.|
|[List windowsQualityUpdateProfiles](../api/devicemanagement-list-windowsqualityupdateprofiles.md)|[windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) collection|Get the windowsQualityUpdateProfile resources from the windowsQualityUpdateProfiles navigation property.|
|[Create windowsQualityUpdateProfile](../api/devicemanagement-post-windowsqualityupdateprofiles.md)|[windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md)|Create a new windowsQualityUpdateProfile object.|
|[List windowsUpdateCatalogItems](../api/devicemanagement-list-windowsupdatecatalogitems.md)|[windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) collection|Get the windowsUpdateCatalogItem resources from the windowsUpdateCatalogItems navigation property.|
|[Create windowsUpdateCatalogItem](../api/devicemanagement-post-windowsupdatecatalogitems.md)|[windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md)|Create a new windowsUpdateCatalogItem object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountMoveCompletionDateTime|DateTimeOffset|The date & time when tenant data moved between scaleunits.|
|adminConsent|[adminConsent](../resources/adminconsent.md)|Admin consent information.|
|deviceComplianceReportSummarizationDateTime|DateTimeOffset|The last requested time of device compliance reporting for this account. This property is read-only.|
|deviceProtectionOverview|[deviceProtectionOverview](../resources/deviceprotectionoverview.md)|Device protection overview.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intuneAccountId|Guid|Intune Account Id for given tenant|
|intuneBrand|[intuneBrand](../resources/intunebrand.md)|intuneBrand contains data which is used in customizing the appearance of the Company Portal applications as well as the end user web portal.|
|lastReportAggregationDateTime|DateTimeOffset|The last modified time of reporting for this account. This property is read-only.|
|legacyPcManangementEnabled|Boolean|The property to enable Non-MDM managed legacy PC management for this account. This property is read-only.|
|managedDeviceCleanupSettings|[managedDeviceCleanupSettings](../resources/manageddevicecleanupsettings.md)|Device cleanup rule|
|maximumDepTokens|Int32|Maximum number of dep tokens allowed per-tenant.|
|settings|[deviceManagementSettings](../resources/devicemanagementsettings.md)|Account level settings.|
|subscriptions|deviceManagementSubscriptions|Tenant's Subscription. Possible values are: `none`, `intune`, `office365`, `intunePremium`, `intune_EDU`, `intune_SMB`.|
|subscriptionState|deviceManagementSubscriptionState|Tenant mobile device management subscription state. Possible values are: `pending`, `active`, `warning`, `disabled`, `deleted`, `blocked`, `lockedOut`.|
|unlicensedAdminstratorsEnabled|Boolean|When enabled, users assigned as administrators via Role Assignment Memberships do not require an assigned Intune license. Prior to this, only Intune licensed users were granted permissions with an Intune role unless they were assigned a role via Azure Active Directory. You are limited to 350 unlicensed direct members for each AAD security group in a role assignment, but you can assign multiple AAD security groups to a role if you need to support more than 350 unlicensed administrators. Licensed administrators are unaffected, do not have to be direct members, nor does the 350 member limit apply. This property is read-only.|
|userExperienceAnalyticsSettings|[userExperienceAnalyticsSettings](../resources/userexperienceanalyticssettings.md)|User experience analytics device settings|
|windowsMalwareOverview|[windowsMalwareOverview](../resources/windowsmalwareoverview.md)|Malware overview for windows devices.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|advancedThreatProtectionOnboardingStateSummary|[advancedThreatProtectionOnboardingStateSummary](../resources/advancedthreatprotectiononboardingstatesummary.md)|The summary state of ATP onboarding state for this account.|
|androidDeviceOwnerEnrollmentProfiles|[androidDeviceOwnerEnrollmentProfile](../resources/androiddeviceownerenrollmentprofile.md) collection|Android device owner enrollment profile entities.|
|androidForWorkAppConfigurationSchemas|[androidForWorkAppConfigurationSchema](../resources/androidforworkappconfigurationschema.md) collection|Android for Work app configuration schema entities.|
|androidForWorkEnrollmentProfiles|[androidForWorkEnrollmentProfile](../resources/androidforworkenrollmentprofile.md) collection|Android for Work enrollment profile entities.|
|androidForWorkSettings|[androidForWorkSettings](../resources/androidforworksettings.md)|The singleton Android for Work settings entity.|
|androidManagedStoreAccountEnterpriseSettings|[androidManagedStoreAccountEnterpriseSettings](../resources/androidmanagedstoreaccountenterprisesettings.md)|The singleton Android managed store account enterprise settings entity.|
|androidManagedStoreAppConfigurationSchemas|[androidManagedStoreAppConfigurationSchema](../resources/androidmanagedstoreappconfigurationschema.md) collection|Android Enterprise app configuration schema entities.|
|applePushNotificationCertificate|[applePushNotificationCertificate](../resources/applepushnotificationcertificate.md)|Apple push notification certificate.|
|appleUserInitiatedEnrollmentProfiles|[appleUserInitiatedEnrollmentProfile](../resources/appleuserinitiatedenrollmentprofile.md) collection|Apple user initiated enrollment profiles|
|assignmentFilters|[deviceAndAppManagementAssignmentFilter](../resources/deviceandappmanagementassignmentfilter.md) collection|The list of assignment filters|
|auditEvents|[auditEvent](../resources/auditevent.md) collection|The Audit Events|
|autopilotEvents|[deviceManagementAutopilotEvent](../resources/devicemanagementautopilotevent.md) collection|The list of autopilot events for the tenant.|
|cartToClassAssociations|[cartToClassAssociation](../resources/carttoclassassociation.md) collection|The Cart To Class Associations.|
|categories|[deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) collection|The available categories|
|chromeOSOnboardingSettings|[chromeOSOnboardingSettings](../resources/chromeosonboardingsettings.md) collection|Collection of ChromeOSOnboardingSettings settings associated with account.|
|comanagedDevices|[managedDevice](../resources/manageddevice.md) collection|The list of co-managed devices report|
|comanagementEligibleDevices|[comanagementEligibleDevice](../resources/comanagementeligibledevice.md) collection|The list of co-management eligible devices report|
|complianceManagementPartners|[complianceManagementPartner](../resources/compliancemanagementpartner.md) collection|The list of Compliance Management Partners configured by the tenant.|
|conditionalAccessSettings|[onPremisesConditionalAccessSettings](../resources/onpremisesconditionalaccesssettings.md)|The Exchange on premises conditional access settings. On premises conditional access will require devices to be both enrolled and compliant for mail access|
|configManagerCollections|[configManagerCollection](../resources/configmanagercollection.md) collection|A list of ConfigManagerCollection|
|configurationCategories|[deviceManagementConfigurationCategory](../resources/devicemanagementconfigurationcategory.md) collection|List of all Configuration Categories|
|configurationPolicies|[deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) collection|List of all Configuration policies|
|configurationSettings|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) collection|List of all ConfigurationSettings|
|dataSharingConsents|[dataSharingConsent](../resources/datasharingconsent.md) collection|Data sharing consents.|
|depOnboardingSettings|[depOnboardingSetting](../resources/deponboardingsetting.md) collection|This collections of multiple DEP tokens per-tenant.|
|derivedCredentials|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md) collection|Collection of Derived credential settings associated with account.|
|detectedApps|[detectedApp](../resources/detectedapp.md) collection|The list of detected apps associated with a device.|
|deviceCategories|[deviceCategory](../resources/devicecategory.md) collection|The list of device categories with the tenant.|
|deviceCompliancePolicies|[deviceCompliancePolicy](../resources/devicecompliancepolicy.md) collection|The device compliance policies.|
|deviceCompliancePolicyDeviceStateSummary|[deviceCompliancePolicyDeviceStateSummary](../resources/devicecompliancepolicydevicestatesummary.md)|The device compliance state summary for this account.|
|deviceCompliancePolicySettingStateSummaries|[deviceCompliancePolicySettingStateSummary](../resources/devicecompliancepolicysettingstatesummary.md) collection|The summary states of compliance policy settings for this account.|
|deviceComplianceScripts|[deviceComplianceScript](../resources/devicecompliancescript.md) collection|The list of device compliance scripts associated with the tenant.|
|deviceConfigurationConflictSummary|[deviceConfigurationConflictSummary](../resources/deviceconfigurationconflictsummary.md) collection|Summary of policies in conflict state for this account.|
|deviceConfigurationDeviceStateSummaries|[deviceConfigurationDeviceStateSummary](../resources/deviceconfigurationdevicestatesummary.md)|The device configuration device state summary for this account.|
|deviceConfigurationRestrictedAppsViolations|[restrictedAppsViolation](../resources/restrictedappsviolation.md) collection|Restricted apps violations for this account.|
|deviceConfigurations|[deviceConfiguration](../resources/deviceconfiguration.md) collection|The device configurations.|
|deviceConfigurationsAllManagedDeviceCertificateStates|[managedAllDeviceCertificateState](../resources/managedalldevicecertificatestate.md) collection|Summary of all certificates for all devices.|
|deviceConfigurationUserStateSummaries|[deviceConfigurationUserStateSummary](../resources/deviceconfigurationuserstatesummary.md)|The device configuration user state summary for this account.|
|deviceCustomAttributeShellScripts|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) collection|The list of device custom attribute shell scripts associated with the tenant.|
|deviceEnrollmentConfigurations|[deviceEnrollmentConfiguration](../resources/deviceenrollmentconfiguration.md) collection|The list of device enrollment configurations|
|deviceHealthScripts|[deviceHealthScript](../resources/devicehealthscript.md) collection|The list of device health scripts associated with the tenant.|
|deviceManagementPartners|[deviceManagementPartner](../resources/devicemanagementpartner.md) collection|The list of Device Management Partners configured by the tenant.|
|deviceManagementScripts|[deviceManagementScript](../resources/devicemanagementscript.md) collection|The list of device management scripts associated with the tenant.|
|deviceShellScripts|[deviceShellScript](../resources/deviceshellscript.md) collection|The list of device shell scripts associated with the tenant.|
|domainJoinConnectors|[deviceManagementDomainJoinConnector](../resources/devicemanagementdomainjoinconnector.md) collection|A list of connector objects.|
|embeddedSIMActivationCodePools|[embeddedSIMActivationCodePool](../resources/embeddedsimactivationcodepool.md) collection|The embedded SIM activation code pools created by this account.|
|exchangeConnectors|[deviceManagementExchangeConnector](../resources/devicemanagementexchangeconnector.md) collection|The list of Exchange Connectors configured by the tenant.|
|exchangeOnPremisesPolicies|[deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md) collection|The list of Exchange On Premisis policies configured by the tenant.|
|exchangeOnPremisesPolicy|[deviceManagementExchangeOnPremisesPolicy](../resources/devicemanagementexchangeonpremisespolicy.md)|The policy which controls mobile device access to Exchange On Premises|
|groupPolicyCategories|[groupPolicyCategory](../resources/grouppolicycategory.md) collection|The available group policy categories for this account.|
|groupPolicyConfigurations|[groupPolicyConfiguration](../resources/grouppolicyconfiguration.md) collection|The group policy configurations created by this account.|
|groupPolicyDefinitionFiles|[groupPolicyDefinitionFile](../resources/grouppolicydefinitionfile.md) collection|The available group policy definition files for this account.|
|groupPolicyDefinitions|[groupPolicyDefinition](../resources/grouppolicydefinition.md) collection|The available group policy definitions for this account.|
|groupPolicyMigrationReports|[groupPolicyMigrationReport](../resources/grouppolicymigrationreport.md) collection|A list of Group Policy migration reports.|
|groupPolicyObjectFiles|[groupPolicyObjectFile](../resources/grouppolicyobjectfile.md) collection|A list of Group Policy Object files uploaded.|
|groupPolicyUploadedDefinitionFiles|[groupPolicyUploadedDefinitionFile](../resources/grouppolicyuploadeddefinitionfile.md) collection|The available group policy uploaded definition files for this account.|
|importedDeviceIdentities|[importedDeviceIdentity](../resources/importeddeviceidentity.md) collection|The imported device identities.|
|importedWindowsAutopilotDeviceIdentities|[importedWindowsAutopilotDeviceIdentity](../resources/importedwindowsautopilotdeviceidentity.md) collection|Collection of imported Windows autopilot devices.|
|intents|[deviceManagementIntent](../resources/devicemanagementintent.md) collection|The device management intents|
|intuneBrandingProfiles|[intuneBrandingProfile](../resources/intunebrandingprofile.md) collection|Intune branding profiles targeted to AAD groups|
|iosUpdateStatuses|[iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) collection|The IOS software update installation statuses for this account.|
|macOSSoftwareUpdateAccountSummaries|[macOSSoftwareUpdateAccountSummary](../resources/macossoftwareupdateaccountsummary.md) collection|The MacOS software update account summaries for this account.|
|managedDeviceEncryptionStates|[managedDeviceEncryptionState](../resources/manageddeviceencryptionstate.md) collection|Encryption report for devices in this account|
|managedDeviceOverview|[managedDeviceOverview](../resources/manageddeviceoverview.md)|Device overview|
|managedDevices|[managedDevice](../resources/manageddevice.md) collection|The list of managed devices.|
|managementConditions|[managementCondition](../resources/managementcondition.md) collection|The management conditions associated with device management of the company.|
|managementConditionStatements|[managementConditionStatement](../resources/managementconditionstatement.md) collection|The management condition statements associated with device management of the company.|
|microsoftTunnelConfigurations|[microsoftTunnelConfiguration](../resources/microsofttunnelconfiguration.md) collection|Collection of MicrosoftTunnelConfiguration settings associated with account.|
|microsoftTunnelHealthThresholds|[microsoftTunnelHealthThreshold](../resources/microsofttunnelhealththreshold.md) collection|Collection of MicrosoftTunnelHealthThreshold settings associated with account.|
|microsoftTunnelServerLogCollectionResponses|[microsoftTunnelServerLogCollectionResponse](../resources/microsofttunnelserverlogcollectionresponse.md) collection|Collection of MicrosoftTunnelServerLogCollectionResponse settings associated with account.|
|microsoftTunnelSites|[microsoftTunnelSite](../resources/microsofttunnelsite.md) collection|Collection of MicrosoftTunnelSite settings associated with account.|
|mobileAppTroubleshootingEvents|[mobileAppTroubleshootingEvent](../resources/mobileapptroubleshootingevent.md) collection|The collection property of MobileAppTroubleshootingEvent.|
|mobileThreatDefenseConnectors|[mobileThreatDefenseConnector](../resources/mobilethreatdefenseconnector.md) collection|The list of Mobile threat Defense connectors configured by the tenant.|
|ndesConnectors|[ndesConnector](../resources/ndesconnector.md) collection|The collection of Ndes connectors for this account.|
|notificationMessageTemplates|[notificationMessageTemplate](../resources/notificationmessagetemplate.md) collection|The Notification Message Templates.|
|remoteActionAudits|[remoteActionAudit](../resources/remoteactionaudit.md) collection|The list of device remote action audits with the tenant.|
|remoteAssistancePartners|[remoteAssistancePartner](../resources/remoteassistancepartner.md) collection|The remote assist partners.|
|reports|[deviceManagementReports](../resources/devicemanagementreports.md)|Reports singleton|
|resourceAccessProfiles|[deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md) collection|Collection of resource access settings associated with account.|
|resourceOperations|[resourceOperation](../resources/resourceoperation.md) collection|The Resource Operations.|
|roleAssignments|[deviceAndAppManagementRoleAssignment](../resources/deviceandappmanagementroleassignment.md) collection|The Role Assignments.|
|roleDefinitions|[roleDefinition](../resources/roledefinition.md) collection|The Role Definitions.|
|roleScopeTags|[roleScopeTag](../resources/rolescopetag.md) collection|The Role Scope Tags.|
|settingDefinitions|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|The device management intent setting definitions|
|softwareUpdateStatusSummary|[softwareUpdateStatusSummary](../resources/softwareupdatestatussummary.md)|The software update status summary.|
|telecomExpenseManagementPartners|[telecomExpenseManagementPartner](../resources/telecomexpensemanagementpartner.md) collection|The telecom expense management partners.|
|templates|[deviceManagementTemplate](../resources/devicemanagementtemplate.md) collection|The available templates|
|termsAndConditions|[termsAndConditions](../resources/termsandconditions.md) collection|The terms and conditions associated with device management of the company.|
|troubleshootingEvents|[deviceManagementTroubleshootingEvent](../resources/devicemanagementtroubleshootingevent.md) collection|The list of troubleshooting events for the tenant.|
|userExperienceAnalyticsAppHealthApplicationPerformance|[userExperienceAnalyticsAppHealthApplicationPerformance](../resources/userexperienceanalyticsapphealthapplicationperformance.md) collection|User experience analytics appHealth Application Performance|
|userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion|[userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) collection|User experience analytics appHealth Application Performance by App Version|
|userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion|[userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) collection|User experience analytics appHealth Application Performance by OS Version|
|userExperienceAnalyticsAppHealthDeviceModelPerformance|[userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) collection|User experience analytics appHealth Model Performance|
|userExperienceAnalyticsAppHealthDevicePerformance|[userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) collection|User experience analytics appHealth Device Performance|
|userExperienceAnalyticsAppHealthDevicePerformanceDetails|[userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) collection|User experience analytics device performance details|
|userExperienceAnalyticsAppHealthOSVersionPerformance|[userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) collection|User experience analytics appHealth OS version Performance|
|userExperienceAnalyticsAppHealthOverview|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md)|User experience analytics appHealth overview|
|userExperienceAnalyticsBaselines|[userExperienceAnalyticsBaseline](../resources/userexperienceanalyticsbaseline.md) collection|User experience analytics baselines|
|userExperienceAnalyticsCategories|[userExperienceAnalyticsCategory](../resources/userexperienceanalyticscategory.md) collection|User experience analytics categories|
|userExperienceAnalyticsDeviceMetricHistory|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|User experience analytics device metric history|
|userExperienceAnalyticsDevicePerformance|[userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) collection|User experience analytics device performance|
|userExperienceAnalyticsDeviceStartupHistory|[userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) collection|User experience analytics device Startup History|
|userExperienceAnalyticsDeviceStartupProcesses|[userExperienceAnalyticsDeviceStartupProcess](../resources/userexperienceanalyticsdevicestartupprocess.md) collection|User experience analytics device Startup Processes|
|userExperienceAnalyticsDeviceStartupProcessPerformance|[userExperienceAnalyticsDeviceStartupProcessPerformance](../resources/userexperienceanalyticsdevicestartupprocessperformance.md) collection|User experience analytics device Startup Process Performance|
|userExperienceAnalyticsDevicesWithoutCloudIdentity|[userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) collection|User experience analytics devices without cloud identity.|
|userExperienceAnalyticsImpactingProcess|[userExperienceAnalyticsImpactingProcess](../resources/userexperienceanalyticsimpactingprocess.md) collection|User experience analytics impacting process|
|userExperienceAnalyticsMetricHistory|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|User experience analytics metric history|
|userExperienceAnalyticsNotAutopilotReadyDevice|[userExperienceAnalyticsNotAutopilotReadyDevice](../resources/userexperienceanalyticsnotautopilotreadydevice.md) collection|User experience analytics devices not Windows Autopilot ready.|
|userExperienceAnalyticsOverview|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md)|User experience analytics overview|
|userExperienceAnalyticsRegressionSummary|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md)|User experience analytics regression summary|
|userExperienceAnalyticsRemoteConnection|[userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) collection|User experience analytics remote connection|
|userExperienceAnalyticsResourcePerformance|[userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) collection|User experience analytics resource performance|
|userExperienceAnalyticsScoreHistory|[userExperienceAnalyticsScoreHistory](../resources/userexperienceanalyticsscorehistory.md) collection|User experience analytics device Startup Score History|
|userPfxCertificates|[userPFXCertificate](../resources/userpfxcertificate.md) collection|Collection of PFX certificates associated with a user.|
|virtualEndpoint|[virtualEndpoint](../resources/virtualendpoint.md)|**TODO: Add Description**|
|windowsAutopilotDeploymentProfiles|[windowsAutopilotDeploymentProfile](../resources/windowsautopilotdeploymentprofile.md) collection|Windows auto pilot deployment profiles|
|windowsAutopilotDeviceIdentities|[windowsAutopilotDeviceIdentity](../resources/windowsautopilotdeviceidentity.md) collection|The Windows autopilot device identities contained collection.|
|windowsAutopilotSettings|[windowsAutopilotSettings](../resources/windowsautopilotsettings.md)|The Windows autopilot account settings.|
|windowsFeatureUpdateProfiles|[windowsFeatureUpdateProfile](../resources/windowsfeatureupdateprofile.md) collection|A collection of windows feature update profiles|
|windowsInformationProtectionAppLearningSummaries|[windowsInformationProtectionAppLearningSummary](../resources/windowsinformationprotectionapplearningsummary.md) collection|The windows information protection app learning summaries.|
|windowsInformationProtectionNetworkLearningSummaries|[windowsInformationProtectionNetworkLearningSummary](../resources/windowsinformationprotectionnetworklearningsummary.md) collection|The windows information protection network learning summaries.|
|windowsMalwareInformation|[windowsMalwareInformation](../resources/windowsmalwareinformation.md) collection|The list of affected malware in the tenant.|
|windowsQualityUpdateProfiles|[windowsQualityUpdateProfile](../resources/windowsqualityupdateprofile.md) collection|A collection of windows quality update profiles|
|windowsUpdateCatalogItems|[windowsUpdateCatalogItem](../resources/windowsupdatecatalogitem.md) collection|A collection of windows update catalog items (fetaure updates item , quality updates item)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagement",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "String (identifier)",
  "accountMoveCompletionDateTime": "String (timestamp)",
  "adminConsent": {
    "@odata.type": "microsoft.graph.adminConsent"
  },
  "deviceComplianceReportSummarizationDateTime": "String (timestamp)",
  "deviceProtectionOverview": {
    "@odata.type": "microsoft.graph.deviceProtectionOverview"
  },
  "intuneAccountId": "Guid",
  "intuneBrand": {
    "@odata.type": "microsoft.graph.intuneBrand"
  },
  "lastReportAggregationDateTime": "String (timestamp)",
  "legacyPcManangementEnabled": "Boolean",
  "managedDeviceCleanupSettings": {
    "@odata.type": "microsoft.graph.managedDeviceCleanupSettings"
  },
  "maximumDepTokens": "Integer",
  "settings": {
    "@odata.type": "microsoft.graph.deviceManagementSettings"
  },
  "subscriptions": "String",
  "subscriptionState": "String",
  "unlicensedAdminstratorsEnabled": "Boolean",
  "userExperienceAnalyticsSettings": {
    "@odata.type": "microsoft.graph.userExperienceAnalyticsSettings"
  },
  "windowsMalwareOverview": {
    "@odata.type": "microsoft.graph.windowsMalwareOverview"
  }
}
```

