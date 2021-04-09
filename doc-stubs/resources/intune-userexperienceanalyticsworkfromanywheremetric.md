---
title: "userExperienceAnalyticsWorkFromAnywhereMetric resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsWorkFromAnywhereMetric resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsWorkFromAnywhereMetrics](../api/intune-userexperienceanalyticsworkfromanywheremetric-list.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md) collection|Get a list of the [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/userexperienceanalyticsworkfromanywheremetric.md) objects and their properties.|
|[Create userExperienceAnalyticsWorkFromAnywhereMetric](../api/intune-userexperienceanalyticsworkfromanywheremetric-create.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md)|Create a new [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md) object.|
|[Get userExperienceAnalyticsWorkFromAnywhereMetric](../api/intune-userexperienceanalyticsworkfromanywheremetric-get.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md)|Read the properties and relationships of a [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md) object.|
|[Update userExperienceAnalyticsWorkFromAnywhereMetric](../api/intune-userexperienceanalyticsworkfromanywheremetric-update.md)|[userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md)|Update the properties of a [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md) object.|
|[Delete userExperienceAnalyticsWorkFromAnywhereMetric](../api/intune-userexperienceanalyticsworkfromanywheremetric-delete.md)|None|Deletes a [userExperienceAnalyticsWorkFromAnywhereMetric](../resources/intune-userexperienceanalyticsworkfromanywheremetric.md) object.|
|[List metricDevices](../api/intune-userexperienceanalyticsworkfromanywheremetric-list-metricdevices.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) collection|Get the userExperienceAnalyticsWorkFromAnywhereDevice resources from the metricDevices navigation property.|
|[Create userExperienceAnalyticsWorkFromAnywhereDevice](../api/intune-userexperienceanalyticsworkfromanywheremetric-post-metricdevices.md)|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md)|Create a new userExperienceAnalyticsWorkFromAnywhereDevice object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|metricDevices|[userExperienceAnalyticsWorkFromAnywhereDevice](../resources/intune-userexperienceanalyticsworkfromanywheredevice.md) collection|**TODO: Add Description**|

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

