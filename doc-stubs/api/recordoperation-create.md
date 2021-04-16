---
title: "Create recordOperation"
description: "Create a new recordOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create recordOperation
Namespace: microsoft.graph



Create a new [recordOperation](../resources/recordoperation.md) object.

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
POST ** Collection URI for microsoft.graph.recordOperation not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [recordOperation](../resources/recordoperation.md) object.

The following table shows the properties that are required when you create the [recordOperation](../resources/recordoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|
|completionReason|recordCompletionReason|**TODO: Add Description**. Possible values are: `operationCanceled`, `stopToneDetected`, `maxRecordDurationReached`, `initialSilenceTimeout`, `maxSilenceTimeout`, `playPromptFailed`, `playBeepFailed`, `mediaReceiveTimeout`, `unspecifiedError`.|
|recordingAccessToken|String|**TODO: Add Description**|
|recordingLocation|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [recordOperation](../resources/recordoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_recordoperation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.recordOperation not found
Content-Type: application/json
Content-length: 288

{
  "@odata.type": "#microsoft.graph.recordOperation",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "completionReason": "String",
  "recordingAccessToken": "String",
  "recordingLocation": "String"
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
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.recordOperation",
  "id": "725dc5e6-c5e6-725d-e6c5-5d72e6c55d72",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "completionReason": "String",
  "recordingAccessToken": "String",
  "recordingLocation": "String"
}
```

