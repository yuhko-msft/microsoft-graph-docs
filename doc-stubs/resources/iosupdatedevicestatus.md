---
title: "iosUpdateDeviceStatus resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosUpdateDeviceStatus resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosUpdateDeviceStatus](../api/iosupdatedevicestatus-list.md)|[iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) collection|Get a list of the [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) objects and their properties.|
|[Create iosUpdateDeviceStatus](../api/iosupdatedevicestatus-create.md)|[iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md)|Create a new [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) object.|
|[Get iosUpdateDeviceStatus](../api/iosupdatedevicestatus-get.md)|[iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md)|Read the properties and relationships of an [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) object.|
|[Update iosUpdateDeviceStatus](../api/iosupdatedevicestatus-update.md)|[iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md)|Update the properties of an [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) object.|
|[Delete iosUpdateDeviceStatus](../api/iosupdatedevicestatus-delete.md)|None|Deletes an [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|The DateTime when device compliance grace period expires|
|deviceDisplayName|String|Device name of the DevicePolicyStatus.|
|deviceId|String|The device id that is being reported.|
|deviceModel|String|The device model that is being reported|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|installStatus|iosUpdatesInstallStatus|The installation status of the policy report. Possible values are: `updateScanFailed`, `deviceOsHigherThanDesiredOsVersion`, `updateError`, `sharedDeviceUserLoggedInError`, `notSupportedOperation`, `installFailed`, `installPhoneCallInProgress`, `installInsufficientPower`, `installInsufficientSpace`, `installing`, `downloadInsufficientNetwork`, `downloadInsufficientPower`, `downloadInsufficientSpace`, `downloadRequiresComputer`, `downloadFailed`, `downloading`, `timeout`, `mdmClientCrashed`, `success`, `available`, `idle`, `unknown`.|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|osVersion|String|The device version that is being reported.|
|platform|Int32|Platform of the device that is being reported|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userId|String|The User id that is being reported.|
|userName|String|The User Name that is being reported|
|userPrincipalName|String|UserPrincipalName.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosUpdateDeviceStatus",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosUpdateDeviceStatus",
  "id": "String (identifier)",
  "complianceGracePeriodExpirationDateTime": "String (timestamp)",
  "deviceDisplayName": "String",
  "deviceId": "String",
  "deviceModel": "String",
  "installStatus": "String",
  "lastReportedDateTime": "String (timestamp)",
  "osVersion": "String",
  "platform": "Integer",
  "status": "String",
  "userId": "String",
  "userName": "String",
  "userPrincipalName": "String"
}
```

