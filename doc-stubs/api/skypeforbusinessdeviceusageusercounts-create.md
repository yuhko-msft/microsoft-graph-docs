---
title: "Create skypeForBusinessDeviceUsageUserCounts"
description: "Create a new skypeForBusinessDeviceUsageUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create skypeForBusinessDeviceUsageUserCounts
Namespace: microsoft.graph



Create a new [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) object.

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
POST ** Collection URI for microsoft.graph.skypeForBusinessDeviceUsageUserCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) object.

The following table shows the properties that are required when you create the [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|androidPhone|Int32|**TODO: Add Description**|
|iPad|Int32|**TODO: Add Description**|
|iPhone|Int32|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|windows|Int32|**TODO: Add Description**|
|windowsPhone|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [skypeForBusinessDeviceUsageUserCounts](../resources/skypeforbusinessdeviceusageusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_skypeforbusinessdeviceusageusercounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.skypeForBusinessDeviceUsageUserCounts not found
Content-Type: application/json
Content-length: 296

{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageUserCounts",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.skypeForBusinessDeviceUsageUserCounts"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.skypeForBusinessDeviceUsageUserCounts",
  "id": "665f60f4-60f4-665f-f460-5f66f4605f66",
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

