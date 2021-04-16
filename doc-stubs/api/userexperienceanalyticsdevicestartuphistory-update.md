---
title: "Update userExperienceAnalyticsDeviceStartupHistory"
description: "Update the properties of a userExperienceAnalyticsDeviceStartupHistory object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsDeviceStartupHistory
Namespace: microsoft.graph



Update the properties of a [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsDeviceStartupHistory/{userExperienceAnalyticsDeviceStartupHistoryId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|coreBootTimeInMs|Int32|The user experience analytics device core boot time in milliseconds.|
|coreLoginTimeInMs|Int32|The user experience analytics device core login time in milliseconds.|
|deviceId|String|The user experience analytics device id.|
|featureUpdateBootTimeInMs|Int32|The user experience analytics device feature update time in milliseconds.|
|groupPolicyBootTimeInMs|Int32|The User experience analytics Device group policy boot time in milliseconds.|
|groupPolicyLoginTimeInMs|Int32|The User experience analytics Device group policy login time in milliseconds.|
|isFeatureUpdate|Boolean|The user experience analytics device boot record is a feature update.|
|isFirstLogin|Boolean|The user experience analytics device first login.|
|operatingSystemVersion|String|The user experience analytics device boot record's operating system version.|
|responsiveDesktopTimeInMs|Int32|The user experience analytics responsive desktop time in milliseconds.|
|restartCategory|userExperienceAnalyticsOperatingSystemRestartCategory|OS restart category. Possible values are: `unknown`, `restartWithUpdate`, `restartWithoutUpdate`, `blueScreen`, `shutdownWithUpdate`, `shutdownWithoutUpdate`, `longPowerButtonPress`, `bootError`, `update`.|
|restartFaultBucket|String|OS restart fault bucket. The fault bucket is used to find additional information about a system crash.|
|restartStopCode|String|OS restart stop code. This shows the bug check code which can be used to look up the blue screen reason.|
|startTime|DateTimeOffset|The user experience analytics device boot start time.|
|totalBootTimeInMs|Int32|The user experience analytics device total boot time in milliseconds.|
|totalLoginTimeInMs|Int32|The user experience analytics device total login time in milliseconds.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsDeviceStartupHistory](../resources/userexperienceanalyticsdevicestartuphistory.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsdevicestartuphistory"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsDeviceStartupHistory/{userExperienceAnalyticsDeviceStartupHistoryId}
Content-Type: application/json
Content-length: 658

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceStartupHistory",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
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
```

