---
title: "deviceAndAppManagementAssignmentTarget resource type"
description: "Base type for assignment targets."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceAndAppManagementAssignmentTarget resource type

Namespace: microsoft.graph



Base type for assignment targets.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceAndAppManagementAssignmentFilterId|String|The Id of the filter for the target assignment.|
|deviceAndAppManagementAssignmentFilterType|deviceAndAppManagementAssignmentFilterType|The type of filter of the target assignment i.e. Exclude or Include. Possible values are: `none`, `include`, `exclude`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceAndAppManagementAssignmentTarget",
  "deviceAndAppManagementAssignmentFilterId": "String",
  "deviceAndAppManagementAssignmentFilterType": "String"
}
```

