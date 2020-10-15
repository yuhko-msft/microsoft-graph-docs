---
title: "Update eventMessageResponse"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update eventMessageResponse

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an eventMessageResponse object.

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

In the request body, supply JSON representation of the [eventMessageResponse](../resources/-eventmessageresponse.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an eventMessageResponse object.

| Property        | Type                                 | Description |
| :-------------- | :----------------------------------- | :---------- |
| proposedNewTime | [timeSlot](../resources/timeslot.md) |             |
| responseType    | String                               |             |

## Response

If successful, this method returns a `200 OK` response code and an eventMessageResponse object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_eventmessageresponse"
}
-->

```http
PATCH https://graph.microsoft.com/beta

Content-Type: application/json
Content-Length: 5476

{
  "@odata.type": "#microsoft.graph.eventMessageResponse",
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
      "postOfficeBox": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String",
      "type": "String"
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
  "mentionsPreview": {
    "@odata.type": "#microsoft.graph.mentionsPreview",
    "isMentioned": "Boolean"
  },
  "parentFolderId": "String",
  "proposedNewTime": {
    "@odata.type": "#microsoft.graph.timeSlot",
    "end": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    },
    "start": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    }
  },
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
  "responseType": "String",
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
  "unsubscribeData": [
    "String"
  ],
  "unsubscribeEnabled": "Boolean",
  "webLink": "String"
}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.eventMessageResponse"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
  "@odata.type": "#microsoft.graph.eventMessageResponse",
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
      "postOfficeBox": "String",
      "postalCode": "String",
      "state": "String",
      "street": "String",
      "type": "String"
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
  "mentionsPreview": {
    "@odata.type": "#microsoft.graph.mentionsPreview",
    "isMentioned": "Boolean"
  },
  "parentFolderId": "String",
  "proposedNewTime": {
    "@odata.type": "#microsoft.graph.timeSlot",
    "end": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    },
    "start": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    }
  },
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
  "responseType": "String",
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
  "unsubscribeData": [
    "String"
  ],
  "unsubscribeEnabled": "Boolean",
  "webLink": "String"
}
}

```
