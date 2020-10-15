---
title: "homeRealmDiscoveryPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# homeRealmDiscoveryPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [stsPolicy](stspolicy.md)

## Methods

| Method                                                                        | Return Type                                                        | Description                                                             |
| :---------------------------------------------------------------------------- | :----------------------------------------------------------------- | :---------------------------------------------------------------------- |
| [List homeRealmDiscoveryPolicy](../api/homerealmdiscoverypolicy-list.md)      | [homeRealmDiscoveryPolicy](homeRealmDiscoveryPolicy.md) collection | List properties and relationships of a homeRealmDiscoveryPolicy object. |
| [Create homeRealmDiscoveryPolicy](../api/homerealmdiscoverypolicy-create.md)  | [homeRealmDiscoveryPolicy](homeRealmDiscoveryPolicy.md)            | Create a new homeRealmDiscoveryPolicy object.                           |
| [Get homeRealmDiscoveryPolicy](../api/homerealmdiscoverypolicy-get.md)        | [homeRealmDiscoveryPolicy](homeRealmDiscoveryPolicy.md)            | Read properties and relationships of a homeRealmDiscoveryPolicy object. |
| [Update homeRealmDiscoveryPolicy](../api/homerealmdiscoverypolicy-update.md)  | [homeRealmDiscoveryPolicy](homeRealmDiscoveryPolicy.md)            | Update the properties of a homeRealmDiscoveryPolicy object.             |
| [Delete homeRealmDiscoveryPolicy](../api/homerealmdiscoverypolicy-delete.md)  |                                                                    | Delete a homeRealmDiscoveryPolicy object.                               |
| [checkMemberGroups](../api/homerealmdiscoverypolicy-checkMemberGroups.md)     |                                                                    |                                                                         |
| [checkMemberObjects](../api/homerealmdiscoverypolicy-checkMemberObjects.md)   |                                                                    |                                                                         |
| [getByIds](../api/homerealmdiscoverypolicy-getByIds.md)                       |                                                                    |                                                                         |
| [getMemberGroups](../api/homerealmdiscoverypolicy-getMemberGroups.md)         |                                                                    |                                                                         |
| [getMemberObjects](../api/homerealmdiscoverypolicy-getMemberObjects.md)       |                                                                    |                                                                         |
| [getUserOwnedObjects](../api/homerealmdiscoverypolicy-getUserOwnedObjects.md) | [directoryObject](../resources/-directoryobject.md)                |                                                                         |
| [restore](../api/homerealmdiscoverypolicy-restore.md)                         | [directoryObject](../resources/-directoryobject.md)                |                                                                         |
| [validateProperties](../api/homerealmdiscoverypolicy-validateProperties.md)   |                                                                    |                                                                         |

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
  "@odata.type": "microsoft.graph.homeRealmDiscoveryPolicy",
  "baseType": "microsoft.graph.stsPolicy",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.homeRealmDiscoveryPolicy",
  "definition": ["String"],
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "isOrganizationDefault": "Boolean"
}
```
