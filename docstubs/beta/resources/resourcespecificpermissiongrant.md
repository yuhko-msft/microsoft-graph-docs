---
title: "resourceSpecificPermissionGrant resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# resourceSpecificPermissionGrant resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                     | Return Type                                                                      | Description                                                                    |
| :----------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- | :----------------------------------------------------------------------------- |
| [List resourceSpecificPermissionGrant](../api/resourcespecificpermissiongrant-list.md)     | [resourceSpecificPermissionGrant](resourceSpecificPermissionGrant.md) collection | List properties and relationships of a resourceSpecificPermissionGrant object. |
| [Create resourceSpecificPermissionGrant](../api/resourcespecificpermissiongrant-create.md) | [resourceSpecificPermissionGrant](resourceSpecificPermissionGrant.md)            | Create a new resourceSpecificPermissionGrant object.                           |
| [Get resourceSpecificPermissionGrant](../api/resourcespecificpermissiongrant-get.md)       | [resourceSpecificPermissionGrant](resourceSpecificPermissionGrant.md)            | Read properties and relationships of a resourceSpecificPermissionGrant object. |
| [Update resourceSpecificPermissionGrant](../api/resourcespecificpermissiongrant-update.md) | [resourceSpecificPermissionGrant](resourceSpecificPermissionGrant.md)            | Update the properties of a resourceSpecificPermissionGrant object.             |
| [Delete resourceSpecificPermissionGrant](../api/resourcespecificpermissiongrant-delete.md) |                                                                                  | Delete a resourceSpecificPermissionGrant object.                               |
| [checkMemberGroups](../api/resourcespecificpermissiongrant-checkMemberGroups.md)           |                                                                                  |                                                                                |
| [checkMemberObjects](../api/resourcespecificpermissiongrant-checkMemberObjects.md)         |                                                                                  |                                                                                |
| [getByIds](../api/resourcespecificpermissiongrant-getByIds.md)                             |                                                                                  |                                                                                |
| [getMemberGroups](../api/resourcespecificpermissiongrant-getMemberGroups.md)               |                                                                                  |                                                                                |
| [getMemberObjects](../api/resourcespecificpermissiongrant-getMemberObjects.md)             |                                                                                  |                                                                                |
| [getUserOwnedObjects](../api/resourcespecificpermissiongrant-getUserOwnedObjects.md)       | [directoryObject](../resources/-directoryobject.md)                              |                                                                                |
| [restore](../api/resourcespecificpermissiongrant-restore.md)                               | [directoryObject](../resources/-directoryobject.md)                              |                                                                                |
| [validateProperties](../api/resourcespecificpermissiongrant-validateProperties.md)         |                                                                                  |                                                                                |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| clientAppId     | String         |             |
| clientId        | String         |             |
| deletedDateTime | DateTimeOffset |             |
| id              | String         | Read-only.  |
| permission      | String         |             |
| permissionType  | String         |             |
| resourceAppId   | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.resourceSpecificPermissionGrant",
  "baseType": "microsoft.graph.directoryObject",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.resourceSpecificPermissionGrant",
  "clientAppId": "String",
  "clientId": "String",
  "deletedDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "permission": "String",
  "permissionType": "String",
  "resourceAppId": "String"
}
```
