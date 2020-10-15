---
title: "permissionGrantPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# permissionGrantPolicy resource type

Namespace: microsoft.graph

Inherits from [policyBase](policybase.md)

## Methods

| Method                                                                                             | Return Type                                                                 | Description                                                                       |
| :------------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------- | :-------------------------------------------------------------------------------- |
| [List permissionGrantPolicy](../api/permissiongrantpolicy-list.md)                                 | [permissionGrantPolicy](permissionGrantPolicy.md) collection                | List properties and relationships of a permissionGrantPolicy object.              |
| [Create permissionGrantPolicy](../api/permissiongrantpolicy-create.md)                             | [permissionGrantPolicy](permissionGrantPolicy.md)                           | Create a new permissionGrantPolicy object.                                        |
| [Get permissionGrantPolicy](../api/permissiongrantpolicy-get.md)                                   | [permissionGrantPolicy](permissionGrantPolicy.md)                           | Read properties and relationships of a permissionGrantPolicy object.              |
| [Update permissionGrantPolicy](../api/permissiongrantpolicy-update.md)                             | [permissionGrantPolicy](permissionGrantPolicy.md)                           | Update the properties of a permissionGrantPolicy object.                          |
| [Delete permissionGrantPolicy](../api/permissiongrantpolicy-delete.md)                             |                                                                             | Delete a permissionGrantPolicy object.                                            |
| [checkMemberGroups](../api/permissiongrantpolicy-checkMemberGroups.md)                             |                                                                             |                                                                                   |
| [checkMemberObjects](../api/permissiongrantpolicy-checkMemberObjects.md)                           |                                                                             |                                                                                   |
| [getAvailableExtensionProperties](../api/permissiongrantpolicy-getAvailableExtensionProperties.md) |                                                                             |                                                                                   |
| [getByIds](../api/permissiongrantpolicy-getByIds.md)                                               |                                                                             |                                                                                   |
| [getMemberGroups](../api/permissiongrantpolicy-getMemberGroups.md)                                 |                                                                             |                                                                                   |
| [getMemberObjects](../api/permissiongrantpolicy-getMemberObjects.md)                               |                                                                             |                                                                                   |
| [restore](../api/permissiongrantpolicy-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)                         |                                                                                   |
| [validateProperties](../api/permissiongrantpolicy-validateProperties.md)                           |                                                                             |                                                                                   |
| [List excludes](../api/permissiongrantpolicy-list-excludes.md)                                     | [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) | Get the permissionGrantConditionSet objects from an excludes navigation property. |
| [Create excludes](../api/permissiongrantpolicy-post-excludes.md)                                   | [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) | Create a new permissionGrantConditionSet object.                                  |
| [Get excludes](../api/permissiongrantpolicy-get-excludes.md)                                       | [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) | Read the properties and relationships of a permissionGrantConditionSet object.    |
| [Update excludes](../api/permissiongrantpolicy-update-excludes.md)                                 | [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) | Update the properties of a permissionGrantConditionSet object.                    |
| [Delete excludes](../api/permissiongrantpolicy-delete-excludes.md)                                 |                                                                             | Delete a permissionGrantConditionSet object.                                      |
| [List includes](../api/permissiongrantpolicy-list-includes.md)                                     | [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) | Get the permissionGrantConditionSet objects from an includes navigation property. |
| [Create includes](../api/permissiongrantpolicy-post-includes.md)                                   | [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) | Create a new permissionGrantConditionSet object.                                  |
| [Get includes](../api/permissiongrantpolicy-get-includes.md)                                       | [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) | Read the properties and relationships of a permissionGrantConditionSet object.    |
| [Update includes](../api/permissiongrantpolicy-update-includes.md)                                 | [permissionGrantConditionSet](../resources/-permissiongrantconditionset.md) | Update the properties of a permissionGrantConditionSet object.                    |
| [Delete includes](../api/permissiongrantpolicy-delete-includes.md)                                 |                                                                             | Delete a permissionGrantConditionSet object.                                      |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| deletedDateTime | DateTimeOffset |             |
| description     | String         |             |
| displayName     | String         |             |
| id              | String         | Read-only.  |

## Relationships

| Relationship | Type                                                                                  | Description |
| :----------- | :------------------------------------------------------------------------------------ | :---------- |
| excludes     | [permissionGrantConditionSet](../resources/permissiongrantconditionset.md) collection |             |
| includes     | [permissionGrantConditionSet](../resources/permissiongrantconditionset.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.permissionGrantPolicy",
  "baseType": "microsoft.graph.policyBase",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.permissionGrantPolicy",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)"
}
```
