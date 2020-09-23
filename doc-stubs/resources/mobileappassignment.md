---
title: "mobileAppAssignment resource type"
description: "A class containing the properties used for Group Assignment of a Mobile App."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppAssignment resource type

Namespace: microsoft.graph

A class containing the properties used for Group Assignment of a Mobile App.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List assignments](../api/win32lobapp-list-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get the mobileAppAssignment resources from the assignments navigation property.|
|[Create assignments](../api/win32lobapp-post-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new mobileAppAssignment object.|
|[Update assignments](../api/win32lobapp-update-assignments.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Update the properties of an assignments object.|
|[Get assignments](../api/win32lobapp-get-mobileappassignment.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Read the properties and relationships of a [mobileAppAssignment](../resources/intune-mobileappassignment.md) object.|
|[Delete assignments](../api/win32lobapp-delete-assignments.md)|None|Delete a [mobileAppAssignment](../resources/intune-mobileappassignment.md) object.|
|[List mobileAppAssignments](../api/mobileappassignment-list.md)|[mobileAppAssignment](../resources/mobileappassignment.md) collection|Get a list of the [mobileAppAssignment](../resources/mobileappassignment.md) objects and their properties.|
|[Create mobileAppAssignment](../api/mobileappassignment-create.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Create a new [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[Get mobileAppAssignment](../api/mobileappassignment-get.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Read the properties and relationships of a [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[Update mobileAppAssignment](../api/mobileappassignment-update.md)|[mobileAppAssignment](../resources/mobileappassignment.md)|Update the properties of a [mobileAppAssignment](../resources/mobileappassignment.md) object.|
|[Delete mobileAppAssignment](../api/mobileappassignment-delete.md)|None|Deletes a [mobileAppAssignment](../resources/mobileappassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|Key of the entity.|
|intent|installIntent|The install intent defined by the admin. Possible values are: `available`, `required`, `uninstall`, `availableWithoutEnrollment`.|
|settings|[mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md)|The settings for target assignment defined by the admin.|
|source|deviceAndAppManagementAssignmentSource|The resource type which is the source for the assignment. Possible values are: `direct`, `policySets`.|
|sourceId|String|The identifier of the source of the assignment.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The target group assignment defined by the admin.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppAssignment",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppAssignment",
  "id": "String (identifier)",
  "intent": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  },
  "settings": {
    "@odata.type": "microsoft.graph.mobileAppAssignmentSettings"
  },
  "source": "String",
  "sourceId": "String"
}
```

