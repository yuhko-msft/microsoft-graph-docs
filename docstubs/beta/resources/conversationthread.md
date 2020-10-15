---
title: "conversationThread resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# conversationThread resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                           | Return Type                                            | Description                                                       |
| :--------------------------------------------------------------- | :----------------------------------------------------- | :---------------------------------------------------------------- |
| [List conversationThread](../api/conversationthread-list.md)     | [conversationThread](conversationThread.md) collection | List properties and relationships of a conversationThread object. |
| [Create conversationThread](../api/conversationthread-create.md) | [conversationThread](conversationThread.md)            | Create a new conversationThread object.                           |
| [Get conversationThread](../api/conversationthread-get.md)       | [conversationThread](conversationThread.md)            | Read properties and relationships of a conversationThread object. |
| [Update conversationThread](../api/conversationthread-update.md) | [conversationThread](conversationThread.md)            | Update the properties of a conversationThread object.             |
| [Delete conversationThread](../api/conversationthread-delete.md) |                                                        | Delete a conversationThread object.                               |
| [reply](../api/conversationthread-reply.md)                      |                                                        |                                                                   |
| [List posts](../api/conversationthread-list-posts.md)            | [post](../resources/-post.md)                          | Get the post objects from a posts navigation property.            |
| [Create posts](../api/conversationthread-post-posts.md)          | [post](../resources/-post.md)                          | Create a new post object.                                         |
| [Get posts](../api/conversationthread-get-posts.md)              | [post](../resources/-post.md)                          | Read the properties and relationships of a post object.           |
| [Update posts](../api/conversationthread-update-posts.md)        | [post](../resources/-post.md)                          | Update the properties of a post object.                           |
| [Delete posts](../api/conversationthread-delete-posts.md)        |                                                        | Delete a post object.                                             |

## Properties

| Property              | Type                                              | Description |
| :-------------------- | :------------------------------------------------ | :---------- |
| ccRecipients          | [recipient](../resources/recipient.md) collection |             |
| hasAttachments        | Boolean                                           |             |
| id                    | String                                            | Read-only.  |
| isLocked              | Boolean                                           |             |
| lastDeliveredDateTime | DateTimeOffset                                    |             |
| preview               | String                                            |             |
| toRecipients          | [recipient](../resources/recipient.md) collection |             |
| topic                 | String                                            |             |
| uniqueSenders         | String collection                                 |             |

## Relationships

| Relationship | Type                                    | Description |
| :----------- | :-------------------------------------- | :---------- |
| posts        | [post](../resources/post.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.conversationThread",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.conversationThread",
  "ccRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "hasAttachments": "Boolean",
  "id": "String (identifier)",
  "isLocked": "Boolean",
  "lastDeliveredDateTime": "DateTimeOffset",
  "preview": "String",
  "toRecipients": [{"@odata.type": "microsoft.graph.recipient"}],
  "topic": "String",
  "uniqueSenders": ["String"]
}
```
