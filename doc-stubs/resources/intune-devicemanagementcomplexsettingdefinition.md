---
title: "deviceManagementComplexSettingDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementComplexSettingDefinition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementComplexSettingDefinitions](../api/intune-devicemanagementcomplexsettingdefinition-list.md)|[deviceManagementComplexSettingDefinition](../resources/intune-devicemanagementcomplexsettingdefinition.md) collection|Get a list of the [deviceManagementComplexSettingDefinition](../resources/devicemanagementcomplexsettingdefinition.md) objects and their properties.|
|[Create deviceManagementComplexSettingDefinition](../api/intune-devicemanagementcomplexsettingdefinition-create.md)|[deviceManagementComplexSettingDefinition](../resources/intune-devicemanagementcomplexsettingdefinition.md)|Create a new [deviceManagementComplexSettingDefinition](../resources/intune-devicemanagementcomplexsettingdefinition.md) object.|
|[Get deviceManagementComplexSettingDefinition](../api/intune-devicemanagementcomplexsettingdefinition-get.md)|[deviceManagementComplexSettingDefinition](../resources/intune-devicemanagementcomplexsettingdefinition.md)|Read the properties and relationships of a [deviceManagementComplexSettingDefinition](../resources/intune-devicemanagementcomplexsettingdefinition.md) object.|
|[Update deviceManagementComplexSettingDefinition](../api/intune-devicemanagementcomplexsettingdefinition-update.md)|[deviceManagementComplexSettingDefinition](../resources/intune-devicemanagementcomplexsettingdefinition.md)|Update the properties of a [deviceManagementComplexSettingDefinition](../resources/intune-devicemanagementcomplexsettingdefinition.md) object.|
|[Delete deviceManagementComplexSettingDefinition](../api/intune-devicemanagementcomplexsettingdefinition-delete.md)|None|Deletes a [deviceManagementComplexSettingDefinition](../resources/intune-devicemanagementcomplexsettingdefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|constraints|[deviceManagementConstraint](../resources/intune-devicemanagementconstraint.md) collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|dependencies|[deviceManagementSettingDependency](../resources/intune-devicemanagementsettingdependency.md) collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|documentationUrl|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|headerSubtitle|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|headerTitle|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isTopLevel|Boolean|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|keywords|String collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|placeholderText|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|propertyDefinitionIds|String collection|**TODO: Add Description**|
|valueType|deviceManangementIntentValueType|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md). Possible values are: `integer`, `boolean`, `string`, `complex`, `collection`, `abstractComplex`.|

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
  "valueType": "String",
  "displayName": "String",
  "isTopLevel": "Boolean",
  "description": "String",
  "placeholderText": "String",
  "documentationUrl": "String",
  "headerTitle": "String",
  "headerSubtitle": "String",
  "keywords": [
    "String"
  ],
  "constraints": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingAppConstraint"
    }
  ],
  "dependencies": [
    {
      "@odata.type": "microsoft.graph.deviceManagementSettingDependency"
    }
  ],
  "propertyDefinitionIds": [
    "String"
  ]
}
```

