---
title: "exclusionGroupAssignmentTarget resource type"
description: "Represents a group that should be excluded from an assignment."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# exclusionGroupAssignmentTarget resource type

Namespace: microsoft.graph

Represents a group that should be excluded from an assignment.


Inherits from [groupAssignmentTarget](../resources/groupassignmenttarget.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceAndAppManagementAssignmentFilterId|String|The Id of the filter for the target assignment. Inherited from [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|
|deviceAndAppManagementAssignmentFilterType|deviceAndAppManagementAssignmentFilterType|The type of filter of the target assignment i.e. Exclude or Include. Inherited from [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md). Possible values are: `none`, `include`.|
|groupId|String|The group Id that is the target of the assignment. Inherited from [groupAssignmentTarget](../resources/groupassignmenttarget.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.exclusionGroupAssignmentTarget"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exclusionGroupAssignmentTarget",
  "deviceAndAppManagementAssignmentFilterId": "String",
  "deviceAndAppManagementAssignmentFilterType": "String",
  "groupId": "String"
}
```

