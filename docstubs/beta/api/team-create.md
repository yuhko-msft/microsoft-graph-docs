---
title: "Create team"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create team

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new team object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [team](../resources/-team.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a team object.

| Property                    | Type                                                           | Description |
| :-------------------------- | :------------------------------------------------------------- | :---------- |
| classification              | String                                                         |             |
| createdDateTime             | DateTimeOffset                                                 |             |
| description                 | String                                                         |             |
| discoverySettings           | [teamDiscoverySettings](../resources/teamdiscoverysettings.md) |             |
| displayName                 | String                                                         |             |
| funSettings                 | [teamFunSettings](../resources/teamfunsettings.md)             |             |
| guestSettings               | [teamGuestSettings](../resources/teamguestsettings.md)         |             |
| id                          | String                                                         | Read-only.  |
| internalId                  | String                                                         |             |
| isArchived                  | Boolean                                                        |             |
| isMembershipLimitedToOwners | Boolean                                                        |             |
| memberSettings              | [teamMemberSettings](../resources/teammembersettings.md)       |             |
| messagingSettings           | [teamMessagingSettings](../resources/teammessagingsettings.md) |             |
| specialization              | String                                                         |             |
| visibility                  | String                                                         |             |
| webUrl                      | String                                                         |             |

## Response

If successful, this method returns a `201 Created` response code and a team object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_team"
}
-->

```http
POST https://graph.microsoft.com/beta/teams/{id}

Content-Type: application/json
Content-Length: 1545

{
  "@odata.type": "#microsoft.graph.team",
  "classification": "String",
  "createdDateTime": "DateTimeOffset",
  "description": "String",
  "discoverySettings": {
    "@odata.type": "#microsoft.graph.teamDiscoverySettings",
    "showInTeamsSearchAndSuggestions": "Boolean"
  },
  "displayName": "String",
  "funSettings": {
    "@odata.type": "#microsoft.graph.teamFunSettings",
    "allowCustomMemes": "Boolean",
    "allowGiphy": "Boolean",
    "allowStickersAndMemes": "Boolean",
    "giphyContentRating": "String"
  },
  "guestSettings": {
    "@odata.type": "#microsoft.graph.teamGuestSettings",
    "allowCreateUpdateChannels": "Boolean",
    "allowDeleteChannels": "Boolean"
  },
  "internalId": "String",
  "isArchived": "Boolean",
  "isMembershipLimitedToOwners": "Boolean",
  "memberSettings": {
    "@odata.type": "#microsoft.graph.teamMemberSettings",
    "allowAddRemoveApps": "Boolean",
    "allowCreatePrivateChannels": "Boolean",
    "allowCreateUpdateChannels": "Boolean",
    "allowCreateUpdateRemoveConnectors": "Boolean",
    "allowCreateUpdateRemoveTabs": "Boolean",
    "allowDeleteChannels": "Boolean"
  },
  "messagingSettings": {
    "@odata.type": "#microsoft.graph.teamMessagingSettings",
    "allowChannelMentions": "Boolean",
    "allowOwnerDeleteMessages": "Boolean",
    "allowTeamMentions": "Boolean",
    "allowUserDeleteMessages": "Boolean",
    "allowUserEditMessages": "Boolean"
  },
  "specialization": "String",
  "visibility": "String",
  "webUrl": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.GraphSvc.team"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.team",
  "classification": "String",
  "createdDateTime": "DateTimeOffset",
  "description": "String",
  "discoverySettings": {
    "@odata.type": "#microsoft.graph.teamDiscoverySettings",
    "showInTeamsSearchAndSuggestions": "Boolean"
  },
  "displayName": "String",
  "funSettings": {
    "@odata.type": "#microsoft.graph.teamFunSettings",
    "allowCustomMemes": "Boolean",
    "allowGiphy": "Boolean",
    "allowStickersAndMemes": "Boolean",
    "giphyContentRating": "String"
  },
  "guestSettings": {
    "@odata.type": "#microsoft.graph.teamGuestSettings",
    "allowCreateUpdateChannels": "Boolean",
    "allowDeleteChannels": "Boolean"
  },
  "id": "String(identifier)",
  "internalId": "String",
  "isArchived": "Boolean",
  "isMembershipLimitedToOwners": "Boolean",
  "memberSettings": {
    "@odata.type": "#microsoft.graph.teamMemberSettings",
    "allowAddRemoveApps": "Boolean",
    "allowCreatePrivateChannels": "Boolean",
    "allowCreateUpdateChannels": "Boolean",
    "allowCreateUpdateRemoveConnectors": "Boolean",
    "allowCreateUpdateRemoveTabs": "Boolean",
    "allowDeleteChannels": "Boolean"
  },
  "messagingSettings": {
    "@odata.type": "#microsoft.graph.teamMessagingSettings",
    "allowChannelMentions": "Boolean",
    "allowOwnerDeleteMessages": "Boolean",
    "allowTeamMentions": "Boolean",
    "allowUserDeleteMessages": "Boolean",
    "allowUserEditMessages": "Boolean"
  },
  "specialization": "String",
  "visibility": "String",
  "webUrl": "String"
}
}

```
