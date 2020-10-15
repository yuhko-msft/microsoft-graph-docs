---
title: "userConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# userConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                         | Return Type                                          | Description                                                      |
| :------------------------------------------------------------- | :--------------------------------------------------- | :--------------------------------------------------------------- |
| [List userConfiguration](../api/userconfiguration-list.md)     | [userConfiguration](userConfiguration.md) collection | List properties and relationships of a userConfiguration object. |
| [Create userConfiguration](../api/userconfiguration-create.md) | [userConfiguration](userConfiguration.md)            | Create a new userConfiguration object.                           |
| [Get userConfiguration](../api/userconfiguration-get.md)       | [userConfiguration](userConfiguration.md)            | Read properties and relationships of a userConfiguration object. |
| [Update userConfiguration](../api/userconfiguration-update.md) | [userConfiguration](userConfiguration.md)            | Update the properties of a userConfiguration object.             |
| [Delete userConfiguration](../api/userconfiguration-delete.md) |                                                      | Delete a userConfiguration object.                               |

## Properties

| Property   | Type   | Description |
| :--------- | :----- | :---------- |
| binaryData | Binary |             |
| id         | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.userConfiguration",
  "binaryData": "Binary",
  "id": "String (identifier)"
}
```
