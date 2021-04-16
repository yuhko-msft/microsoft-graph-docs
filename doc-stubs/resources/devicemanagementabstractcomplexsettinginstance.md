---
title: "deviceManagementAbstractComplexSettingInstance resource type"
description: "A setting instance representing a complex value for an abstract setting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementAbstractComplexSettingInstance resource type

Namespace: microsoft.graph



A setting instance representing a complex value for an abstract setting


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementAbstractComplexSettingInstances](../api/devicemanagementabstractcomplexsettinginstance-list.md)|[deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) collection|Get a list of the [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) objects and their properties.|
|[Create deviceManagementAbstractComplexSettingInstance](../api/devicemanagementabstractcomplexsettinginstance-create.md)|[deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md)|Create a new [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) object.|
|[Get deviceManagementAbstractComplexSettingInstance](../api/devicemanagementabstractcomplexsettinginstance-get.md)|[deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md)|Read the properties and relationships of a [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) object.|
|[Update deviceManagementAbstractComplexSettingInstance](../api/devicemanagementabstractcomplexsettinginstance-update.md)|[deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md)|Update the properties of a [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) object.|
|[Delete deviceManagementAbstractComplexSettingInstance](../api/devicemanagementabstractcomplexsettinginstance-delete.md)|None|Deletes a [deviceManagementAbstractComplexSettingInstance](../resources/devicemanagementabstractcomplexsettinginstance.md) object.|
|[List value](../api/devicemanagementabstractcomplexsettinginstance-list-value.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the value navigation property.|
|[Add deviceManagementSettingInstance](../api/devicemanagementabstractcomplexsettinginstance-post-value.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Add value by posting to the value collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|The ID of the setting definition for this instance Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|implementationId|String|The definition ID for the chosen implementation of this complex setting|
|valueJson|String|JSON representation of the value Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|value|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|The values that make up the complex setting|

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

