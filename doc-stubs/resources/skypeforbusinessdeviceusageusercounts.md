---
title: "skypeForBusinessDeviceUsageUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# skypeForBusinessDeviceUsageUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List skypeForBusinessDeviceUsageUserCounts](../api/skypeforbusinessdeviceusageusercounts-list.md)|[skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) collection|Get a list of the [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) objects and their properties.|
|[Create skypeForBusinessDeviceUsageUserCounts](../api/skypeforbusinessdeviceusageusercounts-create.md)|[skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md)|Create a new [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) object.|
|[Get skypeForBusinessDeviceUsageUserCounts](../api/skypeforbusinessdeviceusageusercounts-get.md)|[skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md)|Read the properties and relationships of a [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) object.|
|[Update skypeForBusinessDeviceUsageUserCounts](../api/skypeforbusinessdeviceusageusercounts-update.md)|[skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md)|Update the properties of a [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) object.|
|[Delete skypeForBusinessDeviceUsageUserCounts](../api/skypeforbusinessdeviceusageusercounts-delete.md)|None|Deletes a [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|androidPhone|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iPad|Int32|**TODO: Add Description**|
|iPhone|Int32|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.skypeForBusinessDeviceUsageUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageUserCounts",
  "id": "String (identifier)",
  "androidPhone": "Integer",
  "iPad": "Integer",
  "iPhone": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "windows": "Integer",
  "windowsPhone": "Integer"
}
```

