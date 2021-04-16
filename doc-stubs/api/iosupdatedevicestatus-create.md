---
title: "Create iosUpdateDeviceStatus"
description: "Create a new iosUpdateDeviceStatus object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create iosUpdateDeviceStatus
Namespace: microsoft.graph



Create a new [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) object.

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
POST /deviceManagement/iosUpdateStatuses
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) object.

The following table shows the properties that are required when you create the [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|complianceGracePeriodExpirationDateTime|DateTimeOffset|The DateTime when device compliance grace period expires|
|deviceDisplayName|String|Device name of the DevicePolicyStatus.|
|deviceId|String|The device id that is being reported.|
|deviceModel|String|The device model that is being reported|
|installStatus|iosUpdatesInstallStatus|The installation status of the policy report. Possible values are: `updateScanFailed`, `deviceOsHigherThanDesiredOsVersion`, `updateError`, `sharedDeviceUserLoggedInError`, `notSupportedOperation`, `installFailed`, `installPhoneCallInProgress`, `installInsufficientPower`, `installInsufficientSpace`, `installing`, `downloadInsufficientNetwork`, `downloadInsufficientPower`, `downloadInsufficientSpace`, `downloadRequiresComputer`, `downloadFailed`, `downloading`, `timeout`, `mdmClientCrashed`, `success`, `available`, `idle`, `unknown`.|
|lastReportedDateTime|DateTimeOffset|Last modified date time of the policy report.|
|osVersion|String|The device version that is being reported.|
|platform|Int32|Platform of the device that is being reported|
|status|complianceStatus|Compliance status of the policy report. Possible values are: `unknown`, `notApplicable`, `compliant`, `remediated`, `nonCompliant`, `error`, `conflict`, `notAssigned`.|
|userId|String|The User id that is being reported.|
|userName|String|The User Name that is being reported|
|userPrincipalName|String|UserPrincipalName.|



## Response

If successful, this method returns a `201 Created` response code and an [iosUpdateDeviceStatus](../resources/iosupdatedevicestatus.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_iosupdatedevicestatus_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/iosUpdateStatuses
Content-Type: application/json
Content-length: 454

{
  "@odata.type": "#microsoft.graph.iosUpdateDeviceStatus",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosUpdateDeviceStatus"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.iosUpdateDeviceStatus",
  "id": "b8df64a9-64a9-b8df-a964-dfb8a964dfb8",
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

