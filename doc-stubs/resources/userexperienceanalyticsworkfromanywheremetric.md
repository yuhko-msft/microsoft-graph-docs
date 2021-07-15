---
title: "userExperienceAnalyticsWorkFromAnywhereMetric resource type"
description: "The user experience analytics metric for work from anywhere report"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereMetric resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics metric for work from anywhere report


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsWorkFromAnywhereMetrics](../api/userexperienceanalyticsworkfromanywheremetric-list.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) collection|Get a list of the [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) objects and their properties.|
|[Create userExperienceAnalyticsWorkFromAnywhereMetric](../api/userexperienceanalyticsworkfromanywheremetric-create.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md)|Create a new [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) object.|
|[Get userExperienceAnalyticsWorkFromAnywhereMetric](../api/userexperienceanalyticsworkfromanywheremetric-get.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md)|Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) object.|
|[Update userExperienceAnalyticsWorkFromAnywhereMetric](../api/userexperienceanalyticsworkfromanywheremetric-update.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md)|Update the properties of a [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) object.|
|[Delete userExperienceAnalyticsWorkFromAnywhereMetric](../api/userexperienceanalyticsworkfromanywheremetric-delete.md)|None|Deletes a [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) object.|
|[List metricDevices](../api/userexperienceanalyticsworkfromanywheremetric-list-metricdevices.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) collection|Get the userExperienceAnalyticsWorkFromAnywhereDevice resources from the metricDevices navigation property.|
|[Create userExperienceAnalyticsWorkFromAnywhereDevice](../api/userexperienceanalyticsworkfromanywheremetric-post-metricdevices.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md)|Create a new userExperienceAnalyticsWorkFromAnywhereDevice object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|metricDevices|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/userexperienceanalyticsworkfromanywheredevice.md) collection|The work from anywhere metric devices.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsWorkFromAnywhereMetric",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsWorkFromAnywhereMetric",
  "id": "String (identifier)"
}
```

