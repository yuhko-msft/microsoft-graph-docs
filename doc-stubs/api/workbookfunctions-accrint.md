---
title: "workbookFunctions: accrInt"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# workbookFunctions: accrInt
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

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
POST /workbooks/{workbooksId}/workbook/functions/accrInt
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|issue|[Json](../resources/json.md)|**TODO: Add Description**|
|firstInterest|[Json](../resources/json.md)|**TODO: Add Description**|
|settlement|[Json](../resources/json.md)|**TODO: Add Description**|
|rate|[Json](../resources/json.md)|**TODO: Add Description**|
|par|[Json](../resources/json.md)|**TODO: Add Description**|
|frequency|[Json](../resources/json.md)|**TODO: Add Description**|
|basis|[Json](../resources/json.md)|**TODO: Add Description**|
|calcMethod|[Json](../resources/json.md)|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [workbookFunctionResult](../resources/workbookfunctionresult.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "workbookfunctions_accrint"
}
-->
``` http
POST https://graph.microsoft.com/beta/workbooks/{workbooksId}/workbook/functions/accrInt
Content-Type: application/json
Content-length: 526

{
  "issue": {
    "@odata.type": "microsoft.graph.Json"
  },
  "firstInterest": {
    "@odata.type": "microsoft.graph.Json"
  },
  "settlement": {
    "@odata.type": "microsoft.graph.Json"
  },
  "rate": {
    "@odata.type": "microsoft.graph.Json"
  },
  "par": {
    "@odata.type": "microsoft.graph.Json"
  },
  "frequency": {
    "@odata.type": "microsoft.graph.Json"
  },
  "basis": {
    "@odata.type": "microsoft.graph.Json"
  },
  "calcMethod": {
    "@odata.type": "microsoft.graph.Json"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.workbookFunctionResult"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.workbookFunctionResult",
    "id": "String (identifier)",
    "error": "String",
    "value": {
      "@odata.type": "microsoft.graph.Json"
    }
  }
}
```

