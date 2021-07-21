---
title: "conversation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# conversation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List conversations](../api/conversation-list.md)|[conversation](../resources/conversation.md) collection|Get a list of the [conversation](../resources/conversation.md) objects and their properties.|
|[Create conversation](../api/conversation-create.md)|[conversation](../resources/conversation.md)|Create a new [conversation](../resources/conversation.md) object.|
|[Get conversation](../api/conversation-get.md)|[conversation](../resources/conversation.md)|Read the properties and relationships of a [conversation](../resources/conversation.md) object.|
|[Update conversation](../api/conversation-update.md)|[conversation](../resources/conversation.md)|Update the properties of a [conversation](../resources/conversation.md) object.|
|[Delete conversation](../api/conversation-delete.md)|None|Deletes a [conversation](../resources/conversation.md) object.|
|[List threads](../api/conversation-list-threads.md)|[conversationThread](../resources/conversationthread.md) collection|Get the conversationThread resources from the threads navigation property.|
|[Create conversationThread](../api/conversation-post-threads.md)|[conversationThread](../resources/conversationthread.md)|Create a new conversationThread object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|hasAttachments|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastDeliveredDateTime|DateTimeOffset|**TODO: Add Description**|
|preview|String|**TODO: Add Description**|
|topic|String|**TODO: Add Description**|
|uniqueSenders|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|threads|[conversationThread](../resources/conversationthread.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.conversation",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.conversation",
  "id": "String (identifier)",
  "hasAttachments": "Boolean",
  "lastDeliveredDateTime": "String (timestamp)",
  "preview": "String",
  "topic": "String",
  "uniqueSenders": [
    "String"
  ]
}
```

