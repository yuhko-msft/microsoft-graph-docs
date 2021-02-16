---
title: "List call"
description: "Get the call resources from the call navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List call
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get the call resources from the call navigation property.

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

If successful, this method returns a `200 OK` response code and a collection of [call](../resources/call.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_call"
}
-->
``` http
GET https://graph.microsoft.com/beta/participantJoiningNotification/call
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.call)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.call",
      "state": "String",
      "mediaState": {
        "@odata.type": "microsoft.graph.callMediaState"
      },
      "resultInfo": {
        "@odata.type": "microsoft.graph.resultInfo"
      },
      "terminationReason": "String",
      "direction": "String",
      "ringingTimeoutInSeconds": "Integer",
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
      "answeredBy": {
        "@odata.type": "microsoft.graph.participantInfo"
      },
      "requestedModalities": [
        "String"
      ],
      "activeModalities": [
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
      "meetingCapability": {
        "@odata.type": "microsoft.graph.meetingCapability"
      },
      "routingPolicies": [
        "String"
      ],
      "tenantId": "String",
      "myParticipantId": "String",
      "toneInfo": {
        "@odata.type": "microsoft.graph.toneInfo"
      },
      "callChainId": "String",
      "incomingContext": {
        "@odata.type": "microsoft.graph.incomingContext"
      },
      "id": "5f539805-9805-5f53-0598-535f0598535f"
    }
  ]
}
```

