---
title: "documentComment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# documentComment resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List documentComments](../api/documentcomment-list.md)|[documentComment](../resources/documentcomment.md) collection|Get a list of the [documentComment](../resources/documentcomment.md) objects and their properties.|
|[Create documentComment](../api/documentcomment-create.md)|[documentComment](../resources/documentcomment.md)|Create a new [documentComment](../resources/documentcomment.md) object.|
|[Get documentComment](../api/documentcomment-get.md)|[documentComment](../resources/documentcomment.md)|Read the properties and relationships of a [documentComment](../resources/documentcomment.md) object.|
|[Update documentComment](../api/documentcomment-update.md)|[documentComment](../resources/documentcomment.md)|Update the properties of a [documentComment](../resources/documentcomment.md) object.|
|[Delete documentComment](../api/documentcomment-delete.md)|None|Deletes a [documentComment](../resources/documentcomment.md) object.|
|[List replies](../api/documentcomment-list-replies.md)|[documentCommentReply](../resources/documentcommentreply.md) collection|Get the documentCommentReply resources from the replies navigation property.|
|[Create documentCommentReply](../api/documentcomment-post-replies.md)|[documentCommentReply](../resources/documentcommentreply.md)|Create a new documentCommentReply object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|replies|[documentCommentReply](../resources/documentcommentreply.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.documentComment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.documentComment",
  "id": "String (identifier)",
  "content": "String"
}
```

