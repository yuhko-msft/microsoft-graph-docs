---
title: "Update participant"
description: "Update the properties of a participant object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update participant
Namespace: microsoft.graph



Update the properties of a [participant](../resources/participant.md) object.

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
PATCH /app/calls/{callId}/participants/{participantId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [participant](../resources/participant.md) object.

The following table shows the properties that are required when you update the [participant](../resources/participant.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|info|[participantInfo](../resources/participantinfo.md)|**TODO: Add Description**|
|isInLobby|Boolean|**TODO: Add Description**|
|isMuted|Boolean|**TODO: Add Description**|
|mediaStreams|[mediaStream](../resources/mediastream.md) collection|**TODO: Add Description**|
|metadata|String|**TODO: Add Description**|
|recordingInfo|[recordingInfo](../resources/recordinginfo.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [participant](../resources/participant.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_participant"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/app/calls/{callId}/participants/{participantId}
Content-Type: application/json
Content-length: 376

{
  "@odata.type": "#microsoft.graph.participant",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```

