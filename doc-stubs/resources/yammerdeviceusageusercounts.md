---
title: "yammerDeviceUsageUserCounts resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# yammerDeviceUsageUserCounts resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List yammerDeviceUsageUserCounts](../api/yammerdeviceusageusercounts-list.md)|[yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md) collection|Get a list of the [yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md) objects and their properties.|
|[Create yammerDeviceUsageUserCounts](../api/yammerdeviceusageusercounts-create.md)|[yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md)|Create a new [yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md) object.|
|[Get yammerDeviceUsageUserCounts](../api/yammerdeviceusageusercounts-get.md)|[yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md)|Read the properties and relationships of a [yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md) object.|
|[Update yammerDeviceUsageUserCounts](../api/yammerdeviceusageusercounts-update.md)|[yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md)|Update the properties of a [yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md) object.|
|[Delete yammerDeviceUsageUserCounts](../api/yammerdeviceusageusercounts-delete.md)|None|Deletes a [yammerDeviceUsageUserCounts](../resources/yammerdeviceusageusercounts.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|androidPhone|Int32|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iPad|Int32|**TODO: Add Description**|
|iPhone|Int32|**TODO: Add Description**|
|other|Int32|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.yammerDeviceUsageUserCounts",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.yammerDeviceUsageUserCounts",
  "id": "String (identifier)",
  "androidPhone": "Integer",
  "iPad": "Integer",
  "iPhone": "Integer",
  "other": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer",
  "windowsPhone": "Integer"
}
```

