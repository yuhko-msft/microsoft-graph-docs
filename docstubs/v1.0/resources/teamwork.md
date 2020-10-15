---
title: "teamwork resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# teamwork resource type

Namespace: microsoft.graph

## Methods

| Method                                       | Return Type                        | Description                                             |
| :------------------------------------------- | :--------------------------------- | :------------------------------------------------------ |
| [List teamwork](../api/teamwork-list.md)     | [teamwork](teamwork.md) collection | List properties and relationships of a teamwork object. |
| [Create teamwork](../api/teamwork-create.md) | [teamwork](teamwork.md)            | Create a new teamwork object.                           |
| [Get teamwork](../api/teamwork-get.md)       | [teamwork](teamwork.md)            | Read properties and relationships of a teamwork object. |
| [Update teamwork](../api/teamwork-update.md) | [teamwork](teamwork.md)            | Update the properties of a teamwork object.             |
| [Delete teamwork](../api/teamwork-delete.md) |                                    | Delete a teamwork object.                               |

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
  "@odata.type": "microsoft.graph.teamwork",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.teamwork",
  "id": "String (identifier)"
}
```
