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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) object.

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
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceModel|String|**TODO: Add Description**|
|deviceManufacturer|String|**TODO: Add Description**|
|appCrashCount|Int32|**TODO: Add Description**|
|crashedAppCount|Int32|**TODO: Add Description**|
|appHangCount|Int32|**TODO: Add Description**|
|processedDateTime|DateTimeOffset|**TODO: Add Description**|
|meanTimeToFailureInMinutes|Int32|**TODO: Add Description**|
|deviceAppHealthScore|Double|**TODO: Add Description**|
|deviceAppHealthStatus|String|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsAppHealthDevicePerformance](../resources/intune-userexperienceanalyticsapphealthdeviceperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsapphealthdeviceperformance_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsAppHealthDevicePerformance
Content-Type: application/json
Content-length: 472

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformance",
  "deviceModel": "String",
  "deviceManufacturer": "String",
  "appCrashCount": "Integer",
  "crashedAppCount": "Integer",
  "appHangCount": "Integer",
  "processedDateTime": "String (timestamp)",
  "meanTimeToFailureInMinutes": "Integer",
  "deviceAppHealthScore": "Double",
  "deviceAppHealthStatus": "String",
  "deviceId": "String",
  "deviceDisplayName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
  "id": "79c182a6-82a6-79c1-a682-c179a682c179",
  "deviceModel": "String",
  "deviceManufacturer": "String",
  "appCrashCount": "Integer",
  "crashedAppCount": "Integer",
  "appHangCount": "Integer",
  "processedDateTime": "String (timestamp)",
  "meanTimeToFailureInMinutes": "Integer",
  "deviceAppHealthScore": "Double",
  "deviceAppHealthStatus": "String",
  "deviceId": "String",
  "deviceDisplayName": "String"
}
```

