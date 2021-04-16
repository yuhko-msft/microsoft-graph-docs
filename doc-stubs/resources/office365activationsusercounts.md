---
title: "office365ActivationsUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365ActivationsUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365ActivationsUserCounts](../api/office365activationsusercounts-list.md)|[office365ActivationsUserCounts](../resources/office365activationsusercounts.md) collection|Get a list of the [office365ActivationsUserCounts](../resources/office365activationsusercounts.md) objects and their properties.|
|[Create office365ActivationsUserCounts](../api/office365activationsusercounts-create.md)|[office365ActivationsUserCounts](../resources/office365activationsusercounts.md)|Create a new [office365ActivationsUserCounts](../resources/office365activationsusercounts.md) object.|
|[Get office365ActivationsUserCounts](../api/office365activationsusercounts-get.md)|[office365ActivationsUserCounts](../resources/office365activationsusercounts.md)|Read the properties and relationships of an [office365ActivationsUserCounts](../resources/office365activationsusercounts.md) object.|
|[Update office365ActivationsUserCounts](../api/office365activationsusercounts-update.md)|[office365ActivationsUserCounts](../resources/office365activationsusercounts.md)|Update the properties of an [office365ActivationsUserCounts](../resources/office365activationsusercounts.md) object.|
|[Delete office365ActivationsUserCounts](../api/office365activationsusercounts-delete.md)|None|Deletes an [office365ActivationsUserCounts](../resources/office365activationsusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activated|Int64|**TODO: Add Description**|
|assigned|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|productType|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharedComputerActivation|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365ActivationsUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365ActivationsUserCounts",
  "id": "String (identifier)",
  "activated": "Integer",
  "assigned": "Integer",
  "productType": "String",
  "reportRefreshDate": "Date",
  "sharedComputerActivation": "Integer"
}
```

