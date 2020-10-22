---
title: "deviceManagementStringSettingInstance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementStringSettingInstance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementStringSettingInstances](../api/intune-devicemanagementstringsettinginstance-list.md)|[deviceManagementStringSettingInstance](../resources/intune-devicemanagementstringsettinginstance.md) collection|Get a list of the [deviceManagementStringSettingInstance](../resources/devicemanagementstringsettinginstance.md) objects and their properties.|
|[Create deviceManagementStringSettingInstance](../api/intune-devicemanagementstringsettinginstance-create.md)|[deviceManagementStringSettingInstance](../resources/intune-devicemanagementstringsettinginstance.md)|Create a new [deviceManagementStringSettingInstance](../resources/intune-devicemanagementstringsettinginstance.md) object.|
|[Get deviceManagementStringSettingInstance](../api/intune-devicemanagementstringsettinginstance-get.md)|[deviceManagementStringSettingInstance](../resources/intune-devicemanagementstringsettinginstance.md)|Read the properties and relationships of a [deviceManagementStringSettingInstance](../resources/intune-devicemanagementstringsettinginstance.md) object.|
|[Update deviceManagementStringSettingInstance](../api/intune-devicemanagementstringsettinginstance-update.md)|[deviceManagementStringSettingInstance](../resources/intune-devicemanagementstringsettinginstance.md)|Update the properties of a [deviceManagementStringSettingInstance](../resources/intune-devicemanagementstringsettinginstance.md) object.|
|[Delete deviceManagementStringSettingInstance](../api/intune-devicemanagementstringsettinginstance-delete.md)|None|Deletes a [deviceManagementStringSettingInstance](../resources/intune-devicemanagementstringsettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|String|**TODO: Add Description**|
|valueJson|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|

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

