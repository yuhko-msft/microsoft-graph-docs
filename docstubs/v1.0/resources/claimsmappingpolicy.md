---
title: "claimsMappingPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# claimsMappingPolicy resource type

Namespace: microsoft.graph

Inherits from [stsPolicy](stspolicy.md)

## Methods

| Method                                                                                           | Return Type                                              | Description                                                        |
| :----------------------------------------------------------------------------------------------- | :------------------------------------------------------- | :----------------------------------------------------------------- |
| [List claimsMappingPolicy](../api/claimsmappingpolicy-list.md)                                   | [claimsMappingPolicy](claimsMappingPolicy.md) collection | List properties and relationships of a claimsMappingPolicy object. |
| [Create claimsMappingPolicy](../api/claimsmappingpolicy-create.md)                               | [claimsMappingPolicy](claimsMappingPolicy.md)            | Create a new claimsMappingPolicy object.                           |
| [Get claimsMappingPolicy](../api/claimsmappingpolicy-get.md)                                     | [claimsMappingPolicy](claimsMappingPolicy.md)            | Read properties and relationships of a claimsMappingPolicy object. |
| [Update claimsMappingPolicy](../api/claimsmappingpolicy-update.md)                               | [claimsMappingPolicy](claimsMappingPolicy.md)            | Update the properties of a claimsMappingPolicy object.             |
| [Delete claimsMappingPolicy](../api/claimsmappingpolicy-delete.md)                               |                                                          | Delete a claimsMappingPolicy object.                               |
| [checkMemberGroups](../api/claimsmappingpolicy-checkMemberGroups.md)                             |                                                          |                                                                    |
| [checkMemberObjects](../api/claimsmappingpolicy-checkMemberObjects.md)                           |                                                          |                                                                    |
| [getAvailableExtensionProperties](../api/claimsmappingpolicy-getAvailableExtensionProperties.md) |                                                          |                                                                    |
| [getByIds](../api/claimsmappingpolicy-getByIds.md)                                               |                                                          |                                                                    |
| [getMemberGroups](../api/claimsmappingpolicy-getMemberGroups.md)                                 |                                                          |                                                                    |
| [getMemberObjects](../api/claimsmappingpolicy-getMemberObjects.md)                               |                                                          |                                                                    |
| [restore](../api/claimsmappingpolicy-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)      |                                                                    |
| [validateProperties](../api/claimsmappingpolicy-validateProperties.md)                           |                                                          |                                                                    |

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
  "@odata.type": "microsoft.graph.claimsMappingPolicy",
  "baseType": "microsoft.graph.stsPolicy",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.claimsMappingPolicy",
  "definition": ["String"],
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "isOrganizationDefault": "Boolean"
}
```
