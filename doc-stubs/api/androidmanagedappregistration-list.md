---
title: "List androidManagedAppRegistrations"
description: "Get a list of the androidManagedAppRegistration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List androidManagedAppRegistrations
Namespace: microsoft.graph



Get a list of the [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.androidManagedAppRegistration not found
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

If successful, this method returns a `200 OK` response code and a collection of [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_androidmanagedappregistration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidManagedAppRegistration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.androidManagedAppRegistration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.androidManagedAppRegistration",
      "id": "b257b3d5-b3d5-b257-d5b3-57b2d5b357b2",
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
      "version": "String",
      "patchVersion": "String"
    }
  ]
}
```

