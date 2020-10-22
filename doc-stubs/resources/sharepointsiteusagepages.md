---
title: "sharePointSiteUsagePages resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharePointSiteUsagePages resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharePointSiteUsagePages](../api/sharepointsiteusagepages-list.md)|[sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md) collection|Get a list of the [sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md) objects and their properties.|
|[Create sharePointSiteUsagePages](../api/sharepointsiteusagepages-create.md)|[sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md)|Create a new [sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md) object.|
|[Get sharePointSiteUsagePages](../api/sharepointsiteusagepages-get.md)|[sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md)|Read the properties and relationships of a [sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md) object.|
|[Update sharePointSiteUsagePages](../api/sharepointsiteusagepages-update.md)|[sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md)|Update the properties of a [sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md) object.|
|[Delete sharePointSiteUsagePages](../api/sharepointsiteusagepages-delete.md)|None|Deletes a [sharePointSiteUsagePages](../resources/sharepointsiteusagepages.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|pageViewCount|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteType|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharePointSiteUsagePages",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharePointSiteUsagePages",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "pageViewCount": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```

