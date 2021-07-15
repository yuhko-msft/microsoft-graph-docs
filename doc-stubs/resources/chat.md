---
title: "chat resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# chat resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List chats](../api/chat-list.md)|[chat](../resources/chat.md) collection|Get a list of the [chat](../resources/chat.md) objects and their properties.|
|[Create chat](../api/chat-post-chats.md)|[chat](../resources/chat.md)|Create a new [chat](../resources/chat.md) object.|
|[Get chat](../api/chat-get.md)|[chat](../resources/chat.md)|Read the properties and relationships of a [chat](../resources/chat.md) object.|
|[Update chat](../api/chat-update.md)|[chat](../resources/chat.md)|Update the properties of a [chat](../resources/chat.md) object.|
|[Delete chat](../api/chat-delete.md)|None|Deletes a [chat](../resources/chat.md) object.|
|[sendActivityNotification](../api/chat-sendactivitynotification.md)|None|**TODO: Add Description**|
|[allMessages](../api/chat-allmessages.md)|[chatMessage](../resources/chatmessage.md) collection|**TODO: Add Description**|
|[getAllMessages](../api/chat-getallmessages.md)|[chatMessage](../resources/chatmessage.md) collection|**TODO: Add Description**|
|[List installedApps](../api/chat-list-installedapps.md)|[teamsAppInstallation](../resources/teamsappinstallation.md) collection|Get the teamsAppInstallation resources from the installedApps navigation property.|
|[Create teamsAppInstallation](../api/chat-post-installedapps.md)|[teamsAppInstallation](../resources/teamsappinstallation.md)|Create a new teamsAppInstallation object.|
|[List chatMessageInfo](../api/chat-list-lastmessagepreview.md)|[chatMessageInfo](../resources/chatmessageinfo.md) collection|Get the chatMessageInfo resources from the lastMessagePreview navigation property.|
|[Create chatMessageInfo](../api/chat-post-lastmessagepreview.md)|[chatMessageInfo](../resources/chatmessageinfo.md)|Create a new chatMessageInfo object.|
|[List members](../api/chat-list-members.md)|[conversationMember](../resources/conversationmember.md) collection|Get the conversationMember resources from the members navigation property.|
|[Create conversationMember](../api/chat-post-members.md)|[conversationMember](../resources/conversationmember.md)|Create a new conversationMember object.|
|[List messages](../api/chat-list-messages.md)|[chatMessage](../resources/chatmessage.md) collection|Get the chatMessage resources from the messages navigation property.|
|[Create chatMessage](../api/chat-post-messages.md)|[chatMessage](../resources/chatmessage.md)|Create a new chatMessage object.|
|[List operations](../api/chat-list-operations.md)|[teamsAsyncOperation](../resources/teamsasyncoperation.md) collection|Get the teamsAsyncOperation resources from the operations navigation property.|
|[Create teamsAsyncOperation](../api/chat-post-operations.md)|[teamsAsyncOperation](../resources/teamsasyncoperation.md)|Create a new teamsAsyncOperation object.|
|[List permissionGrants](../api/chat-list-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|Get the resourceSpecificPermissionGrant resources from the permissionGrants navigation property.|
|[Create resourceSpecificPermissionGrant](../api/chat-post-permissiongrants.md)|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md)|Create a new resourceSpecificPermissionGrant object.|
|[List tabs](../api/chat-list-tabs.md)|[teamsTab](../resources/teamstab.md) collection|Get the teamsTab resources from the tabs navigation property.|
|[Create teamsTab](../api/chat-post-tabs.md)|[teamsTab](../resources/teamstab.md)|Create a new teamsTab object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|chatType|chatType|**TODO: Add Description**. Possible values are: `oneOnOne`, `group`, `meeting`, `unknownFutureValue`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastUpdatedDateTime|DateTimeOffset|**TODO: Add Description**|
|topic|String|**TODO: Add Description**|
|viewpoint|[chatViewpoint](../resources/chatviewpoint.md)|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|installedApps|[teamsAppInstallation](../resources/teamsappinstallation.md) collection|**TODO: Add Description**|
|lastMessagePreview|[chatMessageInfo](../resources/chatmessageinfo.md)|**TODO: Add Description**|
|members|[conversationMember](../resources/conversationmember.md) collection|**TODO: Add Description**|
|messages|[chatMessage](../resources/chatmessage.md) collection|**TODO: Add Description**|
|operations|[teamsAsyncOperation](../resources/teamsasyncoperation.md) collection|**TODO: Add Description**|
|permissionGrants|[resourceSpecificPermissionGrant](../resources/resourcespecificpermissiongrant.md) collection|**TODO: Add Description**|
|tabs|[teamsTab](../resources/teamstab.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.chat",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.chat",
  "id": "String (identifier)",
  "chatType": "String",
  "createdDateTime": "String (timestamp)",
  "lastUpdatedDateTime": "String (timestamp)",
  "topic": "String",
  "viewpoint": {
    "@odata.type": "microsoft.graph.chatViewpoint"
  },
  "webUrl": "String"
}
```

