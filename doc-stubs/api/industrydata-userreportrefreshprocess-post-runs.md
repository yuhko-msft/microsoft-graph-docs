---
title: "Add run"
description: "Add runs by posting to the runs collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add run
Namespace: microsoft.graph.industryData

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
POST /process/runs/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [run](../resources/industrydata-run.md) object.

The following table shows the properties that are required when you create the [run](../resources/industrydata-run.md).

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|status|runStatus|**TODO: Add Description**. The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|
|statistics|[microsoft.graph.industryData.runStatistics](../resources/industrydata-runstatistics.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and a [run](../resources/industrydata-run.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_run_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/process/runs/$ref
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
  "truncated": true,
  "@odata.type": "microsoft.graph.industryData.run"
}
-->
``` http
HTTP/1.1 204 No Content
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

