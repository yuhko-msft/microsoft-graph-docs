---
title: "profilePhoto resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# profilePhoto resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                               | Return Type                                | Description                                                 |
| :--------------------------------------------------- | :----------------------------------------- | :---------------------------------------------------------- |
| [List profilePhoto](../api/profilephoto-list.md)     | [profilePhoto](profilePhoto.md) collection | List properties and relationships of a profilePhoto object. |
| [Create profilePhoto](../api/profilephoto-create.md) | [profilePhoto](profilePhoto.md)            | Create a new profilePhoto object.                           |
| [Get profilePhoto](../api/profilephoto-get.md)       | [profilePhoto](profilePhoto.md)            | Read properties and relationships of a profilePhoto object. |
| [Update profilePhoto](../api/profilephoto-update.md) | [profilePhoto](profilePhoto.md)            | Update the properties of a profilePhoto object.             |
| [Delete profilePhoto](../api/profilephoto-delete.md) |                                            | Delete a profilePhoto object.                               |

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
  "@odata.type": "microsoft.graph.profilePhoto",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.profilePhoto",
  "id": "String (identifier)"
}
```
