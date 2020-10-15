---
title: "List joinedTeams"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# List joinedTeams

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the team objects from a joinedTeams navigation property.

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

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 Ok` response code and a team object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_joinedteams"
}
-->

```http
GET https://graph.microsoft.com/beta

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 200 Ok

Content-Type: application/json
{
  "value": [
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
]
}

```
