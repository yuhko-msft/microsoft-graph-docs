---
title: "deviceManagementStringSettingInstance resource type"
description: "A setting instance representing a string value"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementStringSettingInstance resource type

Namespace: microsoft.graph



A setting instance representing a string value


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementStringSettingInstances](../api/devicemanagementstringsettinginstance-list.md)|[deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md) collection|Get a list of the [deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md) objects and their properties.|
|[Create deviceManagementStringSettingInstance](../api/devicemanagementstringsettinginstance-create.md)|[deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md)|Create a new [deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md) object.|
|[Get deviceManagementStringSettingInstance](../api/devicemanagementstringsettinginstance-get.md)|[deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md)|Read the properties and relationships of a [deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md) object.|
|[Update deviceManagementStringSettingInstance](../api/devicemanagementstringsettinginstance-update.md)|[deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md)|Update the properties of a [deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md) object.|
|[Delete deviceManagementStringSettingInstance](../api/devicemanagementstringsettinginstance-delete.md)|None|Deletes a [deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|The ID of the setting definition for this instance Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|String|The string value|
|valueJson|String|JSON representation of the value Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementStringSettingInstance",
  "baseType": "microsoft.graph.deviceManagementSettingInstance",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementStringSettingInstance",
  "id": "String (identifier)",
  "definitionId": "String",
  "valueJson": "String",
  "value": "String"
}
```

