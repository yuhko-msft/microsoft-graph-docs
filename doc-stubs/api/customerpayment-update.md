---
title: "Update customerPayment"
description: "Update the properties of a customerPayment object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update customerPayment
Namespace: microsoft.graph



Update the properties of a [customerPayment](../resources/customerpayment.md) object.

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
PATCH /financials/companies/{companyId}/customerPayments/{customerPaymentId}
PATCH /financials/companies/{companyId}/customerPaymentJournals/{customerPaymentJournalId}/customerPayments/{customerPaymentId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [customerPayment](../resources/customerpayment.md) object.

The following table shows the properties that are required when you update the [customerPayment](../resources/customerpayment.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|amount|Decimal|**TODO: Add Description**|
|appliesToInvoiceId|Guid|**TODO: Add Description**|
|appliesToInvoiceNumber|String|**TODO: Add Description**|
|comment|String|**TODO: Add Description**|
|contactId|String|**TODO: Add Description**|
|customerId|Guid|**TODO: Add Description**|
|customerNumber|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|documentNumber|String|**TODO: Add Description**|
|externalDocumentNumber|String|**TODO: Add Description**|
|journalDisplayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|lineNumber|Int32|**TODO: Add Description**|
|postingDate|Date|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [customerPayment](../resources/customerpayment.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_customerpayment"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/customerPayments/{customerPaymentId}
Content-Type: application/json
Content-length: 446

{
  "@odata.type": "#microsoft.graph.customerPayment",
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
  "lineNumber": "Integer",
  "postingDate": "Date"
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
```

