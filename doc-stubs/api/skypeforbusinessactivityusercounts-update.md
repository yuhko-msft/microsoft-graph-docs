---
title: "Update skypeForBusinessActivityUserCounts"
description: "Update the properties of a skypeForBusinessActivityUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update skypeForBusinessActivityUserCounts
Namespace: microsoft.graph



Update the properties of a [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) object.

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
PATCH /skypeForBusinessActivityUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) object.

The following table shows the properties that are required when you update the [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|organized|Int64|**TODO: Add Description**|
|participated|Int64|**TODO: Add Description**|
|peerToPeer|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [skypeForBusinessActivityUserCounts](../resources/skypeforbusinessactivityusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_skypeforbusinessactivityusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/skypeForBusinessActivityUserCounts
Content-Type: application/json
Content-length: 247

{
  "@odata.type": "#microsoft.graph.skypeForBusinessActivityUserCounts",
  "organized": "Integer",
  "participated": "Integer",
  "peerToPeer": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
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
  "@odata.type": "#microsoft.graph.skypeForBusinessActivityUserCounts",
  "id": "92e6b2d0-b2d0-92e6-d0b2-e692d0b2e692",
  "organized": "Integer",
  "participated": "Integer",
  "peerToPeer": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```

