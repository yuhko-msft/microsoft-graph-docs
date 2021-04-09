---
title: "windows10DeviceFirmwareConfigurationInterface resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10DeviceFirmwareConfigurationInterface resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-list.md)|[windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) collection|Get a list of the [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) objects and their properties.|
|[Create windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-create.md)|[windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md)|Create a new [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.|
|[Get windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-get.md)|[windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md)|Read the properties and relationships of a [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.|
|[Update windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-update.md)|[windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md)|Update the properties of a [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.|
|[Delete windows10DeviceFirmwareConfigurationInterface](../api/windows10devicefirmwareconfigurationinterface-delete.md)|None|Deletes a [windows10DeviceFirmwareConfigurationInterface](../resources/windows10devicefirmwareconfigurationinterface.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|bootFromBuiltInNetworkAdapters|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|bootFromExternalMedia|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|cameras|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|changeUefiSettingsPermission|changeUefiSettingsPermission|**TODO: Add Description**. Possible values are: `notConfiguredOnly`, `none`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|microphonesAndSpeakers|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|radios|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|simultaneousMultiThreading|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|virtualizationOfCpuAndIO|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|windowsPlatformBinaryTable|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|

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
  "@odata.type": "microsoft.graph.windows10DeviceFirmwareConfigurationInterface",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10DeviceFirmwareConfigurationInterface",
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
  "changeUefiSettingsPermission": "String",
  "virtualizationOfCpuAndIO": "String",
  "cameras": "String",
  "microphonesAndSpeakers": "String",
  "radios": "String",
  "bootFromExternalMedia": "String",
  "bootFromBuiltInNetworkAdapters": "String",
  "windowsPlatformBinaryTable": "String",
  "simultaneousMultiThreading": "String"
}
```

