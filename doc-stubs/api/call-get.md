---
title: "Get call"
description: "Read the properties and relationships of a call object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get call
Namespace: microsoft.graph



Read the properties and relationships of a [call](../resources/call.md) object.

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
GET /app/calls/{callId}
GET /communications/calls/{callId}
GET /participantLeftNotification/call
GET /participantJoiningNotification/call
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

If successful, this method returns a `200 OK` response code and a [call](../resources/call.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_call"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/app/calls/{callId}
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

