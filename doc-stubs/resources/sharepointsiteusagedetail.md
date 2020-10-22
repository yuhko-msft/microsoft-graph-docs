---
title: "sharePointSiteUsageDetail resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharePointSiteUsageDetail resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharePointSiteUsageDetails](../api/sharepointsiteusagedetail-list.md)|[sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) collection|Get a list of the [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) objects and their properties.|
|[Create sharePointSiteUsageDetail](../api/sharepointsiteusagedetail-create.md)|[sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md)|Create a new [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object.|
|[Get sharePointSiteUsageDetail](../api/sharepointsiteusagedetail-get.md)|[sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md)|Read the properties and relationships of a [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object.|
|[Update sharePointSiteUsageDetail](../api/sharepointsiteusagedetail-update.md)|[sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md)|Update the properties of a [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object.|
|[Delete sharePointSiteUsageDetail](../api/sharepointsiteusagedetail-delete.md)|None|Deletes a [sharePointSiteUsageDetail](../resources/sharepointsiteusagedetail.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeFileCount|Int64|**TODO: Add Description**|
|fileCount|Int64|**TODO: Add Description**|
|isDeleted|Boolean|**TODO: Add Description**|
|lastActivityDate|Date|**TODO: Add Description**|
|ownerDisplayName|String|**TODO: Add Description**|
|ownerPrincipalName|String|**TODO: Add Description**|
|pageViewCount|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|rootWebTemplate|String|**TODO: Add Description**|
|siteId|Guid|**TODO: Add Description**|
|siteUrl|String|**TODO: Add Description**|
|storageAllocatedInBytes|Int64|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|
|visitedPageCount|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharePointSiteUsageDetail",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharePointSiteUsageDetail",
  "reportRefreshDate": "Date",
  "siteId": "Guid",
  "siteUrl": "String",
  "ownerDisplayName": "String",
  "ownerPrincipalName": "String",
  "isDeleted": "Boolean",
  "lastActivityDate": "Date",
  "fileCount": "Integer",
  "activeFileCount": "Integer",
  "pageViewCount": "Integer",
  "visitedPageCount": "Integer",
  "storageUsedInBytes": "Integer",
  "storageAllocatedInBytes": "Integer",
  "rootWebTemplate": "String",
  "reportPeriod": "String"
}
```

