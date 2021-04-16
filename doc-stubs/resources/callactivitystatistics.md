---
title: "callActivityStatistics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# callActivityStatistics resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [activityStatistics](../resources/activitystatistics.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List callActivityStatistics](../api/callactivitystatistics-list.md)|[callActivityStatistics](../resources/callactivitystatistics.md) collection|Get a list of the [callActivityStatistics](../resources/callactivitystatistics.md) objects and their properties.|
|[Create callActivityStatistics](../api/callactivitystatistics-create.md)|[callActivityStatistics](../resources/callactivitystatistics.md)|Create a new [callActivityStatistics](../resources/callactivitystatistics.md) object.|
|[Get callActivityStatistics](../api/callactivitystatistics-get.md)|[callActivityStatistics](../resources/callactivitystatistics.md)|Read the properties and relationships of a [callActivityStatistics](../resources/callactivitystatistics.md) object.|
|[Update callActivityStatistics](../api/callactivitystatistics-update.md)|[callActivityStatistics](../resources/callactivitystatistics.md)|Update the properties of a [callActivityStatistics](../resources/callactivitystatistics.md) object.|
|[Delete callActivityStatistics](../api/callactivitystatistics-delete.md)|None|Deletes a [callActivityStatistics](../resources/callactivitystatistics.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activity|analyticsActivityType|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md). Possible values are: `Email`, `Meeting`, `Focus`, `Chat`, `Call`.|
|afterHours|Duration|**TODO: Add Description**|
|duration|Duration|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|endDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|startDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|timeZoneUsed|String|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.callActivityStatistics",
  "baseType": "microsoft.graph.activityStatistics",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.callActivityStatistics",
  "id": "String (identifier)",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)"
}
```

