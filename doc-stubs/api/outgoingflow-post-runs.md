---
title: "Add run"
description: "Add runs by posting to the runs collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add run
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Add runs by posting to the runs collection.

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
POST /industryData/incomingFlows/{incomingFlowId}/runs/{runId}/process/runs/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [run](../resources/run.md) object.

You can specify the following properties when creating a **run**.

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the run. Required.|
|startDateTime|DateTimeOffset|The time the run started in ISO 8601 format. Required.|
|endDateTime|DateTimeOffset|The time the run finished in ISO 8601 format, or null if the run is still in-progress. Optional.|
|status|runStatus|Current status of the run. The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`. Required.|
|blockingError|[microsoft.graph.publicError](../resources/publicerror.md)|An error object to diagnose critical failures in a run. Optional.|
|statistics|[microsoft.industryData.runStatistics](../resources/runstatistics.md)|The weakly-typed statistics log from the run. Required.|



## Response

If successful, this method returns a `204 No Content` response code and a [run](../resources/run.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_run_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/industryData/incomingFlows/{incomingFlowId}/runs/{runId}/process/runs/$ref
Content-Type: application/json
Content-length: 340

{
  "@odata.type": "#microsoft.industryData.run",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "blockingError": {
    "@odata.type": "microsoft.graph.publicError"
  },
  "statistics": {
    "@odata.type": "microsoft.graph.runStatistics"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.industryData.run"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.industryData.run",
  "id": "45e76341-6341-45e7-4163-e7454163e745",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "blockingError": {
    "@odata.type": "microsoft.graph.publicError"
  },
  "statistics": {
    "@odata.type": "microsoft.graph.runStatistics"
  }
}
```

