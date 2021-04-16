---
title: "Delete account"
description: "Deletes an account object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Delete account
Namespace: microsoft.graph



Deletes an [account](../resources/account.md) object.

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
DELETE /financials/companies/{companyId}/accounts/{accountId}
DELETE /financials/companies/{companyId}/journals/{journalId}/account
DELETE /financials/companies/{companyId}/journalLines/{journalLineId}/account
DELETE /financials/companies/{companyId}/salesOrderLines/{salesOrderLineId}/account
DELETE /financials/companies/{companyId}/salesQuoteLines/{salesQuoteLineId}/account
DELETE /financials/companies/{companyId}/salesInvoiceLines/{salesInvoiceLineId}/account
DELETE /financials/companies/{companyId}/generalLedgerEntries/{generalLedgerEntryId}/account
DELETE /financials/companies/{companyId}/purchaseInvoiceLines/{purchaseInvoiceLineId}/account
DELETE /financials/companies/{companyId}/salesCreditMemoLines/{salesCreditMemoLineId}/account
DELETE /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/account
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "delete_account"
}
-->
``` http
DELETE https://graph.microsoft.com/v1.0/financials/companies/{companyId}/accounts/{accountId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```

