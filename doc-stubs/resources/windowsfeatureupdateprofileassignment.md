---
title: "windowsFeatureUpdateProfileAssignment resource type"
description: "This entity contains the properties used to assign a windows feature update profile to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsFeatureUpdateProfileAssignment resource type

Namespace: microsoft.graph



This entity contains the properties used to assign a windows feature update profile to a group.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsFeatureUpdateProfileAssignments](../api/windowsfeatureupdateprofileassignment-list.md)|[windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) collection|Get a list of the [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) objects and their properties.|
|[Create windowsFeatureUpdateProfileAssignment](../api/windowsfeatureupdateprofileassignment-create.md)|[windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md)|Create a new [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) object.|
|[Get windowsFeatureUpdateProfileAssignment](../api/windowsfeatureupdateprofileassignment-get.md)|[windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md)|Read the properties and relationships of a [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) object.|
|[Update windowsFeatureUpdateProfileAssignment](../api/windowsfeatureupdateprofileassignment-update.md)|[windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md)|Update the properties of a [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) object.|
|[Delete windowsFeatureUpdateProfileAssignment](../api/windowsfeatureupdateprofileassignment-delete.md)|None|Deletes a [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) object.|

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
  "@odata.type": "microsoft.graph.windowsFeatureUpdateProfileAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsFeatureUpdateProfileAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

