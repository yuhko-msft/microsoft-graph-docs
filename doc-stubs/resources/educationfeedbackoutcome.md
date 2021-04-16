---
title: "educationFeedbackOutcome resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationFeedbackOutcome resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [educationOutcome](../resources/educationoutcome.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationFeedbackOutcomes](../api/educationfeedbackoutcome-list.md)|[educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) collection|Get a list of the [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) objects and their properties.|
|[Create educationFeedbackOutcome](../api/educationfeedbackoutcome-create.md)|[educationFeedbackOutcome](../resources/educationfeedbackoutcome.md)|Create a new [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) object.|
|[Get educationFeedbackOutcome](../api/educationfeedbackoutcome-get.md)|[educationFeedbackOutcome](../resources/educationfeedbackoutcome.md)|Read the properties and relationships of an [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) object.|
|[Update educationFeedbackOutcome](../api/educationfeedbackoutcome-update.md)|[educationFeedbackOutcome](../resources/educationfeedbackoutcome.md)|Update the properties of an [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) object.|
|[Delete educationFeedbackOutcome](../api/educationfeedbackoutcome-delete.md)|None|Deletes an [educationFeedbackOutcome](../resources/educationfeedbackoutcome.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|feedback|[educationFeedback](../resources/educationfeedback.md)|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [educationOutcome](../resources/educationoutcome.md)|
|publishedFeedback|[educationFeedback](../resources/educationfeedback.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationFeedbackOutcome",
  "baseType": "microsoft.graph.educationOutcome",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationFeedbackOutcome",
  "id": "String (identifier)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "feedback": {
    "@odata.type": "microsoft.graph.educationFeedback"
  },
  "publishedFeedback": {
    "@odata.type": "microsoft.graph.educationFeedback"
  }
}
```

