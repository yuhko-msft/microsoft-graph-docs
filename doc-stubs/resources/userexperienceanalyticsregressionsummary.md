---
title: "userExperienceAnalyticsRegressionSummary resource type"
description: "The user experience analytics Regression Summary."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsRegressionSummary resource type

Namespace: microsoft.graph



The user experience analytics Regression Summary.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsRegressionSummaries](../api/userexperienceanalyticsregressionsummary-list.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md) collection|Get a list of the [userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md) objects and their properties.|
|[Create userExperienceAnalyticsRegressionSummary](../api/userexperienceanalyticsregressionsummary-create.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md)|Create a new [userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md) object.|
|[Get userExperienceAnalyticsRegressionSummary](../api/userexperienceanalyticsregressionsummary-get.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md)|Read the properties and relationships of a [userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md) object.|
|[Update userExperienceAnalyticsRegressionSummary](../api/userexperienceanalyticsregressionsummary-update.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md)|Update the properties of a [userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md) object.|
|[Delete userExperienceAnalyticsRegressionSummary](../api/userexperienceanalyticsregressionsummary-delete.md)|None|Deletes a [userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md) object.|
|[summarizeDeviceRegressionPerformance](../api/userexperienceanalyticsregressionsummary-summarizedeviceregressionperformance.md)|[userExperienceAnalyticsRegressionSummary](../resources/userexperienceanalyticsregressionsummary.md)|**TODO: Add Description**|
|[List manufacturerRegression](../api/userexperienceanalyticsregressionsummary-list-manufacturerregression.md)|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md) collection|Get the userExperienceAnalyticsMetric resources from the manufacturerRegression navigation property.|
|[Create userExperienceAnalyticsMetric](../api/userexperienceanalyticsregressionsummary-post-manufacturerregression.md)|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md)|Create a new userExperienceAnalyticsMetric object.|
|[List modelRegression](../api/userexperienceanalyticsregressionsummary-list-modelregression.md)|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md) collection|Get the userExperienceAnalyticsMetric resources from the modelRegression navigation property.|
|[Create userExperienceAnalyticsMetric](../api/userexperienceanalyticsregressionsummary-post-modelregression.md)|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md)|Create a new userExperienceAnalyticsMetric object.|
|[List operatingSystemRegression](../api/userexperienceanalyticsregressionsummary-list-operatingsystemregression.md)|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md) collection|Get the userExperienceAnalyticsMetric resources from the operatingSystemRegression navigation property.|
|[Create userExperienceAnalyticsMetric](../api/userexperienceanalyticsregressionsummary-post-operatingsystemregression.md)|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md)|Create a new userExperienceAnalyticsMetric object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|manufacturerRegression|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md) collection|The metric values for the user experience analytics Manufacturer regression.|
|modelRegression|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md) collection|The metric values for the user experience analytics model regression.|
|operatingSystemRegression|[userExperienceAnalyticsMetric](../resources/userexperienceanalyticsmetric.md) collection|The metric values for the user experience analytics operating system regression.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsRegressionSummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsRegressionSummary",
  "id": "String (identifier)"
}
```

