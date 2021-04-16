---
title: "deviceManagementComplexSettingDefinition resource type"
description: "Entity representing the defintion for a complex setting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementComplexSettingDefinition resource type

Namespace: microsoft.graph



Entity representing the defintion for a complex setting


Inherits from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementComplexSettingDefinitions](../api/devicemanagementcomplexsettingdefinition-list.md)|[deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) collection|Get a list of the [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) objects and their properties.|
|[Create deviceManagementComplexSettingDefinition](../api/devicemanagementcomplexsettingdefinition-create.md)|[deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md)|Create a new [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) object.|
|[Get deviceManagementComplexSettingDefinition](../api/devicemanagementcomplexsettingdefinition-get.md)|[deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md)|Read the properties and relationships of a [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) object.|
|[Update deviceManagementComplexSettingDefinition](../api/devicemanagementcomplexsettingdefinition-update.md)|[deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md)|Update the properties of a [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) object.|
|[Delete deviceManagementComplexSettingDefinition](../api/devicemanagementcomplexsettingdefinition-delete.md)|None|Deletes a [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|constraints|[deviceManagementConstraint](../resources/devicemanagementconstraint.md) collection|Collection of constraints for the setting value Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|dependencies|[deviceManagementSettingDependency](../resources/devicemanagementsettingdependency.md) collection|Collection of dependencies on other settings Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|description|String|The setting's description Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|displayName|String|The setting's display name Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|documentationUrl|String|Url to setting documentation Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|headerSubtitle|String|subtitle of the setting header for more details about the category/section Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|headerTitle|String|title of the setting header represents a category/section of a setting/settings Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isTopLevel|Boolean|If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|keywords|String collection|Keywords associated with the setting Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|placeholderText|String|Placeholder text as an example of valid input Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|
|propertyDefinitionIds|String collection|The definitions of each property of the complex setting|
|valueType|deviceManangementIntentValueType|The data type of the value Inherited from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md). Possible values are: `integer`, `boolean`, `string`, `complex`, `collection`, `abstractComplex`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementComplexSettingDefinition",
  "baseType": "microsoft.graph.deviceManagementSettingDefinition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementComplexSettingDefinition",
  "id": "String (identifier)",
  "constraints": [
    {
      "@odata.type": "microsoft.graph.deviceManagementEnumConstraint"
    }
  ],
  "dependencies": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingDependency"
    }
  ],
  "description": "String",
  "displayName": "String",
  "documentationUrl": "String",
  "headerSubtitle": "String",
  "headerTitle": "String",
  "isTopLevel": "Boolean",
  "keywords": [
    "String"
  ],
  "placeholderText": "String",
  "valueType": "String",
  "propertyDefinitionIds": [
    "String"
  ]
}
```

