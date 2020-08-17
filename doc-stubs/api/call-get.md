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

|Permission type|Permissions (from most to least privileged)|
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
GET /communications/calls/{callId}
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
GET https://graph.microsoft.com/v1.0/communications/calls/{callId}
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
    "id": "bc92547f-547f-bc92-7f54-92bc7f5492bc",
    "state": "String",
    "mediaState": {
      "@odata.type": "microsoft.graph.callMediaState"
    },
    "resultInfo": {
      "@odata.type": "microsoft.graph.resultInfo"
    },
    "direction": "String",
    "subject": "String",
    "callbackUri": "String",
    "callRoutes": [
      {
        "@odata.type": "microsoft.graph.callRoute"
      }
    ],
    "source": {
      "@odata.type": "microsoft.graph.participantInfo"
    },
    "targets": [
      {
        "@odata.type": "microsoft.graph.invitationParticipantInfo"
      }
    ],
    "requestedModalities": [
      "String"
    ],
    "mediaConfig": {
      "@odata.type": "microsoft.graph.mediaConfig"
    },
    "chatInfo": {
      "@odata.type": "microsoft.graph.chatInfo"
    },
    "callOptions": {
      "@odata.type": "microsoft.graph.callOptions"
    },
    "meetingInfo": {
      "@odata.type": "microsoft.graph.meetingInfo"
    },
    "transcription": {
      "@odata.type": "microsoft.graph.callTranscriptionInfo"
    },
    "tenantId": "String",
    "myParticipantId": "String",
    "toneInfo": {
      "@odata.type": "microsoft.graph.toneInfo"
    },
    "callChainId": "String",
    "incomingContext": {
      "@odata.type": "microsoft.graph.incomingContext"
    }
  }
}
```

