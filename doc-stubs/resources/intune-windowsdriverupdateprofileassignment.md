---
title: "windowsDriverUpdateProfileAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsDriverUpdateProfileAssignment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsDriverUpdateProfileAssignments](../api/intune-windowsdriverupdateprofileassignment-list.md)|[windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md) collection|Get a list of the [windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md) objects and their properties.|
|[Create windowsDriverUpdateProfileAssignment](../api/intune-windowsdriverupdateprofileassignment-create.md)|[windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md)|Create a new [windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md) object.|
|[Get windowsDriverUpdateProfileAssignment](../api/intune-windowsdriverupdateprofileassignment-get.md)|[windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md)|Read the properties and relationships of a [windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md) object.|
|[Update windowsDriverUpdateProfileAssignment](../api/intune-windowsdriverupdateprofileassignment-update.md)|[windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md)|Update the properties of a [windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md) object.|
|[Delete windowsDriverUpdateProfileAssignment](../api/intune-windowsdriverupdateprofileassignment-delete.md)|None|Deletes a [windowsDriverUpdateProfileAssignment](../resources/intune-windowsdriverupdateprofileassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|target|[deviceAndAppManagementAssignmentTarget](../resources/intune-deviceandappmanagementassignmenttarget.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsDriverUpdateProfileAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsDriverUpdateProfileAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

