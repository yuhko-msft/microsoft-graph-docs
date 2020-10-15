---
title: "directoryObject resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# directoryObject resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                               | Return Type                                         | Description                                                    |
| :------------------------------------------------------------------- | :-------------------------------------------------- | :------------------------------------------------------------- |
| [List directoryObject](../api/directoryobject-list.md)               | [directoryObject](directoryObject.md) collection    | List properties and relationships of a directoryObject object. |
| [Create directoryObject](../api/directoryobject-create.md)           | [directoryObject](directoryObject.md)               | Create a new directoryObject object.                           |
| [Get directoryObject](../api/directoryobject-get.md)                 | [directoryObject](directoryObject.md)               | Read properties and relationships of a directoryObject object. |
| [Update directoryObject](../api/directoryobject-update.md)           | [directoryObject](directoryObject.md)               | Update the properties of a directoryObject object.             |
| [Delete directoryObject](../api/directoryobject-delete.md)           |                                                     | Delete a directoryObject object.                               |
| [checkMemberGroups](../api/directoryobject-checkMemberGroups.md)     |                                                     |                                                                |
| [checkMemberObjects](../api/directoryobject-checkMemberObjects.md)   |                                                     |                                                                |
| [getByIds](../api/directoryobject-getByIds.md)                       |                                                     |                                                                |
| [getMemberGroups](../api/directoryobject-getMemberGroups.md)         |                                                     |                                                                |
| [getMemberObjects](../api/directoryobject-getMemberObjects.md)       |                                                     |                                                                |
| [getUserOwnedObjects](../api/directoryobject-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md) |                                                                |
| [restore](../api/directoryobject-restore.md)                         | [directoryObject](../resources/-directoryobject.md) |                                                                |
| [validateProperties](../api/directoryobject-validateProperties.md)   |                                                     |                                                                |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| deletedDateTime | DateTimeOffset |             |
| id              | String         | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directoryObject",
  "baseType": "microsoft.graph.entity",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directoryObject",
  "deletedDateTime": "DateTimeOffset",
  "id": "String (identifier)"
}
```
