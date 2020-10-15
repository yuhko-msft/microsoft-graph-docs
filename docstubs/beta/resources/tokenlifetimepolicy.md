---
title: "tokenLifetimePolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# tokenLifetimePolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [stsPolicy](stspolicy.md)

## Methods

| Method                                                                   | Return Type                                              | Description                                                        |
| :----------------------------------------------------------------------- | :------------------------------------------------------- | :----------------------------------------------------------------- |
| [List tokenLifetimePolicy](../api/tokenlifetimepolicy-list.md)           | [tokenLifetimePolicy](tokenLifetimePolicy.md) collection | List properties and relationships of a tokenLifetimePolicy object. |
| [Create tokenLifetimePolicy](../api/tokenlifetimepolicy-create.md)       | [tokenLifetimePolicy](tokenLifetimePolicy.md)            | Create a new tokenLifetimePolicy object.                           |
| [Get tokenLifetimePolicy](../api/tokenlifetimepolicy-get.md)             | [tokenLifetimePolicy](tokenLifetimePolicy.md)            | Read properties and relationships of a tokenLifetimePolicy object. |
| [Update tokenLifetimePolicy](../api/tokenlifetimepolicy-update.md)       | [tokenLifetimePolicy](tokenLifetimePolicy.md)            | Update the properties of a tokenLifetimePolicy object.             |
| [Delete tokenLifetimePolicy](../api/tokenlifetimepolicy-delete.md)       |                                                          | Delete a tokenLifetimePolicy object.                               |
| [checkMemberGroups](../api/tokenlifetimepolicy-checkMemberGroups.md)     |                                                          |                                                                    |
| [checkMemberObjects](../api/tokenlifetimepolicy-checkMemberObjects.md)   |                                                          |                                                                    |
| [getByIds](../api/tokenlifetimepolicy-getByIds.md)                       |                                                          |                                                                    |
| [getMemberGroups](../api/tokenlifetimepolicy-getMemberGroups.md)         |                                                          |                                                                    |
| [getMemberObjects](../api/tokenlifetimepolicy-getMemberObjects.md)       |                                                          |                                                                    |
| [getUserOwnedObjects](../api/tokenlifetimepolicy-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md)      |                                                                    |
| [restore](../api/tokenlifetimepolicy-restore.md)                         | [directoryObject](../resources/-directoryobject.md)      |                                                                    |
| [validateProperties](../api/tokenlifetimepolicy-validateProperties.md)   |                                                          |                                                                    |

## Properties

| Property              | Type              | Description |
| :-------------------- | :---------------- | :---------- |
| definition            | String collection |             |
| deletedDateTime       | DateTimeOffset    |             |
| description           | String            |             |
| displayName           | String            |             |
| id                    | String            | Read-only.  |
| isOrganizationDefault | Boolean           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.tokenLifetimePolicy",
  "baseType": "microsoft.graph.stsPolicy",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.tokenLifetimePolicy",
  "definition": ["String"],
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "isOrganizationDefault": "Boolean"
}
```
