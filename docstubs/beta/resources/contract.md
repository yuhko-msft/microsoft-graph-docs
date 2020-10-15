---
title: "contract resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# contract resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                        | Return Type                                         | Description                                             |
| :------------------------------------------------------------ | :-------------------------------------------------- | :------------------------------------------------------ |
| [List contract](../api/contract-list.md)                      | [contract](contract.md) collection                  | List properties and relationships of a contract object. |
| [Create contract](../api/contract-create.md)                  | [contract](contract.md)                             | Create a new contract object.                           |
| [Get contract](../api/contract-get.md)                        | [contract](contract.md)                             | Read properties and relationships of a contract object. |
| [Update contract](../api/contract-update.md)                  | [contract](contract.md)                             | Update the properties of a contract object.             |
| [Delete contract](../api/contract-delete.md)                  |                                                     | Delete a contract object.                               |
| [checkMemberGroups](../api/contract-checkMemberGroups.md)     |                                                     |                                                         |
| [checkMemberObjects](../api/contract-checkMemberObjects.md)   |                                                     |                                                         |
| [getByIds](../api/contract-getByIds.md)                       |                                                     |                                                         |
| [getMemberGroups](../api/contract-getMemberGroups.md)         |                                                     |                                                         |
| [getMemberObjects](../api/contract-getMemberObjects.md)       |                                                     |                                                         |
| [getUserOwnedObjects](../api/contract-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md) |                                                         |
| [restore](../api/contract-restore.md)                         | [directoryObject](../resources/-directoryobject.md) |                                                         |
| [validateProperties](../api/contract-validateProperties.md)   |                                                     |                                                         |

## Properties

| Property          | Type           | Description |
| :---------------- | :------------- | :---------- |
| contractType      | String         |             |
| customerId        | Guid           |             |
| defaultDomainName | String         |             |
| deletedDateTime   | DateTimeOffset |             |
| displayName       | String         |             |
| id                | String         | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.contract",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.contract",
  "contractType": "String",
  "customerId": "Guid",
  "defaultDomainName": "String",
  "deletedDateTime": "DateTimeOffset",
  "displayName": "String",
  "id": "String (identifier)"
}
```
