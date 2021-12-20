---
title: "Update aospDeviceOwnerDeviceConfiguration"
description: "Update the properties of an aospDeviceOwnerDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update aospDeviceOwnerDeviceConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md) object.

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
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Required.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Optional.|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Required.|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Optional.|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Optional.|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Optional.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Required.|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Optional.|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Required.|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Required.|
|appsBlockInstallFromUnknownSources|Boolean|**TODO: Add Description** Optional.|
|bluetoothBlocked|Boolean|**TODO: Add Description** Optional.|
|bluetoothBlockConfiguration|Boolean|**TODO: Add Description** Optional.|
|bluetoothBlockContactSharing|Boolean|**TODO: Add Description** Optional.|
|cameraBlocked|Boolean|**TODO: Add Description** Optional.|
|cellularBlockWiFiTethering|Boolean|**TODO: Add Description** Optional.|
|factoryResetBlocked|Boolean|**TODO: Add Description** Optional.|
|passwordMinimumLength|Int32|**TODO: Add Description** Optional.|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description** Optional.|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|**TODO: Add Description**. The possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`. Optional.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description** Optional.|
|screenCaptureBlocked|Boolean|**TODO: Add Description** Optional.|
|securityAllowDebuggingFeatures|Boolean|**TODO: Add Description** Optional.|
|storageBlockExternalMedia|Boolean|**TODO: Add Description** Optional.|
|storageBlockUsbFileTransfer|Boolean|**TODO: Add Description** Optional.|
|backupBlocked|Boolean|**TODO: Add Description** Optional.|
|wifiBlockEditConfigurations|Boolean|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_aospdeviceownerdeviceconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.aospDeviceOwnerDeviceConfiguration not found
Content-Type: application/json
Content-length: 1393

{
  "@odata.type": "#microsoft.graph.aospDeviceOwnerDeviceConfiguration",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "appsBlockInstallFromUnknownSources": "Boolean",
  "bluetoothBlocked": "Boolean",
  "bluetoothBlockConfiguration": "Boolean",
  "bluetoothBlockContactSharing": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "factoryResetBlocked": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "screenCaptureBlocked": "Boolean",
  "securityAllowDebuggingFeatures": "Boolean",
  "storageBlockExternalMedia": "Boolean",
  "storageBlockUsbFileTransfer": "Boolean",
  "backupBlocked": "Boolean",
  "wifiBlockEditConfigurations": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
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
  "id": "ef4e5489-5489-ef4e-8954-4eef89544eef",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "appsBlockInstallFromUnknownSources": "Boolean",
  "bluetoothBlocked": "Boolean",
  "bluetoothBlockConfiguration": "Boolean",
  "bluetoothBlockContactSharing": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "factoryResetBlocked": "Boolean",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "screenCaptureBlocked": "Boolean",
  "securityAllowDebuggingFeatures": "Boolean",
  "storageBlockExternalMedia": "Boolean",
  "storageBlockUsbFileTransfer": "Boolean",
  "backupBlocked": "Boolean",
  "wifiBlockEditConfigurations": "Boolean"
}
```

