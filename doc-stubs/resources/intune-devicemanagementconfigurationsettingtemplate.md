---
title: "deviceManagementConfigurationSettingTemplate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingTemplate resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationSettingTemplates](../api/intune-devicemanagementconfigurationsettingtemplate-list.md)|[deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) collection|Get a list of the [deviceManagementConfigurationSettingTemplate](../resources/devicemanagementconfigurationsettingtemplate.md) objects and their properties.|
|[Create deviceManagementConfigurationSettingTemplate](../api/intune-devicemanagementconfigurationsettingtemplate-create.md)|[deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md)|Create a new [deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) object.|
|[Get deviceManagementConfigurationSettingTemplate](../api/intune-devicemanagementconfigurationsettingtemplate-get.md)|[deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md)|Read the properties and relationships of a [deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) object.|
|[Update deviceManagementConfigurationSettingTemplate](../api/intune-devicemanagementconfigurationsettingtemplate-update.md)|[deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md)|Update the properties of a [deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) object.|
|[Delete deviceManagementConfigurationSettingTemplate](../api/intune-devicemanagementconfigurationsettingtemplate-delete.md)|None|Deletes a [deviceManagementConfigurationSettingTemplate](../resources/intune-devicemanagementconfigurationsettingtemplate.md) object.|
|[List settingDefinitions](../api/intune-devicemanagementconfigurationsettingtemplate-list-settingdefinitions.md)|[deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) collection|Get the deviceManagementConfigurationSettingDefinition resources from the settingDefinitions navigation property.|
|[Create deviceManagementConfigurationSettingDefinition](../api/intune-devicemanagementconfigurationsettingtemplate-post-settingdefinitions.md)|[deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md)|Create a new deviceManagementConfigurationSettingDefinition object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|settingInstanceTemplate|[deviceManagementConfigurationSettingInstanceTemplate](../resources/intune-devicemanagementconfigurationsettinginstancetemplate.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settingDefinitions|[deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) collection|**TODO: Add Description**|

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

