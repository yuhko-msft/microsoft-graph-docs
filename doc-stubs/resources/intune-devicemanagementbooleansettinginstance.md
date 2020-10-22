---
title: "deviceManagementBooleanSettingInstance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementBooleanSettingInstance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementBooleanSettingInstances](../api/intune-devicemanagementbooleansettinginstance-list.md)|[deviceManagementBooleanSettingInstance](../resources/intune-devicemanagementbooleansettinginstance.md) collection|Get a list of the [deviceManagementBooleanSettingInstance](../resources/devicemanagementbooleansettinginstance.md) objects and their properties.|
|[Create deviceManagementBooleanSettingInstance](../api/intune-devicemanagementbooleansettinginstance-create.md)|[deviceManagementBooleanSettingInstance](../resources/intune-devicemanagementbooleansettinginstance.md)|Create a new [deviceManagementBooleanSettingInstance](../resources/intune-devicemanagementbooleansettinginstance.md) object.|
|[Get deviceManagementBooleanSettingInstance](../api/intune-devicemanagementbooleansettinginstance-get.md)|[deviceManagementBooleanSettingInstance](../resources/intune-devicemanagementbooleansettinginstance.md)|Read the properties and relationships of a [deviceManagementBooleanSettingInstance](../resources/intune-devicemanagementbooleansettinginstance.md) object.|
|[Update deviceManagementBooleanSettingInstance](../api/intune-devicemanagementbooleansettinginstance-update.md)|[deviceManagementBooleanSettingInstance](../resources/intune-devicemanagementbooleansettinginstance.md)|Update the properties of a [deviceManagementBooleanSettingInstance](../resources/intune-devicemanagementbooleansettinginstance.md) object.|
|[Delete deviceManagementBooleanSettingInstance](../api/intune-devicemanagementbooleansettinginstance-delete.md)|None|Deletes a [deviceManagementBooleanSettingInstance](../resources/intune-devicemanagementbooleansettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|value|Boolean|**TODO: Add Description**|
|valueJson|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|

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

