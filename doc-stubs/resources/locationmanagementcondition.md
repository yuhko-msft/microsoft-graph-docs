---
title: "locationManagementCondition resource type"
description: "Contains the information to define a location management condition, an area of interest, to monitor."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# locationManagementCondition resource type

Namespace: microsoft.graph



Contains the information to define a location management condition, an area of interest, to monitor.


Inherits from [managementCondition](../resources/managementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List locationManagementConditions](../api/locationmanagementcondition-list.md)|[locationManagementCondition](../resources/locationmanagementcondition.md) collection|Get a list of the [locationManagementCondition](../resources/locationmanagementcondition.md) objects and their properties.|
|[Create locationManagementCondition](../api/locationmanagementcondition-create.md)|[locationManagementCondition](../resources/locationmanagementcondition.md)|Create a new [locationManagementCondition](../resources/locationmanagementcondition.md) object.|
|[Get locationManagementCondition](../api/locationmanagementcondition-get.md)|[locationManagementCondition](../resources/locationmanagementcondition.md)|Read the properties and relationships of a [locationManagementCondition](../resources/locationmanagementcondition.md) object.|
|[Update locationManagementCondition](../api/locationmanagementcondition-update.md)|[locationManagementCondition](../resources/locationmanagementcondition.md)|Update the properties of a [locationManagementCondition](../resources/locationmanagementcondition.md) object.|
|[Delete locationManagementCondition](../api/locationmanagementcondition-delete.md)|None|Deletes a [locationManagementCondition](../resources/locationmanagementcondition.md) object.|
|[List managementConditionStatements](../api/locationmanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatement](../api/locationmanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|

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
  "@odata.type": "microsoft.graph.locationManagementCondition",
  "baseType": "microsoft.graph.managementCondition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.locationManagementCondition",
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

