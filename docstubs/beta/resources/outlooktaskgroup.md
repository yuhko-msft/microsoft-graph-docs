---
title: "outlookTaskGroup resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# outlookTaskGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                              | Return Type                                             | Description                                                               |
| :------------------------------------------------------------------ | :------------------------------------------------------ | :------------------------------------------------------------------------ |
| [List outlookTaskGroup](../api/outlooktaskgroup-list.md)            | [outlookTaskGroup](outlookTaskGroup.md) collection      | List properties and relationships of an outlookTaskGroup object.          |
| [Create outlookTaskGroup](../api/outlooktaskgroup-create.md)        | [outlookTaskGroup](outlookTaskGroup.md)                 | Create a new outlookTaskGroup object.                                     |
| [Get outlookTaskGroup](../api/outlooktaskgroup-get.md)              | [outlookTaskGroup](outlookTaskGroup.md)                 | Read properties and relationships of an outlookTaskGroup object.          |
| [Update outlookTaskGroup](../api/outlooktaskgroup-update.md)        | [outlookTaskGroup](outlookTaskGroup.md)                 | Update the properties of an outlookTaskGroup object.                      |
| [Delete outlookTaskGroup](../api/outlooktaskgroup-delete.md)        |                                                         | Delete an outlookTaskGroup object.                                        |
| [List taskFolders](../api/outlooktaskgroup-list-taskfolders.md)     | [outlookTaskFolder](../resources/-outlooktaskfolder.md) | Get the outlookTaskFolder objects from a taskFolders navigation property. |
| [Create taskFolders](../api/outlooktaskgroup-post-taskfolders.md)   | [outlookTaskFolder](../resources/-outlooktaskfolder.md) | Create a new outlookTaskFolder object.                                    |
| [Get taskFolders](../api/outlooktaskgroup-get-taskfolders.md)       | [outlookTaskFolder](../resources/-outlooktaskfolder.md) | Read the properties and relationships of an outlookTaskFolder object.     |
| [Update taskFolders](../api/outlooktaskgroup-update-taskfolders.md) | [outlookTaskFolder](../resources/-outlooktaskfolder.md) | Update the properties of an outlookTaskFolder object.                     |
| [Delete taskFolders](../api/outlooktaskgroup-delete-taskfolders.md) |                                                         | Delete an outlookTaskFolder object.                                       |

## Properties

| Property       | Type    | Description |
| :------------- | :------ | :---------- |
| changeKey      | String  |             |
| groupKey       | Guid    |             |
| id             | String  | Read-only.  |
| isDefaultGroup | Boolean |             |
| name           | String  |             |

## Relationships

| Relationship | Type                                                              | Description |
| :----------- | :---------------------------------------------------------------- | :---------- |
| taskFolders  | [outlookTaskFolder](../resources/outlooktaskfolder.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookTaskGroup",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.outlookTaskGroup",
  "changeKey": "String",
  "groupKey": "Guid",
  "id": "String (identifier)",
  "isDefaultGroup": "Boolean",
  "name": "String"
}
```
