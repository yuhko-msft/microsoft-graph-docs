---
title: "macOSEndpointProtectionConfiguration resource type"
description: "MacOS endpoint protection configuration profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSEndpointProtectionConfiguration resource type

Namespace: microsoft.graph



MacOS endpoint protection configuration profile.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSEndpointProtectionConfigurations](../api/macosendpointprotectionconfiguration-list.md)|[macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) collection|Get a list of the [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) objects and their properties.|
|[Create macOSEndpointProtectionConfiguration](../api/macosendpointprotectionconfiguration-create.md)|[macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md)|Create a new [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.|
|[Get macOSEndpointProtectionConfiguration](../api/macosendpointprotectionconfiguration-get.md)|[macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md)|Read the properties and relationships of a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.|
|[Update macOSEndpointProtectionConfiguration](../api/macosendpointprotectionconfiguration-update.md)|[macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md)|Update the properties of a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.|
|[Delete macOSEndpointProtectionConfiguration](../api/macosendpointprotectionconfiguration-delete.md)|None|Deletes a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.|
|[assign](../api/macosendpointprotectionconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/macosendpointprotectionconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/macosendpointprotectionconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/macosendpointprotectionconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/macosendpointprotectionconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/macosendpointprotectionconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/macosendpointprotectionconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/macosendpointprotectionconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/macosendpointprotectionconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/macosendpointprotectionconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/macosendpointprotectionconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/macosendpointprotectionconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/macosendpointprotectionconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/macosendpointprotectionconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/macosendpointprotectionconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/macosendpointprotectionconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/macosendpointprotectionconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedThreatProtectionAutomaticSampleSubmission|enablement|Determines whether or not to enable automatic file sample submission for Microsoft Defender Advanced Threat Protection on macOS. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionCloudDelivered|enablement|Determines whether or not to enable cloud-delivered protection for Microsoft Defender Advanced Threat Protection on macOS. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionDiagnosticDataCollection|enablement|Determines whether or not to enable diagnostic and usage data collection for Microsoft Defender Advanced Threat Protection on macOS. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionExcludedExtensions|String collection|A list of file extensions to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.|
|advancedThreatProtectionExcludedFiles|String collection|A list of paths to files to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.|
|advancedThreatProtectionExcludedFolders|String collection|A list of paths to folders to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.|
|advancedThreatProtectionExcludedProcesses|String collection|A list of process names to exclude from antivirus scanning for Microsoft Defender Advanced Threat Protection on macOS.|
|advancedThreatProtectionRealTime|enablement|Determines whether or not to enable real-time protection for Microsoft Defender Advanced Threat Protection on macOS. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|fileVaultAllowDeferralUntilSignOut|Boolean|Optional. If set to true, the user can defer the enabling of FileVault until they sign out.|
|fileVaultDisablePromptAtSignOut|Boolean|Optional. When using the Defer option, if set to true, the user is not prompted to enable FileVault at sign-out.|
|fileVaultEnabled|Boolean|Whether FileVault should be enabled or not.|
|fileVaultHidePersonalRecoveryKey|Boolean|Optional. A hidden personal recovery key does not appear on the user's screen during FileVault encryption, reducing the risk of it ending up in the wrong hands.|
|fileVaultInstitutionalRecoveryKeyCertificate|Binary|Required if selected recovery key type(s) include InstitutionalRecoveryKey. The DER Encoded certificate file used to set an institutional recovery key.|
|fileVaultInstitutionalRecoveryKeyCertificateFileName|String|File name of the institutional recovery key certificate to display in UI. (*.der).|
|fileVaultNumberOfTimesUserCanIgnore|Int32|Optional. When using the Defer option, this is the maximum number of times the user can ignore prompts to enable FileVault before FileVault will be required for the user to sign in. If set to -1, it will always prompt to enable FileVault until FileVault is enabled, though it will allow the user to bypass enabling FileVault. Setting this to 0 will disable the feature.|
|fileVaultPersonalRecoveryKeyHelpMessage|String|Required if selected recovery key type(s) include PersonalRecoveryKey. A short message displayed to the user that explains how they can retrieve their personal recovery key.|
|fileVaultPersonalRecoveryKeyRotationInMonths|Int32|Optional. If selected recovery key type(s) include PersonalRecoveryKey, the frequency to rotate that key, in months.|
|fileVaultSelectedRecoveryKeyTypes|macOSFileVaultRecoveryKeyTypes|Required if FileVault is enabled, determines the type(s) of recovery key to use. . Possible values are: `notConfigured`, `institutionalRecoveryKey`, `personalRecoveryKey`.|
|firewallApplications|[macOSFirewallApplication](../resources/macosfirewallapplication.md) collection|List of applications with firewall settings. Firewall settings for applications not on this list are determined by the user. This collection can contain a maximum of 500 elements.|
|firewallBlockAllIncoming|Boolean|Corresponds to the “Block all incoming connections” option.|
|firewallEnabled|Boolean|Whether the firewall should be enabled or not.|
|firewallEnableStealthMode|Boolean|Corresponds to “Enable stealth mode.”|
|gatekeeperAllowedAppSource|macOSGatekeeperAppSources|System and Privacy setting that determines which download locations apps can be run from on a macOS device. Possible values are: `notConfigured`, `macAppStore`, `macAppStoreAndIdentifiedDevelopers`, `anywhere`.|
|gatekeeperBlockOverride|Boolean|If set to true, the user override for Gatekeeper will be disabled.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSEndpointProtectionConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSEndpointProtectionConfiguration",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "advancedThreatProtectionAutomaticSampleSubmission": "String",
  "advancedThreatProtectionCloudDelivered": "String",
  "advancedThreatProtectionDiagnosticDataCollection": "String",
  "advancedThreatProtectionExcludedExtensions": [
    "String"
  ],
  "advancedThreatProtectionExcludedFiles": [
    "String"
  ],
  "advancedThreatProtectionExcludedFolders": [
    "String"
  ],
  "advancedThreatProtectionExcludedProcesses": [
    "String"
  ],
  "advancedThreatProtectionRealTime": "String",
  "fileVaultAllowDeferralUntilSignOut": "Boolean",
  "fileVaultDisablePromptAtSignOut": "Boolean",
  "fileVaultEnabled": "Boolean",
  "fileVaultHidePersonalRecoveryKey": "Boolean",
  "fileVaultInstitutionalRecoveryKeyCertificate": "Binary",
  "fileVaultInstitutionalRecoveryKeyCertificateFileName": "String",
  "fileVaultNumberOfTimesUserCanIgnore": "Integer",
  "fileVaultPersonalRecoveryKeyHelpMessage": "String",
  "fileVaultPersonalRecoveryKeyRotationInMonths": "Integer",
  "fileVaultSelectedRecoveryKeyTypes": "String",
  "firewallApplications": [
    {
      "@odata.type": "microsoft.graph.macOSFirewallApplication"
    }
  ],
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "gatekeeperAllowedAppSource": "String",
  "gatekeeperBlockOverride": "Boolean"
}
```

