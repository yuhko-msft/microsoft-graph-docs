---
title: "channel resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# channel resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List channels](../api/channel-list.md)|[channel](../resources/channel.md) collection|Get a list of the [channel](../resources/channel.md) objects and their properties.|
|[Create channel](../api/channel-create.md)|[channel](../resources/channel.md)|Create a new [channel](../resources/channel.md) object.|
|[Get channel](../api/channel-get.md)|[channel](../resources/channel.md)|Read the properties and relationships of a [channel](../resources/channel.md) object.|
|[Update channel](../api/channel-update.md)|[channel](../resources/channel.md)|Update the properties of a [channel](../resources/channel.md) object.|
|[Delete channel](../api/channel-delete.md)|None|Deletes a [channel](../resources/channel.md) object.|
|[completeMigration](../api/channel-completemigration.md)|None|**TODO: Add Description**|
|[provisionEmail](../api/channel-provisionemail.md)|[provisionChannelEmailResult](../resources/provisionchannelemailresult.md)|**TODO: Add Description**|
|[removeEmail](../api/channel-removeemail.md)|None|**TODO: Add Description**|
|[allMessages](../api/channel-allmessages.md)|[chatMessage](../resources/chatmessage.md) collection|**TODO: Add Description**|
|[getAllMessages](../api/channel-getallmessages.md)|[chatMessage](../resources/chatmessage.md) collection|**TODO: Add Description**|
|[List driveItem](../api/channel-list-filesfolder.md)|[driveItem](../resources/driveitem.md) collection|Get the driveItem resources from the filesFolder navigation property.|
|[Create driveItem](../api/channel-post-filesfolder.md)|[driveItem](../resources/driveitem.md)|Create a new driveItem object.|
|[List members](../api/channel-list-members.md)|[conversationMember](../resources/conversationmember.md) collection|Get the conversationMember resources from the members navigation property.|
|[Create conversationMember](../api/channel-post-members.md)|[conversationMember](../resources/conversationmember.md)|Create a new conversationMember object.|
|[List messages](../api/channel-list-messages.md)|[chatMessage](../resources/chatmessage.md) collection|Get the chatMessage resources from the messages navigation property.|
|[Create chatMessage](../api/channel-post-messages.md)|[chatMessage](../resources/chatmessage.md)|Create a new chatMessage object.|
|[List tabs](../api/channel-list-tabs.md)|[teamsTab](../resources/teamstab.md) collection|Get the teamsTab resources from the tabs navigation property.|
|[Create teamsTab](../api/channel-post-tabs.md)|[teamsTab](../resources/teamstab.md)|Create a new teamsTab object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|email|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|isFavoriteByDefault|Boolean|**TODO: Add Description**|
|membershipType|channelMembershipType|**TODO: Add Description**. Possible values are: `standard`, `private`, `unknownFutureValue`, `shared`.|
|moderationSettings|[channelModerationSettings](../resources/channelmoderationsettings.md)|**TODO: Add Description**|
|webUrl|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|filesFolder|[driveItem](../resources/driveitem.md)|**TODO: Add Description**|
|members|[conversationMember](../resources/conversationmember.md) collection|**TODO: Add Description**|
|messages|[chatMessage](../resources/chatmessage.md) collection|**TODO: Add Description**|
|tabs|[teamsTab](../resources/teamstab.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.channel",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.channel",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "email": "String",
  "isFavoriteByDefault": "Boolean",
  "membershipType": "String",
  "moderationSettings": {
    "@odata.type": "microsoft.graph.channelModerationSettings"
  },
  "webUrl": "String"
}
```

