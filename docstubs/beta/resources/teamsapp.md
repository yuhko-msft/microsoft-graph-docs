---
title: "teamsApp resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# teamsApp resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                            | Return Type                                               | Description                                                                    |
| :---------------------------------------------------------------- | :-------------------------------------------------------- | :----------------------------------------------------------------------------- |
| [List teamsApp](../api/teamsapp-list.md)                          | [teamsApp](teamsApp.md) collection                        | List properties and relationships of a teamsApp object.                        |
| [Create teamsApp](../api/teamsapp-create.md)                      | [teamsApp](teamsApp.md)                                   | Create a new teamsApp object.                                                  |
| [Get teamsApp](../api/teamsapp-get.md)                            | [teamsApp](teamsApp.md)                                   | Read properties and relationships of a teamsApp object.                        |
| [Update teamsApp](../api/teamsapp-update.md)                      | [teamsApp](teamsApp.md)                                   | Update the properties of a teamsApp object.                                    |
| [Delete teamsApp](../api/teamsapp-delete.md)                      |                                                           | Delete a teamsApp object.                                                      |
| [List appDefinitions](../api/teamsapp-list-appdefinitions.md)     | [teamsAppDefinition](../resources/-teamsappdefinition.md) | Get the teamsAppDefinition objects from an appDefinitions navigation property. |
| [Create appDefinitions](../api/teamsapp-post-appdefinitions.md)   | [teamsAppDefinition](../resources/-teamsappdefinition.md) | Create a new teamsAppDefinition object.                                        |
| [Get appDefinitions](../api/teamsapp-get-appdefinitions.md)       | [teamsAppDefinition](../resources/-teamsappdefinition.md) | Read the properties and relationships of a teamsAppDefinition object.          |
| [Update appDefinitions](../api/teamsapp-update-appdefinitions.md) | [teamsAppDefinition](../resources/-teamsappdefinition.md) | Update the properties of a teamsAppDefinition object.                          |
| [Delete appDefinitions](../api/teamsapp-delete-appdefinitions.md) |                                                           | Delete a teamsAppDefinition object.                                            |

## Properties

| Property           | Type   | Description |
| :----------------- | :----- | :---------- |
| displayName        | String |             |
| distributionMethod | String |             |
| externalId         | String |             |
| id                 | String | Read-only.  |

## Relationships

| Relationship   | Type                                                                | Description |
| :------------- | :------------------------------------------------------------------ | :---------- |
| appDefinitions | [teamsAppDefinition](../resources/teamsappdefinition.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsApp",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamsApp",
  "displayName": "String",
  "distributionMethod": "store | organization | sideloaded | unknownFutureValue",
  "externalId": "String",
  "id": "String (identifier)"
}
```
