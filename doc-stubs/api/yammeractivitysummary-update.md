---
title: "Update yammerActivitySummary"
description: "Update the properties of a yammerActivitySummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update yammerActivitySummary
Namespace: microsoft.graph



Update the properties of a [yammerActivitySummary](../resources/yammeractivitysummary.md) object.

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
PATCH /yammerActivitySummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [yammerActivitySummary](../resources/yammeractivitysummary.md) object.

The following table shows the properties that are required when you update the [yammerActivitySummary](../resources/yammeractivitysummary.md).

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

If successful, this method returns a `200 OK` response code and an updated [yammerActivitySummary](../resources/yammeractivitysummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_yammeractivitysummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/yammerActivitySummary
Content-Type: application/json
Content-length: 218

{
  "@odata.type": "#microsoft.graph.yammerActivitySummary",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.yammerActivitySummary",
  "id": "d9bdbbeb-bbeb-d9bd-ebbb-bdd9ebbbbdd9",
  "liked": "Integer",
  "posted": "Integer",
  "read": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date"
}
```

