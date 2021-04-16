---
title: "call: recordResponse"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# call: recordResponse
Namespace: microsoft.graph



**TODO: Add Description**

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
POST /app/calls/{callId}/recordResponse
POST /communications/calls/{callId}/recordResponse
POST /participantLeftNotification/call/recordResponse
POST /participantJoiningNotification/call/recordResponse
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply JSON representation of the parameters.

The following table shows the parameters that can be used with this action.

|Parameter|Type|Description|
|:---|:---|:---|
|prompts|[prompt](../resources/prompt.md) collection|**TODO: Add Description**|
|bargeInAllowed|Boolean|**TODO: Add Description**|
|initialSilenceTimeoutInSeconds|Int32|**TODO: Add Description**|
|maxSilenceTimeoutInSeconds|Int32|**TODO: Add Description**|
|maxRecordDurationInSeconds|Int32|**TODO: Add Description**|
|playBeep|Boolean|**TODO: Add Description**|
|streamWhileRecording|Boolean|**TODO: Add Description**|
|stopTones|String collection|**TODO: Add Description**|
|clientContext|String|**TODO: Add Description**|



## Response

If successful, this action returns a `200 OK` response code and a [recordOperation](../resources/recordoperation.md) in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "call_recordresponse"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/app/calls/{callId}/recordResponse

Content-Type: application/json
Content-length: 391

{
  "prompts": [
    {
      "@odata.type": "microsoft.graph.mediaPrompt"
    }
  ],
  "bargeInAllowed": "Boolean",
  "initialSilenceTimeoutInSeconds": "Integer",
  "maxSilenceTimeoutInSeconds": "Integer",
  "maxRecordDurationInSeconds": "Integer",
  "playBeep": "Boolean",
  "streamWhileRecording": "Boolean",
  "stopTones": [
    "String"
  ],
  "clientContext": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.recordOperation"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.recordOperation",
    "id": "String (identifier)",
    "clientContext": "String",
    "resultInfo": {
      "@odata.type": "microsoft.graph.resultInfo"
    },
    "status": "String",
    "completionReason": "String",
    "recordingAccessToken": "String",
    "recordingLocation": "String"
  }
}
```

