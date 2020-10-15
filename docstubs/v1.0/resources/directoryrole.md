---
title: "directoryRole resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# directoryRole resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                                                     | Return Type                                                   | Description                                                                    |
| :----------------------------------------------------------------------------------------- | :------------------------------------------------------------ | :----------------------------------------------------------------------------- |
| [List directoryRole](../api/directoryrole-list.md)                                         | [directoryRole](directoryRole.md) collection                  | List properties and relationships of a directoryRole object.                   |
| [Create directoryRole](../api/directoryrole-create.md)                                     | [directoryRole](directoryRole.md)                             | Create a new directoryRole object.                                             |
| [Get directoryRole](../api/directoryrole-get.md)                                           | [directoryRole](directoryRole.md)                             | Read properties and relationships of a directoryRole object.                   |
| [Update directoryRole](../api/directoryrole-update.md)                                     | [directoryRole](directoryRole.md)                             | Update the properties of a directoryRole object.                               |
| [Delete directoryRole](../api/directoryrole-delete.md)                                     |                                                               | Delete a directoryRole object.                                                 |
| [checkMemberGroups](../api/directoryrole-checkMemberGroups.md)                             |                                                               |                                                                                |
| [checkMemberObjects](../api/directoryrole-checkMemberObjects.md)                           |                                                               |                                                                                |
| [getAvailableExtensionProperties](../api/directoryrole-getAvailableExtensionProperties.md) |                                                               |                                                                                |
| [getByIds](../api/directoryrole-getByIds.md)                                               |                                                               |                                                                                |
| [getMemberGroups](../api/directoryrole-getMemberGroups.md)                                 |                                                               |                                                                                |
| [getMemberObjects](../api/directoryrole-getMemberObjects.md)                               |                                                               |                                                                                |
| [restore](../api/directoryrole-restore.md)                                                 | [directoryObject](../resources/-directoryobject.md)           |                                                                                |
| [validateProperties](../api/directoryrole-validateProperties.md)                           |                                                               |                                                                                |
| [delta](../api/directoryrole-delta.md)                                                     |                                                               |                                                                                |
| [List members](../api/directoryrole-list-members.md)                                       | [directoryObject](../resources/-directoryobject.md)           | Get the directoryObject objects from a members navigation property.            |
| [Add members](../api/directoryrole-post-members.md)                                        | [directoryObject](../resources/-directoryobject.md)           | Add directoryObject by posting to the directoryObject collection.              |
| [Get members](../api/directoryrole-get-members.md)                                         | [directoryObject](../resources/-directoryobject.md)           | Read the properties and relationships of a directoryObject object.             |
| [Update members](../api/directoryrole-update-members.md)                                   | [directoryObject](../resources/-directoryobject.md)           | Update the properties of a directoryObject object.                             |
| [Remove members](../api/directoryrole-delete-members.md)                                   |                                                               | Remove a directoryObject object.                                               |
| [List scopedMembers](../api/directoryrole-list-scopedmembers.md)                           | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Get the scopedRoleMembership objects from a scopedMembers navigation property. |
| [Create scopedMembers](../api/directoryrole-post-scopedmembers.md)                         | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Create a new scopedRoleMembership object.                                      |
| [Get scopedMembers](../api/directoryrole-get-scopedmembers.md)                             | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Read the properties and relationships of a scopedRoleMembership object.        |
| [Update scopedMembers](../api/directoryrole-update-scopedmembers.md)                       | [scopedRoleMembership](../resources/-scopedrolemembership.md) | Update the properties of a scopedRoleMembership object.                        |
| [Delete scopedMembers](../api/directoryrole-delete-scopedmembers.md)                       |                                                               | Delete a scopedRoleMembership object.                                          |

## Properties

| Property        | Type           | Description |
| :-------------- | :------------- | :---------- |
| deletedDateTime | DateTimeOffset |             |
| description     | String         |             |
| displayName     | String         |             |
| id              | String         | Read-only.  |
| roleTemplateId  | String         |             |

## Relationships

| Relationship  | Type                                                                    | Description |
| :------------ | :---------------------------------------------------------------------- | :---------- |
| members       | [directoryObject](../resources/directoryobject.md) collection           |             |
| scopedMembers | [scopedRoleMembership](../resources/scopedrolemembership.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.directoryRole",
  "baseType": "microsoft.graph.directoryObject",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.directoryRole",
  "deletedDateTime": "DateTimeOffset",
  "description": "String",
  "displayName": "String",
  "id": "String (identifier)",
  "roleTemplateId": "String"
}
```
