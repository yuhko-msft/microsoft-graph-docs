---
title: "meetingActivityStatistics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# meetingActivityStatistics resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [activityStatistics](../resources/activitystatistics.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List meetingActivityStatistics](../api/meetingactivitystatistics-list.md)|[meetingActivityStatistics](../resources/meetingactivitystatistics.md) collection|Get a list of the [meetingActivityStatistics](../resources/meetingactivitystatistics.md) objects and their properties.|
|[Create meetingActivityStatistics](../api/meetingactivitystatistics-create.md)|[meetingActivityStatistics](../resources/meetingactivitystatistics.md)|Create a new [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object.|
|[Get meetingActivityStatistics](../api/meetingactivitystatistics-get.md)|[meetingActivityStatistics](../resources/meetingactivitystatistics.md)|Read the properties and relationships of a [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object.|
|[Update meetingActivityStatistics](../api/meetingactivitystatistics-update.md)|[meetingActivityStatistics](../resources/meetingactivitystatistics.md)|Update the properties of a [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object.|
|[Delete meetingActivityStatistics](../api/meetingactivitystatistics-delete.md)|None|Deletes a [meetingActivityStatistics](../resources/meetingactivitystatistics.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activity|analyticsActivityType|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md). Possible values are: `Email`, `Meeting`, `Focus`, `Chat`, `Call`.|
|afterHours|Duration|**TODO: Add Description**|
|conflicting|Duration|**TODO: Add Description**|
|duration|Duration|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|endDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|long|Duration|**TODO: Add Description**|
|multitasking|Duration|**TODO: Add Description**|
|organized|Duration|**TODO: Add Description**|
|recurring|Duration|**TODO: Add Description**|
|startDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|timeZoneUsed|String|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.meetingActivityStatistics",
  "baseType": "microsoft.graph.activityStatistics",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.meetingActivityStatistics",
  "id": "String (identifier)",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)",
  "conflicting": "String (duration)",
  "long": "String (duration)",
  "multitasking": "String (duration)",
  "organized": "String (duration)",
  "recurring": "String (duration)"
}
```

