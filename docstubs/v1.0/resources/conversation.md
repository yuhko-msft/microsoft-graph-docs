---
title: "conversation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# conversation resource type

Namespace: microsoft.graph

## Methods

| Method                                                  | Return Type                                               | Description                                                            |
| :------------------------------------------------------ | :-------------------------------------------------------- | :--------------------------------------------------------------------- |
| [List conversation](../api/conversation-list.md)        | [conversation](conversation.md) collection                | List properties and relationships of a conversation object.            |
| [Create conversation](../api/conversation-create.md)    | [conversation](conversation.md)                           | Create a new conversation object.                                      |
| [Get conversation](../api/conversation-get.md)          | [conversation](conversation.md)                           | Read properties and relationships of a conversation object.            |
| [Update conversation](../api/conversation-update.md)    | [conversation](conversation.md)                           | Update the properties of a conversation object.                        |
| [Delete conversation](../api/conversation-delete.md)    |                                                           | Delete a conversation object.                                          |
| [List threads](../api/conversation-list-threads.md)     | [conversationThread](../resources/-conversationthread.md) | Get the conversationThread objects from a threads navigation property. |
| [Create threads](../api/conversation-post-threads.md)   | [conversationThread](../resources/-conversationthread.md) | Create a new conversationThread object.                                |
| [Get threads](../api/conversation-get-threads.md)       | [conversationThread](../resources/-conversationthread.md) | Read the properties and relationships of a conversationThread object.  |
| [Update threads](../api/conversation-update-threads.md) | [conversationThread](../resources/-conversationthread.md) | Update the properties of a conversationThread object.                  |
| [Delete threads](../api/conversation-delete-threads.md) |                                                           | Delete a conversationThread object.                                    |

## Properties

| Property              | Type              | Description |
| :-------------------- | :---------------- | :---------- |
| hasAttachments        | Boolean           |             |
| id                    | String            | Read-only.  |
| lastDeliveredDateTime | DateTimeOffset    |             |
| preview               | String            |             |
| topic                 | String            |             |
| uniqueSenders         | String collection |             |

## Relationships

| Relationship | Type                                                                | Description |
| :----------- | :------------------------------------------------------------------ | :---------- |
| threads      | [conversationThread](../resources/conversationthread.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.conversation",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.conversation",
  "hasAttachments": "Boolean",
  "id": "String (identifier)",
  "lastDeliveredDateTime": "DateTimeOffset",
  "preview": "String",
  "topic": "String",
  "uniqueSenders": ["String"]
}
```
