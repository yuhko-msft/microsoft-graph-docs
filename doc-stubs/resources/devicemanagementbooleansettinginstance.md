---
title: "deviceManagementBooleanSettingInstance resource type"
description: "A setting instance representing a boolean value"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementBooleanSettingInstance resource type

Namespace: microsoft.graph



A setting instance representing a boolean value


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementBooleanSettingInstances](../api/devicemanagementbooleansettinginstance-list.md)|[deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md) collection|Get a list of the [deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md) objects and their properties.|
|[Create deviceManagementBooleanSettingInstance](../api/devicemanagementbooleansettinginstance-create.md)|[deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md)|Create a new [deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md) object.|
|[Get deviceManagementBooleanSettingInstance](../api/devicemanagementbooleansettinginstance-get.md)|[deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md)|Read the properties and relationships of a [deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md) object.|
|[Update deviceManagementBooleanSettingInstance](../api/devicemanagementbooleansettinginstance-update.md)|[deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md)|Update the properties of a [deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md) object.|
|[Delete deviceManagementBooleanSettingInstance](../api/devicemanagementbooleansettinginstance-delete.md)|None|Deletes a [deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|The ID of the setting definition for this instance Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|Boolean|The boolean value|
|valueJson|String|JSON representation of the value Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementBooleanSettingInstance",
  "baseType": "microsoft.graph.deviceManagementSettingInstance",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementBooleanSettingInstance",
  "id": "String (identifier)",
  "definitionId": "String",
  "valueJson": "String",
  "value": "Boolean"
}
```

