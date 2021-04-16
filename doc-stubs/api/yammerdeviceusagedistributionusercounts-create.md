---
title: "Create yammerDeviceUsageDistributionUserCounts"
description: "Create a new yammerDeviceUsageDistributionUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create yammerDeviceUsageDistributionUserCounts
Namespace: microsoft.graph



Create a new [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for microsoft.graph.yammerDeviceUsageDistributionUserCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) object.

The following table shows the properties that are required when you create the [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|androidPhone|Int32|**TODO: Add Description**|
|iPad|Int32|**TODO: Add Description**|
|iPhone|Int32|**TODO: Add Description**|
|other|Int32|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|web|Int32|**TODO: Add Description**|
|windowsPhone|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [yammerDeviceUsageDistributionUserCounts](../resources/yammerdeviceusagedistributionusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_yammerdeviceusagedistributionusercounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.yammerDeviceUsageDistributionUserCounts not found
Content-Type: application/json
Content-length: 292

{
  "@odata.type": "#microsoft.graph.yammerDeviceUsageDistributionUserCounts",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.yammerDeviceUsageDistributionUserCounts"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.yammerDeviceUsageDistributionUserCounts",
  "id": "b9a611cd-11cd-b9a6-cd11-a6b9cd11a6b9",
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

