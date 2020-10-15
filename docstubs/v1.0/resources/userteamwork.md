---
title: "userTeamwork resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userTeamwork resource type

Namespace: microsoft.graph

## Methods

| Method                                                              | Return Type                                                                     | Description                                                                              |
| :------------------------------------------------------------------ | :------------------------------------------------------------------------------ | :--------------------------------------------------------------------------------------- |
| [List userTeamwork](../api/userteamwork-list.md)                    | [userTeamwork](userTeamwork.md) collection                                      | List properties and relationships of a userTeamwork object.                              |
| [Create userTeamwork](../api/userteamwork-create.md)                | [userTeamwork](userTeamwork.md)                                                 | Create a new userTeamwork object.                                                        |
| [Get userTeamwork](../api/userteamwork-get.md)                      | [userTeamwork](userTeamwork.md)                                                 | Read properties and relationships of a userTeamwork object.                              |
| [Update userTeamwork](../api/userteamwork-update.md)                | [userTeamwork](userTeamwork.md)                                                 | Update the properties of a userTeamwork object.                                          |
| [Delete userTeamwork](../api/userteamwork-delete.md)                |                                                                                 | Delete a userTeamwork object.                                                            |
| [List installedApps](../api/userteamwork-list-installedapps.md)     | [userScopeTeamsAppInstallation](../resources/-userscopeteamsappinstallation.md) | Get the userScopeTeamsAppInstallation objects from an installedApps navigation property. |
| [Create installedApps](../api/userteamwork-post-installedapps.md)   | [userScopeTeamsAppInstallation](../resources/-userscopeteamsappinstallation.md) | Create a new userScopeTeamsAppInstallation object.                                       |
| [Get installedApps](../api/userteamwork-get-installedapps.md)       | [userScopeTeamsAppInstallation](../resources/-userscopeteamsappinstallation.md) | Read the properties and relationships of a userScopeTeamsAppInstallation object.         |
| [Update installedApps](../api/userteamwork-update-installedapps.md) | [userScopeTeamsAppInstallation](../resources/-userscopeteamsappinstallation.md) | Update the properties of a userScopeTeamsAppInstallation object.                         |
| [Delete installedApps](../api/userteamwork-delete-installedapps.md) |                                                                                 | Delete a userScopeTeamsAppInstallation object.                                           |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship  | Type                                                                                      | Description |
| :------------ | :---------------------------------------------------------------------------------------- | :---------- |
| installedApps | [userScopeTeamsAppInstallation](../resources/userscopeteamsappinstallation.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userTeamwork",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userTeamwork",
  "id": "String (identifier)"
}
```
