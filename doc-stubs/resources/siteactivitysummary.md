---
title: "siteActivitySummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# siteActivitySummary resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List siteActivitySummaries](../api/siteactivitysummary-list.md)|[siteActivitySummary](../resources/siteactivitysummary.md) collection|Get a list of the [siteActivitySummary](../resources/siteactivitysummary.md) objects and their properties.|
|[Create siteActivitySummary](../api/siteactivitysummary-create.md)|[siteActivitySummary](../resources/siteactivitysummary.md)|Create a new [siteActivitySummary](../resources/siteactivitysummary.md) object.|
|[Get siteActivitySummary](../api/siteactivitysummary-get.md)|[siteActivitySummary](../resources/siteactivitysummary.md)|Read the properties and relationships of a [siteActivitySummary](../resources/siteactivitysummary.md) object.|
|[Update siteActivitySummary](../api/siteactivitysummary-update.md)|[siteActivitySummary](../resources/siteactivitysummary.md)|Update the properties of a [siteActivitySummary](../resources/siteactivitysummary.md) object.|
|[Delete siteActivitySummary](../api/siteactivitysummary-delete.md)|None|Deletes a [siteActivitySummary](../resources/siteactivitysummary.md) object.|

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

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.siteActivitySummary",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.siteActivitySummary",
  "id": "String (identifier)",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternally": "Integer",
  "sharedInternally": "Integer",
  "synced": "Integer",
  "viewedOrEdited": "Integer"
}
```

