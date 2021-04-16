---
title: "bookingNamedEntity resource type"
description: "Booking entities that provide a display name."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bookingNamedEntity resource type

Namespace: microsoft.graph



Booking entities that provide a display name.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List bookingNamedEntities](../api/bookingnamedentity-list.md)|[bookingNamedEntity](../resources/bookingnamedentity.md) collection|Get a list of the [bookingNamedEntity](../resources/bookingnamedentity.md) objects and their properties.|
|[Create bookingNamedEntity](../api/bookingnamedentity-create.md)|[bookingNamedEntity](../resources/bookingnamedentity.md)|Create a new [bookingNamedEntity](../resources/bookingnamedentity.md) object.|
|[Get bookingNamedEntity](../api/bookingnamedentity-get.md)|[bookingNamedEntity](../resources/bookingnamedentity.md)|Read the properties and relationships of a [bookingNamedEntity](../resources/bookingnamedentity.md) object.|
|[Update bookingNamedEntity](../api/bookingnamedentity-update.md)|[bookingNamedEntity](../resources/bookingnamedentity.md)|Update the properties of a [bookingNamedEntity](../resources/bookingnamedentity.md) object.|
|[Delete bookingNamedEntity](../api/bookingnamedentity-delete.md)|None|Deletes a [bookingNamedEntity](../resources/bookingnamedentity.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Display name of this entity.
The display name is suitable for human-readable interfaces.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.bookingNamedEntity",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bookingNamedEntity",
  "id": "String (identifier)",
  "displayName": "String"
}
```

