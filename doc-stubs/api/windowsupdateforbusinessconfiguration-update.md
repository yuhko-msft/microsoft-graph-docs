---
title: "Update windowsUpdateForBusinessConfiguration"
description: "Update the properties of a windowsUpdateForBusinessConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windowsUpdateForBusinessConfiguration
Namespace: microsoft.graph

Update the properties of a [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH ** Entity URI for microsoft.graph.windowsUpdateForBusinessConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object.

The following table shows the properties that are required when you create the [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deliveryOptimizationMode|windowsDeliveryOptimizationMode|**TODO: Add Description**. Possible values are: `userDefined`, `httpOnly`, `httpWithPeeringNat`, `httpWithPeeringPrivateGroup`, `httpWithInternetPeering`, `simpleDownload`, `bypassMode`.|
|prereleaseFeatures|prereleaseFeatures|**TODO: Add Description**. Possible values are: `userDefined`, `settingsOnly`, `settingsAndExperimentations`, `notAllowed`.|
|automaticUpdateMode|automaticUpdateMode|**TODO: Add Description**. Possible values are: `userDefined`, `notifyDownload`, `autoInstallAtMaintenanceTime`, `autoInstallAndRebootAtMaintenanceTime`, `autoInstallAndRebootAtScheduledTime`, `autoInstallAndRebootWithoutEndUserControl`, `windowsDefault`.|
|microsoftUpdateServiceAllowed|Boolean|**TODO: Add Description**|
|driversExcluded|Boolean|**TODO: Add Description**|
|installationSchedule|[windowsUpdateInstallScheduleType](../resources/intune-windowsupdateinstallscheduletype.md)|**TODO: Add Description**|
|qualityUpdatesDeferralPeriodInDays|Int32|**TODO: Add Description**|
|featureUpdatesDeferralPeriodInDays|Int32|**TODO: Add Description**|
|qualityUpdatesPaused|Boolean|**TODO: Add Description**|
|featureUpdatesPaused|Boolean|**TODO: Add Description**|
|qualityUpdatesPauseExpiryDateTime|DateTimeOffset|**TODO: Add Description**|
|featureUpdatesPauseExpiryDateTime|DateTimeOffset|**TODO: Add Description**|
|businessReadyUpdatesOnly|windowsUpdateType|**TODO: Add Description**. Possible values are: `userDefined`, `all`, `businessReadyOnly`, `windowsInsiderBuildFast`, `windowsInsiderBuildSlow`, `windowsInsiderBuildRelease`.|
|skipChecksBeforeRestart|Boolean|**TODO: Add Description**|
|updateWeeks|windowsUpdateForBusinessUpdateWeeks|**TODO: Add Description**. Possible values are: `userDefined`, `firstWeek`, `secondWeek`, `thirdWeek`, `fourthWeek`, `everyWeek`.|
|qualityUpdatesPauseStartDate|Date|**TODO: Add Description**|
|featureUpdatesPauseStartDate|Date|**TODO: Add Description**|
|featureUpdatesRollbackWindowInDays|Int32|**TODO: Add Description**|
|qualityUpdatesWillBeRolledBack|Boolean|**TODO: Add Description**|
|featureUpdatesWillBeRolledBack|Boolean|**TODO: Add Description**|
|qualityUpdatesRollbackStartDateTime|DateTimeOffset|**TODO: Add Description**|
|featureUpdatesRollbackStartDateTime|DateTimeOffset|**TODO: Add Description**|
|engagedRestartDeadlineInDays|Int32|**TODO: Add Description**|
|engagedRestartSnoozeScheduleInDays|Int32|**TODO: Add Description**|
|engagedRestartTransitionScheduleInDays|Int32|**TODO: Add Description**|
|deadlineForFeatureUpdatesInDays|Int32|**TODO: Add Description**|
|deadlineForQualityUpdatesInDays|Int32|**TODO: Add Description**|
|deadlineGracePeriodInDays|Int32|**TODO: Add Description**|
|postponeRebootUntilAfterDeadline|Boolean|**TODO: Add Description**|
|autoRestartNotificationDismissal|autoRestartNotificationDismissalMethod|**TODO: Add Description**. Possible values are: `notConfigured`, `automatic`, `user`.|
|scheduleRestartWarningInHours|Int32|**TODO: Add Description**|
|scheduleImminentRestartWarningInMinutes|Int32|**TODO: Add Description**|
|userPauseAccess|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|userWindowsUpdateScanAccess|enablement|**TODO: Add Description**. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|updateNotificationLevel|windowsUpdateNotificationDisplayOption|**TODO: Add Description**. Possible values are: `notConfigured`, `defaultNotifications`, `restartWarningsOnly`, `disableAllNotifications`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windowsupdateforbusinessconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsUpdateForBusinessConfiguration not found
Content-Type: application/json
Content-length: 2343

{
  "@odata.type": "#microsoft.graph.windowsUpdateForBusinessConfiguration",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.windowsUpdateForBusinessConfiguration",
  "id": "c31c3351-3351-c31c-5133-1cc351331cc3",
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

