---
title: "Update sharePointActivityPages"
description: "Update the properties of a sharePointActivityPages object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update sharePointActivityPages
Namespace: microsoft.graph



Update the properties of a [sharePointActivityPages](../resources/sharepointactivitypages.md) object.

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
PATCH /sharePointActivityPages
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharePointActivityPages](../resources/sharepointactivitypages.md) object.

The following table shows the properties that are required when you update the [sharePointActivityPages](../resources/sharepointactivitypages.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|visitedPageCount|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [sharePointActivityPages](../resources/sharepointactivitypages.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_sharepointactivitypages"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/sharePointActivityPages
Content-Type: application/json
Content-length: 185

{
  "@odata.type": "#microsoft.graph.sharePointActivityPages",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "visitedPageCount": "Integer"
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
  "@odata.type": "#microsoft.graph.sharePointActivityPages",
  "id": "cf43b98b-b98b-cf43-8bb9-43cf8bb943cf",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "visitedPageCount": "Integer"
}
```

