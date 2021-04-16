---
title: "deviceManagementConfigurationSimpleSettingCollectionDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSimpleSettingCollectionDefinition resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [deviceManagementConfigurationSimpleSettingDefinition](../resources/devicemanagementconfigurationsimplesettingdefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationSimpleSettingCollectionDefinitions](../api/devicemanagementconfigurationsimplesettingcollectiondefinition-list.md)|[deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md) collection|Get a list of the [deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md) objects and their properties.|
|[Create deviceManagementConfigurationSimpleSettingCollectionDefinition](../api/devicemanagementconfigurationsimplesettingcollectiondefinition-create.md)|[deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md)|Create a new [deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md) object.|
|[Get deviceManagementConfigurationSimpleSettingCollectionDefinition](../api/devicemanagementconfigurationsimplesettingcollectiondefinition-get.md)|[deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md)|Read the properties and relationships of a [deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md) object.|
|[Update deviceManagementConfigurationSimpleSettingCollectionDefinition](../api/devicemanagementconfigurationsimplesettingcollectiondefinition-update.md)|[deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md)|Update the properties of a [deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md) object.|
|[Delete deviceManagementConfigurationSimpleSettingCollectionDefinition](../api/devicemanagementconfigurationsimplesettingcollectiondefinition-delete.md)|None|Deletes a [deviceManagementConfigurationSimpleSettingCollectionDefinition](../resources/devicemanagementconfigurationsimplesettingcollectiondefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessTypes|deviceManagementConfigurationSettingAccessTypes|Read/write access mode of the setting Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `add`, `copy`, `delete`, `get`, `replace`, `execute`.|
|applicability|[deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md)|Details which device setting is applicable on Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|baseUri|String|Base CSP Path Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|categoryId|String|Specifies the area group under which the setting is configured in a specified configuration service provider (CSP) Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|defaultValue|[deviceManagementConfigurationSettingValue](../resources/devicemanagementconfigurationsettingvalue.md)|Default setting value for this setting Inherited from [deviceManagementConfigurationSimpleSettingDefinition](../resources/devicemanagementconfigurationsimplesettingdefinition.md)|
|dependedOnBy|[deviceManagementConfigurationSettingDependedOnBy](../resources/devicemanagementconfigurationsettingdependedonby.md) collection|list of child settings that depend on this setting Inherited from [deviceManagementConfigurationSimpleSettingDefinition](../resources/devicemanagementconfigurationsimplesettingdefinition.md)|
|dependentOn|[deviceManagementConfigurationDependentOn](../resources/devicemanagementconfigurationdependenton.md) collection|list of parent settings this setting is dependent on Inherited from [deviceManagementConfigurationSimpleSettingDefinition](../resources/devicemanagementconfigurationsimplesettingdefinition.md)|
|description|String|Description of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|displayName|String|Display name of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|helpText|String|Help text of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|infoUrls|String collection|List of links more info for the setting can be found at Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|keywords|String collection|Tokens which to search settings on Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|maximumCount|Int32|Maximum number of simple settings in the collection. Valid values 1 to 100|
|minimumCount|Int32|Minimum number of simple settings in the collection. Valid values 1 to 100|
|name|String|Name of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|occurrence|[deviceManagementConfigurationSettingOccurrence](../resources/devicemanagementconfigurationsettingoccurrence.md)|Indicates whether the setting is required or not Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|offsetUri|String|Offset CSP Path from Base Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|rootDefinitionId|String|Root setting definition if the setting is a child setting. Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|settingUsage|deviceManagementConfigurationSettingUsage|Setting type, for example, configuration and compliance Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `configuration`.|
|uxBehavior|deviceManagementConfigurationControlType|Setting control type representation in the UX Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `default`, `dropdown`, `smallTextBox`, `largeTextBox`, `toggle`, `multiheaderGrid`, `contextPane`.|
|valueDefinition|[deviceManagementConfigurationSettingValueDefinition](../resources/devicemanagementconfigurationsettingvaluedefinition.md)|Definition of the value for this setting Inherited from [deviceManagementConfigurationSimpleSettingDefinition](../resources/devicemanagementconfigurationsimplesettingdefinition.md)|
|version|String|Item Version Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|visibility|deviceManagementConfigurationSettingVisibility|Setting visibility scope to UX Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `settingsCatalog`, `template`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionDefinition",
  "baseType": "microsoft.graph.deviceManagementConfigurationSimpleSettingDefinition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSimpleSettingCollectionDefinition",
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
  "defaultValue": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingValue"
  },
  "dependedOnBy": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingDependedOnBy"
    }
  ],
  "dependentOn": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationDependentOn"
    }
  ],
  "valueDefinition": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingValueDefinition"
  },
  "maximumCount": "Integer",
  "minimumCount": "Integer"
}
```

