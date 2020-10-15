---
title: "chat resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# chat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                      | Return Type                                                   | Description                                                                     |
| :---------------------------------------------------------- | :------------------------------------------------------------ | :------------------------------------------------------------------------------ |
| [List chat](../api/chat-list.md)                            | [chat](chat.md) collection                                    | List properties and relationships of a chat object.                             |
| [Create chat](../api/chat-create.md)                        | [chat](chat.md)                                               | Create a new chat object.                                                       |
| [Get chat](../api/chat-get.md)                              | [chat](chat.md)                                               | Read properties and relationships of a chat object.                             |
| [Update chat](../api/chat-update.md)                        | [chat](chat.md)                                               | Update the properties of a chat object.                                         |
| [Delete chat](../api/chat-delete.md)                        |                                                               | Delete a chat object.                                                           |
| [List installedApps](../api/chat-list-installedapps.md)     | [teamsAppInstallation](../resources/-teamsappinstallation.md) | Get the teamsAppInstallation objects from an installedApps navigation property. |
| [Create installedApps](../api/chat-post-installedapps.md)   | [teamsAppInstallation](../resources/-teamsappinstallation.md) | Create a new teamsAppInstallation object.                                       |
| [Get installedApps](../api/chat-get-installedapps.md)       | [teamsAppInstallation](../resources/-teamsappinstallation.md) | Read the properties and relationships of a teamsAppInstallation object.         |
| [Update installedApps](../api/chat-update-installedapps.md) | [teamsAppInstallation](../resources/-teamsappinstallation.md) | Update the properties of a teamsAppInstallation object.                         |
| [Delete installedApps](../api/chat-delete-installedapps.md) |                                                               | Delete a teamsAppInstallation object.                                           |
| [List members](../api/chat-list-members.md)                 | [conversationMember](../resources/-conversationmember.md)     | Get the conversationMember objects from a members navigation property.          |
| [Create members](../api/chat-post-members.md)               | [conversationMember](../resources/-conversationmember.md)     | Create a new conversationMember object.                                         |
| [Get members](../api/chat-get-members.md)                   | [conversationMember](../resources/-conversationmember.md)     | Read the properties and relationships of a conversationMember object.           |
| [Update members](../api/chat-update-members.md)             | [conversationMember](../resources/-conversationmember.md)     | Update the properties of a conversationMember object.                           |
| [Delete members](../api/chat-delete-members.md)             |                                                               | Delete a conversationMember object.                                             |
| [List messages](../api/chat-list-messages.md)               | [chatMessage](../resources/-chatmessage.md)                   | Get the chatMessage objects from a messages navigation property.                |
| [Create messages](../api/chat-post-messages.md)             | [chatMessage](../resources/-chatmessage.md)                   | Create a new chatMessage object.                                                |
| [Get messages](../api/chat-get-messages.md)                 | [chatMessage](../resources/-chatmessage.md)                   | Read the properties and relationships of a chatMessage object.                  |
| [Update messages](../api/chat-update-messages.md)           | [chatMessage](../resources/-chatmessage.md)                   | Update the properties of a chatMessage object.                                  |
| [Delete messages](../api/chat-delete-messages.md)           |                                                               | Delete a chatMessage object.                                                    |

## Properties

| Property            | Type           | Description |
| :------------------ | :------------- | :---------- |
| createdDateTime     | DateTimeOffset |             |
| id                  | String         | Read-only.  |
| lastUpdatedDateTime | DateTimeOffset |             |
| topic               | String         |             |

## Relationships

| Relationship  | Type                                                                    | Description |
| :------------ | :---------------------------------------------------------------------- | :---------- |
| installedApps | [teamsAppInstallation](../resources/teamsappinstallation.md) collection |             |
| members       | [conversationMember](../resources/conversationmember.md) collection     |             |
| messages      | [chatMessage](../resources/chatmessage.md) collection                   |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.chat",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.chat",
  "createdDateTime": "DateTimeOffset",
  "id": "String (identifier)",
  "lastUpdatedDateTime": "DateTimeOffset",
  "topic": "String"
}
```
