---
title: "chatActivityStatistics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# chatActivityStatistics resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [activityStatistics](../resources/activitystatistics.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List chatActivityStatistics](../api/chatactivitystatistics-list.md)|[chatActivityStatistics](../resources/chatactivitystatistics.md) collection|Get a list of the [chatActivityStatistics](../resources/chatactivitystatistics.md) objects and their properties.|
|[Create chatActivityStatistics](../api/chatactivitystatistics-create.md)|[chatActivityStatistics](../resources/chatactivitystatistics.md)|Create a new [chatActivityStatistics](../resources/chatactivitystatistics.md) object.|
|[Get chatActivityStatistics](../api/chatactivitystatistics-get.md)|[chatActivityStatistics](../resources/chatactivitystatistics.md)|Read the properties and relationships of a [chatActivityStatistics](../resources/chatactivitystatistics.md) object.|
|[Update chatActivityStatistics](../api/chatactivitystatistics-update.md)|[chatActivityStatistics](../resources/chatactivitystatistics.md)|Update the properties of a [chatActivityStatistics](../resources/chatactivitystatistics.md) object.|
|[Delete chatActivityStatistics](../api/chatactivitystatistics-delete.md)|None|Deletes a [chatActivityStatistics](../resources/chatactivitystatistics.md) object.|

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
  "@odata.type": "microsoft.graph.chatActivityStatistics",
  "baseType": "microsoft.graph.activityStatistics",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.chatActivityStatistics",
  "id": "String (identifier)",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String",
  "afterHours": "String (duration)"
}
```

