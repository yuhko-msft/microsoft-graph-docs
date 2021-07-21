---
title: "set resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# set resource type

Namespace: microsoft.graph.termStore

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/termstore-entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sets](../api/termstore-set-list.md)|[microsoft.graph.termStore.set](../resources/termstore-set.md) collection|Get a list of the [set](../resources/termstore-set.md) objects and their properties.|
|[Create set](../api/termstore-set-create.md)|[microsoft.graph.termStore.set](../resources/termstore-set.md)|Create a new [set](../resources/termstore-set.md) object.|
|[Get set](../api/termstore-set-get.md)|[microsoft.graph.termStore.set](../resources/termstore-set.md)|Read the properties and relationships of a [set](../resources/termstore-set.md) object.|
|[Update set](../api/termstore-set-update.md)|[microsoft.graph.termStore.set](../resources/termstore-set.md)|Update the properties of a [set](../resources/termstore-set.md) object.|
|[Delete set](../api/termstore-set-delete.md)|None|Deletes a [set](../resources/termstore-set.md) object.|
|[List children](../api/termstore-set-list-children.md)|[microsoft.graph.termStore.term](../resources/termstore-term.md) collection|Get the term resources from the children navigation property.|
|[Create term](../api/termstore-set-post-children.md)|[microsoft.graph.termStore.term](../resources/termstore-term.md)|Create a new term object.|
|[List group](../api/termstore-set-list-parentgroup.md)|[microsoft.graph.termStore.group](../resources/termstore-group.md) collection|Get the group resources from the parentGroup navigation property.|
|[Create group](../api/termstore-set-post-parentgroup.md)|[microsoft.graph.termStore.group](../resources/termstore-group.md)|Create a new group object.|
|[List relations](../api/termstore-set-list-relations.md)|[microsoft.graph.termStore.relation](../resources/termstore-relation.md) collection|Get the relation resources from the relations navigation property.|
|[Create relation](../api/termstore-set-post-relations.md)|[microsoft.graph.termStore.relation](../resources/termstore-relation.md)|Create a new relation object.|
|[List terms](../api/termstore-set-list-terms.md)|[microsoft.graph.termStore.term](../resources/termstore-term.md) collection|Get the term resources from the terms navigation property.|
|[Create term](../api/termstore-set-post-terms.md)|[microsoft.graph.termStore.term](../resources/termstore-term.md)|Create a new term object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/termstore-entity.md).|
|localizedNames|[microsoft.graph.termStore.localizedName](../resources/termstore-localizedname.md) collection|**TODO: Add Description**|
|properties|[microsoft.graph.keyValue](../resources/termstore-keyvalue.md) collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|children|[microsoft.graph.termStore.term](../resources/termstore-term.md) collection|**TODO: Add Description**|
|parentGroup|[group](../resources/termstore-group.md)|**TODO: Add Description**|
|relations|[microsoft.graph.termStore.relation](../resources/termstore-relation.md) collection|**TODO: Add Description**|
|terms|[microsoft.graph.termStore.term](../resources/termstore-term.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.termStore.set",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.termStore.set",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "localizedNames": [
    {
      "@odata.type": "microsoft.graph.termStore.localizedName"
    }
  ],
  "properties": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ]
}
```

