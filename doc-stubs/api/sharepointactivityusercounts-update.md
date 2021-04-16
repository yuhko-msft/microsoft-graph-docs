---
title: "Update sharePointActivityUserCounts"
description: "Update the properties of a sharePointActivityUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sharePointActivityUserCounts
Namespace: microsoft.graph



Update the properties of a [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object.

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
PATCH /sharePointActivityUserCounts
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object.

The following table shows the properties that are required when you update the [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|sharedExternally|Int64|**TODO: Add Description**|
|sharedInternally|Int64|**TODO: Add Description**|
|synced|Int64|**TODO: Add Description**|
|viewedOrEdited|Int64|**TODO: Add Description**|
|visitedPage|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sharepointactivityusercounts"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/sharePointActivityUserCounts
Content-Type: application/json
Content-length: 309

{
  "@odata.type": "#microsoft.graph.sharePointActivityUserCounts",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternally": "Integer",
  "sharedInternally": "Integer",
  "synced": "Integer",
  "viewedOrEdited": "Integer",
  "visitedPage": "Integer"
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
  "@odata.type": "#microsoft.graph.sharePointActivityUserCounts",
  "id": "3c2f8d05-8d05-3c2f-058d-2f3c058d2f3c",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "sharedExternally": "Integer",
  "sharedInternally": "Integer",
  "synced": "Integer",
  "viewedOrEdited": "Integer",
  "visitedPage": "Integer"
}
```

