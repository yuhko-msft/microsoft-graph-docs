---
title: "Create yammerGroupsActivityGroupCounts"
description: "Create a new yammerGroupsActivityGroupCounts object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create yammerGroupsActivityGroupCounts
Namespace: microsoft.graph



Create a new [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) object.

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
POST ** Collection URI for microsoft.graph.yammerGroupsActivityGroupCounts not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) object.

The following table shows the properties that are required when you create the [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|active|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|total|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [yammerGroupsActivityGroupCounts](../resources/yammergroupsactivitygroupcounts.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_yammergroupsactivitygroupcounts_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.yammerGroupsActivityGroupCounts not found
Content-Type: application/json
Content-length: 206

{
  "@odata.type": "#microsoft.graph.yammerGroupsActivityGroupCounts",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "total": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.yammerGroupsActivityGroupCounts"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.yammerGroupsActivityGroupCounts",
  "id": "1d2d23d0-23d0-1d2d-d023-2d1dd0232d1d",
  "active": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "total": "Integer"
}
```

