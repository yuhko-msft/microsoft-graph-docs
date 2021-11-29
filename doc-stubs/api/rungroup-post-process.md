---
title: "Add process"
description: "Add process by posting to the process collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add process
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add process by posting to the process collection.

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
POST /industryData/incomingFlows/{incomingFlowId}/runs/{runId}/process/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [process](../resources/process.md) object.

You can specify the following properties when creating a **process**.

|Property|Type|Description|
|:---|:---|:---|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md). Optional.|
|displayName|String|Name of the process. Required.|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`. Required.|



## Response

If successful, this method returns a `204 No Content` response code and a [process](../resources/process.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_process_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/incomingFlows/{incomingFlowId}/runs/{runId}/process/$ref
Content-Type: application/json
Content-length: 137

{
  "@odata.type": "#microsoft.industryData.process",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.industryData.process"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.process",
  "id": "cb56cab7-cab7-cb56-b7ca-56cbb7ca56cb",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

