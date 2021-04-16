---
title: "journal resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# journal resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List journals](../api/journal-list.md)|[journal](../resources/journal.md) collection|Get a list of the [journal](../resources/journal.md) objects and their properties.|
|[Create journal](../api/journal-create.md)|[journal](../resources/journal.md)|Create a new [journal](../resources/journal.md) object.|
|[Get journal](../api/journal-get.md)|[journal](../resources/journal.md)|Read the properties and relationships of a [journal](../resources/journal.md) object.|
|[Update journal](../api/journal-update.md)|[journal](../resources/journal.md)|Update the properties of a [journal](../resources/journal.md) object.|
|[Delete journal](../api/journal-delete.md)|None|Deletes a [journal](../resources/journal.md) object.|
|[post](../api/journal-post.md)|None|**TODO: Add Description**|
|[List account](../api/journal-list-account.md)|[account](../resources/account.md) collection|Get the account resources from the account navigation property.|
|[Create account](../api/journal-post-account.md)|[account](../resources/account.md)|Create a new account object.|
|[List journalLines](../api/journal-list-journallines.md)|[journalLine](../resources/journalline.md) collection|Get the journalLine resources from the journalLines navigation property.|
|[Create journalLine](../api/journal-post-journallines.md)|[journalLine](../resources/journalline.md)|Create a new journalLine object.|

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
|journalLines|[journalLine](../resources/journalline.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.journal",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.journal",
  "id": "String (identifier)",
  "balancingAccountId": "Guid",
  "balancingAccountNumber": "String",
  "code": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)"
}
```

