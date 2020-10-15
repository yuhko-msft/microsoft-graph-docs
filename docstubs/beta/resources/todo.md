---
title: "todo resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# todo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                      | Return Type                                   | Description                                                     |
| :------------------------------------------ | :-------------------------------------------- | :-------------------------------------------------------------- |
| [List todo](../api/todo-list.md)            | [todo](todo.md) collection                    | List properties and relationships of a todo object.             |
| [Create todo](../api/todo-create.md)        | [todo](todo.md)                               | Create a new todo object.                                       |
| [Get todo](../api/todo-get.md)              | [todo](todo.md)                               | Read properties and relationships of a todo object.             |
| [Update todo](../api/todo-update.md)        | [todo](todo.md)                               | Update the properties of a todo object.                         |
| [Delete todo](../api/todo-delete.md)        |                                               | Delete a todo object.                                           |
| [List lists](../api/todo-list-lists.md)     | [todoTaskList](../resources/-todotasklist.md) | Get the todoTaskList objects from a lists navigation property.  |
| [Create lists](../api/todo-post-lists.md)   | [todoTaskList](../resources/-todotasklist.md) | Create a new todoTaskList object.                               |
| [Get lists](../api/todo-get-lists.md)       | [todoTaskList](../resources/-todotasklist.md) | Read the properties and relationships of a todoTaskList object. |
| [Update lists](../api/todo-update-lists.md) | [todoTaskList](../resources/-todotasklist.md) | Update the properties of a todoTaskList object.                 |
| [Delete lists](../api/todo-delete-lists.md) |                                               | Delete a todoTaskList object.                                   |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship | Type                                                    | Description |
| :----------- | :------------------------------------------------------ | :---------- |
| lists        | [todoTaskList](../resources/todotasklist.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.todo",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.todo",
  "id": "String (identifier)"
}
```
