---
title: "Update deviceEnrollmentWindowsHelloForBusinessConfiguration"
description: "Update the properties of a deviceEnrollmentWindowsHelloForBusinessConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceEnrollmentWindowsHelloForBusinessConfiguration
Namespace: microsoft.graph

Update the properties of a [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object.

The following table shows the properties that are required when you create the [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|priority|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceEnrollmentConfiguration](../resources/intune-deviceenrollmentconfiguration.md)|
|pinMinimumLength|Int32|**TODO: Add Description**|
|pinMaximumLength|Int32|**TODO: Add Description**|
|pinUppercaseCharactersUsage|windowsHelloForBusinessPinUsage|**TODO: Add Description**. Possible values are: `allowed`, `required`, `disallowed`.|
|pinLowercaseCharactersUsage|windowsHelloForBusinessPinUsage|**TODO: Add Description**. Possible values are: `allowed`, `required`, `disallowed`.|
|pinSpecialCharactersUsage|windowsHelloForBusinessPinUsage|**TODO: Add Description**. Possible values are: `allowed`, `required`, `disallowed`.|
|state|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|securityDeviceRequired|Boolean|**TODO: Add Description**|
|unlockWithBiometricsEnabled|Boolean|**TODO: Add Description**|
|remotePassportEnabled|Boolean|**TODO: Add Description**|
|pinPreviousBlockCount|Int32|**TODO: Add Description**|
|pinExpirationInDays|Int32|**TODO: Add Description**|
|enhancedBiometricsState|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|securityKeyForSignIn|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_deviceenrollmentwindowshelloforbusinessconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration not found
Content-Type: application/json
Content-length: 742

{
  "@odata.type": "#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "pinMinimumLength": "Integer",
  "pinMaximumLength": "Integer",
  "pinUppercaseCharactersUsage": "String",
  "pinLowercaseCharactersUsage": "String",
  "pinSpecialCharactersUsage": "String",
  "state": "String",
  "securityDeviceRequired": "Boolean",
  "unlockWithBiometricsEnabled": "Boolean",
  "remotePassportEnabled": "Boolean",
  "pinPreviousBlockCount": "Integer",
  "pinExpirationInDays": "Integer",
  "enhancedBiometricsState": "String",
  "securityKeyForSignIn": "String"
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
  "@odata.type": "#microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration",
  "id": "6539510e-510e-6539-0e51-39650e513965",
  "displayName": "String",
  "description": "String",
  "priority": "Integer",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "version": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "pinMinimumLength": "Integer",
  "pinMaximumLength": "Integer",
  "pinUppercaseCharactersUsage": "String",
  "pinLowercaseCharactersUsage": "String",
  "pinSpecialCharactersUsage": "String",
  "state": "String",
  "securityDeviceRequired": "Boolean",
  "unlockWithBiometricsEnabled": "Boolean",
  "remotePassportEnabled": "Boolean",
  "pinPreviousBlockCount": "Integer",
  "pinExpirationInDays": "Integer",
  "enhancedBiometricsState": "String",
  "securityKeyForSignIn": "String"
}
```

