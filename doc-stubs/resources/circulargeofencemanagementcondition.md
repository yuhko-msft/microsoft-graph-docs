---
title: "circularGeofenceManagementCondition resource type"
description: "Contains the information to define a circular geo-fence management condition, an area of interest, to monitor."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# circularGeofenceManagementCondition resource type

Namespace: microsoft.graph



Contains the information to define a circular geo-fence management condition, an area of interest, to monitor.


Inherits from [locationManagementCondition](../resources/locationmanagementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List circularGeofenceManagementConditions](../api/circulargeofencemanagementcondition-list.md)|[circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) collection|Get a list of the [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) objects and their properties.|
|[Create circularGeofenceManagementCondition](../api/circulargeofencemanagementcondition-create.md)|[circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md)|Create a new [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.|
|[Get circularGeofenceManagementCondition](../api/circulargeofencemanagementcondition-get.md)|[circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md)|Read the properties and relationships of a [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.|
|[Update circularGeofenceManagementCondition](../api/circulargeofencemanagementcondition-update.md)|[circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md)|Update the properties of a [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.|
|[Delete circularGeofenceManagementCondition](../api/circulargeofencemanagementcondition-delete.md)|None|Deletes a [circularGeofenceManagementCondition](../resources/circulargeofencemanagementcondition.md) object.|
|[List managementConditionStatements](../api/circulargeofencemanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatement](../api/circulargeofencemanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatforms|devicePlatformType collection|The applicable platforms for this management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|createdDateTime|DateTimeOffset|The time the management condition was created. Generated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|description|String|The admin defined description of the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|displayName|String|The admin defined name of the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|eTag|String|ETag of the management condition. Updated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|latitude|Double|Latitude in degrees, between -90 and +90 inclusive.|
|longitude|Double|Longitude in degrees, between -180 and +180 inclusive.|
|modifiedDateTime|DateTimeOffset|The time the management condition was last modified. Updated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|radiusInMeters|Single|Radius in meters.|
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
  "@odata.type": "microsoft.graph.circularGeofenceManagementCondition",
  "baseType": "microsoft.graph.locationManagementCondition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.circularGeofenceManagementCondition",
  "id": "String (identifier)",
  "applicablePlatforms": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "modifiedDateTime": "String (timestamp)",
  "uniqueName": "String",
  "latitude": "Double",
  "longitude": "Double",
  "radiusInMeters": "Single"
}
```

