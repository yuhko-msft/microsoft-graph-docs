---
title: "Update onlineMeeting"
description: "Update the properties of an onlineMeeting object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update onlineMeeting
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [onlineMeeting](../resources/onlinemeeting.md) object.

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
PATCH /me/onlineMeetings/{onlineMeetingId}
PATCH /app/onlineMeetings/{onlineMeetingId}
PATCH /communications/onlineMeetings/{onlineMeetingId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|accessLevel|accessLevel|**TODO: Add Description**. The possible values are: `everyone`, `invited`, `locked`, `sameEnterprise`, `sameEnterpriseAndFederated`. Optional.|
|allowAttendeeToEnableCamera|Boolean|**TODO: Add Description** Optional.|
|allowAttendeeToEnableMic|Boolean|**TODO: Add Description** Optional.|
|allowedPresenters|onlineMeetingPresenters|**TODO: Add Description**. The possible values are: `everyone`, `organization`, `roleIsPresenter`, `organizer`, `unknownFutureValue`. Optional.|
|allowMeetingChat|meetingChatMode|**TODO: Add Description**. The possible values are: `enabled`, `disabled`, `limited`, `unknownFutureValue`. Optional.|
|allowTeamworkReactions|Boolean|**TODO: Add Description** Optional.|
|alternativeRecording|Stream|**TODO: Add Description** Optional.|
|attendeeReport|Stream|**TODO: Add Description** Optional.|
|audioConferencing|[audioConferencing](../resources/audioconferencing.md)|**TODO: Add Description** Optional.|
|broadcastSettings|[broadcastMeetingSettings](../resources/broadcastmeetingsettings.md)|**TODO: Add Description** Optional.|
|canceledDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|capabilities|meetingCapabilities collection|**TODO: Add Description**. The possible values are: `questionAndAnswer`, `unknownFutureValue`. Optional.|
|chatInfo|[chatInfo](../resources/chatinfo.md)|**TODO: Add Description** Optional.|
|creationDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|endDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|entryExitAnnouncement|Boolean|**TODO: Add Description** Optional.|
|expirationDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|externalId|String|**TODO: Add Description** Optional.|
|isBroadcast|Boolean|**TODO: Add Description** Optional.|
|isCancelled|Boolean|**TODO: Add Description** Optional.|
|isEntryExitAnnounced|Boolean|**TODO: Add Description** Optional.|
|joinInformation|[itemBody](../resources/itembody.md)|**TODO: Add Description** Optional.|
|joinUrl|String|**TODO: Add Description** Optional.|
|lobbyBypassSettings|[lobbyBypassSettings](../resources/lobbybypasssettings.md)|**TODO: Add Description** Optional.|
|participants|[meetingParticipants](../resources/meetingparticipants.md)|**TODO: Add Description** Optional.|
|recordAutomatically|Boolean|**TODO: Add Description** Optional.|
|recording|Stream|**TODO: Add Description** Optional.|
|startDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|state|meetingState|**TODO: Add Description**. The possible values are: `inactive`, `active`, `unknownFutureValue`. Optional.|
|subject|String|**TODO: Add Description** Optional.|
|videoTeleconferenceId|String|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [onlineMeeting](../resources/onlinemeeting.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_onlinemeeting"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/me/onlineMeetings/{onlineMeetingId}
Content-Type: application/json
Content-length: 1445

{
  "@odata.type": "#microsoft.graph.onlineMeeting",
  "accessLevel": "String",
  "allowAttendeeToEnableCamera": "Boolean",
  "allowAttendeeToEnableMic": "Boolean",
  "allowedPresenters": "String",
  "allowMeetingChat": "String",
  "allowTeamworkReactions": "Boolean",
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
  "recordAutomatically": "Boolean",
  "recording": "Stream",
  "startDateTime": "String (timestamp)",
  "state": "String",
  "subject": "String",
  "videoTeleconferenceId": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.onlineMeeting",
  "id": "8f6f2fb0-2fb0-8f6f-b02f-6f8fb02f6f8f",
  "accessLevel": "String",
  "allowAttendeeToEnableCamera": "Boolean",
  "allowAttendeeToEnableMic": "Boolean",
  "allowedPresenters": "String",
  "allowMeetingChat": "String",
  "allowTeamworkReactions": "Boolean",
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
  "recordAutomatically": "Boolean",
  "recording": "Stream",
  "startDateTime": "String (timestamp)",
  "state": "String",
  "subject": "String",
  "videoTeleconferenceId": "String"
}
```

