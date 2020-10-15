---
title: "Update events"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Update events

Namespace: microsoft.graph

Update the properties of an event object.

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

In the request body, supply JSON representation of the [event](../resources/-event.md) object.

<!-- Actions and Functions -->

<!-- CRUD Methods -->

The following table shows the properties that are required when you create an event object.

| Property                   | Type                                                       | Description |
| :------------------------- | :--------------------------------------------------------- | :---------- |
| allowNewTimeProposals      | Boolean                                                    |             |
| attendees                  | [attendee](../resources/attendee.md) collection            |             |
| body                       | [itemBody](../resources/itembody.md)                       |             |
| bodyPreview                | String                                                     |             |
| end                        | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| hasAttachments             | Boolean                                                    |             |
| iCalUId                    | String                                                     |             |
| importance                 | String                                                     |             |
| isAllDay                   | Boolean                                                    |             |
| isCancelled                | Boolean                                                    |             |
| isDraft                    | Boolean                                                    |             |
| isOnlineMeeting            | Boolean                                                    |             |
| isOrganizer                | Boolean                                                    |             |
| isReminderOn               | Boolean                                                    |             |
| location                   | [location](../resources/location.md)                       |             |
| locations                  | [location](../resources/location.md) collection            |             |
| onlineMeeting              | [onlineMeetingInfo](../resources/onlinemeetinginfo.md)     |             |
| onlineMeetingProvider      | String                                                     |             |
| onlineMeetingUrl           | String                                                     |             |
| organizer                  | [recipient](../resources/recipient.md)                     |             |
| originalEndTimeZone        | String                                                     |             |
| originalStart              | DateTimeOffset                                             |             |
| originalStartTimeZone      | String                                                     |             |
| recurrence                 | [patternedRecurrence](../resources/patternedrecurrence.md) |             |
| reminderMinutesBeforeStart | Int32                                                      |             |
| responseRequested          | Boolean                                                    |             |
| responseStatus             | [responseStatus](../resources/responsestatus.md)           |             |
| sensitivity                | String                                                     |             |
| seriesMasterId             | String                                                     |             |
| showAs                     | String                                                     |             |
| start                      | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| subject                    | String                                                     |             |
| transactionId              | String                                                     |             |
| type                       | String                                                     |             |
| webLink                    | String                                                     |             |

## Response

If successful, this method returns a `200 OK` response code and an event object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "update_events"
}
-->

```http
PATCH https://graph.microsoft.com/v1.0

Content-Type: application/json
Content-Length: 5537

[
  {
    "@odata.type": "#microsoft.graph.event",
    "allowNewTimeProposals": "Boolean",
    "attendees": [
      {
        "@odata.type": "#microsoft.graph.attendee",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        },
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
        "status": {
          "@odata.type": "#microsoft.graph.responseStatus",
          "response": "String",
          "time": "DateTimeOffset"
        },
        "type": "String"
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
    "changeKey": "String",
    "createdDateTime": "DateTimeOffset",
    "end": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    },
    "hasAttachments": "Boolean",
    "iCalUId": "String",
    "id": "String(identifier)",
    "importance": "String",
    "isAllDay": "Boolean",
    "isCancelled": "Boolean",
    "isDraft": "Boolean",
    "isOnlineMeeting": "Boolean",
    "isOrganizer": "Boolean",
    "isReminderOn": "Boolean",
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
    "locations": [
      {
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
      }
    ],
    "onlineMeeting": {
      "@odata.type": "#microsoft.graph.onlineMeetingInfo",
      "conferenceId": "String",
      "joinUrl": "String",
      "phones": [
        {
          "@odata.type": "#microsoft.graph.phone",
          "language": "String",
          "number": "String",
          "region": "String",
          "type": "String"
        }
      ],
      "quickDial": "String",
      "tollFreeNumbers": [
        "String"
      ],
      "tollNumber": "String"
    },
    "onlineMeetingProvider": "String",
    "onlineMeetingUrl": "String",
    "organizer": {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    },
    "originalEndTimeZone": "String",
    "originalStart": "DateTimeOffset",
    "originalStartTimeZone": "String",
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
    "reminderMinutesBeforeStart": "Int32",
    "responseRequested": "Boolean",
    "responseStatus": {
      "@odata.type": "#microsoft.graph.responseStatus",
      "response": "String",
      "time": "DateTimeOffset"
    },
    "sensitivity": "String",
    "seriesMasterId": "String",
    "showAs": "String",
    "start": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    },
    "subject": "String",
    "transactionId": "String",
    "type": "String",
    "webLink": "String"
  }
]

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
    "@odata.type": "#microsoft.graph.event",
    "allowNewTimeProposals": "Boolean",
    "attendees": [
      {
        "@odata.type": "#microsoft.graph.attendee",
        "emailAddress": {
          "@odata.type": "#microsoft.graph.emailAddress",
          "address": "String",
          "name": "String"
        },
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
        "status": {
          "@odata.type": "#microsoft.graph.responseStatus",
          "response": "String",
          "time": "DateTimeOffset"
        },
        "type": "String"
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
    "changeKey": "String",
    "createdDateTime": "DateTimeOffset",
    "end": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    },
    "hasAttachments": "Boolean",
    "iCalUId": "String",
    "id": "String(identifier)",
    "importance": "String",
    "isAllDay": "Boolean",
    "isCancelled": "Boolean",
    "isDraft": "Boolean",
    "isOnlineMeeting": "Boolean",
    "isOrganizer": "Boolean",
    "isReminderOn": "Boolean",
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
    "locations": [
      {
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
      }
    ],
    "onlineMeeting": {
      "@odata.type": "#microsoft.graph.onlineMeetingInfo",
      "conferenceId": "String",
      "joinUrl": "String",
      "phones": [
        {
          "@odata.type": "#microsoft.graph.phone",
          "language": "String",
          "number": "String",
          "region": "String",
          "type": "String"
        }
      ],
      "quickDial": "String",
      "tollFreeNumbers": [
        "String"
      ],
      "tollNumber": "String"
    },
    "onlineMeetingProvider": "String",
    "onlineMeetingUrl": "String",
    "organizer": {
      "@odata.type": "#microsoft.graph.recipient",
      "emailAddress": {
        "@odata.type": "#microsoft.graph.emailAddress",
        "address": "String",
        "name": "String"
      }
    },
    "originalEndTimeZone": "String",
    "originalStart": "DateTimeOffset",
    "originalStartTimeZone": "String",
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
    "reminderMinutesBeforeStart": "Int32",
    "responseRequested": "Boolean",
    "responseStatus": {
      "@odata.type": "#microsoft.graph.responseStatus",
      "response": "String",
      "time": "DateTimeOffset"
    },
    "sensitivity": "String",
    "seriesMasterId": "String",
    "showAs": "String",
    "start": {
      "@odata.type": "#microsoft.graph.dateTimeTimeZone",
      "dateTime": "String",
      "timeZone": "String"
    },
    "subject": "String",
    "transactionId": "String",
    "type": "String",
    "webLink": "String"
  }
]
}

```
