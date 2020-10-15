---
title: "Get tasks"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get tasks

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an outlookTask object.

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

## Optional query parameters

This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers

| Name          | Description               |
| :------------ | :------------------------ |
| Authorization | Bearer {token}. Required. |

## Request Body

<!-- Actions and Functions -->

<!-- CRUD Methods -->

Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an outlookTask object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_tasks"
}
-->

```http
GET https://graph.microsoft.com/beta

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "$(this.ReturnTypeFullName)"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": [
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
]
}

```
