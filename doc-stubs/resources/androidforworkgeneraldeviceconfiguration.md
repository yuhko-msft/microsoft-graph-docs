---
title: "androidForWorkGeneralDeviceConfiguration resource type"
description: "Android For Work general device configuration."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidForWorkGeneralDeviceConfiguration resource type

Namespace: microsoft.graph



Android For Work general device configuration.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidForWorkGeneralDeviceConfigurations](../api/androidforworkgeneraldeviceconfiguration-list.md)|[androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md) collection|Get a list of the [androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md) objects and their properties.|
|[Create androidForWorkGeneralDeviceConfiguration](../api/androidforworkgeneraldeviceconfiguration-create.md)|[androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md)|Create a new [androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md) object.|
|[Get androidForWorkGeneralDeviceConfiguration](../api/androidforworkgeneraldeviceconfiguration-get.md)|[androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md)|Read the properties and relationships of an [androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md) object.|
|[Update androidForWorkGeneralDeviceConfiguration](../api/androidforworkgeneraldeviceconfiguration-update.md)|[androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md)|Update the properties of an [androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md) object.|
|[Delete androidForWorkGeneralDeviceConfiguration](../api/androidforworkgeneraldeviceconfiguration-delete.md)|None|Deletes an [androidForWorkGeneralDeviceConfiguration](../resources/androidforworkgeneraldeviceconfiguration.md) object.|
|[assign](../api/androidforworkgeneraldeviceconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/androidforworkgeneraldeviceconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/androidforworkgeneraldeviceconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/androidforworkgeneraldeviceconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/androidforworkgeneraldeviceconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/androidforworkgeneraldeviceconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/androidforworkgeneraldeviceconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/androidforworkgeneraldeviceconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/androidforworkgeneraldeviceconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/androidforworkgeneraldeviceconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/androidforworkgeneraldeviceconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/androidforworkgeneraldeviceconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/androidforworkgeneraldeviceconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/androidforworkgeneraldeviceconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/androidforworkgeneraldeviceconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/androidforworkgeneraldeviceconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/androidforworkgeneraldeviceconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|passwordBlockFaceUnlock|Boolean|Indicates whether or not to block face unlock.|
|passwordBlockFingerprintUnlock|Boolean|Indicates whether or not to block fingerprint unlock.|
|passwordBlockIrisUnlock|Boolean|Indicates whether or not to block iris unlock.|
|passwordBlockTrustAgents|Boolean|Indicates whether or not to block Smart Lock and other trust agents.|
|passwordExpirationDays|Int32|Number of days before the password expires. Valid values 1 to 365|
|passwordMinimumLength|Int32|Minimum length of passwords. Valid values 4 to 16|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 0 to 24|
|passwordRequiredType|androidForWorkRequiredPasswordType|Type of password that is required. Possible values are: `deviceDefault`, `lowSecurityBiometric`, `required`, `atLeastNumeric`, `numericComplex`, `atLeastAlphabetic`, `atLeastAlphanumeric`, `alphanumericWithSymbols`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Number of sign in failures allowed before factory reset. Valid values 1 to 16|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|securityRequireVerifyApps|Boolean|Require the Android Verify apps feature is turned on.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|vpnAlwaysOnPackageIdentifier|String|Enable lockdown mode for always-on VPN.|
|vpnEnableAlwaysOnLockdownMode|Boolean|Enable lockdown mode for always-on VPN.|
|workProfileAllowWidgets|Boolean|Allow widgets from work profile apps.|
|workProfileBlockAddingAccounts|Boolean|Block users from adding/removing accounts in work profile.|
|workProfileBlockCamera|Boolean|Block work profile camera.|
|workProfileBlockCrossProfileCallerId|Boolean|Block display work profile caller ID in personal profile.|
|workProfileBlockCrossProfileContactsSearch|Boolean|Block work profile contacts availability in personal profile.|
|workProfileBlockCrossProfileCopyPaste|Boolean|Boolean that indicates if the setting disallow cross profile copy/paste is enabled.|
|workProfileBlockNotificationsWhileDeviceLocked|Boolean|Indicates whether or not to block notifications while device locked.|
|workProfileBlockPersonalAppInstallsFromUnknownSources|Boolean|Prevent app installations from unknown sources in the personal profile.|
|workProfileBlockScreenCapture|Boolean|Block screen capture in work profile.|
|workProfileBluetoothEnableContactSharing|Boolean|Allow bluetooth devices to access enterprise contacts.|
|workProfileDataSharingType|androidForWorkCrossProfileDataSharingType|Type of data sharing that is allowed. Possible values are: `deviceDefault`, `preventAny`, `allowPersonalToWork`, `noRestrictions`.|
|workProfileDefaultAppPermissionPolicy|androidForWorkDefaultAppPermissionPolicyType|Type of password that is required. Possible values are: `deviceDefault`, `prompt`, `autoGrant`, `autoDeny`.|
|workProfilePasswordBlockFaceUnlock|Boolean|Indicates whether or not to block face unlock for work profile.|
|workProfilePasswordBlockFingerprintUnlock|Boolean|Indicates whether or not to block fingerprint unlock for work profile.|
|workProfilePasswordBlockIrisUnlock|Boolean|Indicates whether or not to block iris unlock for work profile.|
|workProfilePasswordBlockTrustAgents|Boolean|Indicates whether or not to block Smart Lock and other trust agents for work profile.|
|workProfilePasswordExpirationDays|Int32|Number of days before the work profile password expires. Valid values 1 to 365|
|workProfilePasswordMinimumLength|Int32|Minimum length of work profile password. Valid values 4 to 16|
|workProfilePasswordMinLetterCharacters|Int32|Minimum # of letter characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinLowerCaseCharacters|Int32|Minimum # of lower-case characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinNonLetterCharacters|Int32|Minimum # of non-letter characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinNumericCharacters|Int32|Minimum # of numeric characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinSymbolCharacters|Int32|Minimum # of symbols required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinUpperCaseCharacters|Int32|Minimum # of upper-case characters required in work profile password. Valid values 1 to 10|
|workProfilePasswordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|workProfilePasswordPreviousPasswordBlockCount|Int32|Number of previous work profile passwords to block. Valid values 0 to 24|
|workProfilePasswordRequiredType|androidForWorkRequiredPasswordType|Type of work profile password that is required. Possible values are: `deviceDefault`, `lowSecurityBiometric`, `required`, `atLeastNumeric`, `numericComplex`, `atLeastAlphabetic`, `atLeastAlphanumeric`, `alphanumericWithSymbols`.|
|workProfilePasswordSignInFailureCountBeforeFactoryReset|Int32|Number of sign in failures allowed before work profile is removed and all corporate data deleted. Valid values 1 to 16|
|workProfileRequirePassword|Boolean|Password is required or not for work profile|

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
  "@odata.type": "microsoft.graph.androidForWorkGeneralDeviceConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidForWorkGeneralDeviceConfiguration",
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
  "passwordBlockFaceUnlock": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockIrisUnlock": "Boolean",
  "passwordBlockTrustAgents": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "securityRequireVerifyApps": "Boolean",
  "vpnAlwaysOnPackageIdentifier": "String",
  "vpnEnableAlwaysOnLockdownMode": "Boolean",
  "workProfileAllowWidgets": "Boolean",
  "workProfileBlockAddingAccounts": "Boolean",
  "workProfileBlockCamera": "Boolean",
  "workProfileBlockCrossProfileCallerId": "Boolean",
  "workProfileBlockCrossProfileContactsSearch": "Boolean",
  "workProfileBlockCrossProfileCopyPaste": "Boolean",
  "workProfileBlockNotificationsWhileDeviceLocked": "Boolean",
  "workProfileBlockPersonalAppInstallsFromUnknownSources": "Boolean",
  "workProfileBlockScreenCapture": "Boolean",
  "workProfileBluetoothEnableContactSharing": "Boolean",
  "workProfileDataSharingType": "String",
  "workProfileDefaultAppPermissionPolicy": "String",
  "workProfilePasswordBlockFaceUnlock": "Boolean",
  "workProfilePasswordBlockFingerprintUnlock": "Boolean",
  "workProfilePasswordBlockIrisUnlock": "Boolean",
  "workProfilePasswordBlockTrustAgents": "Boolean",
  "workProfilePasswordExpirationDays": "Integer",
  "workProfilePasswordMinimumLength": "Integer",
  "workProfilePasswordMinLetterCharacters": "Integer",
  "workProfilePasswordMinLowerCaseCharacters": "Integer",
  "workProfilePasswordMinNonLetterCharacters": "Integer",
  "workProfilePasswordMinNumericCharacters": "Integer",
  "workProfilePasswordMinSymbolCharacters": "Integer",
  "workProfilePasswordMinUpperCaseCharacters": "Integer",
  "workProfilePasswordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "workProfilePasswordPreviousPasswordBlockCount": "Integer",
  "workProfilePasswordRequiredType": "String",
  "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer",
  "workProfileRequirePassword": "Boolean"
}
```

