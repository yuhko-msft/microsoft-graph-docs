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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementConfigurationSettingDefinitions](../api/intune-devicemanagementconfigurationsettingdefinition-list.md)|[deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) collection|Get a list of the [deviceManagementConfigurationSettingDefinition](../resources/devicemanagementconfigurationsettingdefinition.md) objects and their properties.|
|[Create deviceManagementConfigurationSettingDefinition](../api/intune-devicemanagementconfigurationsettingdefinition-create.md)|[deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md)|Create a new [deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) object.|
|[Get deviceManagementConfigurationSettingDefinition](../api/intune-devicemanagementconfigurationsettingdefinition-get.md)|[deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md)|Read the properties and relationships of a [deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) object.|
|[Update deviceManagementConfigurationSettingDefinition](../api/intune-devicemanagementconfigurationsettingdefinition-update.md)|[deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md)|Update the properties of a [deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) object.|
|[Delete deviceManagementConfigurationSettingDefinition](../api/intune-devicemanagementconfigurationsettingdefinition-delete.md)|None|Deletes a [deviceManagementConfigurationSettingDefinition](../resources/intune-devicemanagementconfigurationsettingdefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessTypes|deviceManagementConfigurationSettingAccessTypes|**TODO: Add Description**. Possible values are: `none`, `add`, `copy`, `delete`, `get`, `replace`, `execute`.|
|applicability|[deviceManagementConfigurationSettingApplicability](../resources/intune-devicemanagementconfigurationsettingapplicability.md)|**TODO: Add Description**|
|baseUri|String|**TODO: Add Description**|
|categoryId|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|helpText|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|infoUrls|String collection|**TODO: Add Description**|
|keywords|String collection|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|occurrence|[deviceManagementConfigurationSettingOccurrence](../resources/intune-devicemanagementconfigurationsettingoccurrence.md)|**TODO: Add Description**|
|offsetUri|String|**TODO: Add Description**|
|referredSettingInformationList|[deviceManagementConfigurationReferredSettingInformation](../resources/intune-devicemanagementconfigurationreferredsettinginformation.md) collection|**TODO: Add Description**|
|rootDefinitionId|String|**TODO: Add Description**|
|settingUsage|deviceManagementConfigurationSettingUsage|**TODO: Add Description**. Possible values are: `none`, `configuration`.|
|uxBehavior|deviceManagementConfigurationControlType|**TODO: Add Description**. Possible values are: `default`, `dropdown`, `smallTextBox`, `largeTextBox`, `toggle`, `multiheaderGrid`, `contextPane`.|
|version|String|**TODO: Add Description**|
|visibility|deviceManagementConfigurationSettingVisibility|**TODO: Add Description**. Possible values are: `none`, `settingsCatalog`, `template`.|

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
  "applicability": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingApplicability"
  },
  "accessTypes": "String",
  "keywords": [
    "String"
  ],
  "infoUrls": [
    "String"
  ],
  "occurrence": {
    "@odata.type": "microsoft.graph.deviceManagementConfigurationSettingOccurrence"
  },
  "baseUri": "String",
  "offsetUri": "String",
  "rootDefinitionId": "String",
  "categoryId": "String",
  "settingUsage": "String",
  "uxBehavior": "String",
  "visibility": "String",
  "referredSettingInformationList": [
    {
      "@odata.type": "microsoft.graph.deviceManagementConfigurationReferredSettingInformation"
    }
  ],
  "description": "String",
  "helpText": "String",
  "name": "String",
  "displayName": "String",
  "version": "String"
}
```

