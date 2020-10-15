---
title: "outlookItem resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# outlookItem resource type

Namespace: microsoft.graph

## Methods

| Method                                             | Return Type                              | Description                                                 |
| :------------------------------------------------- | :--------------------------------------- | :---------------------------------------------------------- |
| [List outlookItem](../api/outlookitem-list.md)     | [outlookItem](outlookItem.md) collection | List properties and relationships of an outlookItem object. |
| [Create outlookItem](../api/outlookitem-create.md) | [outlookItem](outlookItem.md)            | Create a new outlookItem object.                            |
| [Get outlookItem](../api/outlookitem-get.md)       | [outlookItem](outlookItem.md)            | Read properties and relationships of an outlookItem object. |
| [Update outlookItem](../api/outlookitem-update.md) | [outlookItem](outlookItem.md)            | Update the properties of an outlookItem object.             |
| [Delete outlookItem](../api/outlookitem-delete.md) |                                          | Delete an outlookItem object.                               |

## Properties

| Property             | Type              | Description |
| :------------------- | :---------------- | :---------- |
| categories           | String collection |             |
| changeKey            | String            |             |
| createdDateTime      | DateTimeOffset    |             |
| id                   | String            | Read-only.  |
| lastModifiedDateTime | DateTimeOffset    |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookItem",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.outlookItem",
  "categories": ["String"],
  "changeKey": "String",
  "createdDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "lastModifiedDateTime": "DateTimeOffset"
}
```
