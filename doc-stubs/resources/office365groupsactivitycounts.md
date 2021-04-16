---
title: "office365GroupsActivityCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365GroupsActivityCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365GroupsActivityCounts](../api/office365groupsactivitycounts-list.md)|[office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) collection|Get a list of the [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) objects and their properties.|
|[Create office365GroupsActivityCounts](../api/office365groupsactivitycounts-create.md)|[office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md)|Create a new [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) object.|
|[Get office365GroupsActivityCounts](../api/office365groupsactivitycounts-get.md)|[office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md)|Read the properties and relationships of an [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) object.|
|[Update office365GroupsActivityCounts](../api/office365groupsactivitycounts-update.md)|[office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md)|Update the properties of an [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) object.|
|[Delete office365GroupsActivityCounts](../api/office365groupsactivitycounts-delete.md)|None|Deletes an [office365GroupsActivityCounts](../resources/office365groupsactivitycounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|exchangeEmailsReceived|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|yammerMessagesLiked|Int64|**TODO: Add Description**|
|yammerMessagesPosted|Int64|**TODO: Add Description**|
|yammerMessagesRead|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365GroupsActivityCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365GroupsActivityCounts",
  "id": "String (identifier)",
  "exchangeEmailsReceived": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "yammerMessagesLiked": "Integer",
  "yammerMessagesPosted": "Integer",
  "yammerMessagesRead": "Integer"
}
```

