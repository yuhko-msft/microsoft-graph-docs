---
title: "recommendation resource type"
description: "Represents an Azure AD best practice or improvement action recommended by Microsoft"
author: "hafowler"
ms.localizationpriority: medium
ms.prod: "directory-management"
doc_type: resourcePageType
---

# recommendation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**Represents an Azure AD best practice or improvement action recommended by Microsoft.**

Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List recommendations](../api/recommendation-list.md)|[recommendation](../resources/recommendation.md) collection|Get a list of [recommendation](../resources/recommendation.md) objects and their properties.|
|[Get recommendation](../api/recommendation-get.md)|[recommendation](../resources/recommendation.md)|Read the properties and relationships of a [recommendation](../resources/recommendation.md) object.|
|[Complete](../api/recommendation-complete.md)|[recommendation](../resources/recommendation.md)|Mark a [recommendation](../resources/recommendation.md) status as `completedByUser` after completing all [action steps](../resources/actionstep.md).|
|[Postpone](../api/recommendation-postpone.md)|[recommendation](../resources/recommendation.md)|Mark a [recommendation](../resources/recommendation.md) status as `postponed` to a specified date and time.|
|[Dismiss](../api/recommendation-dismiss.md)|[recommendation](../resources/recommendation.md)|Mark a [recommendation](../resources/recommendation.md) status as `dismissed`.|
|[reactivate](../api/recommendation-reactivate.md)|[recommendation](../resources/recommendation.md)|Mark a [recommendation](../resources/recommendation.md) status as `active`.|
|[List impactedResources](../api/recommendation-list-impactedresources.md)|[recommendationResource](../resources/recommendationresource.md) collection|List the recommendationResource resources from the impactedResources navigation property.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|actionSteps|[actionStep](../resources/actionstep.md) collection|List of actions to take to complete a [recommendation](../resources/recommendation.md).|
|benefits|String|Describes the value provided by completing a [recommendation](../resources/recommendation.md).|
|category|recommendationCategory|Indicates the type of [recommendation](../resources/recommendation.md). The possible values are: `usageAndCompliance`, `security`, `productivity`, `health`, `configuration`, `unknownFutureValue`.|
|createdDateTime|DateTimeOffset|The DateTime that the recommendation was detected as applicable to your directory.|
|currentScore|Double|Attained score if the [recommendation](../resources/recommendation.md) is a Secure Score for Identity improvement action.|
|displayName|String|The title of the [recommendation](../resources/recommendation.md).|
|featureArea|String|The directory feature that the [recommendation](../resources/recommendation.md) is related to.|
|id|String|The unique identifer for the recommendation. Inherited from [entity](../resources/entity.md).|
|impactStartDateTime|DateTimeOffset|The future DateTime that a [recommendation](../resources/recommendation.md) should be completed by. |
|impactType|String|Indicates the scope of impact of a [recommendation](../resources/recommendation.md).|
|implementationCost|implementationCost|Indicates the level of effort required to complete a [recommendation](../resources/recommendation.md). The possible values are: `low`, `moderate`, `high`.|
|insights|String|Describes how a [recommendation](../resources/recommendation.md) uniquely applies to your directory.|
|lastCheckedDateTime|DateTimeOffset|The most recent date and time a [recommendation](../resources/recommendation.md) was deemed applicable to your directory.|
|lastModifiedBy|String|Name of the user who last updated the [recommendation](../resources/recommendation.md).|
|lastModifiedDateTime|DateTimeOffset|The date and time a [recommendation](../resources/recommendation.md) was last updated.|
|maxScore|Double|Maximum possible score to attain if the [recommendation](../resources/recommendation.md) is a Secure Score for Identity improvement action.|
|postponeUntilDateTime|DateTimeOffset|The date and time a [recommendation](../resources/recommendation.md) is postponed to if its status is `postponed`.|
|priority|recommendationPriority|Indicates the time sensitivity for a [recommendation](../resources/recommendation.md) to be completed.The possible values are: `low`, `medium`, `high`.|
|provider|String|The service that generated the [recommendation](../resources/recommendation.md).|
|status|recommendationStatus|Indicates whether a [recommendation](../resources/recommendation.md) needs to be addressed. The possible values are: `active`, `completedBySystem`, `completedByUser`, `dismissed`, `postponed`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|impactedResources|[recommendationResource](../resources/recommendationresource.md) collection|List of directory resources associated with a recommendation.|

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

