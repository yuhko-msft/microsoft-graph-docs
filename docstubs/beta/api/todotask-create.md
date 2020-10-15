---
title: "Create todoTask"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create todoTask

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new todoTask object.

## Permissions

One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

| Permission type                        | Permissions (from most to least privileged) |
| :------------------------------------- | :------------------------------------------ |
| Delegated (work or school account)     |                                             |
| Delegated (personal Microsoft account) |                                             |
| Application                            |                                             |

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->

```http

```

## Request headers

| Name          | Description                 |
| :------------ | :-------------------------- |
| Authorization | Bearer {token}. Required.   |
| Content-Type  | application/json. Required. |

## Request Body

In the request body, supply JSON representation of the [todoTask](../resources/-todotask.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create a todoTask object.

| Property                 | Type                                                       | Description |
| :----------------------- | :--------------------------------------------------------- | :---------- |
| body                     | [itemBody](../resources/itembody.md)                       |             |
| bodyLastModifiedDateTime | DateTimeOffset                                             |             |
| completedDateTime        | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| createdDateTime          | DateTimeOffset                                             |             |
| dueDateTime              | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| id                       | String                                                     | Read-only.  |
| importance               | String                                                     |             |
| isReminderOn             | Boolean                                                    |             |
| lastModifiedDateTime     | DateTimeOffset                                             |             |
| recurrence               | [patternedRecurrence](../resources/patternedrecurrence.md) |             |
| reminderDateTime         | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| status                   | String                                                     |             |
| title                    | String                                                     |             |

## Response

If successful, this method returns a `201 Created` response code and a todoTask object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_todotask"
}
-->

```http
POST https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 1455

{
  "@odata.type": "#microsoft.graph.todoTask",
  "body": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "bodyLastModifiedDateTime": "DateTimeOffset",
  "completedDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "createdDateTime": "DateTimeOffset",
  "dueDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "importance": "String",
  "isReminderOn": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "recurrence": {
    "@odata.type": "#microsoft.graph.patternedRecurrence",
    "pattern": {
      "@odata.type": "#microsoft.graph.recurrencePattern",
      "dayOfMonth": "Int32",
      "daysOfWeek": [
        "String"
      ],
      "firstdayOfWeek": "String",
      "index": "String",
      "interval": "Int32",
      "month": "Int32",
      "type": "String"
    },
    "range": {
      "@odata.type": "#microsoft.graph.recurrenceRange",
      "endDate": "Date",
      "numberOfOccurrences": "Int32",
      "recurrenceTimeZone": "String",
      "startDate": "Date",
      "type": "String"
    }
  },
  "reminderDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "status": "String",
  "title": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.toDo.todoTask"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.todoTask",
  "body": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "bodyLastModifiedDateTime": "DateTimeOffset",
  "completedDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "createdDateTime": "DateTimeOffset",
  "dueDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "id": "String(identifier)",
  "importance": "String",
  "isReminderOn": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "recurrence": {
    "@odata.type": "#microsoft.graph.patternedRecurrence",
    "pattern": {
      "@odata.type": "#microsoft.graph.recurrencePattern",
      "dayOfMonth": "Int32",
      "daysOfWeek": [
        "String"
      ],
      "firstdayOfWeek": "String",
      "index": "String",
      "interval": "Int32",
      "month": "Int32",
      "type": "String"
    },
    "range": {
      "@odata.type": "#microsoft.graph.recurrenceRange",
      "endDate": "Date",
      "numberOfOccurrences": "Int32",
      "recurrenceTimeZone": "String",
      "startDate": "Date",
      "type": "String"
    }
  },
  "reminderDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "status": "String",
  "title": "String"
}
}

```
