---
title: "Get deviceEnrollmentWindowsHelloForBusinessConfiguration"
description: "Read the properties and relationships of a deviceEnrollmentWindowsHelloForBusinessConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceEnrollmentWindowsHelloForBusinessConfiguration
Namespace: microsoft.graph

Read the properties and relationships of a [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [deviceEnrollmentWindowsHelloForBusinessConfiguration](../resources/intune-deviceenrollmentwindowshelloforbusinessconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_deviceenrollmentwindowshelloforbusinessconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceEnrollmentWindowsHelloForBusinessConfiguration"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
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
}
```

