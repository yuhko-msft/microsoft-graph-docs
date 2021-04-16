---
title: "siteUsageStorage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# siteUsageStorage resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List siteUsageStorages](../api/siteusagestorage-list.md)|[siteUsageStorage](../resources/siteusagestorage.md) collection|Get a list of the [siteUsageStorage](../resources/siteusagestorage.md) objects and their properties.|
|[Create siteUsageStorage](../api/siteusagestorage-create.md)|[siteUsageStorage](../resources/siteusagestorage.md)|Create a new [siteUsageStorage](../resources/siteusagestorage.md) object.|
|[Get siteUsageStorage](../api/siteusagestorage-get.md)|[siteUsageStorage](../resources/siteusagestorage.md)|Read the properties and relationships of a [siteUsageStorage](../resources/siteusagestorage.md) object.|
|[Update siteUsageStorage](../api/siteusagestorage-update.md)|[siteUsageStorage](../resources/siteusagestorage.md)|Update the properties of a [siteUsageStorage](../resources/siteusagestorage.md) object.|
|[Delete siteUsageStorage](../api/siteusagestorage-delete.md)|None|Deletes a [siteUsageStorage](../resources/siteusagestorage.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|siteType|String|**TODO: Add Description**|
|storageUsedInBytes|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.siteUsageStorage",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.siteUsageStorage",
  "id": "String (identifier)",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "storageUsedInBytes": "Integer"
}
```

