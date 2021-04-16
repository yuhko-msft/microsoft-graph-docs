---
title: "List account"
description: "Get the account resources from the account navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List account
Namespace: microsoft.graph



Get the account resources from the account navigation property.

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
GET /financials/companies/{companyId}/purchaseInvoiceLines/{purchaseInvoiceLineId}/account
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

If successful, this method returns a `200 OK` response code and a collection of [account](../resources/account.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_account"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/purchaseInvoiceLines/{purchaseInvoiceLineId}/account
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.account)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.account",
      "id": "229ac6d3-c6d3-229a-d3c6-9a22d3c69a22",
      "blocked": "Boolean",
      "category": "String",
      "displayName": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "number": "String",
      "subCategory": "String"
    }
  ]
}
```

