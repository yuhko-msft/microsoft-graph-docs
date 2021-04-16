---
title: "networkManagementCondition resource type"
description: "Contains the information to define a network management condition."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# networkManagementCondition resource type

Namespace: microsoft.graph



Contains the information to define a network management condition.


Inherits from [managementCondition](../resources/managementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List networkManagementConditions](../api/networkmanagementcondition-list.md)|[networkManagementCondition](../resources/networkmanagementcondition.md) collection|Get a list of the [networkManagementCondition](../resources/networkmanagementcondition.md) objects and their properties.|
|[Create networkManagementCondition](../api/networkmanagementcondition-create.md)|[networkManagementCondition](../resources/networkmanagementcondition.md)|Create a new [networkManagementCondition](../resources/networkmanagementcondition.md) object.|
|[Get networkManagementCondition](../api/networkmanagementcondition-get.md)|[networkManagementCondition](../resources/networkmanagementcondition.md)|Read the properties and relationships of a [networkManagementCondition](../resources/networkmanagementcondition.md) object.|
|[Update networkManagementCondition](../api/networkmanagementcondition-update.md)|[networkManagementCondition](../resources/networkmanagementcondition.md)|Update the properties of a [networkManagementCondition](../resources/networkmanagementcondition.md) object.|
|[Delete networkManagementCondition](../api/networkmanagementcondition-delete.md)|None|Deletes a [networkManagementCondition](../resources/networkmanagementcondition.md) object.|
|[List managementConditionStatements](../api/networkmanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatement](../api/networkmanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatforms|devicePlatformType collection|The applicable platforms for this management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|createdDateTime|DateTimeOffset|The time the management condition was created. Generated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|description|String|The admin defined description of the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|displayName|String|The admin defined name of the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|eTag|String|ETag of the management condition. Updated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|modifiedDateTime|DateTimeOffset|The time the management condition was last modified. Updated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|uniqueName|String|Unique name for the management condition. Used in management condition expressions. Inherited from [managementCondition](../resources/managementcondition.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managementConditionStatements|[managementConditionStatement](../resources/managementconditionstatement.md) collection|The management condition statements associated to the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|

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
  "applicablePlatforms": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "modifiedDateTime": "String (timestamp)",
  "uniqueName": "String"
}
```

