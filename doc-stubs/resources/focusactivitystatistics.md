---
title: "focusActivityStatistics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# focusActivityStatistics resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [activityStatistics](../resources/activitystatistics.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List focusActivityStatistics](../api/focusactivitystatistics-list.md)|[focusActivityStatistics](../resources/focusactivitystatistics.md) collection|Get a list of the [focusActivityStatistics](../resources/focusactivitystatistics.md) objects and their properties.|
|[Create focusActivityStatistics](../api/focusactivitystatistics-create.md)|[focusActivityStatistics](../resources/focusactivitystatistics.md)|Create a new [focusActivityStatistics](../resources/focusactivitystatistics.md) object.|
|[Get focusActivityStatistics](../api/focusactivitystatistics-get.md)|[focusActivityStatistics](../resources/focusactivitystatistics.md)|Read the properties and relationships of a [focusActivityStatistics](../resources/focusactivitystatistics.md) object.|
|[Update focusActivityStatistics](../api/focusactivitystatistics-update.md)|[focusActivityStatistics](../resources/focusactivitystatistics.md)|Update the properties of a [focusActivityStatistics](../resources/focusactivitystatistics.md) object.|
|[Delete focusActivityStatistics](../api/focusactivitystatistics-delete.md)|None|Deletes a [focusActivityStatistics](../resources/focusactivitystatistics.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activity|analyticsActivityType|**TODO: Add Description** Inherited from [activityStatistics](../resources/activitystatistics.md). Possible values are: `Email`, `Meeting`, `Focus`, `Chat`, `Call`.|
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
  "@odata.type": "microsoft.graph.focusActivityStatistics",
  "baseType": "microsoft.graph.activityStatistics",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.focusActivityStatistics",
  "id": "String (identifier)",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String"
}
```

