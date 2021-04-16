---
title: "Update paymentTerm"
description: "Update the properties of a paymentTerm object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update paymentTerm
Namespace: microsoft.graph



Update the properties of a [paymentTerm](../resources/paymentterm.md) object.

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
PATCH /financials/companies/{companyId}/paymentTerms/{paymentTermId}
PATCH /financials/companies/{companyId}/salesOrders/{salesOrderId}/paymentTerm
PATCH /financials/companies/{companyId}/salesQuotes/{salesQuoteId}/paymentTerm
PATCH /financials/companies/{companyId}/salesInvoices/{salesInvoiceId}/paymentTerm
PATCH /financials/companies/{companyId}/salesCreditMemos/{salesCreditMemoId}/paymentTerm
PATCH /financials/companies/{companyId}/purchaseInvoices/{purchaseInvoiceId}/vendor/paymentTerm
PATCH /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/customerPayments/{customerPaymentId}/customer/paymentTerm
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [paymentTerm](../resources/paymentterm.md) object.

The following table shows the properties that are required when you update the [paymentTerm](../resources/paymentterm.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|calculateDiscountOnCreditMemos|Boolean|**TODO: Add Description**|
|code|String|**TODO: Add Description**|
|discountDateCalculation|String|**TODO: Add Description**|
|discountPercent|Decimal|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|dueDateCalculation|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [paymentTerm](../resources/paymentterm.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_paymentterm"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/paymentTerms/{paymentTermId}
Content-Type: application/json
Content-length: 258

{
  "@odata.type": "#microsoft.graph.paymentTerm",
  "calculateDiscountOnCreditMemos": "Boolean",
  "code": "String",
  "discountDateCalculation": "String",
  "discountPercent": "Decimal",
  "displayName": "String",
  "dueDateCalculation": "String"
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
  "@odata.type": "#microsoft.graph.paymentTerm",
  "id": "fe248d83-8d83-fe24-838d-24fe838d24fe",
  "calculateDiscountOnCreditMemos": "Boolean",
  "code": "String",
  "discountDateCalculation": "String",
  "discountPercent": "Decimal",
  "displayName": "String",
  "dueDateCalculation": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

