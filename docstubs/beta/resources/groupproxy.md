---
title: "groupProxy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# groupProxy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                          | Return Type                                         | Description                                               |
| :-------------------------------------------------------------- | :-------------------------------------------------- | :-------------------------------------------------------- |
| [List groupProxy](../api/groupproxy-list.md)                    | [groupProxy](groupProxy.md) collection              | List properties and relationships of a groupProxy object. |
| [Create groupProxy](../api/groupproxy-create.md)                | [groupProxy](groupProxy.md)                         | Create a new groupProxy object.                           |
| [Get groupProxy](../api/groupproxy-get.md)                      | [groupProxy](groupProxy.md)                         | Read properties and relationships of a groupProxy object. |
| [Update groupProxy](../api/groupproxy-update.md)                | [groupProxy](groupProxy.md)                         | Update the properties of a groupProxy object.             |
| [Delete groupProxy](../api/groupproxy-delete.md)                |                                                     | Delete a groupProxy object.                               |
| [checkMemberGroups](../api/groupproxy-checkMemberGroups.md)     |                                                     |                                                           |
| [checkMemberObjects](../api/groupproxy-checkMemberObjects.md)   |                                                     |                                                           |
| [getByIds](../api/groupproxy-getByIds.md)                       |                                                     |                                                           |
| [getMemberGroups](../api/groupproxy-getMemberGroups.md)         |                                                     |                                                           |
| [getMemberObjects](../api/groupproxy-getMemberObjects.md)       |                                                     |                                                           |
| [getUserOwnedObjects](../api/groupproxy-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md) |                                                           |
| [restore](../api/groupproxy-restore.md)                         | [directoryObject](../resources/-directoryobject.md) |                                                           |
| [validateProperties](../api/groupproxy-validateProperties.md)   |                                                     |                                                           |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| deletedDateTime | DateTimeOffset |             |
| id              | String         | Read-only.  |
| remoteGroupId   | Guid           |             |
| remoteTenantId  | Guid           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.groupProxy",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.groupProxy",
  "deletedDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "remoteGroupId": "Guid",
  "remoteTenantId": "Guid"
}
```
