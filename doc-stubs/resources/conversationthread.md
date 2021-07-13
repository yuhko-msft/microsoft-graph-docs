---
title: "conversationThread resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# conversationThread resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List conversationThreads](../api/conversationthread-list.md)|[conversationThread](../resources/conversationthread.md) collection|Get a list of the [conversationThread](../resources/conversationthread.md) objects and their properties.|
|[Create conversationThread](../api/conversationthread-create.md)|[conversationThread](../resources/conversationthread.md)|Create a new [conversationThread](../resources/conversationthread.md) object.|
|[Get conversationThread](../api/conversationthread-get.md)|[conversationThread](../resources/conversationthread.md)|Read the properties and relationships of a [conversationThread](../resources/conversationthread.md) object.|
|[Update conversationThread](../api/conversationthread-update.md)|[conversationThread](../resources/conversationthread.md)|Update the properties of a [conversationThread](../resources/conversationthread.md) object.|
|[Delete conversationThread](../api/conversationthread-delete.md)|None|Deletes a [conversationThread](../resources/conversationthread.md) object.|
|[reply](../api/conversationthread-reply.md)|None|**TODO: Add Description**|
|[List posts](../api/conversationthread-list-posts.md)|[post](../resources/post.md) collection|Get the post resources from the posts navigation property.|
|[Create post](../api/conversationthread-post-posts.md)|[post](../resources/post.md)|Create a new post object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|ccRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isLocked|Boolean|**TODO: Add Description**|
|lastDeliveredDateTime|DateTimeOffset|**TODO: Add Description**|
|preview|String|**TODO: Add Description**|
|topic|String|**TODO: Add Description**|
|toRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|uniqueSenders|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|posts|[post](../resources/post.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.conversationThread",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.conversationThread",
  "id": "String (identifier)",
  "ccRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "hasAttachments": "Boolean",
  "isLocked": "Boolean",
  "lastDeliveredDateTime": "String (timestamp)",
  "preview": "String",
  "topic": "String",
  "toRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "uniqueSenders": [
    "String"
  ]
}
```

