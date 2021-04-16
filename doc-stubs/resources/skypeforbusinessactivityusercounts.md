---
title: "skypeForBusinessActivityUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessActivityUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessActivityUserCounts](../api/skypeforbusinessactivityusercounts-list.md)|[skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) collection|Get a list of the [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) objects and their properties.|
|[Create skypeForBusinessActivityUserCounts](../api/skypeforbusinessactivityusercounts-create.md)|[skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md)|Create a new [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) object.|
|[Get skypeForBusinessActivityUserCounts](../api/skypeforbusinessactivityusercounts-get.md)|[skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md)|Read the properties and relationships of a [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) object.|
|[Update skypeForBusinessActivityUserCounts](../api/skypeforbusinessactivityusercounts-update.md)|[skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md)|Update the properties of a [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) object.|
|[Delete skypeForBusinessActivityUserCounts](../api/skypeforbusinessactivityusercounts-delete.md)|None|Deletes a [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) object.|

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
  "@odata.type": "microsoft.graph.skypeForBusinessActivityUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessActivityUserCounts",
  "id": "String (identifier)",
  "organized": "Integer",
  "participated": "Integer",
  "peerToPeer": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```

