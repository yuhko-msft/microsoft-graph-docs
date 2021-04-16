---
title: "managementCondition resource type"
description: "Management conditions are events that can be triggered dynamically such as geo-fences, time-fences, and network-fences."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managementCondition resource type

Namespace: microsoft.graph



Management conditions are events that can be triggered dynamically such as geo-fences, time-fences, and network-fences.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managementConditions](../api/managementcondition-list.md)|[managementCondition](../resources/managementcondition.md) collection|Get a list of the [managementCondition](../resources/managementcondition.md) objects and their properties.|
|[Create managementCondition](../api/managementcondition-create.md)|[managementCondition](../resources/managementcondition.md)|Create a new [managementCondition](../resources/managementcondition.md) object.|
|[Get managementCondition](../api/managementcondition-get.md)|[managementCondition](../resources/managementcondition.md)|Read the properties and relationships of a [managementCondition](../resources/managementcondition.md) object.|
|[Update managementCondition](../api/managementcondition-update.md)|[managementCondition](../resources/managementcondition.md)|Update the properties of a [managementCondition](../resources/managementcondition.md) object.|
|[Delete managementCondition](../api/managementcondition-delete.md)|None|Deletes a [managementCondition](../resources/managementcondition.md) object.|
|[getManagementConditionsForPlatform](../api/managementcondition-getmanagementconditionsforplatform.md)|[managementCondition](../resources/managementcondition.md) collection|**TODO: Add Description**|
|[List managementConditionStatements](../api/managementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatement](../api/managementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatforms|devicePlatformType collection|The applicable platforms for this management condition.|
|createdDateTime|DateTimeOffset|The time the management condition was created. Generated service side.|
|description|String|The admin defined description of the management condition.|
|displayName|String|The admin defined name of the management condition.|
|eTag|String|ETag of the management condition. Updated service side.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|modifiedDateTime|DateTimeOffset|The time the management condition was last modified. Updated service side.|
|uniqueName|String|Unique name for the management condition. Used in management condition expressions.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managementConditionStatements|[managementConditionStatement](../resources/managementconditionstatement.md) collection|The management condition statements associated to the management condition.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managementCondition",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managementCondition",
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

