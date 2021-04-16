---
title: "List userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion"
description: "Get the userExperienceAnalyticsAppHealthAppPerformanceByOSVersion resources from the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion
Namespace: microsoft.graph



Get the userExperienceAnalyticsAppHealthAppPerformanceByOSVersion resources from the userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion navigation property.

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
GET /deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [userExperienceAnalyticsAppHealthAppPerformanceByOSVersion](../resources/userexperienceanalyticsapphealthappperformancebyosversion.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_userexperienceanalyticsapphealthappperformancebyosversion"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsAppHealthApplicationPerformanceByOSVersion
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.userExperienceAnalyticsAppHealthAppPerformanceByOSVersion)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

