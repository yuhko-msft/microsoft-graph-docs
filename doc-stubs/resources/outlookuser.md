---
title: "outlookUser resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# outlookUser resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List outlookUsers](../api/outlookuser-list.md)|[outlookUser](../resources/outlookuser.md) collection|Get a list of the [outlookUser](../resources/outlookuser.md) objects and their properties.|
|[Create outlookUser](../api/outlookuser-create.md)|[outlookUser](../resources/outlookuser.md)|Create a new [outlookUser](../resources/outlookuser.md) object.|
|[Get outlookUser](../api/outlookuser-get.md)|[outlookUser](../resources/outlookuser.md)|Read the properties and relationships of an [outlookUser](../resources/outlookuser.md) object.|
|[Update outlookUser](../api/outlookuser-update.md)|[outlookUser](../resources/outlookuser.md)|Update the properties of an [outlookUser](../resources/outlookuser.md) object.|
|[Delete outlookUser](../api/outlookuser-delete.md)|None|Deletes an [outlookUser](../resources/outlookuser.md) object.|
|[List taskFolders](../api/outlookuser-list-taskfolders.md)|[outlookTaskFolder](../resources/outlooktaskfolder.md) collection|Get the outlookTaskFolder resources from the taskFolders navigation property.|
|[Create outlookTaskFolder](../api/outlookuser-post-taskfolders.md)|[outlookTaskFolder](../resources/outlooktaskfolder.md)|Create a new outlookTaskFolder object.|
|[List taskGroups](../api/outlookuser-list-taskgroups.md)|[outlookTaskGroup](../resources/outlooktaskgroup.md) collection|Get the outlookTaskGroup resources from the taskGroups navigation property.|
|[Create outlookTaskGroup](../api/outlookuser-post-taskgroups.md)|[outlookTaskGroup](../resources/outlooktaskgroup.md)|Create a new outlookTaskGroup object.|
|[List tasks](../api/outlookuser-list-tasks.md)|[outlookTask](../resources/outlooktask.md) collection|Get the outlookTask resources from the tasks navigation property.|
|[Create outlookTask](../api/outlookuser-post-tasks.md)|[outlookTask](../resources/outlooktask.md)|Create a new outlookTask object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|masterCategories|[outlookCategory](../resources/outlookcategory.md) collection|**TODO: Add Description**|
|taskFolders|[outlookTaskFolder](../resources/outlooktaskfolder.md) collection|**TODO: Add Description**|
|taskGroups|[outlookTaskGroup](../resources/outlooktaskgroup.md) collection|**TODO: Add Description**|
|tasks|[outlookTask](../resources/outlooktask.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.outlookUser",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.outlookUser",
  "id": "String (identifier)"
}
```

