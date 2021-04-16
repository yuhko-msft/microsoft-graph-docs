---
title: "deviceManagementIntentSettingCategory resource type"
description: "Entity representing an intent setting category"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementIntentSettingCategory resource type

Namespace: microsoft.graph



Entity representing an intent setting category


Inherits from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementIntentSettingCategories](../api/devicemanagementintentsettingcategory-list.md)|[deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) collection|Get a list of the [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) objects and their properties.|
|[Create deviceManagementIntentSettingCategory](../api/devicemanagementintentsettingcategory-create.md)|[deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md)|Create a new [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) object.|
|[Get deviceManagementIntentSettingCategory](../api/devicemanagementintentsettingcategory-get.md)|[deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md)|Read the properties and relationships of a [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) object.|
|[Update deviceManagementIntentSettingCategory](../api/devicemanagementintentsettingcategory-update.md)|[deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md)|Update the properties of a [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) object.|
|[Delete deviceManagementIntentSettingCategory](../api/devicemanagementintentsettingcategory-delete.md)|None|Deletes a [deviceManagementIntentSettingCategory](../resources/devicemanagementintentsettingcategory.md) object.|
|[List settingDefinitions](../api/devicemanagementintentsettingcategory-list-settingdefinitions.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|Get the deviceManagementSettingDefinition resources from the settingDefinitions navigation property.|
|[Create deviceManagementSettingDefinition](../api/devicemanagementintentsettingcategory-post-settingdefinitions.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|Create a new deviceManagementSettingDefinition object.|
|[List settings](../api/devicemanagementintentsettingcategory-list-settings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|Get the deviceManagementSettingInstance resources from the settings navigation property.|
|[Create deviceManagementSettingInstance](../api/devicemanagementintentsettingcategory-post-settings.md)|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md)|Create a new deviceManagementSettingInstance object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The category name Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|
|hasRequiredSetting|Boolean|The category contains top level required setting Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settingDefinitions|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|The setting definitions this category contains Inherited from [deviceManagementSettingCategory](../resources/devicemanagementsettingcategory.md)|
|settings|[deviceManagementSettingInstance](../resources/devicemanagementsettinginstance.md) collection|The settings this category contains|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementIntentSettingCategory",
  "baseType": "microsoft.graph.deviceManagementSettingCategory",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementIntentSettingCategory",
  "id": "String (identifier)",
  "displayName": "String",
  "hasRequiredSetting": "Boolean"
}
```

