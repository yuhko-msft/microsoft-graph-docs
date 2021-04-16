---
title: "deviceManagementResourceAccessProfileAssignment resource type"
description: "Entity that describes tenant level settings for derived credentials"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceManagementResourceAccessProfileAssignment resource type

Namespace: microsoft.graph



Entity that describes tenant level settings for derived credentials


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceManagementResourceAccessProfileAssignments](../api/devicemanagementresourceaccessprofileassignment-list.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|Get a list of the [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) objects and their properties.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/devicemanagementresourceaccessprofileassignment-create.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Create a new [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) object.|
|[Get deviceManagementResourceAccessProfileAssignment](../api/devicemanagementresourceaccessprofileassignment-get.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Read the properties and relationships of a [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) object.|
|[Update deviceManagementResourceAccessProfileAssignment](../api/devicemanagementresourceaccessprofileassignment-update.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Update the properties of a [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) object.|
|[Delete deviceManagementResourceAccessProfileAssignment](../api/devicemanagementresourceaccessprofileassignment-delete.md)|None|Deletes a [deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intent|deviceManagementResourceAccessProfileIntent|The assignment intent for the resource access profile. Possible values are: `apply`, `remove`.|
|sourceId|String|The identifier of the source of the assignment.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for the resource access profile.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceManagementResourceAccessProfileAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceManagementResourceAccessProfileAssignment",
  "id": "String (identifier)",
  "intent": "String",
  "sourceId": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

