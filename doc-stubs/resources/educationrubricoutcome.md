---
title: "educationRubricOutcome resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationRubricOutcome resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [educationOutcome](../resources/educationoutcome.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationRubricOutcomes](../api/educationrubricoutcome-list.md)|[educationRubricOutcome](../resources/educationrubricoutcome.md) collection|Get a list of the [educationRubricOutcome](../resources/educationrubricoutcome.md) objects and their properties.|
|[Create educationRubricOutcome](../api/educationrubricoutcome-create.md)|[educationRubricOutcome](../resources/educationrubricoutcome.md)|Create a new [educationRubricOutcome](../resources/educationrubricoutcome.md) object.|
|[Get educationRubricOutcome](../api/educationrubricoutcome-get.md)|[educationRubricOutcome](../resources/educationrubricoutcome.md)|Read the properties and relationships of an [educationRubricOutcome](../resources/educationrubricoutcome.md) object.|
|[Update educationRubricOutcome](../api/educationrubricoutcome-update.md)|[educationRubricOutcome](../resources/educationrubricoutcome.md)|Update the properties of an [educationRubricOutcome](../resources/educationrubricoutcome.md) object.|
|[Delete educationRubricOutcome](../api/educationrubricoutcome-delete.md)|None|Deletes an [educationRubricOutcome](../resources/educationrubricoutcome.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|publishedRubricQualityFeedback|[rubricQualityFeedbackModel](../resources/rubricqualityfeedbackmodel.md) collection|**TODO: Add Description**|
|publishedRubricQualitySelectedLevels|[rubricQualitySelectedColumnModel](../resources/rubricqualityselectedcolumnmodel.md) collection|**TODO: Add Description**|
|rubricQualityFeedback|[rubricQualityFeedbackModel](../resources/rubricqualityfeedbackmodel.md) collection|**TODO: Add Description**|
|rubricQualitySelectedLevels|[rubricQualitySelectedColumnModel](../resources/rubricqualityselectedcolumnmodel.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationRubricOutcome",
  "baseType": "microsoft.graph.educationOutcome",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationRubricOutcome",
  "id": "String (identifier)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "publishedRubricQualityFeedback": [
    {
      "@odata.type": "microsoft.graph.rubricQualityFeedbackModel"
    }
  ],
  "publishedRubricQualitySelectedLevels": [
    {
      "@odata.type": "microsoft.graph.rubricQualitySelectedColumnModel"
    }
  ],
  "rubricQualityFeedback": [
    {
      "@odata.type": "microsoft.graph.rubricQualityFeedbackModel"
    }
  ],
  "rubricQualitySelectedLevels": [
    {
      "@odata.type": "microsoft.graph.rubricQualitySelectedColumnModel"
    }
  ]
}
```

