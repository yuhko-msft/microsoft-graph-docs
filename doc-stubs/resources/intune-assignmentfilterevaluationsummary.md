---
title: "assignmentFilterEvaluationSummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# assignmentFilterEvaluationSummary resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignmentFilterDisplayName|String|**TODO: Add Description**|
|assignmentFilterId|String|**TODO: Add Description**|
|assignmentFilterLastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|assignmentFilterPlatform|devicePlatformType|**TODO: Add Description**. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|assignmentFilterType|deviceAndAppManagementAssignmentFilterType|**TODO: Add Description**. Possible values are: `none`, `include`, `exclude`.|
|assignmentFilterTypeAndEvaluationResults|[assignmentFilterTypeAndEvaluationResult](../resources/intune-assignmentfiltertypeandevaluationresult.md) collection|**TODO: Add Description**|
|evaluationDateTime|DateTimeOffset|**TODO: Add Description**|
|evaluationResult|assignmentFilterEvaluationResult|**TODO: Add Description**. Possible values are: `unknown`, `match`, `notMatch`, `inconclusive`, `failure`, `notEvaluated`.|

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
  "assignmentFilterId": "String",
  "assignmentFilterLastModifiedDateTime": "String (timestamp)",
  "assignmentFilterDisplayName": "String",
  "assignmentFilterPlatform": "String",
  "evaluationResult": "String",
  "evaluationDateTime": "String (timestamp)",
  "assignmentFilterType": "String",
  "assignmentFilterTypeAndEvaluationResults": [
    {
      "@odata.type": "microsoft.graph.assignmentFilterTypeAndEvaluationResult"
    }
  ]
}
```

