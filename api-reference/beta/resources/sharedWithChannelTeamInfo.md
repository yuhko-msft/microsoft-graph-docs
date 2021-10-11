---
title: "sharedWithChannelTeamInfo resource type"
description: "A sharedWithChannelTeam represents a team that is shared with a channel."
author: "devjha-ms"
ms.localizationpriority: high
ms.prod: "microsoft-teams"
doc_type: resourcePageType
---

# sharedWithChannelTeamInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A sharedWithChannelTeamInfo represents a [team](team.md) that is shared with a channel. A [team](team.md) can be shared with multiple channels.


## Methods

| Method       | Return Type  |Description|
|:---------------|:--------|:----------|
|[List allowed members](../api/sharedwithchannelteaminfo-list-allowed-members.md)|[conversationMember](conversationmember.md) collection|Get the list of members in the team that has access to the channel this [team](team.md) is shared with.|
|[Unshare team from channel](../api/channel-unshare-team.md) | None | Unshare a team from channel.|

## Properties

| Property | Type | Description |
|:---------------|:--------|:----------|
|displayName|string| The name of the team. |
|isHostTeam|Boolean|Whether the [team](team.md) is the host of the [channel](channel.md).|
|tenantId |string | The ID of the Azure Active Directory tenant. |

## Relationships

| Relationship | Type | Description |
|:---------------|:--------|:----------|
|allowedMembers|[conversationMember](../resources/conversationmember.md) collection|Members and owners of the team.|

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.sharedWithChannelTeamInfo",
  "baseType": "microsoft.graph.teamInfo",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.sharedWithChannelTeamInfo",
  "id": "string (identifier)",
  "displayName": "string",
  "isHostTeam": "boolean",
  "tenantId": "string"
}
```

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2021-10-10 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "sharedWithChannelTeamInfo resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": []
}
-->



