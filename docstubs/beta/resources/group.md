---
title: "group resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# group resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [directoryObject](directoryobject.md)

## Methods

| Method                                                           | Return Type                                               | Description                                                                  |
| :--------------------------------------------------------------- | :-------------------------------------------------------- | :--------------------------------------------------------------------------- |
| [List group](../api/group-list.md)                               | [group](group.md) collection                              | List properties and relationships of a group object.                         |
| [Create group](../api/group-create.md)                           | [group](group.md)                                         | Create a new group object.                                                   |
| [Get group](../api/group-get.md)                                 | [group](group.md)                                         | Read properties and relationships of a group object.                         |
| [Update group](../api/group-update.md)                           | [group](group.md)                                         | Update the properties of a group object.                                     |
| [Delete group](../api/group-delete.md)                           |                                                           | Delete a group object.                                                       |
| [addFavorite](../api/group-addFavorite.md)                       |                                                           |                                                                              |
| [removeFavorite](../api/group-removeFavorite.md)                 |                                                           |                                                                              |
| [resetUnseenCount](../api/group-resetUnseenCount.md)             |                                                           |                                                                              |
| [subscribeByMail](../api/group-subscribeByMail.md)               |                                                           |                                                                              |
| [unsubscribeByMail](../api/group-unsubscribeByMail.md)           |                                                           |                                                                              |
| [List acceptedSenders](../api/group-list-acceptedsenders.md)     | [directoryObject](../resources/-directoryobject.md)       | Get the directoryObject objects from an acceptedSenders navigation property. |
| [Create acceptedSenders](../api/group-post-acceptedsenders.md)   | [directoryObject](../resources/-directoryobject.md)       | Create a new directoryObject object.                                         |
| [Get acceptedSenders](../api/group-get-acceptedsenders.md)       | [directoryObject](../resources/-directoryobject.md)       | Read the properties and relationships of a directoryObject object.           |
| [Update acceptedSenders](../api/group-update-acceptedsenders.md) | [directoryObject](../resources/-directoryobject.md)       | Update the properties of a directoryObject object.                           |
| [Delete acceptedSenders](../api/group-delete-acceptedsenders.md) |                                                           | Delete a directoryObject object.                                             |
| [List calendar](../api/group-list-calendar.md)                   | [calendar](../resources/-calendar.md)                     | Get the calendar objects from a calendar navigation property.                |
| [Create calendar](../api/group-post-calendar.md)                 | [calendar](../resources/-calendar.md)                     | Create a new calendar object.                                                |
| [Get calendar](../api/group-get-calendar.md)                     | [calendar](../resources/-calendar.md)                     | Read the properties and relationships of a calendar object.                  |
| [Update calendar](../api/group-update-calendar.md)               | [calendar](../resources/-calendar.md)                     | Update the properties of a calendar object.                                  |
| [Delete calendar](../api/group-delete-calendar.md)               |                                                           | Delete a calendar object.                                                    |
| [List calendarView](../api/group-list-calendarview.md)           | [event](../resources/-event.md)                           | Get the event objects from a calendarView navigation property.               |
| [Create calendarView](../api/group-post-calendarview.md)         | [event](../resources/-event.md)                           | Create a new event object.                                                   |
| [Get calendarView](../api/group-get-calendarview.md)             | [event](../resources/-event.md)                           | Read the properties and relationships of an event object.                    |
| [Update calendarView](../api/group-update-calendarview.md)       | [event](../resources/-event.md)                           | Update the properties of an event object.                                    |
| [Delete calendarView](../api/group-delete-calendarview.md)       |                                                           | Delete an event object.                                                      |
| [List conversations](../api/group-list-conversations.md)         | [conversation](../resources/-conversation.md)             | Get the conversation objects from a conversations navigation property.       |
| [Create conversations](../api/group-post-conversations.md)       | [conversation](../resources/-conversation.md)             | Create a new conversation object.                                            |
| [Get conversations](../api/group-get-conversations.md)           | [conversation](../resources/-conversation.md)             | Read the properties and relationships of a conversation object.              |
| [Update conversations](../api/group-update-conversations.md)     | [conversation](../resources/-conversation.md)             | Update the properties of a conversation object.                              |
| [Delete conversations](../api/group-delete-conversations.md)     |                                                           | Delete a conversation object.                                                |
| [List events](../api/group-list-events.md)                       | [event](../resources/-event.md)                           | Get the event objects from an events navigation property.                    |
| [Create events](../api/group-post-events.md)                     | [event](../resources/-event.md)                           | Create a new event object.                                                   |
| [Get events](../api/group-get-events.md)                         | [event](../resources/-event.md)                           | Read the properties and relationships of an event object.                    |
| [Update events](../api/group-update-events.md)                   | [event](../resources/-event.md)                           | Update the properties of an event object.                                    |
| [Delete events](../api/group-delete-events.md)                   |                                                           | Delete an event object.                                                      |
| [List photo](../api/group-list-photo.md)                         | [profilePhoto](../resources/-profilephoto.md)             | Get the profilePhoto objects from a photo navigation property.               |
| [Create photo](../api/group-post-photo.md)                       | [profilePhoto](../resources/-profilephoto.md)             | Create a new profilePhoto object.                                            |
| [Get photo](../api/group-get-photo.md)                           | [profilePhoto](../resources/-profilephoto.md)             | Read the properties and relationships of a profilePhoto object.              |
| [Update photo](../api/group-update-photo.md)                     | [profilePhoto](../resources/-profilephoto.md)             | Update the properties of a profilePhoto object.                              |
| [Delete photo](../api/group-delete-photo.md)                     |                                                           | Delete a profilePhoto object.                                                |
| [List photos](../api/group-list-photos.md)                       | [profilePhoto](../resources/-profilephoto.md)             | Get the profilePhoto objects from a photos navigation property.              |
| [Create photos](../api/group-post-photos.md)                     | [profilePhoto](../resources/-profilephoto.md)             | Create a new profilePhoto object.                                            |
| [Get photos](../api/group-get-photos.md)                         | [profilePhoto](../resources/-profilephoto.md)             | Read the properties and relationships of a profilePhoto object.              |
| [Update photos](../api/group-update-photos.md)                   | [profilePhoto](../resources/-profilephoto.md)             | Update the properties of a profilePhoto object.                              |
| [Delete photos](../api/group-delete-photos.md)                   |                                                           | Delete a profilePhoto object.                                                |
| [List rejectedSenders](../api/group-list-rejectedsenders.md)     | [directoryObject](../resources/-directoryobject.md)       | Get the directoryObject objects from a rejectedSenders navigation property.  |
| [Create rejectedSenders](../api/group-post-rejectedsenders.md)   | [directoryObject](../resources/-directoryobject.md)       | Create a new directoryObject object.                                         |
| [Get rejectedSenders](../api/group-get-rejectedsenders.md)       | [directoryObject](../resources/-directoryobject.md)       | Read the properties and relationships of a directoryObject object.           |
| [Update rejectedSenders](../api/group-update-rejectedsenders.md) | [directoryObject](../resources/-directoryobject.md)       | Update the properties of a directoryObject object.                           |
| [Delete rejectedSenders](../api/group-delete-rejectedsenders.md) |                                                           | Delete a directoryObject object.                                             |
| [List threads](../api/group-list-threads.md)                     | [conversationThread](../resources/-conversationthread.md) | Get the conversationThread objects from a threads navigation property.       |
| [Create threads](../api/group-post-threads.md)                   | [conversationThread](../resources/-conversationthread.md) | Create a new conversationThread object.                                      |
| [Get threads](../api/group-get-threads.md)                       | [conversationThread](../resources/-conversationthread.md) | Read the properties and relationships of a conversationThread object.        |
| [Update threads](../api/group-update-threads.md)                 | [conversationThread](../resources/-conversationthread.md) | Update the properties of a conversationThread object.                        |
| [Delete threads](../api/group-delete-threads.md)                 |                                                           | Delete a conversationThread object.                                          |

## Properties

| Property                 | Type    | Description |
| :----------------------- | :------ | :---------- |
| accessType               | String  |             |
| allowExternalSenders     | Boolean |             |
| autoSubscribeNewMembers  | Boolean |             |
| hideFromAddressLists     | Boolean |             |
| hideFromOutlookClients   | Boolean |             |
| id                       | String  | Read-only.  |
| isFavorite               | Boolean |             |
| isSubscribedByMail       | Boolean |             |
| unseenConversationsCount | Int32   |             |
| unseenCount              | Int32   |             |
| unseenMessagesCount      | Int32   |             |

## Relationships

| Relationship    | Type                                                                | Description |
| :-------------- | :------------------------------------------------------------------ | :---------- |
| acceptedSenders | [directoryObject](../resources/directoryobject.md) collection       |             |
| calendar        | [calendar](../resources/calendar.md)                                |             |
| calendarView    | [event](../resources/event.md) collection                           |             |
| conversations   | [conversation](../resources/conversation.md) collection             |             |
| events          | [event](../resources/event.md) collection                           |             |
| photo           | [profilePhoto](../resources/profilephoto.md)                        |             |
| photos          | [profilePhoto](../resources/profilephoto.md) collection             |             |
| rejectedSenders | [directoryObject](../resources/directoryobject.md) collection       |             |
| threads         | [conversationThread](../resources/conversationthread.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.group",
  "baseType": "microsoft.graph.directoryObject",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.group",
  "accessType": "none | private | secret | public",
  "allowExternalSenders": "Boolean",
  "autoSubscribeNewMembers": "Boolean",
  "hideFromAddressLists": "Boolean",
  "hideFromOutlookClients": "Boolean",
  "id": "String (identifier)",
  "isFavorite": "Boolean",
  "isSubscribedByMail": "Boolean",
  "unseenConversationsCount": "Int32",
  "unseenCount": "Int32",
  "unseenMessagesCount": "Int32"
}
```
