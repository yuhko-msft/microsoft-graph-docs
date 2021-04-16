---
title: "deviceComplianceScriptDeviceState resource type"
description: "Contains properties for device run state of the device compliance script."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceComplianceScriptDeviceState resource type

Namespace: microsoft.graph



Contains properties for device run state of the device compliance script.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceComplianceScriptDeviceStates](../api/devicecompliancescriptdevicestate-list.md)|[deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) collection|Get a list of the [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) objects and their properties.|
|[Create deviceComplianceScriptDeviceState](../api/devicecompliancescriptdevicestate-create.md)|[deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md)|Create a new [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) object.|
|[Get deviceComplianceScriptDeviceState](../api/devicecompliancescriptdevicestate-get.md)|[deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md)|Read the properties and relationships of a [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) object.|
|[Update deviceComplianceScriptDeviceState](../api/devicecompliancescriptdevicestate-update.md)|[deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md)|Update the properties of a [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) object.|
|[Delete deviceComplianceScriptDeviceState](../api/devicecompliancescriptdevicestate-delete.md)|None|Deletes a [deviceComplianceScriptDeviceState](../resources/devicecompliancescriptdevicestate.md) object.|
|[List managedDevice](../api/devicecompliancescriptdevicestate-list-manageddevice.md)|[managedDevice](../resources/manageddevice.md) collection|Get the managedDevice resources from the managedDevice navigation property.|
|[Add managedDevice](../api/devicecompliancescriptdevicestate-post-manageddevice.md)|[managedDevice](../resources/manageddevice.md)|Add managedDevice by posting to the managedDevice collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|detectionState|runState|Detection state from the lastest device compliance script execution. Possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|
|expectedStateUpdateDateTime|DateTimeOffset|The next timestamp of when the device compliance script is expected to execute|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastStateUpdateDateTime|DateTimeOffset|The last timestamp of when the device compliance script executed|
|lastSyncDateTime|DateTimeOffset|The last time that Intune Managment Extension synced with Intune|
|scriptError|String|Error from the detection script|
|scriptOutput|String|Output of the detection script|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managedDevice|[managedDevice](../resources/manageddevice.md)|The managed device on which the device compliance script executed|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceComplianceScriptDeviceState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceComplianceScriptDeviceState",
  "id": "String (identifier)",
  "detectionState": "String",
  "expectedStateUpdateDateTime": "String (timestamp)",
  "lastStateUpdateDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "scriptError": "String",
  "scriptOutput": "String"
}
```

