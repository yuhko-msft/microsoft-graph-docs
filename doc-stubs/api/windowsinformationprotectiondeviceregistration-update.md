---
title: "Update windowsInformationProtectionDeviceRegistration"
description: "Update the properties of a windowsInformationProtectionDeviceRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsInformationProtectionDeviceRegistration
Namespace: microsoft.graph



Update the properties of a [windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) object.

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
PATCH /me/windowsInformationProtectionDeviceRegistrations/{windowsInformationProtectionDeviceRegistrationId}
PATCH /deviceAppManagement/windowsInformationProtectionDeviceRegistrations/{windowsInformationProtectionDeviceRegistrationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) object.

The following table shows the properties that are required when you update the [windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|deviceMacAddress|String|Device Mac address.|
|deviceName|String|Device name.|
|deviceRegistrationId|String|Device identifier for this device registration record.|
|deviceType|String|Device type, for example, Windows laptop VS Windows phone.|
|lastCheckInDateTime|DateTimeOffset|Last checkin time of the device.|
|userId|String|UserId associated with this device registration record.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsInformationProtectionDeviceRegistration](../resources/windowsinformationprotectiondeviceregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsinformationprotectiondeviceregistration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/windowsInformationProtectionDeviceRegistrations/{windowsInformationProtectionDeviceRegistrationId}
Content-Type: application/json
Content-length: 283

{
  "@odata.type": "#microsoft.graph.windowsInformationProtectionDeviceRegistration",
  "deviceMacAddress": "String",
  "deviceName": "String",
  "deviceRegistrationId": "String",
  "deviceType": "String",
  "lastCheckInDateTime": "String (timestamp)",
  "userId": "String"
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
  "@odata.type": "#microsoft.graph.windowsInformationProtectionDeviceRegistration",
  "id": "554b9a17-9a17-554b-179a-4b55179a4b55",
  "deviceMacAddress": "String",
  "deviceName": "String",
  "deviceRegistrationId": "String",
  "deviceType": "String",
  "lastCheckInDateTime": "String (timestamp)",
  "userId": "String"
}
```

