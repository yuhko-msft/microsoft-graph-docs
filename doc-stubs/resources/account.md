---
title: "account resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# account resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List accounts](../api/account-list.md)|[account](../resources/account.md) collection|Get a list of the [account](../resources/account.md) objects and their properties.|
|[Create account](../api/account-create.md)|[account](../resources/account.md)|Create a new [account](../resources/account.md) object.|
|[Get account](../api/account-get.md)|[account](../resources/account.md)|Read the properties and relationships of an [account](../resources/account.md) object.|
|[Update account](../api/account-update.md)|[account](../resources/account.md)|Update the properties of an [account](../resources/account.md) object.|
|[Delete account](../api/account-delete.md)|None|Deletes an [account](../resources/account.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blocked|Boolean|**TODO: Add Description**|
|category|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|number|String|**TODO: Add Description**|
|subCategory|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.account",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.account",
  "id": "String (identifier)",
  "blocked": "Boolean",
  "category": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "number": "String",
  "subCategory": "String"
}
```

