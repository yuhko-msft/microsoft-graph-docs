---
title: "Get securityBaselineStateSummary"
description: "Read the properties and relationships of a securityBaselineStateSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get securityBaselineStateSummary
Namespace: microsoft.graph



Read the properties and relationships of a [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object.

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
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [securityBaselineStateSummary](../resources/securitybaselinestatesummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_securitybaselinestatesummary"
}
-->
``` http

```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.securityBaselineStateSummary"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.securityBaselineStateSummary",
    "id": "d3dd5fd3-5fd3-d3dd-d35f-ddd3d35fddd3",
    "conflictCount": "Integer",
    "errorCount": "Integer",
    "notApplicableCount": "Integer",
    "notSecureCount": "Integer",
    "secureCount": "Integer",
    "unknownCount": "Integer"
  }
}
```

