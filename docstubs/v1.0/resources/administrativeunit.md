---
title: "administrativeUnit resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# administrativeUnit resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                          | Return Type                                                   | Description                                                                        |
| :---------------------------------------------------------------------------------------------- | :------------------------------------------------------------ | :--------------------------------------------------------------------------------- |
| [List administrativeUnit](../api/administrativeunit-list.md)                                    | [administrativeUnit](administrativeUnit.md) collection        | List properties and relationships of an administrativeUnit object.                 |
| [Create administrativeUnit](../api/administrativeunit-create.md)                                | [administrativeUnit](administrativeUnit.md)                   | Create a new administrativeUnit object.                                            |
| [Get administrativeUnit](../api/administrativeunit-get.md)                                      | [administrativeUnit](administrativeUnit.md)                   | Read properties and relationships of an administrativeUnit object.                 |
| [Update administrativeUnit](../api/administrativeunit-update.md)                                | [administrativeUnit](administrativeUnit.md)                   | Update the properties of an administrativeUnit object.                             |
| [Delete administrativeUnit](../api/administrativeunit-delete.md)                                |                                                               | Delete an administrativeUnit object.                                               |
| [checkMemberGroups](../api/administrativeunit-checkMemberGroups.md)                             |                                                               |                                                                                    |
| [checkMemberObjects](../api/administrativeunit-checkMemberObjects.md)                           |                                                               |                                                                                    |
| [getAvailableExtensionProperties](../api/administrativeunit-getAvailableExtensionProperties.md) |                                                               |                                                                                    |
| [getByIds](../api/administrativeunit-getByIds.md)                                               |                                                               |                                                                                    |
| [getMemberGroups](../api/administrativeunit-getMemberGroups.md)                                 |                                                               |                                                                                    |
| [getMemberObjects](../api/administrativeunit-getMemberObjects.md)                               |                                                               |                                                                                    |
| [restore](../api/administrativeunit-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)           |                                                                                    |
| [validateProperties](../api/administrativeunit-validateProperties.md)                           |                                                               |                                                                                    |
| [delta](../api/administrativeunit-delta.md)                                                     |                                                               |                                                                                    |
| [List members](../api/administrativeunit-list-members.md)                                       | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from a members navigation property.                |
| [Add members](../api/administrativeunit-post-members.md)                                        | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.                  |
| [Get members](../api/administrativeunit-get-members.md)                                         | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.                 |
| [Update members](../api/administrativeunit-update-members.md)                                   | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                                 |
| [Remove members](../api/administrativeunit-delete-members.md)                                   |                                                               | Remove a directoryObject object.                                                   |
| [List scopedRoleMembers](../api/administrativeunit-list-scopedrolemembers.md)                   | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Get the scopedRoleMembership objects from a scopedRoleMembers navigation property. |
| [Create scopedRoleMembers](../api/administrativeunit-post-scopedrolemembers.md)                 | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Create a new scopedRoleMembership object.                                          |
| [Get scopedRoleMembers](../api/administrativeunit-get-scopedrolemembers.md)                     | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Read the properties and relationships of a scopedRoleMembership object.            |
| [Update scopedRoleMembers](../api/administrativeunit-update-scopedrolemembers.md)               | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Update the properties of a scopedRoleMembership object.                            |
| [Delete scopedRoleMembers](../api/administrativeunit-delete-scopedrolemembers.md)               |                                                               | Delete a scopedRoleMembership object.                                              |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| deletedDateTime | DateTimeOffset |             |
| description     | String         |             |
| displayName     | String         |             |
| id              | String         | Read-only.  |
| visibility      | String         |             |

## Relationships

| Relationship      | Type                                                                    | Description |
| :---------------- | :---------------------------------------------------------------------- | :---------- |
| members           | [directoryObject](../resources/directoryobject.md) collection           |             |
| scopedRoleMembers | [scopedRoleMembership](../resources/scopedrolemembership.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.administrativeUnit",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.administrativeUnit",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "visibility": "String"
}
```
