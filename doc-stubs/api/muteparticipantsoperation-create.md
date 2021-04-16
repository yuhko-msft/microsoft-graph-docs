---
title: "Create muteParticipantsOperation"
description: "Create a new muteParticipantsOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create muteParticipantsOperation
Namespace: microsoft.graph



Create a new [muteParticipantsOperation](../resources/muteparticipantsoperation.md) object.

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
POST ** Collection URI for microsoft.graph.muteParticipantsOperation not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [muteParticipantsOperation](../resources/muteparticipantsoperation.md) object.

The following table shows the properties that are required when you create the [muteParticipantsOperation](../resources/muteparticipantsoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|
|participants|String collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [muteParticipantsOperation](../resources/muteparticipantsoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_muteparticipantsoperation_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.muteParticipantsOperation not found
Content-Type: application/json
Content-length: 235

{
  "@odata.type": "#microsoft.graph.muteParticipantsOperation",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "participants": [
    "String"
  ]
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.muteParticipantsOperation"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.muteParticipantsOperation",
  "id": "fc9081e9-81e9-fc90-e981-90fce98190fc",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  },
  "status": "String",
  "participants": [
    "String"
  ]
}
```

