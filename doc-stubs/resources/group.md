---
title: "group resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# group resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List joinedGroups](../api/user-list-joinedgroups.md)|[group](../resources/group.md) collection|Get the groups from the joinedGroups navigation property.|
|[Create joinedGroups](../api/user-post-joinedgroups.md)|[group](../resources/group.md)|Create a new joinedGroups object.|
|[Update joinedGroups](../api/user-update-joinedgroups.md)|[group](../resources/group.md)|Update the properties of a joinedGroups object.|
|[Get joinedGroups](../api/user-get-group.md)|[group](../resources/group.md)|Read the properties and relationships of a [group](../resources/group.md) object.|
|[Delete joinedGroups](../api/user-delete-joinedgroups.md)|None|Delete a [group](../resources/group.md) object.|
|[List groups](../api/group-list.md)|[group](../resources/group.md) collection|Get a list of the [group](../resources/group.md) objects and their properties.|
|[Create group](../api/group-post-groups.md)|[group](../resources/group.md)|Create a new [group](../resources/group.md) object.|
|[Get group](../api/group-get.md)|[group](../resources/group.md)|Read the properties and relationships of a [group](../resources/group.md) object.|
|[Update group](../api/group-update.md)|[group](../resources/group.md)|Update the properties of a [group](../resources/group.md) object.|
|[Delete group](../api/group-delete.md)|None|Deletes a [group](../resources/group.md) object.|
|[subscribeByMail](../api/group-subscribebymail.md)|None|**TODO: Add Description**|
|[unsubscribeByMail](../api/group-unsubscribebymail.md)|None|**TODO: Add Description**|
|[addFavorite](../api/group-addfavorite.md)|None|**TODO: Add Description**|
|[removeFavorite](../api/group-removefavorite.md)|None|**TODO: Add Description**|
|[resetUnseenCount](../api/group-resetunseencount.md)|None|**TODO: Add Description**|
|[List acceptedSenders](../api/group-list-acceptedsenders.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObjects from the acceptedSenders navigation property.|
|[Create acceptedSenders](../api/group-post-acceptedsenders.md)|[directoryObject](../resources/directoryobject.md)|Create a new acceptedSenders object.|
|[Get acceptedSenders](../api/group-get-directoryobject.md)|[directoryObject](../resources/directoryobject.md)|Read the properties and relationships of a [directoryObject](../resources/directoryobject.md) object.|
|[Update acceptedSenders](../api/group-update-acceptedsenders.md)|[directoryObject](../resources/directoryobject.md)|Update the properties of an acceptedSenders object.|
|[Delete acceptedSenders](../api/group-delete-acceptedsenders.md)|None|Delete a [directoryObject](../resources/directoryobject.md) object.|
|[List calendar](../api/group-list-calendar.md)|[calendar](../resources/calendar.md) collection|Get the calendars from the calendar navigation property.|
|[Create calendar](../api/group-post-calendar.md)|[calendar](../resources/calendar.md)|Create a new calendar object.|
|[Get calendar](../api/group-get-calendar.md)|[calendar](../resources/calendar.md)|Read the properties and relationships of a [calendar](../resources/calendar.md) object.|
|[Update calendar](../api/group-update-calendar.md)|[calendar](../resources/calendar.md)|Update the properties of a calendar object.|
|[Delete calendar](../api/group-delete-calendar.md)|None|Delete a [calendar](../resources/calendar.md) object.|
|[List calendarView](../api/group-list-calendarview.md)|[event](../resources/event.md) collection|Get the events from the calendarView navigation property.|
|[Create calendarView](../api/group-post-calendarview.md)|[event](../resources/event.md)|Create a new calendarView object.|
|[Get calendarView](../api/group-get-event.md)|[event](../resources/event.md)|Read the properties and relationships of an [event](../resources/event.md) object.|
|[Update calendarView](../api/group-update-calendarview.md)|[event](../resources/event.md)|Update the properties of a calendarView object.|
|[Delete calendarView](../api/group-delete-calendarview.md)|None|Delete an [event](../resources/event.md) object.|
|[List conversations](../api/group-list-conversations.md)|[conversation](../resources/conversation.md) collection|Get the conversations from the conversations navigation property.|
|[Create conversations](../api/group-post-conversations.md)|[conversation](../resources/conversation.md)|Create a new conversations object.|
|[Get conversations](../api/group-get-conversation.md)|[conversation](../resources/conversation.md)|Read the properties and relationships of a [conversation](../resources/conversation.md) object.|
|[Update conversations](../api/group-update-conversations.md)|[conversation](../resources/conversation.md)|Update the properties of a conversations object.|
|[Delete conversations](../api/group-delete-conversations.md)|None|Delete a [conversation](../resources/conversation.md) object.|
|[List events](../api/group-list-events.md)|[event](../resources/event.md) collection|Get the events from the events navigation property.|
|[Create events](../api/group-post-events.md)|[event](../resources/event.md)|Create a new events object.|
|[Get events](../api/group-get-event.md)|[event](../resources/event.md)|Read the properties and relationships of an [event](../resources/event.md) object.|
|[Update events](../api/group-update-events.md)|[event](../resources/event.md)|Update the properties of an events object.|
|[Delete events](../api/group-delete-events.md)|None|Delete an [event](../resources/event.md) object.|
|[List photo](../api/group-list-photo.md)|[profilePhoto](../resources/profilephoto.md) collection|Get the profilePhotoes from the photo navigation property.|
|[Create photo](../api/group-post-photo.md)|[profilePhoto](../resources/profilephoto.md)|Create a new photo object.|
|[Get photo](../api/group-get-profilephoto.md)|[profilePhoto](../resources/profilephoto.md)|Read the properties and relationships of a [profilePhoto](../resources/profilephoto.md) object.|
|[Update photo](../api/group-update-photo.md)|[profilePhoto](../resources/profilephoto.md)|Update the properties of a photo object.|
|[Delete photo](../api/group-delete-photo.md)|None|Delete a [profilePhoto](../resources/profilephoto.md) object.|
|[List photos](../api/group-list-photos.md)|[profilePhoto](../resources/profilephoto.md) collection|Get the profilePhotoes from the photos navigation property.|
|[Create photos](../api/group-post-photos.md)|[profilePhoto](../resources/profilephoto.md)|Create a new photos object.|
|[Get photos](../api/group-get-profilephoto.md)|[profilePhoto](../resources/profilephoto.md)|Read the properties and relationships of a [profilePhoto](../resources/profilephoto.md) object.|
|[Update photos](../api/group-update-photos.md)|[profilePhoto](../resources/profilephoto.md)|Update the properties of a photos object.|
|[Delete photos](../api/group-delete-photos.md)|None|Delete a [profilePhoto](../resources/profilephoto.md) object.|
|[List rejectedSenders](../api/group-list-rejectedsenders.md)|[directoryObject](../resources/directoryobject.md) collection|Get the directoryObjects from the rejectedSenders navigation property.|
|[Create rejectedSenders](../api/group-post-rejectedsenders.md)|[directoryObject](../resources/directoryobject.md)|Create a new rejectedSenders object.|
|[Get rejectedSenders](../api/group-get-directoryobject.md)|[directoryObject](../resources/directoryobject.md)|Read the properties and relationships of a [directoryObject](../resources/directoryobject.md) object.|
|[Update rejectedSenders](../api/group-update-rejectedsenders.md)|[directoryObject](../resources/directoryobject.md)|Update the properties of a rejectedSenders object.|
|[Delete rejectedSenders](../api/group-delete-rejectedsenders.md)|None|Delete a [directoryObject](../resources/directoryobject.md) object.|
|[List threads](../api/group-list-threads.md)|[conversationThread](../resources/conversationthread.md) collection|Get the conversationThreads from the threads navigation property.|
|[Create threads](../api/group-post-threads.md)|[conversationThread](../resources/conversationthread.md)|Create a new threads object.|
|[Get threads](../api/group-get-conversationthread.md)|[conversationThread](../resources/conversationthread.md)|Read the properties and relationships of a [conversationThread](../resources/conversationthread.md) object.|
|[Update threads](../api/group-update-threads.md)|[conversationThread](../resources/conversationthread.md)|Update the properties of a threads object.|
|[Delete threads](../api/group-delete-threads.md)|None|Delete a [conversationThread](../resources/conversationthread.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessType|groupAccessType|**TODO: Add Description**. Possible values are: `none`, `private`, `secret`, `public`.|
|allowExternalSenders|Boolean|**TODO: Add Description**|
|autoSubscribeNewMembers|Boolean|**TODO: Add Description**|
|hideFromAddressLists|Boolean|**TODO: Add Description**|
|hideFromOutlookClients|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isFavorite|Boolean|**TODO: Add Description**|
|isSubscribedByMail|Boolean|**TODO: Add Description**|
|unseenConversationsCount|Int32|**TODO: Add Description**|
|unseenCount|Int32|**TODO: Add Description**|
|unseenMessagesCount|Int32|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|acceptedSenders|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|calendar|[calendar](../resources/calendar.md)|**TODO: Add Description**|
|calendarView|[event](../resources/event.md) collection|**TODO: Add Description**|
|conversations|[conversation](../resources/conversation.md) collection|**TODO: Add Description**|
|events|[event](../resources/event.md) collection|**TODO: Add Description**|
|photo|[profilePhoto](../resources/profilephoto.md)|**TODO: Add Description**|
|photos|[profilePhoto](../resources/profilephoto.md) collection|**TODO: Add Description**|
|rejectedSenders|[directoryObject](../resources/directoryobject.md) collection|**TODO: Add Description**|
|threads|[conversationThread](../resources/conversationthread.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.group",
  "baseType": "microsoft.graph.directoryObject",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.group",
  "id": "String (identifier)",
  "accessType": "String",
  "allowExternalSenders": "Boolean",
  "autoSubscribeNewMembers": "Boolean",
  "isFavorite": "Boolean",
  "isSubscribedByMail": "Boolean",
  "unseenCount": "Integer",
  "unseenConversationsCount": "Integer",
  "unseenMessagesCount": "Integer",
  "hideFromOutlookClients": "Boolean",
  "hideFromAddressLists": "Boolean"
}
```

