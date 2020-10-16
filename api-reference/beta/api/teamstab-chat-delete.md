---
title: "Delete tab from chat"
description: "Removes (unpins) a tab from the specified chat within a team. "
author: "nkramer"
localization_priority: Normal
ms.prod: "microsoft-teams"
doc_type: apiPageType
---

# Delete tab from chat

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Removes (unpins) a tab from the specified [chat](../resources/chat.md) within a [team](../resources/team.md). 

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type      | Permissions | Entities/APIs Covered |
|:--------------------|:---------------------------------|:---------------------------------|
|Delegated  | TeamsTab.Create, TeamsTab.ReadWrite.All  |Allows write of the new teamsTab to the chat. TeamsTab.Create does not grant the ability to read, modify or delete tabs after they are created, or give access to the content inside the tabs. None give access to the content inside the tabs.|
|Delegated  | TeamsTab.Read.All, TeamsTab.ReadWrite.All |Allows read of existing teamsTab in the chat. None give access to the content inside the tabs.|
|Application |TeamsTab.Create, TeamsTab.ReadWrite.All  |Allows write of the new teamsTab to the chat. TeamsTab.Create does not grant the ability to read, modify or delete tabs after they are created, or give access to the content inside the tabs. None give access to the content inside the tabs.|
|Application |TeamsTab.Read.All, TeamsTab.ReadWrite.All  |Allows read of existing teamsTab in the chat. None give access to the content inside the tabs.|

## HTTP request

```
DELETE /teams/{id}/chats/{id}/tabs/{id}
```

## Request headers
| Header       | Value |
|:---------------|:--------|
| Authorization  | Bearer {token}. Required.  |

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns `204 No Content` response code. It does not return anything in the response body.

## Example

> **Note**: Since meeting notes are confidential data, the Notes tab is not secure as it does not encrypt the data at rest. This is a violation of a new policy and needs to be removed from all meetings and chats. When a meeting is started, the Automation lists all tabs and deletes the Notes tab which is present using the Notes tab's id.

### Request
```
DELETE /chats/{chatId}/tabs/{tabId}
```
### Response
The following is an example of the response. Note: The response object shown here may be truncated for brevity. All of the properties will be returned from an actual call.
```
HTTP/1.1 204 No Content
```
### Example : Delete tabs in a Teams chat

#### Request

The following example shows a request to delete all chats.

```
DELETE /chats/19:75a0894119a0468caee5811901a75ffd@thread.tacv2/tabs/{id}
```

#### Response

HTTP/1.1 204 No Content
