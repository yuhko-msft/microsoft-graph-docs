---
title: "deviceManagementConfigurationSettingDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingDefinition resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationSettingDefinitions](../api/devicemanagementconfigurationsettingdefinition-list.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) collection|Get a list of the [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) objects and their properties.|
|[Create deviceManagementConfigurationSettingDefinition](../api/devicemanagementconfigurationsettingdefinition-create.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|Create a new [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) object.|
|[Get deviceManagementConfigurationSettingDefinition](../api/devicemanagementconfigurationsettingdefinition-get.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|Read the properties and relationships of a [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) object.|
|[Update deviceManagementConfigurationSettingDefinition](../api/devicemanagementconfigurationsettingdefinition-update.md)|[deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|Update the properties of a [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) object.|
|[Delete deviceManagementConfigurationSettingDefinition](../api/devicemanagementconfigurationsettingdefinition-delete.md)|None|Deletes a [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessTypes|deviceManagementConfigurationSettingAccessTypes|Read/write access mode of the setting. Possible values are: `none`, `add`, `copy`, `delete`, `get`, `replace`, `execute`.|
|applicability|[deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md)|Details which device setting is applicable on|
|baseUri|String|Base CSP Path|
|categoryId|String|Specifies the area group under which the setting is configured in a specified configuration service provider (CSP)|
|description|String|Description of the item|
|displayName|String|Display name of the item|
|helpText|String|Help text of the item|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|infoUrls|String collection|List of links more info for the setting can be found at|
|keywords|String collection|Tokens which to search settings on|
|name|String|Name of the item|
|occurrence|[deviceManagementConfigurationSettingOccurrence](../resources/devicemanagementconfigurationsettingoccurrence.md)|Indicates whether the setting is required or not|
|offsetUri|String|Offset CSP Path from Base|
|rootDefinitionId|String|Root setting definition if the setting is a child setting.|
|settingUsage|deviceManagementConfigurationSettingUsage|Setting type, for example, configuration and compliance. Possible values are: `none`, `configuration`.|
|uxBehavior|deviceManagementConfigurationControlType|Setting control type representation in the UX. Possible values are: `default`, `dropdown`, `smallTextBox`, `largeTextBox`, `toggle`, `multiheaderGrid`, `contextPane`.|
|version|String|Item Version|
|visibility|deviceManagementConfigurationSettingVisibility|Setting visibility scope to UX. Possible values are: `none`, `settingsCatalog`, `template`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingDefinition",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingDefinition",
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
  "visibility": "String"
}
```

