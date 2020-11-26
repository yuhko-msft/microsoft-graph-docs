---
title: "List members of team"
description: "Get the conversationMembers of a team."
author: "nkramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# List members of team
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the [conversationMember](../resources/conversationmember.md) collection of a [team](../resources/team.md).

> [!NOTE]
> The membership IDs returned by the server must be treated as opaque strings. The client should not try to parse or make any assumptions about these resource IDs.
>
> The membership results could map to users from different tenants, as indicated in the response, in the future. The client should not assume that all members are from the current tenant only.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)| TeamMember.Read.All, TeamMember.ReadWrite.All |
|Delegated (personal Microsoft account) | Not supported.    |
|Application| TeamMember.Read.Group*, TeamMember.Read.All, TeamMember.ReadWrite.All |

> **Note**: Permissions marked with * use [resource-specific consent]( https://aka.ms/teams-rsc).

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http
GET /teams/{team-id}/members
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [conversationMember](../resources/conversationmember.md) objects in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "list_team_member"
} -->

```http
GET https://graph.microsoft.com/beta/teams/2ab9c796-2902-45f8-b712-7c5a63cf41c4/members
```

### Response

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.aadUserConversationMember"
}
-->

```http
HTTP/1.1 200 OK
Content-type: application/json
Content-length: 201

{
    "@odata.context": "https://graph.microsoft.com/beta/$metadata#teams('2ab9c796-2902-45f8-b712-7c5a63cf41c4')/members",
    "value": [
        {
            "@odata.type": "#microsoft.graph.aadUserConversationMember",
            "id": "MmFiOWM3OTYtMjkwMi00NWY4LWI3MTItN2M1YTYzY2Y0MWM0IyNlZWY5Y2IzNi0wNmRlLTQ2OWItODdjZC03MGY0Y2JlMzJkMTQ=",
            "roles": [],
            "displayName": "Joe Self",
            "userId": "eef9cb36-06de-469b-87cd-70f4cbe32d14",
            "email": "jself@teamsip.onmicrosoft.com"
        },
        {
            "@odata.type": "#microsoft.graph.aadUserConversationMember",
             "id": "MmFiOWM3OTYtMjkwMi00NWY4LWI3MTItN2M1YTYzY2Y0MWM0IyNiMzI0NmY0NC1jMDkxLTQ2MjctOTZjNi0yNWIxOGZhMmM5MTA=",
            "roles": [
                "owner"
                ],
            "displayName": "Anagha Kothurwar",
            "userId": "b3246f44-c091-4627-96c6-25b18fa2c910",
            "email": "ankothur@teamsip.onmicrosoft.com"
        }
    ]
}
```

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "conversation: member list",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->

## See also

- [List members in channel](channel-list-members.md)
