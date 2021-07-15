---
title: "userExperienceAnalyticsOverview resource type"
description: "The user experience analytics overview entity contains the overall score and the scores and insights of every metric of all categories."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userExperienceAnalyticsOverview resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The user experience analytics overview entity contains the overall score and the scores and insights of every metric of all categories.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userExperienceAnalyticsOverviews](../api/userexperienceanalyticsoverview-list.md)|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md) collection|Get a list of the [userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md) objects and their properties.|
|[Create userExperienceAnalyticsOverview](../api/userexperienceanalyticsoverview-create.md)|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md)|Create a new [userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md) object.|
|[Get userExperienceAnalyticsOverview](../api/userexperienceanalyticsoverview-get.md)|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md)|Read the properties and relationships of a [userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md) object.|
|[Update userExperienceAnalyticsOverview](../api/userexperienceanalyticsoverview-update.md)|[userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md)|Update the properties of a [userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md) object.|
|[Delete userExperienceAnalyticsOverview](../api/userexperienceanalyticsoverview-delete.md)|None|Deletes a [userExperienceAnalyticsOverview](../resources/userexperienceanalyticsoverview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|insights|[userExperienceAnalyticsInsight](../resources/userexperienceanalyticsinsight.md) collection|The user experience analytics insights.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.userExperienceAnalyticsOverview",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsOverview",
  "id": "String (identifier)",
  "insights": [
    {
      "@odata.type": "microsoft.graph.userExperienceAnalyticsInsight"
    }
  ]
}
```

