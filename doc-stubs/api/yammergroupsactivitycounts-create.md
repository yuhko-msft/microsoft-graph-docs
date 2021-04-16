---
title: "Create yammerGroupsActivityCounts"
description: "Create a new yammerGroupsActivityCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create yammerGroupsActivityCounts
Namespace: microsoft.graph



Create a new [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) object.

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
POST ** Collection URI for microsoft.graph.yammerGroupsActivityCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) object.

The following table shows the properties that are required when you create the [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|liked|Int64|**TODO: Add Description**|
|posted|Int64|**TODO: Add Description**|
|read|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [yammerGroupsActivityCounts](../resources/yammergroupsactivitycounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_yammergroupsactivitycounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.yammerGroupsActivityCounts not found
Content-Type: application/json
Content-length: 223

{
  "@odata.type": "#microsoft.graph.yammerGroupsActivityCounts",
  "liked": "Integer",
  "posted": "Integer",
  "read": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.yammerGroupsActivityCounts"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.yammerGroupsActivityCounts",
  "id": "591fbd90-bd90-591f-90bd-1f5990bd1f59",
  "liked": "Integer",
  "posted": "Integer",
  "read": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```

