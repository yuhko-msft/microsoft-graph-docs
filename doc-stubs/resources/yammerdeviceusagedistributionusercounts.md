---
title: "yammerDeviceUsageDistributionUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yammerDeviceUsageDistributionUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yammerDeviceUsageDistributionUserCounts](../api/yammerdeviceusagedistributionusercounts-list.md)|[yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) collection|Get a list of the [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) objects and their properties.|
|[Create yammerDeviceUsageDistributionUserCounts](../api/yammerdeviceusagedistributionusercounts-create.md)|[yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md)|Create a new [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) object.|
|[Get yammerDeviceUsageDistributionUserCounts](../api/yammerdeviceusagedistributionusercounts-get.md)|[yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md)|Read the properties and relationships of a [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) object.|
|[Update yammerDeviceUsageDistributionUserCounts](../api/yammerdeviceusagedistributionusercounts-update.md)|[yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md)|Update the properties of a [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) object.|
|[Delete yammerDeviceUsageDistributionUserCounts](../api/yammerdeviceusagedistributionusercounts-delete.md)|None|Deletes a [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|androidPhone|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iPad|Int32|**TODO: Add Description**|
|iPhone|Int32|**TODO: Add Description**|
|other|Int32|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|web|Int32|**TODO: Add Description**|
|windowsPhone|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.yammerDeviceUsageDistributionUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.yammerDeviceUsageDistributionUserCounts",
  "id": "String (identifier)",
  "androidPhone": "Integer",
  "iPad": "Integer",
  "iPhone": "Integer",
  "other": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer",
  "windowsPhone": "Integer"
}
```

