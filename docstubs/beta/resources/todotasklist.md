---
title: "todoTaskList resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# todoTaskList resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                        | Return Type                                | Description                                                                       |
| :------------------------------------------------------------ | :----------------------------------------- | :-------------------------------------------------------------------------------- |
| [List todoTaskList](../api/todotasklist-list.md)              | [todoTaskList](todoTaskList.md) collection | List properties and relationships of a todoTaskList object.                       |
| [Create todoTaskList](../api/todotasklist-create.md)          | [todoTaskList](todoTaskList.md)            | Create a new todoTaskList object.                                                 |
| [Get todoTaskList](../api/todotasklist-get.md)                | [todoTaskList](todoTaskList.md)            | Read properties and relationships of a todoTaskList object.                       |
| [Update todoTaskList](../api/todotasklist-update.md)          | [todoTaskList](todoTaskList.md)            | Update the properties of a todoTaskList object.                                   |
| [Delete todoTaskList](../api/todotasklist-delete.md)          |                                            | Delete a todoTaskList object.                                                     |
| [delta](../api/todotasklist-delta.md)                         |                                            |                                                                                   |
| [List extensions](../api/todotasklist-list-extensions.md)     | microsoft.graph.extension                  | Get the microsoft.graph.extension objects from an extensions navigation property. |
| [Create extensions](../api/todotasklist-post-extensions.md)   | microsoft.graph.extension                  | Create a new microsoft.graph.extension object.                                    |
| [Get extensions](../api/todotasklist-get-extensions.md)       | microsoft.graph.extension                  | Read the properties and relationships of a microsoft.graph.extension object.      |
| [Update extensions](../api/todotasklist-update-extensions.md) | microsoft.graph.extension                  | Update the properties of a microsoft.graph.extension object.                      |
| [Delete extensions](../api/todotasklist-delete-extensions.md) |                                            | Delete a microsoft.graph.extension object.                                        |
| [List tasks](../api/todotasklist-list-tasks.md)               | [todoTask](../resources/-todotask.md)      | Get the todoTask objects from a tasks navigation property.                        |
| [Create tasks](../api/todotasklist-post-tasks.md)             | [todoTask](../resources/-todotask.md)      | Create a new todoTask object.                                                     |
| [Get tasks](../api/todotasklist-get-tasks.md)                 | [todoTask](../resources/-todotask.md)      | Read the properties and relationships of a todoTask object.                       |
| [Update tasks](../api/todotasklist-update-tasks.md)           | [todoTask](../resources/-todotask.md)      | Update the properties of a todoTask object.                                       |
| [Delete tasks](../api/todotasklist-delete-tasks.md)           |                                            | Delete a todoTask object.                                                         |

## Properties

| Property          | Type    | Description |
| :---------------- | :------ | :---------- |
| displayName       | String  |             |
| id                | String  | Read-only.  |
| isOwner           | Boolean |             |
| isShared          | Boolean |             |
| wellknownListName | String  |             |

## Relationships

| Relationship | Type                                            | Description |
| :----------- | :---------------------------------------------- | :---------- |
| extensions   | microsoft.graph.extension collection            |             |
| tasks        | [todoTask](../resources/todotask.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.todoTaskList",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.todoTaskList",
  "displayName": "String",
  "id": "String (identifier)",
  "isOwner": "Boolean",
  "isShared": "Boolean",
  "wellknownListName": "none | defaultList | flaggedEmails | unknownFutureValue"
}
```
