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

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List todoTasks](../api/todotask-list.md)|[todoTask](../resources/todotask.md) collection|Get a list of the [todoTask](../resources/todotask.md) objects and their properties.|
|[Create todoTask](../api/todotask-create.md)|[todoTask](../resources/todotask.md)|Create a new [todoTask](../resources/todotask.md) object.|
|[Get todoTask](../api/todotask-get.md)|[todoTask](../resources/todotask.md)|Read the properties and relationships of a [todoTask](../resources/todotask.md) object.|
|[Update todoTask](../api/todotask-update.md)|[todoTask](../resources/todotask.md)|Update the properties of a [todoTask](../resources/todotask.md) object.|
|[Delete todoTask](../api/todotask-delete.md)|None|Deletes a [todoTask](../resources/todotask.md) object.|
|[delta](../api/todotask-delta.md)|[todoTask](../resources/todotask.md) collection|**TODO: Add Description**|
|[List extensions](../api/todotask-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/todotask-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List linkedResources](../api/todotask-list-linkedresources.md)|[linkedResource](../resources/linkedresource.md) collection|Get the linkedResource resources from the linkedResources navigation property.|
|[Create linkedResource](../api/todotask-post-linkedresources.md)|[linkedResource](../resources/linkedresource.md)|Create a new linkedResource object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|bodyLastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|completedDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|dueDateTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
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

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.todoTask",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.todoTask",
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
  "bodyLastModifiedDateTime": "String (timestamp)",
  "id": "String (identifier)"
}
```

