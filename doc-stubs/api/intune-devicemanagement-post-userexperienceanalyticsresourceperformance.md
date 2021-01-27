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
In the request body, supply a JSON representation of the [userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceId|String|**TODO: Add Description**|
|deviceName|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|deviceCount|Int64|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|cpuSpikeTimePercentage|Double|**TODO: Add Description**|
|ramSpikeTimePercentage|Double|**TODO: Add Description**|
|cpuSpikeTimeScore|Int32|**TODO: Add Description**|
|cpuSpikeTimePercentageThreshold|Double|**TODO: Add Description**|
|ramSpikeTimeScore|Int32|**TODO: Add Description**|
|ramSpikeTimePercentageThreshold|Double|**TODO: Add Description**|
|deviceResourcePerformanceScore|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsResourcePerformance](../resources/intune-userexperienceanalyticsresourceperformance.md) object in the response body.

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
Content-length: 508

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsResourcePerformance",
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
```

