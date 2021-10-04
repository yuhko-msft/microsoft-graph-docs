---
title: "Get team shared with channel"
description: "Retrieve the teams shared with channel."
author: "akjo"
doc_type: "apiPageType"
ms.localizationpriority: high
ms.prod: "microsoft-teams"
---

# List channels

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a [team](../resources/sharedWithChannelTeamInfo.md) shared with this [channel](../resources/channel.md).

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | Channel.ReadBasic.All, ChannelSettings.Read.All, ChannelSettings.ReadWrite.All |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | Channel.ReadBasic.All, ChannelSettings.Read.All, ChannelSettings.ReadWrite.All |


> **Note**: This API supports admin permissions. Global admins and Microsoft Teams service admins can access teams that they are not a member of.

## HTTP request
<!-- { "blockType": "ignored" } -->
```http
GET /teams/{team-id}/allChannels
```

## Optional query parameters
This method supports the `$select` [OData query parameters](/graph/query-parameters) to help customize the response.


## Request headers

| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |

## Request body

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and collection of [SharedWithChannelTeamInfo](../resources/sharedWithChannelTeamInfo.md) objects in the response body.

## Examples

### Example 1: List a team the channel is shared with

#### Request

The following example shows a request to list all teams shared with the channel.


# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "list_channels"
}-->
```msgraph-interactive
GET https://graph.microsoft.com/beta/teams/893075dd-2487-5634-925f-022c42e20265/channels/19:561fbdbbfca848a484f0a6f00ce9dbbd@thread.tacv2/sharedWithTeams/893075dd-2487-5634-925f-022c42e20265
```
# [C#](#tab/csharp)
[!INCLUDE [sample-code](../includes/snippets/csharp/list-channels-csharp-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [JavaScript](#tab/javascript)
[!INCLUDE [sample-code](../includes/snippets/javascript/list-channels-javascript-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Objective-C](#tab/objc)
[!INCLUDE [sample-code](../includes/snippets/objc/list-channels-objc-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Java](#tab/java)
[!INCLUDE [sample-code](../includes/snippets/java/list-channels-java-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

---


#### Response

The following is the response.

> **Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.channel",
  "isCollection": true
} -->
```http
HTTP/1.1 200 OK
Content-type: application/json
Content-length: 262

{
  "id": "893075dd-2487-5634-925f-022c42e20265",
  "displayName": "Team contosso",
  "isHostTeam": "true",
  "tenantId": "b3246f44-b4gb-4627-96c6-25b18fa2c910"
}
```

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2021-10-04 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "List teams shared with channel",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->


