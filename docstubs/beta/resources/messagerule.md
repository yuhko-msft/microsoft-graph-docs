---
title: "messageRule resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# messageRule resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                             | Return Type                              | Description                                                |
| :------------------------------------------------- | :--------------------------------------- | :--------------------------------------------------------- |
| [List messageRule](../api/messagerule-list.md)     | [messageRule](messageRule.md) collection | List properties and relationships of a messageRule object. |
| [Create messageRule](../api/messagerule-create.md) | [messageRule](messageRule.md)            | Create a new messageRule object.                           |
| [Get messageRule](../api/messagerule-get.md)       | [messageRule](messageRule.md)            | Read properties and relationships of a messageRule object. |
| [Update messageRule](../api/messagerule-update.md) | [messageRule](messageRule.md)            | Update the properties of a messageRule object.             |
| [Delete messageRule](../api/messagerule-delete.md) |                                          | Delete a messageRule object.                               |

## Properties

| Property    | Type                                                           | Description |
| :---------- | :------------------------------------------------------------- | :---------- |
| actions     | [messageRuleActions](../resources/messageruleactions.md)       |             |
| conditions  | [messageRulePredicates](../resources/messagerulepredicates.md) |             |
| displayName | String                                                         |             |
| exceptions  | [messageRulePredicates](../resources/messagerulepredicates.md) |             |
| hasError    | Boolean                                                        |             |
| id          | String                                                         | Read-only.  |
| isEnabled   | Boolean                                                        |             |
| isReadOnly  | Boolean                                                        |             |
| sequence    | Int32                                                          |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.messageRule",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.messageRule",
  "actions": {"@odata.type": "microsoft.graph.messageRuleActions"},
  "conditions": {"@odata.type": "microsoft.graph.messageRulePredicates"},
  "displayName": "String",
  "exceptions": {"@odata.type": "microsoft.graph.messageRulePredicates"},
  "hasError": "Boolean",
  "id": "String (identifier)",
  "isEnabled": "Boolean",
  "isReadOnly": "Boolean",
  "sequence": "Int32"
}
```
