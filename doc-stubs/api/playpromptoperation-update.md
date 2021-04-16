---
title: "Update playPromptOperation"
description: "Update the properties of a playPromptOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update playPromptOperation
Namespace: microsoft.graph



Update the properties of a [playPromptOperation](../resources/playpromptoperation.md) object.

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
PATCH /playPromptOperation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [playPromptOperation](../resources/playpromptoperation.md) object.

The following table shows the properties that are required when you update the [playPromptOperation](../resources/playpromptoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|
|completionReason|playPromptCompletionReason|**TODO: Add Description**. Possible values are: `unknown`, `completedSuccessfully`, `mediaOperationCanceled`, `unknownFutureValue`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [playPromptOperation](../resources/playpromptoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_playpromptoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/playPromptOperation
Content-Type: application/json
Content-length: 221

{
  "@odata.type": "#microsoft.graph.playPromptOperation",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "completionReason": "String"
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
  "@odata.type": "#microsoft.graph.playPromptOperation",
  "id": "4ed33b9f-3b9f-4ed3-9f3b-d34e9f3bd34e",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "completionReason": "String"
}
```

