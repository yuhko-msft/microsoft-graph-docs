---
title: "emailAppUsageVersionsUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailAppUsageVersionsUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailAppUsageVersionsUserCounts](../api/emailappusageversionsusercounts-list.md)|[emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) collection|Get a list of the [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) objects and their properties.|
|[Create emailAppUsageVersionsUserCounts](../api/emailappusageversionsusercounts-create.md)|[emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md)|Create a new [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) object.|
|[Get emailAppUsageVersionsUserCounts](../api/emailappusageversionsusercounts-get.md)|[emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md)|Read the properties and relationships of an [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) object.|
|[Update emailAppUsageVersionsUserCounts](../api/emailappusageversionsusercounts-update.md)|[emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md)|Update the properties of an [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) object.|
|[Delete emailAppUsageVersionsUserCounts](../api/emailappusageversionsusercounts-delete.md)|None|Deletes an [emailAppUsageVersionsUserCounts](../resources/emailappusageversionsusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|outlook2007|Int64|**TODO: Add Description**|
|outlook2010|Int64|**TODO: Add Description**|
|outlook2013|Int64|**TODO: Add Description**|
|outlook2016|Int64|**TODO: Add Description**|
|outlook2019|Int64|**TODO: Add Description**|
|outlookM365|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|undetermined|Int64|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailAppUsageVersionsUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailAppUsageVersionsUserCounts",
  "id": "String (identifier)",
  "outlook2007": "Integer",
  "outlook2010": "Integer",
  "outlook2013": "Integer",
  "outlook2016": "Integer",
  "outlook2019": "Integer",
  "outlookM365": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "undetermined": "Integer"
}
```

