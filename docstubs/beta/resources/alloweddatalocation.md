---
title: "allowedDataLocation resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# allowedDataLocation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                             | Return Type                                              | Description                                                         |
| :----------------------------------------------------------------- | :------------------------------------------------------- | :------------------------------------------------------------------ |
| [List allowedDataLocation](../api/alloweddatalocation-list.md)     | [allowedDataLocation](allowedDataLocation.md) collection | List properties and relationships of an allowedDataLocation object. |
| [Create allowedDataLocation](../api/alloweddatalocation-create.md) | [allowedDataLocation](allowedDataLocation.md)            | Create a new allowedDataLocation object.                            |
| [Get allowedDataLocation](../api/alloweddatalocation-get.md)       | [allowedDataLocation](allowedDataLocation.md)            | Read properties and relationships of an allowedDataLocation object. |
| [Update allowedDataLocation](../api/alloweddatalocation-update.md) | [allowedDataLocation](allowedDataLocation.md)            | Update the properties of an allowedDataLocation object.             |
| [Delete allowedDataLocation](../api/alloweddatalocation-delete.md) |                                                          | Delete an allowedDataLocation object.                               |

## Properties

| Property  | Type    | Description |
| :-------- | :------ | :---------- |
| appId     | String  |             |
| domain    | String  |             |
| id        | String  | Read-only.  |
| isDefault | Boolean |             |
| location  | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.allowedDataLocation",
  "baseType": "microsoft.graph.entity",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.allowedDataLocation",
  "appId": "String",
  "domain": "String",
  "id": "String (identifier)",
  "isDefault": "Boolean",
  "location": "String"
}
```
