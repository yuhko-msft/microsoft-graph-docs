---
title: "Update run"
description: "Update the properties of a run object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update run
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [run](../resources/industrydata-run.md) object.

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
PATCH /process/runs/{runId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [run](../resources/industrydata-run.md) object.

The following table shows the properties that are required when you update the [run](../resources/industrydata-run.md).

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|status|runStatus|**TODO: Add Description**. The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|
|statistics|[microsoft.graph.industryData.runStatistics](../resources/industrydata-runstatistics.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [run](../resources/industrydata-run.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_run"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/process/runs/{runId}
Content-Type: application/json
Content-length: 281

{
  "@odata.type": "#microsoft.graph.industryData.run",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.runStatistics"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.industryData.run",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.runStatistics"
  }
}
```

