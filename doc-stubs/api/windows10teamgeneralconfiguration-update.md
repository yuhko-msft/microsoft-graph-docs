---
title: "Update windows10TeamGeneralConfiguration"
description: "Update the properties of a windows10TeamGeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windows10TeamGeneralConfiguration
Namespace: microsoft.graph

Update the properties of a [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windows10TeamGeneralConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object.

The following table shows the properties that are required when you create the [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md).

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
|azureOperationalInsightsBlockTelemetry|Boolean|**TODO: Add Description**|
|azureOperationalInsightsWorkspaceId|String|**TODO: Add Description**|
|azureOperationalInsightsWorkspaceKey|String|**TODO: Add Description**|
|connectAppBlockAutoLaunch|Boolean|**TODO: Add Description**|
|maintenanceWindowBlocked|Boolean|**TODO: Add Description**|
|maintenanceWindowDurationInHours|Int32|**TODO: Add Description**|
|maintenanceWindowStartTime|TimeOfDay|**TODO: Add Description**|
|miracastChannel|miracastChannel|**TODO: Add Description**. Possible values are: `userDefined`, `one`, `two`, `three`, `four`, `five`, `six`, `seven`, `eight`, `nine`, `ten`, `eleven`, `thirtySix`, `forty`, `fortyFour`, `fortyEight`, `oneHundredFortyNine`, `oneHundredFiftyThree`, `oneHundredFiftySeven`, `oneHundredSixtyOne`, `oneHundredSixtyFive`.|
|miracastBlocked|Boolean|**TODO: Add Description**|
|miracastRequirePin|Boolean|**TODO: Add Description**|
|settingsBlockMyMeetingsAndFiles|Boolean|**TODO: Add Description**|
|settingsBlockSessionResume|Boolean|**TODO: Add Description**|
|settingsBlockSigninSuggestions|Boolean|**TODO: Add Description**|
|settingsDefaultVolume|Int32|**TODO: Add Description**|
|settingsScreenTimeoutInMinutes|Int32|**TODO: Add Description**|
|settingsSessionTimeoutInMinutes|Int32|**TODO: Add Description**|
|settingsSleepTimeoutInMinutes|Int32|**TODO: Add Description**|
|welcomeScreenBlockAutomaticWakeUp|Boolean|**TODO: Add Description**|
|welcomeScreenBackgroundImageUrl|String|**TODO: Add Description**|
|welcomeScreenMeetingInformation|welcomeScreenMeetingInformation|**TODO: Add Description**. Possible values are: `userDefined`, `showOrganizerAndTimeOnly`, `showOrganizerAndTimeAndSubject`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windows10teamgeneralconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windows10TeamGeneralConfiguration not found
Content-Type: application/json
Content-length: 1576

{
  "@odata.type": "#microsoft.graph.windows10TeamGeneralConfiguration",
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
  "azureOperationalInsightsBlockTelemetry": "Boolean",
  "azureOperationalInsightsWorkspaceId": "String",
  "azureOperationalInsightsWorkspaceKey": "String",
  "connectAppBlockAutoLaunch": "Boolean",
  "maintenanceWindowBlocked": "Boolean",
  "maintenanceWindowDurationInHours": "Integer",
  "maintenanceWindowStartTime": "String (time of day)",
  "miracastChannel": "String",
  "miracastBlocked": "Boolean",
  "miracastRequirePin": "Boolean",
  "settingsBlockMyMeetingsAndFiles": "Boolean",
  "settingsBlockSessionResume": "Boolean",
  "settingsBlockSigninSuggestions": "Boolean",
  "settingsDefaultVolume": "Integer",
  "settingsScreenTimeoutInMinutes": "Integer",
  "settingsSessionTimeoutInMinutes": "Integer",
  "settingsSleepTimeoutInMinutes": "Integer",
  "welcomeScreenBlockAutomaticWakeUp": "Boolean",
  "welcomeScreenBackgroundImageUrl": "String",
  "welcomeScreenMeetingInformation": "String"
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
  "@odata.type": "#microsoft.graph.windows10TeamGeneralConfiguration",
  "id": "fa24aa6d-aa6d-fa24-6daa-24fa6daa24fa",
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
  "azureOperationalInsightsBlockTelemetry": "Boolean",
  "azureOperationalInsightsWorkspaceId": "String",
  "azureOperationalInsightsWorkspaceKey": "String",
  "connectAppBlockAutoLaunch": "Boolean",
  "maintenanceWindowBlocked": "Boolean",
  "maintenanceWindowDurationInHours": "Integer",
  "maintenanceWindowStartTime": "String (time of day)",
  "miracastChannel": "String",
  "miracastBlocked": "Boolean",
  "miracastRequirePin": "Boolean",
  "settingsBlockMyMeetingsAndFiles": "Boolean",
  "settingsBlockSessionResume": "Boolean",
  "settingsBlockSigninSuggestions": "Boolean",
  "settingsDefaultVolume": "Integer",
  "settingsScreenTimeoutInMinutes": "Integer",
  "settingsSessionTimeoutInMinutes": "Integer",
  "settingsSleepTimeoutInMinutes": "Integer",
  "welcomeScreenBlockAutomaticWakeUp": "Boolean",
  "welcomeScreenBackgroundImageUrl": "String",
  "welcomeScreenMeetingInformation": "String"
}
```

