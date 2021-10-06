---
title: "Create outgoingFlowRun"
description: "Create a new outgoingFlowRun object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create outgoingFlowRun
Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) object.

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
POST ** Collection URI for microsoft.graph.industryData.outgoingFlowRun not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) object.

The following table shows the properties that are required when you create the [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md).

|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md)|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md)|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md)|
|status|runStatus|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|
|statistics|[microsoft.graph.industryData.runStatistics](../resources/industrydata-runstatistics.md)|**TODO: Add Description** Inherited from [run](../resources/industrydata-run.md)|



## Response

If successful, this method returns a `201 Created` response code and an [outgoingFlowRun](../resources/industrydata-outgoingflowrun.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_outgoingflowrun_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.industryData.outgoingFlowRun not found
Content-Type: application/json
Content-length: 293

{
  "@odata.type": "#microsoft.graph.industryData.outgoingFlowRun",
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
  "@odata.type": "microsoft.graph.industryData.outgoingFlowRun"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.industryData.outgoingFlowRun",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.runStatistics"
  }
}
```

