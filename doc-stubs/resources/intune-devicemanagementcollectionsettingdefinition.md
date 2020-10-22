---
title: "deviceManagementCollectionSettingDefinition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementCollectionSettingDefinition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceManagementSettingDefinition](../resources/devicemanagementsettingdefinition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementCollectionSettingDefinitions](../api/intune-devicemanagementcollectionsettingdefinition-list.md)|[deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md) collection|Get a list of the [deviceManagementCollectionSettingDefinition](../resources/devicemanagementcollectionsettingdefinition.md) objects and their properties.|
|[Create deviceManagementCollectionSettingDefinition](../api/intune-devicemanagementcollectionsettingdefinition-create.md)|[deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md)|Create a new [deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md) object.|
|[Get deviceManagementCollectionSettingDefinition](../api/intune-devicemanagementcollectionsettingdefinition-get.md)|[deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md)|Read the properties and relationships of a [deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md) object.|
|[Update deviceManagementCollectionSettingDefinition](../api/intune-devicemanagementcollectionsettingdefinition-update.md)|[deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md)|Update the properties of a [deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md) object.|
|[Delete deviceManagementCollectionSettingDefinition](../api/intune-devicemanagementcollectionsettingdefinition-delete.md)|None|Deletes a [deviceManagementCollectionSettingDefinition](../resources/intune-devicemanagementcollectionsettingdefinition.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|constraints|[deviceManagementConstraint](../resources/intune-devicemanagementconstraint.md) collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|dependencies|[deviceManagementSettingDependency](../resources/intune-devicemanagementsettingdependency.md) collection|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|description|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|documentationUrl|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|elementDefinitionId|String|**TODO: Add Description**|
|headerSubtitle|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|headerTitle|String|**TODO: Add Description** Inherited from [deviceManagementSettingDefinition](../resources/intune-devicemanagementsettingdefinition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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
  "@odata.type": "microsoft.graph.deviceManagementCollectionSettingDefinition",
  "baseType": "microsoft.graph.deviceManagementSettingDefinition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementCollectionSettingDefinition",
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
  "elementDefinitionId": "String"
}
```

