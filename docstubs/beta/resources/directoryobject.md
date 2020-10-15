---
title: "directoryObject resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# directoryObject resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                     | Return Type                                      | Description                                                    |
| :--------------------------------------------------------- | :----------------------------------------------- | :------------------------------------------------------------- |
| [List directoryObject](../api/directoryobject-list.md)     | [directoryObject](directoryObject.md) collection | List properties and relationships of a directoryObject object. |
| [Create directoryObject](../api/directoryobject-create.md) | [directoryObject](directoryObject.md)            | Create a new directoryObject object.                           |
| [Get directoryObject](../api/directoryobject-get.md)       | [directoryObject](directoryObject.md)            | Read properties and relationships of a directoryObject object. |
| [Update directoryObject](../api/directoryobject-update.md) | [directoryObject](directoryObject.md)            | Update the properties of a directoryObject object.             |
| [Delete directoryObject](../api/directoryobject-delete.md) |                                                  | Delete a directoryObject object.                               |

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
  "@odata.type": "microsoft.graph.directoryObject",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directoryObject",
  "id": "String (identifier)"
}
```
