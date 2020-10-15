---
title: "userScopeTeamsAppInstallation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userScopeTeamsAppInstallation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [teamsAppInstallation](teamsappinstallation.md)

## Methods

| Method                                                                                 | Return Type                                                                  | Description                                                                  |
| :------------------------------------------------------------------------------------- | :--------------------------------------------------------------------------- | :--------------------------------------------------------------------------- |
| [List userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-list.md)     | [userScopeTeamsAppInstallation](userScopeTeamsAppInstallation.md) collection | List properties and relationships of a userScopeTeamsAppInstallation object. |
| [Create userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-create.md) | [userScopeTeamsAppInstallation](userScopeTeamsAppInstallation.md)            | Create a new userScopeTeamsAppInstallation object.                           |
| [Get userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-get.md)       | [userScopeTeamsAppInstallation](userScopeTeamsAppInstallation.md)            | Read properties and relationships of a userScopeTeamsAppInstallation object. |
| [Update userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-update.md) | [userScopeTeamsAppInstallation](userScopeTeamsAppInstallation.md)            | Update the properties of a userScopeTeamsAppInstallation object.             |
| [Delete userScopeTeamsAppInstallation](../api/userscopeteamsappinstallation-delete.md) |                                                                              | Delete a userScopeTeamsAppInstallation object.                               |
| [List chat](../api/userscopeteamsappinstallation-list-chat.md)                         | [chat](../resources/-chat.md)                                                | Get the chat objects from a chat navigation property.                        |
| [Add chat](../api/userscopeteamsappinstallation-post-chat.md)                          | [chat](../resources/-chat.md)                                                | Add chat by posting to the chat collection.                                  |
| [Get chat](../api/userscopeteamsappinstallation-get-chat.md)                           | [chat](../resources/-chat.md)                                                | Read the properties and relationships of a chat object.                      |
| [Update chat](../api/userscopeteamsappinstallation-update-chat.md)                     | [chat](../resources/-chat.md)                                                | Update the properties of a chat object.                                      |
| [Remove chat](../api/userscopeteamsappinstallation-delete-chat.md)                     |                                                                              | Remove a chat object.                                                        |

## Properties

| Property                                      | Type              | Description |
| :-------------------------------------------- | :---------------- | :---------- |
| grantedResourceSpecificApplicationPermissions | String collection |             |
| id                                            | String            | Read-only.  |

## Relationships

| Relationship       | Type                                                     | Description |
| :----------------- | :------------------------------------------------------- | :---------- |
| chat               | [chat](../resources/chat.md)                             |             |
| teamsApp           | [teamsApp](../resources/teamsapp.md)                     |             |
| teamsAppDefinition | [teamsAppDefinition](../resources/teamsappdefinition.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userScopeTeamsAppInstallation",
  "baseType": "microsoft.graph.teamsAppInstallation",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userScopeTeamsAppInstallation",
  "grantedResourceSpecificApplicationPermissions": ["String"],
  "id": "String (identifier)"
}
```
