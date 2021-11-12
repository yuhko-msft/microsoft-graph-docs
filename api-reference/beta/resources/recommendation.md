---
title: "recommendation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# recommendation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List recommendations](../api/recommendation-list.md)|[recommendation](../resources/recommendation.md) collection|Get a list of the [recommendation](../resources/recommendation.md) objects and their properties.|
|[Create recommendation](../api/directory-post-recommendations.md)|[recommendation](../resources/recommendation.md)|Create a new [recommendation](../resources/recommendation.md) object.|
|[Get recommendation](../api/recommendation-get.md)|[recommendation](../resources/recommendation.md)|Read the properties and relationships of a [recommendation](../resources/recommendation.md) object.|
|[Update recommendation](../api/recommendation-update.md)|[recommendation](../resources/recommendation.md)|Update the properties of a [recommendation](../resources/recommendation.md) object.|
|[Delete recommendation](../api/recommendation-delete.md)|None|Deletes a [recommendation](../resources/recommendation.md) object.|
|[postpone](../api/recommendation-postpone.md)|[recommendation](../resources/recommendation.md)|**TODO: Add Description**|
|[dismiss](../api/recommendation-dismiss.md)|[recommendation](../resources/recommendation.md)|**TODO: Add Description**|
|[complete](../api/recommendation-complete.md)|[recommendation](../resources/recommendation.md)|**TODO: Add Description**|
|[reactivate](../api/recommendation-reactivate.md)|[recommendation](../resources/recommendation.md)|**TODO: Add Description**|
|[List impactedResources](../api/recommendation-list-impactedresources.md)|[recommendationResource](../resources/recommendationresource.md) collection|Get the recommendationResource resources from the impactedResources navigation property.|
|[Create recommendationResource](../api/recommendation-post-impactedresources.md)|[recommendationResource](../resources/recommendationresource.md)|Create a new recommendationResource object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actionSteps|[actionStep](../resources/actionstep.md) collection|**TODO: Add Description**|
|benefits|String|**TODO: Add Description**|
|category|recommendationCategory|**TODO: Add Description**.The possible values are: `usageAndCompliance`, `security`, `productivity`, `health`, `configuration`, `unknownFutureValue`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|currentScore|Double|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|featureArea|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|impactStartDateTime|DateTimeOffset|**TODO: Add Description**|
|impactType|String|**TODO: Add Description**|
|implementationCost|implementationCost|**TODO: Add Description**.The possible values are: `low`, `moderate`, `high`.|
|insights|String|**TODO: Add Description**|
|lastCheckedDateTime|DateTimeOffset|**TODO: Add Description**|
|lastModifiedBy|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|maxScore|Double|**TODO: Add Description**|
|postponeUntilDateTime|DateTimeOffset|**TODO: Add Description**|
|priority|recommendationPriority|**TODO: Add Description**.The possible values are: `low`, `medium`, `high`.|
|provider|String|**TODO: Add Description**|
|status|recommendationStatus|**TODO: Add Description**.The possible values are: `active`, `completedBySystem`, `completedByUser`, `dismissed`, `postponed`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|impactedResources|[recommendationResource](../resources/recommendationresource.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.recommendation",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.recommendation",
  "id": "String (identifier)",
  "actionSteps": [
    {
      "@odata.type": "microsoft.graph.actionStep"
    }
  ],
  "benefits": "String",
  "category": "String",
  "createdDateTime": "String (timestamp)",
  "currentScore": "Double",
  "displayName": "String",
  "featureArea": "String",
  "impactType": "String",
  "impactStartDateTime": "String (timestamp)",
  "implementationCost": "String",
  "insights": "String",
  "lastCheckedDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": "String",
  "maxScore": "Double",
  "postponeUntilDateTime": "String (timestamp)",
  "priority": "String",
  "provider": "String",
  "status": "String"
}
```

