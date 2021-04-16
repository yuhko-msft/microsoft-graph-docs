---
title: "windows10DeviceFirmwareConfigurationInterface resource type"
description: "Graph properties for Device Firmware Configuration Interface "
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10DeviceFirmwareConfigurationInterface resource type

Namespace: microsoft.graph



Graph properties for Device Firmware Configuration Interface 


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-list.md)|[windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) collection|Get a list of the [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) objects and their properties.|
|[Create windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-create.md)|[windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md)|Create a new [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.|
|[Get windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-get.md)|[windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md)|Read the properties and relationships of a [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.|
|[Update windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-update.md)|[windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md)|Update the properties of a [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.|
|[Delete windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-delete.md)|None|Deletes a [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.|
|[assign](../api/windows10devicefirmwareconfigurationinterface-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/windows10devicefirmwareconfigurationinterface-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/windows10devicefirmwareconfigurationinterface-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/windows10devicefirmwareconfigurationinterface-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windows10devicefirmwareconfigurationinterface-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windows10devicefirmwareconfigurationinterface-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windows10devicefirmwareconfigurationinterface-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windows10devicefirmwareconfigurationinterface-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windows10devicefirmwareconfigurationinterface-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windows10devicefirmwareconfigurationinterface-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windows10devicefirmwareconfigurationinterface-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windows10devicefirmwareconfigurationinterface-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windows10devicefirmwareconfigurationinterface-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/windows10devicefirmwareconfigurationinterface-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windows10devicefirmwareconfigurationinterface-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windows10devicefirmwareconfigurationinterface-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windows10devicefirmwareconfigurationinterface-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bootFromBuiltInNetworkAdapters|enablement|Defines whether a user is allowed to boot from built-in network adapters. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|bootFromExternalMedia|enablement|Defines whether a user is allowed to boot from external media. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|cameras|enablement|Defines whether built-in cameras are enabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|changeUefiSettingsPermission|changeUefiSettingsPermission|Defines the permission level granted to users to change UEFI settings. Possible values are: `notConfiguredOnly`, `none`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|microphonesAndSpeakers|enablement|Defines whether built-in microphones or speakers are enabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|radios|enablement|Defines whether built-in radios e.g. WIFI, NFC, Bluetooth, are enabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|virtualizationOfCpuAndIO|enablement|Defines whether CPU and IO virtualization is enabled. Possible values are: `notConfigured`, `enabled`, `disabled`.|

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
  "@odata.type": "microsoft.graph.windows10DeviceFirmwareConfigurationInterface",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10DeviceFirmwareConfigurationInterface",
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
  "bootFromBuiltInNetworkAdapters": "String",
  "bootFromExternalMedia": "String",
  "cameras": "String",
  "changeUefiSettingsPermission": "String",
  "microphonesAndSpeakers": "String",
  "radios": "String",
  "virtualizationOfCpuAndIO": "String"
}
```

