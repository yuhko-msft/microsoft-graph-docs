---
title: "Create room"
description: "Create a new room object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create room
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new room object.

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
POST /roomList/rooms
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [room](../resources/room.md) object.

The following table shows the properties that are required when you create the [room](../resources/room.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|address|[physicalAddress](../resources/physicaladdress.md)|**TODO: Add Description** Inherited from [place](../resources/place.md)|
|displayName|String|**TODO: Add Description** Inherited from [place](../resources/place.md)|
|geoCoordinates|[outlookGeoCoordinates](../resources/outlookgeocoordinates.md)|**TODO: Add Description** Inherited from [place](../resources/place.md)|
|phone|String|**TODO: Add Description** Inherited from [place](../resources/place.md)|
|audioDeviceName|String|**TODO: Add Description**|
|bookingType|bookingType|**TODO: Add Description**. Possible values are: `unknown`, `standard`, `reserved`.|
|building|String|**TODO: Add Description**|
|capacity|Int32|**TODO: Add Description**|
|displayDeviceName|String|**TODO: Add Description**|
|emailAddress|String|**TODO: Add Description**|
|floorLabel|String|**TODO: Add Description**|
|floorNumber|Int32|**TODO: Add Description**|
|isWheelChairAccessible|Boolean|**TODO: Add Description**|
|label|String|**TODO: Add Description**|
|nickname|String|**TODO: Add Description**|
|tags|String collection|**TODO: Add Description**|
|videoDeviceName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [room](../resources/room.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_room_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/roomList/rooms
Content-Type: application/json
Content-length: 643

{
  "@odata.type": "#microsoft.graph.room",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

