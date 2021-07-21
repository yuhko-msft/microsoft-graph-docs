---
title: "Create windows10TeamGeneralConfiguration"
description: "Create a new windows10TeamGeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows10TeamGeneralConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.windows10TeamGeneralConfiguration not found
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
|azureOperationalInsightsBlockTelemetry|Boolean|Indicates whether or not to Block Azure Operational Insights.|
|azureOperationalInsightsWorkspaceId|String|The Azure Operational Insights workspace id.|
|azureOperationalInsightsWorkspaceKey|String|The Azure Operational Insights Workspace key.|
|connectAppBlockAutoLaunch|Boolean|Specifies whether to automatically launch the Connect app whenever a projection is initiated.|
|maintenanceWindowBlocked|Boolean|Indicates whether or not to Block setting a maintenance window for device updates.|
|maintenanceWindowDurationInHours|Int32|Maintenance window duration for device updates. Valid values 0 to 5|
|maintenanceWindowStartTime|TimeOfDay|Maintenance window start time for device updates.|
|miracastBlocked|Boolean|Indicates whether or not to Block wireless projection.|
|miracastChannel|miracastChannel|The channel. Possible values are: `userDefined`, `one`, `two`, `three`, `four`, `five`, `six`, `seven`, `eight`, `nine`, `ten`, `eleven`, `thirtySix`, `forty`, `fortyFour`, `fortyEight`, `oneHundredFortyNine`, `oneHundredFiftyThree`, `oneHundredFiftySeven`, `oneHundredSixtyOne`, `oneHundredSixtyFive`.|
|miracastRequirePin|Boolean|Indicates whether or not to require a pin for wireless projection.|
|settingsBlockMyMeetingsAndFiles|Boolean|Specifies whether to disable t shows the signed-in user's meetings and files from Office 365.|
|settingsBlockSessionResume|Boolean|Specifies whether to allow the ability to resume a session when the session times out.|
|settingsBlockSigninSuggestions|Boolean|Specifies whether to disable auto-populating of the sign-in dialog with invitees from scheduled meetings.|
|settingsDefaultVolume|Int32|Specifies the default volume value for a new session. Permitted values are 0-100. The default is 45. Valid values 0 to 100|
|settingsScreenTimeoutInMinutes|Int32|Specifies the number of minutes until the Hub screen turns off.|
|settingsSessionTimeoutInMinutes|Int32|Specifies the number of minutes until the session times out.|
|settingsSleepTimeoutInMinutes|Int32|Specifies the number of minutes until the Hub enters sleep mode.|
|welcomeScreenBackgroundImageUrl|String|The welcome screen background image URL. The URL must use the HTTPS protocol and return a PNG image.|
|welcomeScreenBlockAutomaticWakeUp|Boolean|Indicates whether or not to Block the welcome screen from waking up automatically when someone enters the room.|
|welcomeScreenMeetingInformation|welcomeScreenMeetingInformation|The welcome screen meeting information shown. Possible values are: `userDefined`, `showOrganizerAndTimeOnly`, `showOrganizerAndTimeAndSubject`.|



## Response

If successful, this method returns a `201 Created` response code and a [windows10TeamGeneralConfiguration](../resources/windows10teamgeneralconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows10teamgeneralconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windows10TeamGeneralConfiguration not found
Content-Type: application/json
Content-length: 1576

{
  "@odata.type": "#microsoft.graph.windows10TeamGeneralConfiguration",
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


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10TeamGeneralConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows10TeamGeneralConfiguration",
  "id": "318eb44a-b44a-318e-4ab4-8e314ab48e31",
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

