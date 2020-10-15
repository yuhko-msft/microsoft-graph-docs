---
title: "teamsTemplate resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# teamsTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                 | Return Type                                  | Description                                                  |
| :----------------------------------------------------- | :------------------------------------------- | :----------------------------------------------------------- |
| [List teamsTemplate](../api/teamstemplate-list.md)     | [teamsTemplate](teamsTemplate.md) collection | List properties and relationships of a teamsTemplate object. |
| [Create teamsTemplate](../api/teamstemplate-create.md) | [teamsTemplate](teamsTemplate.md)            | Create a new teamsTemplate object.                           |
| [Get teamsTemplate](../api/teamstemplate-get.md)       | [teamsTemplate](teamsTemplate.md)            | Read properties and relationships of a teamsTemplate object. |
| [Update teamsTemplate](../api/teamstemplate-update.md) | [teamsTemplate](teamsTemplate.md)            | Update the properties of a teamsTemplate object.             |
| [Delete teamsTemplate](../api/teamstemplate-delete.md) |                                              | Delete a teamsTemplate object.                               |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamsTemplate",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamsTemplate",
  "id": "String (identifier)"
}
```
