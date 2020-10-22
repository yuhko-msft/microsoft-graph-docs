---
title: "deviceManagementComplexSettingInstance resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementComplexSettingInstance resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementComplexSettingInstances](../api/intune-devicemanagementcomplexsettinginstance-list.md)|[deviceManagementComplexSettingInstance](../resources/intune-devicemanagementcomplexsettinginstance.md) collection|Get a list of the [deviceManagementComplexSettingInstance](../resources/devicemanagementcomplexsettinginstance.md) objects and their properties.|
|[Create deviceManagementComplexSettingInstance](../api/intune-devicemanagementcomplexsettinginstance-create.md)|[deviceManagementComplexSettingInstance](../resources/intune-devicemanagementcomplexsettinginstance.md)|Create a new [deviceManagementComplexSettingInstance](../resources/intune-devicemanagementcomplexsettinginstance.md) object.|
|[Get deviceManagementComplexSettingInstance](../api/intune-devicemanagementcomplexsettinginstance-get.md)|[deviceManagementComplexSettingInstance](../resources/intune-devicemanagementcomplexsettinginstance.md)|Read the properties and relationships of a [deviceManagementComplexSettingInstance](../resources/intune-devicemanagementcomplexsettinginstance.md) object.|
|[Update deviceManagementComplexSettingInstance](../api/intune-devicemanagementcomplexsettinginstance-update.md)|[deviceManagementComplexSettingInstance](../resources/intune-devicemanagementcomplexsettinginstance.md)|Update the properties of a [deviceManagementComplexSettingInstance](../resources/intune-devicemanagementcomplexsettinginstance.md) object.|
|[Delete deviceManagementComplexSettingInstance](../api/intune-devicemanagementcomplexsettinginstance-delete.md)|None|Deletes a [deviceManagementComplexSettingInstance](../resources/intune-devicemanagementcomplexsettinginstance.md) object.|
|[List value](../api/intune-devicemanagementcomplexsettinginstance-list-value.md)|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the value navigation property.|
|[Add value](../api/intune-devicemanagementcomplexsettinginstance-post-value.md)|[deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|Add value by posting to the value collection.|
|[Remove value](../api/intune-devicemanagementcomplexsettinginstance-delete-value.md)|None|Remove a [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|**TODO: Add Description** Inherited from [deviceManagementSettingInstance](../resources/intune-devicemanagementsettinginstance.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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

