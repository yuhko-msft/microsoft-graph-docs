---
title: "presentation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# presentation resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List presentations](../api/presentation-list.md)|[presentation](../resources/presentation.md) collection|Get a list of the [presentation](../resources/presentation.md) objects and their properties.|
|[Create presentation](../api/presentation-create.md)|[presentation](../resources/presentation.md)|Create a new [presentation](../resources/presentation.md) object.|
|[Get presentation](../api/presentation-get.md)|[presentation](../resources/presentation.md)|Read the properties and relationships of a [presentation](../resources/presentation.md) object.|
|[Update presentation](../api/presentation-update.md)|[presentation](../resources/presentation.md)|Update the properties of a [presentation](../resources/presentation.md) object.|
|[Delete presentation](../api/presentation-delete.md)|None|Deletes a [presentation](../resources/presentation.md) object.|
|[List comments](../api/presentation-list-comments.md)|[documentComment](../resources/documentcomment.md) collection|Get the documentComment resources from the comments navigation property.|
|[Create documentComment](../api/presentation-post-comments.md)|[documentComment](../resources/documentcomment.md)|Create a new documentComment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|comments|[documentComment](../resources/documentcomment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.presentation",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.presentation",
  "id": "String (identifier)"
}
```

