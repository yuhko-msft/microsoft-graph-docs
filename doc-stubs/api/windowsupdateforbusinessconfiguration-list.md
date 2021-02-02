---
title: "List windowsUpdateForBusinessConfigurations"
description: "Get a list of the windowsUpdateForBusinessConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windowsUpdateForBusinessConfigurations
Namespace: microsoft.graph

Get a list of the [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.windowsUpdateForBusinessConfiguration not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a collection of [windowsUpdateForBusinessConfiguration](../resources/windowsupdateforbusinessconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_windowsupdateforbusinessconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windowsUpdateForBusinessConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.windowsUpdateForBusinessConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.windowsUpdateForBusinessConfiguration",
      "id": "fe78fd2a-fd2a-fe78-2afd-78fe2afd78fe",
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
  ]
}
```

