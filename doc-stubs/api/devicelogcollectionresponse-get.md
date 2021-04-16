---
title: "Get deviceLogCollectionResponse"
description: "Read the properties and relationships of a deviceLogCollectionResponse object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceLogCollectionResponse
Namespace: microsoft.graph



Read the properties and relationships of a [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) object.

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
GET /me/managedDevices/{managedDeviceId}/logCollectionRequests/{deviceLogCollectionResponseId}
GET /users/{usersId}/managedDevices/{managedDeviceId}/logCollectionRequests/{deviceLogCollectionResponseId}
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

If successful, this method returns a `200 OK` response code and a [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicelogcollectionresponse"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/logCollectionRequests/{deviceLogCollectionResponseId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceLogCollectionResponse"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceLogCollectionResponse",
    "id": "2c86b1a0-b1a0-2c86-a0b1-862ca0b1862c",
    "errorCode": "Integer",
    "expirationDateTimeUTC": "String (timestamp)",
    "initiatedByUserPrincipalName": "String",
    "managedDeviceId": "Guid",
    "receivedDateTimeUTC": "String (timestamp)",
    "requestedDateTimeUTC": "String (timestamp)",
    "size": "Double",
    "status": "String"
  }
}
```

