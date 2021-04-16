---
title: "Update salesOrderLine"
description: "Update the properties of a salesOrderLine object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update salesOrderLine
Namespace: microsoft.graph



Update the properties of a [salesOrderLine](../resources/salesorderline.md) object.

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
PATCH /financials/companies/{companyId}/salesOrderLines/{salesOrderLineId}
PATCH /financials/companies/{companyId}/salesOrders/{salesOrderId}/salesOrderLines/{salesOrderLineId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [salesOrderLine](../resources/salesorderline.md) object.

The following table shows the properties that are required when you update the [salesOrderLine](../resources/salesorderline.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accountId|Guid|**TODO: Add Description**|
|amountExcludingTax|Decimal|**TODO: Add Description**|
|amountIncludingTax|Decimal|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|discountAmount|Decimal|**TODO: Add Description**|
|discountAppliedBeforeTax|Boolean|**TODO: Add Description**|
|discountPercent|Decimal|**TODO: Add Description**|
|documentId|Guid|**TODO: Add Description**|
|invoiceDiscountAllocation|Decimal|**TODO: Add Description**|
|invoicedQuantity|Decimal|**TODO: Add Description**|
|invoiceQuantity|Decimal|**TODO: Add Description**|
|itemId|Guid|**TODO: Add Description**|
|lineType|String|**TODO: Add Description**|
|netAmount|Decimal|**TODO: Add Description**|
|netAmountIncludingTax|Decimal|**TODO: Add Description**|
|netTaxAmount|Decimal|**TODO: Add Description**|
|quantity|Decimal|**TODO: Add Description**|
|sequence|Int32|**TODO: Add Description**|
|shipmentDate|Date|**TODO: Add Description**|
|shippedQuantity|Decimal|**TODO: Add Description**|
|shipQuantity|Decimal|**TODO: Add Description**|
|taxCode|String|**TODO: Add Description**|
|taxPercent|Decimal|**TODO: Add Description**|
|totalTaxAmount|Decimal|**TODO: Add Description**|
|unitOfMeasureId|Guid|**TODO: Add Description**|
|unitPrice|Decimal|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [salesOrderLine](../resources/salesorderline.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_salesorderline"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/financials/companies/{companyId}/salesOrderLines/{salesOrderLineId}
Content-Type: application/json
Content-length: 847

{
  "@odata.type": "#microsoft.graph.salesOrderLine",
  "accountId": "Guid",
  "amountExcludingTax": "Decimal",
  "amountIncludingTax": "Decimal",
  "description": "String",
  "discountAmount": "Decimal",
  "discountAppliedBeforeTax": "Boolean",
  "discountPercent": "Decimal",
  "documentId": "Guid",
  "invoiceDiscountAllocation": "Decimal",
  "invoicedQuantity": "Decimal",
  "invoiceQuantity": "Decimal",
  "itemId": "Guid",
  "lineType": "String",
  "netAmount": "Decimal",
  "netAmountIncludingTax": "Decimal",
  "netTaxAmount": "Decimal",
  "quantity": "Decimal",
  "sequence": "Integer",
  "shipmentDate": "Date",
  "shippedQuantity": "Decimal",
  "shipQuantity": "Decimal",
  "taxCode": "String",
  "taxPercent": "Decimal",
  "totalTaxAmount": "Decimal",
  "unitOfMeasureId": "Guid",
  "unitPrice": "Decimal"
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
  "@odata.type": "#microsoft.graph.salesOrderLine",
  "id": "c0484009-4009-c048-0940-48c0094048c0",
  "accountId": "Guid",
  "amountExcludingTax": "Decimal",
  "amountIncludingTax": "Decimal",
  "description": "String",
  "discountAmount": "Decimal",
  "discountAppliedBeforeTax": "Boolean",
  "discountPercent": "Decimal",
  "documentId": "Guid",
  "invoiceDiscountAllocation": "Decimal",
  "invoicedQuantity": "Decimal",
  "invoiceQuantity": "Decimal",
  "itemId": "Guid",
  "lineType": "String",
  "netAmount": "Decimal",
  "netAmountIncludingTax": "Decimal",
  "netTaxAmount": "Decimal",
  "quantity": "Decimal",
  "sequence": "Integer",
  "shipmentDate": "Date",
  "shippedQuantity": "Decimal",
  "shipQuantity": "Decimal",
  "taxCode": "String",
  "taxPercent": "Decimal",
  "totalTaxAmount": "Decimal",
  "unitOfMeasureId": "Guid",
  "unitPrice": "Decimal"
}
```

