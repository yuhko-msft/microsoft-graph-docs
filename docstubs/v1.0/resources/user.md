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

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                  | Return Type                                   | Description                                                       |
| :------------------------------------------------------ | :-------------------------------------------- | :---------------------------------------------------------------- |
| [List user](../api/user-list.md)                        | [user](user.md) collection                    | List properties and relationships of a user object.               |
| [Create user](../api/user-create.md)                    | [user](user.md)                               | Create a new user object.                                         |
| [Get user](../api/user-get.md)                          | [user](user.md)                               | Read properties and relationships of a user object.               |
| [Update user](../api/user-update.md)                    | [user](user.md)                               | Update the properties of a user object.                           |
| [Delete user](../api/user-delete.md)                    |                                               | Delete a user object.                                             |
| [List joinedTeams](../api/user-list-joinedteams.md)     | [team](../resources/-team.md)                 | Get the team objects from a joinedTeams navigation property.      |
| [Create joinedTeams](../api/user-post-joinedteams.md)   | [team](../resources/-team.md)                 | Create a new team object.                                         |
| [Get joinedTeams](../api/user-get-joinedteams.md)       | [team](../resources/-team.md)                 | Read the properties and relationships of a team object.           |
| [Update joinedTeams](../api/user-update-joinedteams.md) | [team](../resources/-team.md)                 | Update the properties of a team object.                           |
| [Delete joinedTeams](../api/user-delete-joinedteams.md) |                                               | Delete a team object.                                             |
| [List teamwork](../api/user-list-teamwork.md)           | [userTeamwork](../resources/-userteamwork.md) | Get the userTeamwork objects from a teamwork navigation property. |
| [Create teamwork](../api/user-post-teamwork.md)         | [userTeamwork](../resources/-userteamwork.md) | Create a new userTeamwork object.                                 |
| [Get teamwork](../api/user-get-teamwork.md)             | [userTeamwork](../resources/-userteamwork.md) | Read the properties and relationships of a userTeamwork object.   |
| [Update teamwork](../api/user-update-teamwork.md)       | [userTeamwork](../resources/-userteamwork.md) | Update the properties of a userTeamwork object.                   |
| [Delete teamwork](../api/user-delete-teamwork.md)       |                                               | Delete a userTeamwork object.                                     |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship | Type                                         | Description |
| :----------- | :------------------------------------------- | :---------- |
| joinedTeams  | [team](../resources/team.md) collection      |             |
| teamwork     | [userTeamwork](../resources/userteamwork.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.user",
  "baseType": "microsoft.graph.directoryObject",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.user",
  "id": "String (identifier)"
}
```
