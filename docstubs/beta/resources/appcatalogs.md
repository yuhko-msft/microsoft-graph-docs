---
title: "appCatalogs resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# appCatalogs resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                     | Return Type                              | Description                                                    |
| :--------------------------------------------------------- | :--------------------------------------- | :------------------------------------------------------------- |
| [List appCatalogs](../api/appcatalogs-list.md)             | [appCatalogs](appCatalogs.md) collection | List properties and relationships of an appCatalogs object.    |
| [Create appCatalogs](../api/appcatalogs-create.md)         | [appCatalogs](appCatalogs.md)            | Create a new appCatalogs object.                               |
| [Get appCatalogs](../api/appcatalogs-get.md)               | [appCatalogs](appCatalogs.md)            | Read properties and relationships of an appCatalogs object.    |
| [Update appCatalogs](../api/appcatalogs-update.md)         | [appCatalogs](appCatalogs.md)            | Update the properties of an appCatalogs object.                |
| [Delete appCatalogs](../api/appcatalogs-delete.md)         |                                          | Delete an appCatalogs object.                                  |
| [List teamsApps](../api/appcatalogs-list-teamsapps.md)     | [teamsApp](../resources/-teamsapp.md)    | Get the teamsApp objects from a teamsApps navigation property. |
| [Create teamsApps](../api/appcatalogs-post-teamsapps.md)   | [teamsApp](../resources/-teamsapp.md)    | Create a new teamsApp object.                                  |
| [Get teamsApps](../api/appcatalogs-get-teamsapps.md)       | [teamsApp](../resources/-teamsapp.md)    | Read the properties and relationships of a teamsApp object.    |
| [Update teamsApps](../api/appcatalogs-update-teamsapps.md) | [teamsApp](../resources/-teamsapp.md)    | Update the properties of a teamsApp object.                    |
| [Delete teamsApps](../api/appcatalogs-delete-teamsapps.md) |                                          | Delete a teamsApp object.                                      |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship | Type                                            | Description |
| :----------- | :---------------------------------------------- | :---------- |
| teamsApps    | [teamsApp](../resources/teamsapp.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.appCatalogs",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.appCatalogs",
  "id": "String (identifier)"
}
```
