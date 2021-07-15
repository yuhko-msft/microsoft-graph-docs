---
title: "workbookComment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# workbookComment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List workbookComments](../api/workbookcomment-list.md)|[workbookComment](../resources/workbookcomment.md) collection|Get a list of the [workbookComment](../resources/workbookcomment.md) objects and their properties.|
|[Create workbookComment](../api/workbookcomment-create.md)|[workbookComment](../resources/workbookcomment.md)|Create a new [workbookComment](../resources/workbookcomment.md) object.|
|[Get workbookComment](../api/workbookcomment-get.md)|[workbookComment](../resources/workbookcomment.md)|Read the properties and relationships of a [workbookComment](../resources/workbookcomment.md) object.|
|[Update workbookComment](../api/workbookcomment-update.md)|[workbookComment](../resources/workbookcomment.md)|Update the properties of a [workbookComment](../resources/workbookcomment.md) object.|
|[Delete workbookComment](../api/workbookcomment-delete.md)|None|Deletes a [workbookComment](../resources/workbookcomment.md) object.|
|[List replies](../api/workbookcomment-list-replies.md)|[workbookCommentReply](../resources/workbookcommentreply.md) collection|Get the workbookCommentReply resources from the replies navigation property.|
|[Create workbookCommentReply](../api/workbookcomment-post-replies.md)|[workbookCommentReply](../resources/workbookcommentreply.md)|Create a new workbookCommentReply object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|String|**TODO: Add Description**|
|contentType|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|replies|[workbookCommentReply](../resources/workbookcommentreply.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.workbookComment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.workbookComment",
  "id": "String (identifier)",
  "content": "String",
  "contentType": "String"
}
```

