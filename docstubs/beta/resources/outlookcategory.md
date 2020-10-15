---
title: "outlookCategory resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# outlookCategory resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                     | Return Type                                      | Description                                                     |
| :--------------------------------------------------------- | :----------------------------------------------- | :-------------------------------------------------------------- |
| [List outlookCategory](../api/outlookcategory-list.md)     | [outlookCategory](outlookCategory.md) collection | List properties and relationships of an outlookCategory object. |
| [Create outlookCategory](../api/outlookcategory-create.md) | [outlookCategory](outlookCategory.md)            | Create a new outlookCategory object.                            |
| [Get outlookCategory](../api/outlookcategory-get.md)       | [outlookCategory](outlookCategory.md)            | Read properties and relationships of an outlookCategory object. |
| [Update outlookCategory](../api/outlookcategory-update.md) | [outlookCategory](outlookCategory.md)            | Update the properties of an outlookCategory object.             |
| [Delete outlookCategory](../api/outlookcategory-delete.md) |                                                  | Delete an outlookCategory object.                               |

## Properties

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| color       | String |             |
| displayName | String |             |
| id          | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookCategory",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.outlookCategory",
  "color": "preset0 | preset1 | none | preset2 | preset3 | preset4 | preset5 | preset6 | preset7 | preset8 | preset9 | preset10 | preset11 | preset12 | preset13 | preset14 | preset15 | preset16 | preset17 | preset18 | preset19 | preset20 | preset21 | preset22 | preset23 | preset24",
  "displayName": "String",
  "id": "String (identifier)"
}
```
