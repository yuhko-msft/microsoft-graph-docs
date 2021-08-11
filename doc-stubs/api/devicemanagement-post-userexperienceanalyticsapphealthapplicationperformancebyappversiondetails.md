---
title: "Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails"
description: "Create a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails object.

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
POST /deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The unique identifier of the user experience analytics app performance object.|
|deviceCountWithCrashes|Int32|The total number of devices that have reported one or more application crashes for this application and version. Valid values -2147483648 to 2147483647|
|isMostUsedVersion|Boolean|Is the version of application the most used version for that app.|
|isLatestUsedVersion|Boolean|Is the version of application the latest version for that app that is in use.|
|appName|String|The name of the application.|
|appDisplayName|String|The friendly name of the application.|
|appPublisher|String|The publisher of the application.|
|appVersion|String|The version of the application.|
|appCrashCount|Int32|The number of crashes for the app. Valid values -2147483648 to 2147483647|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails](../resources/userexperienceanalyticsapphealthappperformancebyappversiondetails.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsapphealthappperformancebyappversiondetails_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByAppVersionDetails
Content-Type: application/json
Content-length: 379

{
  "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails",
  "deviceCountWithCrashes": "Integer",
  "isMostUsedVersion": "Boolean",
  "isLatestUsedVersion": "Boolean",
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
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsAppHealthAppPerformanceByAppVersionDetails",
  "id": "d6999673-9673-d699-7396-99d6739699d6",
  "deviceCountWithCrashes": "Integer",
  "isMostUsedVersion": "Boolean",
  "isLatestUsedVersion": "Boolean",
  "appName": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "appCrashCount": "Integer"
}
```

