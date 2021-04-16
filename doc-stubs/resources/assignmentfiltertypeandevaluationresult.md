---
title: "assignmentFilterTypeAndEvaluationResult resource type"
description: "Represents the filter type and evalaution result of the filter."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# assignmentFilterTypeAndEvaluationResult resource type

Namespace: microsoft.graph



Represents the filter type and evalaution result of the filter.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignmentFilterType|deviceAndAppManagementAssignmentFilterType|Represents the filter type. Possible values are: `none`, `include`, `exclude`.|
|evaluationResult|assignmentFilterEvaluationResult|Represents the evalaution result of the filter. Possible values are: `unknown`, `match`, `notMatch`, `inconclusive`, `failure`, `notEvaluated`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.assignmentFilterTypeAndEvaluationResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.assignmentFilterTypeAndEvaluationResult",
  "assignmentFilterType": "String",
  "evaluationResult": "String"
}
```

