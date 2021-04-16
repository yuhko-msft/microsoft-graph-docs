---
title: "Get windowsInformationProtectionDeviceRegistration"
description: "Read the properties and relationships of a windowsInformationProtectionDeviceRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windowsInformationProtectionDeviceRegistration
Namespace: microsoft.graph



Read the properties and relationships of a [windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) object.

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
GET /me/windowsInformationProtectionDeviceRegistrations/{windowsInformationProtectionDeviceRegistrationId}
GET /deviceAppManagement/windowsInformationProtectionDeviceRegistrations/{windowsInformationProtectionDeviceRegistrationId}
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

If successful, this method returns a `200 OK` response code and a [windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowsinformationprotectiondeviceregistration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/me/windowsInformationProtectionDeviceRegistrations/{windowsInformationProtectionDeviceRegistrationId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsInformationProtectionDeviceRegistration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.windowsInformationProtectionDeviceRegistration",
    "id": "554b9a17-9a17-554b-179a-4b55179a4b55",
    "deviceMacAddress": "String",
    "deviceName": "String",
    "deviceRegistrationId": "String",
    "deviceType": "String",
    "lastCheckInDateTime": "String (timestamp)",
    "userId": "String"
  }
}
```

