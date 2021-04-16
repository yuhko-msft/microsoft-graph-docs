---
title: "Create userExperienceAnalyticsDevicePerformance"
description: "Create a new userExperienceAnalyticsDevicePerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsDevicePerformance
Namespace: microsoft.graph



Create a new userExperienceAnalyticsDevicePerformance object.

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
POST /deviceManagement/userExperienceAnalyticsDevicePerformance
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|averageBlueScreens|Double|Average (mean) number of Blue Screens per device in the last 14 days. Valid values 0 to 9999999|
|averageRestarts|Double|Average (mean) number of Restarts per device in the last 14 days. Valid values 0 to 9999999|
|blueScreenCount|Int32|Number of Blue Screens in the last 14 days. Valid values 0 to 9999999|
|bootScore|Int32|The user experience analytics device boot score.|
|coreBootTimeInMs|Int32|The user experience analytics device core boot time in milliseconds.|
|coreLoginTimeInMs|Int32|The user experience analytics device core login time in milliseconds.|
|deviceCount|Int64|User experience analytics summarized device count.|
|deviceName|String|The user experience analytics device name.|
|diskType|diskType|The user experience analytics device disk type. Possible values are: `unkown`, `hdd`, `ssd`.|
|groupPolicyBootTimeInMs|Int32|The user experience analytics device group policy boot time in milliseconds.|
|groupPolicyLoginTimeInMs|Int32|The user experience analytics device group policy login time in milliseconds.|
|healthStatus|userExperienceAnalyticsHealthState|The health state of the user experience analytics device. Possible values are: `unknown`, `insufficientData`, `needsAttention`, `meetingGoals`.|
|loginScore|Int32|The user experience analytics device login score.|
|manufacturer|String|The user experience analytics device manufacturer.|
|model|String|The user experience analytics device model.|
|operatingSystemVersion|String|The user experience analytics device Operating System version.|
|responsiveDesktopTimeInMs|Int32|The user experience analytics responsive desktop time in milliseconds.|
|restartCount|Int32|Number of Restarts in the last 14 days. Valid values 0 to 9999999|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsDevicePerformance](../resources/userexperienceanalyticsdeviceperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsdeviceperformance_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsDevicePerformance
Content-Type: application/json
Content-length: 662

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDevicePerformance",
  "averageBlueScreens": "Double",
  "averageRestarts": "Double",
  "blueScreenCount": "Integer",
  "bootScore": "Integer",
  "coreBootTimeInMs": "Integer",
  "coreLoginTimeInMs": "Integer",
  "deviceCount": "Integer",
  "deviceName": "String",
  "diskType": "String",
  "groupPolicyBootTimeInMs": "Integer",
  "groupPolicyLoginTimeInMs": "Integer",
  "healthStatus": "String",
  "loginScore": "Integer",
  "manufacturer": "String",
  "model": "String",
  "operatingSystemVersion": "String",
  "responsiveDesktopTimeInMs": "Integer",
  "restartCount": "Integer"
}
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
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDevicePerformance",
  "id": "1bf0af41-af41-1bf0-41af-f01b41aff01b",
  "averageBlueScreens": "Double",
  "averageRestarts": "Double",
  "blueScreenCount": "Integer",
  "bootScore": "Integer",
  "coreBootTimeInMs": "Integer",
  "coreLoginTimeInMs": "Integer",
  "deviceCount": "Integer",
  "deviceName": "String",
  "diskType": "String",
  "groupPolicyBootTimeInMs": "Integer",
  "groupPolicyLoginTimeInMs": "Integer",
  "healthStatus": "String",
  "loginScore": "Integer",
  "manufacturer": "String",
  "model": "String",
  "operatingSystemVersion": "String",
  "responsiveDesktopTimeInMs": "Integer",
  "restartCount": "Integer"
}
```

