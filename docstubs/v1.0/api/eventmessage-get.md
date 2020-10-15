---
title: "Get eventMessage"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get eventMessage

Namespace: microsoft.graph

Read the properties and relationships an eventMessage object.

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

If successful, this method returns a `200 OK` response code and an eventMessage object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_eventmessage"
}
-->

```http
GET https://graph.microsoft.com/v1.0

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.eventMessage"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.eventMessage",
  "bccRecipients": [
    {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    }
  ],
  "body": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "bodyPreview": "String",
  "categories": [
    "String"
  ],
  "ccRecipients": [
    {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    }
  ],
  "changeKey": "String",
  "conversationId": "String",
  "conversationIndex": "Binary",
  "createdDateTime": "DateTimeOffset",
  "endDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "flag": {
    "@odata.type": "#microsoft.graph.followupFlag",
    "completedDateTime": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    },
    "dueDateTime": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    },
    "flagStatus": "String",
    "startDateTime": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    }
  },
  "from": {
    "@odata.type": "#microsoft.graph.recipient",
    "emailAddress": {
      "@odata.type": "#microsoft.graph.emailAddress",
      "address": "String",
      "name": "String"
    }
  },
  "hasAttachments": "Boolean",
  "id": "String(identifier)",
  "importance": "String",
  "inferenceClassification": "String",
  "internetMessageHeaders": [
    {
      "@odata.type": "#microsoft.graph.internetMessageHeader",
      "name": "String",
      "value": "String"
    }
  ],
  "internetMessageId": "String",
  "isAllDay": "Boolean",
  "isDelegated": "Boolean",
  "isDeliveryReceiptRequested": "Boolean",
  "isDraft": "Boolean",
  "isOutOfDate": "Boolean",
  "isRead": "Boolean",
  "isReadReceiptRequested": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "location": {
    "@odata.type": "#microsoft.graph.location",
    "address": {
      "@odata.type": "#microsoft.graph.physicalAddress",
      "city": "String",
      "countryOrRegion": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String"
    },
    "coordinates": {
      "@odata.type": "#microsoft.graph.outlookGeoCoordinates",
      "accuracy": "Double",
      "altitude": "Double",
      "altitudeAccuracy": "Double",
      "latitude": "Double",
      "longitude": "Double"
    },
    "displayName": "String",
    "locationEmailAddress": "String",
    "locationType": "String",
    "locationUri": "String",
    "uniqueId": "String",
    "uniqueIdType": "String"
  },
  "meetingMessageType": "String",
  "parentFolderId": "String",
  "receivedDateTime": "DateTimeOffset",
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
  "replyTo": [
    {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    }
  ],
  "sender": {
    "@odata.type": "#microsoft.graph.recipient",
    "emailAddress": {
      "@odata.type": "#microsoft.graph.emailAddress",
      "address": "String",
      "name": "String"
    }
  },
  "sentDateTime": "DateTimeOffset",
  "startDateTime": {
    "@odata.type": "#microsoft.graph.dateTimeTimeZone",
    "dateTime": "String",
    "timeZone": "String"
  },
  "subject": "String",
  "toRecipients": [
    {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    }
  ],
  "type": "String",
  "uniqueBody": {
    "@odata.type": "#microsoft.graph.itemBody",
    "content": "String",
    "contentType": "String"
  },
  "webLink": "String"
}
}

```
