---
title: "sharePointActivityPages resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharePointActivityPages resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharePointActivityPages](../api/sharepointactivitypages-list.md)|[sharePointActivityPages](../resources/sharepointactivitypages.md) collection|Get a list of the [sharePointActivityPages](../resources/sharepointactivitypages.md) objects and their properties.|
|[Create sharePointActivityPages](../api/sharepointactivitypages-create.md)|[sharePointActivityPages](../resources/sharepointactivitypages.md)|Create a new [sharePointActivityPages](../resources/sharepointactivitypages.md) object.|
|[Get sharePointActivityPages](../api/sharepointactivitypages-get.md)|[sharePointActivityPages](../resources/sharepointactivitypages.md)|Read the properties and relationships of a [sharePointActivityPages](../resources/sharepointactivitypages.md) object.|
|[Update sharePointActivityPages](../api/sharepointactivitypages-update.md)|[sharePointActivityPages](../resources/sharepointactivitypages.md)|Update the properties of a [sharePointActivityPages](../resources/sharepointactivitypages.md) object.|
|[Delete sharePointActivityPages](../api/sharepointactivitypages-delete.md)|None|Deletes a [sharePointActivityPages](../resources/sharepointactivitypages.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|visitedPageCount|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharePointActivityPages",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharePointActivityPages",
  "id": "String (identifier)",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "visitedPageCount": "Integer"
}
```

