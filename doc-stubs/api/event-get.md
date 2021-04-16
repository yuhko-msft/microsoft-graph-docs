---
title: "Get event"
description: "Read the properties and relationships of an event object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get event
Namespace: microsoft.graph



Read the properties and relationships of an [event](../resources/event.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
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
GET /me/events/{eventId}
GET /me/calendarView/{eventId}
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [event](../resources/event.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_event"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/events/{eventId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.event"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.event",
    "id": "c72a587d-587d-c72a-7d58-2ac77d582ac7",
    "categories": [
      "String"
    ],
    "changeKey": "String",
    "createdDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "allowNewTimeProposals": "Boolean",
    "attendees": [
      {
        "@odata.type": "microsoft.graph.attendee"
      }
    ],
    "body": {
      "@odata.type": "microsoft.graph.itemBody"
    },
    "bodyPreview": "String",
    "cancelledOccurrences": [
      "String"
    ],
    "end": {
      "@odata.type": "microsoft.graph.dateTimeTimeZone"
    },
    "hasAttachments": "Boolean",
    "hideAttendees": "Boolean",
    "importance": "String",
    "isAllDay": "Boolean",
    "isCancelled": "Boolean",
    "isDraft": "Boolean",
    "isOnlineMeeting": "Boolean",
    "isOrganizer": "Boolean",
    "isReminderOn": "Boolean",
    "location": {
      "@odata.type": "microsoft.graph.location"
    },
    "locations": [
      {
        "@odata.type": "microsoft.graph.location"
      }
    ],
    "occurrenceId": "String",
    "onlineMeeting": {
      "@odata.type": "microsoft.graph.onlineMeetingInfo"
    },
    "onlineMeetingProvider": "String",
    "onlineMeetingUrl": "String",
    "organizer": {
      "@odata.type": "microsoft.graph.recipient"
    },
    "originalEndTimeZone": "String",
    "originalStart": "String (timestamp)",
    "originalStartTimeZone": "String",
    "recurrence": {
      "@odata.type": "microsoft.graph.patternedRecurrence"
    },
    "reminderMinutesBeforeStart": "Integer",
    "responseRequested": "Boolean",
    "responseStatus": {
      "@odata.type": "microsoft.graph.responseStatus"
    },
    "sensitivity": "String",
    "seriesMasterId": "String",
    "showAs": "String",
    "start": {
      "@odata.type": "microsoft.graph.dateTimeTimeZone"
    },
    "subject": "String",
    "transactionId": "String",
    "type": "String",
    "uid": "String",
    "webLink": "String"
  }
}
```

