---
title: "Update teamsDeviceUsageDistributionUserCounts"
description: "Update the properties of a teamsDeviceUsageDistributionUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update teamsDeviceUsageDistributionUserCounts
Namespace: microsoft.graph



Update the properties of a [teamsDeviceUsageDistributionUserCounts](../resources/teamsdeviceusagedistributionusercounts.md) object.

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
PATCH /teamsDeviceUsageDistributionUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsDeviceUsageDistributionUserCounts](../resources/teamsdeviceusagedistributionusercounts.md) object.

The following table shows the properties that are required when you update the [teamsDeviceUsageDistributionUserCounts](../resources/teamsdeviceusagedistributionusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|androidPhone|Int64|**TODO: Add Description**|
|chromeOS|Int64|**TODO: Add Description**|
|ios|Int64|**TODO: Add Description**|
|linux|Int64|**TODO: Add Description**|
|mac|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|web|Int64|**TODO: Add Description**|
|windows|Int64|**TODO: Add Description**|
|windowsPhone|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [teamsDeviceUsageDistributionUserCounts](../resources/teamsdeviceusagedistributionusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_teamsdeviceusagedistributionusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/teamsDeviceUsageDistributionUserCounts
Content-Type: application/json
Content-length: 338

{
  "@odata.type": "#microsoft.graph.teamsDeviceUsageDistributionUserCounts",
  "androidPhone": "Integer",
  "chromeOS": "Integer",
  "ios": "Integer",
  "linux": "Integer",
  "mac": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer",
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
  "@odata.type": "#microsoft.graph.teamsDeviceUsageDistributionUserCounts",
  "id": "7e8c7dc4-7dc4-7e8c-c47d-8c7ec47d8c7e",
  "androidPhone": "Integer",
  "chromeOS": "Integer",
  "ios": "Integer",
  "linux": "Integer",
  "mac": "Integer",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "web": "Integer",
  "windows": "Integer",
  "windowsPhone": "Integer"
}
```

