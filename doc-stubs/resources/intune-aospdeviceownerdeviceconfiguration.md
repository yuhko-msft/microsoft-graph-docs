---
title: "aospDeviceOwnerDeviceConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# aospDeviceOwnerDeviceConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [deviceConfiguration](../resources/intune-deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List aospDeviceOwnerDeviceConfigurations](../api/intune-aospdeviceownerdeviceconfiguration-list.md)|[aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md) collection|Get a list of the [aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md) objects and their properties.|
|[Get aospDeviceOwnerDeviceConfiguration](../api/intune-aospdeviceownerdeviceconfiguration-get.md)|[aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md)|Read the properties and relationships of an [aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md) object.|
|[Update aospDeviceOwnerDeviceConfiguration](../api/intune-aospdeviceownerdeviceconfiguration-update.md)|[aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md)|Update the properties of an [aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md) object.|
|[Delete aospDeviceOwnerDeviceConfiguration](../api/intune-aospdeviceownerdeviceconfiguration-delete.md)|None|Deletes an [aospDeviceOwnerDeviceConfiguration](../resources/intune-aospdeviceownerdeviceconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appsBlockInstallFromUnknownSources|Boolean|**TODO: Add Description**|
|backupBlocked|Boolean|**TODO: Add Description**|
|bluetoothBlockConfiguration|Boolean|**TODO: Add Description**|
|bluetoothBlockContactSharing|Boolean|**TODO: Add Description**|
|bluetoothBlocked|Boolean|**TODO: Add Description**|
|cameraBlocked|Boolean|**TODO: Add Description**|
|cellularBlockWiFiTethering|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|factoryResetBlocked|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|**TODO: Add Description**. The possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|screenCaptureBlocked|Boolean|**TODO: Add Description**|
|securityAllowDebuggingFeatures|Boolean|**TODO: Add Description**|
|storageBlockExternalMedia|Boolean|**TODO: Add Description**|
|storageBlockUsbFileTransfer|Boolean|**TODO: Add Description**|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md).|
|wifiBlockEditConfigurations|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.aospDeviceOwnerDeviceConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.aospDeviceOwnerDeviceConfiguration",
  "id": "String (identifier)",
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

