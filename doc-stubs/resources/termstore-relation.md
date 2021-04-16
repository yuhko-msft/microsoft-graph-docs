---
title: "relation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# relation resource type

Namespace: microsoft.graph.termStore



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List relations](../api/relation-list.md)|[relation](../resources/termstore-relation.md) collection|Get a list of the [relation](../resources/relation.md) objects and their properties.|
|[Create relation](../api/termstore-relation-create.md)|[relation](../resources/termstore-relation.md)|Create a new [relation](../resources/termstore-relation.md) object.|
|[Get relation](../api/termstore-relation-get.md)|[relation](../resources/termstore-relation.md)|Read the properties and relationships of a [relation](../resources/termstore-relation.md) object.|
|[Update relation](../api/termstore-relation-update.md)|[relation](../resources/termstore-relation.md)|Update the properties of a [relation](../resources/termstore-relation.md) object.|
|[Delete relation](../api/termstore-relation-delete.md)|None|Deletes a [relation](../resources/termstore-relation.md) object.|
|[List term](../api/termstore-relation-list-fromterm.md)|[term](../resources/termstore-term.md) collection|Get the term resources from the fromTerm navigation property.|
|[Add term](../api/termstore-relation-post-fromterm.md)|[term](../resources/termstore-term.md)|Add fromTerm by posting to the fromTerm collection.|
|[List set](../api/termstore-relation-list-set.md)|[set](../resources/termstore-set.md) collection|Get the set resources from the set navigation property.|
|[Add set](../api/termstore-relation-post-set.md)|[set](../resources/termstore-set.md)|Add set by posting to the set collection.|
|[List term](../api/termstore-relation-list-toterm.md)|[term](../resources/termstore-term.md) collection|Get the term resources from the toTerm navigation property.|
|[Add term](../api/termstore-relation-post-toterm.md)|[term](../resources/termstore-term.md)|Add toTerm by posting to the toTerm collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/termstore-entity.md)|
|relationship|relationType|**TODO: Add Description**. Possible values are: `pin`, `reuse`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|fromTerm|[term](../resources/termstore-term.md)|**TODO: Add Description**|
|set|[set](../resources/termstore-set.md)|**TODO: Add Description**|
|toTerm|[term](../resources/termstore-term.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.termStore.relation",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.termStore.relation",
  "id": "String (identifier)",
  "relationship": "String"
}
```

