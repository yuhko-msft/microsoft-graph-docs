---
title: "Create userExperienceAnalyticsResourcePerformance"
description: "Create a new userExperienceAnalyticsResourcePerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsResourcePerformance
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new userExperienceAnalyticsResourcePerformance object.

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
POST /deviceManagement/userExperienceAnalyticsResourcePerformance
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier of the user experience analytics resource performance entity.|
|deviceId|String|The id of the device.|
|deviceName|String|The name of the device.|
|model|String|The user experience analytics device model.|
|deviceCount|Int64|User experience analytics summarized device count.|
|manufacturer|String|The user experience analytics device manufacturer.|
|cpuSpikeTimePercentage|Double|CPU spike time in percentage. Valid values 0 to 100|
|ramSpikeTimePercentage|Double|RAM spike time in percentage. Valid values 0 to 100|
|cpuSpikeTimeScore|Int32|The user experience analytics device CPU spike time score. Valid values 0 to 100|
|cpuSpikeTimePercentageThreshold|Double|Threshold of cpuSpikeTimeScore. Valid values 0 to 100|
|ramSpikeTimeScore|Int32|The user experience analytics device RAM spike time score. Valid values 0 to 100|
|ramSpikeTimePercentageThreshold|Double|Threshold of ramSpikeTimeScore. Valid values 0 to 100|
|deviceResourcePerformanceScore|Int32|Resource performance score of a specific device. Valid values 0 to 100|
|averageSpikeTimeScore|Int32|AverageSpikeTimeScore of a device or a model type. Valid values 0 to 100|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsResourcePerformance](../resources/userexperienceanalyticsresourceperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsresourceperformance_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsResourcePerformance
Content-Type: application/json
Content-length: 565

{
  "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsResourcePerformance",
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
  "deviceResourcePerformanceScore": "Integer",
  "averageSpikeTimeScore": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.userExperienceAnalyticsResourcePerformance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsResourcePerformance",
  "id": "08ee4a80-4a80-08ee-804a-ee08804aee08",
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
  "deviceResourcePerformanceScore": "Integer",
  "averageSpikeTimeScore": "Integer"
}
```

