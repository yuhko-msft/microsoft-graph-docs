---
title: "oneDriveUsageFileCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# oneDriveUsageFileCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List oneDriveUsageFileCounts](../api/onedriveusagefilecounts-list.md)|[oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) collection|Get a list of the [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) objects and their properties.|
|[Create oneDriveUsageFileCounts](../api/onedriveusagefilecounts-create.md)|[oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md)|Create a new [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object.|
|[Get oneDriveUsageFileCounts](../api/onedriveusagefilecounts-get.md)|[oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md)|Read the properties and relationships of an [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object.|
|[Update oneDriveUsageFileCounts](../api/onedriveusagefilecounts-update.md)|[oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md)|Update the properties of an [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object.|
|[Delete oneDriveUsageFileCounts](../api/onedriveusagefilecounts-delete.md)|None|Deletes an [oneDriveUsageFileCounts](../resources/onedriveusagefilecounts.md) object.|

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
  "@odata.type": "microsoft.graph.oneDriveUsageFileCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.oneDriveUsageFileCounts",
  "id": "String (identifier)",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "siteType": "String",
  "total": "Integer"
}
```

