---
title: "Create userExperienceAnalyticsAppHealthOSVersionPerformance"
description: "Create a new userExperienceAnalyticsAppHealthOSVersionPerformance object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsAppHealthOSVersionPerformance
Namespace: microsoft.graph



Create a new [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) object.

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
POST /deviceManagement/userExperienceAnalyticsAppHealthOSVersionPerformance
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|activeDeviceCount|Int32|The number of active devices for the OS version. Valid values -2147483648 to 2147483647|
|meanTimeToFailureInMinutes|Int32|The mean time to failure for the OS version in minutes. Valid values -2147483648 to 2147483647|
|osBuildNumber|String|The OS build number installed on the device.|
|osVersion|String|The OS version installed on the device.|
|osVersionAppHealthScore|Double|The app health score of the OS version. Valid values -1.79769313486232E+308 to 1.79769313486232E+308|
|osVersionAppHealthStatus|String|The overall app health status of the OS version.|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsAppHealthOSVersionPerformance](../resources/userexperienceanalyticsapphealthosversionperformance.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsapphealthosversionperformance_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsAppHealthOSVersionPerformance
Content-Type: application/json
Content-length: 310

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthOSVersionPerformance",
  "activeDeviceCount": "Integer",
  "meanTimeToFailureInMinutes": "Integer",
  "osBuildNumber": "String",
  "osVersion": "String",
  "osVersionAppHealthScore": "Double",
  "osVersionAppHealthStatus": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsAppHealthOSVersionPerformance"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsAppHealthOSVersionPerformance",
  "id": "6713a944-a944-6713-44a9-136744a91367",
  "activeDeviceCount": "Integer",
  "meanTimeToFailureInMinutes": "Integer",
  "osBuildNumber": "String",
  "osVersion": "String",
  "osVersionAppHealthScore": "Double",
  "osVersionAppHealthStatus": "String"
}
```

