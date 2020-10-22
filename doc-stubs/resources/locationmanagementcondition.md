---
title: "locationManagementCondition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# locationManagementCondition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [managementCondition](../resources/managementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List locationManagementConditions](../api/locationmanagementcondition-list.md)|[locationManagementCondition](../resources/locationmanagementcondition.md) collection|Get a list of the [locationManagementCondition](../resources/locationmanagementcondition.md) objects and their properties.|
|[Create locationManagementCondition](../api/locationmanagementcondition-create.md)|[locationManagementCondition](../resources/locationmanagementcondition.md)|Create a new [locationManagementCondition](../resources/locationmanagementcondition.md) object.|
|[Get locationManagementCondition](../api/locationmanagementcondition-get.md)|[locationManagementCondition](../resources/locationmanagementcondition.md)|Read the properties and relationships of a [locationManagementCondition](../resources/locationmanagementcondition.md) object.|
|[Update locationManagementCondition](../api/locationmanagementcondition-update.md)|[locationManagementCondition](../resources/locationmanagementcondition.md)|Update the properties of a [locationManagementCondition](../resources/locationmanagementcondition.md) object.|
|[Delete locationManagementCondition](../api/locationmanagementcondition-delete.md)|None|Deletes a [locationManagementCondition](../resources/locationmanagementcondition.md) object.|
|[List managementConditionStatements](../api/locationmanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatements](../api/locationmanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|
|[Remove managementConditionStatements](../api/locationmanagementcondition-delete-managementconditionstatements.md)|None|Remove a [managementConditionStatement](../resources/intune-managementconditionstatement.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatforms|devicePlatformType collection|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|description|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|displayName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|eTag|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|uniqueName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managementConditionStatements|[managementConditionStatement](../resources/intune-managementconditionstatement.md) collection|**TODO: Add Description** Inherited from [managementCondition](../resources/managementcondition.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.locationManagementCondition",
  "baseType": "microsoft.graph.managementCondition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.locationManagementCondition",
  "id": "String (identifier)",
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ]
}
```

