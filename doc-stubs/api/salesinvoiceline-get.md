---
title: "Get salesInvoiceLine"
description: "Read the properties and relationships of a salesInvoiceLine object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get salesInvoiceLine
Namespace: microsoft.graph



Read the properties and relationships of a [salesInvoiceLine](../resources/salesinvoiceline.md) object.

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
GET /financials/companies/{companyId}/salesInvoiceLines/{salesInvoiceLineId}
GET /financials/companies/{companyId}/salesInvoices/{salesInvoiceId}/salesInvoiceLines/{salesInvoiceLineId}
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

If successful, this method returns a `200 OK` response code and a [salesInvoiceLine](../resources/salesinvoiceline.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_salesinvoiceline"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesInvoiceLines/{salesInvoiceLineId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.salesInvoiceLine"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.salesInvoiceLine",
    "id": "040bfc22-fc22-040b-22fc-0b0422fc0b04",
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

