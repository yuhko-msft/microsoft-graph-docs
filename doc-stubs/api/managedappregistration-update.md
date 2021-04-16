---
title: "Update managedAppRegistration"
description: "Update the properties of a managedAppRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update managedAppRegistration
Namespace: microsoft.graph



Update the properties of a [managedAppRegistration](../resources/managedappregistration.md) object.

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
PATCH /me/managedAppRegistrations/{managedAppRegistrationId}
PATCH /deviceAppManagement/managedAppRegistrations/{managedAppRegistrationId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedAppRegistration](../resources/managedappregistration.md) object.

The following table shows the properties that are required when you update the [managedAppRegistration](../resources/managedappregistration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appIdentifier|[mobileAppIdentifier](../resources/mobileappidentifier.md)|The app package Identifier|
|applicationVersion|String|App version|
|azureADDeviceId|String|The Azure Active Directory Device identifier of the host device. Value could be empty even when the host device is Azure Active Directory registered.|
|createdDateTime|DateTimeOffset|Date and time of creation|
|deviceManufacturer|String|The device manufacturer for the current app registration |
|deviceModel|String|The device model for the current app registration |
|deviceName|String|Host device name|
|deviceTag|String|App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions.|
|deviceType|String|Host device type|
|flaggedReasons|managedAppFlaggedReason collection|Zero or more reasons an app registration is flagged. E.g. app running on rooted device. Possible values are: `none`, `rootedDevice`, `androidBootloaderUnlocked`, `androidFactoryRomModified`.|
|lastSyncDateTime|DateTimeOffset|Date and time of last the app synced with management service.|
|managedDeviceId|String|The Managed Device identifier of the host device. Value could be empty even when the host device is managed.|
|managementSdkVersion|String|App management SDK version|
|platformVersion|String|Operating System version|
|userId|String|The user Id to who this app registration belongs.|
|version|String|Version of the entity.|



## Response

If successful, this method returns a `200 OK` response code and an updated [managedAppRegistration](../resources/managedappregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_managedappregistration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/managedAppRegistrations/{managedAppRegistrationId}
Content-Type: application/json
Content-length: 596

{
  "@odata.type": "#microsoft.graph.managedAppRegistration",
  "appIdentifier": {
    "@odata.type": "microsoft.graph.mobileAppIdentifier"
  },
  "applicationVersion": "String",
  "azureADDeviceId": "String",
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
```

