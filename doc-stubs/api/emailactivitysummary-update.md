---
title: "Update emailActivitySummary"
description: "Update the properties of an emailActivitySummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailActivitySummary
Namespace: microsoft.graph



Update the properties of an [emailActivitySummary](../resources/emailactivitysummary.md) object.

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
PATCH /emailActivitySummary
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailActivitySummary](../resources/emailactivitysummary.md) object.

The following table shows the properties that are required when you update the [emailActivitySummary](../resources/emailactivitysummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|read|Int64|**TODO: Add Description**|
|receive|Int64|**TODO: Add Description**|
|reportDate|Date|**TODO: Add Description**|
|reportPeriod|String|**TODO: Add Description**|
|reportRefreshDate|Date|**TODO: Add Description**|
|send|Int64|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailActivitySummary](../resources/emailactivitysummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailactivitysummary"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/emailActivitySummary
Content-Type: application/json
Content-length: 217

{
  "@odata.type": "#microsoft.graph.emailActivitySummary",
  "read": "Integer",
  "receive": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "send": "Integer"
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
  "@odata.type": "#microsoft.graph.emailActivitySummary",
  "id": "0fb65c0a-5c0a-0fb6-0a5c-b60f0a5cb60f",
  "read": "Integer",
  "receive": "Integer",
  "reportDate": "Date",
  "reportPeriod": "String",
  "reportRefreshDate": "Date",
  "send": "Integer"
}
```

