---
title: "iosVppEBookAssignment resource type"
description: "Contains properties used to assign an iOS VPP EBook to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosVppEBookAssignment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties used to assign an iOS VPP EBook to a group.


Inherits from [managedEBookAssignment](../resources/managedebookassignment.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosVppEBookAssignments](../api/iosvppebookassignment-list.md)|[iosVppEBookAssignment](../resources/iosvppebookassignment.md) collection|Get a list of the [iosVppEBookAssignment](../resources/iosvppebookassignment.md) objects and their properties.|
|[Create iosVppEBookAssignment](../api/iosvppebookassignment-create.md)|[iosVppEBookAssignment](../resources/iosvppebookassignment.md)|Create a new [iosVppEBookAssignment](../resources/iosvppebookassignment.md) object.|
|[Get iosVppEBookAssignment](../api/iosvppebookassignment-get.md)|[iosVppEBookAssignment](../resources/iosvppebookassignment.md)|Read the properties and relationships of an [iosVppEBookAssignment](../resources/iosvppebookassignment.md) object.|
|[Update iosVppEBookAssignment](../api/iosvppebookassignment-update.md)|[iosVppEBookAssignment](../resources/iosvppebookassignment.md)|Update the properties of an [iosVppEBookAssignment](../resources/iosvppebookassignment.md) object.|
|[Delete iosVppEBookAssignment](../api/iosvppebookassignment-delete.md)|None|Deletes an [iosVppEBookAssignment](../resources/iosvppebookassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|installIntent|installIntent|The install intent for eBook. Inherited from [managedEBookAssignment](../resources/managedebookassignment.md). Possible values are: `available`, `required`, `uninstall`, `availableWithoutEnrollment`.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for eBook. Inherited from [managedEBookAssignment](../resources/managedebookassignment.md).|

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
  "installIntent": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

