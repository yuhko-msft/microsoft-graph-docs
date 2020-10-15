---
title: "teamsAppDefinition resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# teamsAppDefinition resource type

Namespace: microsoft.graph

## Methods

| Method                                                           | Return Type                                            | Description                                                       |
| :--------------------------------------------------------------- | :----------------------------------------------------- | :---------------------------------------------------------------- |
| [List teamsAppDefinition](../api/teamsappdefinition-list.md)     | [teamsAppDefinition](teamsAppDefinition.md) collection | List properties and relationships of a teamsAppDefinition object. |
| [Create teamsAppDefinition](../api/teamsappdefinition-create.md) | [teamsAppDefinition](teamsAppDefinition.md)            | Create a new teamsAppDefinition object.                           |
| [Get teamsAppDefinition](../api/teamsappdefinition-get.md)       | [teamsAppDefinition](teamsAppDefinition.md)            | Read properties and relationships of a teamsAppDefinition object. |
| [Update teamsAppDefinition](../api/teamsappdefinition-update.md) | [teamsAppDefinition](teamsAppDefinition.md)            | Update the properties of a teamsAppDefinition object.             |
| [Delete teamsAppDefinition](../api/teamsappdefinition-delete.md) |                                                        | Delete a teamsAppDefinition object.                               |

## Properties

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| displayName | String |             |
| id          | String | Read-only.  |
| teamsAppId  | String |             |
| version     | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsAppDefinition",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamsAppDefinition",
  "displayName": "String",
  "id": "String (identifier)",
  "teamsAppId": "String",
  "version": "String"
}
```
