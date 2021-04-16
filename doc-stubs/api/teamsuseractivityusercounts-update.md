---
title: "Update teamsUserActivityUserCounts"
description: "Update the properties of a teamsUserActivityUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update teamsUserActivityUserCounts
Namespace: microsoft.graph



Update the properties of a [teamsUserActivityUserCounts](../resources/teamsuseractivityusercounts.md) object.

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
PATCH /teamsUserActivityUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsUserActivityUserCounts](../resources/teamsuseractivityusercounts.md) object.

The following table shows the properties that are required when you update the [teamsUserActivityUserCounts](../resources/teamsuseractivityusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|calls|Int64|**TODO: Add Description**|
|meetings|Int64|**TODO: Add Description**|
|otherActions|Int64|**TODO: Add Description**|
|privateChatMessages|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|teamChatMessages|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [teamsUserActivityUserCounts](../resources/teamsuseractivityusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_teamsuseractivityusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/teamsUserActivityUserCounts
Content-Type: application/json
Content-length: 305

{
  "@odata.type": "#microsoft.graph.teamsUserActivityUserCounts",
  "calls": "Integer",
  "meetings": "Integer",
  "otherActions": "Integer",
  "privateChatMessages": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "teamChatMessages": "Integer"
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
  "@odata.type": "#microsoft.graph.teamsUserActivityUserCounts",
  "id": "859228a3-28a3-8592-a328-9285a3289285",
  "calls": "Integer",
  "meetings": "Integer",
  "otherActions": "Integer",
  "privateChatMessages": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "teamChatMessages": "Integer"
}
```

