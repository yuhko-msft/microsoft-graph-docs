---
title: "Create outlookTask"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Create outlookTask

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new outlookTask object.

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

In the request body, supply JSON representation of the [outlookTask](../resources/-outlooktask.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an outlookTask object.

| Property          | Type                                                       | Description |
| :---------------- | :--------------------------------------------------------- | :---------- |
| assignedTo        | String                                                     |             |
| body              | [itemBody](../resources/itembody.md)                       |             |
| completedDateTime | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| dueDateTime       | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| hasAttachments    | Boolean                                                    |             |
| importance        | String                                                     |             |
| isReminderOn      | Boolean                                                    |             |
| owner             | String                                                     |             |
| parentFolderId    | String                                                     |             |
| recurrence        | [patternedRecurrence](../resources/patternedrecurrence.md) |             |
| reminderDateTime  | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| sensitivity       | String                                                     |             |
| startDateTime     | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| status            | String                                                     |             |
| subject           | String                                                     |             |

## Response

If successful, this method returns a `201 Created` response code and an outlookTask object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "create_outlooktask"
}
-->

```http
POST https://graph.microsoft.com/beta/users/{id}/outlook/tasks/{id}

Content-Type: application/json
Content-Length: 1754

{
  "@odata.type": "#microsoft.graph.outlookTask",
  "assignedTo": "String",
  "body": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "categories": [
    "String"
  ],
  "changeKey": "String",
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
  "hasAttachments": "Boolean",
  "importance": "String",
  "isReminderOn": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "owner": "String",
  "parentFolderId": "String",
  "recurrence": {
    "@odata.type": "#microsoft.graph.patternedRecurrence",
    "pattern": {
      "@odata.type": "#microsoft.graph.recurrencePattern",
      "dayOfMonth": "Int32",
      "daysOfWeek": [
        "String"
      ],
      "firstDayOfWeek": "String",
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
  "sensitivity": "String",
  "startDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "status": "String",
  "subject": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.outlookTask"
}
-->

```http
HTTP 1.1 201 Created

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.outlookTask",
  "assignedTo": "String",
  "body": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "categories": [
    "String"
  ],
  "changeKey": "String",
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
  "hasAttachments": "Boolean",
  "id": "String(identifier)",
  "importance": "String",
  "isReminderOn": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "owner": "String",
  "parentFolderId": "String",
  "recurrence": {
    "@odata.type": "#microsoft.graph.patternedRecurrence",
    "pattern": {
      "@odata.type": "#microsoft.graph.recurrencePattern",
      "dayOfMonth": "Int32",
      "daysOfWeek": [
        "String"
      ],
      "firstDayOfWeek": "String",
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
  "sensitivity": "String",
  "startDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "status": "String",
  "subject": "String"
}
}

```
