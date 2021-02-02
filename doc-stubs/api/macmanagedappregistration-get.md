---
title: "Get macManagedAppRegistration"
description: "Read the properties and relationships of a macManagedAppRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get macManagedAppRegistration
Namespace: microsoft.graph

Read the properties and relationships of a [macManagedAppRegistration](../resources/macmanagedappregistration.md) object.

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
GET ** Entity URI for microsoft.graph.macManagedAppRegistration not found
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

If successful, this method returns a `200 OK` response code and a [macManagedAppRegistration](../resources/macmanagedappregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_macmanagedappregistration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.macManagedAppRegistration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macManagedAppRegistration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.macManagedAppRegistration",
    "id": "45c26e3a-6e3a-45c2-3a6e-c2453a6ec245",
    "createdDateTime": "String (timestamp)",
    "lastSyncDateTime": "String (timestamp)",
    "applicationVersion": "String",
    "managementSdkVersion": "String",
    "platformVersion": "String",
    "deviceType": "String",
    "deviceTag": "String",
    "deviceName": "String",
    "managedDeviceId": "String",
    "azureADDeviceId": "String",
    "deviceModel": "String",
    "deviceManufacturer": "String",
    "flaggedReasons": [
      "String"
    ],
    "userId": "String",
    "appIdentifier": {
      "@odata.type": "microsoft.graph.mobileAppIdentifier"
    },
    "version": "String"
  }
}
```

