---
title: "policyBase resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# policyBase resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                  | Return Type                                         | Description                                               |
| :-------------------------------------------------------------------------------------- | :-------------------------------------------------- | :-------------------------------------------------------- |
| [List policyBase](../api/policybase-list.md)                                            | [policyBase](policyBase.md) collection              | List properties and relationships of a policyBase object. |
| [Create policyBase](../api/policybase-create.md)                                        | [policyBase](policyBase.md)                         | Create a new policyBase object.                           |
| [Get policyBase](../api/policybase-get.md)                                              | [policyBase](policyBase.md)                         | Read properties and relationships of a policyBase object. |
| [Update policyBase](../api/policybase-update.md)                                        | [policyBase](policyBase.md)                         | Update the properties of a policyBase object.             |
| [Delete policyBase](../api/policybase-delete.md)                                        |                                                     | Delete a policyBase object.                               |
| [checkMemberGroups](../api/policybase-checkMemberGroups.md)                             |                                                     |                                                           |
| [checkMemberObjects](../api/policybase-checkMemberObjects.md)                           |                                                     |                                                           |
| [getAvailableExtensionProperties](../api/policybase-getAvailableExtensionProperties.md) |                                                     |                                                           |
| [getByIds](../api/policybase-getByIds.md)                                               |                                                     |                                                           |
| [getMemberGroups](../api/policybase-getMemberGroups.md)                                 |                                                     |                                                           |
| [getMemberObjects](../api/policybase-getMemberObjects.md)                               |                                                     |                                                           |
| [restore](../api/policybase-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md) |                                                           |
| [validateProperties](../api/policybase-validateProperties.md)                           |                                                     |                                                           |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| deletedDateTime | DateTimeOffset |             |
| description     | String         |             |
| displayName     | String         |             |
| id              | String         | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.policyBase",
  "baseType": "microsoft.graph.directoryObject",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.policyBase",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)"
}
```
