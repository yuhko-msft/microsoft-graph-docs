---
title: "scopedRoleMembership resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# scopedRoleMembership resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                               | Return Type                                                | Description                                                         |
| :------------------------------------------------------------------- | :--------------------------------------------------------- | :------------------------------------------------------------------ |
| [List scopedRoleMembership](../api/scopedrolemembership-list.md)     | [scopedRoleMembership](scopedRoleMembership.md) collection | List properties and relationships of a scopedRoleMembership object. |
| [Create scopedRoleMembership](../api/scopedrolemembership-create.md) | [scopedRoleMembership](scopedRoleMembership.md)            | Create a new scopedRoleMembership object.                           |
| [Get scopedRoleMembership](../api/scopedrolemembership-get.md)       | [scopedRoleMembership](scopedRoleMembership.md)            | Read properties and relationships of a scopedRoleMembership object. |
| [Update scopedRoleMembership](../api/scopedrolemembership-update.md) | [scopedRoleMembership](scopedRoleMembership.md)            | Update the properties of a scopedRoleMembership object.             |
| [Delete scopedRoleMembership](../api/scopedrolemembership-delete.md) |                                                            | Delete a scopedRoleMembership object.                               |

## Properties

| Property             | Type                                 | Description |
| :------------------- | :----------------------------------- | :---------- |
| administrativeUnitId | String                               |             |
| id                   | String                               | Read-only.  |
| roleId               | String                               |             |
| roleMemberInfo       | [identity](../resources/identity.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.scopedRoleMembership",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.scopedRoleMembership",
  "administrativeUnitId": "String",
  "id": "String (identifier)",
  "roleId": "String",
  "roleMemberInfo": {"@odata.type": "microsoft.graph.identity"}
}
```
