---
title: "deviceShellScript resource type"
description: "Intune will provide customer the ability to run their Shell scripts on the enrolled Mac OS devices. The script can be run once or periodically."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceShellScript resource type

Namespace: microsoft.graph



Intune will provide customer the ability to run their Shell scripts on the enrolled Mac OS devices. The script can be run once or periodically.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceShellScripts](../api/deviceshellscript-list.md)|[deviceShellScript](../resources/deviceshellscript.md) collection|Get a list of the [deviceShellScript](../resources/deviceshellscript.md) objects and their properties.|
|[Create deviceShellScript](../api/deviceshellscript-create.md)|[deviceShellScript](../resources/deviceshellscript.md)|Create a new [deviceShellScript](../resources/deviceshellscript.md) object.|
|[Get deviceShellScript](../api/deviceshellscript-get.md)|[deviceShellScript](../resources/deviceshellscript.md)|Read the properties and relationships of a [deviceShellScript](../resources/deviceshellscript.md) object.|
|[Update deviceShellScript](../api/deviceshellscript-update.md)|[deviceShellScript](../resources/deviceshellscript.md)|Update the properties of a [deviceShellScript](../resources/deviceshellscript.md) object.|
|[Delete deviceShellScript](../api/deviceshellscript-delete.md)|None|Deletes a [deviceShellScript](../resources/deviceshellscript.md) object.|
|[assign](../api/deviceshellscript-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/deviceshellscript-list-assignments.md)|[deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) collection|Get the deviceManagementScriptAssignment resources from the assignments navigation property.|
|[Create deviceManagementScriptAssignment](../api/deviceshellscript-post-assignments.md)|[deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md)|Create a new deviceManagementScriptAssignment object.|
|[List deviceRunStates](../api/deviceshellscript-list-devicerunstates.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) collection|Get the deviceManagementScriptDeviceState resources from the deviceRunStates navigation property.|
|[Create deviceManagementScriptDeviceState](../api/deviceshellscript-post-devicerunstates.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md)|Create a new deviceManagementScriptDeviceState object.|
|[List groupAssignments](../api/deviceshellscript-list-groupassignments.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) collection|Get the deviceManagementScriptGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceManagementScriptGroupAssignment](../api/deviceshellscript-post-groupassignments.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md)|Create a new deviceManagementScriptGroupAssignment object.|
|[List deviceManagementScriptRunSummary](../api/deviceshellscript-list-runsummary.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) collection|Get the deviceManagementScriptRunSummary resources from the runSummary navigation property.|
|[Add deviceManagementScriptRunSummary](../api/deviceshellscript-post-runsummary.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md)|Add runSummary by posting to the runSummary collection.|
|[List userRunStates](../api/deviceshellscript-list-userrunstates.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) collection|Get the deviceManagementScriptUserState resources from the userRunStates navigation property.|
|[Create deviceManagementScriptUserState](../api/deviceshellscript-post-userrunstates.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md)|Create a new deviceManagementScriptUserState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockExecutionNotifications|Boolean|Does not notify the user a script is being executed|
|createdDateTime|DateTimeOffset|The date and time the device management script was created. This property is read-only.|
|description|String|Optional description for the device management script.|
|displayName|String|Name of the device management script.|
|executionFrequency|Duration|The interval for script to run. If not defined the script will run once|
|fileName|String|Script file name.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the device management script was last modified. This property is read-only.|
|retryCount|Int32|Number of times for the script to be retried if it fails|
|roleScopeTagIds|String collection|List of Scope Tag IDs for this PowerShellScript instance.|
|runAsAccount|runAsAccountType|Indicates the type of execution context. Possible values are: `system`, `user`.|
|scriptContent|Binary|The script content.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) collection|The list of group assignments for the device management script.|
|deviceRunStates|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) collection|List of run states for this script across all devices.|
|groupAssignments|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) collection|The list of group assignments for the device management script.|
|runSummary|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md)|Run summary for device management script.|
|userRunStates|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) collection|List of run states for this script across all users.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceShellScript",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceShellScript",
  "id": "String (identifier)",
  "blockExecutionNotifications": "Boolean",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "executionFrequency": "String (duration)",
  "fileName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "retryCount": "Integer",
  "roleScopeTagIds": [
    "String"
  ],
  "runAsAccount": "String",
  "scriptContent": "Binary"
}
```

