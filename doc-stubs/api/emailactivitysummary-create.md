---
title: "Create emailActivitySummary"
description: "Create a new emailActivitySummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create emailActivitySummary
Namespace: microsoft.graph



Create a new [emailActivitySummary](../resources/emailactivitysummary.md) object.

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
POST ** Collection URI for microsoft.graph.emailActivitySummary not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [emailActivitySummary](../resources/emailactivitysummary.md) object.

The following table shows the properties that are required when you create the [emailActivitySummary](../resources/emailactivitysummary.md).

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

If successful, this method returns a `201 Created` response code and an [emailActivitySummary](../resources/emailactivitysummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_emailactivitysummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.emailActivitySummary not found
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
  "truncated": true,
  "@odata.type": "microsoft.graph.emailActivitySummary"
}
-->
``` http
HTTP/1.1 201 Created
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

