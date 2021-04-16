---
title: "deviceManagementTemplateSettingCategory resource type"
description: "Entity representing a template setting category"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementTemplateSettingCategory resource type

Namespace: microsoft.graph



Entity representing a template setting category


Inherits from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementTemplateSettingCategories](../api/devicemanagementtemplatesettingcategory-list.md)|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) collection|Get a list of the [deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) objects and their properties.|
|[Create deviceManagementTemplateSettingCategory](../api/devicemanagementtemplatesettingcategory-create.md)|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md)|Create a new [deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) object.|
|[Get deviceManagementTemplateSettingCategory](../api/devicemanagementtemplatesettingcategory-get.md)|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md)|Read the properties and relationships of a [deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) object.|
|[Update deviceManagementTemplateSettingCategory](../api/devicemanagementtemplatesettingcategory-update.md)|[deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md)|Update the properties of a [deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) object.|
|[Delete deviceManagementTemplateSettingCategory](../api/devicemanagementtemplatesettingcategory-delete.md)|None|Deletes a [deviceManagementTemplateSettingCategory](../resources/devicemanagementtemplatesettingcategory.md) object.|
|[List recommendedSettings](../api/devicemanagementtemplatesettingcategory-list-recommendedsettings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the recommendedSettings navigation property.|
|[Create deviceManagementSettingInstance](../api/devicemanagementtemplatesettingcategory-post-recommendedsettings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Create a new deviceManagementSettingInstance object.|
|[List settingDefinitions](../api/devicemanagementtemplatesettingcategory-list-settingdefinitions.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|Get the deviceManagementSettingDefinition resources from the settingDefinitions navigation property.|
|[Create deviceManagementSettingDefinition](../api/devicemanagementtemplatesettingcategory-post-settingdefinitions.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|Create a new deviceManagementSettingDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The category name Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|
|hasRequiredSetting|Boolean|The category contains top level required setting Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|recommendedSettings|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|The settings this category contains|
|settingDefinitions|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|The setting definitions this category contains Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementTemplateSettingCategory",
  "baseType": "microsoft.graph.deviceManagementSettingCategory",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementTemplateSettingCategory",
  "id": "String (identifier)",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
}
```

