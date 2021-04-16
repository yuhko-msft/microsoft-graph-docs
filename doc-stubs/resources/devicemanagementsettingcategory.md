---
title: "deviceManagementSettingCategory resource type"
description: "Entity representing a setting category"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingCategory resource type

Namespace: microsoft.graph



Entity representing a setting category


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementSettingCategories](../api/devicemanagementsettingcategory-list.md)|[deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) collection|Get a list of the [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) objects and their properties.|
|[Create deviceManagementSettingCategory](../api/devicemanagementsettingcategory-create.md)|[deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|Create a new [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) object.|
|[Get deviceManagementSettingCategory](../api/devicemanagementsettingcategory-get.md)|[deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|Read the properties and relationships of a [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) object.|
|[Update deviceManagementSettingCategory](../api/devicemanagementsettingcategory-update.md)|[deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|Update the properties of a [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) object.|
|[Delete deviceManagementSettingCategory](../api/devicemanagementsettingcategory-delete.md)|None|Deletes a [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md) object.|
|[List settingDefinitions](../api/devicemanagementsettingcategory-list-settingdefinitions.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|Get the deviceManagementSettingDefinition resources from the settingDefinitions navigation property.|
|[Create deviceManagementSettingDefinition](../api/devicemanagementsettingcategory-post-settingdefinitions.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|Create a new deviceManagementSettingDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The category name|
|hasRequiredSetting|Boolean|The category contains top level required setting|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settingDefinitions|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|The setting definitions this category contains|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementSettingCategory",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingCategory",
  "id": "String (identifier)",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
}
```

