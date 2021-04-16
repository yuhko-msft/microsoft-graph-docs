---
title: "sharePointActivityUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharePointActivityUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharePointActivityUserCounts](../api/sharepointactivityusercounts-list.md)|[sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) collection|Get a list of the [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) objects and their properties.|
|[Create sharePointActivityUserCounts](../api/sharepointactivityusercounts-create.md)|[sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md)|Create a new [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object.|
|[Get sharePointActivityUserCounts](../api/sharepointactivityusercounts-get.md)|[sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md)|Read the properties and relationships of a [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object.|
|[Update sharePointActivityUserCounts](../api/sharepointactivityusercounts-update.md)|[sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md)|Update the properties of a [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object.|
|[Delete sharePointActivityUserCounts](../api/sharepointactivityusercounts-delete.md)|None|Deletes a [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharedExternally|Int64|**TODO: Add Description**|
|sharedInternally|Int64|**TODO: Add Description**|
|synced|Int64|**TODO: Add Description**|
|viewedOrEdited|Int64|**TODO: Add Description**|
|visitedPage|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharePointActivityUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharePointActivityUserCounts",
  "id": "String (identifier)",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternally": "Integer",
  "sharedInternally": "Integer",
  "synced": "Integer",
  "viewedOrEdited": "Integer",
  "visitedPage": "Integer"
}
```

