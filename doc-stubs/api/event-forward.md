---
title: "event: forward"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# event: forward
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
POST /users/{usersId}/events/{eventId}/forward
POST /groups/{groupsId}/events/{eventId}/forward
POST /users/{usersId}/calendarView/{eventId}/forward
POST /groups/{groupsId}/calendarView/{eventId}/forward
POST /users/{usersId}/messages/{messageId}/event/forward
POST /users/{usersId}/messages/{messageId}/event/instances/{eventId}/forward
POST /users/{usersId}/messages/{messageId}/event/calendar/events/{eventId}/forward
POST /users/{usersId}/messages/{messageId}/event/exceptionOccurrences/{eventId}/forward
POST /users/{usersId}/messages/{messageId}/event/calendar/calendarView/{eventId}/forward
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
|ToRecipients|[recipient](../resources/recipient.md) collection|**TODO: Add Description**|
|Comment|String|**TODO: Add Description**|



## Response

If successful, this action returns a `204 No Content` response code.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "event_forward"
}
-->
``` http
POST https://graph.microsoft.com/beta/users/{usersId}/events/{eventId}/forward

Content-Type: application/json
Content-length: 118

{
  "ToRecipients": [
    {
      "@odata.type": "microsoft.graph.recipient"
    }
  ],
  "Comment": "String"
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

