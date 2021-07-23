---
title: "Create userExperienceAnalyticsAppHealthDevicePerformanceDetails"
description: "Create a new userExperienceAnalyticsAppHealthDevicePerformanceDetails object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsAppHealthDevicePerformanceDetails
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) object.

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
POST /deviceManagement/userExperienceAnalyticsAppHealthDevicePerformanceDetails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|eventDateTime|DateTimeOffset|**TODO: Add Description**|
|eventType|String|**TODO: Add Description**|
|appDisplayName|String|**TODO: Add Description**|
|appPublisher|String|**TODO: Add Description**|
|appVersion|String|**TODO: Add Description**|
|deviceId|String|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsAppHealthDevicePerformanceDetails](../resources/intune-userexperienceanalyticsapphealthdeviceperformancedetails.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsapphealthdeviceperformancedetails_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/userExperienceAnalyticsAppHealthDevicePerformanceDetails
Content-Type: application/json
Content-length: 312

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "eventDateTime": "String (timestamp)",
  "eventType": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "deviceId": "String",
  "deviceDisplayName": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthDevicePerformanceDetails",
  "id": "ebd87965-7965-ebd8-6579-d8eb6579d8eb",
  "eventDateTime": "String (timestamp)",
  "eventType": "String",
  "appDisplayName": "String",
  "appPublisher": "String",
  "appVersion": "String",
  "deviceId": "String",
  "deviceDisplayName": "String"
}
```

