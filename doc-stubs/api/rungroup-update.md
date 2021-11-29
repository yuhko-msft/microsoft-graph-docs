---
title: "Update runGroup"
description: "Update the properties of a runGroup object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update runGroup
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [runGroup](../resources/rungroup.md) object.

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
PATCH /industryData/runGroups/{runGroupId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|displayName|String|The name of the run. Inherited from [run](../resources/run.md). Required.|
|startDateTime|DateTimeOffset|The time the run started in ISO 8601 format. Inherited from [run](../resources/run.md). Required.|
|endDateTime|DateTimeOffset|The time the run finished in ISO 8601 format, or null if the run is still in-progress. Inherited from [run](../resources/run.md). Optional.|
|status|runStatus|Current status of the run. Inherited from [run](../resources/run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`. Required.|
|blockingError|[microsoft.graph.publicError](../resources/publicerror.md)|An error object to diagnose critical failures in a run. Inherited from [run](../resources/run.md). Optional.|
|statistics|[microsoft.industryData.runStatistics](../resources/runstatistics.md)|The weakly-typed statistics log from the run. Inherited from [run](../resources/run.md). Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [runGroup](../resources/rungroup.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_rungroup"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/industryData/runGroups/{runGroupId}
Content-Type: application/json
Content-length: 338

{
  "@odata.type": "#microsoft.graph.runGroup",
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
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.runGroup",
  "id": "defb627a-627a-defb-7a62-fbde7a62fbde",
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

