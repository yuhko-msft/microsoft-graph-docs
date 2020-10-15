---
title: "stsPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# stsPolicy resource type

Namespace: microsoft.graph

Inherits from [policyBase](policybase.md)

## Methods

| Method                                                                                 | Return Type                                         | Description                                                            |
| :------------------------------------------------------------------------------------- | :-------------------------------------------------- | :--------------------------------------------------------------------- |
| [List stsPolicy](../api/stspolicy-list.md)                                             | [stsPolicy](stsPolicy.md) collection                | List properties and relationships of a stsPolicy object.               |
| [Create stsPolicy](../api/stspolicy-create.md)                                         | [stsPolicy](stsPolicy.md)                           | Create a new stsPolicy object.                                         |
| [Get stsPolicy](../api/stspolicy-get.md)                                               | [stsPolicy](stsPolicy.md)                           | Read properties and relationships of a stsPolicy object.               |
| [Update stsPolicy](../api/stspolicy-update.md)                                         | [stsPolicy](stsPolicy.md)                           | Update the properties of a stsPolicy object.                           |
| [Delete stsPolicy](../api/stspolicy-delete.md)                                         |                                                     | Delete a stsPolicy object.                                             |
| [checkMemberGroups](../api/stspolicy-checkMemberGroups.md)                             |                                                     |                                                                        |
| [checkMemberObjects](../api/stspolicy-checkMemberObjects.md)                           |                                                     |                                                                        |
| [getAvailableExtensionProperties](../api/stspolicy-getAvailableExtensionProperties.md) |                                                     |                                                                        |
| [getByIds](../api/stspolicy-getByIds.md)                                               |                                                     |                                                                        |
| [getMemberGroups](../api/stspolicy-getMemberGroups.md)                                 |                                                     |                                                                        |
| [getMemberObjects](../api/stspolicy-getMemberObjects.md)                               |                                                     |                                                                        |
| [restore](../api/stspolicy-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md) |                                                                        |
| [validateProperties](../api/stspolicy-validateProperties.md)                           |                                                     |                                                                        |
| [List appliesTo](../api/stspolicy-list-appliesto.md)                                   | [directoryObject](../resources/-directoryobject.md) | Get the directoryObject objects from an appliesTo navigation property. |
| [Add appliesTo](../api/stspolicy-post-appliesto.md)                                    | [directoryObject](../resources/-directoryobject.md) | Add directoryObject by posting to the directoryObject collection.      |
| [Get appliesTo](../api/stspolicy-get-appliesto.md)                                     | [directoryObject](../resources/-directoryobject.md) | Read the properties and relationships of a directoryObject object.     |
| [Update appliesTo](../api/stspolicy-update-appliesto.md)                               | [directoryObject](../resources/-directoryobject.md) | Update the properties of a directoryObject object.                     |
| [Remove appliesTo](../api/stspolicy-delete-appliesto.md)                               |                                                     | Remove a directoryObject object.                                       |

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

| Relationship | Type                                                          | Description |
| :----------- | :------------------------------------------------------------ | :---------- |
| appliesTo    | [directoryObject](../resources/directoryobject.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.stsPolicy",
  "baseType": "microsoft.graph.policyBase",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.stsPolicy",
  "definition": ["String"],
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "isOrganizationDefault": "Boolean"
}
```
