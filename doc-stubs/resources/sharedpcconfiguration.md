---
title: "sharedPCConfiguration resource type"
description: "This topic provides descriptions of the declared methods, properties and relationships exposed by the sharedPCConfiguration resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharedPCConfiguration resource type

Namespace: microsoft.graph



This topic provides descriptions of the declared methods, properties and relationships exposed by the sharedPCConfiguration resource.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharedPCConfigurations](../api/sharedpcconfiguration-list.md)|[sharedPCConfiguration](../resources/sharedpcconfiguration.md) collection|Get a list of the [sharedPCConfiguration](../resources/sharedpcconfiguration.md) objects and their properties.|
|[Create sharedPCConfiguration](../api/sharedpcconfiguration-create.md)|[sharedPCConfiguration](../resources/sharedpcconfiguration.md)|Create a new [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object.|
|[Get sharedPCConfiguration](../api/sharedpcconfiguration-get.md)|[sharedPCConfiguration](../resources/sharedpcconfiguration.md)|Read the properties and relationships of a [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object.|
|[Update sharedPCConfiguration](../api/sharedpcconfiguration-update.md)|[sharedPCConfiguration](../resources/sharedpcconfiguration.md)|Update the properties of a [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object.|
|[Delete sharedPCConfiguration](../api/sharedpcconfiguration-delete.md)|None|Deletes a [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountManagerPolicy|[sharedPCAccountManagerPolicy](../resources/sharedpcaccountmanagerpolicy.md)|Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.|
|allowedAccounts|sharedPCAllowedAccountType|Indicates which type of accounts are allowed to use on a shared PC. Possible values are: `notConfigured`, `guest`, `domain`.|
|allowLocalStorage|Boolean|Specifies whether local storage is allowed on a shared PC.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|disableAccountManager|Boolean|Disables the account manager for shared PC mode.|
|disableEduPolicies|Boolean|Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.|
|disablePowerPolicies|Boolean|Specifies whether the default shared PC power policies should be disabled.|
|disableSignInOnResume|Boolean|Disables the requirement to sign in whenever the device wakes up from sleep mode.|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|enabled|Boolean|Enables shared PC mode and applies the shared pc policies.|
|fastFirstSignIn|enablement|Specifies whether to auto connect new non-admin Azure AD accounts to pre-configured candidate local accounts. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|idleTimeBeforeSleepInSeconds|Int32|Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.|
|kioskAppDisplayName|String|Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.|
|kioskAppUserModelId|String|Specifies the application user model ID of the app to use with assigned access.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|localStorage|enablement|Specifies whether local storage is allowed on a shared PC. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|maintenanceStartTime|TimeOfDay|Specifies the daily start time of maintenance hour.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|setAccountManager|enablement|Disables the account manager for shared PC mode. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|setEduPolicies|enablement|Specifies whether the default shared PC education environment policies should be enabled/disabled/not configured. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|setPowerPolicies|enablement|Specifies whether the default shared PC power policies should be enabled/disabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|signInOnResume|enablement|Specifies the requirement to sign in whenever the device wakes up from sleep mode. Possible values are: `notConfigured`, `enabled`, `disabled`.|
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
  "@odata.type": "microsoft.graph.sharedPCConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharedPCConfiguration",
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
  "accountManagerPolicy": {
    "@odata.type": "microsoft.graph.sharedPCAccountManagerPolicy"
  },
  "allowedAccounts": "String",
  "allowLocalStorage": "Boolean",
  "disableAccountManager": "Boolean",
  "disableEduPolicies": "Boolean",
  "disablePowerPolicies": "Boolean",
  "disableSignInOnResume": "Boolean",
  "enabled": "Boolean",
  "fastFirstSignIn": "String",
  "idleTimeBeforeSleepInSeconds": "Integer",
  "kioskAppDisplayName": "String",
  "kioskAppUserModelId": "String",
  "localStorage": "String",
  "maintenanceStartTime": "String (time of day)",
  "setAccountManager": "String",
  "setEduPolicies": "String",
  "setPowerPolicies": "String",
  "signInOnResume": "String"
}
```

