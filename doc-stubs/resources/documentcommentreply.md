---
title: "documentCommentReply resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# documentCommentReply resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List documentCommentReplies](../api/documentcommentreply-list.md)|[documentCommentReply](../resources/documentcommentreply.md) collection|Get a list of the [documentCommentReply](../resources/documentcommentreply.md) objects and their properties.|
|[Create documentCommentReply](../api/documentcommentreply-create.md)|[documentCommentReply](../resources/documentcommentreply.md)|Create a new [documentCommentReply](../resources/documentcommentreply.md) object.|
|[Get documentCommentReply](../api/documentcommentreply-get.md)|[documentCommentReply](../resources/documentcommentreply.md)|Read the properties and relationships of a [documentCommentReply](../resources/documentcommentreply.md) object.|
|[Update documentCommentReply](../api/documentcommentreply-update.md)|[documentCommentReply](../resources/documentcommentreply.md)|Update the properties of a [documentCommentReply](../resources/documentcommentreply.md) object.|
|[Delete documentCommentReply](../api/documentcommentreply-delete.md)|None|Deletes a [documentCommentReply](../resources/documentcommentreply.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|location|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.documentCommentReply",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.documentCommentReply",
  "id": "String (identifier)",
  "content": "String",
  "location": "String"
}
```

