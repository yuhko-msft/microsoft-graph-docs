---
title: "chatsAppInstallation resource type"
description: " The aim of this feature is to add graph APIS for CRUD of apps in chats and meetings."
author: "clearab"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: resourcePageType
---

# chatsAppInstallation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A [teamsApp](teamsapp.md) installed in a [team](team.md), a [chat](chat.md), or the personal scope of a [user](user.md). Any bots that are part of the app will become part of any team, chat, or user's personal scope that the app is added to.

## Methods

| Method       | Return Type  |Description|
|:---------------|:--------|:----------|
|[Install App in a chat](../api/chatappinstallation-install.md) | [teamsAppInstallation](teamsappinstallation.md) collection | Lists apps installed in a team.|
|[List App in chat ](../api/teamsappinstallation-add.md) |None | Adds (installs) an app to a team.|
|[Get App in chat](../api/teamsappinstallation-delete.md) | None | Removes (uninstalls) an app from a team.|
|[Upgrade App in chat](../api/teamsappinstallation-upgrade.md) | None | Upgrades to the latest version of the app installed in team.|
|[Uninstall App from chat](../api/user-list-teamsappinstallation.md) | [teamsAppInstallation](teamsappinstallation.md) collection | Lists apps installed in the personal scope of a user.|

## Properties

| Property            | Type     | Description |
|:------------------- |:-------- |:----------- |
| id                  | string   | A unique ID (not the team's ap ID). |

## Relationships

| Relationship   | Type    | Description |
|:---------------|:--------|:----------|
|teamsApp|[teamsApp](teamsapp.md)| The app that is installed. |
|teamsAppDefinition|[teamsAppDefinition](teamsappdefinition.md)| The details of this version of the app. |

## Resource Schema

Existing entity types are as follows:

**Chat**

**TeamsAppInstallation**

## JSON representation

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.teamsAppInstallation",
  "baseType": "microsoft.graph.entity"
}-->

```json
{
  "id": "string"
}
```

## See also

- [teamsApp](teamsapp.md)
- [teamsAppDefinition](teamsappdefinition.md)
- [teamsTab](../resources/teamstab.md)

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "teamsApp resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": []
}
-->
