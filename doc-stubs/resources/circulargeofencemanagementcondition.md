---
title: "circularGeofenceManagementCondition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# circularGeofenceManagementCondition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [locationManagementCondition](../resources/locationmanagementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List circularGeofenceManagementConditions](../api/circulargeofencemanagementcondition-list.md)|[circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) collection|Get a list of the [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) objects and their properties.|
|[Create circularGeofenceManagementCondition](../api/circulargeofencemanagementcondition-create.md)|[circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md)|Create a new [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.|
|[Get circularGeofenceManagementCondition](../api/circulargeofencemanagementcondition-get.md)|[circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md)|Read the properties and relationships of a [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.|
|[Update circularGeofenceManagementCondition](../api/circulargeofencemanagementcondition-update.md)|[circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md)|Update the properties of a [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.|
|[Delete circularGeofenceManagementCondition](../api/circulargeofencemanagementcondition-delete.md)|None|Deletes a [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.|
|[List managementConditionStatements](../api/circulargeofencemanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatements](../api/circulargeofencemanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|
|[Remove managementConditionStatements](../api/circulargeofencemanagementcondition-delete-managementconditionstatements.md)|None|Remove a [managementConditionStatement](../resources/intune-managementconditionstatement.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatforms|devicePlatformType collection|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|description|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|displayName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|eTag|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|latitude|Double|**TODO: Add Description**|
|longitude|Double|**TODO: Add Description**|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|radiusInMeters|Single|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.circularGeofenceManagementCondition",
  "baseType": "microsoft.graph.locationManagementCondition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.circularGeofenceManagementCondition",
  "id": "String (identifier)",
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ],
  "latitude": "Double",
  "longitude": "Double",
  "radiusInMeters": "Single"
}
```

