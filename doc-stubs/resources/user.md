---
title: "user resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# user resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [directoryObject](../resources/directoryobject.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List users](../api/user-list.md)|[user](../resources/user.md) collection|Get a list of the [user](../resources/user.md) objects and their properties.|
|[Create user](../api/user-post-users.md)|[user](../resources/user.md)|Create a new [user](../resources/user.md) object.|
|[Get user](../api/user-get.md)|[user](../resources/user.md)|Read the properties and relationships of a [user](../resources/user.md) object.|
|[Update user](../api/user-update.md)|[user](../resources/user.md)|Update the properties of a [user](../resources/user.md) object.|
|[Delete user](../api/user-delete.md)|None|Deletes a [user](../resources/user.md) object.|
|[List chats](../api/user-list-chats.md)|[chat](../resources/chat.md) collection|Get the chat resources from the chats navigation property.|
|[Create chat](../api/user-post-chats.md)|[chat](../resources/chat.md)|Create a new chat object.|
|[List joinedTeams](../api/user-list-joinedteams.md)|[team](../resources/team.md) collection|Get the team resources from the joinedTeams navigation property.|
|[Add team](../api/user-post-joinedteams.md)|[team](../resources/team.md)|Add joinedTeams by posting to the joinedTeams collection.|
|[List userTeamwork](../api/user-list-teamwork.md)|[userTeamwork](../resources/userteamwork.md) collection|Get the userTeamwork resources from the teamwork navigation property.|
|[Create userTeamwork](../api/user-post-teamwork.md)|[userTeamwork](../resources/userteamwork.md)|Create a new userTeamwork object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [directoryObject](../resources/directoryobject.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|chats|[chat](../resources/chat.md) collection|**TODO: Add Description**|
|joinedTeams|[team](../resources/team.md) collection|**TODO: Add Description**|
|teamwork|[userTeamwork](../resources/userteamwork.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.user",
  "baseType": "Microsoft.Teams.GraphSvc.directoryObject",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.user",
  "id": "String (identifier)"
}
```

