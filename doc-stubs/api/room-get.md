---
title: "Get room"
description: "Read the properties and relationships of a room object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get room
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [room](../resources/room.md) object.

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
GET /room
GET /roomList/rooms/{roomId}
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

If successful, this method returns a `200 OK` response code and a [room](../resources/room.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_room"
}
-->
``` http
GET https://graph.microsoft.com/beta/room
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.room"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.room",
    "id": "ff931a1f-1a1f-ff93-1f1a-93ff1f1a93ff",
    "address": {
      "@odata.type": "microsoft.graph.physicalAddress"
    },
    "displayName": "String",
    "geoCoordinates": {
      "@odata.type": "microsoft.graph.outlookGeoCoordinates"
    },
    "phone": "String",
    "audioDeviceName": "String",
    "bookingType": "String",
    "building": "String",
    "capacity": "Integer",
    "displayDeviceName": "String",
    "emailAddress": "String",
    "floorLabel": "String",
    "floorNumber": "Integer",
    "isWheelChairAccessible": "Boolean",
    "label": "String",
    "nickname": "String",
    "tags": [
      "String"
    ],
    "videoDeviceName": "String"
  }
}
```

