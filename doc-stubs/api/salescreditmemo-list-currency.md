---
title: "List currency"
description: "Get the currency resources from the currency navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List currency
Namespace: microsoft.graph



Get the currency resources from the currency navigation property.

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
GET /financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}/currency
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

If successful, this method returns a `200 OK` response code and a collection of [currency](../resources/currency.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_currency"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}/currency
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.currency)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.currency",
      "id": "afa4172f-172f-afa4-2f17-a4af2f17a4af",
      "amountDecimalPlaces": "String",
      "amountRoundingPrecision": "Decimal",
      "code": "String",
      "displayName": "String",
      "lastModifiedDateTime": "String (timestamp)",
      "symbol": "String"
    }
  ]
}
```

