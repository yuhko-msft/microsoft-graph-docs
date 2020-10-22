---
title: "Update androidManagedAppRegistration"
description: "Update the properties of an androidManagedAppRegistration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidManagedAppRegistration
Namespace: microsoft.graph

Update the properties of an [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object.

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
PATCH ** Entity URI for microsoft.graph.androidManagedAppRegistration not found
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
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|lastSyncDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|applicationVersion|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|managementSdkVersion|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|platformVersion|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceType|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceTag|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceName|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|managedDeviceId|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|azureADDeviceId|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceModel|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|deviceManufacturer|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|flaggedReasons|managedAppFlaggedReason collection|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md). Possible values are: `none`, `rootedDevice`, `androidBootloaderUnlocked`, `androidFactoryRomModified`.|
|userId|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|appIdentifier|[mobileAppIdentifier](../resources/intune-mobileappidentifier.md)|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|version|String|**TODO: Add Description** Inherited from [managedAppRegistration](../resources/intune-managedappregistration.md)|
|patchVersion|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidManagedAppRegistration](../resources/androidmanagedappregistration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androidmanagedappregistration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.androidManagedAppRegistration not found
Content-Type: application/json
Content-length: 632

{
  "@odata.type": "#microsoft.graph.androidManagedAppRegistration",
  "lastSyncDateTime": "String (timestamp)",
  "applicationVersion": "String",
  "managementSdkVersion": "String",
  "platformVersion": "String",
  "deviceType": "String",
  "deviceTag": "String",
  "deviceName": "String",
  "managedDeviceId": "String",
  "azureADDeviceId": "String",
  "deviceModel": "String",
  "deviceManufacturer": "String",
  "flaggedReasons": [
    "String"
  ],
  "userId": "String",
  "appIdentifier": {
    "@odata.type": "microsoft.graph.mobileAppIdentifier"
  },
  "version": "String",
  "patchVersion": "String"
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
  "@odata.type": "#microsoft.graph.androidManagedAppRegistration",
  "id": "60e50b35-0b35-60e5-350b-e560350be560",
  "createdDateTime": "String (timestamp)",
  "lastSyncDateTime": "String (timestamp)",
  "applicationVersion": "String",
  "managementSdkVersion": "String",
  "platformVersion": "String",
  "deviceType": "String",
  "deviceTag": "String",
  "deviceName": "String",
  "managedDeviceId": "String",
  "azureADDeviceId": "String",
  "deviceModel": "String",
  "deviceManufacturer": "String",
  "flaggedReasons": [
    "String"
  ],
  "userId": "String",
  "appIdentifier": {
    "@odata.type": "microsoft.graph.mobileAppIdentifier"
  },
  "version": "String",
  "patchVersion": "String"
}
```

