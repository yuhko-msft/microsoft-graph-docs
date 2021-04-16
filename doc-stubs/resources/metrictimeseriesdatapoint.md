---
title: "metricTimeSeriesDataPoint resource type"
description: "Metric Time series data point"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# metricTimeSeriesDataPoint resource type

Namespace: microsoft.graph



Metric Time series data point

## Properties
|Property|Type|Description|
|:---|:---|:---|
|dateTime|DateTimeOffset|Time of the metric time series data point|
|value|Int64|Value of the metric time series data point|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.metricTimeSeriesDataPoint"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.metricTimeSeriesDataPoint",
  "dateTime": "String (timestamp)",
  "value": "Integer"
}
```

