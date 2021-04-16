---
title: "Create userExperienceAnalyticsAppHealthAppPerformanceByOSVersion"
description: "Create a new userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsAppHealthAppPerformanceByOSVersion
Namespace: microsoft.graph



Create a new userExperienceAnalyticsAppHealthAppPerformanceByOSVersion object.

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
POST /deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activeDeviceCount|Int32|The number of devices where the app has been active. Valid values -2147483648 to 2147483647|
|appCrashCount|Int32|The number of crashes for the app. Valid values -2147483648 to 2147483647|
|appDisplayName|String|The friendly name of the application.|
|appName|String|The name of the application.|
|appPublisher|String|The publisher of the application.|
|appUsageDuration|Int32|The total usage time of the application in minutes. Valid values -2147483648 to 2147483647|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647|
|osBuildNumber|String|The os build number of the application.|
|osVersion|String|The os version of the application.|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsapphealthappperformancebyosversion_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion
Content-Type: application/json
Content-length: 383

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByOSVersion",
  "activeDeviceCount": "Integer",
  "appCrashCount": "Integer",
  "appDisplayName": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Integer",
  "meanTimeToFailureInMinutes": "Integer",
  "osBuildNumber": "String",
  "osVersion": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByOSVersion"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByOSVersion",
  "id": "1579f358-f358-1579-58f3-791558f37915",
  "activeDeviceCount": "Integer",
  "appCrashCount": "Integer",
  "appDisplayName": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Integer",
  "meanTimeToFailureInMinutes": "Integer",
  "osBuildNumber": "String",
  "osVersion": "String"
}
```

