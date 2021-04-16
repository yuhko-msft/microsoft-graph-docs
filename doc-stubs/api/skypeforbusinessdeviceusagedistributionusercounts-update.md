---
title: "Update skypeForBusinessDeviceUsageDistributionUserCounts"
description: "Update the properties of a skypeForBusinessDeviceUsageDistributionUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessDeviceUsageDistributionUserCounts
Namespace: microsoft.graph



Update the properties of a [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) object.

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
PATCH /skypeForBusinessDeviceUsageDistributionUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) object.

The following table shows the properties that are required when you update the [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|androidPhone|Int32|**TODO: Add Description**|
|iPad|Int32|**TODO: Add Description**|
|iPhone|Int32|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|windows|Int32|**TODO: Add Description**|
|windowsPhone|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessDeviceUsageDistributionUserCounts](../resources/skypeforbusinessdeviceusagedistributionusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinessdeviceusagedistributionusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/skypeForBusinessDeviceUsageDistributionUserCounts
Content-Type: application/json
Content-length: 283

{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageDistributionUserCounts",
  "androidPhone": "Integer",
  "iPad": "Integer",
  "iPhone": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "windows": "Integer",
  "windowsPhone": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageDistributionUserCounts",
  "id": "c5581efb-1efb-c558-fb1e-58c5fb1e58c5",
  "androidPhone": "Integer",
  "iPad": "Integer",
  "iPhone": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "windows": "Integer",
  "windowsPhone": "Integer"
}
```

