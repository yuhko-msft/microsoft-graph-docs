---
title: "skypeForBusinessActivityCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessActivityCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessActivityCounts](../api/skypeforbusinessactivitycounts-list.md)|[skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md) collection|Get a list of the [skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md) objects and their properties.|
|[Create skypeForBusinessActivityCounts](../api/skypeforbusinessactivitycounts-create.md)|[skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md)|Create a new [skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md) object.|
|[Get skypeForBusinessActivityCounts](../api/skypeforbusinessactivitycounts-get.md)|[skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md)|Read the properties and relationships of a [skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md) object.|
|[Update skypeForBusinessActivityCounts](../api/skypeforbusinessactivitycounts-update.md)|[skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md)|Update the properties of a [skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md) object.|
|[Delete skypeForBusinessActivityCounts](../api/skypeforbusinessactivitycounts-delete.md)|None|Deletes a [skypeForBusinessActivityCounts](../resources/skypeforbusinessactivitycounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|organized|Int64|**TODO: Add Description**|
|participated|Int64|**TODO: Add Description**|
|peerToPeer|Int64|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.skypeForBusinessActivityCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessActivityCounts",
  "id": "String (identifier)",
  "organized": "Integer",
  "participated": "Integer",
  "peerToPeer": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```

