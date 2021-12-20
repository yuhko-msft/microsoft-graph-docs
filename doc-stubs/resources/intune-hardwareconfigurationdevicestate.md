---
title: "hardwareConfigurationDeviceState resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# hardwareConfigurationDeviceState resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List hardwareConfigurationDeviceStates](../api/intune-hardwareconfigurationdevicestate-list.md)|[hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) collection|Get a list of the [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) objects and their properties.|
|[Create hardwareConfigurationDeviceState](../api/hardwareconfiguration-post-devicerunstates.md)|[hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md)|Create a new [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) object.|
|[Get hardwareConfigurationDeviceState](../api/intune-hardwareconfigurationdevicestate-get.md)|[hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md)|Read the properties and relationships of a [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) object.|
|[Update hardwareConfigurationDeviceState](../api/intune-hardwareconfigurationdevicestate-update.md)|[hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md)|Update the properties of a [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) object.|
|[Delete hardwareConfigurationDeviceState](../api/intune-hardwareconfigurationdevicestate-delete.md)|None|Deletes a [hardwareConfigurationDeviceState](../resources/intune-hardwareconfigurationdevicestate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|configurationError|String|**TODO: Add Description**|
|configurationOutput|String|**TODO: Add Description**|
|configurationState|runState|**TODO: Add Description**. The possible values are: `unknown`, `success`, `fail`, `scriptError`, `pending`, `notApplicable`.|
|deviceName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|internalVersion|Int32|**TODO: Add Description**|
|lastStateUpdateDateTime|DateTimeOffset|**TODO: Add Description**|
|osVersion|String|**TODO: Add Description**|
|upn|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.hardwareConfigurationDeviceState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.hardwareConfigurationDeviceState",
  "id": "String (identifier)",
  "deviceName": "String",
  "osVersion": "String",
  "upn": "String",
  "internalVersion": "Integer",
  "lastStateUpdateDateTime": "String (timestamp)",
  "configurationState": "String",
  "configurationOutput": "String",
  "configurationError": "String"
}
```

