---
title: "plannerTask resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# plannerTask resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [plannerDelta](../resources/plannerdelta.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List plannerTasks](../api/plannertask-list.md)|[plannerTask](../resources/plannertask.md) collection|Get a list of the [plannerTask](../resources/plannertask.md) objects and their properties.|
|[Create plannerTask](../api/plannertask-create.md)|[plannerTask](../resources/plannertask.md)|Create a new [plannerTask](../resources/plannertask.md) object.|
|[Get plannerTask](../api/plannertask-get.md)|[plannerTask](../resources/plannertask.md)|Read the properties and relationships of a [plannerTask](../resources/plannertask.md) object.|
|[Update plannerTask](../api/plannertask-update.md)|[plannerTask](../resources/plannertask.md)|Update the properties of a [plannerTask](../resources/plannertask.md) object.|
|[Delete plannerTask](../api/plannertask-delete.md)|None|Deletes a [plannerTask](../resources/plannertask.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeChecklistItemCount|Int32|**TODO: Add Description**|
|appliedCategories|[plannerAppliedCategories](../resources/plannerappliedcategories.md)|**TODO: Add Description**|
|assigneePriority|String|**TODO: Add Description**|
|assignments|[plannerAssignments](../resources/plannerassignments.md)|**TODO: Add Description**|
|bucketId|String|**TODO: Add Description**|
|checklistItemCount|Int32|**TODO: Add Description**|
|completedBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|completedDateTime|DateTimeOffset|**TODO: Add Description**|
|conversationThreadId|String|**TODO: Add Description**|
|createdBy|[identitySet](../resources/identityset.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|creationSource|[plannerTaskCreation](../resources/plannertaskcreation.md)|**TODO: Add Description**|
|dueDateTime|DateTimeOffset|**TODO: Add Description**|
|hasDescription|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|orderHint|String|**TODO: Add Description**|
|percentComplete|Int32|**TODO: Add Description**|
|planId|String|**TODO: Add Description**|
|previewType|plannerPreviewType|**TODO: Add Description**. Possible values are: `automatic`, `noPreview`, `checklist`, `description`, `reference`.|
|priority|Int32|**TODO: Add Description**|
|referenceCount|Int32|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|title|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignedToTaskBoardFormat|[plannerAssignedToTaskBoardTaskFormat](../resources/plannerassignedtotaskboardtaskformat.md)|**TODO: Add Description**|
|bucketTaskBoardFormat|[plannerBucketTaskBoardTaskFormat](../resources/plannerbuckettaskboardtaskformat.md)|**TODO: Add Description**|
|details|[plannerTaskDetails](../resources/plannertaskdetails.md)|**TODO: Add Description**|
|progressTaskBoardFormat|[plannerProgressTaskBoardTaskFormat](../resources/plannerprogresstaskboardtaskformat.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.plannerTask",
  "baseType": "microsoft.graph.plannerDelta",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.plannerTask",
  "id": "String (identifier)",
  "activeChecklistItemCount": "Integer",
  "appliedCategories": {
    "@odata.type": "microsoft.graph.plannerAppliedCategories"
  },
  "assigneePriority": "String",
  "assignments": {
    "@odata.type": "microsoft.graph.plannerAssignments"
  },
  "bucketId": "String",
  "checklistItemCount": "Integer",
  "completedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "completedDateTime": "String (timestamp)",
  "conversationThreadId": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "creationSource": {
    "@odata.type": "microsoft.graph.plannerTaskCreation"
  },
  "dueDateTime": "String (timestamp)",
  "hasDescription": "Boolean",
  "orderHint": "String",
  "percentComplete": "Integer",
  "planId": "String",
  "previewType": "String",
  "priority": "Integer",
  "referenceCount": "Integer",
  "startDateTime": "String (timestamp)",
  "title": "String"
}
```

