---
title: "customerPaymentJournal resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# customerPaymentJournal resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List customerPaymentJournals](../api/customerpaymentjournal-list.md)|[customerPaymentJournal](../resources/customerpaymentjournal.md) collection|Get a list of the [customerPaymentJournal](../resources/customerpaymentjournal.md) objects and their properties.|
|[Create customerPaymentJournal](../api/customerpaymentjournal-create.md)|[customerPaymentJournal](../resources/customerpaymentjournal.md)|Create a new [customerPaymentJournal](../resources/customerpaymentjournal.md) object.|
|[Get customerPaymentJournal](../api/customerpaymentjournal-get.md)|[customerPaymentJournal](../resources/customerpaymentjournal.md)|Read the properties and relationships of a [customerPaymentJournal](../resources/customerpaymentjournal.md) object.|
|[Update customerPaymentJournal](../api/customerpaymentjournal-update.md)|[customerPaymentJournal](../resources/customerpaymentjournal.md)|Update the properties of a [customerPaymentJournal](../resources/customerpaymentjournal.md) object.|
|[Delete customerPaymentJournal](../api/customerpaymentjournal-delete.md)|None|Deletes a [customerPaymentJournal](../resources/customerpaymentjournal.md) object.|
|[List account](../api/customerpaymentjournal-list-account.md)|[account](../resources/account.md) collection|Get the account resources from the account navigation property.|
|[Create account](../api/customerpaymentjournal-post-account.md)|[account](../resources/account.md)|Create a new account object.|
|[List customerPayments](../api/customerpaymentjournal-list-customerpayments.md)|[customerPayment](../resources/customerpayment.md) collection|Get the customerPayment resources from the customerPayments navigation property.|
|[Create customerPayment](../api/customerpaymentjournal-post-customerpayments.md)|[customerPayment](../resources/customerpayment.md)|Create a new customerPayment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|balancingAccountId|Guid|**TODO: Add Description**|
|balancingAccountNumber|String|**TODO: Add Description**|
|code|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|account|[account](../resources/account.md)|**TODO: Add Description**|
|customerPayments|[customerPayment](../resources/customerpayment.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.customerPaymentJournal",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.customerPaymentJournal",
  "id": "String (identifier)",
  "balancingAccountId": "Guid",
  "balancingAccountNumber": "String",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

