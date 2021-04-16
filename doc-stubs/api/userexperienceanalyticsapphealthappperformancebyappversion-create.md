---
title: "Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersion"
description: "Create a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersion object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersion
Namespace: microsoft.graph



Create a new [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) object.

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
POST /deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appCrashCount|Int32|The number of crashes for the app. Valid values -2147483648 to 2147483647|
|appDisplayName|String|The friendly name of the application.|
|appName|String|The name of the application.|
|appPublisher|String|The publisher of the application.|
|appUsageDuration|Int32|The total usage time of the application in minutes. Valid values -2147483648 to 2147483647|
|appVersion|String|The version of the application.|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the app in minutes. Valid values -2147483648 to 2147483647|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersion](../resources/userexperienceanalyticsapphealthappperformancebyappversion.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsapphealthappperformancebyappversion_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersion
Content-Type: application/json
Content-length: 320

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersion",
  "appCrashCount": "Integer",
  "appDisplayName": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Integer",
  "appVersion": "String",
  "meanTimeToFailureInMinutes": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersion"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByAppVersion",
  "id": "d9ec7487-7487-d9ec-8774-ecd98774ecd9",
  "appCrashCount": "Integer",
  "appDisplayName": "String",
  "appName": "String",
  "appPublisher": "String",
  "appUsageDuration": "Integer",
  "appVersion": "String",
  "meanTimeToFailureInMinutes": "Integer"
}
```

