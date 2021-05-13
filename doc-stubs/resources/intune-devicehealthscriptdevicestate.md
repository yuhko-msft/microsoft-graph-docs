---
title: "deviceHealthScriptDeviceState resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceHealthScriptDeviceState resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceHealthScriptDeviceStates](../api/intune-devicehealthscriptdevicestate-list.md)|[deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md) collection|Get a list of the [deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md) objects and their properties.|
|[Create deviceHealthScriptDeviceState](../api/intune-devicehealthscriptdevicestate-create.md)|[deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md)|Create a new [deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md) object.|
|[Get deviceHealthScriptDeviceState](../api/intune-devicehealthscriptdevicestate-get.md)|[deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md)|Read the properties and relationships of a [deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md) object.|
|[Update deviceHealthScriptDeviceState](../api/intune-devicehealthscriptdevicestate-update.md)|[deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md)|Update the properties of a [deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md) object.|
|[Delete deviceHealthScriptDeviceState](../api/intune-devicehealthscriptdevicestate-delete.md)|None|Deletes a [deviceHealthScriptDeviceState](../resources/intune-devicehealthscriptdevicestate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|assignmentFilterIds|String collection|**TODO: Add Description**|
|detectionState|runState|**TODO: Add Description**. Possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|
|expectedStateUpdateDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastStateUpdateDateTime|DateTimeOffset|**TODO: Add Description**|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|postRemediationDetectionScriptError|String|**TODO: Add Description**|
|postRemediationDetectionScriptOutput|String|**TODO: Add Description**|
|preRemediationDetectionScriptError|String|**TODO: Add Description**|
|preRemediationDetectionScriptOutput|String|**TODO: Add Description**|
|remediationScriptError|String|**TODO: Add Description**|
|remediationState|remediationState|**TODO: Add Description**. Possible values are: `unknown`, `skipped`, `success`, `remediationFailed`, `scriptError`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managedDevice|[managedDevice](../resources/intune-manageddevice.md)|**TODO: Add Description**|

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
  "lastStateUpdateDateTime": "String (timestamp)",
  "expectedStateUpdateDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "preRemediationDetectionScriptOutput": "String",
  "preRemediationDetectionScriptError": "String",
  "remediationScriptError": "String",
  "postRemediationDetectionScriptOutput": "String",
  "postRemediationDetectionScriptError": "String",
  "remediationState": "String",
  "assignmentFilterIds": [
    "String"
  ]
}
```

