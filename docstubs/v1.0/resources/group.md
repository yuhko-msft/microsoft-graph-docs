---
title: "group resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# group resource type

Namespace: microsoft.graph

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                     | Return Type                   | Description                                             |
| :----------------------------------------- | :---------------------------- | :------------------------------------------------------ |
| [List group](../api/group-list.md)         | [group](group.md) collection  | List properties and relationships of a group object.    |
| [Create group](../api/group-create.md)     | [group](group.md)             | Create a new group object.                              |
| [Get group](../api/group-get.md)           | [group](group.md)             | Read properties and relationships of a group object.    |
| [Update group](../api/group-update.md)     | [group](group.md)             | Update the properties of a group object.                |
| [Delete group](../api/group-delete.md)     |                               | Delete a group object.                                  |
| [List team](../api/group-list-team.md)     | [team](../resources/-team.md) | Get the team objects from a team navigation property.   |
| [Create team](../api/group-post-team.md)   | [team](../resources/-team.md) | Create a new team object.                               |
| [Get team](../api/group-get-team.md)       | [team](../resources/-team.md) | Read the properties and relationships of a team object. |
| [Update team](../api/group-update-team.md) | [team](../resources/-team.md) | Update the properties of a team object.                 |
| [Delete team](../api/group-delete-team.md) |                               | Delete a team object.                                   |

## Properties

| Property   | Type    | Description |
| :--------- | :------ | :---------- |
| id         | String  | Read-only.  |
| isArchived | Boolean |             |

## Relationships

| Relationship | Type                         | Description |
| :----------- | :--------------------------- | :---------- |
| team         | [team](../resources/team.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.group",
  "baseType": "microsoft.graph.directoryObject",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.group",
  "id": "String (identifier)",
  "isArchived": "Boolean"
}
```
