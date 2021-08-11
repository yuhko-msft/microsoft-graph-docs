---
title: "List userExperienceAnalyticsDevicePerformances"
description: "Get a list of the userExperienceAnalyticsDevicePerformance objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List userExperienceAnalyticsDevicePerformances
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Get a list of the [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) objects and their properties.

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
GET /deviceManagement/userExperienceAnalyticsDevicePerformance
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

If successful, this method returns a `200 OK` response code and a collection of [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_userexperienceanalyticsdeviceperformance"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsDevicePerformance
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.management.services.api.userExperienceAnalyticsDevicePerformance)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.management.services.api.userExperienceAnalyticsDevicePerformance",
      "id": "1ae33f2a-3f2a-1ae3-2a3f-e31a2a3fe31a",
      "deviceName": "String",
      "model": "String",
      "manufacturer": "String",
      "diskType": "String",
      "operatingSystemVersion": "String",
      "bootScore": "Integer",
      "coreBootTimeInMs": "Integer",
      "groupPolicyBootTimeInMs": "Integer",
      "healthStatus": "String",
      "loginScore": "Integer",
      "coreLoginTimeInMs": "Integer",
      "groupPolicyLoginTimeInMs": "Integer",
      "deviceCount": "Integer",
      "responsiveDesktopTimeInMs": "Integer",
      "blueScreenCount": "Integer",
      "restartCount": "Integer",
      "averageBlueScreens": "Double",
      "averageRestarts": "Double",
      "startupPerformanceScore": "Double"
    }
  ]
}
```

