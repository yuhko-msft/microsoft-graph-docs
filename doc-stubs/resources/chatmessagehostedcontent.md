---
title: "chatMessageHostedContent resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# chatMessageHostedContent resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List chatMessageHostedContents](../api/chatmessagehostedcontent-list.md)|[chatMessageHostedContent](../resources/chatmessagehostedcontent.md) collection|Get a list of the [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) objects and their properties.|
|[Create chatMessageHostedContent](../api/chatmessagehostedcontent-create.md)|[chatMessageHostedContent](../resources/chatmessagehostedcontent.md)|Create a new [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) object.|
|[Get chatMessageHostedContent](../api/chatmessagehostedcontent-get.md)|[chatMessageHostedContent](../resources/chatmessagehostedcontent.md)|Read the properties and relationships of a [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) object.|
|[Update chatMessageHostedContent](../api/chatmessagehostedcontent-update.md)|[chatMessageHostedContent](../resources/chatmessagehostedcontent.md)|Update the properties of a [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) object.|
|[Delete chatMessageHostedContent](../api/chatmessagehostedcontent-delete.md)|None|Deletes a [chatMessageHostedContent](../resources/chatmessagehostedcontent.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|contentBytes|Binary|**TODO: Add Description**|
|contentType|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.chatMessageHostedContent",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.chatMessageHostedContent",
  "id": "String (identifier)",
  "contentBytes": "Binary",
  "contentType": "String"
}
```

