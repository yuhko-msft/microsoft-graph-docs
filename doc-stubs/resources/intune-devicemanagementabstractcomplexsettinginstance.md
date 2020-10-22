---
title: "deviceManagementAbstractComplexSettingInstance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementAbstractComplexSettingInstance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementAbstractComplexSettingInstances](../api/intune-devicemanagementabstractcomplexsettinginstance-list.md)|[deviceManagementAbstractComplexSettingInstance](../resources/intune-devicemanagementabstractcomplexsettinginstance.md) collection|Get a list of the [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) objects and their properties.|
|[Create deviceManagementAbstractComplexSettingInstance](../api/intune-devicemanagementabstractcomplexsettinginstance-create.md)|[deviceManagementAbstractComplexSettingInstance](../resources/intune-devicemanagementabstractcomplexsettinginstance.md)|Create a new [deviceManagementAbstractComplexSettingInstance](../resources/intune-devicemanagementabstractcomplexsettinginstance.md) object.|
|[Get deviceManagementAbstractComplexSettingInstance](../api/intune-devicemanagementabstractcomplexsettinginstance-get.md)|[deviceManagementAbstractComplexSettingInstance](../resources/intune-devicemanagementabstractcomplexsettinginstance.md)|Read the properties and relationships of a [deviceManagementAbstractComplexSettingInstance](../resources/intune-devicemanagementabstractcomplexsettinginstance.md) object.|
|[Update deviceManagementAbstractComplexSettingInstance](../api/intune-devicemanagementabstractcomplexsettinginstance-update.md)|[deviceManagementAbstractComplexSettingInstance](../resources/intune-devicemanagementabstractcomplexsettinginstance.md)|Update the properties of a [deviceManagementAbstractComplexSettingInstance](../resources/intune-devicemanagementabstractcomplexsettinginstance.md) object.|
|[Delete deviceManagementAbstractComplexSettingInstance](../api/intune-devicemanagementabstractcomplexsettinginstance-delete.md)|None|Deletes a [deviceManagementAbstractComplexSettingInstance](../resources/intune-devicemanagementabstractcomplexsettinginstance.md) object.|
|[List value](../api/intune-devicemanagementabstractcomplexsettinginstance-list-value.md)|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the value navigation property.|
|[Add value](../api/intune-devicemanagementabstractcomplexsettinginstance-post-value.md)|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|Add value by posting to the value collection.|
|[Remove value](../api/intune-devicemanagementabstractcomplexsettinginstance-delete-value.md)|None|Remove a [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|implementationId|String|**TODO: Add Description**|
|valueJson|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|value|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementAbstractComplexSettingInstance",
  "baseType": "microsoft.graph.deviceManagementSettingInstance",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementAbstractComplexSettingInstance",
  "id": "String (identifier)",
  "definitionId": "String",
  "valueJson": "String",
  "implementationId": "String"
}
```

