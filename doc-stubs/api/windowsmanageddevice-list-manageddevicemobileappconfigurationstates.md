---
title: "List managedDeviceMobileAppConfigurationStates"
description: "Get the managedDeviceMobileAppConfigurationState resources from the managedDeviceMobileAppConfigurationStates navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List managedDeviceMobileAppConfigurationStates
Namespace: microsoft.graph

Get the managedDeviceMobileAppConfigurationState resources from the managedDeviceMobileAppConfigurationStates navigation property.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET /me/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates
GET /users/{usersId}/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates
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

If successful, this method returns a `200 OK` response code and a collection of [managedDeviceMobileAppConfigurationState](../resources/manageddevicemobileappconfigurationstate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_manageddevicemobileappconfigurationstate"
}
-->
``` http
GET https://graph.microsoft.com/beta/me/managedDevices/{managedDeviceId}/managedDeviceMobileAppConfigurationStates
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.managedDeviceMobileAppConfigurationState)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.graph.managedDeviceMobileAppConfigurationState",
      "id": "f8039d38-9d38-f803-389d-03f8389d03f8",
      "settingStates": [
        {
          "@odata.type": "microsoft.graph.managedDeviceMobileAppConfigurationSettingState"
        }
      ],
      "displayName": "String",
      "version": "Integer",
      "platformType": "String",
      "state": "String",
      "settingCount": "Integer",
      "userId": "String",
      "userPrincipalName": "String"
    }
  ]
}
```

