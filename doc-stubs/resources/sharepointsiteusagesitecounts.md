---
title: "sharePointSiteUsageSiteCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharePointSiteUsageSiteCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharePointSiteUsageSiteCounts](../api/sharepointsiteusagesitecounts-list.md)|[sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md) collection|Get a list of the [sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md) objects and their properties.|
|[Create sharePointSiteUsageSiteCounts](../api/sharepointsiteusagesitecounts-create.md)|[sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md)|Create a new [sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md) object.|
|[Get sharePointSiteUsageSiteCounts](../api/sharepointsiteusagesitecounts-get.md)|[sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md)|Read the properties and relationships of a [sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md) object.|
|[Update sharePointSiteUsageSiteCounts](../api/sharepointsiteusagesitecounts-update.md)|[sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md)|Update the properties of a [sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md) object.|
|[Delete sharePointSiteUsageSiteCounts](../api/sharepointsiteusagesitecounts-delete.md)|None|Deletes a [sharePointSiteUsageSiteCounts](../resources/sharepointsiteusagesitecounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|active|Int64|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteType|String|**TODO: Add Description**|
|total|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharePointSiteUsageSiteCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharePointSiteUsageSiteCounts",
  "id": "String (identifier)",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "total": "Integer"
}
```

