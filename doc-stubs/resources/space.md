---
title: "space resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# space resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [place](../resources/place.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List spaces](../api/space-list.md)|[space](../resources/space.md) collection|Get a list of the [space](../resources/space.md) objects and their properties.|
|[Create space](../api/space-create.md)|[space](../resources/space.md)|Create a new [space](../resources/space.md) object.|
|[Get space](../api/space-get.md)|[space](../resources/space.md)|Read the properties and relationships of a [space](../resources/space.md) object.|
|[Update space](../api/space-update.md)|[space](../resources/space.md)|Update the properties of a [space](../resources/space.md) object.|
|[Delete space](../api/space-delete.md)|None|Deletes a [space](../resources/space.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|[physicalAddress](../resources/physicaladdress.md)|**TODO: Add Description** Inherited from [place](../resources/place.md)|
|displayName|String|**TODO: Add Description** Inherited from [place](../resources/place.md)|
|geoCoordinates|[outlookGeoCoordinates](../resources/outlookgeocoordinates.md)|**TODO: Add Description** Inherited from [place](../resources/place.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|phone|String|**TODO: Add Description** Inherited from [place](../resources/place.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.space",
  "baseType": "microsoft.graph.place",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.space",
  "id": "String (identifier)",
  "displayName": "String",
  "geoCoordinates": {
    "@odata.type": "microsoft.graph.outlookGeoCoordinates"
  },
  "phone": "String",
  "address": {
    "@odata.type": "microsoft.graph.physicalAddress"
  }
}
```

