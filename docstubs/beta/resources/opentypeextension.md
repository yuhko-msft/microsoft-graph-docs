---
title: "openTypeExtension resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# openTypeExtension resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [extension](extension.md)

## Methods

| Method                                                         | Return Type                                          | Description                                                       |
| :------------------------------------------------------------- | :--------------------------------------------------- | :---------------------------------------------------------------- |
| [List openTypeExtension](../api/opentypeextension-list.md)     | [openTypeExtension](openTypeExtension.md) collection | List properties and relationships of an openTypeExtension object. |
| [Create openTypeExtension](../api/opentypeextension-create.md) | [openTypeExtension](openTypeExtension.md)            | Create a new openTypeExtension object.                            |
| [Get openTypeExtension](../api/opentypeextension-get.md)       | [openTypeExtension](openTypeExtension.md)            | Read properties and relationships of an openTypeExtension object. |
| [Update openTypeExtension](../api/opentypeextension-update.md) | [openTypeExtension](openTypeExtension.md)            | Update the properties of an openTypeExtension object.             |
| [Delete openTypeExtension](../api/opentypeextension-delete.md) |                                                      | Delete an openTypeExtension object.                               |

## Properties

| Property      | Type   | Description |
| :------------ | :----- | :---------- |
| extensionName | String |             |
| id            | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.openTypeExtension",
  "baseType": "microsoft.graph.extension",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.openTypeExtension",
  "extensionName": "String",
  "id": "String (identifier)"
}
```
