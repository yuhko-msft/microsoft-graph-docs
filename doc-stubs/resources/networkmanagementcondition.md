---
title: "networkManagementCondition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# networkManagementCondition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [managementCondition](../resources/managementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List networkManagementConditions](../api/networkmanagementcondition-list.md)|[networkManagementCondition](../resources/networkmanagementcondition.md) collection|Get a list of the [networkManagementCondition](../resources/networkmanagementcondition.md) objects and their properties.|
|[Create networkManagementCondition](../api/networkmanagementcondition-create.md)|[networkManagementCondition](../resources/networkmanagementcondition.md)|Create a new [networkManagementCondition](../resources/networkmanagementcondition.md) object.|
|[Get networkManagementCondition](../api/networkmanagementcondition-get.md)|[networkManagementCondition](../resources/networkmanagementcondition.md)|Read the properties and relationships of a [networkManagementCondition](../resources/networkmanagementcondition.md) object.|
|[Update networkManagementCondition](../api/networkmanagementcondition-update.md)|[networkManagementCondition](../resources/networkmanagementcondition.md)|Update the properties of a [networkManagementCondition](../resources/networkmanagementcondition.md) object.|
|[Delete networkManagementCondition](../api/networkmanagementcondition-delete.md)|None|Deletes a [networkManagementCondition](../resources/networkmanagementcondition.md) object.|
|[List managementConditionStatements](../api/networkmanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatements](../api/networkmanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|
|[Remove managementConditionStatements](../api/networkmanagementcondition-delete-managementconditionstatements.md)|None|Remove a [managementConditionStatement](../resources/intune-managementconditionstatement.md) object.|

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
  "@odata.type": "microsoft.graph.networkManagementCondition",
  "baseType": "microsoft.graph.managementCondition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.networkManagementCondition",
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

