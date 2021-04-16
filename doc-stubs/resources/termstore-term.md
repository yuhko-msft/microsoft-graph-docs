---
title: "term resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# term resource type

Namespace: microsoft.graph.termStore



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List terms](../api/term-list.md)|[term](../resources/termstore-term.md) collection|Get a list of the [term](../resources/term.md) objects and their properties.|
|[Create term](../api/termstore-term-create.md)|[term](../resources/termstore-term.md)|Create a new [term](../resources/termstore-term.md) object.|
|[Get term](../api/termstore-term-get.md)|[term](../resources/termstore-term.md)|Read the properties and relationships of a [term](../resources/termstore-term.md) object.|
|[Update term](../api/termstore-term-update.md)|[term](../resources/termstore-term.md)|Update the properties of a [term](../resources/termstore-term.md) object.|
|[Delete term](../api/termstore-term-delete.md)|None|Deletes a [term](../resources/termstore-term.md) object.|
|[List children](../api/termstore-term-list-children.md)|[term](../resources/termstore-term.md) collection|Get the term resources from the children navigation property.|
|[Create term](../api/termstore-term-post-children.md)|[term](../resources/termstore-term.md)|Create a new term object.|
|[List relations](../api/termstore-term-list-relations.md)|[relation](../resources/termstore-relation.md) collection|Get the relation resources from the relations navigation property.|
|[Create relation](../api/termstore-term-post-relations.md)|[relation](../resources/termstore-relation.md)|Create a new relation object.|
|[List set](../api/termstore-term-list-set.md)|[set](../resources/termstore-set.md) collection|Get the set resources from the set navigation property.|
|[Add set](../api/termstore-term-post-set.md)|[set](../resources/termstore-set.md)|Add set by posting to the set collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|descriptions|[localizedDescription](../resources/termstore-localizeddescription.md) collection|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/termstore-entity.md)|
|labels|[localizedLabel](../resources/termstore-localizedlabel.md) collection|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|properties|[keyValue](../resources/termstore-keyvalue.md) collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|children|[term](../resources/termstore-term.md) collection|**TODO: Add Description**|
|relations|[relation](../resources/termstore-relation.md) collection|**TODO: Add Description**|
|set|[set](../resources/termstore-set.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.termStore.term",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.termStore.term",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "descriptions": [
    {
      "@odata.type": "microsoft.graph.termStore.localizedDescription"
    }
  ],
  "labels": [
    {
      "@odata.type": "microsoft.graph.termStore.localizedLabel"
    }
  ],
  "lastModifiedDateTime": "String (timestamp)",
  "properties": [
    {
      "@odata.type": "microsoft.graph.keyValue"
    }
  ]
}
```

