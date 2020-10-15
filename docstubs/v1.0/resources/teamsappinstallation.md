---
title: "teamsAppInstallation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# teamsAppInstallation resource type

Namespace: microsoft.graph

## Methods

| Method                                                                                | Return Type                                                | Description                                                                       |
| :------------------------------------------------------------------------------------ | :--------------------------------------------------------- | :-------------------------------------------------------------------------------- |
| [List teamsAppInstallation](../api/teamsappinstallation-list.md)                      | [teamsAppInstallation](teamsAppInstallation.md) collection | List properties and relationships of a teamsAppInstallation object.               |
| [Create teamsAppInstallation](../api/teamsappinstallation-create.md)                  | [teamsAppInstallation](teamsAppInstallation.md)            | Create a new teamsAppInstallation object.                                         |
| [Get teamsAppInstallation](../api/teamsappinstallation-get.md)                        | [teamsAppInstallation](teamsAppInstallation.md)            | Read properties and relationships of a teamsAppInstallation object.               |
| [Update teamsAppInstallation](../api/teamsappinstallation-update.md)                  | [teamsAppInstallation](teamsAppInstallation.md)            | Update the properties of a teamsAppInstallation object.                           |
| [Delete teamsAppInstallation](../api/teamsappinstallation-delete.md)                  |                                                            | Delete a teamsAppInstallation object.                                             |
| [List teamsApp](../api/teamsappinstallation-list-teamsapp.md)                         | [teamsApp](../resources/-teamsapp.md)                      | Get the teamsApp objects from a teamsApp navigation property.                     |
| [Add teamsApp](../api/teamsappinstallation-post-teamsapp.md)                          | [teamsApp](../resources/-teamsapp.md)                      | Add teamsApp by posting to the teamsApp collection.                               |
| [Get teamsApp](../api/teamsappinstallation-get-teamsapp.md)                           | [teamsApp](../resources/-teamsapp.md)                      | Read the properties and relationships of a teamsApp object.                       |
| [Update teamsApp](../api/teamsappinstallation-update-teamsapp.md)                     | [teamsApp](../resources/-teamsapp.md)                      | Update the properties of a teamsApp object.                                       |
| [Remove teamsApp](../api/teamsappinstallation-delete-teamsapp.md)                     |                                                            | Remove a teamsApp object.                                                         |
| [List teamsAppDefinition](../api/teamsappinstallation-list-teamsappdefinition.md)     | [teamsAppDefinition](../resources/-teamsappdefinition.md)  | Get the teamsAppDefinition objects from a teamsAppDefinition navigation property. |
| [Add teamsAppDefinition](../api/teamsappinstallation-post-teamsappdefinition.md)      | [teamsAppDefinition](../resources/-teamsappdefinition.md)  | Add teamsAppDefinition by posting to the teamsAppDefinition collection.           |
| [Get teamsAppDefinition](../api/teamsappinstallation-get-teamsappdefinition.md)       | [teamsAppDefinition](../resources/-teamsappdefinition.md)  | Read the properties and relationships of a teamsAppDefinition object.             |
| [Update teamsAppDefinition](../api/teamsappinstallation-update-teamsappdefinition.md) | [teamsAppDefinition](../resources/-teamsappdefinition.md)  | Update the properties of a teamsAppDefinition object.                             |
| [Remove teamsAppDefinition](../api/teamsappinstallation-delete-teamsappdefinition.md) |                                                            | Remove a teamsAppDefinition object.                                               |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship       | Type                                                     | Description |
| :----------------- | :------------------------------------------------------- | :---------- |
| teamsApp           | [teamsApp](../resources/teamsapp.md)                     |             |
| teamsAppDefinition | [teamsAppDefinition](../resources/teamsappdefinition.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsAppInstallation",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamsAppInstallation",
  "id": "String (identifier)"
}
```
