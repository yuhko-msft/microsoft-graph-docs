---
title: "customer resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# customer resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List customers](../api/customer-list.md)|[customer](../resources/customer.md) collection|Get a list of the [customer](../resources/customer.md) objects and their properties.|
|[Create customer](../api/customer-create.md)|[customer](../resources/customer.md)|Create a new [customer](../resources/customer.md) object.|
|[Get customer](../api/customer-get.md)|[customer](../resources/customer.md)|Read the properties and relationships of a [customer](../resources/customer.md) object.|
|[Update customer](../api/customer-update.md)|[customer](../resources/customer.md)|Update the properties of a [customer](../resources/customer.md) object.|
|[Delete customer](../api/customer-delete.md)|None|Deletes a [customer](../resources/customer.md) object.|
|[List currency](../api/customer-list-currency.md)|[currency](../resources/currency.md) collection|Get the currency resources from the currency navigation property.|
|[Create currency](../api/customer-post-currency.md)|[currency](../resources/currency.md)|Create a new currency object.|
|[List paymentMethod](../api/customer-list-paymentmethod.md)|[paymentMethod](../resources/paymentmethod.md) collection|Get the paymentMethod resources from the paymentMethod navigation property.|
|[Create paymentMethod](../api/customer-post-paymentmethod.md)|[paymentMethod](../resources/paymentmethod.md)|Create a new paymentMethod object.|
|[List paymentTerm](../api/customer-list-paymentterm.md)|[paymentTerm](../resources/paymentterm.md) collection|Get the paymentTerm resources from the paymentTerm navigation property.|
|[Create paymentTerm](../api/customer-post-paymentterm.md)|[paymentTerm](../resources/paymentterm.md)|Create a new paymentTerm object.|
|[List picture](../api/customer-list-picture.md)|[picture](../resources/picture.md) collection|Get the picture resources from the picture navigation property.|
|[Create picture](../api/customer-post-picture.md)|[picture](../resources/picture.md)|Create a new picture object.|
|[List shipmentMethod](../api/customer-list-shipmentmethod.md)|[shipmentMethod](../resources/shipmentmethod.md) collection|Get the shipmentMethod resources from the shipmentMethod navigation property.|
|[Create shipmentMethod](../api/customer-post-shipmentmethod.md)|[shipmentMethod](../resources/shipmentmethod.md)|Create a new shipmentMethod object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|address|[postalAddressType](../resources/postaladdresstype.md)|**TODO: Add Description**|
|blocked|String|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currencyId|Guid|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|paymentMethodId|Guid|**TODO: Add Description**|
|paymentTermsId|Guid|**TODO: Add Description**|
|phoneNumber|String|**TODO: Add Description**|
|shipmentMethodId|Guid|**TODO: Add Description**|
|taxAreaDisplayName|String|**TODO: Add Description**|
|taxAreaId|Guid|**TODO: Add Description**|
|taxLiable|Boolean|**TODO: Add Description**|
|taxRegistrationNumber|String|**TODO: Add Description**|
|type|String|**TODO: Add Description**|
|website|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|currency|[currency](../resources/currency.md)|**TODO: Add Description**|
|paymentMethod|[paymentMethod](../resources/paymentmethod.md)|**TODO: Add Description**|
|paymentTerm|[paymentTerm](../resources/paymentterm.md)|**TODO: Add Description**|
|picture|[picture](../resources/picture.md) collection|**TODO: Add Description**|
|shipmentMethod|[shipmentMethod](../resources/shipmentmethod.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.customer",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.customer",
  "id": "String (identifier)",
  "address": {
    "@odata.type": "microsoft.graph.postalAddressType"
  },
  "blocked": "String",
  "currencyCode": "String",
  "currencyId": "Guid",
  "displayName": "String",
  "email": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "number": "String",
  "paymentMethodId": "Guid",
  "paymentTermsId": "Guid",
  "phoneNumber": "String",
  "shipmentMethodId": "Guid",
  "taxAreaDisplayName": "String",
  "taxAreaId": "Guid",
  "taxLiable": "Boolean",
  "taxRegistrationNumber": "String",
  "type": "String",
  "website": "String"
}
```

