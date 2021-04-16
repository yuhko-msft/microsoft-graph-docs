---
title: "windows81GeneralConfiguration resource type"
description: "This topic provides descriptions of the declared methods, properties and relationships exposed by the windows81GeneralConfiguration resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows81GeneralConfiguration resource type

Namespace: microsoft.graph



This topic provides descriptions of the declared methods, properties and relationships exposed by the windows81GeneralConfiguration resource.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows81GeneralConfiguration](../api/windows81generalconfiguration-list.md)|[windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) collection|Get a list of the [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) objects and their properties.|
|[Create windows81GeneralConfiguration](../api/windows81generalconfiguration-create.md)|[windows81GeneralConfiguration](../resources/windows81generalconfiguration.md)|Create a new [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object.|
|[Get windows81GeneralConfiguration](../api/windows81generalconfiguration-get.md)|[windows81GeneralConfiguration](../resources/windows81generalconfiguration.md)|Read the properties and relationships of a [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object.|
|[Update windows81GeneralConfiguration](../api/windows81generalconfiguration-update.md)|[windows81GeneralConfiguration](../resources/windows81generalconfiguration.md)|Update the properties of a [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object.|
|[Delete windows81GeneralConfiguration](../api/windows81generalconfiguration-delete.md)|None|Deletes a [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountsBlockAddingNonMicrosoftAccountEmail|Boolean|Indicates whether or not to Block the user from adding email accounts to the device that are not associated with a Microsoft account.|
|applyOnlyToWindows81|Boolean|Value indicating whether this policy only applies to Windows 8.1. This property is read-only.|
|browserBlockAutofill|Boolean|Indicates whether or not to block auto fill.|
|browserBlockAutomaticDetectionOfIntranetSites|Boolean|Indicates whether or not to block automatic detection of Intranet sites.|
|browserBlockEnterpriseModeAccess|Boolean|Indicates whether or not to block enterprise mode access.|
|browserBlockJavaScript|Boolean|Indicates whether or not to Block the user from using JavaScript.|
|browserBlockPlugins|Boolean|Indicates whether or not to block plug-ins.|
|browserBlockPopups|Boolean|Indicates whether or not to block popups.|
|browserBlockSendingDoNotTrackHeader|Boolean|Indicates whether or not to Block the user from sending the do not track header.|
|browserBlockSingleWordEntryOnIntranetSites|Boolean|Indicates whether or not to block a single word entry on Intranet sites.|
|browserEnterpriseModeSiteListLocation|String|The enterprise mode site list location. Could be a local file, local network or http location.|
|browserInternetSecurityLevel|internetSiteSecurityLevel|The internet security level. Possible values are: `userDefined`, `medium`, `mediumHigh`, `high`.|
|browserIntranetSecurityLevel|siteSecurityLevel|The Intranet security level. Possible values are: `userDefined`, `low`, `mediumLow`, `medium`, `mediumHigh`, `high`.|
|browserLoggingReportLocation|String|The logging report location.|
|browserRequireFirewall|Boolean|Indicates whether or not to require a firewall.|
|browserRequireFraudWarning|Boolean|Indicates whether or not to require fraud warning.|
|browserRequireHighSecurityForRestrictedSites|Boolean|Indicates whether or not to require high security for restricted sites.|
|browserRequireSmartScreen|Boolean|Indicates whether or not to require the user to use the smart screen filter.|
|browserTrustedSitesSecurityLevel|siteSecurityLevel|The trusted sites security level. Possible values are: `userDefined`, `low`, `mediumLow`, `medium`, `mediumHigh`, `high`.|
|cellularBlockDataRoaming|Boolean|Indicates whether or not to block data roaming.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|diagnosticsBlockDataSubmission|Boolean|Indicates whether or not to block diagnostic data submission.|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|minimumAutoInstallClassification|updateClassification|The minimum update classification to install automatically. Possible values are: `userDefined`, `recommendedAndImportant`, `important`, `none`.|
|passwordBlockPicturePasswordAndPin|Boolean|Indicates whether or not to Block the user from using a pictures password and pin.|
|passwordExpirationDays|Int32|Password expiration in days.|
|passwordMinimumCharacterSetCount|Int32|The number of character sets required in the password.|
|passwordMinimumLength|Int32|The minimum password length.|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|The minutes of inactivity before the screen times out.|
|passwordPreviousPasswordBlockCount|Int32|The number of previous passwords to prevent re-use of. Valid values 0 to 24|
|passwordRequiredType|requiredPasswordType|The required password type. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|The number of sign in failures before factory reset.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|storageRequireDeviceEncryption|Boolean|Indicates whether or not to require encryption on a mobile device.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|updatesMinimumAutoInstallClassification|updateClassification|The minimum update classification to install automatically. Possible values are: `userDefined`, `recommendedAndImportant`, `important`, `none`.|
|updatesRequireAutomaticUpdates|Boolean|Indicates whether or not to require automatic updates.|
|userAccountControlSettings|windowsUserAccountControlSettings|The user account control settings. Possible values are: `userDefined`, `alwaysNotify`, `notifyOnAppChanges`, `notifyOnAppChangesWithoutDimming`, `neverNotify`.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|workFoldersUrl|String|The work folders url.|

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
  "@odata.type": "microsoft.graph.windows81GeneralConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows81GeneralConfiguration",
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
  "accountsBlockAddingNonMicrosoftAccountEmail": "Boolean",
  "applyOnlyToWindows81": "Boolean",
  "browserBlockAutofill": "Boolean",
  "browserBlockAutomaticDetectionOfIntranetSites": "Boolean",
  "browserBlockEnterpriseModeAccess": "Boolean",
  "browserBlockJavaScript": "Boolean",
  "browserBlockPlugins": "Boolean",
  "browserBlockPopups": "Boolean",
  "browserBlockSendingDoNotTrackHeader": "Boolean",
  "browserBlockSingleWordEntryOnIntranetSites": "Boolean",
  "browserEnterpriseModeSiteListLocation": "String",
  "browserInternetSecurityLevel": "String",
  "browserIntranetSecurityLevel": "String",
  "browserLoggingReportLocation": "String",
  "browserRequireFirewall": "Boolean",
  "browserRequireFraudWarning": "Boolean",
  "browserRequireHighSecurityForRestrictedSites": "Boolean",
  "browserRequireSmartScreen": "Boolean",
  "browserTrustedSitesSecurityLevel": "String",
  "cellularBlockDataRoaming": "Boolean",
  "diagnosticsBlockDataSubmission": "Boolean",
  "minimumAutoInstallClassification": "String",
  "passwordBlockPicturePasswordAndPin": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumCharacterSetCount": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "storageRequireDeviceEncryption": "Boolean",
  "updatesMinimumAutoInstallClassification": "String",
  "updatesRequireAutomaticUpdates": "Boolean",
  "userAccountControlSettings": "String",
  "workFoldersUrl": "String"
}
```

