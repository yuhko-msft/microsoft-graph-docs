---
title: "Update aospDeviceOwnerDeviceConfiguration"
description: "Update the properties of an aospDeviceOwnerDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update aospDeviceOwnerDeviceConfiguration
Namespace: microsoft.graph



Update the properties of an [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.aospDeviceOwnerDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object.

The following table shows the properties that are required when you update the [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|appsAllowInstallFromUnknownSources|Boolean|Indicates whether or not the user is allowed to enable to unknown sources setting.|
|backupBlocked|Boolean|Indicates whether or not to block backup service.|
|bluetoothBlockConfiguration|Boolean|Indicates whether or not to block a user from configuring bluetooth.|
|bluetoothBlockContactSharing|Boolean|Indicates whether or not to block a user from sharing contacts via bluetooth.|
|bluetoothBlocked|Boolean|Indicates whether or not to disable the use of bluetooth. When set to true, bluetooth cannot be enabled on the device.|
|cameraBlocked|Boolean|Indicates whether or not to disable the use of the camera.|
|cellularBlockWiFiTethering|Boolean|Indicates whether or not to block Wi-Fi tethering.|
|factoryResetBlocked|Boolean|Indicates whether or not the factory reset option in settings is disabled.|
|passwordMinimumLength|Int32|Indicates the minimum length of the password required on the device. Valid values 4 to 16|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|Indicates the minimum password quality required on the device. Possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11|
|screenCaptureBlocked|Boolean|Indicates whether or not to disable the capability to take screenshots.|
|securityAllowDebuggingFeatures|Boolean|Indicates whether or not to block the user from enabling debugging features on the device.|
|storageAllowUsb|Boolean|Indicates whether or not to block USB storage.|
|storageBlockExternalMedia|Boolean|Indicates whether or not to block external media.|
|storageBlockUsbFileTransfer|Boolean|Indicates whether or not to block USB file transfer.|
|wifiBlockEditConfigurations|Boolean|Indicates whether or not to block the user from editing the wifi connection settings.|



## Response

If successful, this method returns a `200 OK` response code and an updated [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_aospdeviceownerdeviceconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.aospDeviceOwnerDeviceConfiguration not found
Content-Type: application/json
Content-length: 1426

{
  "@odata.type": "#microsoft.graph.aospDeviceOwnerDeviceConfiguration",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "appsAllowInstallFromUnknownSources": "Boolean",
  "backupBlocked": "Boolean",
  "bluetoothBlockConfiguration": "Boolean",
  "bluetoothBlockContactSharing": "Boolean",
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "factoryResetBlocked": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "screenCaptureBlocked": "Boolean",
  "securityAllowDebuggingFeatures": "Boolean",
  "storageAllowUsb": "Boolean",
  "storageBlockExternalMedia": "Boolean",
  "storageBlockUsbFileTransfer": "Boolean",
  "wifiBlockEditConfigurations": "Boolean"
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
  "@odata.type": "#microsoft.graph.aospDeviceOwnerDeviceConfiguration",
  "id": "8d1f3454-3454-8d1f-5434-1f8d54341f8d",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "appsAllowInstallFromUnknownSources": "Boolean",
  "backupBlocked": "Boolean",
  "bluetoothBlockConfiguration": "Boolean",
  "bluetoothBlockContactSharing": "Boolean",
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "factoryResetBlocked": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "screenCaptureBlocked": "Boolean",
  "securityAllowDebuggingFeatures": "Boolean",
  "storageAllowUsb": "Boolean",
  "storageBlockExternalMedia": "Boolean",
  "storageBlockUsbFileTransfer": "Boolean",
  "wifiBlockEditConfigurations": "Boolean"
}
```

