---
title: "Get participant"
description: "Read the properties and relationships of a participant object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get participant
Namespace: microsoft.graph



Read the properties and relationships of a [participant](../resources/participant.md) object.

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
GET /app/calls/{callId}/participants/{participantId}
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

If successful, this method returns a `200 OK` response code and a [participant](../resources/participant.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_participant"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/app/calls/{callId}/participants/{participantId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.participant"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.participant",
    "id": "c8f192b7-92b7-c8f1-b792-f1c8b792f1c8",
    "info": {
      "@odata.type": "microsoft.graph.participantInfo"
    },
    "isInLobby": "Boolean",
    "isMuted": "Boolean",
    "mediaStreams": [
      {
        "@odata.type": "microsoft.graph.mediaStream"
      }
    ],
    "metadata": "String",
    "recordingInfo": {
      "@odata.type": "microsoft.graph.recordingInfo"
    }
  }
}
```

