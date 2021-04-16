---
title: "customerPayment resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# customerPayment resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List customerPayments](../api/customerpayment-list.md)|[customerPayment](../resources/customerpayment.md) collection|Get a list of the [customerPayment](../resources/customerpayment.md) objects and their properties.|
|[Create customerPayment](../api/customerpayment-create.md)|[customerPayment](../resources/customerpayment.md)|Create a new [customerPayment](../resources/customerpayment.md) object.|
|[Get customerPayment](../api/customerpayment-get.md)|[customerPayment](../resources/customerpayment.md)|Read the properties and relationships of a [customerPayment](../resources/customerpayment.md) object.|
|[Update customerPayment](../api/customerpayment-update.md)|[customerPayment](../resources/customerpayment.md)|Update the properties of a [customerPayment](../resources/customerpayment.md) object.|
|[Delete customerPayment](../api/customerpayment-delete.md)|None|Deletes a [customerPayment](../resources/customerpayment.md) object.|
|[List customer](../api/customerpayment-list-customer.md)|[customer](../resources/customer.md) collection|Get the customer resources from the customer navigation property.|
|[Create customer](../api/customerpayment-post-customer.md)|[customer](../resources/customer.md)|Create a new customer object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|journalDisplayName|String|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|lineNumber|Int32|**TODO: Add Description**|
|postingDate|Date|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|customer|[customer](../resources/customer.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.customerPayment",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.customerPayment",
  "id": "String (identifier)",
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

