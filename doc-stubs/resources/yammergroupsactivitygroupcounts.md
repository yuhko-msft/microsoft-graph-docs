---
title: "yammerGroupsActivityGroupCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yammerGroupsActivityGroupCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yammerGroupsActivityGroupCounts](../api/yammergroupsactivitygroupcounts-list.md)|[yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) collection|Get a list of the [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) objects and their properties.|
|[Create yammerGroupsActivityGroupCounts](../api/yammergroupsactivitygroupcounts-create.md)|[yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md)|Create a new [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) object.|
|[Get yammerGroupsActivityGroupCounts](../api/yammergroupsactivitygroupcounts-get.md)|[yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md)|Read the properties and relationships of a [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) object.|
|[Update yammerGroupsActivityGroupCounts](../api/yammergroupsactivitygroupcounts-update.md)|[yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md)|Update the properties of a [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) object.|
|[Delete yammerGroupsActivityGroupCounts](../api/yammergroupsactivitygroupcounts-delete.md)|None|Deletes a [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) object.|

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
  "@odata.type": "microsoft.graph.yammerGroupsActivityGroupCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.yammerGroupsActivityGroupCounts",
  "id": "String (identifier)",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "total": "Integer"
}
```

