---
title: "Get userExperienceAnalyticsDevicePerformance"
description: "Read the properties and relationships of a userExperienceAnalyticsDevicePerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get userExperienceAnalyticsDevicePerformance
Namespace: microsoft.graph

Read the properties and relationships of a [userExperienceAnalyticsDevicePerformance](../resources/intune-userexperienceanalyticsdeviceperformance.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /deviceManagement/userExperienceAnalyticsDevicePerformance/{userExperienceAnalyticsDevicePerformanceId}
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

If successful, this method returns a `200 OK` response code and a [userExperienceAnalyticsDevicePerformance](../resources/intune-userexperienceanalyticsdeviceperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_userexperienceanalyticsdeviceperformance"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsDevicePerformance/{userExperienceAnalyticsDevicePerformanceId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDevicePerformance"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.userExperienceAnalyticsDevicePerformance",
    "id": "b26e31db-31db-b26e-db31-6eb2db316eb2",
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
    "averageRestarts": "Double"
  }
}
```

