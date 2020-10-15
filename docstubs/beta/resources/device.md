---
title: "device resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# device resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                   | Return Type                    | Description                                           |
| :--------------------------------------- | :----------------------------- | :---------------------------------------------------- |
| [List device](../api/device-list.md)     | [device](device.md) collection | List properties and relationships of a device object. |
| [Create device](../api/device-create.md) | [device](device.md)            | Create a new device object.                           |
| [Get device](../api/device-get.md)       | [device](device.md)            | Read properties and relationships of a device object. |
| [Update device](../api/device-update.md) | [device](device.md)            | Update the properties of a device object.             |
| [Delete device](../api/device-delete.md) |                                | Delete a device object.                               |

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
  "@odata.type": "microsoft.graph.device",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.device",
  "id": "String (identifier)"
}
```
