---
title: "Get customer"
description: "Read the properties and relationships of a customer object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get customer
Namespace: microsoft.graph



Read the properties and relationships of a [customer](../resources/customer.md) object.

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
GET /financials/companies/{companyId}/customers/{customerId}
GET /financials/companies/{companyId}/salesOrders/{salesOrderId}/customer
GET /financials/companies/{companyId}/salesQuotes/{salesQuoteId}/customer
GET /financials/companies/{companyId}/salesInvoices/{salesInvoiceId}/customer
GET /financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}/customer
GET /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/customerPayments/{customerPaymentId}/customer
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

If successful, this method returns a `200 OK` response code and a [customer](../resources/customer.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_customer"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/customers/{customerId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.customer"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.customer",
    "id": "3b2f52b9-52b9-3b2f-b952-2f3bb9522f3b",
    "address": {
      "@odata.type": "microsoft.graph.postalAddressType"
    },
    "blocked": "String",
    "currencyCode": "String",
    "currencyId": "Guid",
    "displayName": "String",
    "email": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "number": "String",
    "paymentMethodId": "Guid",
    "paymentTermsId": "Guid",
    "phoneNumber": "String",
    "shipmentMethodId": "Guid",
    "taxAreaDisplayName": "String",
    "taxAreaId": "Guid",
    "taxLiable": "Boolean",
    "taxRegistrationNumber": "String",
    "type": "String",
    "website": "String"
  }
}
```

