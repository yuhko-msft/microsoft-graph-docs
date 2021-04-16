---
title: "deviceComplianceScript resource type"
description: "Intune will provide customer the ability to run their Powershell Compliance scripts (detection) on the enrolled windows 10 Azure Active Directory joined devices."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceScript resource type

Namespace: microsoft.graph



Intune will provide customer the ability to run their Powershell Compliance scripts (detection) on the enrolled windows 10 Azure Active Directory joined devices.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceScripts](../api/devicecompliancescript-list.md)|[deviceComplianceScript](../resources/devicecompliancescript.md) collection|Get a list of the [deviceComplianceScript](../resources/devicecompliancescript.md) objects and their properties.|
|[Create deviceComplianceScript](../api/devicecompliancescript-create.md)|[deviceComplianceScript](../resources/devicecompliancescript.md)|Create a new [deviceComplianceScript](../resources/devicecompliancescript.md) object.|
|[Get deviceComplianceScript](../api/devicecompliancescript-get.md)|[deviceComplianceScript](../resources/devicecompliancescript.md)|Read the properties and relationships of a [deviceComplianceScript](../resources/devicecompliancescript.md) object.|
|[Update deviceComplianceScript](../api/devicecompliancescript-update.md)|[deviceComplianceScript](../resources/devicecompliancescript.md)|Update the properties of a [deviceComplianceScript](../resources/devicecompliancescript.md) object.|
|[Delete deviceComplianceScript](../api/devicecompliancescript-delete.md)|None|Deletes a [deviceComplianceScript](../resources/devicecompliancescript.md) object.|
|[assign](../api/devicecompliancescript-assign.md)|None|**TODO: Add Description**|
|[List assignments](../api/devicecompliancescript-list-assignments.md)|[deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md) collection|Get the deviceHealthScriptAssignment resources from the assignments navigation property.|
|[Create deviceHealthScriptAssignment](../api/devicecompliancescript-post-assignments.md)|[deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md)|Create a new deviceHealthScriptAssignment object.|
|[List deviceRunStates](../api/devicecompliancescript-list-devicerunstates.md)|[deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) collection|Get the deviceComplianceScriptDeviceState resources from the deviceRunStates navigation property.|
|[Create deviceComplianceScriptDeviceState](../api/devicecompliancescript-post-devicerunstates.md)|[deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md)|Create a new deviceComplianceScriptDeviceState object.|
|[List deviceComplianceScriptRunSummary](../api/devicecompliancescript-list-runsummary.md)|[deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md) collection|Get the deviceComplianceScriptRunSummary resources from the runSummary navigation property.|
|[Create deviceComplianceScriptRunSummary](../api/devicecompliancescript-post-runsummary.md)|[deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md)|Create a new deviceComplianceScriptRunSummary object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|The timestamp of when the device compliance script was created. This property is read-only.|
|description|String|Description of the device compliance script|
|detectionScriptContent|Binary|The entire content of the detection powershell script|
|displayName|String|Name of the device compliance script|
|enforceSignatureCheck|Boolean|Indicate whether the script signature needs be checked|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|The timestamp of when the device compliance script was modified. This property is read-only.|
|publisher|String|Name of the device compliance script publisher|
|roleScopeTagIds|String collection|List of Scope Tag IDs for the device compliance script|
|runAs32Bit|Boolean|Indicate whether PowerShell script(s) should run as 32-bit|
|runAsAccount|runAsAccountType|Indicates the type of execution context. Possible values are: `system`, `user`.|
|version|String|Version of the device compliance script|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceHealthScriptAssignment](../resources/devicehealthscriptassignment.md) collection|The list of group assignments for the device compliance script|
|deviceRunStates|[deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) collection|List of run states for the device compliance script across all devices|
|runSummary|[deviceComplianceScriptRunSummary](../resources/devicecompliancescriptrunsummary.md)|High level run summary for device compliance script.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComplianceScript",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceScript",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "detectionScriptContent": "Binary",
  "displayName": "String",
  "enforceSignatureCheck": "Boolean",
  "lastModifiedDateTime": "String (timestamp)",
  "publisher": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "runAs32Bit": "Boolean",
  "runAsAccount": "String",
  "version": "String"
}
```

