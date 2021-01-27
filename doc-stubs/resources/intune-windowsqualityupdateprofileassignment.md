---
title: "windowsQualityUpdateProfileAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsQualityUpdateProfileAssignment resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsQualityUpdateProfileAssignments](../api/intune-windowsqualityupdateprofileassignment-list.md)|[windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md) collection|Get a list of the [windowsQualityUpdateProfileAssignment](../resources/windowsqualityupdateprofileassignment.md) objects and their properties.|
|[Create windowsQualityUpdateProfileAssignment](../api/intune-windowsqualityupdateprofileassignment-create.md)|[windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md)|Create a new [windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md) object.|
|[Get windowsQualityUpdateProfileAssignment](../api/intune-windowsqualityupdateprofileassignment-get.md)|[windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md)|Read the properties and relationships of a [windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md) object.|
|[Update windowsQualityUpdateProfileAssignment](../api/intune-windowsqualityupdateprofileassignment-update.md)|[windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md)|Update the properties of a [windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md) object.|
|[Delete windowsQualityUpdateProfileAssignment](../api/intune-windowsqualityupdateprofileassignment-delete.md)|None|Deletes a [windowsQualityUpdateProfileAssignment](../resources/intune-windowsqualityupdateprofileassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|target|[deviceAndAppManagementAssignmentTarget](../resources/intune-deviceandappmanagementassignmenttarget.md)|**TODO: Add Description**|

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

