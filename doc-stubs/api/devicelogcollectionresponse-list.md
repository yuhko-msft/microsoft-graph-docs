---
title: "List deviceLogCollectionResponses"
description: "Get a list of the deviceLogCollectionResponse objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List deviceLogCollectionResponses
Namespace: microsoft.graph



Get a list of the [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) objects and their properties.

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
GET /me/managedDevices/{managedDeviceId}/logCollectionRequests
GET /users/{usersId}/managedDevices/{managedDeviceId}/logCollectionRequests
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

If successful, this method returns a `200 OK` response code and a collection of [deviceLogCollectionResponse](../resources/devicelogcollectionresponse.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicelogcollectionresponse"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/logCollectionRequests
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceLogCollectionResponse)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
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
  ]
}
```

