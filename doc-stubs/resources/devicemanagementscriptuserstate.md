---
title: "deviceManagementScriptUserState resource type"
description: "Contains properties for user run state of the device management script."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementScriptUserState resource type

Namespace: microsoft.graph



Contains properties for user run state of the device management script.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementScriptUserStates](../api/devicemanagementscriptuserstate-list.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) collection|Get a list of the [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) objects and their properties.|
|[Create deviceManagementScriptUserState](../api/devicemanagementscriptuserstate-create.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md)|Create a new [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) object.|
|[Get deviceManagementScriptUserState](../api/devicemanagementscriptuserstate-get.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md)|Read the properties and relationships of a [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) object.|
|[Update deviceManagementScriptUserState](../api/devicemanagementscriptuserstate-update.md)|[deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md)|Update the properties of a [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) object.|
|[Delete deviceManagementScriptUserState](../api/devicemanagementscriptuserstate-delete.md)|None|Deletes a [deviceManagementScriptUserState](../resources/devicemanagementscriptuserstate.md) object.|
|[List deviceRunStates](../api/devicemanagementscriptuserstate-list-devicerunstates.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) collection|Get the deviceManagementScriptDeviceState resources from the deviceRunStates navigation property.|
|[Create deviceManagementScriptDeviceState](../api/devicemanagementscriptuserstate-post-devicerunstates.md)|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md)|Create a new deviceManagementScriptDeviceState object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|errorDeviceCount|Int32|Error device count for specific user.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|successDeviceCount|Int32|Success device count for specific user.|
|userPrincipalName|String|User principle name of specific user.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|deviceRunStates|[deviceManagementScriptDeviceState](../resources/devicemanagementscriptdevicestate.md) collection|List of run states for this script across all devices of specific user.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementScriptUserState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementScriptUserState",
  "id": "String (identifier)",
  "errorDeviceCount": "Integer",
  "successDeviceCount": "Integer",
  "userPrincipalName": "String"
}
```

