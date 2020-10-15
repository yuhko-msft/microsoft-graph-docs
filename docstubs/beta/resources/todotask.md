---
title: "todoTask resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# todoTask resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                              | Return Type                                       | Description                                                                       |
| :------------------------------------------------------------------ | :------------------------------------------------ | :-------------------------------------------------------------------------------- |
| [List todoTask](../api/todotask-list.md)                            | [todoTask](todoTask.md) collection                | List properties and relationships of a todoTask object.                           |
| [Create todoTask](../api/todotask-create.md)                        | [todoTask](todoTask.md)                           | Create a new todoTask object.                                                     |
| [Get todoTask](../api/todotask-get.md)                              | [todoTask](todoTask.md)                           | Read properties and relationships of a todoTask object.                           |
| [Update todoTask](../api/todotask-update.md)                        | [todoTask](todoTask.md)                           | Update the properties of a todoTask object.                                       |
| [Delete todoTask](../api/todotask-delete.md)                        |                                                   | Delete a todoTask object.                                                         |
| [delta](../api/todotask-delta.md)                                   |                                                   |                                                                                   |
| [List extensions](../api/todotask-list-extensions.md)               | microsoft.graph.extension                         | Get the microsoft.graph.extension objects from an extensions navigation property. |
| [Create extensions](../api/todotask-post-extensions.md)             | microsoft.graph.extension                         | Create a new microsoft.graph.extension object.                                    |
| [Get extensions](../api/todotask-get-extensions.md)                 | microsoft.graph.extension                         | Read the properties and relationships of a microsoft.graph.extension object.      |
| [Update extensions](../api/todotask-update-extensions.md)           | microsoft.graph.extension                         | Update the properties of a microsoft.graph.extension object.                      |
| [Delete extensions](../api/todotask-delete-extensions.md)           |                                                   | Delete a microsoft.graph.extension object.                                        |
| [List linkedResources](../api/todotask-list-linkedresources.md)     | [linkedResource](../resources/-linkedresource.md) | Get the linkedResource objects from a linkedResources navigation property.        |
| [Create linkedResources](../api/todotask-post-linkedresources.md)   | [linkedResource](../resources/-linkedresource.md) | Create a new linkedResource object.                                               |
| [Get linkedResources](../api/todotask-get-linkedresources.md)       | [linkedResource](../resources/-linkedresource.md) | Read the properties and relationships of a linkedResource object.                 |
| [Update linkedResources](../api/todotask-update-linkedresources.md) | [linkedResource](../resources/-linkedresource.md) | Update the properties of a linkedResource object.                                 |
| [Delete linkedResources](../api/todotask-delete-linkedresources.md) |                                                   | Delete a linkedResource object.                                                   |

## Properties

| Property                 | Type                                                       | Description |
| :----------------------- | :--------------------------------------------------------- | :---------- |
| body                     | [itemBody](../resources/itembody.md)                       |             |
| bodyLastModifiedDateTime | DateTimeOffset                                             |             |
| completedDateTime        | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| createdDateTime          | DateTimeOffset                                             |             |
| dueDateTime              | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| id                       | String                                                     | Read-only.  |
| importance               | String                                                     |             |
| isReminderOn             | Boolean                                                    |             |
| lastModifiedDateTime     | DateTimeOffset                                             |             |
| recurrence               | [patternedRecurrence](../resources/patternedrecurrence.md) |             |
| reminderDateTime         | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| status                   | String                                                     |             |
| title                    | String                                                     |             |

## Relationships

| Relationship    | Type                                                        | Description |
| :-------------- | :---------------------------------------------------------- | :---------- |
| extensions      | microsoft.graph.extension collection                        |             |
| linkedResources | [linkedResource](../resources/linkedresource.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.todoTask",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.todoTask",
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "bodyLastModifiedDateTime": "DateTimeOffset",
  "completedDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "createdDateTime": "DateTimeOffset",
  "dueDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "id": "String (identifier)",
  "importance": "low | normal | high",
  "isReminderOn": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "recurrence": {"@odata.type": "microsoft.graph.patternedRecurrence"},
  "reminderDateTime": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "status": "notStarted | inProgress | completed | waitingOnOthers | deferred",
  "title": "String"
}
```
