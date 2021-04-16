---
title: "deviceManagementSettingDefinition resource type"
description: "Entity representing the defintion for a given setting"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementSettingDefinition resource type

Namespace: microsoft.graph



Entity representing the defintion for a given setting


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementSettingDefinitions](../api/devicemanagementsettingdefinition-list.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) collection|Get a list of the [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) objects and their properties.|
|[Create deviceManagementSettingDefinition](../api/devicemanagementsettingdefinition-create.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|Create a new [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object.|
|[Get deviceManagementSettingDefinition](../api/devicemanagementsettingdefinition-get.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|Read the properties and relationships of a [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object.|
|[Update deviceManagementSettingDefinition](../api/devicemanagementsettingdefinition-update.md)|[deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md)|Update the properties of a [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object.|
|[Delete deviceManagementSettingDefinition](../api/devicemanagementsettingdefinition-delete.md)|None|Deletes a [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|constraints|[deviceManagementConstraint](../resources/devicemanagementconstraint.md) collection|Collection of constraints for the setting value|
|dependencies|[deviceManagementSettingDependency](../resources/devicemanagementsettingdependency.md) collection|Collection of dependencies on other settings|
|description|String|The setting's description|
|displayName|String|The setting's display name|
|documentationUrl|String|Url to setting documentation|
|headerSubtitle|String|subtitle of the setting header for more details about the category/section|
|headerTitle|String|title of the setting header represents a category/section of a setting/settings|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isTopLevel|Boolean|If the setting is top level, it can be configured without the need to be wrapped in a collection or complex setting|
|keywords|String collection|Keywords associated with the setting|
|placeholderText|String|Placeholder text as an example of valid input|
|valueType|deviceManangementIntentValueType|The data type of the value. Possible values are: `integer`, `boolean`, `string`, `complex`, `collection`, `abstractComplex`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementSettingDefinition",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementSettingDefinition",
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
  "valueType": "String"
}
```

