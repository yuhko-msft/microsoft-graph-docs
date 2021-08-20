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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [userExperienceAnalyticsDevicePerformance](../resources/intune-userexperienceanalyticsdeviceperformance.md) object.

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
In the request body, supply a JSON representation of the [userExperienceAnalyticsDevicePerformance](../resources/intune-userexperienceanalyticsdeviceperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsDevicePerformance](../resources/intune-userexperienceanalyticsdeviceperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceName|String|**TODO: Add Description**|
|model|String|**TODO: Add Description**|
|manufacturer|String|**TODO: Add Description**|
|diskType|diskType|**TODO: Add Description**. Possible values are: `unkown`, `hdd`, `ssd`.|
|operatingSystemVersion|String|**TODO: Add Description**|
|bootScore|Int32|**TODO: Add Description**|
|coreBootTimeInMs|Int32|**TODO: Add Description**|
|groupPolicyBootTimeInMs|Int32|**TODO: Add Description**|
|healthStatus|userExperienceAnalyticsHealthState|**TODO: Add Description**. Possible values are: `unknown`, `insufficientData`, `needsAttention`, `meetingGoals`.|
|loginScore|Int32|**TODO: Add Description**|
|coreLoginTimeInMs|Int32|**TODO: Add Description**|
|groupPolicyLoginTimeInMs|Int32|**TODO: Add Description**|
|deviceCount|Int64|**TODO: Add Description**|
|responsiveDesktopTimeInMs|Int32|**TODO: Add Description**|
|blueScreenCount|Int32|**TODO: Add Description**|
|restartCount|Int32|**TODO: Add Description**|
|averageBlueScreens|Double|**TODO: Add Description**|
|averageRestarts|Double|**TODO: Add Description**|
|startupPerformanceScore|Double|**TODO: Add Description**|
|modelStartupPerformanceScore|Double|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsDevicePerformance](../resources/intune-userexperienceanalyticsdeviceperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsdeviceperformance_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsDevicePerformance
Content-Type: application/json
Content-length: 747

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDevicePerformance",
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
  "startupPerformanceScore": "Double",
  "modelStartupPerformanceScore": "Double"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
  "id": "4c26c0c3-c0c3-4c26-c3c0-264cc3c0264c",
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
  "startupPerformanceScore": "Double",
  "modelStartupPerformanceScore": "Double"
}
```

