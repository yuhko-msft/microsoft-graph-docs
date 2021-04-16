---
title: "journalLine resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# journalLine resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List journalLines](../api/journalline-list.md)|[journalLine](../resources/journalline.md) collection|Get a list of the [journalLine](../resources/journalline.md) objects and their properties.|
|[Create journalLine](../api/journalline-create.md)|[journalLine](../resources/journalline.md)|Create a new [journalLine](../resources/journalline.md) object.|
|[Get journalLine](../api/journalline-get.md)|[journalLine](../resources/journalline.md)|Read the properties and relationships of a [journalLine](../resources/journalline.md) object.|
|[Update journalLine](../api/journalline-update.md)|[journalLine](../resources/journalline.md)|Update the properties of a [journalLine](../resources/journalline.md) object.|
|[Delete journalLine](../api/journalline-delete.md)|None|Deletes a [journalLine](../resources/journalline.md) object.|
|[List account](../api/journalline-list-account.md)|[account](../resources/account.md) collection|Get the account resources from the account navigation property.|
|[Create account](../api/journalline-post-account.md)|[account](../resources/account.md)|Create a new account object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountId|Guid|**TODO: Add Description**|
|accountNumber|String|**TODO: Add Description**|
|amount|Decimal|**TODO: Add Description**|
|comment|String|**TODO: Add Description**|
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
|account|[account](../resources/account.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.journalLine",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.journalLine",
  "id": "String (identifier)",
  "accountId": "Guid",
  "accountNumber": "String",
  "amount": "Decimal",
  "comment": "String",
  "description": "String",
  "documentNumber": "String",
  "externalDocumentNumber": "String",
  "journalDisplayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "lineNumber": "Integer",
  "postingDate": "Date"
}
```

