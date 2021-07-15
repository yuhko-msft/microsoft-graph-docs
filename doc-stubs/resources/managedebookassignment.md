---
title: "managedEBookAssignment resource type"
description: "Contains properties used to assign a eBook to a group."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedEBookAssignment resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties used to assign a eBook to a group.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedEBookAssignments](../api/managedebookassignment-list.md)|[managedEBookAssignment](../resources/managedebookassignment.md) collection|Get a list of the [managedEBookAssignment](../resources/managedebookassignment.md) objects and their properties.|
|[Create managedEBookAssignment](../api/managedebookassignment-create.md)|[managedEBookAssignment](../resources/managedebookassignment.md)|Create a new [managedEBookAssignment](../resources/managedebookassignment.md) object.|
|[Get managedEBookAssignment](../api/managedebookassignment-get.md)|[managedEBookAssignment](../resources/managedebookassignment.md)|Read the properties and relationships of a [managedEBookAssignment](../resources/managedebookassignment.md) object.|
|[Update managedEBookAssignment](../api/managedebookassignment-update.md)|[managedEBookAssignment](../resources/managedebookassignment.md)|Update the properties of a [managedEBookAssignment](../resources/managedebookassignment.md) object.|
|[Delete managedEBookAssignment](../api/managedebookassignment-delete.md)|None|Deletes a [managedEBookAssignment](../resources/managedebookassignment.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|installIntent|installIntent|The install intent for eBook. Possible values are: `available`, `required`, `uninstall`, `availableWithoutEnrollment`.|
|target|[deviceAndAppManagementAssignmentTarget](../resources/deviceandappmanagementassignmenttarget.md)|The assignment target for eBook.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedEBookAssignment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedEBookAssignment",
  "id": "String (identifier)",
  "installIntent": "String",
  "target": {
    "@odata.type": "microsoft.graph.deviceAndAppManagementAssignmentTarget"
  }
}
```

