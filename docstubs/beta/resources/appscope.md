---
title: "appScope resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# appScope resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                       | Return Type                        | Description                                              |
| :------------------------------------------- | :--------------------------------- | :------------------------------------------------------- |
| [List appScope](../api/appscope-list.md)     | [appScope](appScope.md) collection | List properties and relationships of an appScope object. |
| [Create appScope](../api/appscope-create.md) | [appScope](appScope.md)            | Create a new appScope object.                            |
| [Get appScope](../api/appscope-get.md)       | [appScope](appScope.md)            | Read properties and relationships of an appScope object. |
| [Update appScope](../api/appscope-update.md) | [appScope](appScope.md)            | Update the properties of an appScope object.             |
| [Delete appScope](../api/appscope-delete.md) |                                    | Delete an appScope object.                               |

## Properties

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| displayName | String |             |
| id          | String | Read-only.  |
| type        | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.appScope",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.appScope",
  "displayName": "String",
  "id": "String (identifier)",
  "type": "String"
}
```
