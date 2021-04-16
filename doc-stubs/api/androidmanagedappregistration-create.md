---
title: "Create androidManagedAppRegistration"
description: "Create a new androidManagedAppRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidManagedAppRegistration
Namespace: microsoft.graph



Create a new [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object.

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
POST ** Collection URI for microsoft.graph.androidManagedAppRegistration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object.

The following table shows the properties that are required when you create the [androidManagedAppRegistration](../resources/androidmanagedappregistration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|appIdentifier|[mobileAppIdentifier](../resources/mobileappidentifier.md)|The app package Identifier Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|applicationVersion|String|App version Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|azureADDeviceId|String|The Azure Active Directory Device identifier of the host device. Value could be empty even when the host device is Azure Active Directory registered. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|createdDateTime|DateTimeOffset|Date and time of creation Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceManufacturer|String|The device manufacturer for the current app registration  Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceModel|String|The device model for the current app registration  Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceName|String|Host device name Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceTag|String|App management SDK generated tag, which helps relate apps hosted on the same device. Not guaranteed to relate apps in all conditions. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|deviceType|String|Host device type Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|flaggedReasons|managedAppFlaggedReason collection|Zero or more reasons an app registration is flagged. E.g. app running on rooted device Inherited from [managedAppRegistration](../resources/managedappregistration.md). Possible values are: `none`, `rootedDevice`, `androidBootloaderUnlocked`, `androidFactoryRomModified`.|
|lastSyncDateTime|DateTimeOffset|Date and time of last the app synced with management service. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|managedDeviceId|String|The Managed Device identifier of the host device. Value could be empty even when the host device is managed. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|managementSdkVersion|String|App management SDK version Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|platformVersion|String|Operating System version Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|userId|String|The user Id to who this app registration belongs. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|version|String|Version of the entity. Inherited from [managedAppRegistration](../resources/managedappregistration.md)|
|patchVersion|String|The patch version for the current android app registration|



## Response

If successful, this method returns a `201 Created` response code and an [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidmanagedappregistration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidManagedAppRegistration not found
Content-Type: application/json
Content-length: 632

{
  "@odata.type": "#microsoft.graph.androidManagedAppRegistration",
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
  "version": "String",
  "patchVersion": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidManagedAppRegistration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

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
```

