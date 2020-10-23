---
title: "chatsAppInstallation resource type"
description: " The aim of this feature is to add graph APIS for CRUD of apps in chats and meetings."
author: "Nick Kramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: resourcePageType
---

# chatsAppInstallation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A [chatsApp](chatsapp.md) installed in a [chat](../api-reference/beta/resources/chat.md), or the personal scope of a [user](user.md). Any bots that are part of the app will become part of any team, chat, or user's personal scope that the app is added to.

> **Note** The functionality is currently present in Teams client in user context. We must extend the functionality to app context and surface it through Graph APIs.

## Scenarios

   * ServiceNow has a portal through which users in the tenant raise support tickets by clicking on a button. A support ticket comprises of a meeting where concerned users can interact and post messages about the incident. ServiceNow would like to pre-provision each of these meetings with their app to display useful information to the participants via tabs, post messages, manage the roster, and export the chat messages of the meeting.

   * Agents (users in the tenant) create group chats with employees (other users in the tenant) to provide employee services. To help the agents in their task, ServiceNow wants their app to be installed in the group chat so that it can read and post messages to the chat and add/remove members from the chat.

## Methods

| Method       | Return Type  |Description|
|:---------------|:--------|:----------|
|[Install App in a chat](../api/chatappinstallation-install.md) | [teamsAppInstallation](teamsappinstallation.md) collection | Adds (installs) an app to a chat or meeting.|
|[List App in chat ](../api/chatsappinstallation-list.md) |None | Lists apps in a chat.|
|[Get App in chat](../api/chatsappinstallation-get.md) | None | Lists apps installed in the personal scope of a user.|
|[Upgrade App in chat](../api/chatsappinstallation-upgrade.md) | None | Upgrades to the latest version of the app installed in chat.|
|[Uninstall App from chat](../api/chatsappinstallation-uninstall.md) | [teamsAppInstallation](teamsappinstallation.md) collection | Removes (uninstalls) app from a chat.|

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
```
<EntityType Name="chat" BaseType="graph.entity">
    <Property Name="topic" Type="Edm.String"/>
    <Property Name="createdDateTime" Type="Edm.DateTimeOffset"/>
    <Property Name="lastUpdatedDateTime" Type="Edm.DateTimeOffset"/>
    <NavigationProperty Name="members" Type="Collection(graph.conversationMember)" ContainsTarget="true"/>
    <NavigationProperty Name="messages" Type="Collection(graph.chatMessage)" ContainsTarget="true"/>
    <NavigationProperty Name="installedApps" Type="Collection(graph.teamsAppInstallation)" ContainsTarget="true"/>
</EntityType>

```

**TeamsAppInstallation**
```
<EntityType Name="teamsAppInstallation" ags:IsMaster="true">
    <Key>
      <PropertyRef Name="id" />
    </Key>
    <Property Name="id" Type="Edm.String" Nullable="false" />
    <Property Name="grantedResourceSpecificApplicationPermissions" Type="Collection(Edm.String)"  ags:IsHidden="true" />
    <NavigationProperty Name="teamsApp" Type="self.teamsApp" />
    <NavigationProperty Name="teamsAppDefinition" Type="self.teamsAppDefinition" />
</EntityType>
```

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
