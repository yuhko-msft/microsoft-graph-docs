---
title: "deviceManagementConfigurationSetting resource type"
description: "Setting instance within policy"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSetting resource type

Namespace: microsoft.graph



Setting instance within policy


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationSettings](../api/devicemanagementconfigurationsetting-list.md)|[deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) collection|Get a list of the [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) objects and their properties.|
|[Create deviceManagementConfigurationSetting](../api/devicemanagementconfigurationsetting-create.md)|[deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md)|Create a new [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) object.|
|[Get deviceManagementConfigurationSetting](../api/devicemanagementconfigurationsetting-get.md)|[deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md)|Read the properties and relationships of a [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) object.|
|[Update deviceManagementConfigurationSetting](../api/devicemanagementconfigurationsetting-update.md)|[deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md)|Update the properties of a [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) object.|
|[Delete deviceManagementConfigurationSetting](../api/devicemanagementconfigurationsetting-delete.md)|None|Deletes a [deviceManagementConfigurationSetting](../resources/devicemanagementconfigurationsetting.md) object.|
|[List settingDefinitions](../api/devicemanagementconfigurationsetting-list-settingdefinitions.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) collection|Get the deviceManagementConfigurationSettingDefinition resources from the settingDefinitions navigation property.|
|[Add deviceManagementConfigurationSettingDefinition](../api/devicemanagementconfigurationsetting-post-settingdefinitions.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|Add settingDefinitions by posting to the settingDefinitions collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|settingInstance|[deviceManagementConfigurationSettingInstance](../resources/devicemanagementconfigurationsettinginstance.md)|Setting Instance|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|settingDefinitions|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) collection|List of related Setting Definitions|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSetting",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSetting",
  "id": "String (identifier)",
  "settingInstance": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingInstance"
  }
}
```

