---
title: "List members in a team"
description: "Gets the members of a team."
author: "nkramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# List members in a team
Namespace: microsoft.graph

Get the list of [conversationMember](../resources/conversationmember.md) in a [team](../resources/team.md).

>Note: This API currently does not support pagination, so if there's too many members to fit into one request, you won't get all the members.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)| TeamMember.Read.All, TeamMember.ReadWrite.All |
|Delegated (personal Microsoft account) | Not supported.    |
|Application| TeamMember.Read.All, TeamMember.ReadWrite.All |

> **Note**: Permissions marked with * use [resource-specific consent]( https://aka.ms/teams-rsc).

## HTTP request

<!--{
  "blockType": "ignored"
}
-->
``` http
GET /teams/{teams-Id}/members
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

<!--{
  "blockType": "request",
  "name": "list_teammember"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/teams/{teams-Id}/members
```

### Response

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "collection(microsoft.graph.aadUserConversationMember)"
}
-->
``` http
HTTP/1.1 200 OK
{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#teams('id')/members",
    "value": [
        {
            "@odata.type": "#microsoft.graph.aadUserConversationMember",
            "id": "3c02af05-9312-4966-bc84-c1a0818791c4",
            "roles": ["owner"],
            "userId": "aafc32d9-22e8-47a5-9178-099fd5e18968",
            "displayName": "George Washington",
            "email": "geowa@contoso.com"
        },
        {
            "@odata.type": "#microsoft.graph.aadUserConversationMember",
            "id":"1ce8527b-95aa-410e-a581-8e8a8cba3e2f",
            "roles":["owner"],
            "userId": "24b4876d-0c48-4895-9a62-c810827f1fae",
            "displayName": "Emily Green,
            "email": "emGr@contoso.com"
        }
    ]
}
```
<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2015-10-25 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "list team members",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->

<!-- ## See also

 [List channel members](../api/channel-list-members.md) -->
