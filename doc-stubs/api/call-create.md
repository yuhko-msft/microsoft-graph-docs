---
title: "Create call"
description: "Create a new call object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create call
Namespace: microsoft.graph



Create a new [call](../resources/call.md) object.

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
POST /app/calls
POST /communications/calls
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [call](../resources/call.md) object.

The following table shows the properties that are required when you create the [call](../resources/call.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activeModalities|modality collection|**TODO: Add Description**. Possible values are: `unknown`, `audio`, `video`, `videoBasedScreenSharing`, `data`, `unknownFutureValue`.|
|answeredBy|[participantInfo](../resources/participantinfo.md)|**TODO: Add Description**|
|callbackUri|String|**TODO: Add Description**|
|callChainId|String|**TODO: Add Description**|
|callOptions|[callOptions](../resources/calloptions.md)|**TODO: Add Description**|
|callRoutes|[callRoute](../resources/callroute.md) collection|**TODO: Add Description**|
|chatInfo|[chatInfo](../resources/chatinfo.md)|**TODO: Add Description**|
|direction|callDirection|**TODO: Add Description**. Possible values are: `incoming`, `outgoing`.|
|incomingContext|[incomingContext](../resources/incomingcontext.md)|**TODO: Add Description**|
|mediaConfig|[mediaConfig](../resources/mediaconfig.md)|**TODO: Add Description**|
|mediaState|[callMediaState](../resources/callmediastate.md)|**TODO: Add Description**|
|meetingCapability|[meetingCapability](../resources/meetingcapability.md)|**TODO: Add Description**|
|meetingInfo|[meetingInfo](../resources/meetinginfo.md)|**TODO: Add Description**|
|myParticipantId|String|**TODO: Add Description**|
|requestedModalities|modality collection|**TODO: Add Description**. Possible values are: `unknown`, `audio`, `video`, `videoBasedScreenSharing`, `data`, `unknownFutureValue`.|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description**|
|ringingTimeoutInSeconds|Int32|**TODO: Add Description**|
|routingPolicies|routingPolicy collection|**TODO: Add Description**. Possible values are: `none`, `noMissedCall`, `disableForwardingExceptPhone`, `disableForwarding`, `preferSkypeForBusiness`, `unknownFutureValue`.|
|source|[participantInfo](../resources/participantinfo.md)|**TODO: Add Description**|
|state|callState|**TODO: Add Description**. Possible values are: `incoming`, `establishing`, `ringing`, `established`, `hold`, `transferring`, `transferAccepted`, `redirecting`, `terminating`, `terminated`, `unknownFutureValue`.|
|subject|String|**TODO: Add Description**|
|targets|[invitationParticipantInfo](../resources/invitationparticipantinfo.md) collection|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|terminationReason|String|**TODO: Add Description**|
|toneInfo|[toneInfo](../resources/toneinfo.md)|**TODO: Add Description**|
|transcription|[callTranscriptionInfo](../resources/calltranscriptioninfo.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [call](../resources/call.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_call_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/app/calls
Content-Type: application/json
Content-length: 1568

{
  "@odata.type": "#microsoft.graph.call",
  "activeModalities": [
    "String"
  ],
  "answeredBy": {
    "@odata.type": "microsoft.graph.participantInfo"
  },
  "callbackUri": "String",
  "callChainId": "String",
  "callOptions": {
    "@odata.type": "microsoft.graph.callOptions"
  },
  "callRoutes": [
    {
      "@odata.type": "microsoft.graph.callRoute"
    }
  ],
  "chatInfo": {
    "@odata.type": "microsoft.graph.chatInfo"
  },
  "direction": "String",
  "incomingContext": {
    "@odata.type": "microsoft.graph.incomingContext"
  },
  "mediaConfig": {
    "@odata.type": "microsoft.graph.mediaConfig"
  },
  "mediaState": {
    "@odata.type": "microsoft.graph.callMediaState"
  },
  "meetingCapability": {
    "@odata.type": "microsoft.graph.meetingCapability"
  },
  "meetingInfo": {
    "@odata.type": "microsoft.graph.meetingInfo"
  },
  "myParticipantId": "String",
  "requestedModalities": [
    "String"
  ],
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "ringingTimeoutInSeconds": "Integer",
  "routingPolicies": [
    "String"
  ],
  "source": {
    "@odata.type": "microsoft.graph.participantInfo"
  },
  "state": "String",
  "subject": "String",
  "targets": [
    {
      "@odata.type": "microsoft.graph.invitationParticipantInfo"
    }
  ],
  "tenantId": "String",
  "terminationReason": "String",
  "toneInfo": {
    "@odata.type": "microsoft.graph.toneInfo"
  },
  "transcription": {
    "@odata.type": "microsoft.graph.callTranscriptionInfo"
  }
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.call"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.call",
  "id": "221eb29a-b29a-221e-9ab2-1e229ab21e22",
  "activeModalities": [
    "String"
  ],
  "answeredBy": {
    "@odata.type": "microsoft.graph.participantInfo"
  },
  "callbackUri": "String",
  "callChainId": "String",
  "callOptions": {
    "@odata.type": "microsoft.graph.callOptions"
  },
  "callRoutes": [
    {
      "@odata.type": "microsoft.graph.callRoute"
    }
  ],
  "chatInfo": {
    "@odata.type": "microsoft.graph.chatInfo"
  },
  "direction": "String",
  "incomingContext": {
    "@odata.type": "microsoft.graph.incomingContext"
  },
  "mediaConfig": {
    "@odata.type": "microsoft.graph.mediaConfig"
  },
  "mediaState": {
    "@odata.type": "microsoft.graph.callMediaState"
  },
  "meetingCapability": {
    "@odata.type": "microsoft.graph.meetingCapability"
  },
  "meetingInfo": {
    "@odata.type": "microsoft.graph.meetingInfo"
  },
  "myParticipantId": "String",
  "requestedModalities": [
    "String"
  ],
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "ringingTimeoutInSeconds": "Integer",
  "routingPolicies": [
    "String"
  ],
  "source": {
    "@odata.type": "microsoft.graph.participantInfo"
  },
  "state": "String",
  "subject": "String",
  "targets": [
    {
      "@odata.type": "microsoft.graph.invitationParticipantInfo"
    }
  ],
  "tenantId": "String",
  "terminationReason": "String",
  "toneInfo": {
    "@odata.type": "microsoft.graph.toneInfo"
  },
  "transcription": {
    "@odata.type": "microsoft.graph.callTranscriptionInfo"
  }
}
```

