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

| Method                                                        | Return Type                                       | Description                                                                |
| :------------------------------------------------------------ | :------------------------------------------------ | :------------------------------------------------------------------------- |
| [List user](../api/user-list.md)                              | [user](user.md) collection                        | List properties and relationships of a user object.                        |
| [Create user](../api/user-create.md)                          | [user](user.md)                                   | Create a new user object.                                                  |
| [Get user](../api/user-get.md)                                | [user](user.md)                                   | Read properties and relationships of a user object.                        |
| [Update user](../api/user-update.md)                          | [user](user.md)                                   | Update the properties of a user object.                                    |
| [Delete user](../api/user-delete.md)                          |                                                   | Delete a user object.                                                      |
| [List authentication](../api/user-list-authentication.md)     | [authentication](../resources/-authentication.md) | Get the authentication objects from an authentication navigation property. |
| [Create authentication](../api/user-post-authentication.md)   | [authentication](../resources/-authentication.md) | Create a new authentication object.                                        |
| [Get authentication](../api/user-get-authentication.md)       | [authentication](../resources/-authentication.md) | Read the properties and relationships of an authentication object.         |
| [Update authentication](../api/user-update-authentication.md) | [authentication](../resources/-authentication.md) | Update the properties of an authentication object.                         |
| [Delete authentication](../api/user-delete-authentication.md) |                                                   | Delete an authentication object.                                           |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship   | Type                                             | Description |
| :------------- | :----------------------------------------------- | :---------- |
| authentication | [authentication](../resources/authentication.md) |             |

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
  "id": "String (identifier)"
}
```
