---
title: "Get managedDeviceMobileAppConfigurationState"
description: "Read the properties and relationships of a managedDeviceMobileAppConfigurationState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get managedDeviceMobileAppConfigurationState
Namespace: microsoft.graph



Read the properties and relationships of a [managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) object.

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
GET /me/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates/{managedDeviceMobileAppConfigurationStateId}
GET /users/{usersId}/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates/{managedDeviceMobileAppConfigurationStateId}
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

If successful, this method returns a `200 OK` response code and a [managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_manageddevicemobileappconfigurationstate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates/{managedDeviceMobileAppConfigurationStateId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationState"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationState",
    "id": "616d32ba-32ba-616d-ba32-6d61ba326d61",
    "displayName": "String",
    "platformType": "String",
    "settingCount": "Integer",
    "settingStates": [
      {
        "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationSettingState"
      }
    ],
    "state": "String",
    "userId": "String",
    "userPrincipalName": "String",
    "version": "Integer"
  }
}
```

