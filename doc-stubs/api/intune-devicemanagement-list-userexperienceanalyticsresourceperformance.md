---
title: "List userExperienceAnalyticsResourcePerformance"
description: "Get the userExperienceAnalyticsResourcePerformance resources from the userExperienceAnalyticsResourcePerformance navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List userExperienceAnalyticsResourcePerformance
Namespace: microsoft.graph

Get the userExperienceAnalyticsResourcePerformance resources from the userExperienceAnalyticsResourcePerformance navigation property.

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
GET /deviceManagement/userExperienceAnalyticsResourcePerformance
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_userexperienceanalyticsresourceperformance"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsResourcePerformance
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.userExperienceAnalyticsResourcePerformance)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.userExperienceAnalyticsResourcePerformance",
      "id": "de78f8d8-f8d8-de78-d8f8-78ded8f878de",
      "deviceId": "String",
      "deviceName": "String",
      "model": "String",
      "deviceCount": "Integer",
      "manufacturer": "String",
      "cpuSpikeTimePercentage": "Double",
      "ramSpikeTimePercentage": "Double",
      "cpuSpikeTimeScore": "Integer",
      "cpuSpikeTimePercentageThreshold": "Double",
      "ramSpikeTimeScore": "Integer",
      "ramSpikeTimePercentageThreshold": "Double",
      "deviceResourcePerformanceScore": "Integer"
    }
  ]
}
```

