---
title: "sharePointSiteUsageFileCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharePointSiteUsageFileCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharePointSiteUsageFileCounts](../api/sharepointsiteusagefilecounts-list.md)|[sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md) collection|Get a list of the [sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md) objects and their properties.|
|[Create sharePointSiteUsageFileCounts](../api/sharepointsiteusagefilecounts-create.md)|[sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md)|Create a new [sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md) object.|
|[Get sharePointSiteUsageFileCounts](../api/sharepointsiteusagefilecounts-get.md)|[sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md)|Read the properties and relationships of a [sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md) object.|
|[Update sharePointSiteUsageFileCounts](../api/sharepointsiteusagefilecounts-update.md)|[sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md)|Update the properties of a [sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md) object.|
|[Delete sharePointSiteUsageFileCounts](../api/sharepointsiteusagefilecounts-delete.md)|None|Deletes a [sharePointSiteUsageFileCounts](../resources/sharepointsiteusagefilecounts.md) object.|

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
  "@odata.type": "microsoft.graph.sharePointSiteUsageFileCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharePointSiteUsageFileCounts",
  "id": "String (identifier)",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "total": "Integer"
}
```

