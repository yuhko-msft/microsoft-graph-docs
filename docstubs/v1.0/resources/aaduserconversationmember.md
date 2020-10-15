---
title: "aadUserConversationMember resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# aadUserConversationMember resource type

Namespace: microsoft.graph

Inherits from [conversationMember](conversationmember.md)

## Methods

| Method                                                                         | Return Type                                                          | Description                                                               |
| :----------------------------------------------------------------------------- | :------------------------------------------------------------------- | :------------------------------------------------------------------------ |
| [List aadUserConversationMember](../api/aaduserconversationmember-list.md)     | [aadUserConversationMember](aadUserConversationMember.md) collection | List properties and relationships of an aadUserConversationMember object. |
| [Create aadUserConversationMember](../api/aaduserconversationmember-create.md) | [aadUserConversationMember](aadUserConversationMember.md)            | Create a new aadUserConversationMember object.                            |
| [Get aadUserConversationMember](../api/aaduserconversationmember-get.md)       | [aadUserConversationMember](aadUserConversationMember.md)            | Read properties and relationships of an aadUserConversationMember object. |
| [Update aadUserConversationMember](../api/aaduserconversationmember-update.md) | [aadUserConversationMember](aadUserConversationMember.md)            | Update the properties of an aadUserConversationMember object.             |
| [Delete aadUserConversationMember](../api/aaduserconversationmember-delete.md) |                                                                      | Delete an aadUserConversationMember object.                               |
| [List user](../api/aaduserconversationmember-list-user.md)                     | [user](../resources/-user.md)                                        | Get the user objects from a user navigation property.                     |
| [Add user](../api/aaduserconversationmember-post-user.md)                      | [user](../resources/-user.md)                                        | Add user by posting to the user collection.                               |
| [Get user](../api/aaduserconversationmember-get-user.md)                       | [user](../resources/-user.md)                                        | Read the properties and relationships of a user object.                   |
| [Update user](../api/aaduserconversationmember-update-user.md)                 | [user](../resources/-user.md)                                        | Update the properties of a user object.                                   |
| [Remove user](../api/aaduserconversationmember-delete-user.md)                 |                                                                      | Remove a user object.                                                     |

## Properties

| Property    | Type              | Description |
| :---------- | :---------------- | :---------- |
| displayName | String            |             |
| email       | String            |             |
| id          | String            | Read-only.  |
| roles       | String collection |             |
| userId      | String            |             |

## Relationships

| Relationship | Type                         | Description |
| :----------- | :--------------------------- | :---------- |
| user         | [user](../resources/user.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.aadUserConversationMember",
  "baseType": "microsoft.graph.conversationMember",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.aadUserConversationMember",
  "displayName": "String",
  "email": "String",
  "id": "String (identifier)",
  "roles": ["String"],
  "userId": "String"
}
```
