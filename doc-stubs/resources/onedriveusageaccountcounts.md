---
title: "oneDriveUsageAccountCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# oneDriveUsageAccountCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List oneDriveUsageAccountCounts](../api/onedriveusageaccountcounts-list.md)|[oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md) collection|Get a list of the [oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md) objects and their properties.|
|[Create oneDriveUsageAccountCounts](../api/onedriveusageaccountcounts-create.md)|[oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md)|Create a new [oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md) object.|
|[Get oneDriveUsageAccountCounts](../api/onedriveusageaccountcounts-get.md)|[oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md)|Read the properties and relationships of an [oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md) object.|
|[Update oneDriveUsageAccountCounts](../api/onedriveusageaccountcounts-update.md)|[oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md)|Update the properties of an [oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md) object.|
|[Delete oneDriveUsageAccountCounts](../api/onedriveusageaccountcounts-delete.md)|None|Deletes an [oneDriveUsageAccountCounts](../resources/onedriveusageaccountcounts.md) object.|

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
  "@odata.type": "microsoft.graph.oneDriveUsageAccountCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.oneDriveUsageAccountCounts",
  "id": "String (identifier)",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "total": "Integer"
}
```

