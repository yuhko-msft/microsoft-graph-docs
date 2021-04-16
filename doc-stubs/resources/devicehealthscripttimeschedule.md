---
title: "deviceHealthScriptTimeSchedule resource type"
description: "Base type of Device health script time schedule."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceHealthScriptTimeSchedule resource type

Namespace: microsoft.graph



Base type of Device health script time schedule.


Inherits from [deviceHealthScriptRunSchedule](../resources/devicehealthscriptrunschedule.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|interval|Int32|The x value of every x hours for hourly schedule, every x days for Daily Schedule, every x weeks for weekly schedule, every x months for Monthly Schedule. Valid values 1 to 23 Inherited from [deviceHealthScriptRunSchedule](../resources/devicehealthscriptrunschedule.md)|
|time|TimeOfDay|At what time the script is scheduled to run. This collection can contain a maximum of 20 elements.|
|useUtc|Boolean|Indicate if the time is Utc or client local time.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceHealthScriptTimeSchedule"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceHealthScriptTimeSchedule",
  "interval": "Integer",
  "time": "String (time of day)",
  "useUtc": "Boolean"
}
```

