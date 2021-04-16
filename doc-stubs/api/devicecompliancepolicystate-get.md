---
title: "Get deviceCompliancePolicyState"
description: "Read the properties and relationships of a deviceCompliancePolicyState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceCompliancePolicyState
Namespace: microsoft.graph



Read the properties and relationships of a [deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) object.

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
GET /me/managedDevices/{managedDeviceId}/deviceCompliancePolicyStates/{deviceCompliancePolicyStateId}
GET /users/{usersId}/managedDevices/{managedDeviceId}/deviceCompliancePolicyStates/{deviceCompliancePolicyStateId}
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

If successful, this method returns a `200 OK` response code and a [deviceCompliancePolicyState](../resources/devicecompliancepolicystate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicecompliancepolicystate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/deviceCompliancePolicyStates/{deviceCompliancePolicyStateId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceCompliancePolicyState"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceCompliancePolicyState",
    "id": "f2568e44-8e44-f256-448e-56f2448e56f2",
    "displayName": "String",
    "platformType": "String",
    "settingCount": "Integer",
    "settingStates": [
      {
        "@odata.type": "microsoft.graph.deviceCompliancePolicySettingState"
      }
    ],
    "state": "String",
    "userId": "String",
    "userPrincipalName": "String",
    "version": "Integer"
  }
}
```

