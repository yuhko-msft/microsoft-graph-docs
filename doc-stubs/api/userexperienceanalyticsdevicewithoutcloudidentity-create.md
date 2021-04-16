---
title: "Create userExperienceAnalyticsDeviceWithoutCloudIdentity"
description: "Create a new userExperienceAnalyticsDeviceWithoutCloudIdentity object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create userExperienceAnalyticsDeviceWithoutCloudIdentity
Namespace: microsoft.graph



Create a new [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object.

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
POST /deviceManagement/userExperienceAnalyticsDevicesWithoutCloudIdentity
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object.

The following table shows the properties that are required when you create the [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|azureAdDeviceId|String|Azure Active Directory Device Id|
|deviceName|String|The tenant attach device's name.|



## Response

If successful, this method returns a `201 Created` response code and a [userExperienceAnalyticsDeviceWithoutCloudIdentity](../resources/userexperienceanalyticsdevicewithoutcloudidentity.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_userexperienceanalyticsdevicewithoutcloudidentity_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsDevicesWithoutCloudIdentity
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
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsDeviceWithoutCloudIdentity"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsDeviceWithoutCloudIdentity",
  "id": "a9405ee8-5ee8-a940-e85e-40a9e85e40a9",
  "azureAdDeviceId": "String",
  "deviceName": "String"
}
```

