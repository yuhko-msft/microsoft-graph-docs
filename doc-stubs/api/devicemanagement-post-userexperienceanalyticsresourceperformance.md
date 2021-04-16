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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|cpuSpikeTimePercentage|Double|CPU spike time in percentage. Valid values 0 to 100|
|cpuSpikeTimePercentageThreshold|Double|Threshold of cpuSpikeTimeScore. Valid values 0 to 100|
|cpuSpikeTimeScore|Int32|The user experience analytics device CPU spike time score. Valid values 0 to 100|
|deviceCount|Int64|User experience analytics summarized device count.|
|deviceId|String|The id of the device.|
|deviceName|String|The name of the device.|
|deviceResourcePerformanceScore|Int32|Resource performance score of a specific device. Valid values 0 to 100|
|manufacturer|String|The user experience analytics device manufacturer.|
|model|String|The user experience analytics device model.|
|ramSpikeTimePercentage|Double|RAM spike time in percentage. Valid values 0 to 100|
|ramSpikeTimePercentageThreshold|Double|Threshold of ramSpikeTimeScore. Valid values 0 to 100|
|ramSpikeTimeScore|Int32|The user experience analytics device RAM spike time score. Valid values 0 to 100|



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
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsResourcePerformance
Content-Type: application/json
Content-length: 508

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsResourcePerformance",
  "cpuSpikeTimePercentage": "Double",
  "cpuSpikeTimePercentageThreshold": "Double",
  "cpuSpikeTimeScore": "Integer",
  "deviceCount": "Integer",
  "deviceId": "String",
  "deviceName": "String",
  "deviceResourcePerformanceScore": "Integer",
  "manufacturer": "String",
  "model": "String",
  "ramSpikeTimePercentage": "Double",
  "ramSpikeTimePercentageThreshold": "Double",
  "ramSpikeTimeScore": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsResourcePerformance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsResourcePerformance",
  "id": "75b49af8-9af8-75b4-f89a-b475f89ab475",
  "cpuSpikeTimePercentage": "Double",
  "cpuSpikeTimePercentageThreshold": "Double",
  "cpuSpikeTimeScore": "Integer",
  "deviceCount": "Integer",
  "deviceId": "String",
  "deviceName": "String",
  "deviceResourcePerformanceScore": "Integer",
  "manufacturer": "String",
  "model": "String",
  "ramSpikeTimePercentage": "Double",
  "ramSpikeTimePercentageThreshold": "Double",
  "ramSpikeTimeScore": "Integer"
}
```

