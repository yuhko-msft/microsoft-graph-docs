---
title: "Get paymentTerm"
description: "Read the properties and relationships of a paymentTerm object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get paymentTerm
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of a [paymentTerm](../resources/paymentterm.md) object.

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
GET /financials/companies/{companyId}/paymentTerms/{paymentTermId}
GET /financials/companies/{companyId}/salesOrders/{salesOrderId}/paymentTerm
GET /financials/companies/{companyId}/salesQuotes/{salesQuoteId}/paymentTerm
GET /financials/companies/{companyId}/salesInvoices/{salesInvoiceId}/paymentTerm
GET /financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}/paymentTerm
GET /financials/companies/{companyId}/purchaseInvoices/{purchaseInvoiceId}/vendor/paymentTerm
GET /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/customerPayments/{customerPaymentId}/customer/paymentTerm
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

If successful, this method returns a `200 OK` response code and a [paymentTerm](../resources/paymentterm.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_paymentterm"
}
-->
``` http
GET https://graph.microsoft.com/beta/financials/companies/{companyId}/paymentTerms/{paymentTermId}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.paymentTerm"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.paymentTerm",
    "id": "06f25a64-5a64-06f2-645a-f206645af206",
    "calculateDiscountOnCreditMemos": "Boolean",
    "code": "String",
    "discountDateCalculation": "String",
    "discountPercent": "Decimal",
    "displayName": "String",
    "dueDateCalculation": "String",
    "lastModifiedDateTime": "String (timestamp)"
  }
}
```

