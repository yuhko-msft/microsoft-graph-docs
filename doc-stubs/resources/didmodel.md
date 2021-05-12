---
title: "didModel resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# didModel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List didModels](../api/didmodel-list.md)|[didModel](../resources/didmodel.md) collection|Get a list of the [didModel](../resources/didmodel.md) objects and their properties.|
|[Create didModel](../api/didmodel-create.md)|[didModel](../resources/didmodel.md)|Create a new [didModel](../resources/didmodel.md) object.|
|[Get didModel](../api/didmodel-get.md)|[didModel](../resources/didmodel.md)|Read the properties and relationships of a [didModel](../resources/didmodel.md) object.|
|[Update didModel](../api/didmodel-update.md)|[didModel](../resources/didmodel.md)|Update the properties of a [didModel](../resources/didmodel.md) object.|
|[Delete didModel](../api/didmodel-delete.md)|None|Deletes a [didModel](../resources/didmodel.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|did|String|**TODO: Add Description**|
|encryptionKeys|String collection|**TODO: Add Description**|
|linkedDomainUrl|String|**TODO: Add Description**|
|recoveryKeys|String collection|**TODO: Add Description**|
|signingKeys|String collection|**TODO: Add Description**|
|updateKeys|String collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.didModel",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.didModel",
  "did": "String",
  "signingKeys": [
    "String"
  ],
  "recoveryKeys": [
    "String"
  ],
  "updateKeys": [
    "String"
  ],
  "encryptionKeys": [
    "String"
  ],
  "linkedDomainUrl": "String"
}
```

