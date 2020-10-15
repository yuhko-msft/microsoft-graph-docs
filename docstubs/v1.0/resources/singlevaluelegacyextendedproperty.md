---
title: "singleValueLegacyExtendedProperty resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# singleValueLegacyExtendedProperty resource type

Namespace: microsoft.graph

## Methods

| Method                                                                                         | Return Type                                                                          | Description                                                                      |
| :--------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- |
| [List singleValueLegacyExtendedProperty](../api/singlevaluelegacyextendedproperty-list.md)     | [singleValueLegacyExtendedProperty](singleValueLegacyExtendedProperty.md) collection | List properties and relationships of a singleValueLegacyExtendedProperty object. |
| [Create singleValueLegacyExtendedProperty](../api/singlevaluelegacyextendedproperty-create.md) | [singleValueLegacyExtendedProperty](singleValueLegacyExtendedProperty.md)            | Create a new singleValueLegacyExtendedProperty object.                           |
| [Get singleValueLegacyExtendedProperty](../api/singlevaluelegacyextendedproperty-get.md)       | [singleValueLegacyExtendedProperty](singleValueLegacyExtendedProperty.md)            | Read properties and relationships of a singleValueLegacyExtendedProperty object. |
| [Update singleValueLegacyExtendedProperty](../api/singlevaluelegacyextendedproperty-update.md) | [singleValueLegacyExtendedProperty](singleValueLegacyExtendedProperty.md)            | Update the properties of a singleValueLegacyExtendedProperty object.             |
| [Delete singleValueLegacyExtendedProperty](../api/singlevaluelegacyextendedproperty-delete.md) |                                                                                      | Delete a singleValueLegacyExtendedProperty object.                               |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |
| value    | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.singleValueLegacyExtendedProperty",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.singleValueLegacyExtendedProperty",
  "id": "String (identifier)",
  "value": "String"
}
```
