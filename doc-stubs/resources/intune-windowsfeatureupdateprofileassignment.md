---
title: "windowsFeatureUpdateProfileAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsFeatureUpdateProfileAssignment resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsFeatureUpdateProfileAssignments](../api/intune-windowsfeatureupdateprofileassignment-list.md)|[windowsFeatureUpdateProfileAssignment](../resources/intune-windowsfeatureupdateprofileassignment.md) collection|Get a list of the [windowsFeatureUpdateProfileAssignment](../resources/windowsfeatureupdateprofileassignment.md) objects and their properties.|
|[Create windowsFeatureUpdateProfileAssignment](../api/intune-windowsfeatureupdateprofileassignment-create.md)|[windowsFeatureUpdateProfileAssignment](../resources/intune-windowsfeatureupdateprofileassignment.md)|Create a new [windowsFeatureUpdateProfileAssignment](../resources/intune-windowsfeatureupdateprofileassignment.md) object.|
|[Get windowsFeatureUpdateProfileAssignment](../api/intune-windowsfeatureupdateprofileassignment-get.md)|[windowsFeatureUpdateProfileAssignment](../resources/intune-windowsfeatureupdateprofileassignment.md)|Read the properties and relationships of a [windowsFeatureUpdateProfileAssignment](../resources/intune-windowsfeatureupdateprofileassignment.md) object.|
|[Update windowsFeatureUpdateProfileAssignment](../api/intune-windowsfeatureupdateprofileassignment-update.md)|[windowsFeatureUpdateProfileAssignment](../resources/intune-windowsfeatureupdateprofileassignment.md)|Update the properties of a [windowsFeatureUpdateProfileAssignment](../resources/intune-windowsfeatureupdateprofileassignment.md) object.|
|[Delete windowsFeatureUpdateProfileAssignment](../api/intune-windowsfeatureupdateprofileassignment-delete.md)|None|Deletes a [windowsFeatureUpdateProfileAssignment](../resources/intune-windowsfeatureupdateprofileassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|phaseNumber|Int32|**TODO: Add Description**|
|target|[deviceAndAppManagementAssignmentTarget](../resources/intune-deviceandappmanagementassignmenttarget.md)|**TODO: Add Description**|

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
  },
  "phaseNumber": "Integer"
}
```

