---
title: "windowsDeliveryOptimizationConfiguration resource type"
description: "Windows Delivery Optimization configuration"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsDeliveryOptimizationConfiguration resource type

Namespace: microsoft.graph



Windows Delivery Optimization configuration


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsDeliveryOptimizationConfigurations](../api/windowsdeliveryoptimizationconfiguration-list.md)|[windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) collection|Get a list of the [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) objects and their properties.|
|[Create windowsDeliveryOptimizationConfiguration](../api/windowsdeliveryoptimizationconfiguration-create.md)|[windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md)|Create a new [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object.|
|[Get windowsDeliveryOptimizationConfiguration](../api/windowsdeliveryoptimizationconfiguration-get.md)|[windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md)|Read the properties and relationships of a [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object.|
|[Update windowsDeliveryOptimizationConfiguration](../api/windowsdeliveryoptimizationconfiguration-update.md)|[windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md)|Update the properties of a [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object.|
|[Delete windowsDeliveryOptimizationConfiguration](../api/windowsdeliveryoptimizationconfiguration-delete.md)|None|Deletes a [windowsDeliveryOptimizationConfiguration](../resources/windowsdeliveryoptimizationconfiguration.md) object.|
|[assign](../api/windowsdeliveryoptimizationconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/windowsdeliveryoptimizationconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/windowsdeliveryoptimizationconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/windowsdeliveryoptimizationconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windowsdeliveryoptimizationconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windowsdeliveryoptimizationconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windowsdeliveryoptimizationconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windowsdeliveryoptimizationconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windowsdeliveryoptimizationconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windowsdeliveryoptimizationconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windowsdeliveryoptimizationconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windowsdeliveryoptimizationconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windowsdeliveryoptimizationconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/windowsdeliveryoptimizationconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windowsdeliveryoptimizationconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windowsdeliveryoptimizationconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windowsdeliveryoptimizationconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|backgroundDownloadFromHttpDelayInSeconds|Int64|Specifies number of seconds to delay an HTTP source in a background download that is allowed to use peer-to-peer. Valid values 0 to 4294967295|
|bandwidthMode|[deliveryOptimizationBandwidth](../resources/deliveryoptimizationbandwidth.md)|Specifies foreground and background bandwidth usage using percentages, absolutes, or hours.|
|cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds|Int32|Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000.|
|cacheServerForegroundDownloadFallbackToHttpDelayInSeconds|Int32|Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000.​|
|cacheServerHostNames|String collection|Specifies cache servers host names.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deliveryOptimizationMode|windowsDeliveryOptimizationMode|Specifies the download method that delivery optimization can use to manage network bandwidth consumption for large content distribution scenarios. Possible values are: `userDefined`, `httpOnly`, `httpWithPeeringNat`, `httpWithPeeringPrivateGroup`, `httpWithInternetPeering`, `simpleDownload`, `bypassMode`.|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|foregroundDownloadFromHttpDelayInSeconds|Int64|Specifies number of seconds to delay an HTTP source in a foreground download that is allowed to use peer-to-peer (0-86400). Valid values 0 to 86400
Specifying 0 sets Delivery Optimization to manage this setting using the cloud service. Valid values 0 to 86400|
|groupIdSource|[deliveryOptimizationGroupIdSource](../resources/deliveryoptimizationgroupidsource.md)|Specifies to restrict peer selection to a specfic source.
The options set in this policy only apply to Delivery Optimization mode Group (2) download mode. If Group (2) isn't set as Download mode, this policy will be ignored. For option 3 - DHCP Option ID, the client will query DHCP Option ID 234 and use the returned GUID value as the Group ID.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|maximumCacheAgeInDays|Int32|Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650|
|maximumCacheSize|[deliveryOptimizationMaxCacheSize](../resources/deliveryoptimizationmaxcachesize.md)|Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB.|
|minimumBatteryPercentageAllowedToUpload|Int32|Specifies the minimum battery percentage to allow the device to upload data (0-100). Valid values 0 to 100
The default value is 0. The value 0 (zero) means "not limited" and the cloud service default value will be used. Valid values 0 to 100|
|minimumDiskSizeAllowedToPeerInGigabytes|Int32|Specifies the minimum disk size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
Recommended values: 64 GB to 256 GB. Valid values 1 to 100000|
|minimumFileSizeToCacheInMegabytes|Int32|Specifies the minimum content file size in MB enabled to use Peer Caching (1-100000). Valid values 1 to 100000
Recommended values: 1 MB to 100,000 MB. Valid values 1 to 100000|
|minimumRamAllowedToPeerInGigabytes|Int32|Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000|
|modifyCacheLocation|String|Specifies the drive that Delivery Optimization should use for its cache.|
|restrictPeerSelectionBy|deliveryOptimizationRestrictPeerSelectionByOptions|Specifies to restrict peer selection via selected option.
Option 1 (Subnet mask) only applies to Delivery Optimization modes Download Mode LAN (1) and Group (2). Possible values are: `notConfigured`, `subnetMask`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|vpnPeerCaching|enablement|Specifies whether the device is allowed to participate in Peer Caching while connected via VPN to the domain network. Possible values are: `notConfigured`, `enabled`, `disabled`.|

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
  "@odata.type": "microsoft.graph.windowsDeliveryOptimizationConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsDeliveryOptimizationConfiguration",
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
  "backgroundDownloadFromHttpDelayInSeconds": "Integer",
  "bandwidthMode": {
    "@odata.type": "microsoft.graph.deliveryOptimizationBandwidth"
  },
  "cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds": "Integer",
  "cacheServerForegroundDownloadFallbackToHttpDelayInSeconds": "Integer",
  "cacheServerHostNames": [
    "String"
  ],
  "deliveryOptimizationMode": "String",
  "foregroundDownloadFromHttpDelayInSeconds": "Integer",
  "groupIdSource": {
    "@odata.type": "microsoft.graph.deliveryOptimizationGroupIdSource"
  },
  "maximumCacheAgeInDays": "Integer",
  "maximumCacheSize": {
    "@odata.type": "microsoft.graph.deliveryOptimizationMaxCacheSize"
  },
  "minimumBatteryPercentageAllowedToUpload": "Integer",
  "minimumDiskSizeAllowedToPeerInGigabytes": "Integer",
  "minimumFileSizeToCacheInMegabytes": "Integer",
  "minimumRamAllowedToPeerInGigabytes": "Integer",
  "modifyCacheLocation": "String",
  "restrictPeerSelectionBy": "String",
  "vpnPeerCaching": "String"
}
```

