---
title: "Get userExperienceAnalyticsDeviceStartupHistory"
description: "Read the properties and relationships of a userExperienceAnalyticsDeviceStartupHistory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get userExperienceAnalyticsDeviceStartupHistory
Namespace: microsoft.graph



Read the properties and relationships of a [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object.

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
GET /deviceManagement/userExperienceAnalyticsDeviceStartupHistory/{userExperienceAnalyticsDeviceStartupHistoryId}
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

If successful, this method returns a `200 OK` response code and a [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_userexperienceanalyticsdevicestartuphistory"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsDeviceStartupHistory/{userExperienceAnalyticsDeviceStartupHistoryId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceStartupHistory"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupHistory",
    "id": "cef505d9-05d9-cef5-d905-f5ced905f5ce",
    "coreBootTimeInMs": "Integer",
    "coreLoginTimeInMs": "Integer",
    "deviceId": "String",
    "featureUpdateBootTimeInMs": "Integer",
    "groupPolicyBootTimeInMs": "Integer",
    "groupPolicyLoginTimeInMs": "Integer",
    "isFeatureUpdate": "Boolean",
    "isFirstLogin": "Boolean",
    "operatingSystemVersion": "String",
    "responsiveDesktopTimeInMs": "Integer",
    "restartCategory": "String",
    "restartFaultBucket": "String",
    "restartStopCode": "String",
    "startTime": "String (timestamp)",
    "totalBootTimeInMs": "Integer",
    "totalLoginTimeInMs": "Integer"
  }
}
```

