---
title: "chatMessageHostedContent resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# chatMessageHostedContent resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                       | Return Type                                                        | Description                                                             |
| :--------------------------------------------------------------------------- | :----------------------------------------------------------------- | :---------------------------------------------------------------------- |
| [List chatMessageHostedContent](../api/chatmessagehostedcontent-list.md)     | [chatMessageHostedContent](chatMessageHostedContent.md) collection | List properties and relationships of a chatMessageHostedContent object. |
| [Create chatMessageHostedContent](../api/chatmessagehostedcontent-create.md) | [chatMessageHostedContent](chatMessageHostedContent.md)            | Create a new chatMessageHostedContent object.                           |
| [Get chatMessageHostedContent](../api/chatmessagehostedcontent-get.md)       | [chatMessageHostedContent](chatMessageHostedContent.md)            | Read properties and relationships of a chatMessageHostedContent object. |
| [Update chatMessageHostedContent](../api/chatmessagehostedcontent-update.md) | [chatMessageHostedContent](chatMessageHostedContent.md)            | Update the properties of a chatMessageHostedContent object.             |
| [Delete chatMessageHostedContent](../api/chatmessagehostedcontent-delete.md) |                                                                    | Delete a chatMessageHostedContent object.                               |

## Properties

| Property     | Type   | Description |
| :----------- | :----- | :---------- |
| contentBytes | Binary |             |
| contentType  | String |             |
| id           | String | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.chatMessageHostedContent",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.chatMessageHostedContent",
  "contentBytes": "Binary",
  "contentType": "String",
  "id": "String (identifier)"
}
```
