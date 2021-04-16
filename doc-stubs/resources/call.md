---
title: "call resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# call resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List calls](../api/call-list.md)|[call](../resources/call.md) collection|Get a list of the [call](../resources/call.md) objects and their properties.|
|[Create call](../api/call-create.md)|[call](../resources/call.md)|Create a new [call](../resources/call.md) object.|
|[Get call](../api/call-get.md)|[call](../resources/call.md)|Read the properties and relationships of a [call](../resources/call.md) object.|
|[Update call](../api/call-update.md)|[call](../resources/call.md)|Update the properties of a [call](../resources/call.md) object.|
|[Delete call](../api/call-delete.md)|None|Deletes a [call](../resources/call.md) object.|
|[answer](../api/call-answer.md)|None|**TODO: Add Description**|
|[playPrompt](../api/call-playprompt.md)|[playPromptOperation](../resources/playpromptoperation.md)|**TODO: Add Description**|
|[record](../api/call-record.md)|[recordOperation](../resources/recordoperation.md)|**TODO: Add Description**|
|[recordResponse](../api/call-recordresponse.md)|[recordOperation](../resources/recordoperation.md)|**TODO: Add Description**|
|[redirect](../api/call-redirect.md)|None|**TODO: Add Description**|
|[List audioRoutingGroups](../api/call-list-audioroutinggroups.md)|[audioRoutingGroup](../resources/audioroutinggroup.md) collection|Get the audioRoutingGroup resources from the audioRoutingGroups navigation property.|
|[Create audioRoutingGroup](../api/call-post-audioroutinggroups.md)|[audioRoutingGroup](../resources/audioroutinggroup.md)|Create a new audioRoutingGroup object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|activeModalities|modality collection|**TODO: Add Description**|
|answeredBy|[participantInfo](../resources/participantinfo.md)|**TODO: Add Description**|
|callbackUri|String|**TODO: Add Description**|
|callChainId|String|**TODO: Add Description**|
|callOptions|[callOptions](../resources/calloptions.md)|**TODO: Add Description**|
|callRoutes|[callRoute](../resources/callroute.md) collection|**TODO: Add Description**|
|chatInfo|[chatInfo](../resources/chatinfo.md)|**TODO: Add Description**|
|direction|callDirection|**TODO: Add Description**. Possible values are: `incoming`, `outgoing`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|incomingContext|[incomingContext](../resources/incomingcontext.md)|**TODO: Add Description**|
|mediaConfig|[mediaConfig](../resources/mediaconfig.md)|**TODO: Add Description**|
|mediaState|[callMediaState](../resources/callmediastate.md)|**TODO: Add Description**|
|meetingCapability|[meetingCapability](../resources/meetingcapability.md)|**TODO: Add Description**|
|meetingInfo|[meetingInfo](../resources/meetinginfo.md)|**TODO: Add Description**|
|myParticipantId|String|**TODO: Add Description**|
|requestedModalities|modality collection|**TODO: Add Description**|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description**|
|ringingTimeoutInSeconds|Int32|**TODO: Add Description**|
|routingPolicies|routingPolicy collection|**TODO: Add Description**|
|source|[participantInfo](../resources/participantinfo.md)|**TODO: Add Description**|
|state|callState|**TODO: Add Description**. Possible values are: `incoming`, `establishing`, `ringing`, `established`, `hold`, `transferring`, `transferAccepted`, `redirecting`, `terminating`, `terminated`, `unknownFutureValue`.|
|subject|String|**TODO: Add Description**|
|targets|[invitationParticipantInfo](../resources/invitationparticipantinfo.md) collection|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|terminationReason|String|**TODO: Add Description**|
|toneInfo|[toneInfo](../resources/toneinfo.md)|**TODO: Add Description**|
|transcription|[callTranscriptionInfo](../resources/calltranscriptioninfo.md)|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|audioRoutingGroups|[audioRoutingGroup](../resources/audioroutinggroup.md) collection|**TODO: Add Description**|
|operations|[commsOperation](../resources/commsoperation.md) collection|**TODO: Add Description**|
|participants|[participant](../resources/participant.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.call",
  "baseType": "microsoft.graph.entity",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.call",
  "id": "String (identifier)",
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

