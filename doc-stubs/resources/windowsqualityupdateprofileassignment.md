---
title: "windowsQualityUpdateProfileAssignment resource type"
description: "This entity contains the properties used to assign a windows quality update profile to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsQualityUpdateProfileAssignment resource type

Namespace: microsoft.graph



This entity contains the properties used to assign a windows quality update profile to a group.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsQualityUpdateProfileAssignments](../api/windowsqualityupdateprofileassignment-list.md)|[windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) collection|Get a list of the [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) objects and their properties.|
|[Create windowsQualityUpdateProfileAssignment](../api/windowsqualityupdateprofileassignment-create.md)|[windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md)|Create a new [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object.|
|[Get windowsQualityUpdateProfileAssignment](../api/windowsqualityupdateprofileassignment-get.md)|[windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md)|Read the properties and relationships of a [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object.|
|[Update windowsQualityUpdateProfileAssignment](../api/windowsqualityupdateprofileassignment-update.md)|[windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md)|Update the properties of a [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object.|
|[Delete windowsQualityUpdateProfileAssignment](../api/windowsqualityupdateprofileassignment-delete.md)|None|Deletes a [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target that the feature update profile is assigned to.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsQualityUpdateProfileAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsQualityUpdateProfileAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

