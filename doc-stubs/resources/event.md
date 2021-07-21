---
title: "event resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# event resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [outlookItem](../resources/outlookitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List events](../api/event-list.md)|[event](../resources/event.md) collection|Get a list of the [event](../resources/event.md) objects and their properties.|
|[Create event](../api/event-create.md)|[event](../resources/event.md)|Create a new [event](../resources/event.md) object.|
|[Get event](../api/event-get.md)|[event](../resources/event.md)|Read the properties and relationships of an [event](../resources/event.md) object.|
|[Update event](../api/event-update.md)|[event](../resources/event.md)|Update the properties of an [event](../resources/event.md) object.|
|[Delete event](../api/event-delete.md)|None|Deletes an [event](../resources/event.md) object.|
|[cancel](../api/event-cancel.md)|None|**TODO: Add Description**|
|[delta](../api/event-delta.md)|[event](../resources/event.md) collection|**TODO: Add Description**|
|[accept](../api/event-accept.md)|None|**TODO: Add Description**|
|[decline](../api/event-decline.md)|None|**TODO: Add Description**|
|[dismissReminder](../api/event-dismissreminder.md)|None|**TODO: Add Description**|
|[forward](../api/event-forward.md)|None|**TODO: Add Description**|
|[snoozeReminder](../api/event-snoozereminder.md)|None|**TODO: Add Description**|
|[tentativelyAccept](../api/event-tentativelyaccept.md)|None|**TODO: Add Description**|
|[List attachments](../api/event-list-attachments.md)|[attachment](../resources/attachment.md) collection|Get the attachment resources from the attachments navigation property.|
|[Create attachment](../api/event-post-attachments.md)|[attachment](../resources/attachment.md)|Create a new attachment object.|
|[List calendar](../api/event-list-calendar.md)|[calendar](../resources/calendar.md) collection|Get the calendar resources from the calendar navigation property.|
|[Create calendar](../api/event-post-calendar.md)|[calendar](../resources/calendar.md)|Create a new calendar object.|
|[List exceptionOccurrences](../api/event-list-exceptionoccurrences.md)|[event](../resources/event.md) collection|Get the event resources from the exceptionOccurrences navigation property.|
|[Create event](../api/event-post-exceptionoccurrences.md)|[event](../resources/event.md)|Create a new event object.|
|[List extensions](../api/event-list-extensions.md)|[extension](../resources/extension.md) collection|Get the extension resources from the extensions navigation property.|
|[Create extension](../api/event-post-extensions.md)|[extension](../resources/extension.md)|Create a new extension object.|
|[List instances](../api/event-list-instances.md)|[event](../resources/event.md) collection|Get the event resources from the instances navigation property.|
|[Create event](../api/event-post-instances.md)|[event](../resources/event.md)|Create a new event object.|
|[List multiValueExtendedProperties](../api/event-list-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|Get the multiValueLegacyExtendedProperty resources from the multiValueExtendedProperties navigation property.|
|[Create multiValueLegacyExtendedProperty](../api/event-post-multivalueextendedproperties.md)|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md)|Create a new multiValueLegacyExtendedProperty object.|
|[List singleValueExtendedProperties](../api/event-list-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|Get the singleValueLegacyExtendedProperty resources from the singleValueExtendedProperties navigation property.|
|[Create singleValueLegacyExtendedProperty](../api/event-post-singlevalueextendedproperties.md)|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md)|Create a new singleValueLegacyExtendedProperty object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|allowNewTimeProposals|Boolean|**TODO: Add Description**|
|attendees|[attendee](../resources/attendee.md) collection|**TODO: Add Description**|
|body|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|bodyPreview|String|**TODO: Add Description**|
|cancelledOccurrences|String collection|**TODO: Add Description**|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
|end|[dateTimeTimeZone](../resources/datetimetimezone.md)|**TODO: Add Description**|
|hasAttachments|Boolean|**TODO: Add Description**|
|hideAttendees|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|importance|importance|**TODO: Add Description**. Possible values are: `low`, `normal`, `high`.|
|isAllDay|Boolean|**TODO: Add Description**|
|isCancelled|Boolean|**TODO: Add Description**|
|isDraft|Boolean|**TODO: Add Description**|
|isOnlineMeeting|Boolean|**TODO: Add Description**|
|isOrganizer|Boolean|**TODO: Add Description**|
|isReminderOn|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md).|
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

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|attachments|[attachment](../resources/attachment.md) collection|**TODO: Add Description**|
|calendar|[calendar](../resources/calendar.md)|**TODO: Add Description**|
|exceptionOccurrences|[event](../resources/event.md) collection|**TODO: Add Description**|
|extensions|[extension](../resources/extension.md) collection|**TODO: Add Description**|
|instances|[event](../resources/event.md) collection|**TODO: Add Description**|
|multiValueExtendedProperties|[multiValueLegacyExtendedProperty](../resources/multivaluelegacyextendedproperty.md) collection|**TODO: Add Description**|
|singleValueExtendedProperties|[singleValueLegacyExtendedProperty](../resources/singlevaluelegacyextendedproperty.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.event",
  "baseType": "microsoft.graph.outlookItem",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.event",
  "id": "String (identifier)",
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

