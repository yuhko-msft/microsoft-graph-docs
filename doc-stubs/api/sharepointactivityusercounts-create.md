---
title: "Create sharePointActivityUserCounts"
description: "Create a new sharePointActivityUserCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create sharePointActivityUserCounts
Namespace: microsoft.graph



Create a new [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object.

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
POST ** Collection URI for microsoft.graph.sharePointActivityUserCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object.

The following table shows the properties that are required when you create the [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md).

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

If successful, this method returns a `201 Created` response code and a [sharePointActivityUserCounts](../resources/sharepointactivityusercounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_sharepointactivityusercounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.sharePointActivityUserCounts not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.sharePointActivityUserCounts"
}
-->
``` http
HTTP/1.1 201 Created
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

