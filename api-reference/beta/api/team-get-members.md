---
title: "Get team members"
description: "Get the members of a team."
author: "nkramer"
localization_priority: Priority
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Get members
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the [conversationMember](../resources/conversationmember.md) of a [team](../resources/team.md).

>Note: This API currently does not support pagination, so if there's too many members to fit into one request, you won't get all the members.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|TeamMember.Read.All, TeamMember.ReadWrite.All|
|Delegated (personal Microsoft account) | Not supported.    |
|Application|TeamMember.Read.All, TeamMember.ReadWrite.All|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
GET /teams/{id}/members/{id}
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
  "name": "get_teammember"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/teams{team-id}/members{membership-id}
```

### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "name": "get_teammember",
  "@odata.type": "collection(microsoft.graph.aadUserConversationMember)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
    "@odata.context": "https://graph.microsoft.com/v1.0/$metadata#teams('id')/members('id')",
    "values": {
        "@odata.type": "#microsoft.graph.aadUserConversationMember",
        "id": "3c02af05-9312-4966-bc84-c1a0818791c4",
        "roles": ["owner"],
        "userId": "aafc32d9-22e8-47a5-9178-099fd5e18968",
        "displayName": "George Washington",
        "email": "geowa@contoso.com"
    }
}
```

## See also

[Get channel members](../api/channel-get-members.md)
