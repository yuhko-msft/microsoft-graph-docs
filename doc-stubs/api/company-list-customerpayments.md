---
title: "List customerPayments"
description: "Get the customerPayment resources from the customerPayments navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List customerPayments
Namespace: microsoft.graph



Get the customerPayment resources from the customerPayments navigation property.

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
GET /financials/companies/{companyId}/customerPayments
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

If successful, this method returns a `200 OK` response code and a collection of [customerPayment](../resources/customerpayment.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_customerpayment"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/customerPayments
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.customerPayment)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
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
  ]
}
```

