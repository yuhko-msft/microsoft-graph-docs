---
title: "event resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# event resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Inherits from [outlookItem](outlookitem.md)

## Methods

| Method                                                                                       | Return Type                                                                             | Description                                                                                                 |
| :------------------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------------- | :---------------------------------------------------------------------------------------------------------- |
| [List event](../api/event-list.md)                                                           | [event](event.md) collection                                                            | List properties and relationships of an event object.                                                       |
| [Create event](../api/event-create.md)                                                       | [event](event.md)                                                                       | Create a new event object.                                                                                  |
| [Get event](../api/event-get.md)                                                             | [event](event.md)                                                                       | Read properties and relationships of an event object.                                                       |
| [Update event](../api/event-update.md)                                                       | [event](event.md)                                                                       | Update the properties of an event object.                                                                   |
| [Delete event](../api/event-delete.md)                                                       |                                                                                         | Delete an event object.                                                                                     |
| [accept](../api/event-accept.md)                                                             |                                                                                         |                                                                                                             |
| [cancel](../api/event-cancel.md)                                                             |                                                                                         |                                                                                                             |
| [decline](../api/event-decline.md)                                                           |                                                                                         |                                                                                                             |
| [dismissReminder](../api/event-dismissReminder.md)                                           |                                                                                         |                                                                                                             |
| [forward](../api/event-forward.md)                                                           |                                                                                         |                                                                                                             |
| [snoozeReminder](../api/event-snoozeReminder.md)                                             |                                                                                         |                                                                                                             |
| [tentativelyAccept](../api/event-tentativelyAccept.md)                                       |                                                                                         |                                                                                                             |
| [delta](../api/event-delta.md)                                                               |                                                                                         |                                                                                                             |
| [List attachments](../api/event-list-attachments.md)                                         | [attachment](../resources/-attachment.md)                                               | Get the attachment objects from an attachments navigation property.                                         |
| [Create attachments](../api/event-post-attachments.md)                                       | [attachment](../resources/-attachment.md)                                               | Create a new attachment object.                                                                             |
| [Get attachments](../api/event-get-attachments.md)                                           | [attachment](../resources/-attachment.md)                                               | Read the properties and relationships of an attachment object.                                              |
| [Update attachments](../api/event-update-attachments.md)                                     | [attachment](../resources/-attachment.md)                                               | Update the properties of an attachment object.                                                              |
| [Delete attachments](../api/event-delete-attachments.md)                                     |                                                                                         | Delete an attachment object.                                                                                |
| [List calendar](../api/event-list-calendar.md)                                               | [calendar](../resources/-calendar.md)                                                   | Get the calendar objects from a calendar navigation property.                                               |
| [Create calendar](../api/event-post-calendar.md)                                             | [calendar](../resources/-calendar.md)                                                   | Create a new calendar object.                                                                               |
| [Get calendar](../api/event-get-calendar.md)                                                 | [calendar](../resources/-calendar.md)                                                   | Read the properties and relationships of a calendar object.                                                 |
| [Update calendar](../api/event-update-calendar.md)                                           | [calendar](../resources/-calendar.md)                                                   | Update the properties of a calendar object.                                                                 |
| [Delete calendar](../api/event-delete-calendar.md)                                           |                                                                                         | Delete a calendar object.                                                                                   |
| [List exceptionOccurrences](../api/event-list-exceptionoccurrences.md)                       | [event](../resources/-event.md)                                                         | Get the event objects from an exceptionOccurrences navigation property.                                     |
| [Create exceptionOccurrences](../api/event-post-exceptionoccurrences.md)                     | [event](../resources/-event.md)                                                         | Create a new event object.                                                                                  |
| [Get exceptionOccurrences](../api/event-get-exceptionoccurrences.md)                         | [event](../resources/-event.md)                                                         | Read the properties and relationships of an event object.                                                   |
| [Update exceptionOccurrences](../api/event-update-exceptionoccurrences.md)                   | [event](../resources/-event.md)                                                         | Update the properties of an event object.                                                                   |
| [Delete exceptionOccurrences](../api/event-delete-exceptionoccurrences.md)                   |                                                                                         | Delete an event object.                                                                                     |
| [List extensions](../api/event-list-extensions.md)                                           | [extension](../resources/-extension.md)                                                 | Get the extension objects from an extensions navigation property.                                           |
| [Create extensions](../api/event-post-extensions.md)                                         | [extension](../resources/-extension.md)                                                 | Create a new extension object.                                                                              |
| [Get extensions](../api/event-get-extensions.md)                                             | [extension](../resources/-extension.md)                                                 | Read the properties and relationships of an extension object.                                               |
| [Update extensions](../api/event-update-extensions.md)                                       | [extension](../resources/-extension.md)                                                 | Update the properties of an extension object.                                                               |
| [Delete extensions](../api/event-delete-extensions.md)                                       |                                                                                         | Delete an extension object.                                                                                 |
| [List instances](../api/event-list-instances.md)                                             | [event](../resources/-event.md)                                                         | Get the event objects from an instances navigation property.                                                |
| [Create instances](../api/event-post-instances.md)                                           | [event](../resources/-event.md)                                                         | Create a new event object.                                                                                  |
| [Get instances](../api/event-get-instances.md)                                               | [event](../resources/-event.md)                                                         | Read the properties and relationships of an event object.                                                   |
| [Update instances](../api/event-update-instances.md)                                         | [event](../resources/-event.md)                                                         | Update the properties of an event object.                                                                   |
| [Delete instances](../api/event-delete-instances.md)                                         |                                                                                         | Delete an event object.                                                                                     |
| [List multiValueExtendedProperties](../api/event-list-multivalueextendedproperties.md)       | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Get the multiValueLegacyExtendedProperty objects from a multiValueExtendedProperties navigation property.   |
| [Create multiValueExtendedProperties](../api/event-post-multivalueextendedproperties.md)     | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Create a new multiValueLegacyExtendedProperty object.                                                       |
| [Get multiValueExtendedProperties](../api/event-get-multivalueextendedproperties.md)         | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Read the properties and relationships of a multiValueLegacyExtendedProperty object.                         |
| [Update multiValueExtendedProperties](../api/event-update-multivalueextendedproperties.md)   | [multiValueLegacyExtendedProperty](../resources/-multivaluelegacyextendedproperty.md)   | Update the properties of a multiValueLegacyExtendedProperty object.                                         |
| [Delete multiValueExtendedProperties](../api/event-delete-multivalueextendedproperties.md)   |                                                                                         | Delete a multiValueLegacyExtendedProperty object.                                                           |
| [List singleValueExtendedProperties](../api/event-list-singlevalueextendedproperties.md)     | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Get the singleValueLegacyExtendedProperty objects from a singleValueExtendedProperties navigation property. |
| [Create singleValueExtendedProperties](../api/event-post-singlevalueextendedproperties.md)   | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Create a new singleValueLegacyExtendedProperty object.                                                      |
| [Get singleValueExtendedProperties](../api/event-get-singlevalueextendedproperties.md)       | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Read the properties and relationships of a singleValueLegacyExtendedProperty object.                        |
| [Update singleValueExtendedProperties](../api/event-update-singlevalueextendedproperties.md) | [singleValueLegacyExtendedProperty](../resources/-singlevaluelegacyextendedproperty.md) | Update the properties of a singleValueLegacyExtendedProperty object.                                        |
| [Delete singleValueExtendedProperties](../api/event-delete-singlevalueextendedproperties.md) |                                                                                         | Delete a singleValueLegacyExtendedProperty object.                                                          |

## Properties

| Property                   | Type                                                       | Description |
| :------------------------- | :--------------------------------------------------------- | :---------- |
| allowNewTimeProposals      | Boolean                                                    |             |
| attendees                  | [attendee](../resources/attendee.md) collection            |             |
| body                       | [itemBody](../resources/itembody.md)                       |             |
| bodyPreview                | String                                                     |             |
| cancelledOccurrences       | String collection                                          |             |
| categories                 | String collection                                          |             |
| changeKey                  | String                                                     |             |
| createdDateTime            | DateTimeOffset                                             |             |
| end                        | [dateTimeTimeZone](../resources/datetimetimezone.md)       |             |
| hasAttachments             | Boolean                                                    |             |
| hideAttendees              | Boolean                                                    |             |
| id                         | String                                                     | Read-only.  |
| importance                 | String                                                     |             |
| isAllDay                   | Boolean                                                    |             |
| isCancelled                | Boolean                                                    |             |
| isDraft                    | Boolean                                                    |             |
| isOnlineMeeting            | Boolean                                                    |             |
| isOrganizer                | Boolean                                                    |             |
| isReminderOn               | Boolean                                                    |             |
| lastModifiedDateTime       | DateTimeOffset                                             |             |
| location                   | [location](../resources/location.md)                       |             |
| locations                  | [location](../resources/location.md) collection            |             |
| occurrenceId               | String                                                     |             |
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
| uid                        | String                                                     |             |
| webLink                    | String                                                     |             |

## Relationships

| Relationship                  | Type                                                                                              | Description |
| :---------------------------- | :------------------------------------------------------------------------------------------------ | :---------- |
| attachments                   | [attachment](../resources/attachment.md) collection                                               |             |
| calendar                      | [calendar](../resources/calendar.md)                                                              |             |
| exceptionOccurrences          | [event](../resources/event.md) collection                                                         |             |
| extensions                    | [extension](../resources/extension.md) collection                                                 |             |
| instances                     | [event](../resources/event.md) collection                                                         |             |
| multiValueExtendedProperties  | [multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection   |             |
| singleValueExtendedProperties | [singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.event",
  "baseType": "microsoft.graph.outlookItem",
  "openType": True
}
-->

```json
{
  "@odata.type": "#microsoft.graph.event",
  "allowNewTimeProposals": "Boolean",
  "attendees": [{"@odata.type": "microsoft.graph.attendee"}],
  "body": {"@odata.type": "microsoft.graph.itemBody"},
  "bodyPreview": "String",
  "cancelledOccurrences": ["String"],
  "categories": ["String"],
  "changeKey": "String",
  "createdDateTime": "DateTimeOffset",
  "end": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "hasAttachments": "Boolean",
  "hideAttendees": "Boolean",
  "id": "String (identifier)",
  "importance": "low | normal | high",
  "isAllDay": "Boolean",
  "isCancelled": "Boolean",
  "isDraft": "Boolean",
  "isOnlineMeeting": "Boolean",
  "isOrganizer": "Boolean",
  "isReminderOn": "Boolean",
  "lastModifiedDateTime": "DateTimeOffset",
  "location": {"@odata.type": "microsoft.graph.location"},
  "locations": [{"@odata.type": "microsoft.graph.location"}],
  "occurrenceId": "String",
  "onlineMeeting": {"@odata.type": "microsoft.graph.onlineMeetingInfo"},
  "onlineMeetingProvider": "unknown | skypeForBusiness | skypeForConsumer | teamsForBusiness",
  "onlineMeetingUrl": "String",
  "organizer": {"@odata.type": "microsoft.graph.recipient"},
  "originalEndTimeZone": "String",
  "originalStart": "DateTimeOffset",
  "originalStartTimeZone": "String",
  "recurrence": {"@odata.type": "microsoft.graph.patternedRecurrence"},
  "reminderMinutesBeforeStart": "Int32",
  "responseRequested": "Boolean",
  "responseStatus": {"@odata.type": "microsoft.graph.responseStatus"},
  "sensitivity": "normal | personal | private | confidential",
  "seriesMasterId": "String",
  "showAs": "free | tentative | unknown | busy | oof | workingElsewhere",
  "start": {"@odata.type": "microsoft.graph.dateTimeTimeZone"},
  "subject": "String",
  "transactionId": "String",
  "type": "singleInstance | occurrence | exception | seriesMaster",
  "uid": "String",
  "webLink": "String"
}
```
