---
title: "Unshare team from channel"
description: "Unshare team from this channel."
author: "akjo"
doc_type: "apiPageType"
ms.localizationpriority: high
ms.prod: "microsoft-teams"
---

# Unshare team from channel

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Unshared a [sharedWithChannelTeamInfo](../resources/sharedWithChannelTeamInfo.md) from this [channel](../resources/channel.md). This operation is allowed only for channels with a **membershipType** value of `shared`.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions (from least to most privileged)              |
|:--------------------|:---------------------------------------------------------|
|Delegated (work or school account) | Channel.Delete.All, ChannelSettings.ReadWrite.All |
|Delegated (personal Microsoft account) | Not supported.    |
|Application | Channel.Delete.All, ChannelSettings.ReadWrite.All |


> **Note**: This API supports admin permissions. Global admins and Microsoft Teams service admins can access teams that they are not a member of.

## HTTP request
<!-- { "blockType": "ignored" } -->
```http
DELETE /teams/{team-id}/channels/{channel-id}/{shared-with-team-id}
or
DELETE /teams/{team-id}/incomingChannels/{channel-id}/$ref
```

## Request headers

| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |

## Request body

Do not supply a request body for this method.

## Response
If successful, this method returns `204 No Content` response code. It does not return anything in the response body.

## Examples

### Example 1: Unshare a team from channel - request by host team admin/user

#### Request

# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "sharedwithchannelteaminf_unshare-team-from-channel"
} -->
```http
DELETE https://graph.microsoft.com/beta/teams/ece6f0a1-7ca4-498b-be79-edf6c8fc4d82/channels/19%3A56eb04e133944cf69e603c5dac2d292e%40thread.skype/sharedWithTeams/ece6f0a1-5g39-498b-be79-edf6c8fc4d82
```
# [C#](#tab/csharp)
[!INCLUDE [sample-code](../includes/snippets/csharp/delete-sharedwithchannelteaminfo-csharp-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [JavaScript](#tab/javascript)
[!INCLUDE [sample-code](../includes/snippets/javascript/delete-sharedwithchannelteaminfo-javascript-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Objective-C](#tab/objc)
[!INCLUDE [sample-code](../includes/snippets/objc/delete-sharedwithchannelteaminfo-objc-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Java](#tab/java)
[!INCLUDE [sample-code](../includes/snippets/java/delete-sharedwithchannelteaminfo-java-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

---


#### Response


<!-- {
  "blockType": "response"
} -->
```http
HTTP/1.1 204 No Content
```
### Example 2: Unshare a team from a channel / Delete incoming channel - request by invitee team admin/user

#### Request

# [HTTP](#tab/http)
<!-- {
  "blockType": "request",
  "name": "sharedwithchannelteaminf_delete-incoming-channel"
} -->
```http
DELETE https://graph.microsoft.com/beta/teams/ece6f0a1-7ca4-498b-be79-edf6c8fc4d82/incomingChannels/19%3A56eb04e133944cf69e603c5dac2d292e%40thread.skype/$ref
```
# [C#](#tab/csharp)
[!INCLUDE [sample-code](../includes/snippets/csharp/delete-incoming-channels-csharp-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [JavaScript](#tab/javascript)
[!INCLUDE [sample-code](../includes/snippets/javascript/delete-incoming-channels-javascript-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Objective-C](#tab/objc)
[!INCLUDE [sample-code](../includes/snippets/objc/delete-incoming-channels-objc-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

# [Java](#tab/java)
[!INCLUDE [sample-code](../includes/snippets/java/delete-incoming-channels-java-snippets.md)]
[!INCLUDE [sdk-documentation](../includes/snippets/snippets-sdk-documentation-link.md)]

---


#### Response


<!-- {
  "blockType": "response"
} -->
```http
HTTP/1.1 204 No Content
```


## See also

- [Remove member from channel](channel-delete-members.md)
- [Remove member from team](team-delete-members.md)

<!-- uuid: 8fcb5dbc-d5aa-4681-8e31-b001d5168d79
2021-10-11 14:57:30 UTC -->
<!--
{
  "type": "#page.annotation",
  "description": "Channel_Unshare_Team",
  "keywords": "",
  "section": "documentation",
  "tocPath": "",
  "suppressions": [
  ]
}
-->