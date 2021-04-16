---
title: "Create event"
description: "Create a new event object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create event
Namespace: microsoft.graph



Create a new [event](../resources/event.md) object.

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
POST /me/events
POST /me/calendarView
POST /users/{usersId}/events
POST /groups/{groupsId}/events
POST /users/{usersId}/calendarView
POST /groups/{groupsId}/calendarView
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [event](../resources/event.md) object.

The following table shows the properties that are required when you create the [event](../resources/event.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|allowNewTimeProposals|Boolean|**TODO: Add Description**|
|attendees|[attendee](../resources/attendee.md) collection|**TODO: Add Description**|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|bodyPreview|String|**TODO: Add Description**|
|cancelledOccurrences|String collection|**TODO: Add Description**|
|end|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|hideAttendees|Boolean|**TODO: Add Description**|
|importance|importance|**TODO: Add Description**. Possible values are: `low`, `normal`, `high`.|
|isAllDay|Boolean|**TODO: Add Description**|
|isCancelled|Boolean|**TODO: Add Description**|
|isDraft|Boolean|**TODO: Add Description**|
|isOnlineMeeting|Boolean|**TODO: Add Description**|
|isOrganizer|Boolean|**TODO: Add Description**|
|isReminderOn|Boolean|**TODO: Add Description**|
|location|[location](../resources/location.md)|**TODO: Add Description**|
|locations|[location](../resources/location.md) collection|**TODO: Add Description**|
|occurrenceId|String|**TODO: Add Description**|
|onlineMeeting|[onlineMeetingInfo](../resources/onlinemeetinginfo.md)|**TODO: Add Description**|
|onlineMeetingProvider|onlineMeetingProviderType|**TODO: Add Description**. Possible values are: `unknown`, `skypeForBusiness`, `skypeForConsumer`, `teamsForBusiness`.|
|onlineMeetingUrl|String|**TODO: Add Description**|
|organizer|[recipient](../resources/recipient.md)|**TODO: Add Description**|
|originalEndTimeZone|String|**TODO: Add Description**|
|originalStart|DateTimeOffset|**TODO: Add Description**|
|originalStartTimeZone|String|**TODO: Add Description**|
|recurrence|[patternedRecurrence](../resources/patternedrecurrence.md)|**TODO: Add Description**|
|reminderMinutesBeforeStart|Int32|**TODO: Add Description**|
|responseRequested|Boolean|**TODO: Add Description**|
|responseStatus|[responseStatus](../resources/responsestatus.md)|**TODO: Add Description**|
|sensitivity|sensitivity|**TODO: Add Description**. Possible values are: `normal`, `personal`, `private`, `confidential`.|
|seriesMasterId|String|**TODO: Add Description**|
|showAs|freeBusyStatus|**TODO: Add Description**. Possible values are: `unknown`, `free`, `tentative`, `busy`, `oof`, `workingElsewhere`.|
|start|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|
|transactionId|String|**TODO: Add Description**|
|type|eventType|**TODO: Add Description**. Possible values are: `singleInstance`, `occurrence`, `exception`, `seriesMaster`.|
|uid|String|**TODO: Add Description**|
|webLink|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [event](../resources/event.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_event_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/me/events
Content-Type: application/json
Content-length: 1765

{
  "@odata.type": "#microsoft.graph.event",
  "categories": [
    "String"
  ],
  "changeKey": "String",
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
HTTP/1.1 201 Created
Content-Type: application/json

{
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
```

