---
title: "channel resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# channel resource type

Namespace: microsoft.graph

## Methods

| Method                                                     | Return Type                                               | Description                                                            |
| :--------------------------------------------------------- | :-------------------------------------------------------- | :--------------------------------------------------------------------- |
| [List channel](../api/channel-list.md)                     | [channel](channel.md) collection                          | List properties and relationships of a channel object.                 |
| [Create channel](../api/channel-create.md)                 | [channel](channel.md)                                     | Create a new channel object.                                           |
| [Get channel](../api/channel-get.md)                       | [channel](channel.md)                                     | Read properties and relationships of a channel object.                 |
| [Update channel](../api/channel-update.md)                 | [channel](channel.md)                                     | Update the properties of a channel object.                             |
| [Delete channel](../api/channel-delete.md)                 |                                                           | Delete a channel object.                                               |
| [List filesFolder](../api/channel-list-filesfolder.md)     | [driveItem](../resources/-driveitem.md)                   | Get the driveItem objects from a filesFolder navigation property.      |
| [Create filesFolder](../api/channel-post-filesfolder.md)   | [driveItem](../resources/-driveitem.md)                   | Create a new driveItem object.                                         |
| [Get filesFolder](../api/channel-get-filesfolder.md)       | [driveItem](../resources/-driveitem.md)                   | Read the properties and relationships of a driveItem object.           |
| [Update filesFolder](../api/channel-update-filesfolder.md) | [driveItem](../resources/-driveitem.md)                   | Update the properties of a driveItem object.                           |
| [Delete filesFolder](../api/channel-delete-filesfolder.md) |                                                           | Delete a driveItem object.                                             |
| [List members](../api/channel-list-members.md)             | [conversationMember](../resources/-conversationmember.md) | Get the conversationMember objects from a members navigation property. |
| [Create members](../api/channel-post-members.md)           | [conversationMember](../resources/-conversationmember.md) | Create a new conversationMember object.                                |
| [Get members](../api/channel-get-members.md)               | [conversationMember](../resources/-conversationmember.md) | Read the properties and relationships of a conversationMember object.  |
| [Update members](../api/channel-update-members.md)         | [conversationMember](../resources/-conversationmember.md) | Update the properties of a conversationMember object.                  |
| [Delete members](../api/channel-delete-members.md)         |                                                           | Delete a conversationMember object.                                    |
| [List messages](../api/channel-list-messages.md)           | [chatMessage](../resources/-chatmessage.md)               | Get the chatMessage objects from a messages navigation property.       |
| [Create messages](../api/channel-post-messages.md)         | [chatMessage](../resources/-chatmessage.md)               | Create a new chatMessage object.                                       |
| [Get messages](../api/channel-get-messages.md)             | [chatMessage](../resources/-chatmessage.md)               | Read the properties and relationships of a chatMessage object.         |
| [Update messages](../api/channel-update-messages.md)       | [chatMessage](../resources/-chatmessage.md)               | Update the properties of a chatMessage object.                         |
| [Delete messages](../api/channel-delete-messages.md)       |                                                           | Delete a chatMessage object.                                           |
| [List tabs](../api/channel-list-tabs.md)                   | [teamsTab](../resources/-teamstab.md)                     | Get the teamsTab objects from a tabs navigation property.              |
| [Create tabs](../api/channel-post-tabs.md)                 | [teamsTab](../resources/-teamstab.md)                     | Create a new teamsTab object.                                          |
| [Get tabs](../api/channel-get-tabs.md)                     | [teamsTab](../resources/-teamstab.md)                     | Read the properties and relationships of a teamsTab object.            |
| [Update tabs](../api/channel-update-tabs.md)               | [teamsTab](../resources/-teamstab.md)                     | Update the properties of a teamsTab object.                            |
| [Delete tabs](../api/channel-delete-tabs.md)               |                                                           | Delete a teamsTab object.                                              |

## Properties

| Property       | Type   | Description |
| :------------- | :----- | :---------- |
| description    | String |             |
| displayName    | String |             |
| email          | String |             |
| id             | String | Read-only.  |
| membershipType | String |             |
| webUrl         | String |             |

## Relationships

| Relationship | Type                                                                | Description |
| :----------- | :------------------------------------------------------------------ | :---------- |
| filesFolder  | [driveItem](../resources/driveitem.md)                              |             |
| members      | [conversationMember](../resources/conversationmember.md) collection |             |
| messages     | [chatMessage](../resources/chatmessage.md) collection               |             |
| tabs         | [teamsTab](../resources/teamstab.md) collection                     |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.channel",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.channel",
  "description": "String",
  "displayName": "String",
  "email": "String",
  "id": "String (identifier)",
  "membershipType": "standard | private | unknownFutureValue",
  "webUrl": "String"
}
```
