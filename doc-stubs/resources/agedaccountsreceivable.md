---
title: "agedAccountsReceivable resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# agedAccountsReceivable resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List agedAccountsReceivables](../api/agedaccountsreceivable-list.md)|[agedAccountsReceivable](../resources/agedaccountsreceivable.md) collection|Get a list of the [agedAccountsReceivable](../resources/agedaccountsreceivable.md) objects and their properties.|
|[Create agedAccountsReceivable](../api/agedaccountsreceivable-create.md)|[agedAccountsReceivable](../resources/agedaccountsreceivable.md)|Create a new [agedAccountsReceivable](../resources/agedaccountsreceivable.md) object.|
|[Get agedAccountsReceivable](../api/agedaccountsreceivable-get.md)|[agedAccountsReceivable](../resources/agedaccountsreceivable.md)|Read the properties and relationships of an [agedAccountsReceivable](../resources/agedaccountsreceivable.md) object.|
|[Update agedAccountsReceivable](../api/agedaccountsreceivable-update.md)|[agedAccountsReceivable](../resources/agedaccountsreceivable.md)|Update the properties of an [agedAccountsReceivable](../resources/agedaccountsreceivable.md) object.|
|[Delete agedAccountsReceivable](../api/agedaccountsreceivable-delete.md)|None|Deletes an [agedAccountsReceivable](../resources/agedaccountsreceivable.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|agedAsOfDate|Date|**TODO: Add Description**|
|balanceDue|Decimal|**TODO: Add Description**|
|currencyCode|String|**TODO: Add Description**|
|currentAmount|Decimal|**TODO: Add Description**|
|customerNumber|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|name|String|**TODO: Add Description**|
|period1Amount|Decimal|**TODO: Add Description**|
|period2Amount|Decimal|**TODO: Add Description**|
|period3Amount|Decimal|**TODO: Add Description**|
|periodLengthFilter|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.agedAccountsReceivable",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.agedAccountsReceivable",
  "id": "String (identifier)",
  "agedAsOfDate": "Date",
  "balanceDue": "Decimal",
  "currencyCode": "String",
  "currentAmount": "Decimal",
  "customerNumber": "String",
  "name": "String",
  "period1Amount": "Decimal",
  "period2Amount": "Decimal",
  "period3Amount": "Decimal",
  "periodLengthFilter": "String"
}
```

