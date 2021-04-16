---
title: "userExperienceAnalyticsMetricHistory resource type"
description: "The user experience analytics metric history."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsMetricHistory resource type

Namespace: microsoft.graph



The user experience analytics metric history.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsMetricHistories](../api/userexperienceanalyticsmetrichistory-list.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) collection|Get a list of the [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) objects and their properties.|
|[Create userExperienceAnalyticsMetricHistory](../api/userexperienceanalyticsmetrichistory-create.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md)|Create a new [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) object.|
|[Get userExperienceAnalyticsMetricHistory](../api/userexperienceanalyticsmetrichistory-get.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md)|Read the properties and relationships of a [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) object.|
|[Update userExperienceAnalyticsMetricHistory](../api/userexperienceanalyticsmetrichistory-update.md)|[userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md)|Update the properties of a [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) object.|
|[Delete userExperienceAnalyticsMetricHistory](../api/userexperienceanalyticsmetrichistory-delete.md)|None|Deletes a [userExperienceAnalyticsMetricHistory](../resources/userexperienceanalyticsmetrichistory.md) object.|
|[List userExperienceAnalyticsMetric](../api/userexperienceanalyticsmetrichistory-list-userexperienceanalyticsmetric.md)|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md) collection|Get the userExperienceAnalyticsMetric resources from the userExperienceAnalyticsMetric navigation property.|
|[Add userExperienceAnalyticsMetric](../api/userexperienceanalyticsmetrichistory-post-userexperienceanalyticsmetric.md)|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md)|Add userExperienceAnalyticsMetric by posting to the userExperienceAnalyticsMetric collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceId|String|The user experience analytics device id.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|metricDateTime|DateTimeOffset|The user experience analytics metric date time.|
|metricType|String|The user experience analytics metric type.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|userExperienceAnalyticsMetric|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md)|User experience analytics metric.|

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
  "deviceId": "String",
  "metricDateTime": "String (timestamp)",
  "metricType": "String"
}
```

