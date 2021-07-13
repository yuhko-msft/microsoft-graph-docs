---
title: "room resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# room resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [place](../resources/place.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List rooms](../api/room-list.md)|[room](../resources/room.md) collection|Get a list of the [room](../resources/room.md) objects and their properties.|
|[Create room](../api/room-create.md)|[room](../resources/room.md)|Create a new [room](../resources/room.md) object.|
|[Get room](../api/room-get.md)|[room](../resources/room.md)|Read the properties and relationships of a [room](../resources/room.md) object.|
|[Update room](../api/room-update.md)|[room](../resources/room.md)|Update the properties of a [room](../resources/room.md) object.|
|[Delete room](../api/room-delete.md)|None|Deletes a [room](../resources/room.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|[physicalAddress](../resources/physicaladdress.md)|**TODO: Add Description** Inherited from [place](../resources/place.md).|
|audioDeviceName|String|**TODO: Add Description**|
|bookingType|bookingType|**TODO: Add Description**. Possible values are: `unknown`, `standard`, `reserved`.|
|building|String|**TODO: Add Description**|
|capacity|Int32|**TODO: Add Description**|
|displayDeviceName|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description** Inherited from [place](../resources/place.md).|
|emailAddress|String|**TODO: Add Description**|
|floorLabel|String|**TODO: Add Description**|
|floorNumber|Int32|**TODO: Add Description**|
|geoCoordinates|[outlookGeoCoordinates](../resources/outlookgeocoordinates.md)|**TODO: Add Description** Inherited from [place](../resources/place.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isWheelChairAccessible|Boolean|**TODO: Add Description**|
|label|String|**TODO: Add Description**|
|nickname|String|**TODO: Add Description**|
|phone|String|**TODO: Add Description** Inherited from [place](../resources/place.md).|
|tags|String collection|**TODO: Add Description**|
|videoDeviceName|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.room",
  "baseType": "microsoft.graph.place",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.room",
  "id": "String (identifier)",
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

