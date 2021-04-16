---
title: "deviceConfiguration resource type"
description: "Device Configuration."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# deviceConfiguration resource type

Namespace: microsoft.graph



Device Configuration.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List deviceConfigurations](../api/deviceconfiguration-list.md)|[deviceConfiguration](../resources/deviceconfiguration.md) collection|Get a list of the [deviceConfiguration](../resources/deviceconfiguration.md) objects and their properties.|
|[Create deviceConfiguration](../api/deviceconfiguration-create.md)|[deviceConfiguration](../resources/deviceconfiguration.md)|Create a new [deviceConfiguration](../resources/deviceconfiguration.md) object.|
|[Get deviceConfiguration](../api/deviceconfiguration-get.md)|[deviceConfiguration](../resources/deviceconfiguration.md)|Read the properties and relationships of a [deviceConfiguration](../resources/deviceconfiguration.md) object.|
|[Update deviceConfiguration](../api/deviceconfiguration-update.md)|[deviceConfiguration](../resources/deviceconfiguration.md)|Update the properties of a [deviceConfiguration](../resources/deviceconfiguration.md) object.|
|[Delete deviceConfiguration](../api/deviceconfiguration-delete.md)|None|Deletes a [deviceConfiguration](../resources/deviceconfiguration.md) object.|
|[assign](../api/deviceconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/deviceconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[getTargetedUsersAndDevices](../api/deviceconfiguration-gettargetedusersanddevices.md)|[deviceConfigurationTargetedUserAndDevice](../resources/deviceconfigurationtargeteduseranddevice.md) collection|**TODO: Add Description**|
|[hasPayloadLinks](../api/deviceconfiguration-haspayloadlinks.md)|[hasPayloadLinkResultItem](../resources/haspayloadlinkresultitem.md) collection|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/deviceconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[getIosAvailableUpdateVersions](../api/deviceconfiguration-getiosavailableupdateversions.md)|[iosAvailableUpdateVersion](../resources/iosavailableupdateversion.md) collection|**TODO: Add Description**|
|[List groupAssignments](../api/deviceconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/deviceconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created.|
|description|String|Admin provided description of the Device Configuration.|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy.|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy.|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy.|
|displayName|String|Admin provided name of the device configuration.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only.|
|version|Int32|Version of the device configuration.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile.|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device.|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user.|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.deviceConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.deviceConfiguration",
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
  "version": "Integer"
}
```

