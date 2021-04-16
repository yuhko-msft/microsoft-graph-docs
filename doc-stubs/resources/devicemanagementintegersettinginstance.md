---
title: "deviceManagementIntegerSettingInstance resource type"
description: "A setting instance representing an integer value"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementIntegerSettingInstance resource type

Namespace: microsoft.graph



A setting instance representing an integer value


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementIntegerSettingInstances](../api/devicemanagementintegersettinginstance-list.md)|[deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) collection|Get a list of the [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) objects and their properties.|
|[Create deviceManagementIntegerSettingInstance](../api/devicemanagementintegersettinginstance-create.md)|[deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md)|Create a new [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) object.|
|[Get deviceManagementIntegerSettingInstance](../api/devicemanagementintegersettinginstance-get.md)|[deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md)|Read the properties and relationships of a [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) object.|
|[Update deviceManagementIntegerSettingInstance](../api/devicemanagementintegersettinginstance-update.md)|[deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md)|Update the properties of a [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) object.|
|[Delete deviceManagementIntegerSettingInstance](../api/devicemanagementintegersettinginstance-delete.md)|None|Deletes a [deviceManagementIntegerSettingInstance](../resources/devicemanagementintegersettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|The ID of the setting definition for this instance Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|Int32|The integer value|
|valueJson|String|JSON representation of the value Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|

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

