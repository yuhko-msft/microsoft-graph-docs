---
title: "aospDeviceOwnerDeviceConfiguration resource type"
description: "This topic provides descriptions of the declared methods, properties and relationships exposed by the AndroidDeviceOwnerAOSPDeviceConfiguration resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# aospDeviceOwnerDeviceConfiguration resource type

Namespace: microsoft.graph



This topic provides descriptions of the declared methods, properties and relationships exposed by the AndroidDeviceOwnerAOSPDeviceConfiguration resource.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List aospDeviceOwnerDeviceConfigurations](../api/aospdeviceownerdeviceconfiguration-list.md)|[aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) collection|Get a list of the [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) objects and their properties.|
|[Create aospDeviceOwnerDeviceConfiguration](../api/aospdeviceownerdeviceconfiguration-create.md)|[aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md)|Create a new [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object.|
|[Get aospDeviceOwnerDeviceConfiguration](../api/aospdeviceownerdeviceconfiguration-get.md)|[aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md)|Read the properties and relationships of an [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object.|
|[Update aospDeviceOwnerDeviceConfiguration](../api/aospdeviceownerdeviceconfiguration-update.md)|[aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md)|Update the properties of an [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object.|
|[Delete aospDeviceOwnerDeviceConfiguration](../api/aospdeviceownerdeviceconfiguration-delete.md)|None|Deletes an [aospDeviceOwnerDeviceConfiguration](../resources/aospdeviceownerdeviceconfiguration.md) object.|
|[assign](../api/aospdeviceownerdeviceconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/aospdeviceownerdeviceconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/aospdeviceownerdeviceconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/aospdeviceownerdeviceconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/aospdeviceownerdeviceconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/aospdeviceownerdeviceconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/aospdeviceownerdeviceconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/aospdeviceownerdeviceconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/aospdeviceownerdeviceconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/aospdeviceownerdeviceconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/aospdeviceownerdeviceconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/aospdeviceownerdeviceconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/aospdeviceownerdeviceconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/aospdeviceownerdeviceconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/aospdeviceownerdeviceconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/aospdeviceownerdeviceconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/aospdeviceownerdeviceconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|appsAllowInstallFromUnknownSources|Boolean|Indicates whether or not the user is allowed to enable to unknown sources setting.|
|backupBlocked|Boolean|Indicates whether or not to block backup service.|
|bluetoothBlockConfiguration|Boolean|Indicates whether or not to block a user from configuring bluetooth.|
|bluetoothBlockContactSharing|Boolean|Indicates whether or not to block a user from sharing contacts via bluetooth.|
|bluetoothBlocked|Boolean|Indicates whether or not to disable the use of bluetooth. When set to true, bluetooth cannot be enabled on the device.|
|cameraBlocked|Boolean|Indicates whether or not to disable the use of the camera.|
|cellularBlockWiFiTethering|Boolean|Indicates whether or not to block Wi-Fi tethering.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|factoryResetBlocked|Boolean|Indicates whether or not the factory reset option in settings is disabled.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|passwordMinimumLength|Int32|Indicates the minimum length of the password required on the device. Valid values 4 to 16|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|Indicates the minimum password quality required on the device. Possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|screenCaptureBlocked|Boolean|Indicates whether or not to disable the capability to take screenshots.|
|securityAllowDebuggingFeatures|Boolean|Indicates whether or not to block the user from enabling debugging features on the device.|
|storageAllowUsb|Boolean|Indicates whether or not to block USB storage.|
|storageBlockExternalMedia|Boolean|Indicates whether or not to block external media.|
|storageBlockUsbFileTransfer|Boolean|Indicates whether or not to block USB file transfer.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|wifiBlockEditConfigurations|Boolean|Indicates whether or not to block the user from editing the wifi connection settings.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

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

