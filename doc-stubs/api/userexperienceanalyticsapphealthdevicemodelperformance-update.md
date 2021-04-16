---
title: "Update userExperienceAnalyticsAppHealthDeviceModelPerformance"
description: "Update the properties of a userExperienceAnalyticsAppHealthDeviceModelPerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsAppHealthDeviceModelPerformance
Namespace: microsoft.graph



Update the properties of a [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsAppHealthDeviceModelPerformance/{userExperienceAnalyticsAppHealthDeviceModelPerformanceId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activeDeviceCount|Int32|The number of active devices for the model. Valid values -2147483648 to 2147483647|
|deviceManufacturer|String|The manufacturer name of the device.|
|deviceModel|String|The model name of the device.|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the model device in minutes. Valid values -2147483648 to 2147483647|
|modelAppHealthScore|Double|The app health score of the device model. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|modelAppHealthStatus|String|The overall app health status of the device model.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsAppHealthDeviceModelPerformance](../resources/userexperienceanalyticsapphealthdevicemodelperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsapphealthdevicemodelperformance"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsAppHealthDeviceModelPerformance/{userExperienceAnalyticsAppHealthDeviceModelPerformanceId}
Content-Type: application/json
Content-length: 311

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDeviceModelPerformance",
  "activeDeviceCount": "Integer",
  "deviceManufacturer": "String",
  "deviceModel": "String",
  "meanTimeToFailureInMinutes": "Integer",
  "modelAppHealthScore": "Double",
  "modelAppHealthStatus": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDeviceModelPerformance",
  "id": "10d5abf2-abf2-10d5-f2ab-d510f2abd510",
  "activeDeviceCount": "Integer",
  "deviceManufacturer": "String",
  "deviceModel": "String",
  "meanTimeToFailureInMinutes": "Integer",
  "modelAppHealthScore": "Double",
  "modelAppHealthStatus": "String"
}
```

