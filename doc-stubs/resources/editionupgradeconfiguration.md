---
title: "editionUpgradeConfiguration resource type"
description: "Windows 10 Edition Upgrade configuration."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# editionUpgradeConfiguration resource type

Namespace: microsoft.graph



Windows 10 Edition Upgrade configuration.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List editionUpgradeConfigurations](../api/editionupgradeconfiguration-list.md)|[editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md) collection|Get a list of the [editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md) objects and their properties.|
|[Create editionUpgradeConfiguration](../api/editionupgradeconfiguration-create.md)|[editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md)|Create a new [editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md) object.|
|[Get editionUpgradeConfiguration](../api/editionupgradeconfiguration-get.md)|[editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md)|Read the properties and relationships of an [editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md) object.|
|[Update editionUpgradeConfiguration](../api/editionupgradeconfiguration-update.md)|[editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md)|Update the properties of an [editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md) object.|
|[Delete editionUpgradeConfiguration](../api/editionupgradeconfiguration-delete.md)|None|Deletes an [editionUpgradeConfiguration](../resources/editionupgradeconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|license|String|Edition Upgrade License File Content.|
|licenseType|editionUpgradeLicenseType|Edition Upgrade License Type. Possible values are: `productKey`, `licenseFile`, `notConfigured`.|
|productKey|String|Edition Upgrade Product Key.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|targetEdition|windows10EditionType|Edition Upgrade Target Edition. Possible values are: `windows10Enterprise`, `windows10EnterpriseN`, `windows10Education`, `windows10EducationN`, `windows10MobileEnterprise`, `windows10HolographicEnterprise`, `windows10Professional`, `windows10ProfessionalN`, `windows10ProfessionalEducation`, `windows10ProfessionalEducationN`, `windows10ProfessionalWorkstation`, `windows10ProfessionalWorkstationN`, `notConfigured`, `windows10Home`, `windows10HomeChina`, `windows10HomeN`, `windows10HomeSingleLanguage`, `windows10Mobile`, `windows10IoTCore`, `windows10IoTCoreCommercial`.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|windowsSMode|windowsSModeConfiguration|S mode configuration. Possible values are: `noRestriction`, `block`, `unlock`.|

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
  "@odata.type": "microsoft.graph.editionUpgradeConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.editionUpgradeConfiguration",
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
  "license": "String",
  "licenseType": "String",
  "productKey": "String",
  "targetEdition": "String",
  "windowsSMode": "String"
}
```

