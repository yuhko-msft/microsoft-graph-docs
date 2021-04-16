---
title: "Update sharedPCConfiguration"
description: "Update the properties of a sharedPCConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sharedPCConfiguration
Namespace: microsoft.graph



Update the properties of a [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH ** Entity URI for microsoft.graph.sharedPCConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object.

The following table shows the properties that are required when you update the [sharedPCConfiguration](../resources/sharedpcconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|accountManagerPolicy|[sharedPCAccountManagerPolicy](../resources/sharedpcaccountmanagerpolicy.md)|Specifies how accounts are managed on a shared PC. Only applies when disableAccountManager is false.|
|allowedAccounts|sharedPCAllowedAccountType|Indicates which type of accounts are allowed to use on a shared PC. Possible values are: `notConfigured`, `guest`, `domain`.|
|allowLocalStorage|Boolean|Specifies whether local storage is allowed on a shared PC.|
|disableAccountManager|Boolean|Disables the account manager for shared PC mode.|
|disableEduPolicies|Boolean|Specifies whether the default shared PC education environment policies should be disabled. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true.|
|disablePowerPolicies|Boolean|Specifies whether the default shared PC power policies should be disabled.|
|disableSignInOnResume|Boolean|Disables the requirement to sign in whenever the device wakes up from sleep mode.|
|enabled|Boolean|Enables shared PC mode and applies the shared pc policies.|
|fastFirstSignIn|enablement|Specifies whether to auto connect new non-admin Azure AD accounts to pre-configured candidate local accounts. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|idleTimeBeforeSleepInSeconds|Int32|Specifies the time in seconds that a device must sit idle before the PC goes to sleep. Setting this value to 0 prevents the sleep timeout from occurring.|
|kioskAppDisplayName|String|Specifies the display text for the account shown on the sign-in screen which launches the app specified by SetKioskAppUserModelId. Only applies when KioskAppUserModelId is set.|
|kioskAppUserModelId|String|Specifies the application user model ID of the app to use with assigned access.|
|localStorage|enablement|Specifies whether local storage is allowed on a shared PC. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|maintenanceStartTime|TimeOfDay|Specifies the daily start time of maintenance hour.|
|setAccountManager|enablement|Disables the account manager for shared PC mode. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|setEduPolicies|enablement|Specifies whether the default shared PC education environment policies should be enabled/disabled/not configured. For Windows 10 RS2 and later, this policy will be applied without setting Enabled to true. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|setPowerPolicies|enablement|Specifies whether the default shared PC power policies should be enabled/disabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|signInOnResume|enablement|Specifies the requirement to sign in whenever the device wakes up from sleep mode. Possible values are: `notConfigured`, `enabled`, `disabled`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sharedpcconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.sharedPCConfiguration not found
Content-Type: application/json
Content-length: 1344

{
  "@odata.type": "#microsoft.graph.sharedPCConfiguration",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.sharedPCConfiguration",
  "id": "a02480aa-80aa-a024-aa80-24a0aa8024a0",
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

