---
title: "Create sharedPCConfiguration"
description: "Create a new sharedPCConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sharedPCConfiguration
Namespace: microsoft.graph

Create a new [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST ** Collection URI for microsoft.graph.sharedPCConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object.

The following table shows the properties that are required when you create the [sharedPCConfiguration](../resources/sharedpcconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|accountManagerPolicy|[sharedPCAccountManagerPolicy](../resources/intune-sharedpcaccountmanagerpolicy.md)|**TODO: Add Description**|
|allowedAccounts|sharedPCAllowedAccountType|**TODO: Add Description**. Possible values are: `notConfigured`, `guest`, `domain`.|
|localStorage|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|allowLocalStorage|Boolean|**TODO: Add Description**|
|setAccountManager|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|disableAccountManager|Boolean|**TODO: Add Description**|
|setEduPolicies|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|disableEduPolicies|Boolean|**TODO: Add Description**|
|setPowerPolicies|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|disablePowerPolicies|Boolean|**TODO: Add Description**|
|signInOnResume|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|disableSignInOnResume|Boolean|**TODO: Add Description**|
|enabled|Boolean|**TODO: Add Description**|
|idleTimeBeforeSleepInSeconds|Int32|**TODO: Add Description**|
|kioskAppDisplayName|String|**TODO: Add Description**|
|kioskAppUserModelId|String|**TODO: Add Description**|
|maintenanceStartTime|TimeOfDay|**TODO: Add Description**|
|fastFirstSignIn|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|



## Response

If successful, this method returns a `201 Created` response code and a [sharedPCConfiguration](../resources/sharedpcconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sharedpcconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.sharedPCConfiguration not found
Content-Type: application/json
Content-length: 1344

{
  "@odata.type": "#microsoft.graph.sharedPCConfiguration",
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
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "accountManagerPolicy": {
    "@odata.type": "microsoft.graph.sharedPCAccountManagerPolicy"
  },
  "allowedAccounts": "String",
  "localStorage": "String",
  "allowLocalStorage": "Boolean",
  "setAccountManager": "String",
  "disableAccountManager": "Boolean",
  "setEduPolicies": "String",
  "disableEduPolicies": "Boolean",
  "setPowerPolicies": "String",
  "disablePowerPolicies": "Boolean",
  "signInOnResume": "String",
  "disableSignInOnResume": "Boolean",
  "enabled": "Boolean",
  "idleTimeBeforeSleepInSeconds": "Integer",
  "kioskAppDisplayName": "String",
  "kioskAppUserModelId": "String",
  "maintenanceStartTime": "String (time of day)",
  "fastFirstSignIn": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.sharedPCConfiguration"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.sharedPCConfiguration",
  "id": "d36e13be-13be-d36e-be13-6ed3be136ed3",
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
  "accountManagerPolicy": {
    "@odata.type": "microsoft.graph.sharedPCAccountManagerPolicy"
  },
  "allowedAccounts": "String",
  "localStorage": "String",
  "allowLocalStorage": "Boolean",
  "setAccountManager": "String",
  "disableAccountManager": "Boolean",
  "setEduPolicies": "String",
  "disableEduPolicies": "Boolean",
  "setPowerPolicies": "String",
  "disablePowerPolicies": "Boolean",
  "signInOnResume": "String",
  "disableSignInOnResume": "Boolean",
  "enabled": "Boolean",
  "idleTimeBeforeSleepInSeconds": "Integer",
  "kioskAppDisplayName": "String",
  "kioskAppUserModelId": "String",
  "maintenanceStartTime": "String (time of day)",
  "fastFirstSignIn": "String"
}
```

