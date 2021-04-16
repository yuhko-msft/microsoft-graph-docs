---
title: "Update userExperienceAnalyticsAppHealthDevicePerformanceDetails"
description: "Update the properties of a userExperienceAnalyticsAppHealthDevicePerformanceDetails object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsAppHealthDevicePerformanceDetails
Namespace: microsoft.graph



Update the properties of a [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsAppHealthDevicePerformanceDetails/{userExperienceAnalyticsAppHealthDevicePerformanceDetailsId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appDisplayName|String|The friendly name of the application for which the event occurred.|
|deviceDisplayName|String|The name of the device.|
|deviceId|String|The id of the device.|
|eventDateTime|DateTimeOffset|The time the event occurred.|
|eventType|String|The type of the event.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/userexperienceanalyticsapphealthdeviceperformancedetails.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsapphealthdeviceperformancedetails"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsAppHealthDevicePerformanceDetails/{userExperienceAnalyticsAppHealthDevicePerformanceDetailsId}
Content-Type: application/json
Content-length: 256

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "appDisplayName": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "eventDateTime": "String (timestamp)",
  "eventType": "String"
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
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "id": "2ab57136-7136-2ab5-3671-b52a3671b52a",
  "appDisplayName": "String",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "eventDateTime": "String (timestamp)",
  "eventType": "String"
}
```

