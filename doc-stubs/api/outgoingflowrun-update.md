---
title: "Update outgoingFlowRun"
description: "Update the properties of an outgoingFlowRun object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update outgoingFlowRun
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [outgoingFlowRun](../resources/outgoingflowrun.md) object.

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
PATCH ** Entity URI for microsoft.industryData.outgoingFlowRun not found
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
|displayName|String|**TODO: Add Description** Inherited from [run](../resources/run.md). Required.|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/run.md). Required.|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/run.md). Optional.|
|status|runStatus|**TODO: Add Description** Inherited from [run](../resources/run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`. Required.|
|blockingError|[microsoft.industryData.publicError](../resources/publicerror.md)|**TODO: Add Description** Inherited from [run](../resources/run.md). Optional.|
|statistics|[microsoft.industryData.runStatistics](../resources/runstatistics.md)|**TODO: Add Description** Inherited from [run](../resources/run.md). Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [outgoingFlowRun](../resources/outgoingflowrun.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_outgoingflowrun"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.industryData.outgoingFlowRun not found
Content-Type: application/json
Content-length: 345

{
  "@odata.type": "#microsoft.graph.outgoingFlowRun",
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
  "@odata.type": "#microsoft.graph.outgoingFlowRun",
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

