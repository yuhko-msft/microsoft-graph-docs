---
title: "activityStatistics resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# activityStatistics resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List activityStatistics](../api/activitystatistics-list.md)|[activityStatistics](../resources/activitystatistics.md) collection|Get a list of the [activityStatistics](../resources/activitystatistics.md) objects and their properties.|
|[Create activityStatistics](../api/activitystatistics-post-activitystatistics.md)|[activityStatistics](../resources/activitystatistics.md)|Create a new [activityStatistics](../resources/activitystatistics.md) object.|
|[Get activityStatistics](../api/activitystatistics-get.md)|[activityStatistics](../resources/activitystatistics.md)|Read the properties and relationships of an [activityStatistics](../resources/activitystatistics.md) object.|
|[Update activityStatistics](../api/activitystatistics-update.md)|[activityStatistics](../resources/activitystatistics.md)|Update the properties of an [activityStatistics](../resources/activitystatistics.md) object.|
|[Delete activityStatistics](../api/activitystatistics-delete.md)|None|Deletes an [activityStatistics](../resources/activitystatistics.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activity|analyticsActivityType|**TODO: Add Description**. Possible values are: `Email`, `Meeting`, `Focus`, `Chat`, `Call`.|
|duration|Duration|**TODO: Add Description**|
|endDate|Date|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|startDate|Date|**TODO: Add Description**|
|timeZoneUsed|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.activityStatistics",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.activityStatistics",
  "id": "String (identifier)",
  "activity": "String",
  "duration": "String (duration)",
  "endDate": "Date",
  "startDate": "Date",
  "timeZoneUsed": "String"
}
```

