---
title: "deviceHealthScriptDeviceState resource type"
description: "Contains properties for device run state of the device health script."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceHealthScriptDeviceState resource type

Namespace: microsoft.graph



Contains properties for device run state of the device health script.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceHealthScriptDeviceStates](../api/devicehealthscriptdevicestate-list.md)|[deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) collection|Get a list of the [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) objects and their properties.|
|[Create deviceHealthScriptDeviceState](../api/devicehealthscriptdevicestate-create.md)|[deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md)|Create a new [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) object.|
|[Get deviceHealthScriptDeviceState](../api/devicehealthscriptdevicestate-get.md)|[deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md)|Read the properties and relationships of a [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) object.|
|[Update deviceHealthScriptDeviceState](../api/devicehealthscriptdevicestate-update.md)|[deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md)|Update the properties of a [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) object.|
|[Delete deviceHealthScriptDeviceState](../api/devicehealthscriptdevicestate-delete.md)|None|Deletes a [deviceHealthScriptDeviceState](../resources/devicehealthscriptdevicestate.md) object.|
|[List managedDevice](../api/devicehealthscriptdevicestate-list-manageddevice.md)|[managedDevice](../resources/manageddevice.md) collection|Get the managedDevice resources from the managedDevice navigation property.|
|[Add managedDevice](../api/devicehealthscriptdevicestate-post-manageddevice.md)|[managedDevice](../resources/manageddevice.md)|Add managedDevice by posting to the managedDevice collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|detectionState|runState|Detection state from the lastest device health script execution. Possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|
|expectedStateUpdateDateTime|DateTimeOffset|The next timestamp of when the device health script is expected to execute|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastStateUpdateDateTime|DateTimeOffset|The last timestamp of when the device health script executed|
|lastSyncDateTime|DateTimeOffset|The last time that Intune Managment Extension synced with Intune|
|postRemediationDetectionScriptError|String|Error from the detection script after remediation|
|postRemediationDetectionScriptOutput|String|Detection script output after remediation|
|preRemediationDetectionScriptError|String|Error from the detection script before remediation|
|preRemediationDetectionScriptOutput|String|Output of the detection script before remediation|
|remediationScriptError|String|Error output of the remediation script|
|remediationState|remediationState|Remediation state from the lastest device health script execution. Possible values are: `unknown`, `skipped`, `success`, `remediationFailed`, `scriptError`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managedDevice|[managedDevice](../resources/manageddevice.md)|The managed device on which the device health script executed|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceHealthScriptDeviceState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceHealthScriptDeviceState",
  "id": "String (identifier)",
  "detectionState": "String",
  "expectedStateUpdateDateTime": "String (timestamp)",
  "lastStateUpdateDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "postRemediationDetectionScriptError": "String",
  "postRemediationDetectionScriptOutput": "String",
  "preRemediationDetectionScriptError": "String",
  "preRemediationDetectionScriptOutput": "String",
  "remediationScriptError": "String",
  "remediationState": "String"
}
```

