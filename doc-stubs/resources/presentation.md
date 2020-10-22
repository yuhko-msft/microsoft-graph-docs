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

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List presentations](../api/presentation-list.md)|[presentation](../resources/presentation.md) collection|Get a list of the [presentation](../resources/presentation.md) objects and their properties.|
|[Create presentation](../api/presentation-create.md)|[presentation](../resources/presentation.md)|Create a new [presentation](../resources/presentation.md) object.|
|[Get presentation](../api/presentation-get.md)|[presentation](../resources/presentation.md)|Read the properties and relationships of a [presentation](../resources/presentation.md) object.|
|[Update presentation](../api/presentation-update.md)|[presentation](../resources/presentation.md)|Update the properties of a [presentation](../resources/presentation.md) object.|
|[Delete presentation](../api/presentation-delete.md)|None|Deletes a [presentation](../resources/presentation.md) object.|
|[List comments](../api/presentation-list-comments.md)|[documentComment](../resources/documentcomment.md) collection|Get the documentComment resources from the comments navigation property.|
|[Create comments](../api/presentation-post-comments.md)|[documentComment](../resources/documentcomment.md)|Create a new documentComment object.|
|[Get comments](../api/presentation-get-documentcomment.md)|[documentComment](../resources/documentcomment.md)|Read the properties and relationships of a [documentComment](../resources/documentcomment.md) object.|
|[Update comments](../api/presentation-update-comments.md)|[documentComment](../resources/documentcomment.md)|Update the properties of a comments object.|
|[Delete comments](../api/presentation-delete-comments.md)|None|Delete a [documentComment](../resources/documentcomment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

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
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.presentation"
}
```

