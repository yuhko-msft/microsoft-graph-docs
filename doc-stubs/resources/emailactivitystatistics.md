---
title: "emailActivityStatistics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailActivityStatistics resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [activityStatistics](../resources/activitystatistics.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailActivityStatistics](../api/emailactivitystatistics-list.md)|[emailActivityStatistics](../resources/emailactivitystatistics.md) collection|Get a list of the [emailActivityStatistics](../resources/emailactivitystatistics.md) objects and their properties.|
|[Create emailActivityStatistics](../api/emailactivitystatistics-create.md)|[emailActivityStatistics](../resources/emailactivitystatistics.md)|Create a new [emailActivityStatistics](../resources/emailactivitystatistics.md) object.|
|[Get emailActivityStatistics](../api/emailactivitystatistics-get.md)|[emailActivityStatistics](../resources/emailactivitystatistics.md)|Read the properties and relationships of an [emailActivityStatistics](../resources/emailactivitystatistics.md) object.|
|[Update emailActivityStatistics](../api/emailactivitystatistics-update.md)|[emailActivityStatistics](../resources/emailactivitystatistics.md)|Update the properties of an [emailActivityStatistics](../resources/emailactivitystatistics.md) object.|
|[Delete emailActivityStatistics](../api/emailactivitystatistics-delete.md)|None|Deletes an [emailActivityStatistics](../resources/emailactivitystatistics.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activity|analyticsActivityType|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md). Possible values are: `Email`, `Meeting`, `Focus`, `Chat`, `Call`.|
|afterHours|Duration|**TODO: Add Description**|
|duration|Duration|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|endDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|readEmail|Duration|**TODO: Add Description**|
|sentEmail|Duration|**TODO: Add Description**|
|startDate|Date|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|
|timeZoneUsed|String|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailActivityStatistics",
  "baseType": "microsoft.graph.activityStatistics",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailActivityStatistics",
  "id": "String (identifier)",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)",
  "readEmail": "String (duration)",
  "sentEmail": "String (duration)"
}
```

