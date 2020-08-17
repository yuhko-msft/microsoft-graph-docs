---
title: "androidWorkProfileGeneralDeviceConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidWorkProfileGeneralDeviceConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidWorkProfileGeneralDeviceConfigurations](../api/androidworkprofilegeneraldeviceconfiguration-list.md)|[androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) collection|Get a list of the [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) objects and their properties.|
|[Create androidWorkProfileGeneralDeviceConfiguration](../api/androidworkprofilegeneraldeviceconfiguration-create.md)|[androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md)|Create a new [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object.|
|[Get androidWorkProfileGeneralDeviceConfiguration](../api/androidworkprofilegeneraldeviceconfiguration-get.md)|[androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md)|Read the properties and relationships of an [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object.|
|[Update androidWorkProfileGeneralDeviceConfiguration](../api/androidworkprofilegeneraldeviceconfiguration-update.md)|[androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md)|Update the properties of an [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object.|
|[Delete androidWorkProfileGeneralDeviceConfiguration](../api/androidworkprofilegeneraldeviceconfiguration-delete.md)|None|Deletes an [androidWorkProfileGeneralDeviceConfiguration](../resources/androidworkprofilegeneraldeviceconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|passwordBlockFaceUnlock|Boolean|**TODO: Add Description**|
|passwordBlockFingerprintUnlock|Boolean|**TODO: Add Description**|
|passwordBlockIrisUnlock|Boolean|**TODO: Add Description**|
|passwordBlockTrustAgents|Boolean|**TODO: Add Description**|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passwordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|passwordRequiredType|androidWorkProfileRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `lowSecurityBiometric`, `required`, `atLeastNumeric`, `numericComplex`, `atLeastAlphabetic`, `atLeastAlphanumeric`, `alphanumericWithSymbols`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|securityRequireVerifyApps|Boolean|**TODO: Add Description**|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|vpnAlwaysOnPackageIdentifier|String|**TODO: Add Description**|
|vpnEnableAlwaysOnLockdownMode|Boolean|**TODO: Add Description**|
|workProfileAllowWidgets|Boolean|**TODO: Add Description**|
|workProfileBlockAddingAccounts|Boolean|**TODO: Add Description**|
|workProfileBlockCamera|Boolean|**TODO: Add Description**|
|workProfileBlockCrossProfileCallerId|Boolean|**TODO: Add Description**|
|workProfileBlockCrossProfileContactsSearch|Boolean|**TODO: Add Description**|
|workProfileBlockCrossProfileCopyPaste|Boolean|**TODO: Add Description**|
|workProfileBlockNotificationsWhileDeviceLocked|Boolean|**TODO: Add Description**|
|workProfileBlockPersonalAppInstallsFromUnknownSources|Boolean|**TODO: Add Description**|
|workProfileBlockScreenCapture|Boolean|**TODO: Add Description**|
|workProfileBluetoothEnableContactSharing|Boolean|**TODO: Add Description**|
|workProfileDataSharingType|androidWorkProfileCrossProfileDataSharingType|**TODO: Add Description**. Possible values are: `deviceDefault`, `preventAny`, `allowPersonalToWork`, `noRestrictions`.|
|workProfileDefaultAppPermissionPolicy|androidWorkProfileDefaultAppPermissionPolicyType|**TODO: Add Description**. Possible values are: `deviceDefault`, `prompt`, `autoGrant`, `autoDeny`.|
|workProfilePasswordBlockFaceUnlock|Boolean|**TODO: Add Description**|
|workProfilePasswordBlockFingerprintUnlock|Boolean|**TODO: Add Description**|
|workProfilePasswordBlockIrisUnlock|Boolean|**TODO: Add Description**|
|workProfilePasswordBlockTrustAgents|Boolean|**TODO: Add Description**|
|workProfilePasswordExpirationDays|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumLength|Int32|**TODO: Add Description**|
|workProfilePasswordMinLetterCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinLowerCaseCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinNonLetterCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinNumericCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinSymbolCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinUpperCaseCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|workProfilePasswordPreviousPasswordBlockCount|Int32|**TODO: Add Description**|
|workProfilePasswordRequiredType|androidWorkProfileRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `lowSecurityBiometric`, `required`, `atLeastNumeric`, `numericComplex`, `atLeastAlphabetic`, `atLeastAlphanumeric`, `alphanumericWithSymbols`.|
|workProfilePasswordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|workProfileRequirePassword|Boolean|**TODO: Add Description**|

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
  "@odata.type": "microsoft.graph.androidWorkProfileGeneralDeviceConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidWorkProfileGeneralDeviceConfiguration",
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
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "passwordBlockFaceUnlock": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockIrisUnlock": "Boolean",
  "passwordBlockTrustAgents": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "passwordRequiredType": "String",
  "workProfileDataSharingType": "String",
  "workProfileBlockNotificationsWhileDeviceLocked": "Boolean",
  "workProfileBlockAddingAccounts": "Boolean",
  "workProfileBluetoothEnableContactSharing": "Boolean",
  "workProfileBlockScreenCapture": "Boolean",
  "workProfileBlockCrossProfileCallerId": "Boolean",
  "workProfileBlockCamera": "Boolean",
  "workProfileBlockCrossProfileContactsSearch": "Boolean",
  "workProfileBlockCrossProfileCopyPaste": "Boolean",
  "workProfileDefaultAppPermissionPolicy": "String",
  "workProfilePasswordBlockFaceUnlock": "Boolean",
  "workProfilePasswordBlockFingerprintUnlock": "Boolean",
  "workProfilePasswordBlockIrisUnlock": "Boolean",
  "workProfilePasswordBlockTrustAgents": "Boolean",
  "workProfilePasswordExpirationDays": "Integer",
  "workProfilePasswordMinimumLength": "Integer",
  "workProfilePasswordMinNumericCharacters": "Integer",
  "workProfilePasswordMinNonLetterCharacters": "Integer",
  "workProfilePasswordMinLetterCharacters": "Integer",
  "workProfilePasswordMinLowerCaseCharacters": "Integer",
  "workProfilePasswordMinUpperCaseCharacters": "Integer",
  "workProfilePasswordMinSymbolCharacters": "Integer",
  "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "workProfilePasswordPreviousPasswordBlockCount": "Integer",
  "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer",
  "workProfilePasswordRequiredType": "String",
  "workProfileRequirePassword": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "vpnAlwaysOnPackageIdentifier": "String",
  "vpnEnableAlwaysOnLockdownMode": "Boolean",
  "workProfileAllowWidgets": "Boolean",
  "workProfileBlockPersonalAppInstallsFromUnknownSources": "Boolean"
}
```

