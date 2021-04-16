---
title: "deviceHealthScriptAssignment resource type"
description: "Contains properties used to assign a device management script to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceHealthScriptAssignment resource type

Namespace: microsoft.graph



Contains properties used to assign a device management script to a group.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceHealthScriptAssignments](../api/devicehealthscriptassignment-list.md)|[deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md) collection|Get a list of the [deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md) objects and their properties.|
|[Create deviceHealthScriptAssignment](../api/devicehealthscriptassignment-create.md)|[deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md)|Create a new [deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md) object.|
|[Get deviceHealthScriptAssignment](../api/devicehealthscriptassignment-get.md)|[deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md)|Read the properties and relationships of a [deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md) object.|
|[Update deviceHealthScriptAssignment](../api/devicehealthscriptassignment-update.md)|[deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md)|Update the properties of a [deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md) object.|
|[Delete deviceHealthScriptAssignment](../api/devicehealthscriptassignment-delete.md)|None|Deletes a [deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|runRemediationScript|Boolean|Determine whether we want to run detection script only or run both detection script and remediation script|
|runSchedule|[deviceHealthScriptRunSchedule](../resources/devicehealthscriptrunschedule.md)|Script run schedule for the target group|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The Azure Active Directory group we are targeting the script to|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceHealthScriptAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceHealthScriptAssignment",
  "id": "String (identifier)",
  "runRemediationScript": "Boolean",
  "runSchedule": {
    "@odata.type": "microsoft.graph.deviceHealthScriptRunSchedule"
  },
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

