---
title: "todoTask resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# todoTask resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List todoTasks](../api/todotask-list.md)|[todoTask](../resources/todotask.md) collection|Get a list of the [todoTask](../resources/todotask.md) objects and their properties.|
|[Create todoTask](../api/todotask-create.md)|[todoTask](../resources/todotask.md)|Create a new [todoTask](../resources/todotask.md) object.|
|[Get todoTask](../api/todotask-get.md)|[todoTask](../resources/todotask.md)|Read the properties and relationships of a [todoTask](../resources/todotask.md) object.|
|[Update todoTask](../api/todotask-update.md)|[todoTask](../resources/todotask.md)|Update the properties of a [todoTask](../resources/todotask.md) object.|
|[Delete todoTask](../api/todotask-delete.md)|None|Deletes a [todoTask](../resources/todotask.md) object.|
|[List subtasks](../api/todotask-list-subtasks.md)|[subtask](../resources/subtask.md) collection|Get the subtask resources from the subtasks navigation property.|
|[Create subtasks](../api/todotask-post-subtasks.md)|[subtask](../resources/subtask.md)|Create a new subtask object.|
|[Get subtasks](../api/todotask-get-subtask.md)|[subtask](../resources/subtask.md)|Read the properties and relationships of a [subtask](../resources/subtask.md) object.|
|[Update subtasks](../api/todotask-update-subtasks.md)|[subtask](../resources/subtask.md)|Update the properties of a subtasks object.|
|[Delete subtasks](../api/todotask-delete-subtasks.md)|None|Delete a [subtask](../resources/subtask.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|bodyLastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|completedDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|dueDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|importance|importance|**TODO: Add Description**. Possible values are: `low`, `normal`, `high`.|
|isReminderOn|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|recurrence|[patternedRecurrence](../resources/patternedrecurrence.md)|**TODO: Add Description**|
|reminderDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|status|taskStatus|**TODO: Add Description**. Possible values are: `notStarted`, `inProgress`, `completed`, `waitingOnOthers`, `deferred`.|
|title|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description**|
|linkedResources|[linkedResource](../resources/linkedresource.md) collection|**TODO: Add Description**|
|subtasks|[subtask](../resources/subtask.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.todoTask",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.todoTask",
  "id": "String (identifier)",
  "body": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "completedDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "dueDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "importance": "String",
  "isReminderOn": "Boolean",
  "recurrence": {
    "@odata.type": "microsoft.graph.patternedRecurrence"
  },
  "reminderDateTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  },
  "status": "String",
  "title": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "bodyLastModifiedDateTime": "String (timestamp)"
}
```

