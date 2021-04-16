---
title: "deviceManagementConfigurationChoiceSettingDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationChoiceSettingDefinition resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationChoiceSettingDefinitions](../api/devicemanagementconfigurationchoicesettingdefinition-list.md)|[deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) collection|Get a list of the [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) objects and their properties.|
|[Create deviceManagementConfigurationChoiceSettingDefinition](../api/devicemanagementconfigurationchoicesettingdefinition-create.md)|[deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md)|Create a new [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) object.|
|[Get deviceManagementConfigurationChoiceSettingDefinition](../api/devicemanagementconfigurationchoicesettingdefinition-get.md)|[deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md)|Read the properties and relationships of a [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) object.|
|[Update deviceManagementConfigurationChoiceSettingDefinition](../api/devicemanagementconfigurationchoicesettingdefinition-update.md)|[deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md)|Update the properties of a [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) object.|
|[Delete deviceManagementConfigurationChoiceSettingDefinition](../api/devicemanagementconfigurationchoicesettingdefinition-delete.md)|None|Deletes a [deviceManagementConfigurationChoiceSettingDefinition](../resources/devicemanagementconfigurationchoicesettingdefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessTypes|deviceManagementConfigurationSettingAccessTypes|Read/write access mode of the setting Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `add`, `copy`, `delete`, `get`, `replace`, `execute`.|
|applicability|[deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md)|Details which device setting is applicable on Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|baseUri|String|Base CSP Path Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|categoryId|String|Specifies the area group under which the setting is configured in a specified configuration service provider (CSP) Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|defaultOptionId|String|Default option for choice setting|
|description|String|Description of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|displayName|String|Display name of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|helpText|String|Help text of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|infoUrls|String collection|List of links more info for the setting can be found at Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|keywords|String collection|Tokens which to search settings on Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|name|String|Name of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|occurrence|[deviceManagementConfigurationSettingOccurrence](../resources/devicemanagementconfigurationsettingoccurrence.md)|Indicates whether the setting is required or not Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|offsetUri|String|Offset CSP Path from Base Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|options|[deviceManagementConfigurationOptionDefinition](../resources/devicemanagementconfigurationoptiondefinition.md) collection|Options for the setting that can be selected|
|rootDefinitionId|String|Root setting definition if the setting is a child setting. Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|settingUsage|deviceManagementConfigurationSettingUsage|Setting type, for example, configuration and compliance Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `configuration`.|
|uxBehavior|deviceManagementConfigurationControlType|Setting control type representation in the UX Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `default`, `dropdown`, `smallTextBox`, `largeTextBox`, `toggle`, `multiheaderGrid`, `contextPane`.|
|version|String|Item Version Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|visibility|deviceManagementConfigurationSettingVisibility|Setting visibility scope to UX Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `settingsCatalog`, `template`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationChoiceSettingDefinition",
  "baseType": "microsoft.graph.deviceManagementConfigurationSettingDefinition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationChoiceSettingDefinition",
  "id": "String (identifier)",
  "accessTypes": "String",
  "applicability": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingApplicability"
  },
  "baseUri": "String",
  "categoryId": "String",
  "description": "String",
  "displayName": "String",
  "helpText": "String",
  "infoUrls": [
    "String"
  ],
  "keywords": [
    "String"
  ],
  "name": "String",
  "occurrence": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingOccurrence"
  },
  "offsetUri": "String",
  "rootDefinitionId": "String",
  "settingUsage": "String",
  "uxBehavior": "String",
  "version": "String",
  "visibility": "String",
  "defaultOptionId": "String",
  "options": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationOptionDefinition"
    }
  ]
}
```

