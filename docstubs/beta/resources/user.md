---
title: "user resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# user resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                    | Return Type                   | Description                                             |
| :---------------------------------------- | :---------------------------- | :------------------------------------------------------ |
| [List user](../api/user-list.md)          | [user](user.md) collection    | List properties and relationships of a user object.     |
| [Create user](../api/user-create.md)      | [user](user.md)               | Create a new user object.                               |
| [Get user](../api/user-get.md)            | [user](user.md)               | Read properties and relationships of a user object.     |
| [Update user](../api/user-update.md)      | [user](user.md)               | Update the properties of a user object.                 |
| [Delete user](../api/user-delete.md)      |                               | Delete a user object.                                   |
| [List todo](../api/user-list-todo.md)     | [todo](../resources/-todo.md) | Get the todo objects from a todo navigation property.   |
| [Create todo](../api/user-post-todo.md)   | [todo](../resources/-todo.md) | Create a new todo object.                               |
| [Get todo](../api/user-get-todo.md)       | [todo](../resources/-todo.md) | Read the properties and relationships of a todo object. |
| [Update todo](../api/user-update-todo.md) | [todo](../resources/-todo.md) | Update the properties of a todo object.                 |
| [Delete todo](../api/user-delete-todo.md) |                               | Delete a todo object.                                   |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship | Type                         | Description |
| :----------- | :--------------------------- | :---------- |
| todo         | [todo](../resources/todo.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.user",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.user",
}
```
