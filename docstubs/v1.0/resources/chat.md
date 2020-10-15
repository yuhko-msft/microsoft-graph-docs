---
title: "chat resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# chat resource type

Namespace: microsoft.graph

## Methods

| Method                               | Return Type                | Description                                         |
| :----------------------------------- | :------------------------- | :-------------------------------------------------- |
| [List chat](../api/chat-list.md)     | [chat](chat.md) collection | List properties and relationships of a chat object. |
| [Create chat](../api/chat-create.md) | [chat](chat.md)            | Create a new chat object.                           |
| [Get chat](../api/chat-get.md)       | [chat](chat.md)            | Read properties and relationships of a chat object. |
| [Update chat](../api/chat-update.md) | [chat](chat.md)            | Update the properties of a chat object.             |
| [Delete chat](../api/chat-delete.md) |                            | Delete a chat object.                               |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.chat",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.chat",
  "id": "String (identifier)"
}
```
