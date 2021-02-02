---
title: "macOSEndpointProtectionConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSEndpointProtectionConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSEndpointProtectionConfigurations](../api/macosendpointprotectionconfiguration-list.md)|[macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) collection|Get a list of the [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) objects and their properties.|
|[Create macOSEndpointProtectionConfiguration](../api/macosendpointprotectionconfiguration-create.md)|[macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md)|Create a new [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.|
|[Get macOSEndpointProtectionConfiguration](../api/macosendpointprotectionconfiguration-get.md)|[macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md)|Read the properties and relationships of a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.|
|[Update macOSEndpointProtectionConfiguration](../api/macosendpointprotectionconfiguration-update.md)|[macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md)|Update the properties of a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.|
|[Delete macOSEndpointProtectionConfiguration](../api/macosendpointprotectionconfiguration-delete.md)|None|Deletes a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|advancedThreatProtectionAutomaticSampleSubmission|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionCloudDelivered|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionDiagnosticDataCollection|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|advancedThreatProtectionExcludedExtensions|String collection|**TODO: Add Description**|
|advancedThreatProtectionExcludedFiles|String collection|**TODO: Add Description**|
|advancedThreatProtectionExcludedFolders|String collection|**TODO: Add Description**|
|advancedThreatProtectionExcludedProcesses|String collection|**TODO: Add Description**|
|advancedThreatProtectionRealTime|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|fileVaultAllowDeferralUntilSignOut|Boolean|**TODO: Add Description**|
|fileVaultDisablePromptAtSignOut|Boolean|**TODO: Add Description**|
|fileVaultEnabled|Boolean|**TODO: Add Description**|
|fileVaultForceReEncryption|Boolean|**TODO: Add Description**|
|fileVaultHidePersonalRecoveryKey|Boolean|**TODO: Add Description**|
|fileVaultInstitutionalRecoveryKeyCertificate|Binary|**TODO: Add Description**|
|fileVaultInstitutionalRecoveryKeyCertificateFileName|String|**TODO: Add Description**|
|fileVaultNumberOfTimesUserCanIgnore|Int32|**TODO: Add Description**|
|fileVaultPersonalRecoveryKeyHelpMessage|String|**TODO: Add Description**|
|fileVaultPersonalRecoveryKeyRotationInMonths|Int32|**TODO: Add Description**|
|fileVaultSelectedRecoveryKeyTypes|macOSFileVaultRecoveryKeyTypes|**TODO: Add Description**. Possible values are: `notConfigured`, `institutionalRecoveryKey`, `personalRecoveryKey`.|
|firewallApplications|[macOSFirewallApplication](../resources/intune-macosfirewallapplication.md) collection|**TODO: Add Description**|
|firewallBlockAllIncoming|Boolean|**TODO: Add Description**|
|firewallEnabled|Boolean|**TODO: Add Description**|
|firewallEnableStealthMode|Boolean|**TODO: Add Description**|
|gatekeeperAllowedAppSource|macOSGatekeeperAppSources|**TODO: Add Description**. Possible values are: `notConfigured`, `macAppStore`, `macAppStoreAndIdentifiedDevelopers`, `anywhere`.|
|gatekeeperBlockOverride|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|scenarioType|scenarioType|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Possible values are: `general`, `resourceAccess`.|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

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
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "scenarioType": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "gatekeeperAllowedAppSource": "String",
  "gatekeeperBlockOverride": "Boolean",
  "firewallEnabled": "Boolean",
  "firewallBlockAllIncoming": "Boolean",
  "firewallEnableStealthMode": "Boolean",
  "firewallApplications": [
    {
      "@odata.type": "microsoft.graph.macOSFirewallApplication"
    }
  ],
  "fileVaultEnabled": "Boolean",
  "fileVaultSelectedRecoveryKeyTypes": "String",
  "fileVaultInstitutionalRecoveryKeyCertificate": "Binary",
  "fileVaultInstitutionalRecoveryKeyCertificateFileName": "String",
  "fileVaultPersonalRecoveryKeyHelpMessage": "String",
  "fileVaultAllowDeferralUntilSignOut": "Boolean",
  "fileVaultNumberOfTimesUserCanIgnore": "Integer",
  "fileVaultDisablePromptAtSignOut": "Boolean",
  "fileVaultPersonalRecoveryKeyRotationInMonths": "Integer",
  "fileVaultHidePersonalRecoveryKey": "Boolean",
  "fileVaultForceReEncryption": "Boolean",
  "advancedThreatProtectionRealTime": "String",
  "advancedThreatProtectionCloudDelivered": "String",
  "advancedThreatProtectionAutomaticSampleSubmission": "String",
  "advancedThreatProtectionDiagnosticDataCollection": "String",
  "advancedThreatProtectionExcludedFolders": [
    "String"
  ],
  "advancedThreatProtectionExcludedFiles": [
    "String"
  ],
  "advancedThreatProtectionExcludedExtensions": [
    "String"
  ],
  "advancedThreatProtectionExcludedProcesses": [
    "String"
  ]
}
```

