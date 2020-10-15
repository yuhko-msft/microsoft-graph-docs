---
title: "teamsTab resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# teamsTab resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                | Return Type                           | Description                                                   |
| :---------------------------------------------------- | :------------------------------------ | :------------------------------------------------------------ |
| [List teamsTab](../api/teamstab-list.md)              | [teamsTab](teamsTab.md) collection    | List properties and relationships of a teamsTab object.       |
| [Create teamsTab](../api/teamstab-create.md)          | [teamsTab](teamsTab.md)               | Create a new teamsTab object.                                 |
| [Get teamsTab](../api/teamstab-get.md)                | [teamsTab](teamsTab.md)               | Read properties and relationships of a teamsTab object.       |
| [Update teamsTab](../api/teamstab-update.md)          | [teamsTab](teamsTab.md)               | Update the properties of a teamsTab object.                   |
| [Delete teamsTab](../api/teamstab-delete.md)          |                                       | Delete a teamsTab object.                                     |
| [List teamsApp](../api/teamstab-list-teamsapp.md)     | [teamsApp](../resources/-teamsapp.md) | Get the teamsApp objects from a teamsApp navigation property. |
| [Add teamsApp](../api/teamstab-post-teamsapp.md)      | [teamsApp](../resources/-teamsapp.md) | Add teamsApp by posting to the teamsApp collection.           |
| [Get teamsApp](../api/teamstab-get-teamsapp.md)       | [teamsApp](../resources/-teamsapp.md) | Read the properties and relationships of a teamsApp object.   |
| [Update teamsApp](../api/teamstab-update-teamsapp.md) | [teamsApp](../resources/-teamsapp.md) | Update the properties of a teamsApp object.                   |
| [Remove teamsApp](../api/teamstab-delete-teamsapp.md) |                                       | Remove a teamsApp object.                                     |

## Properties

| Property       | Type                                                           | Description |
| :------------- | :------------------------------------------------------------- | :---------- |
| configuration  | [teamsTabConfiguration](../resources/teamstabconfiguration.md) |             |
| displayName    | String                                                         |             |
| id             | String                                                         | Read-only.  |
| messageId      | String                                                         |             |
| sortOrderIndex | String                                                         |             |
| teamsAppId     | String                                                         |             |
| webUrl         | String                                                         |             |

## Relationships

| Relationship | Type                                 | Description |
| :----------- | :----------------------------------- | :---------- |
| teamsApp     | [teamsApp](../resources/teamsapp.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsTab",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamsTab",
  "configuration": {"@odata.type": "microsoft.graph.teamsTabConfiguration"},
  "displayName": "String",
  "id": "String (identifier)",
  "messageId": "String",
  "sortOrderIndex": "String",
  "teamsAppId": "String",
  "webUrl": "String"
}
```
