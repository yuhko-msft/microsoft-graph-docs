---
title: "allDevicesAssignmentTarget resource type"
description: "Represents an assignment to all managed devices in the tenant."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# allDevicesAssignmentTarget resource type

Namespace: microsoft.graph

Represents an assignment to all managed devices in the tenant.


Inherits from [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|deviceAndAppManagementAssignmentFilterId|String|The Id of the filter for the target assignment. Inherited from [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|
|deviceAndAppManagementAssignmentFilterType|deviceAndAppManagementAssignmentFilterType|The type of filter of the target assignment i.e. Exclude or Include. Inherited from [deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md). Possible values are: `none`, `include`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.allDevicesAssignmentTarget"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.allDevicesAssignmentTarget",
  "deviceAndAppManagementAssignmentFilterId": "String",
  "deviceAndAppManagementAssignmentFilterType": "String"
}
```

