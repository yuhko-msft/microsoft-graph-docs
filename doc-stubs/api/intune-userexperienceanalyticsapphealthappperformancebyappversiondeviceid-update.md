---
title: "Update userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId"
description: "Update the properties of a userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId/{userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceId|String|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|
|processedDateTime|DateTimeOffset|**TODO: Add Description**|
|appName|String|**TODO: Add Description**|
|appDisplayName|String|**TODO: Add Description**|
|appPublisher|String|**TODO: Add Description**|
|appVersion|String|**TODO: Add Description**|
|appCrashCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId](../resources/intune-userexperienceanalyticsapphealthappperformancebyappversiondeviceid.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsapphealthappperformancebyappversiondeviceid"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDeviceId/{userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdId}
Content-Type: application/json
Content-length: 355

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId",
  "deviceId": "String",
  "deviceDisplayName": "String",
  "processedDateTime": "String (timestamp)",
  "appName": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "appCrashCount": "Integer"
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
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId",
  "id": "79e407f0-07f0-79e4-f007-e479f007e479",
  "deviceId": "String",
  "deviceDisplayName": "String",
  "processedDateTime": "String (timestamp)",
  "appName": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "appCrashCount": "Integer"
}
```

