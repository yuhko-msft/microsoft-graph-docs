---
title: "unifiedRbacResourceScope resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# unifiedRbacResourceScope resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                       | Return Type                                                        | Description                                                              |
| :--------------------------------------------------------------------------- | :----------------------------------------------------------------- | :----------------------------------------------------------------------- |
| [List unifiedRbacResourceScope](../api/unifiedrbacresourcescope-list.md)     | [unifiedRbacResourceScope](unifiedRbacResourceScope.md) collection | List properties and relationships of an unifiedRbacResourceScope object. |
| [Create unifiedRbacResourceScope](../api/unifiedrbacresourcescope-create.md) | [unifiedRbacResourceScope](unifiedRbacResourceScope.md)            | Create a new unifiedRbacResourceScope object.                            |
| [Get unifiedRbacResourceScope](../api/unifiedrbacresourcescope-get.md)       | [unifiedRbacResourceScope](unifiedRbacResourceScope.md)            | Read properties and relationships of an unifiedRbacResourceScope object. |
| [Update unifiedRbacResourceScope](../api/unifiedrbacresourcescope-update.md) | [unifiedRbacResourceScope](unifiedRbacResourceScope.md)            | Update the properties of an unifiedRbacResourceScope object.             |
| [Delete unifiedRbacResourceScope](../api/unifiedrbacresourcescope-delete.md) |                                                                    | Delete an unifiedRbacResourceScope object.                               |

## Properties

| Property    | Type   | Description |
| :---------- | :----- | :---------- |
| displayName | String |             |
| id          | String | Read-only.  |
| scope       | String |             |
| type        | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unifiedRbacResourceScope",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceScope",
  "displayName": "String",
  "id": "String (identifier)",
  "scope": "String",
  "type": "String"
}
```
