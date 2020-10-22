---
title: "List logCollectionRequests"
description: "Get the deviceLogCollectionResponse resources from the logCollectionRequests navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List logCollectionRequests
Namespace: microsoft.graph

Get the deviceLogCollectionResponse resources from the logCollectionRequests navigation property.

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
  "name": "get_devicelogcollectionresponse"
}
-->
``` http
GET https://graph.microsoft.com/beta/me/managedDevices/{managedDeviceId}/logCollectionRequests
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
      "id": "f43ce627-e627-f43c-27e6-3cf427e63cf4",
      "status": "String",
      "managedDeviceId": "Guid",
      "errorCode": "Integer",
      "requestedDateTimeUTC": "String (timestamp)",
      "receivedDateTimeUTC": "String (timestamp)",
      "initiatedByUserPrincipalName": "String",
      "expirationDateTimeUTC": "String (timestamp)",
      "size": "Double"
    }
  ]
}
```

