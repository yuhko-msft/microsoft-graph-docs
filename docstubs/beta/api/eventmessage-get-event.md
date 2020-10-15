---
title: "Get event"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "apiPageType"
---

# Get event

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an event object.

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

If successful, this method returns a `200 OK` response code and an event object in the response body.

## Examples

### Request

<!-- {
  "blockType": "request",
  "name": "get_event"
}
-->

```http
GET https://graph.microsoft.com/beta/users/{id}/events/{id}

```

### Response

**Note:** The response object shown here might be shortened for readability.

<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.OutlookServices.event"
}
-->

```http
HTTP 1.1 200 OK

Content-Type: application/json
{
  "value": {
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
  "cancelledOccurrences": [
    "String"
  ],
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
  "hideAttendees": "Boolean",
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
  "locations": [
    {
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
    }
  ],
  "occurrenceId": "String",
  "onlineMeeting": {
    "@odata.type": "#microsoft.graph.onlineMeetingInfo",
    "conferenceId": "String",
    "joinUrl": "String",
    "phones": [
      {
        "@odata.type": "#microsoft.graph.phone",
        "number": "String",
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
  "uid": "String",
  "webLink": "String"
}
}

```
