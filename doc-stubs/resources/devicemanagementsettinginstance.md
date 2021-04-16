---
title: "deviceManagementSettingInstance resource type"
description: "Base type for a setting instance"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingInstance resource type

Namespace: microsoft.graph



Base type for a setting instance


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementSettingInstances](../api/devicemanagementsettinginstance-list.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Get a list of the [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) objects and their properties.|
|[Create deviceManagementSettingInstance](../api/devicemanagementsettinginstance-create.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Create a new [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) object.|
|[Get deviceManagementSettingInstance](../api/devicemanagementsettinginstance-get.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Read the properties and relationships of a [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) object.|
|[Update deviceManagementSettingInstance](../api/devicemanagementsettinginstance-update.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Update the properties of a [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) object.|
|[Delete deviceManagementSettingInstance](../api/devicemanagementsettinginstance-delete.md)|None|Deletes a [deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|definitionId|String|The ID of the setting definition for this instance|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|valueJson|String|JSON representation of the value|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementSettingInstance",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingInstance",
  "id": "String (identifier)",
  "definitionId": "String",
  "valueJson": "String"
}
```

