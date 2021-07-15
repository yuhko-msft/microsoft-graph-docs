---
title: "deviceManagementConfigurationSettingTemplate resource type"
description: "Setting Template"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Setting Template


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationSettingTemplates](../api/devicemanagementconfigurationsettingtemplate-list.md)|[deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) collection|Get a list of the [deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) objects and their properties.|
|[Create deviceManagementConfigurationSettingTemplate](../api/devicemanagementconfigurationsettingtemplate-create.md)|[deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md)|Create a new [deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) object.|
|[Get deviceManagementConfigurationSettingTemplate](../api/devicemanagementconfigurationsettingtemplate-get.md)|[deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md)|Read the properties and relationships of a [deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) object.|
|[Update deviceManagementConfigurationSettingTemplate](../api/devicemanagementconfigurationsettingtemplate-update.md)|[deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md)|Update the properties of a [deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) object.|
|[Delete deviceManagementConfigurationSettingTemplate](../api/devicemanagementconfigurationsettingtemplate-delete.md)|None|Deletes a [deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) object.|
|[List settingDefinitions](../api/devicemanagementconfigurationsettingtemplate-list-settingdefinitions.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) collection|Get the deviceManagementConfigurationSettingDefinition resources from the settingDefinitions navigation property.|
|[Create deviceManagementConfigurationSettingDefinition](../api/devicemanagementconfigurationsettingtemplate-post-settingdefinitions.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|Create a new deviceManagementConfigurationSettingDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|settingInstanceTemplate|[deviceManagementConfigurationSettingInstanceTemplate](../resources/devicemanagementconfigurationsettinginstancetemplate.md)|Setting Instance Template|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settingDefinitions|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) collection|List of related Setting Definitions|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingTemplate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingTemplate",
  "id": "String (identifier)",
  "settingInstanceTemplate": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstanceTemplate"
  }
}
```

