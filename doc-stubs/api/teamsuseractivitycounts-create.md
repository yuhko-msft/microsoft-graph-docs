---
title: "Create teamsUserActivityCounts"
description: "Create a new teamsUserActivityCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create teamsUserActivityCounts
Namespace: microsoft.graph

Create a new [teamsUserActivityCounts](../resources/teamsuseractivitycounts.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
POST ** Collection URI for microsoft.graph.teamsUserActivityCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [teamsUserActivityCounts](../resources/teamsuseractivitycounts.md) object.

The following table shows the properties that are required when you create the [teamsUserActivityCounts](../resources/teamsuseractivitycounts.md).

|Property|Type|Description|
|:---|:---|:---|
|reportRefreshDate|Date|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|teamChatMessages|Int64|**TODO: Add Description**|
|privateChatMessages|Int64|**TODO: Add Description**|
|calls|Int64|**TODO: Add Description**|
|meetings|Int64|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [teamsUserActivityCounts](../resources/teamsuseractivitycounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_teamsuseractivitycounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.teamsUserActivityCounts not found
Content-Type: application/json
Content-length: 271

{
  "@odata.type": "#microsoft.graph.teamsUserActivityCounts",
  "reportRefreshDate": "Date",
  "reportDate": "Date",
  "teamChatMessages": "Integer",
  "privateChatMessages": "Integer",
  "calls": "Integer",
  "meetings": "Integer",
  "reportPeriod": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.teamsUserActivityCounts"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.teamsUserActivityCounts",
  "reportRefreshDate": "Date",
  "reportDate": "Date",
  "teamChatMessages": "Integer",
  "privateChatMessages": "Integer",
  "calls": "Integer",
  "meetings": "Integer",
  "reportPeriod": "String"
}
```

