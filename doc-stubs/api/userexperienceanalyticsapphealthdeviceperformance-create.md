---
title: "Create userExperienceAnalyticsAppHealthDevicePerformance"
description: "Create a new userExperienceAnalyticsAppHealthDevicePerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsAppHealthDevicePerformance
Namespace: microsoft.graph



Create a new [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) object.

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
POST /deviceManagement/userExperienceAnalyticsAppHealthDevicePerformance
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appCrashCount|Int32|The number of app crashes for the device. Valid values -2147483648 to 2147483647|
|appHangCount|Int32|The number of app hangs for the device. Valid values -2147483648 to 2147483647|
|crashedAppCount|Int32|The number of distinct app crashes for the device. Valid values -2147483648 to 2147483647|
|deviceAppHealthScore|Double|The app health score of the device. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|deviceAppHealthStatus|String|The overall app health status of the device.|
|deviceDisplayName|String|The name of the device.|
|deviceId|String|The id of the device.|
|deviceManufacturer|String|The manufacturer name of the device.|
|deviceModel|String|The model name of the device.|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the device in minutes. Valid values -2147483648 to 2147483647|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsAppHealthDevicePerformance](../resources/userexperienceanalyticsapphealthdeviceperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsapphealthdeviceperformance_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsAppHealthDevicePerformance
Content-Type: application/json
Content-length: 426

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformance",
  "appCrashCount": "Integer",
  "appHangCount": "Integer",
  "crashedAppCount": "Integer",
  "deviceAppHealthScore": "Double",
  "deviceAppHealthStatus": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "deviceManufacturer": "String",
  "deviceModel": "String",
  "meanTimeToFailureInMinutes": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformance",
  "id": "def088be-88be-def0-be88-f0debe88f0de",
  "appCrashCount": "Integer",
  "appHangCount": "Integer",
  "crashedAppCount": "Integer",
  "deviceAppHealthScore": "Double",
  "deviceAppHealthStatus": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "deviceManufacturer": "String",
  "deviceModel": "String",
  "meanTimeToFailureInMinutes": "Integer"
}
```

