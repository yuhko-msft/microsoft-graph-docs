---
title: "Bulk add member"
description: "Add members in bulk."
author: "nkramer"
doc_type: "apiPageType"
localization_priority: Priority
ms.prod: "microsoft-teams"
---

# Bulk add members to a team

Namespace: microsoft.graph

Add multiple members in a single request to a [team](../resources/team.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions               | 
|:--------------------|:---------------------------------------------------------|
| Delegated | TeamMember.Read.All   |
| Delegated | TeamMember.ReadWrite.All |
| Application-only | TeamMember.Read.All   |
| Application-only | TeamMember.ReadWrite.All |


## HTTP Request

This is a bound action for adding multiple elements to a conversationMember collection in a single request.

```xml
POST /teams/id/members/add
```

## Request headers

| Header        | Value                     |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request body
Do not supply request body for this method.

## Response

This API returns a `200` response indicating all members supplied were added to the team or a `207` response indicating that some of the supplied members were added to the Team. Callers should look at the response payload to see which member additions failed.
 
## Examples

### Example 1: Bulk add member

#### Request

The following example shows a request to add multiple members to a team.

```msgraph-interactive
POST https://graph.microsoft.com/v1.0/teams/id/members/add
{
    "values": [
        {
            "@odata.type": "microsoft.graph.aadUserConversationMember",
            "roles":[],
            "user@odata.bind": "https://graph.microsoft.com/beta/users/id"
        },
        {
            "@odata.type": "microsoft.graph.aadUserConversationMember",
            "roles":["owner"],
            "user@odata.bind": "https://graph.microsoft.com/beta/users/id2"
        }
    ]
}
```

#### Response

The following is the response.

> **Note:** The response object shown here might be shortened for readability. All the properties will be returned from an actual call.

```http
HTTP/1.1 200 OK
{
    "@odata.context": "https://localhost:20443/beta/$metadata#Collection(microsoft.graph.aadUserConversationMemberResult)",
    "values": [
        {
            "@odata.type": "#microsoft.graph.aadUserConversationMemberResult",
            "userId": "user0",
            "error": null
        },
        {
            "@odata.type": "#microsoft.graph.aadUserConversationMemberResult",
            "userId": "user1",
            "error": null
        }
    ]
}
```

### Example 2: Bulk add member with partial failure

#### Request

The following example shows a request to add multiple members to a team with partial failure.

```msgraph-interactive
POST https://graph.microsoft.com/v1.0/teams/id/members/add
{
    "values": [
        {
            "@odata.type": "microsoft.graph.aadUserConversationMemberResult",
            "roles":[],
            "user@odata.bind": "https://graph.microsoft.com/beta/users/id"
        },
        {
            "@odata.type": "microsoft.graph.aadUserConversationMemberResult",
            "roles":["owner"],
            "user@odata.bind": "https://graph.microsoft.com/beta/users/id2"
        }
    ]
}
```

#### Response

The following is the response.

> **Note:** The response object shown here might be shortened for readability. All the properties will be returned from an actual call.

```http
HTTP/1.1 207 MULTI-STATUS
{
    "@odata.context": "https://localhost:20443/beta/$metadata#Collection(microsoft.graph.addConversationMemberResult)",
    "values": [
        {
            "@odata.type": "#microsoft.graph.addAadConversationMemberResult",
            "userId": "user0",
            "error": {
                "code": "NotFound",
                "message": ""
            }
        },
        {
            "@odata.type": "#microsoft.graph.addAadConversationMemberResult",
            "userId": "user1",
            "error": null
        }
    ]
}
```
