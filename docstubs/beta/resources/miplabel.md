---
title: "mipLabel resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# mipLabel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                        | Return Type                                         | Description                                             |
| :------------------------------------------------------------ | :-------------------------------------------------- | :------------------------------------------------------ |
| [List mipLabel](../api/miplabel-list.md)                      | [mipLabel](mipLabel.md) collection                  | List properties and relationships of a mipLabel object. |
| [Create mipLabel](../api/miplabel-create.md)                  | [mipLabel](mipLabel.md)                             | Create a new mipLabel object.                           |
| [Get mipLabel](../api/miplabel-get.md)                        | [mipLabel](mipLabel.md)                             | Read properties and relationships of a mipLabel object. |
| [Update mipLabel](../api/miplabel-update.md)                  | [mipLabel](mipLabel.md)                             | Update the properties of a mipLabel object.             |
| [Delete mipLabel](../api/miplabel-delete.md)                  |                                                     | Delete a mipLabel object.                               |
| [checkMemberGroups](../api/miplabel-checkMemberGroups.md)     |                                                     |                                                         |
| [checkMemberObjects](../api/miplabel-checkMemberObjects.md)   |                                                     |                                                         |
| [getByIds](../api/miplabel-getByIds.md)                       |                                                     |                                                         |
| [getMemberGroups](../api/miplabel-getMemberGroups.md)         |                                                     |                                                         |
| [getMemberObjects](../api/miplabel-getMemberObjects.md)       |                                                     |                                                         |
| [getUserOwnedObjects](../api/miplabel-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md) |                                                         |
| [restore](../api/miplabel-restore.md)                         | [directoryObject](../resources/-directoryobject.md) |                                                         |
| [validateProperties](../api/miplabel-validateProperties.md)   |                                                     |                                                         |

## Properties

| Property           | Type                                                                     | Description |
| :----------------- | :----------------------------------------------------------------------- | :---------- |
| deletedDateTime    | DateTimeOffset                                                           |             |
| displayName        | String                                                                   |             |
| id                 | String                                                                   | Read-only.  |
| labelId            | String                                                                   |             |
| protectGroupAction | [mipProtectGroupLabelAction](../resources/mipprotectgrouplabelaction.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mipLabel",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.mipLabel",
  "deletedDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String (identifier)",
  "labelId": "String",
  "protectGroupAction": {"@odata.type": "microsoft.graph.mipProtectGroupLabelAction"}
}
```
