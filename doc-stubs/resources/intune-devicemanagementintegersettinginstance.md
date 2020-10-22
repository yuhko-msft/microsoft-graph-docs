---
title: "deviceManagementIntegerSettingInstance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementIntegerSettingInstance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementIntegerSettingInstances](../api/intune-devicemanagementintegersettinginstance-list.md)|[deviceManagementIntegerSettingInstance](../resources/intune-devicemanagementintegersettinginstance.md) collection|Get a list of the [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) objects and their properties.|
|[Create deviceManagementIntegerSettingInstance](../api/intune-devicemanagementintegersettinginstance-create.md)|[deviceManagementIntegerSettingInstance](../resources/intune-devicemanagementintegersettinginstance.md)|Create a new [deviceManagementIntegerSettingInstance](../resources/intune-devicemanagementintegersettinginstance.md) object.|
|[Get deviceManagementIntegerSettingInstance](../api/intune-devicemanagementintegersettinginstance-get.md)|[deviceManagementIntegerSettingInstance](../resources/intune-devicemanagementintegersettinginstance.md)|Read the properties and relationships of a [deviceManagementIntegerSettingInstance](../resources/intune-devicemanagementintegersettinginstance.md) object.|
|[Update deviceManagementIntegerSettingInstance](../api/intune-devicemanagementintegersettinginstance-update.md)|[deviceManagementIntegerSettingInstance](../resources/intune-devicemanagementintegersettinginstance.md)|Update the properties of a [deviceManagementIntegerSettingInstance](../resources/intune-devicemanagementintegersettinginstance.md) object.|
|[Delete deviceManagementIntegerSettingInstance](../api/intune-devicemanagementintegersettinginstance-delete.md)|None|Deletes a [deviceManagementIntegerSettingInstance](../resources/intune-devicemanagementintegersettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|Int32|**TODO: Add Description**|
|valueJson|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementIntegerSettingInstance",
  "baseType": "microsoft.graph.deviceManagementSettingInstance",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementIntegerSettingInstance",
  "id": "String (identifier)",
  "definitionId": "String",
  "valueJson": "String",
  "value": "Integer"
}
```

