---
title: "windowsKioskForceUpdateSchedule resource type"
description: "Windows 10 force update schedule for Kiosk devices."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsKioskForceUpdateSchedule resource type

Namespace: microsoft.graph



Windows 10 force update schedule for Kiosk devices.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dayofMonth|Int32|Day of month. Valid values 1 to 31|
|dayofWeek|dayOfWeek|Day of week. Possible values are: `sunday`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`.|
|recurrence|windows10AppsUpdateRecurrence|Recurrence schedule. Possible values are: `none`, `daily`, `weekly`, `monthly`.|
|runImmediatelyIfAfterStartDateTime|Boolean|If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence.|
|startDateTime|DateTimeOffset|The start time for the force restart.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsKioskForceUpdateSchedule",
  "dayofMonth": "Integer",
  "dayofWeek": "String",
  "recurrence": "String",
  "runImmediatelyIfAfterStartDateTime": "Boolean",
  "startDateTime": "String (timestamp)"
}
```

