---
title: "macOSExtensionsConfiguration resource type"
description: "MacOS extensions configuration profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSExtensionsConfiguration resource type

Namespace: microsoft.graph



MacOS extensions configuration profile.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSExtensionsConfigurations](../api/macosextensionsconfiguration-list.md)|[macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) collection|Get a list of the [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) objects and their properties.|
|[Create macOSExtensionsConfiguration](../api/macosextensionsconfiguration-create.md)|[macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md)|Create a new [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object.|
|[Get macOSExtensionsConfiguration](../api/macosextensionsconfiguration-get.md)|[macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md)|Read the properties and relationships of a [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object.|
|[Update macOSExtensionsConfiguration](../api/macosextensionsconfiguration-update.md)|[macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md)|Update the properties of a [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object.|
|[Delete macOSExtensionsConfiguration](../api/macosextensionsconfiguration-delete.md)|None|Deletes a [macOSExtensionsConfiguration](../resources/macosextensionsconfiguration.md) object.|
|[assign](../api/macosextensionsconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/macosextensionsconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/macosextensionsconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/macosextensionsconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/macosextensionsconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/macosextensionsconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/macosextensionsconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/macosextensionsconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/macosextensionsconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/macosextensionsconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/macosextensionsconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/macosextensionsconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/macosextensionsconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/macosextensionsconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/macosextensionsconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/macosextensionsconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/macosextensionsconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

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
|kernelExtensionAllowedTeamIdentifiers|String collection|All kernel extensions validly signed by the team identifiers in this list will be allowed to load.|
|kernelExtensionOverridesAllowed|Boolean|If set to true, users can approve additional kernel extensions not explicitly allowed by configurations profiles.|
|kernelExtensionsAllowed|[macOSKernelExtension](../resources/macoskernelextension.md) collection|A list of kernel extensions that will be allowed to load. . This collection can contain a maximum of 500 elements.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|systemExtensionsAllowed|[macOSSystemExtension](../resources/macossystemextension.md) collection|Gets or sets a list of allowed macOS system extensions. This collection can contain a maximum of 500 elements.|
|systemExtensionsAllowedTeamIdentifiers|String collection|Gets or sets a list of allowed team identifiers. Any system extension signed with any of the specified team identifiers will be approved.|
|systemExtensionsAllowedTypes|[macOSSystemExtensionTypeMapping](../resources/macossystemextensiontypemapping.md) collection|Gets or sets a list of allowed macOS system extension types. This collection can contain a maximum of 500 elements.|
|systemExtensionsBlockOverride|Boolean|Gets or sets whether to allow the user to approve additional system extensions not explicitly allowed by configuration profiles.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

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
  "@odata.type": "microsoft.graph.macOSExtensionsConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSExtensionsConfiguration",
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
  "kernelExtensionAllowedTeamIdentifiers": [
    "String"
  ],
  "kernelExtensionOverridesAllowed": "Boolean",
  "kernelExtensionsAllowed": [
    {
      "@odata.type": "microsoft.graph.macOSKernelExtension"
    }
  ],
  "systemExtensionsAllowed": [
    {
      "@odata.type": "microsoft.graph.macOSSystemExtension"
    }
  ],
  "systemExtensionsAllowedTeamIdentifiers": [
    "String"
  ],
  "systemExtensionsAllowedTypes": [
    {
      "@odata.type": "microsoft.graph.macOSSystemExtensionTypeMapping"
    }
  ],
  "systemExtensionsBlockOverride": "Boolean"
}
```

