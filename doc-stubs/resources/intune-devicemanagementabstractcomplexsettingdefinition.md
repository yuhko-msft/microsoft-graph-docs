---
title: "deviceManagementAbstractComplexSettingDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementAbstractComplexSettingDefinition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementAbstractComplexSettingDefinitions](../api/intune-devicemanagementabstractcomplexsettingdefinition-list.md)|[deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md) collection|Get a list of the [deviceManagementAbstractComplexSettingDefinition](../resources/devicemanagementabstractcomplexsettingdefinition.md) objects and their properties.|
|[Create deviceManagementAbstractComplexSettingDefinition](../api/intune-devicemanagementabstractcomplexsettingdefinition-create.md)|[deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md)|Create a new [deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md) object.|
|[Get deviceManagementAbstractComplexSettingDefinition](../api/intune-devicemanagementabstractcomplexsettingdefinition-get.md)|[deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md)|Read the properties and relationships of a [deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md) object.|
|[Update deviceManagementAbstractComplexSettingDefinition](../api/intune-devicemanagementabstractcomplexsettingdefinition-update.md)|[deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md)|Update the properties of a [deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md) object.|
|[Delete deviceManagementAbstractComplexSettingDefinition](../api/intune-devicemanagementabstractcomplexsettingdefinition-delete.md)|None|Deletes a [deviceManagementAbstractComplexSettingDefinition](../resources/intune-devicemanagementabstractcomplexsettingdefinition.md) object.|

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
|implementations|String collection|**TODO: Add Description**|
|isTopLevel|Boolean|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|keywords|String collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|placeholderText|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|valueType|deviceManangementIntentValueType|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md). Possible values are: `integer`, `boolean`, `string`, `complex`, `collection`, `abstractComplex`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementAbstractComplexSettingDefinition",
  "baseType": "microsoft.graph.deviceManagementSettingDefinition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementAbstractComplexSettingDefinition",
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
  "implementations": [
    "String"
  ]
}
```

