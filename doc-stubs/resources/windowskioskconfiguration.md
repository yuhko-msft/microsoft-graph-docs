---
title: "windowsKioskConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsKioskConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsKioskConfigurations](../api/windowskioskconfiguration-list.md)|[windowsKioskConfiguration](../resources/windowskioskconfiguration.md) collection|Get a list of the [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) objects and their properties.|
|[Create windowsKioskConfiguration](../api/windowskioskconfiguration-create.md)|[windowsKioskConfiguration](../resources/windowskioskconfiguration.md)|Create a new [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.|
|[Get windowsKioskConfiguration](../api/windowskioskconfiguration-get.md)|[windowsKioskConfiguration](../resources/windowskioskconfiguration.md)|Read the properties and relationships of a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.|
|[Update windowsKioskConfiguration](../api/windowskioskconfiguration-update.md)|[windowsKioskConfiguration](../resources/windowskioskconfiguration.md)|Update the properties of a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.|
|[Delete windowsKioskConfiguration](../api/windowskioskconfiguration-delete.md)|None|Deletes a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|edgeKioskEnablePublicBrowsing|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|kioskBrowserBlockedUrlExceptions|String collection|**TODO: Add Description**|
|kioskBrowserBlockedURLs|String collection|**TODO: Add Description**|
|kioskBrowserDefaultUrl|String|**TODO: Add Description**|
|kioskBrowserEnableEndSessionButton|Boolean|**TODO: Add Description**|
|kioskBrowserEnableHomeButton|Boolean|**TODO: Add Description**|
|kioskBrowserEnableNavigationButtons|Boolean|**TODO: Add Description**|
|kioskBrowserRestartOnIdleTimeInMinutes|Int32|**TODO: Add Description**|
|kioskProfiles|[windowsKioskProfile](../resources/intune-windowskioskprofile.md) collection|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|scenarioType|scenarioType|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Possible values are: `general`, `resourceAccess`.|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|windowsKioskForceUpdateSchedule|[windowsKioskForceUpdateSchedule](../resources/intune-windowskioskforceupdateschedule.md)|**TODO: Add Description**|
|windowsKioskShellLauncherEdgeKioskType|windowsEdgeKioskType|**TODO: Add Description**. Possible values are: `publicBrowsing`, `fullScreen`.|
|windowsKioskShellLauncherEdgeKioskUrl|String|**TODO: Add Description**|
|windowsKioskShellLauncherEdgeNoFirstRun|Boolean|**TODO: Add Description**|
|windowsKioskShellLauncherIdleTimeoutMinutes|Int32|**TODO: Add Description**|
|windowsKioskShellLauncherShell|String|**TODO: Add Description**|

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
  "@odata.type": "microsoft.graph.windowsKioskConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsKioskConfiguration",
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
  "kioskProfiles": [
    {
      "@odata.type": "microsoft.graph.windowsKioskProfile"
    }
  ],
  "kioskBrowserDefaultUrl": "String",
  "kioskBrowserEnableHomeButton": "Boolean",
  "kioskBrowserEnableNavigationButtons": "Boolean",
  "kioskBrowserEnableEndSessionButton": "Boolean",
  "kioskBrowserRestartOnIdleTimeInMinutes": "Integer",
  "kioskBrowserBlockedURLs": [
    "String"
  ],
  "kioskBrowserBlockedUrlExceptions": [
    "String"
  ],
  "edgeKioskEnablePublicBrowsing": "Boolean",
  "windowsKioskForceUpdateSchedule": {
    "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
  },
  "windowsKioskShellLauncherShell": "String",
  "windowsKioskShellLauncherIdleTimeoutMinutes": "Integer",
  "windowsKioskShellLauncherEdgeNoFirstRun": "Boolean",
  "windowsKioskShellLauncherEdgeKioskType": "String",
  "windowsKioskShellLauncherEdgeKioskUrl": "String"
}
```

