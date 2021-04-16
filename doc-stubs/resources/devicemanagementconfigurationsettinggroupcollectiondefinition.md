---
title: "deviceManagementConfigurationSettingGroupCollectionDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementConfigurationSettingGroupCollectionDefinition resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [deviceManagementConfigurationSettingGroupDefinition](../resources/devicemanagementconfigurationsettinggroupdefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationSettingGroupCollectionDefinitions](../api/devicemanagementconfigurationsettinggroupcollectiondefinition-list.md)|[deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md) collection|Get a list of the [deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md) objects and their properties.|
|[Create deviceManagementConfigurationSettingGroupCollectionDefinition](../api/devicemanagementconfigurationsettinggroupcollectiondefinition-create.md)|[deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md)|Create a new [deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md) object.|
|[Get deviceManagementConfigurationSettingGroupCollectionDefinition](../api/devicemanagementconfigurationsettinggroupcollectiondefinition-get.md)|[deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md)|Read the properties and relationships of a [deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md) object.|
|[Update deviceManagementConfigurationSettingGroupCollectionDefinition](../api/devicemanagementconfigurationsettinggroupcollectiondefinition-update.md)|[deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md)|Update the properties of a [deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md) object.|
|[Delete deviceManagementConfigurationSettingGroupCollectionDefinition](../api/devicemanagementconfigurationsettinggroupcollectiondefinition-delete.md)|None|Deletes a [deviceManagementConfigurationSettingGroupCollectionDefinition](../resources/devicemanagementconfigurationsettinggroupcollectiondefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessTypes|deviceManagementConfigurationSettingAccessTypes|Read/write access mode of the setting Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md). Possible values are: `none`, `add`, `copy`, `delete`, `get`, `replace`, `execute`.|
|applicability|[deviceManagementConfigurationSettingApplicability](../resources/devicemanagementconfigurationsettingapplicability.md)|Details which device setting is applicable on Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|baseUri|String|Base CSP Path Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|categoryId|String|Specifies the area group under which the setting is configured in a specified configuration service provider (CSP) Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|childIds|String collection|Dependent child settings to this group of settings Inherited from [deviceManagementConfigurationSettingGroupDefinition](../resources/devicemanagementconfigurationsettinggroupdefinition.md)|
|dependedOnBy|[deviceManagementConfigurationSettingDependedOnBy](../resources/devicemanagementconfigurationsettingdependedonby.md) collection|List of child settings that depend on this setting Inherited from [deviceManagementConfigurationSettingGroupDefinition](../resources/devicemanagementconfigurationsettinggroupdefinition.md)|
|dependentOn|[deviceManagementConfigurationDependentOn](../resources/devicemanagementconfigurationdependenton.md) collection|List of Dependencies for the setting group Inherited from [deviceManagementConfigurationSettingGroupDefinition](../resources/devicemanagementconfigurationsettinggroupdefinition.md)|
|description|String|Description of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|displayName|String|Display name of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|helpText|String|Help text of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|infoUrls|String collection|List of links more info for the setting can be found at Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|keywords|String collection|Tokens which to search settings on Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|maximumCount|Int32|Maximum number of setting group count in the collection. Valid values 1 to 100|
|minimumCount|Int32|Minimum number of setting group count in the collection. Valid values 1 to 100|
|name|String|Name of the item Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|occurrence|[deviceManagementConfigurationSettingOccurrence](../resources/devicemanagementconfigurationsettingoccurrence.md)|Indicates whether the setting is required or not Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
|offsetUri|String|Offset CSP Path from Base Inherited from [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md)|
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
  "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingGroupCollectionDefinition",
  "baseType": "microsoft.graph.deviceManagementConfigurationSettingGroupDefinition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementConfigurationSettingGroupCollectionDefinition",
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
  "childIds": [
    "String"
  ],
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
  "maximumCount": "Integer",
  "minimumCount": "Integer"
}
```

