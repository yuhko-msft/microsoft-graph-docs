---
title: "Update cancelMediaProcessingOperation"
description: "Update the properties of a cancelMediaProcessingOperation object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update cancelMediaProcessingOperation
Namespace: microsoft.graph

Update the properties of a [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) object.

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
PATCH /cancelMediaProcessingOperation
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) object.

The following table shows the properties that are required when you create the [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|



## Response

If successful, this method returns a `200 OK` response code and an updated [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_cancelmediaprocessingoperation"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/cancelMediaProcessingOperation
Content-Type: application/json
Content-length: 199

{
  "@odata.type": "#microsoft.graph.cancelMediaProcessingOperation",
  "status": "String",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
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
  "@odata.type": "#microsoft.graph.cancelMediaProcessingOperation",
  "id": "d69ad83b-d83b-d69a-3bd8-9ad63bd89ad6",
  "status": "String",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  }
}
```

