---
title: "Get salesCreditMemoLine"
description: "Read the properties and relationships of a salesCreditMemoLine object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get salesCreditMemoLine
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [salesCreditMemoLine](../resources/salescreditmemoline.md) object.

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
GET /financials/companies/{companyId}/salesCreditMemoLines/{salesCreditMemoLineId}
GET /financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}/salesCreditMemoLines/{salesCreditMemoLineId}
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

If successful, this method returns a `200 OK` response code and a [salesCreditMemoLine](../resources/salescreditmemoline.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_salescreditmemoline"
}
-->
``` http
GET https://graph.microsoft.com/beta/financials/companies/{companyId}/salesCreditMemoLines/{salesCreditMemoLineId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.salesCreditMemoLine"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.salesCreditMemoLine",
    "id": "dc2e9cd8-9cd8-dc2e-d89c-2edcd89c2edc",
    "accountId": "Guid",
    "amountExcludingTax": "Decimal",
    "amountIncludingTax": "Decimal",
    "description": "String",
    "discountAmount": "Decimal",
    "discountAppliedBeforeTax": "Boolean",
    "discountPercent": "Decimal",
    "documentId": "Guid",
    "invoiceDiscountAllocation": "Decimal",
    "itemId": "Guid",
    "lineType": "String",
    "netAmount": "Decimal",
    "netAmountIncludingTax": "Decimal",
    "netTaxAmount": "Decimal",
    "quantity": "Decimal",
    "sequence": "Integer",
    "shipmentDate": "Date",
    "taxCode": "String",
    "taxPercent": "Decimal",
    "totalTaxAmount": "Decimal",
    "unitOfMeasureId": "Guid",
    "unitPrice": "Decimal"
  }
}
```

