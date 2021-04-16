---
title: "windowsKioskConfiguration resource type"
description: "This entity provides descriptions of the declared methods, properties and relationships exposed by the kiosk resource."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsKioskConfiguration resource type

Namespace: microsoft.graph



This entity provides descriptions of the declared methods, properties and relationships exposed by the kiosk resource.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsKioskConfigurations](../api/windowskioskconfiguration-list.md)|[windowsKioskConfiguration](../resources/windowskioskconfiguration.md) collection|Get a list of the [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) objects and their properties.|
|[Create windowsKioskConfiguration](../api/windowskioskconfiguration-create.md)|[windowsKioskConfiguration](../resources/windowskioskconfiguration.md)|Create a new [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.|
|[Get windowsKioskConfiguration](../api/windowskioskconfiguration-get.md)|[windowsKioskConfiguration](../resources/windowskioskconfiguration.md)|Read the properties and relationships of a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.|
|[Update windowsKioskConfiguration](../api/windowskioskconfiguration-update.md)|[windowsKioskConfiguration](../resources/windowskioskconfiguration.md)|Update the properties of a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.|
|[Delete windowsKioskConfiguration](../api/windowskioskconfiguration-delete.md)|None|Deletes a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.|
|[assign](../api/windowskioskconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/windowskioskconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/windowskioskconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/windowskioskconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/windowskioskconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/windowskioskconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/windowskioskconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/windowskioskconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/windowskioskconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/windowskioskconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/windowskioskconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/windowskioskconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/windowskioskconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List userStatuses](../api/windowskioskconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/windowskioskconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/windowskioskconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/windowskioskconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|edgeKioskEnablePublicBrowsing|Boolean|Enable public browsing kiosk mode for the Microsoft Edge browser. The Default is false.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|kioskBrowserBlockedUrlExceptions|String collection|Specify URLs that the kiosk browser is allowed to navigate to|
|kioskBrowserBlockedURLs|String collection|Specify URLs that the kiosk browsers should not navigate to|
|kioskBrowserDefaultUrl|String|Specify the default URL the browser should navigate to on launch.|
|kioskBrowserEnableEndSessionButton|Boolean|Enable the kiosk browser's end session button. By default, the end session button is disabled.|
|kioskBrowserEnableHomeButton|Boolean|Enable the kiosk browser's home button. By default, the home button is disabled.|
|kioskBrowserEnableNavigationButtons|Boolean|Enable the kiosk browser's navigation buttons(forward/back). By default, the navigation buttons are disabled.|
|kioskBrowserRestartOnIdleTimeInMinutes|Int32|Specify the number of minutes the session is idle until the kiosk browser restarts in a fresh state.  Valid values are 1-1440. Valid values 1 to 1440|
|kioskProfiles|[windowsKioskProfile](../resources/windowskioskprofile.md) collection|This policy setting allows to define a list of Kiosk profiles for a Kiosk configuration. This collection can contain a maximum of 3 elements.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|windowsKioskForceUpdateSchedule|[windowsKioskForceUpdateSchedule](../resources/windowskioskforceupdateschedule.md)|force update schedule for Kiosk devices.|

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
  "@odata.type": "microsoft.graph.windowsKioskConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsKioskConfiguration",
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
  "edgeKioskEnablePublicBrowsing": "Boolean",
  "kioskBrowserBlockedUrlExceptions": [
    "String"
  ],
  "kioskBrowserBlockedURLs": [
    "String"
  ],
  "kioskBrowserDefaultUrl": "String",
  "kioskBrowserEnableEndSessionButton": "Boolean",
  "kioskBrowserEnableHomeButton": "Boolean",
  "kioskBrowserEnableNavigationButtons": "Boolean",
  "kioskBrowserRestartOnIdleTimeInMinutes": "Integer",
  "kioskProfiles": [
    {
      "@odata.type": "microsoft.graph.windowsKioskProfile"
    }
  ],
  "windowsKioskForceUpdateSchedule": {
    "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
  }
}
```

