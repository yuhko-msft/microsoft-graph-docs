---
title: "userExperienceAnalyticsMetricHistory resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsMetricHistory resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsMetricHistories](../api/intune-userexperienceanalyticsmetrichistory-list.md)|[userExperienceAnalyticsMetricHistory](../resources/intune-userexperienceanalyticsmetrichistory.md) collection|Get a list of the [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) objects and their properties.|
|[Create userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-create.md)|[userExperienceAnalyticsMetricHistory](../resources/intune-userexperienceanalyticsmetrichistory.md)|Create a new [userExperienceAnalyticsMetricHistory](../resources/intune-userexperienceanalyticsmetrichistory.md) object.|
|[Get userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-get.md)|[userExperienceAnalyticsMetricHistory](../resources/intune-userexperienceanalyticsmetrichistory.md)|Read the properties and relationships of a [userExperienceAnalyticsMetricHistory](../resources/intune-userexperienceanalyticsmetrichistory.md) object.|
|[Update userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-update.md)|[userExperienceAnalyticsMetricHistory](../resources/intune-userexperienceanalyticsmetrichistory.md)|Update the properties of a [userExperienceAnalyticsMetricHistory](../resources/intune-userexperienceanalyticsmetrichistory.md) object.|
|[Delete userExperienceAnalyticsMetricHistory](../api/intune-userexperienceanalyticsmetrichistory-delete.md)|None|Deletes a [userExperienceAnalyticsMetricHistory](../resources/intune-userexperienceanalyticsmetrichistory.md) object.|
|[List userExperienceAnalyticsMetric](../api/intune-userexperienceanalyticsmetrichistory-list-userexperienceanalyticsmetric.md)|[userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md) collection|Get the userExperienceAnalyticsMetrics from the userExperienceAnalyticsMetric navigation property.|
|[Add userExperienceAnalyticsMetric](../api/intune-userexperienceanalyticsmetrichistory-post-userexperienceanalyticsmetric.md)|[userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md)|Add userExperienceAnalyticsMetric by posting to the userExperienceAnalyticsMetric collection.|
|[Remove userExperienceAnalyticsMetric](../api/intune-userexperienceanalyticsmetrichistory-delete-userexperienceanalyticsmetric.md)|None|Remove a [userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|metricDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|userExperienceAnalyticsMetric|[userExperienceAnalyticsMetric](../resources/intune-userexperienceanalyticsmetric.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsMetricHistory",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsMetricHistory",
  "id": "String (identifier)",
  "metricDateTime": "String (timestamp)"
}
```

