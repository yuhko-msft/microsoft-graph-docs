---
title: "androidDeviceOwnerDerivedCredentialAuthenticationConfiguration resource type"
description: "Android COBO Derived Credential profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# androidDeviceOwnerDerivedCredentialAuthenticationConfiguration resource type

Namespace: microsoft.graph



Android COBO Derived Credential profile.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List androidDeviceOwnerDerivedCredentialAuthenticationConfigurations](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list.md)|[androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md) collection|Get a list of the [androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md) objects and their properties.|
|[Create androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-create.md)|[androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md)|Create a new [androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md) object.|
|[Get androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-get.md)|[androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md)|Read the properties and relationships of an [androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md) object.|
|[Update androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-update.md)|[androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md)|Update the properties of an [androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md) object.|
|[Delete androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-delete.md)|None|Deletes an [androidDeviceOwnerDerivedCredentialAuthenticationConfiguration](../resources/androiddeviceownerderivedcredentialauthenticationconfiguration.md) object.|
|[assign](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceManagementDerivedCredentialSettings](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list-derivedcredentialsettings.md)|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md) collection|Get the deviceManagementDerivedCredentialSettings resources from the derivedCredentialSettings navigation property.|
|[Add deviceManagementDerivedCredentialSettings](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-post-derivedcredentialsettings.md)|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md)|Add derivedCredentialSettings by posting to the derivedCredentialSettings collection.|
|[List deviceSettingStateSummaries](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/androiddeviceownerderivedcredentialauthenticationconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

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
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|derivedCredentialSettings|[deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md)|Tenant level settings for the Derived Credentials to be used for authentication.|
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
  "@odata.type": "microsoft.graph.androidDeviceOwnerDerivedCredentialAuthenticationConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerDerivedCredentialAuthenticationConfiguration",
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

