---
title: "skypeForBusinessDeviceUsageDistributionUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessDeviceUsageDistributionUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessDeviceUsageDistributionUserCounts](../api/skypeforbusinessdeviceusagedistributionusercounts-list.md)|[skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) collection|Get a list of the [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) objects and their properties.|
|[Create skypeForBusinessDeviceUsageDistributionUserCounts](../api/skypeforbusinessdeviceusagedistributionusercounts-create.md)|[skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md)|Create a new [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) object.|
|[Get skypeForBusinessDeviceUsageDistributionUserCounts](../api/skypeforbusinessdeviceusagedistributionusercounts-get.md)|[skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md)|Read the properties and relationships of a [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) object.|
|[Update skypeForBusinessDeviceUsageDistributionUserCounts](../api/skypeforbusinessdeviceusagedistributionusercounts-update.md)|[skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md)|Update the properties of a [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) object.|
|[Delete skypeForBusinessDeviceUsageDistributionUserCounts](../api/skypeforbusinessdeviceusagedistributionusercounts-delete.md)|None|Deletes a [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|androidPhone|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iPad|Int32|**TODO: Add Description**|
|iPhone|Int32|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|windows|Int32|**TODO: Add Description**|
|windowsPhone|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.skypeForBusinessDeviceUsageDistributionUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageDistributionUserCounts",
  "id": "String (identifier)",
  "androidPhone": "Integer",
  "iPad": "Integer",
  "iPhone": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "windows": "Integer",
  "windowsPhone": "Integer"
}
```

