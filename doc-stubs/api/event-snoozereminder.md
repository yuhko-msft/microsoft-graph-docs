---
title: "event: snoozeReminder"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# event: snoozeReminder
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
POST /users/{usersId}/events/{eventId}/snoozeReminder
POST /groups/{groupsId}/events/{eventId}/snoozeReminder
POST /users/{usersId}/calendarView/{eventId}/snoozeReminder
POST /groups/{groupsId}/calendarView/{eventId}/snoozeReminder
POST /users/{usersId}/messages/{messageId}/event/snoozeReminder
POST /users/{usersId}/messages/{messageId}/event/instances/{eventId}/snoozeReminder
POST /users/{usersId}/messages/{messageId}/event/calendar/events/{eventId}/snoozeReminder
POST /users/{usersId}/messages/{messageId}/event/exceptionOccurrences/{eventId}/snoozeReminder
POST /users/{usersId}/messages/{messageId}/event/calendar/calendarView/{eventId}/snoozeReminder
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|NewReminderTime|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "event_snoozereminder"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/events/{eventId}/snoozeReminder

Content-Type: application/json
Content-length: 88

{
  "NewReminderTime": {
    "@odata.type": "microsoft.graph.dateTimeTimeZone"
  }
}
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

