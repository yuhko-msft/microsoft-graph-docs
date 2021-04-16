---
title: "Update currency"
description: "Update the properties of a currency object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update currency
Namespace: microsoft.graph



Update the properties of a [currency](../resources/currency.md) object.

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
PATCH /financials/companies/{companyId}/currencies/{currencyId}
PATCH /financials/companies/{companyId}/salesOrders/{salesOrderId}/currency
PATCH /financials/companies/{companyId}/salesQuotes/{salesQuoteId}/currency
PATCH /financials/companies/{companyId}/salesInvoices/{salesInvoiceId}/currency
PATCH /financials/companies/{companyId}/purchaseInvoices/{purchaseInvoiceId}/currency
PATCH /financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}/currency
PATCH /financials/companies/{companyId}/purchaseInvoices/{purchaseInvoiceId}/vendor/currency
PATCH /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/customerPayments/{customerPaymentId}/customer/currency
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [currency](../resources/currency.md) object.

The following table shows the properties that are required when you update the [currency](../resources/currency.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|amountDecimalPlaces|String|**TODO: Add Description**|
|amountRoundingPrecision|Decimal|**TODO: Add Description**|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|symbol|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [currency](../resources/currency.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_currency"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/currencies/{currencyId}
Content-Type: application/json
Content-length: 199

{
  "@odata.type": "#microsoft.graph.currency",
  "amountDecimalPlaces": "String",
  "amountRoundingPrecision": "Decimal",
  "code": "String",
  "displayName": "String",
  "symbol": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

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
```

