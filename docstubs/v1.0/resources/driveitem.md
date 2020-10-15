---
title: "driveItem resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# driveItem resource type

Namespace: microsoft.graph

## Methods

| Method                                         | Return Type                          | Description                                              |
| :--------------------------------------------- | :----------------------------------- | :------------------------------------------------------- |
| [List driveItem](../api/driveitem-list.md)     | [driveItem](driveItem.md) collection | List properties and relationships of a driveItem object. |
| [Create driveItem](../api/driveitem-create.md) | [driveItem](driveItem.md)            | Create a new driveItem object.                           |
| [Get driveItem](../api/driveitem-get.md)       | [driveItem](driveItem.md)            | Read properties and relationships of a driveItem object. |
| [Update driveItem](../api/driveitem-update.md) | [driveItem](driveItem.md)            | Update the properties of a driveItem object.             |
| [Delete driveItem](../api/driveitem-delete.md) |                                      | Delete a driveItem object.                               |

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
  "@odata.type": "microsoft.graph.driveItem",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.driveItem",
  "id": "String (identifier)"
}
```
