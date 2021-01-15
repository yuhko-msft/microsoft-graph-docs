---
title: "educationClass resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# educationClass resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List educationClasses](../api/educationclass-list.md)|[educationClass](../resources/educationclass.md) collection|Get a list of the [educationClass](../resources/educationclass.md) objects and their properties.|
|[Create educationClass](../api/educationclass-create.md)|[educationClass](../resources/educationclass.md)|Create a new [educationClass](../resources/educationclass.md) object.|
|[Get educationClass](../api/educationclass-get.md)|[educationClass](../resources/educationclass.md)|Read the properties and relationships of an [educationClass](../resources/educationclass.md) object.|
|[Update educationClass](../api/educationclass-update.md)|[educationClass](../resources/educationclass.md)|Update the properties of an [educationClass](../resources/educationclass.md) object.|
|[Delete educationClass](../api/educationclass-delete.md)|None|Deletes an [educationClass](../resources/educationclass.md) object.|
|[List educationAssignmentSettings](../api/educationclass-list-assignmentsettings.md)|[educationAssignmentSettings](../resources/educationassignmentsettings.md) collection|Get the educationAssignmentSettings resources from the assignmentSettings navigation property.|
|[Create educationAssignmentSettings](../api/educationclass-post-assignmentsettings.md)|[educationAssignmentSettings](../resources/educationassignmentsettings.md)|Create a new educationAssignmentSettings object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignmentCategories|[educationCategory](../resources/educationcategory.md) collection|**TODO: Add Description**|
|assignments|[educationAssignment](../resources/educationassignment.md) collection|**TODO: Add Description**|
|assignmentSettings|[educationAssignmentSettings](../resources/educationassignmentsettings.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.educationClass",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.educationClass"
}
```

