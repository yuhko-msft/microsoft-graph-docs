---
title: "deviceManagementScriptDeviceState resource type"
description: "Contains properties for device run state of the device management script."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementScriptDeviceState resource type

Namespace: microsoft.graph



Contains properties for device run state of the device management script.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementScriptDeviceStates](../api/devicemanagementscriptdevicestate-list.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) collection|Get a list of the [deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) objects and their properties.|
|[Create deviceManagementScriptDeviceState](../api/devicemanagementscriptdevicestate-create.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md)|Create a new [deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) object.|
|[Get deviceManagementScriptDeviceState](../api/devicemanagementscriptdevicestate-get.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md)|Read the properties and relationships of a [deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) object.|
|[Update deviceManagementScriptDeviceState](../api/devicemanagementscriptdevicestate-update.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md)|Update the properties of a [deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) object.|
|[Delete deviceManagementScriptDeviceState](../api/devicemanagementscriptdevicestate-delete.md)|None|Deletes a [deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) object.|
|[List managedDevice](../api/devicemanagementscriptdevicestate-list-manageddevice.md)|[managedDevice](../resources/manageddevice.md) collection|Get the managedDevice resources from the managedDevice navigation property.|
|[Add managedDevice](../api/devicemanagementscriptdevicestate-post-manageddevice.md)|[managedDevice](../resources/manageddevice.md)|Add managedDevice by posting to the managedDevice collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|errorCode|Int32|Error code corresponding to erroneous execution of the device management script.|
|errorDescription|String|Error description corresponding to erroneous execution of the device management script.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastStateUpdateDateTime|DateTimeOffset|Latest time the device management script executes.|
|resultMessage|String|Details of execution output.|
|runState|runState|State of latest run of the device management script. Possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managedDevice|[managedDevice](../resources/manageddevice.md)|The managed devices that executes the device management script.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementScriptDeviceState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementScriptDeviceState",
  "id": "String (identifier)",
  "errorCode": "Integer",
  "errorDescription": "String",
  "lastStateUpdateDateTime": "String (timestamp)",
  "resultMessage": "String",
  "runState": "String"
}
```

