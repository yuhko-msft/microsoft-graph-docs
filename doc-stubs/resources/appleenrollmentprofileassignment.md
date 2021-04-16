---
title: "appleEnrollmentProfileAssignment resource type"
description: "An assignment of an Apple profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# appleEnrollmentProfileAssignment resource type

Namespace: microsoft.graph



An assignment of an Apple profile.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List appleEnrollmentProfileAssignments](../api/appleenrollmentprofileassignment-list.md)|[appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md) collection|Get a list of the [appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md) objects and their properties.|
|[Create appleEnrollmentProfileAssignment](../api/appleenrollmentprofileassignment-create.md)|[appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md)|Create a new [appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md) object.|
|[Get appleEnrollmentProfileAssignment](../api/appleenrollmentprofileassignment-get.md)|[appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md)|Read the properties and relationships of an [appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md) object.|
|[Update appleEnrollmentProfileAssignment](../api/appleenrollmentprofileassignment-update.md)|[appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md)|Update the properties of an [appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md) object.|
|[Delete appleEnrollmentProfileAssignment](../api/appleenrollmentprofileassignment-delete.md)|None|Deletes an [appleEnrollmentProfileAssignment](../resources/appleenrollmentprofileassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for the Apple user initiated deployment profile.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.appleEnrollmentProfileAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.appleEnrollmentProfileAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

