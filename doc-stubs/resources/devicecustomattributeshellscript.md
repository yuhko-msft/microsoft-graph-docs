---
title: "deviceCustomAttributeShellScript resource type"
description: "Represents a custom attribute script for macOS."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceCustomAttributeShellScript resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Represents a custom attribute script for macOS.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceCustomAttributeShellScripts](../api/devicecustomattributeshellscript-list.md)|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) collection|Get a list of the [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) objects and their properties.|
|[Create deviceCustomAttributeShellScript](../api/devicecustomattributeshellscript-create.md)|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md)|Create a new [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) object.|
|[Get deviceCustomAttributeShellScript](../api/devicecustomattributeshellscript-get.md)|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md)|Read the properties and relationships of a [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) object.|
|[Update deviceCustomAttributeShellScript](../api/devicecustomattributeshellscript-update.md)|[deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md)|Update the properties of a [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) object.|
|[Delete deviceCustomAttributeShellScript](../api/devicecustomattributeshellscript-delete.md)|None|Deletes a [deviceCustomAttributeShellScript](../resources/devicecustomattributeshellscript.md) object.|
|[assign](../api/devicecustomattributeshellscript-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/devicecustomattributeshellscript-list-assignments.md)|[deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) collection|Get the deviceManagementScriptAssignment resources from the assignments navigation property.|
|[Create deviceManagementScriptAssignment](../api/devicecustomattributeshellscript-post-assignments.md)|[deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md)|Create a new deviceManagementScriptAssignment object.|
|[List deviceRunStates](../api/devicecustomattributeshellscript-list-devicerunstates.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) collection|Get the deviceManagementScriptDeviceState resources from the deviceRunStates navigation property.|
|[Create deviceManagementScriptDeviceState](../api/devicecustomattributeshellscript-post-devicerunstates.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md)|Create a new deviceManagementScriptDeviceState object.|
|[List groupAssignments](../api/devicecustomattributeshellscript-list-groupassignments.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) collection|Get the deviceManagementScriptGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceManagementScriptGroupAssignment](../api/devicecustomattributeshellscript-post-groupassignments.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md)|Create a new deviceManagementScriptGroupAssignment object.|
|[List deviceManagementScriptRunSummary](../api/devicecustomattributeshellscript-list-runsummary.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) collection|Get the deviceManagementScriptRunSummary resources from the runSummary navigation property.|
|[Add deviceManagementScriptRunSummary](../api/devicecustomattributeshellscript-post-runsummary.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md)|Add runSummary by posting to the runSummary collection.|
|[List userRunStates](../api/devicecustomattributeshellscript-list-userrunstates.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) collection|Get the deviceManagementScriptUserState resources from the userRunStates navigation property.|
|[Create deviceManagementScriptUserState](../api/devicecustomattributeshellscript-post-userrunstates.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md)|Create a new deviceManagementScriptUserState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the device management script was created. This property is read-only.|
|customAttributeName|String|The name of the custom attribute.|
|customAttributeType|deviceCustomAttributeValueType|The expected type of the custom attribute's value. Possible values are: `integer`, `string`, `dateTime`.|
|description|String|Optional description for the device management script.|
|displayName|String|Name of the device management script.|
|fileName|String|Script file name.|
|id|String|Unique Identifier for the custom attribute entity.|
|lastModifiedDateTime|DateTimeOffset|The date and time the device management script was last modified. This property is read-only.|
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
  "@odata.type": "microsoft.graph.deviceCustomAttributeShellScript",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceCustomAttributeShellScript",
  "id": "String (identifier)",
  "customAttributeName": "String",
  "customAttributeType": "String",
  "displayName": "String",
  "description": "String",
  "scriptContent": "Binary",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "runAsAccount": "String",
  "fileName": "String",
  "roleScopeTagIds": [
    "String"
  ]
}
```

