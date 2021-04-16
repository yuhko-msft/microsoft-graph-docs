---
title: "Update userExperienceAnalyticsDeviceWithoutCloudIdentity"
description: "Update the properties of a userExperienceAnalyticsDeviceWithoutCloudIdentity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsDeviceWithoutCloudIdentity
Namespace: microsoft.graph



Update the properties of a [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsDevicesWithoutCloudIdentity/{userExperienceAnalyticsDeviceWithoutCloudIdentityId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|azureAdDeviceId|String|Azure Active Directory Device Id|
|deviceName|String|The tenant attach device's name.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsdevicewithoutcloudidentity"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsDevicesWithoutCloudIdentity/{userExperienceAnalyticsDeviceWithoutCloudIdentityId}
Content-Type: application/json
Content-length: 150

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceWithoutCloudIdentity",
  "azureAdDeviceId": "String",
  "deviceName": "String"
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
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceWithoutCloudIdentity",
  "id": "a9405ee8-5ee8-a940-e85e-40a9e85e40a9",
  "azureAdDeviceId": "String",
  "deviceName": "String"
}
```

