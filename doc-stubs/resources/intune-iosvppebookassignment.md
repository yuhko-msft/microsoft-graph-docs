---
title: "iosVppEBookAssignment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppEBookAssignment resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [managedEBookAssignment](../resources/managedebookassignment.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVppEBookAssignments](../api/intune-iosvppebookassignment-list.md)|[iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md) collection|Get a list of the [iosVppEBookAssignment](../resources/iosvppebookassignment.md) objects and their properties.|
|[Create iosVppEBookAssignment](../api/intune-iosvppebookassignment-create.md)|[iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md)|Create a new [iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md) object.|
|[Get iosVppEBookAssignment](../api/intune-iosvppebookassignment-get.md)|[iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md)|Read the properties and relationships of an [iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md) object.|
|[Update iosVppEBookAssignment](../api/intune-iosvppebookassignment-update.md)|[iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md)|Update the properties of an [iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md) object.|
|[Delete iosVppEBookAssignment](../api/intune-iosvppebookassignment-delete.md)|None|Deletes an [iosVppEBookAssignment](../resources/intune-iosvppebookassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|installIntent|installIntent|**TODO: Add Description** Inherited from [managedEBookAssignment](../resources/intune-managedebookassignment.md). Possible values are: `available`, `required`, `uninstall`, `availableWithoutEnrollment`.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/intune-deviceandappmanagementassignmenttarget.md)|**TODO: Add Description** Inherited from [managedEBookAssignment](../resources/intune-managedebookassignment.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosVppEBookAssignment",
  "baseType": "microsoft.graph.managedEBookAssignment",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosVppEBookAssignment",
  "id": "String (identifier)",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  },
  "installIntent": "String"
}
```

