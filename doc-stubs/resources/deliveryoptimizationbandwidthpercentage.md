---
title: "deliveryOptimizationBandwidthPercentage resource type"
description: "Bandwidth limits specified as a percentage."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deliveryOptimizationBandwidthPercentage resource type

Namespace: microsoft.graph



Bandwidth limits specified as a percentage.


Inherits from [deliveryOptimizationBandwidth](../resources/deliveryoptimizationbandwidth.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|maximumBackgroundBandwidthPercentage|Int32|Specifies the maximum background download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
The default value 0 (zero) means that Delivery Optimization dynamically adjusts to use the available bandwidth for background downloads. Valid values 0 to 100|
|maximumForegroundBandwidthPercentage|Int32|Specifies the maximum foreground download bandwidth that Delivery Optimization uses across all concurrent download activities as a percentage of available download bandwidth (0-100). Valid values 0 to 100
The default value 0 (zero) means that Delivery Optimization dynamically adjusts to use the available bandwidth for foreground downloads. Valid values 0 to 100|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.deliveryOptimizationBandwidthPercentage"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deliveryOptimizationBandwidthPercentage",
  "maximumBackgroundBandwidthPercentage": "Integer",
  "maximumForegroundBandwidthPercentage": "Integer"
}
```

