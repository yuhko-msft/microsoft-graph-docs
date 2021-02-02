---
title: "windowsUpdateForBusinessConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windowsUpdateForBusinessConfiguration resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windowsUpdateForBusinessConfigurations](../api/windowsupdateforbusinessconfiguration-list.md)|[windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) collection|Get a list of the [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) objects and their properties.|
|[Create windowsUpdateForBusinessConfiguration](../api/windowsupdateforbusinessconfiguration-create.md)|[windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md)|Create a new [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object.|
|[Get windowsUpdateForBusinessConfiguration](../api/windowsupdateforbusinessconfiguration-get.md)|[windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md)|Read the properties and relationships of a [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object.|
|[Update windowsUpdateForBusinessConfiguration](../api/windowsupdateforbusinessconfiguration-update.md)|[windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md)|Update the properties of a [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object.|
|[Delete windowsUpdateForBusinessConfiguration](../api/windowsupdateforbusinessconfiguration-delete.md)|None|Deletes a [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|automaticUpdateMode|automaticUpdateMode|**TODO: Add Description**. Possible values are: `userDefined`, `notifyDownload`, `autoInstallAtMaintenanceTime`, `autoInstallAndRebootAtMaintenanceTime`, `autoInstallAndRebootAtScheduledTime`, `autoInstallAndRebootWithoutEndUserControl`, `windowsDefault`.|
|autoRestartNotificationDismissal|autoRestartNotificationDismissalMethod|**TODO: Add Description**. Possible values are: `notConfigured`, `automatic`, `user`.|
|businessReadyUpdatesOnly|windowsUpdateType|**TODO: Add Description**. Possible values are: `userDefined`, `all`, `businessReadyOnly`, `windowsInsiderBuildFast`, `windowsInsiderBuildSlow`, `windowsInsiderBuildRelease`.|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deadlineForFeatureUpdatesInDays|Int32|**TODO: Add Description**|
|deadlineForQualityUpdatesInDays|Int32|**TODO: Add Description**|
|deadlineGracePeriodInDays|Int32|**TODO: Add Description**|
|deliveryOptimizationMode|windowsDeliveryOptimizationMode|**TODO: Add Description**. Possible values are: `userDefined`, `httpOnly`, `httpWithPeeringNat`, `httpWithPeeringPrivateGroup`, `httpWithInternetPeering`, `simpleDownload`, `bypassMode`.|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|driversExcluded|Boolean|**TODO: Add Description**|
|engagedRestartDeadlineForFeatureUpdatesInDays|Int32|**TODO: Add Description**|
|engagedRestartDeadlineInDays|Int32|**TODO: Add Description**|
|engagedRestartSnoozeScheduleForFeatureUpdatesInDays|Int32|**TODO: Add Description**|
|engagedRestartSnoozeScheduleInDays|Int32|**TODO: Add Description**|
|engagedRestartTransitionScheduleForFeatureUpdatesInDays|Int32|**TODO: Add Description**|
|engagedRestartTransitionScheduleInDays|Int32|**TODO: Add Description**|
|featureUpdatesDeferralPeriodInDays|Int32|**TODO: Add Description**|
|featureUpdatesPaused|Boolean|**TODO: Add Description**|
|featureUpdatesPauseExpiryDateTime|DateTimeOffset|**TODO: Add Description**|
|featureUpdatesPauseStartDate|Date|**TODO: Add Description**|
|featureUpdatesRollbackStartDateTime|DateTimeOffset|**TODO: Add Description**|
|featureUpdatesRollbackWindowInDays|Int32|**TODO: Add Description**|
|featureUpdatesWillBeRolledBack|Boolean|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|installationSchedule|[windowsUpdateInstallScheduleType](../resources/intune-windowsupdateinstallscheduletype.md)|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|microsoftUpdateServiceAllowed|Boolean|**TODO: Add Description**|
|postponeRebootUntilAfterDeadline|Boolean|**TODO: Add Description**|
|prereleaseFeatures|prereleaseFeatures|**TODO: Add Description**. Possible values are: `userDefined`, `settingsOnly`, `settingsAndExperimentations`, `notAllowed`.|
|qualityUpdatesDeferralPeriodInDays|Int32|**TODO: Add Description**|
|qualityUpdatesPaused|Boolean|**TODO: Add Description**|
|qualityUpdatesPauseExpiryDateTime|DateTimeOffset|**TODO: Add Description**|
|qualityUpdatesPauseStartDate|Date|**TODO: Add Description**|
|qualityUpdatesRollbackStartDateTime|DateTimeOffset|**TODO: Add Description**|
|qualityUpdatesWillBeRolledBack|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|scenarioType|scenarioType|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md). Possible values are: `general`, `resourceAccess`.|
|scheduleImminentRestartWarningInMinutes|Int32|**TODO: Add Description**|
|scheduleRestartWarningInHours|Int32|**TODO: Add Description**|
|skipChecksBeforeRestart|Boolean|**TODO: Add Description**|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|updateNotificationLevel|windowsUpdateNotificationDisplayOption|**TODO: Add Description**. Possible values are: `notConfigured`, `defaultNotifications`, `restartWarningsOnly`, `disableAllNotifications`.|
|updateWeeks|windowsUpdateForBusinessUpdateWeeks|**TODO: Add Description**. Possible values are: `userDefined`, `firstWeek`, `secondWeek`, `thirdWeek`, `fourthWeek`, `everyWeek`.|
|userPauseAccess|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|userWindowsUpdateScanAccess|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceUpdateStates|[windowsUpdateState](../resources/intune-windowsupdatestate.md) collection|**TODO: Add Description**|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windowsUpdateForBusinessConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windowsUpdateForBusinessConfiguration",
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
  "deliveryOptimizationMode": "String",
  "prereleaseFeatures": "String",
  "automaticUpdateMode": "String",
  "microsoftUpdateServiceAllowed": "Boolean",
  "driversExcluded": "Boolean",
  "installationSchedule": {
    "@odata.type": "microsoft.graph.windowsUpdateInstallScheduleType"
  },
  "qualityUpdatesDeferralPeriodInDays": "Integer",
  "featureUpdatesDeferralPeriodInDays": "Integer",
  "qualityUpdatesPaused": "Boolean",
  "featureUpdatesPaused": "Boolean",
  "qualityUpdatesPauseExpiryDateTime": "String (timestamp)",
  "featureUpdatesPauseExpiryDateTime": "String (timestamp)",
  "businessReadyUpdatesOnly": "String",
  "skipChecksBeforeRestart": "Boolean",
  "updateWeeks": "String",
  "qualityUpdatesPauseStartDate": "Date",
  "featureUpdatesPauseStartDate": "Date",
  "featureUpdatesRollbackWindowInDays": "Integer",
  "qualityUpdatesWillBeRolledBack": "Boolean",
  "featureUpdatesWillBeRolledBack": "Boolean",
  "qualityUpdatesRollbackStartDateTime": "String (timestamp)",
  "featureUpdatesRollbackStartDateTime": "String (timestamp)",
  "engagedRestartDeadlineInDays": "Integer",
  "engagedRestartSnoozeScheduleInDays": "Integer",
  "engagedRestartTransitionScheduleInDays": "Integer",
  "engagedRestartDeadlineForFeatureUpdatesInDays": "Integer",
  "engagedRestartSnoozeScheduleForFeatureUpdatesInDays": "Integer",
  "engagedRestartTransitionScheduleForFeatureUpdatesInDays": "Integer",
  "deadlineForFeatureUpdatesInDays": "Integer",
  "deadlineForQualityUpdatesInDays": "Integer",
  "deadlineGracePeriodInDays": "Integer",
  "postponeRebootUntilAfterDeadline": "Boolean",
  "autoRestartNotificationDismissal": "String",
  "scheduleRestartWarningInHours": "Integer",
  "scheduleImminentRestartWarningInMinutes": "Integer",
  "userPauseAccess": "String",
  "userWindowsUpdateScanAccess": "String",
  "updateNotificationLevel": "String"
}
```

