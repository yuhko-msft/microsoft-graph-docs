---
title: "windows10AppsForceUpdateSchedule resource type"
description: "Windows 10 force update schedule for Apps"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10AppsForceUpdateSchedule resource type

Namespace: microsoft.graph



Windows 10 force update schedule for Apps

## Properties
|Property|Type|Description|
|:---|:---|:---|
|recurrence|windows10AppsUpdateRecurrence|Recurrence schedule. Possible values are: `none`, `daily`, `weekly`, `monthly`.|
|runImmediatelyIfAfterStartDateTime|Boolean|If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence.|
|startDateTime|DateTimeOffset|The start time for the force restart.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windows10AppsForceUpdateSchedule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10AppsForceUpdateSchedule",
  "recurrence": "String",
  "runImmediatelyIfAfterStartDateTime": "Boolean",
  "startDateTime": "String (timestamp)"
}
```

