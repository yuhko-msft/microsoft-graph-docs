---
title: "outlookUser resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# outlookUser resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                   | Return Type                                             | Description                                                                  |
| :----------------------------------------------------------------------- | :------------------------------------------------------ | :--------------------------------------------------------------------------- |
| [List outlookUser](../api/outlookuser-list.md)                           | [outlookUser](outlookUser.md) collection                | List properties and relationships of an outlookUser object.                  |
| [Create outlookUser](../api/outlookuser-create.md)                       | [outlookUser](outlookUser.md)                           | Create a new outlookUser object.                                             |
| [Get outlookUser](../api/outlookuser-get.md)                             | [outlookUser](outlookUser.md)                           | Read properties and relationships of an outlookUser object.                  |
| [Update outlookUser](../api/outlookuser-update.md)                       | [outlookUser](outlookUser.md)                           | Update the properties of an outlookUser object.                              |
| [Delete outlookUser](../api/outlookuser-delete.md)                       |                                                         | Delete an outlookUser object.                                                |
| [supportedLanguages](../api/outlookuser-supportedLanguages.md)           |                                                         |                                                                              |
| [supportedTimeZones](../api/outlookuser-supportedTimeZones.md)           |                                                         |                                                                              |
| [List masterCategories](../api/outlookuser-list-mastercategories.md)     | [outlookCategory](../resources/-outlookcategory.md)     | Get the outlookCategory objects from a masterCategories navigation property. |
| [Create masterCategories](../api/outlookuser-post-mastercategories.md)   | [outlookCategory](../resources/-outlookcategory.md)     | Create a new outlookCategory object.                                         |
| [Get masterCategories](../api/outlookuser-get-mastercategories.md)       | [outlookCategory](../resources/-outlookcategory.md)     | Read the properties and relationships of an outlookCategory object.          |
| [Update masterCategories](../api/outlookuser-update-mastercategories.md) | [outlookCategory](../resources/-outlookcategory.md)     | Update the properties of an outlookCategory object.                          |
| [Delete masterCategories](../api/outlookuser-delete-mastercategories.md) |                                                         | Delete an outlookCategory object.                                            |
| [List taskFolders](../api/outlookuser-list-taskfolders.md)               | [outlookTaskFolder](../resources/-outlooktaskfolder.md) | Get the outlookTaskFolder objects from a taskFolders navigation property.    |
| [Create taskFolders](../api/outlookuser-post-taskfolders.md)             | [outlookTaskFolder](../resources/-outlooktaskfolder.md) | Create a new outlookTaskFolder object.                                       |
| [Get taskFolders](../api/outlookuser-get-taskfolders.md)                 | [outlookTaskFolder](../resources/-outlooktaskfolder.md) | Read the properties and relationships of an outlookTaskFolder object.        |
| [Update taskFolders](../api/outlookuser-update-taskfolders.md)           | [outlookTaskFolder](../resources/-outlooktaskfolder.md) | Update the properties of an outlookTaskFolder object.                        |
| [Delete taskFolders](../api/outlookuser-delete-taskfolders.md)           |                                                         | Delete an outlookTaskFolder object.                                          |
| [List taskGroups](../api/outlookuser-list-taskgroups.md)                 | [outlookTaskGroup](../resources/-outlooktaskgroup.md)   | Get the outlookTaskGroup objects from a taskGroups navigation property.      |
| [Create taskGroups](../api/outlookuser-post-taskgroups.md)               | [outlookTaskGroup](../resources/-outlooktaskgroup.md)   | Create a new outlookTaskGroup object.                                        |
| [Get taskGroups](../api/outlookuser-get-taskgroups.md)                   | [outlookTaskGroup](../resources/-outlooktaskgroup.md)   | Read the properties and relationships of an outlookTaskGroup object.         |
| [Update taskGroups](../api/outlookuser-update-taskgroups.md)             | [outlookTaskGroup](../resources/-outlooktaskgroup.md)   | Update the properties of an outlookTaskGroup object.                         |
| [Delete taskGroups](../api/outlookuser-delete-taskgroups.md)             |                                                         | Delete an outlookTaskGroup object.                                           |
| [List tasks](../api/outlookuser-list-tasks.md)                           | [outlookTask](../resources/-outlooktask.md)             | Get the outlookTask objects from a tasks navigation property.                |
| [Create tasks](../api/outlookuser-post-tasks.md)                         | [outlookTask](../resources/-outlooktask.md)             | Create a new outlookTask object.                                             |
| [Get tasks](../api/outlookuser-get-tasks.md)                             | [outlookTask](../resources/-outlooktask.md)             | Read the properties and relationships of an outlookTask object.              |
| [Update tasks](../api/outlookuser-update-tasks.md)                       | [outlookTask](../resources/-outlooktask.md)             | Update the properties of an outlookTask object.                              |
| [Delete tasks](../api/outlookuser-delete-tasks.md)                       |                                                         | Delete an outlookTask object.                                                |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship     | Type                                                              | Description |
| :--------------- | :---------------------------------------------------------------- | :---------- |
| masterCategories | [outlookCategory](../resources/outlookcategory.md) collection     |             |
| taskFolders      | [outlookTaskFolder](../resources/outlooktaskfolder.md) collection |             |
| taskGroups       | [outlookTaskGroup](../resources/outlooktaskgroup.md) collection   |             |
| tasks            | [outlookTask](../resources/outlooktask.md) collection             |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookUser",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.outlookUser",
  "id": "String (identifier)"
}
```
