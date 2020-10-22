---
title: "yammerActivitySummary resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yammerActivitySummary resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yammerActivitySummaries](../api/yammeractivitysummary-list.md)|[yammerActivitySummary](../resources/yammeractivitysummary.md) collection|Get a list of the [yammerActivitySummary](../resources/yammeractivitysummary.md) objects and their properties.|
|[Create yammerActivitySummary](../api/yammeractivitysummary-create.md)|[yammerActivitySummary](../resources/yammeractivitysummary.md)|Create a new [yammerActivitySummary](../resources/yammeractivitysummary.md) object.|
|[Get yammerActivitySummary](../api/yammeractivitysummary-get.md)|[yammerActivitySummary](../resources/yammeractivitysummary.md)|Read the properties and relationships of a [yammerActivitySummary](../resources/yammeractivitysummary.md) object.|
|[Update yammerActivitySummary](../api/yammeractivitysummary-update.md)|[yammerActivitySummary](../resources/yammeractivitysummary.md)|Update the properties of a [yammerActivitySummary](../resources/yammeractivitysummary.md) object.|
|[Delete yammerActivitySummary](../api/yammeractivitysummary-delete.md)|None|Deletes a [yammerActivitySummary](../resources/yammeractivitysummary.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|liked|Int64|**TODO: Add Description**|
|posted|Int64|**TODO: Add Description**|
|read|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.yammerActivitySummary",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.yammerActivitySummary",
  "reportRefreshDate": "Date",
  "liked": "Integer",
  "posted": "Integer",
  "read": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String"
}
```

