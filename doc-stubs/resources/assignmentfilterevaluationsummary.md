---
title: "assignmentFilterEvaluationSummary resource type"
description: "Represent result summary for assignment filter evaluation"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# assignmentFilterEvaluationSummary resource type

Namespace: microsoft.graph



Represent result summary for assignment filter evaluation

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignmentFilterDisplayName|String|The admin defined name for assignment filter.|
|assignmentFilterId|String|Unique identifier for the assignment filter object|
|assignmentFilterLastModifiedDateTime|DateTimeOffset|The time the assignment filter was last modified.|
|assignmentFilterPlatform|devicePlatformType|The platform for which this assignment filter is created. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|assignmentFilterType|deviceAndAppManagementAssignmentFilterType|Indicate filter type either include or exclude. Possible values are: `none`, `include`, `exclude`.|
|assignmentFilterTypeAndEvaluationResults|[assignmentFilterTypeAndEvaluationResult](../resources/assignmentfiltertypeandevaluationresult.md) collection|A collection of filter types and their corresponding evaluation results.|
|evaluationDateTime|DateTimeOffset|The time assignment filter was evaluated.|
|evaluationResult|assignmentFilterEvaluationResult|Assignment filter evaluation result. Possible values are: `unknown`, `match`, `notMatch`, `inconclusive`, `failure`, `notEvaluated`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.assignmentFilterEvaluationSummary"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.assignmentFilterEvaluationSummary",
  "assignmentFilterDisplayName": "String",
  "assignmentFilterId": "String",
  "assignmentFilterLastModifiedDateTime": "String (timestamp)",
  "assignmentFilterPlatform": "String",
  "assignmentFilterType": "String",
  "assignmentFilterTypeAndEvaluationResults": [
    {
      "@odata.type": "microsoft.graph.assignmentFilterTypeAndEvaluationResult"
    }
  ],
  "evaluationDateTime": "String (timestamp)",
  "evaluationResult": "String"
}
```

