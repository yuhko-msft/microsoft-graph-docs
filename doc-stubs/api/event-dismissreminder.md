---
title: "event: dismissReminder"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# event: dismissReminder
Namespace: microsoft.graph

**TODO: Add Description**

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST /users/{usersId}/events/{eventId}/dismissReminder
POST /groups/{groupsId}/events/{eventId}/dismissReminder
POST /users/{usersId}/calendarView/{eventId}/dismissReminder
POST /groups/{groupsId}/calendarView/{eventId}/dismissReminder
POST /users/{usersId}/messages/{messageId}/event/dismissReminder
POST /users/{usersId}/messages/{messageId}/event/instances/{eventId}/dismissReminder
POST /users/{usersId}/messages/{messageId}/event/calendar/events/{eventId}/dismissReminder
POST /users/{usersId}/messages/{messageId}/event/exceptionOccurrences/{eventId}/dismissReminder
POST /users/{usersId}/messages/{messageId}/event/calendar/calendarView/{eventId}/dismissReminder
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "event_dismissreminder"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/events/{eventId}/dismissReminder
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 204 No Content
```

