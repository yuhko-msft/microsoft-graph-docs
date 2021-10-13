---
title: "sharedWithChannelTeamInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# sharedWithChannelTeamInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [teamInfo](../resources/teaminfo.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List sharedWithChannelTeamInfoes](../api/sharedwithchannelteaminfo-list.md)|[sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) collection|Get a list of the [sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) objects and their properties.|
|[Create sharedWithChannelTeamInfo](../api/channel-post-sharedwithteams.md)|[sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md)|Create a new [sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) object.|
|[Get sharedWithChannelTeamInfo](../api/sharedwithchannelteaminfo-get.md)|[sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md)|Read the properties and relationships of a [sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) object.|
|[Update sharedWithChannelTeamInfo](../api/sharedwithchannelteaminfo-update.md)|[sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md)|Update the properties of a [sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) object.|
|[Delete sharedWithChannelTeamInfo](../api/sharedwithchannelteaminfo-delete.md)|None|Deletes a [sharedWithChannelTeamInfo](../resources/sharedwithchannelteaminfo.md) object.|
|[List allowedMembers](../api/sharedwithchannelteaminfo-list-allowedmembers.md)|[conversationMember](../resources/conversationmember.md) collection|Get the conversationMember resources from the allowedMembers navigation property.|
|[Add conversationMember](../api/sharedwithchannelteaminfo-post-allowedmembers.md)|[conversationMember](../resources/conversationmember.md)|Add allowedMembers by posting to the allowedMembers collection.|
|[List team](../api/sharedwithchannelteaminfo-list-team.md)|[team](../resources/team.md) collection|Get the team resources from the team navigation property.|
|[Add team](../api/sharedwithchannelteaminfo-post-team.md)|[team](../resources/team.md)|Add team by posting to the team collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md).|
|id|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md).|
|isHostTeam|Boolean|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|allowedMembers|[conversationMember](../resources/conversationmember.md) collection|**TODO: Add Description**|
|team|[team](../resources/team.md)|**TODO: Add Description** Inherited from [teamInfo](../resources/teaminfo.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharedWithChannelTeamInfo",
  "baseType": "Microsoft.Teams.GraphSvc.teamInfo",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharedWithChannelTeamInfo",
  "id": "String (identifier)",
  "tenantId": "String",
  "displayName": "String",
  "isHostTeam": "Boolean"
}
```

