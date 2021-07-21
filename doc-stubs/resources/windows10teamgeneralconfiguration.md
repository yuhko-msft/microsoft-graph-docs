---
title: "windows10TeamGeneralConfiguration resource type"
description: "This topic provides descriptions of the declared methods, properties and relationships exposed by the windows10TeamGeneralConfiguration resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10TeamGeneralConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This topic provides descriptions of the declared methods, properties and relationships exposed by the windows10TeamGeneralConfiguration resource.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10TeamGeneralConfiguration](../api/windows10teamgeneralconfiguration-list.md)|[windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) collection|Get a list of the [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) objects and their properties.|
|[Create windows10TeamGeneralConfiguration](../api/windows10teamgeneralconfiguration-create.md)|[windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md)|Create a new [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object.|
|[Get windows10TeamGeneralConfiguration](../api/windows10teamgeneralconfiguration-get.md)|[windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md)|Read the properties and relationships of a [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object.|
|[Update windows10TeamGeneralConfiguration](../api/windows10teamgeneralconfiguration-update.md)|[windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md)|Update the properties of a [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object.|
|[Delete windows10TeamGeneralConfiguration](../api/windows10teamgeneralconfiguration-delete.md)|None|Deletes a [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object.|
|[assign](../api/windows10teamgeneralconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/windows10teamgeneralconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/windows10teamgeneralconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[getOmaSettingPlainTextValue](../api/windows10teamgeneralconfiguration-getomasettingplaintextvalue.md)|String|**TODO: Add Description**|
|[List assignments](../api/windows10teamgeneralconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windows10teamgeneralconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windows10teamgeneralconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windows10teamgeneralconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windows10teamgeneralconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windows10teamgeneralconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windows10teamgeneralconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windows10teamgeneralconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windows10teamgeneralconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windows10teamgeneralconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/windows10teamgeneralconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windows10teamgeneralconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windows10teamgeneralconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windows10teamgeneralconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|azureOperationalInsightsBlockTelemetry|Boolean|Indicates whether or not to Block Azure Operational Insights.|
|azureOperationalInsightsWorkspaceId|String|The Azure Operational Insights workspace id.|
|azureOperationalInsightsWorkspaceKey|String|The Azure Operational Insights Workspace key.|
|connectAppBlockAutoLaunch|Boolean|Specifies whether to automatically launch the Connect app whenever a projection is initiated.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|maintenanceWindowBlocked|Boolean|Indicates whether or not to Block setting a maintenance window for device updates.|
|maintenanceWindowDurationInHours|Int32|Maintenance window duration for device updates. Valid values 0 to 5|
|maintenanceWindowStartTime|TimeOfDay|Maintenance window start time for device updates.|
|miracastBlocked|Boolean|Indicates whether or not to Block wireless projection.|
|miracastChannel|miracastChannel|The channel. Possible values are: `userDefined`, `one`, `two`, `three`, `four`, `five`, `six`, `seven`, `eight`, `nine`, `ten`, `eleven`, `thirtySix`, `forty`, `fortyFour`, `fortyEight`, `oneHundredFortyNine`, `oneHundredFiftyThree`, `oneHundredFiftySeven`, `oneHundredSixtyOne`, `oneHundredSixtyFive`.|
|miracastRequirePin|Boolean|Indicates whether or not to require a pin for wireless projection.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|settingsBlockMyMeetingsAndFiles|Boolean|Specifies whether to disable t shows the signed-in user's meetings and files from Office 365.|
|settingsBlockSessionResume|Boolean|Specifies whether to allow the ability to resume a session when the session times out.|
|settingsBlockSigninSuggestions|Boolean|Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.|
|settingsDefaultVolume|Int32|Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100|
|settingsScreenTimeoutInMinutes|Int32|Specifies the number of minutes until the Hub screen turns off.|
|settingsSessionTimeoutInMinutes|Int32|Specifies the number of minutes until the session times out.|
|settingsSleepTimeoutInMinutes|Int32|Specifies the number of minutes until the Hub enters sleep mode.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md).|
|welcomeScreenBackgroundImageUrl|String|The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.|
|welcomeScreenBlockAutomaticWakeUp|Boolean|Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.|
|welcomeScreenMeetingInformation|welcomeScreenMeetingInformation|The welcome screen meeting information shown. Possible values are: `userDefined`, `showOrganizerAndTimeOnly`, `showOrganizerAndTimeAndSubject`.|

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
  "@odata.type": "microsoft.graph.windows10TeamGeneralConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10TeamGeneralConfiguration",
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
  "azureOperationalInsightsBlockTelemetry": "Boolean",
  "azureOperationalInsightsWorkspaceId": "String",
  "azureOperationalInsightsWorkspaceKey": "String",
  "connectAppBlockAutoLaunch": "Boolean",
  "maintenanceWindowBlocked": "Boolean",
  "maintenanceWindowDurationInHours": "Integer",
  "maintenanceWindowStartTime": "String (time of day)",
  "miracastBlocked": "Boolean",
  "miracastChannel": "String",
  "miracastRequirePin": "Boolean",
  "settingsBlockMyMeetingsAndFiles": "Boolean",
  "settingsBlockSessionResume": "Boolean",
  "settingsBlockSigninSuggestions": "Boolean",
  "settingsDefaultVolume": "Integer",
  "settingsScreenTimeoutInMinutes": "Integer",
  "settingsSessionTimeoutInMinutes": "Integer",
  "settingsSleepTimeoutInMinutes": "Integer",
  "welcomeScreenBackgroundImageUrl": "String",
  "welcomeScreenBlockAutomaticWakeUp": "Boolean",
  "welcomeScreenMeetingInformation": "String"
}
```

