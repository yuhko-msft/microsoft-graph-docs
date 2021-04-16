---
title: "List managedAppRegistrations"
description: "Get a list of the managedAppRegistration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List managedAppRegistrations
Namespace: microsoft.graph



Get a list of the [managedAppRegistration](../resources/managedappregistration.md) objects and their properties.

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
GET /me/managedAppRegistrations
GET /users/{usersId}/managedAppRegistrations
GET /deviceAppManagement/managedAppRegistrations
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

If successful, this method returns a `200 OK` response code and a collection of [managedAppRegistration](../resources/managedappregistration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_managedappregistration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/managedAppRegistrations
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.managedAppRegistration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.managedAppRegistration",
      "id": "58dddad1-dad1-58dd-d1da-dd58d1dadd58",
      "appIdentifier": {
        "@odata.type": "microsoft.graph.mobileAppIdentifier"
      },
      "applicationVersion": "String",
      "azureADDeviceId": "String",
      "createdDateTime": "String (timestamp)",
      "deviceManufacturer": "String",
      "deviceModel": "String",
      "deviceName": "String",
      "deviceTag": "String",
      "deviceType": "String",
      "flaggedReasons": [
        "String"
      ],
      "lastSyncDateTime": "String (timestamp)",
      "managedDeviceId": "String",
      "managementSdkVersion": "String",
      "platformVersion": "String",
      "userId": "String",
      "version": "String"
    }
  ]
}
```

