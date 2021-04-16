---
title: "Get account"
description: "Read the properties and relationships of an account object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get account
Namespace: microsoft.graph



Read the properties and relationships of an [account](../resources/account.md) object.

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
GET /financials/companies/{companyId}/accounts/{accountId}
GET /financials/companies/{companyId}/journals/{journalId}/account
GET /financials/companies/{companyId}/journalLines/{journalLineId}/account
GET /financials/companies/{companyId}/salesOrderLines/{salesOrderLineId}/account
GET /financials/companies/{companyId}/salesQuoteLines/{salesQuoteLineId}/account
GET /financials/companies/{companyId}/salesInvoiceLines/{salesInvoiceLineId}/account
GET /financials/companies/{companyId}/generalLedgerEntries/{generalLedgerEntryId}/account
GET /financials/companies/{companyId}/purchaseInvoiceLines/{purchaseInvoiceLineId}/account
GET /financials/companies/{companyId}/salesCreditMemoLines/{salesCreditMemoLineId}/account
GET /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/account
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

If successful, this method returns a `200 OK` response code and an [account](../resources/account.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_account"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/financials/companies/{companyId}/accounts/{accountId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.account"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.account",
    "id": "229ac6d3-c6d3-229a-d3c6-9a22d3c69a22",
    "blocked": "Boolean",
    "category": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "number": "String",
    "subCategory": "String"
  }
}
```

