---
title: "generalLedgerEntry resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# generalLedgerEntry resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List generalLedgerEntries](../api/generalledgerentry-list.md)|[generalLedgerEntry](../resources/generalledgerentry.md) collection|Get a list of the [generalLedgerEntry](../resources/generalledgerentry.md) objects and their properties.|
|[Create generalLedgerEntry](../api/generalledgerentry-create.md)|[generalLedgerEntry](../resources/generalledgerentry.md)|Create a new [generalLedgerEntry](../resources/generalledgerentry.md) object.|
|[Get generalLedgerEntry](../api/generalledgerentry-get.md)|[generalLedgerEntry](../resources/generalledgerentry.md)|Read the properties and relationships of a [generalLedgerEntry](../resources/generalledgerentry.md) object.|
|[Update generalLedgerEntry](../api/generalledgerentry-update.md)|[generalLedgerEntry](../resources/generalledgerentry.md)|Update the properties of a [generalLedgerEntry](../resources/generalledgerentry.md) object.|
|[Delete generalLedgerEntry](../api/generalledgerentry-delete.md)|None|Deletes a [generalLedgerEntry](../resources/generalledgerentry.md) object.|
|[List account](../api/generalledgerentry-list-account.md)|[account](../resources/account.md) collection|Get the account resources from the account navigation property.|
|[Create account](../api/generalledgerentry-post-account.md)|[account](../resources/account.md)|Create a new account object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountId|Guid|**TODO: Add Description**|
|accountNumber|String|**TODO: Add Description**|
|creditAmount|Decimal|**TODO: Add Description**|
|debitAmount|Decimal|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|documentNumber|String|**TODO: Add Description**|
|documentType|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|postingDate|Date|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|account|[account](../resources/account.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.generalLedgerEntry",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.generalLedgerEntry",
  "id": "String (identifier)",
  "accountId": "Guid",
  "accountNumber": "String",
  "creditAmount": "Decimal",
  "debitAmount": "Decimal",
  "description": "String",
  "documentNumber": "String",
  "documentType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "postingDate": "Date"
}
```

