---
title: "Get iosManagedAppRegistration"
description: "Read the properties and relationships of an iosManagedAppRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosManagedAppRegistration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [iosManagedAppRegistration](../resources/iosmanagedappregistration.md) object.

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
GET ** Entity URI for microsoft.graph.iosManagedAppRegistration not found
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

If successful, this method returns a `200 OK` response code and an [iosManagedAppRegistration](../resources/iosmanagedappregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iosmanagedappregistration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosManagedAppRegistration not found
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosManagedAppRegistration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosManagedAppRegistration",
    "id": "54823d21-3d21-5482-213d-8254213d8254",
    "appIdentifier": {
      "@odata.type": "microsoft.graph.mobileAppIdentifier"
    },
    "applicationVersion": "String",
    "azureADDeviceId": "String",
    "createdDateTime": "String (timestamp)",
    "deviceManufacturer": "String",
    "deviceModel": "String",
    "deviceName": "String",
    "deviceTag": "String",
    "deviceType": "String",
    "flaggedReasons": [
      "String"
    ],
    "lastSyncDateTime": "String (timestamp)",
    "managedDeviceId": "String",
    "managementSdkVersion": "String",
    "platformVersion": "String",
    "userId": "String",
    "version": "String"
  }
}
```

