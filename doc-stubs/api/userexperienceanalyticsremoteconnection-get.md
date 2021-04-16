---
title: "Get userExperienceAnalyticsRemoteConnection"
description: "Read the properties and relationships of a userExperienceAnalyticsRemoteConnection object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get userExperienceAnalyticsRemoteConnection
Namespace: microsoft.graph



Read the properties and relationships of a [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object.

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
GET /deviceManagement/userExperienceAnalyticsRemoteConnection/{userExperienceAnalyticsRemoteConnectionId}
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

If successful, this method returns a `200 OK` response code and a [userExperienceAnalyticsRemoteConnection](../resources/userexperienceanalyticsremoteconnection.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_userexperienceanalyticsremoteconnection"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/userExperienceAnalyticsRemoteConnection/{userExperienceAnalyticsRemoteConnectionId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.userExperienceAnalyticsRemoteConnection"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

