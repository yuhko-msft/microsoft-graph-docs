---
title: "Create windowsUpdateForBusinessConfiguration"
description: "Create a new windowsUpdateForBusinessConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsUpdateForBusinessConfiguration
Namespace: microsoft.graph



Create a new [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
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
POST ** Collection URI for microsoft.graph.windowsUpdateForBusinessConfiguration not found
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
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|automaticUpdateMode|automaticUpdateMode|Automatic update mode. Possible values are: `userDefined`, `notifyDownload`, `autoInstallAtMaintenanceTime`, `autoInstallAndRebootAtMaintenanceTime`, `autoInstallAndRebootAtScheduledTime`, `autoInstallAndRebootWithoutEndUserControl`, `windowsDefault`.|
|autoRestartNotificationDismissal|autoRestartNotificationDismissalMethod|Specify the method by which the auto-restart required notification is dismissed. Possible values are: `notConfigured`, `automatic`, `user`.|
|businessReadyUpdatesOnly|windowsUpdateType|Determines which branch devices will receive their updates from. Possible values are: `userDefined`, `all`, `businessReadyOnly`, `windowsInsiderBuildFast`, `windowsInsiderBuildSlow`, `windowsInsiderBuildRelease`.|
|deadlineForFeatureUpdatesInDays|Int32|Number of days before feature updates are installed automatically with valid range from 2 to 30 days|
|deadlineForQualityUpdatesInDays|Int32|Number of days before quality updates are installed automatically with valid range from 2 to 30 days|
|deadlineGracePeriodInDays|Int32|Number of days after deadline  until restarts occur automatically with valid range from 0 to 7 days|
|deliveryOptimizationMode|windowsDeliveryOptimizationMode|Delivery Optimization Mode. Possible values are: `userDefined`, `httpOnly`, `httpWithPeeringNat`, `httpWithPeeringPrivateGroup`, `httpWithInternetPeering`, `simpleDownload`, `bypassMode`.|
|driversExcluded|Boolean|Exclude Windows update Drivers|
|engagedRestartDeadlineInDays|Int32|Deadline in days before automatically scheduling and executing a pending restart outside of active hours, with valid range from 2 to 30 days|
|engagedRestartSnoozeScheduleInDays|Int32|Number of days a user can snooze Engaged Restart reminder notifications with valid range from 1 to 3 days|
|engagedRestartTransitionScheduleInDays|Int32|Number of days before transitioning from Auto Restarts scheduled outside of active hours to Engaged Restart, which requires the user to schedule, with valid range from 0 to 30 days|
|featureUpdatesDeferralPeriodInDays|Int32|Defer Feature Updates by these many days|
|featureUpdatesPaused|Boolean|Pause Feature Updates|
|featureUpdatesPauseExpiryDateTime|DateTimeOffset|Feature Updates Pause Expiry datetime|
|featureUpdatesPauseStartDate|Date|Feature Updates Pause start date. This property is read-only.|
|featureUpdatesRollbackStartDateTime|DateTimeOffset|Feature Updates Rollback Start datetime|
|featureUpdatesRollbackWindowInDays|Int32|The number of days after a Feature Update for which a rollback is valid|
|featureUpdatesWillBeRolledBack|Boolean|Specifies whether to rollback Feature Updates on the next device check in|
|installationSchedule|[windowsUpdateInstallScheduleType](../resources/windowsupdateinstallscheduletype.md)|Installation schedule|
|microsoftUpdateServiceAllowed|Boolean|Allow Microsoft Update Service|
|postponeRebootUntilAfterDeadline|Boolean|Specifies if the device should wait until deadline for rebooting outside of active hours|
|prereleaseFeatures|prereleaseFeatures|The pre-release features. Possible values are: `userDefined`, `settingsOnly`, `settingsAndExperimentations`, `notAllowed`.|
|qualityUpdatesDeferralPeriodInDays|Int32|Defer Quality Updates by these many days|
|qualityUpdatesPaused|Boolean|Pause Quality Updates|
|qualityUpdatesPauseExpiryDateTime|DateTimeOffset|Quality Updates Pause Expiry datetime|
|qualityUpdatesPauseStartDate|Date|Quality Updates Pause start date. This property is read-only.|
|qualityUpdatesRollbackStartDateTime|DateTimeOffset|Quality Updates Rollback Start datetime|
|qualityUpdatesWillBeRolledBack|Boolean|Specifies whether to rollback Quality Updates on the next device check in|
|scheduleImminentRestartWarningInMinutes|Int32|Specify the period for auto-restart imminent warning notifications. Supported values: 15, 30 or 60 (minutes).|
|scheduleRestartWarningInHours|Int32|Specify the period for auto-restart warning reminder notifications. Supported values: 2, 4, 8, 12 or 24 (hours).|
|skipChecksBeforeRestart|Boolean|Set to skip all check before restart: Battery level = 40%, User presence, Display Needed, Presentation mode, Full screen mode, phone call state, game mode etc. |
|updateNotificationLevel|windowsUpdateNotificationDisplayOption|Specifies what Windows Update notifications users see. Possible values are: `notConfigured`, `defaultNotifications`, `restartWarningsOnly`, `disableAllNotifications`.|
|updateWeeks|windowsUpdateForBusinessUpdateWeeks|Scheduled the update installation on the weeks of the month. Possible values are: `userDefined`, `firstWeek`, `secondWeek`, `thirdWeek`, `fourthWeek`, `everyWeek`.|
|userPauseAccess|enablement|Specifies whether to enable end user’s access to pause software updates. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|userWindowsUpdateScanAccess|enablement|Specifies whether to disable user’s access to scan Windows Update. Possible values are: `notConfigured`, `enabled`, `disabled`.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsupdateforbusinessconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windowsUpdateForBusinessConfiguration not found
Content-Type: application/json
Content-length: 2343

{
  "@odata.type": "#microsoft.graph.windowsUpdateForBusinessConfiguration",
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
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "automaticUpdateMode": "String",
  "autoRestartNotificationDismissal": "String",
  "businessReadyUpdatesOnly": "String",
  "deadlineForFeatureUpdatesInDays": "Integer",
  "deadlineForQualityUpdatesInDays": "Integer",
  "deadlineGracePeriodInDays": "Integer",
  "deliveryOptimizationMode": "String",
  "driversExcluded": "Boolean",
  "engagedRestartDeadlineInDays": "Integer",
  "engagedRestartSnoozeScheduleInDays": "Integer",
  "engagedRestartTransitionScheduleInDays": "Integer",
  "featureUpdatesDeferralPeriodInDays": "Integer",
  "featureUpdatesPaused": "Boolean",
  "featureUpdatesPauseExpiryDateTime": "String (timestamp)",
  "featureUpdatesPauseStartDate": "Date",
  "featureUpdatesRollbackStartDateTime": "String (timestamp)",
  "featureUpdatesRollbackWindowInDays": "Integer",
  "featureUpdatesWillBeRolledBack": "Boolean",
  "installationSchedule": {
    "@odata.type": "microsoft.graph.windowsUpdateInstallScheduleType"
  },
  "microsoftUpdateServiceAllowed": "Boolean",
  "postponeRebootUntilAfterDeadline": "Boolean",
  "prereleaseFeatures": "String",
  "qualityUpdatesDeferralPeriodInDays": "Integer",
  "qualityUpdatesPaused": "Boolean",
  "qualityUpdatesPauseExpiryDateTime": "String (timestamp)",
  "qualityUpdatesPauseStartDate": "Date",
  "qualityUpdatesRollbackStartDateTime": "String (timestamp)",
  "qualityUpdatesWillBeRolledBack": "Boolean",
  "scheduleImminentRestartWarningInMinutes": "Integer",
  "scheduleRestartWarningInHours": "Integer",
  "skipChecksBeforeRestart": "Boolean",
  "updateNotificationLevel": "String",
  "updateWeeks": "String",
  "userPauseAccess": "String",
  "userWindowsUpdateScanAccess": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsUpdateForBusinessConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsUpdateForBusinessConfiguration",
  "id": "dc2b0a10-0a10-dc2b-100a-2bdc100a2bdc",
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
  "automaticUpdateMode": "String",
  "autoRestartNotificationDismissal": "String",
  "businessReadyUpdatesOnly": "String",
  "deadlineForFeatureUpdatesInDays": "Integer",
  "deadlineForQualityUpdatesInDays": "Integer",
  "deadlineGracePeriodInDays": "Integer",
  "deliveryOptimizationMode": "String",
  "driversExcluded": "Boolean",
  "engagedRestartDeadlineInDays": "Integer",
  "engagedRestartSnoozeScheduleInDays": "Integer",
  "engagedRestartTransitionScheduleInDays": "Integer",
  "featureUpdatesDeferralPeriodInDays": "Integer",
  "featureUpdatesPaused": "Boolean",
  "featureUpdatesPauseExpiryDateTime": "String (timestamp)",
  "featureUpdatesPauseStartDate": "Date",
  "featureUpdatesRollbackStartDateTime": "String (timestamp)",
  "featureUpdatesRollbackWindowInDays": "Integer",
  "featureUpdatesWillBeRolledBack": "Boolean",
  "installationSchedule": {
    "@odata.type": "microsoft.graph.windowsUpdateInstallScheduleType"
  },
  "microsoftUpdateServiceAllowed": "Boolean",
  "postponeRebootUntilAfterDeadline": "Boolean",
  "prereleaseFeatures": "String",
  "qualityUpdatesDeferralPeriodInDays": "Integer",
  "qualityUpdatesPaused": "Boolean",
  "qualityUpdatesPauseExpiryDateTime": "String (timestamp)",
  "qualityUpdatesPauseStartDate": "Date",
  "qualityUpdatesRollbackStartDateTime": "String (timestamp)",
  "qualityUpdatesWillBeRolledBack": "Boolean",
  "scheduleImminentRestartWarningInMinutes": "Integer",
  "scheduleRestartWarningInHours": "Integer",
  "skipChecksBeforeRestart": "Boolean",
  "updateNotificationLevel": "String",
  "updateWeeks": "String",
  "userPauseAccess": "String",
  "userWindowsUpdateScanAccess": "String"
}
```

