---
title: "Get team members"
description: "Retrieve list of team members."
author: "clearab"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Get team members

Namespace: microsoft.graph

Get all [conversation members](../resources/conversationmember.md) in a [team](../resources/team.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|TeamMember.Read.All, TeamMember.ReadWrite.All|
|Delegated (personal Microsoft account) | Not supported.    |
|Application|TeamMember.Read.All, TeamMember.ReadWrite.All|

> [!NOTE]
> Before calling this API with application permissions, you must request access. For details, see [Protected APIs in Microsoft Teams](/graph/teams-protected-apis).

## HTTP request

<!-- { "blockType": "ignored" } -->
```http
GET /teams/{team-Id}/members/{membership-Id}
```

## Optional query parameters

This operation does not support the [OData query parameters](/graph/query-parameters) to customize the response.

## Request headers

| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a list of [conversationMember](../resources/conversationmember.md) objects in the response body.

## Example

### Request

<!-- 
{
  "blockType": "request",
  "name": "get_team_members"
}-->

```http
GET https://graph.microsoft.com/v1.0/teams/{teamsId}/members/{membersid}
```

### Response

<!--
{
  "blockType": "response",
  "truncated": true,
  "@odata.type": "collection(microsoft.graph.conversationMember)"
} -->

```http
HTTP/1.1 200 OK
Content-type: application/json
Content-length: 201
{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#users('8b081ef6-4792-4def-b2c9-c363a1bf41d5')/chats('19%3A8b081ef6-4792-4def-b2c9-c363a1bf41d5_5031bb31-22c0-4f6f-9f73-91d34ab2b32d%40unq.gbl.spaces')/members",
    "value": [
        {
            "@odata.type": "#microsoft.graph.aadUserConversationMember",
            "id": "8b081ef6-4792-4def-b2c9-c363a1bf41d5",
            "roles": [],
            "displayName": "John Doe",
            "userId": "8b081ef6-4792-4def-b2c9-c363a1bf41d5",
            "email": null
        }
    ]
}
```

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "Retrieve list of team members",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->

<!-- ## See also

 [Get channel members](../api/channel-get-members.md) -->
