---
title: "windows10PolicyOverrideConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10PolicyOverrideConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10PolicyOverrideConfiguration](../api/windows10policyoverrideconfiguration-list.md)|[windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md) collection|Get a list of the [windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md) objects and their properties.|
|[Create windows10PolicyOverrideConfiguration](../api/windows10policyoverrideconfiguration-create.md)|[windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md)|Create a new [windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md) object.|
|[Get windows10PolicyOverrideConfiguration](../api/windows10policyoverrideconfiguration-get.md)|[windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md)|Read the properties and relationships of a [windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md) object.|
|[Update windows10PolicyOverrideConfiguration](../api/windows10policyoverrideconfiguration-update.md)|[windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md)|Update the properties of a [windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md) object.|
|[Delete windows10PolicyOverrideConfiguration](../api/windows10policyoverrideconfiguration-delete.md)|None|Deletes a [windows10PolicyOverrideConfiguration](../resources/windows10policyoverrideconfiguration.md) object.|
|[assign](../api/windows10policyoverrideconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/windows10policyoverrideconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/windows10policyoverrideconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[List assignments](../api/windows10policyoverrideconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windows10policyoverrideconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windows10policyoverrideconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windows10policyoverrideconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windows10policyoverrideconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windows10policyoverrideconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windows10policyoverrideconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windows10policyoverrideconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windows10policyoverrideconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windows10policyoverrideconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/windows10policyoverrideconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windows10policyoverrideconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windows10policyoverrideconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windows10policyoverrideconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|preferMdmOverGroupPolicy|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|scenarioType|scenarioType|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Possible values are: `general`, `resourceAccess`.|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|

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
  "@odata.type": "microsoft.graph.windows10PolicyOverrideConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10PolicyOverrideConfiguration",
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
  "scenarioType": "String",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "preferMdmOverGroupPolicy": "Boolean"
}
```

