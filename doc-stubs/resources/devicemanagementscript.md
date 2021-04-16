---
title: "deviceManagementScript resource type"
description: "Intune will provide customer the ability to run their Powershell scripts on the enrolled windows 10 Azure Active Directory joined devices. The script can be run once or periodically."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementScript resource type

Namespace: microsoft.graph



Intune will provide customer the ability to run their Powershell scripts on the enrolled windows 10 Azure Active Directory joined devices. The script can be run once or periodically.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementScripts](../api/devicemanagementscript-list.md)|[deviceManagementScript](../resources/devicemanagementscript.md) collection|Get a list of the [deviceManagementScript](../resources/devicemanagementscript.md) objects and their properties.|
|[Create deviceManagementScript](../api/devicemanagementscript-create.md)|[deviceManagementScript](../resources/devicemanagementscript.md)|Create a new [deviceManagementScript](../resources/devicemanagementscript.md) object.|
|[Get deviceManagementScript](../api/devicemanagementscript-get.md)|[deviceManagementScript](../resources/devicemanagementscript.md)|Read the properties and relationships of a [deviceManagementScript](../resources/devicemanagementscript.md) object.|
|[Update deviceManagementScript](../api/devicemanagementscript-update.md)|[deviceManagementScript](../resources/devicemanagementscript.md)|Update the properties of a [deviceManagementScript](../resources/devicemanagementscript.md) object.|
|[Delete deviceManagementScript](../api/devicemanagementscript-delete.md)|None|Deletes a [deviceManagementScript](../resources/devicemanagementscript.md) object.|
|[assign](../api/devicemanagementscript-assign.md)|None|**TODO: Add Description**|
|[hasPayloadLinks](../api/devicemanagementscript-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/haspayloadlinkresultitem.md) collection|**TODO: Add Description**|
|[List assignments](../api/devicemanagementscript-list-assignments.md)|[deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md) collection|Get the deviceManagementScriptAssignment resources from the assignments navigation property.|
|[Create deviceManagementScriptAssignment](../api/devicemanagementscript-post-assignments.md)|[deviceManagementScriptAssignment](../resources/devicemanagementscriptassignment.md)|Create a new deviceManagementScriptAssignment object.|
|[List deviceRunStates](../api/devicemanagementscript-list-devicerunstates.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) collection|Get the deviceManagementScriptDeviceState resources from the deviceRunStates navigation property.|
|[Create deviceManagementScriptDeviceState](../api/devicemanagementscript-post-devicerunstates.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md)|Create a new deviceManagementScriptDeviceState object.|
|[List groupAssignments](../api/devicemanagementscript-list-groupassignments.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md) collection|Get the deviceManagementScriptGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceManagementScriptGroupAssignment](../api/devicemanagementscript-post-groupassignments.md)|[deviceManagementScriptGroupAssignment](../resources/devicemanagementscriptgroupassignment.md)|Create a new deviceManagementScriptGroupAssignment object.|
|[List deviceManagementScriptRunSummary](../api/devicemanagementscript-list-runsummary.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md) collection|Get the deviceManagementScriptRunSummary resources from the runSummary navigation property.|
|[Add deviceManagementScriptRunSummary](../api/devicemanagementscript-post-runsummary.md)|[deviceManagementScriptRunSummary](../resources/devicemanagementscriptrunsummary.md)|Add runSummary by posting to the runSummary collection.|
|[List userRunStates](../api/devicemanagementscript-list-userrunstates.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) collection|Get the deviceManagementScriptUserState resources from the userRunStates navigation property.|
|[Create deviceManagementScriptUserState](../api/devicemanagementscript-post-userrunstates.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md)|Create a new deviceManagementScriptUserState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The date and time the device management script was created. This property is read-only.|
|description|String|Optional description for the device management script.|
|displayName|String|Name of the device management script.|
|enforceSignatureCheck|Boolean|Indicate whether the script signature needs be checked.|
|fileName|String|Script file name.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the device management script was last modified. This property is read-only.|
|roleScopeTagIds|String collection|List of Scope Tag IDs for this PowerShellScript instance.|
|runAs32Bit|Boolean|A value indicating whether the PowerShell script should run as 32-bit|
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
  "@odata.type": "microsoft.graph.deviceManagementScript",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementScript",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "enforceSignatureCheck": "Boolean",
  "fileName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "runAs32Bit": "Boolean",
  "runAsAccount": "String",
  "scriptContent": "Binary"
}
```

