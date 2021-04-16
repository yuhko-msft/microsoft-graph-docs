---
title: "Update userExperienceAnalyticsRemoteConnection"
description: "Update the properties of a userExperienceAnalyticsRemoteConnection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update userExperienceAnalyticsRemoteConnection
Namespace: microsoft.graph



Update the properties of a [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object.

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
PATCH /deviceManagement/userExperienceAnalyticsRemoteConnection/{userExperienceAnalyticsRemoteConnectionId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object.

The following table shows the properties that are required when you update the [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|cloudPcFailurePercentage|Double|The sign in failure percentage of Cloud PC Device. Valid values 0 to 100|
|cloudPcRoundTripTime|Double|The round tip time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|cloudPcSignInTime|Double|The sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|coreBootTime|Double|The core boot time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|coreSignInTime|Double|The core sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|deviceCount|Int32|The count of remote connection. Valid values 0 to 2147483647|
|deviceId|String|The id of the device.|
|deviceName|String|The name of the device.|
|model|String|The user experience analytics device model.|
|remoteSignInTime|Double|The remote sign in time of Cloud PC Device. Valid values 0 to 1.79769313486232E+308|
|virtualNetwork|String|The user experience analytics virtual network.|



## Response

If successful, this method returns a `200 OK` response code and an updated [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_userexperienceanalyticsremoteconnection"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsRemoteConnection/{userExperienceAnalyticsRemoteConnectionId}
Content-Type: application/json
Content-length: 420

{
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsRemoteConnection",
  "cloudPcFailurePercentage": "Double",
  "cloudPcRoundTripTime": "Double",
  "cloudPcSignInTime": "Double",
  "coreBootTime": "Double",
  "coreSignInTime": "Double",
  "deviceCount": "Integer",
  "deviceId": "String",
  "deviceName": "String",
  "model": "String",
  "remoteSignInTime": "Double",
  "virtualNetwork": "String"
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
  "@odata.type": "#microsoft.graph.userExperienceAnalyticsRemoteConnection",
  "id": "700ac776-c776-700a-76c7-0a7076c70a70",
  "cloudPcFailurePercentage": "Double",
  "cloudPcRoundTripTime": "Double",
  "cloudPcSignInTime": "Double",
  "coreBootTime": "Double",
  "coreSignInTime": "Double",
  "deviceCount": "Integer",
  "deviceId": "String",
  "deviceName": "String",
  "model": "String",
  "remoteSignInTime": "Double",
  "virtualNetwork": "String"
}
```

