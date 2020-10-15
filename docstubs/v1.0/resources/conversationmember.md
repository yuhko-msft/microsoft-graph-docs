---
title: "conversationMember resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# conversationMember resource type

Namespace: microsoft.graph

## Methods

| Method                                                           | Return Type                                            | Description                                                       |
| :--------------------------------------------------------------- | :----------------------------------------------------- | :---------------------------------------------------------------- |
| [List conversationMember](../api/conversationmember-list.md)     | [conversationMember](conversationMember.md) collection | List properties and relationships of a conversationMember object. |
| [Create conversationMember](../api/conversationmember-create.md) | [conversationMember](conversationMember.md)            | Create a new conversationMember object.                           |
| [Get conversationMember](../api/conversationmember-get.md)       | [conversationMember](conversationMember.md)            | Read properties and relationships of a conversationMember object. |
| [Update conversationMember](../api/conversationmember-update.md) | [conversationMember](conversationMember.md)            | Update the properties of a conversationMember object.             |
| [Delete conversationMember](../api/conversationmember-delete.md) |                                                        | Delete a conversationMember object.                               |

## Properties

| Property    | Type              | Description |
| :---------- | :---------------- | :---------- |
| displayName | String            |             |
| id          | String            | Read-only.  |
| roles       | String collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.conversationMember",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.conversationMember",
  "displayName": "String",
  "id": "String (identifier)",
  "roles": ["String"]
}
```
