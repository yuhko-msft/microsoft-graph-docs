---
title: "yammerGroupsActivityCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yammerGroupsActivityCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yammerGroupsActivityCounts](../api/yammergroupsactivitycounts-list.md)|[yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) collection|Get a list of the [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) objects and their properties.|
|[Create yammerGroupsActivityCounts](../api/yammergroupsactivitycounts-create.md)|[yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md)|Create a new [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) object.|
|[Get yammerGroupsActivityCounts](../api/yammergroupsactivitycounts-get.md)|[yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md)|Read the properties and relationships of a [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) object.|
|[Update yammerGroupsActivityCounts](../api/yammergroupsactivitycounts-update.md)|[yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md)|Update the properties of a [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) object.|
|[Delete yammerGroupsActivityCounts](../api/yammergroupsactivitycounts-delete.md)|None|Deletes a [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|liked|Int64|**TODO: Add Description**|
|posted|Int64|**TODO: Add Description**|
|read|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.yammerGroupsActivityCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.yammerGroupsActivityCounts",
  "id": "String (identifier)",
  "liked": "Integer",
  "posted": "Integer",
  "read": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```

