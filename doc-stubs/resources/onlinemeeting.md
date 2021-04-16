---
title: "onlineMeeting resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# onlineMeeting resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List onlineMeetings](../api/onlinemeeting-list.md)|[onlineMeeting](../resources/onlinemeeting.md) collection|Get a list of the [onlineMeeting](../resources/onlinemeeting.md) objects and their properties.|
|[Create onlineMeeting](../api/onlinemeeting-create.md)|[onlineMeeting](../resources/onlinemeeting.md)|Create a new [onlineMeeting](../resources/onlinemeeting.md) object.|
|[Get onlineMeeting](../api/onlinemeeting-get.md)|[onlineMeeting](../resources/onlinemeeting.md)|Read the properties and relationships of an [onlineMeeting](../resources/onlinemeeting.md) object.|
|[Update onlineMeeting](../api/onlinemeeting-update.md)|[onlineMeeting](../resources/onlinemeeting.md)|Update the properties of an [onlineMeeting](../resources/onlinemeeting.md) object.|
|[Delete onlineMeeting](../api/onlinemeeting-delete.md)|None|Deletes an [onlineMeeting](../resources/onlinemeeting.md) object.|
|[List meetingAttendanceReport](../api/onlinemeeting-list-meetingattendancereport.md)|[meetingAttendanceReport](../resources/meetingattendancereport.md) collection|Get the meetingAttendanceReport resources from the meetingAttendanceReport navigation property.|
|[Create meetingAttendanceReport](../api/onlinemeeting-post-meetingattendancereport.md)|[meetingAttendanceReport](../resources/meetingattendancereport.md)|Create a new meetingAttendanceReport object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accessLevel|accessLevel|**TODO: Add Description**. Possible values are: `everyone`, `invited`, `locked`, `sameEnterprise`, `sameEnterpriseAndFederated`.|
|allowedPresenters|onlineMeetingPresenters|**TODO: Add Description**. Possible values are: `everyone`, `organization`, `roleIsPresenter`, `organizer`, `unknownFutureValue`.|
|alternativeRecording|Stream|**TODO: Add Description**|
|attendeeReport|Stream|**TODO: Add Description**|
|audioConferencing|[audioConferencing](../resources/audioconferencing.md)|**TODO: Add Description**|
|broadcastSettings|[broadcastMeetingSettings](../resources/broadcastmeetingsettings.md)|**TODO: Add Description**|
|canceledDateTime|DateTimeOffset|**TODO: Add Description**|
|capabilities|meetingCapabilities collection|**TODO: Add Description**|
|chatInfo|[chatInfo](../resources/chatinfo.md)|**TODO: Add Description**|
|creationDateTime|DateTimeOffset|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|entryExitAnnouncement|Boolean|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|externalId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|isBroadcast|Boolean|**TODO: Add Description**|
|isCancelled|Boolean|**TODO: Add Description**|
|isEntryExitAnnounced|Boolean|**TODO: Add Description**|
|joinInformation|[itemBody](../resources/itembody.md)|**TODO: Add Description**|
|joinUrl|String|**TODO: Add Description**|
|lobbyBypassSettings|[lobbyBypassSettings](../resources/lobbybypasssettings.md)|**TODO: Add Description**|
|participants|[meetingParticipants](../resources/meetingparticipants.md)|**TODO: Add Description**|
|recording|Stream|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|
|videoTeleconferenceId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|meetingAttendanceReport|[meetingAttendanceReport](../resources/meetingattendancereport.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.onlineMeeting",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.onlineMeeting",
  "id": "String (identifier)",
  "accessLevel": "String",
  "allowedPresenters": "String",
  "alternativeRecording": "Stream",
  "attendeeReport": "Stream",
  "audioConferencing": {
    "@odata.type": "microsoft.graph.audioConferencing"
  },
  "broadcastSettings": {
    "@odata.type": "microsoft.graph.broadcastMeetingSettings"
  },
  "canceledDateTime": "String (timestamp)",
  "capabilities": [
    "String"
  ],
  "chatInfo": {
    "@odata.type": "microsoft.graph.chatInfo"
  },
  "creationDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "entryExitAnnouncement": "Boolean",
  "expirationDateTime": "String (timestamp)",
  "externalId": "String",
  "isBroadcast": "Boolean",
  "isCancelled": "Boolean",
  "isEntryExitAnnounced": "Boolean",
  "joinInformation": {
    "@odata.type": "microsoft.graph.itemBody"
  },
  "joinUrl": "String",
  "lobbyBypassSettings": {
    "@odata.type": "microsoft.graph.lobbyBypassSettings"
  },
  "participants": {
    "@odata.type": "microsoft.graph.meetingParticipants"
  },
  "recording": "Stream",
  "startDateTime": "String (timestamp)",
  "subject": "String",
  "videoTeleconferenceId": "String"
}
```

