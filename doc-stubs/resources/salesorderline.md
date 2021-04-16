---
title: "salesOrderLine resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# salesOrderLine resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List salesOrderLines](../api/salesorderline-list.md)|[salesOrderLine](../resources/salesorderline.md) collection|Get a list of the [salesOrderLine](../resources/salesorderline.md) objects and their properties.|
|[Create salesOrderLine](../api/salesorderline-create.md)|[salesOrderLine](../resources/salesorderline.md)|Create a new [salesOrderLine](../resources/salesorderline.md) object.|
|[Get salesOrderLine](../api/salesorderline-get.md)|[salesOrderLine](../resources/salesorderline.md)|Read the properties and relationships of a [salesOrderLine](../resources/salesorderline.md) object.|
|[Update salesOrderLine](../api/salesorderline-update.md)|[salesOrderLine](../resources/salesorderline.md)|Update the properties of a [salesOrderLine](../resources/salesorderline.md) object.|
|[Delete salesOrderLine](../api/salesorderline-delete.md)|None|Deletes a [salesOrderLine](../resources/salesorderline.md) object.|
|[List account](../api/salesorderline-list-account.md)|[account](../resources/account.md) collection|Get the account resources from the account navigation property.|
|[Create account](../api/salesorderline-post-account.md)|[account](../resources/account.md)|Create a new account object.|
|[List item](../api/salesorderline-list-item.md)|[item](../resources/item.md) collection|Get the item resources from the item navigation property.|
|[Create item](../api/salesorderline-post-item.md)|[item](../resources/item.md)|Create a new item object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountId|Guid|**TODO: Add Description**|
|amountExcludingTax|Decimal|**TODO: Add Description**|
|amountIncludingTax|Decimal|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|discountAmount|Decimal|**TODO: Add Description**|
|discountAppliedBeforeTax|Boolean|**TODO: Add Description**|
|discountPercent|Decimal|**TODO: Add Description**|
|documentId|Guid|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
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

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|account|[account](../resources/account.md)|**TODO: Add Description**|
|item|[item](../resources/item.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.salesOrderLine",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.salesOrderLine",
  "id": "String (identifier)",
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

