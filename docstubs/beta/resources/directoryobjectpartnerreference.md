---
title: "directoryObjectPartnerReference resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# directoryObjectPartnerReference resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                     | Return Type                                                                      | Description                                                                    |
| :----------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- | :----------------------------------------------------------------------------- |
| [List directoryObjectPartnerReference](../api/directoryobjectpartnerreference-list.md)     | [directoryObjectPartnerReference](directoryObjectPartnerReference.md) collection | List properties and relationships of a directoryObjectPartnerReference object. |
| [Create directoryObjectPartnerReference](../api/directoryobjectpartnerreference-create.md) | [directoryObjectPartnerReference](directoryObjectPartnerReference.md)            | Create a new directoryObjectPartnerReference object.                           |
| [Get directoryObjectPartnerReference](../api/directoryobjectpartnerreference-get.md)       | [directoryObjectPartnerReference](directoryObjectPartnerReference.md)            | Read properties and relationships of a directoryObjectPartnerReference object. |
| [Update directoryObjectPartnerReference](../api/directoryobjectpartnerreference-update.md) | [directoryObjectPartnerReference](directoryObjectPartnerReference.md)            | Update the properties of a directoryObjectPartnerReference object.             |
| [Delete directoryObjectPartnerReference](../api/directoryobjectpartnerreference-delete.md) |                                                                                  | Delete a directoryObjectPartnerReference object.                               |
| [checkMemberGroups](../api/directoryobjectpartnerreference-checkMemberGroups.md)           |                                                                                  |                                                                                |
| [checkMemberObjects](../api/directoryobjectpartnerreference-checkMemberObjects.md)         |                                                                                  |                                                                                |
| [getByIds](../api/directoryobjectpartnerreference-getByIds.md)                             |                                                                                  |                                                                                |
| [getMemberGroups](../api/directoryobjectpartnerreference-getMemberGroups.md)               |                                                                                  |                                                                                |
| [getMemberObjects](../api/directoryobjectpartnerreference-getMemberObjects.md)             |                                                                                  |                                                                                |
| [getUserOwnedObjects](../api/directoryobjectpartnerreference-getUserOwnedObjects.md)       | [directoryObject](../resources/-directoryobject.md)                              |                                                                                |
| [restore](../api/directoryobjectpartnerreference-restore.md)                               | [directoryObject](../resources/-directoryobject.md)                              |                                                                                |
| [validateProperties](../api/directoryobjectpartnerreference-validateProperties.md)         |                                                                                  |                                                                                |

## Properties

| Property                | Type           | Description |
| :---------------------- | :------------- | :---------- |
| deletedDateTime         | DateTimeOffset |             |
| description             | String         |             |
| displayName             | String         |             |
| externalPartnerTenantId | Guid           |             |
| id                      | String         | Read-only.  |
| objectType              | String         |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directoryObjectPartnerReference",
  "baseType": "microsoft.graph.directoryObject",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directoryObjectPartnerReference",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "externalPartnerTenantId": "Guid",
  "id": "String (identifier)",
  "objectType": "String"
}
```
