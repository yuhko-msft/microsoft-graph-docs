---
title: "bookingPerson resource type"
description: "Represents a booking customer or staff member."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# bookingPerson resource type

Namespace: microsoft.graph



Represents a booking customer or staff member.


Inherits from [bookingNamedEntity](../resources/bookingnamedentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List bookingPersons](../api/bookingperson-list.md)|[bookingPerson](../resources/bookingperson.md) collection|Get a list of the [bookingPerson](../resources/bookingperson.md) objects and their properties.|
|[Create bookingPerson](../api/bookingperson-create.md)|[bookingPerson](../resources/bookingperson.md)|Create a new [bookingPerson](../resources/bookingperson.md) object.|
|[Get bookingPerson](../api/bookingperson-get.md)|[bookingPerson](../resources/bookingperson.md)|Read the properties and relationships of a [bookingPerson](../resources/bookingperson.md) object.|
|[Update bookingPerson](../api/bookingperson-update.md)|[bookingPerson](../resources/bookingperson.md)|Update the properties of a [bookingPerson](../resources/bookingperson.md) object.|
|[Delete bookingPerson](../api/bookingperson-delete.md)|None|Deletes a [bookingPerson](../resources/bookingperson.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Display name of this entity.
The display name is suitable for human-readable interfaces. Inherited from [bookingNamedEntity](../resources/bookingnamedentity.md)|
|emailAddress|String|The e-mail address of this person.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.bookingPerson",
  "baseType": "microsoft.graph.bookingNamedEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.bookingPerson",
  "id": "String (identifier)",
  "displayName": "String",
  "emailAddress": "String"
}
```

