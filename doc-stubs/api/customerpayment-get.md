---
title: "Get customerPayment"
description: "Read the properties and relationships of a customerPayment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get customerPayment
Namespace: microsoft.graph



Read the properties and relationships of a [customerPayment](../resources/customerpayment.md) object.

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
GET /financials/companies/{companyId}/customerPayments/{customerPaymentId}
GET /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/customerPayments/{customerPaymentId}
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

If successful, this method returns a `200 OK` response code and a [customerPayment](../resources/customerpayment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_customerpayment"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/customerPayments/{customerPaymentId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.customerPayment"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.customerPayment",
    "id": "f610b81d-b81d-f610-1db8-10f61db810f6",
    "amount": "Decimal",
    "appliesToInvoiceId": "Guid",
    "appliesToInvoiceNumber": "String",
    "comment": "String",
    "contactId": "String",
    "customerId": "Guid",
    "customerNumber": "String",
    "description": "String",
    "documentNumber": "String",
    "externalDocumentNumber": "String",
    "journalDisplayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "lineNumber": "Integer",
    "postingDate": "Date"
  }
}
```

