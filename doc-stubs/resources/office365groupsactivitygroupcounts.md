---
title: "office365GroupsActivityGroupCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# office365GroupsActivityGroupCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List office365GroupsActivityGroupCounts](../api/office365groupsactivitygroupcounts-list.md)|[office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) collection|Get a list of the [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) objects and their properties.|
|[Create office365GroupsActivityGroupCounts](../api/office365groupsactivitygroupcounts-create.md)|[office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md)|Create a new [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) object.|
|[Get office365GroupsActivityGroupCounts](../api/office365groupsactivitygroupcounts-get.md)|[office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md)|Read the properties and relationships of an [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) object.|
|[Update office365GroupsActivityGroupCounts](../api/office365groupsactivitygroupcounts-update.md)|[office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md)|Update the properties of an [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) object.|
|[Delete office365GroupsActivityGroupCounts](../api/office365groupsactivitygroupcounts-delete.md)|None|Deletes an [office365GroupsActivityGroupCounts](../resources/office365groupsactivitygroupcounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|active|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|total|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.office365GroupsActivityGroupCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.office365GroupsActivityGroupCounts",
  "id": "String (identifier)",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "total": "Integer"
}
```

