---
title: "deviceManagementComplexSettingInstance resource type"
description: "A setting instance representing a complex value"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementComplexSettingInstance resource type

Namespace: microsoft.graph



A setting instance representing a complex value


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementComplexSettingInstances](../api/devicemanagementcomplexsettinginstance-list.md)|[deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md) collection|Get a list of the [deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md) objects and their properties.|
|[Create deviceManagementComplexSettingInstance](../api/devicemanagementcomplexsettinginstance-create.md)|[deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md)|Create a new [deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md) object.|
|[Get deviceManagementComplexSettingInstance](../api/devicemanagementcomplexsettinginstance-get.md)|[deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md)|Read the properties and relationships of a [deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md) object.|
|[Update deviceManagementComplexSettingInstance](../api/devicemanagementcomplexsettinginstance-update.md)|[deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md)|Update the properties of a [deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md) object.|
|[Delete deviceManagementComplexSettingInstance](../api/devicemanagementcomplexsettinginstance-delete.md)|None|Deletes a [deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md) object.|
|[List value](../api/devicemanagementcomplexsettinginstance-list-value.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the value navigation property.|
|[Add deviceManagementSettingInstance](../api/devicemanagementcomplexsettinginstance-post-value.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Add value by posting to the value collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|The ID of the setting definition for this instance Inherited from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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
  "@odata.type": "microsoft.graph.deviceManagementComplexSettingInstance",
  "baseType": "microsoft.graph.deviceManagementSettingInstance",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementComplexSettingInstance",
  "id": "String (identifier)",
  "definitionId": "String",
  "valueJson": "String"
}
```

