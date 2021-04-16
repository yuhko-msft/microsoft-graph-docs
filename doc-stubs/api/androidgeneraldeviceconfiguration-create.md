---
title: "Create androidGeneralDeviceConfiguration"
description: "Create a new androidGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidGeneralDeviceConfiguration
Namespace: microsoft.graph



Create a new [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.androidGeneralDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md) object.

The following table shows the properties that are required when you create the [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md).

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
|appsBlockClipboardSharing|Boolean|Indicates whether or not to block clipboard sharing to copy and paste between applications.|
|appsBlockCopyPaste|Boolean|Indicates whether or not to block copy and paste within applications.|
|appsBlockYouTube|Boolean|Indicates whether or not to block the YouTube app.|
|appsHideList|[appListItem](../resources/applistitem.md) collection|List of apps to be hidden on the KNOX device. This collection can contain a maximum of 500 elements.|
|appsInstallAllowList|[appListItem](../resources/applistitem.md) collection|List of apps which can be installed on the KNOX device. This collection can contain a maximum of 500 elements.|
|appsLaunchBlockList|[appListItem](../resources/applistitem.md) collection|List of apps which are blocked from being launched on the KNOX device. This collection can contain a maximum of 500 elements.|
|bluetoothBlocked|Boolean|Indicates whether or not to block Bluetooth.|
|cameraBlocked|Boolean|Indicates whether or not to block the use of the camera.|
|cellularBlockDataRoaming|Boolean|Indicates whether or not to block data roaming.|
|cellularBlockMessaging|Boolean|Indicates whether or not to block SMS/MMS messaging.|
|cellularBlockVoiceRoaming|Boolean|Indicates whether or not to block voice roaming.|
|cellularBlockWiFiTethering|Boolean|Indicates whether or not to block syncing Wi-Fi tethering.|
|compliantAppListType|appListType|Type of list that is in the CompliantAppsList. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|compliantAppsList|[appListItem](../resources/applistitem.md) collection|List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.|
|dateAndTimeBlockChanges|Boolean|Indicates whether or not to block changing date and time while in KNOX Mode.|
|deviceSharingAllowed|Boolean|Indicates whether or not to allow device sharing mode.|
|diagnosticDataBlockSubmission|Boolean|Indicates whether or not to block diagnostic data submission.|
|factoryResetBlocked|Boolean|Indicates whether or not to block user performing a factory reset.|
|googleAccountBlockAutoSync|Boolean|Indicates whether or not to block Google account auto sync.|
|googlePlayStoreBlocked|Boolean|Indicates whether or not to block the Google Play store.|
|kioskModeApps|[appListItem](../resources/applistitem.md) collection|A list of apps that will be allowed to run when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements.|
|kioskModeBlockSleepButton|Boolean|Indicates whether or not to block the screen sleep button while in Kiosk Mode.|
|kioskModeBlockVolumeButtons|Boolean|Indicates whether or not to block the volume buttons while in Kiosk Mode.|
|locationServicesBlocked|Boolean|Indicates whether or not to block location services.|
|nfcBlocked|Boolean|Indicates whether or not to block Near-Field Communication.|
|passwordBlockFingerprintUnlock|Boolean|Indicates whether or not to block fingerprint unlock.|
|passwordBlockTrustAgents|Boolean|Indicates whether or not to block Smart Lock and other trust agents.|
|passwordExpirationDays|Int32|Number of days before the password expires. Valid values 1 to 365|
|passwordMinimumLength|Int32|Minimum length of passwords. Valid values 4 to 16|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|passwordPreviousPasswordBlockCount|Int32|Number of previous passwords to block. Valid values 0 to 24|
|passwordRequired|Boolean|Indicates whether or not to require a password.|
|passwordRequiredType|androidRequiredPasswordType|Type of password that is required. Possible values are: `deviceDefault`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `numeric`, `numericComplex`, `any`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Number of sign in failures allowed before factory reset. Valid values 1 to 16|
|powerOffBlocked|Boolean|Indicates whether or not to block powering off the device.|
|requiredPasswordComplexity|androidRequiredPasswordComplexity|Indicates the required password complexity on Android. One of: NONE, LOW, MEDIUM, HIGH. This is an API targeted to Android 11+. Possible values are: `none`, `low`, `medium`, `high`.|
|screenCaptureBlocked|Boolean|Indicates whether or not to block screenshots.|
|securityRequireVerifyApps|Boolean|Require the Android Verify apps feature is turned on.|
|storageBlockGoogleBackup|Boolean|Indicates whether or not to block Google Backup.|
|storageBlockRemovableStorage|Boolean|Indicates whether or not to block removable storage usage.|
|storageRequireDeviceEncryption|Boolean|Indicates whether or not to require device encryption.|
|storageRequireRemovableStorageEncryption|Boolean|Indicates whether or not to require removable storage encryption.|
|voiceAssistantBlocked|Boolean|Indicates whether or not to block the use of the Voice Assistant.|
|voiceDialingBlocked|Boolean|Indicates whether or not to block voice dialing.|
|webBrowserBlockAutofill|Boolean|Indicates whether or not to block the web browser's auto fill feature.|
|webBrowserBlocked|Boolean|Indicates whether or not to block the web browser.|
|webBrowserBlockJavaScript|Boolean|Indicates whether or not to block JavaScript within the web browser.|
|webBrowserBlockPopups|Boolean|Indicates whether or not to block popups within the web browser.|
|webBrowserCookieSettings|webBrowserCookieSettings|Cookie settings within the web browser. Possible values are: `browserDefault`, `blockAlways`, `allowCurrentWebSite`, `allowFromWebsitesVisited`, `allowAlways`.|
|wiFiBlocked|Boolean|Indicates whether or not to block syncing Wi-Fi.|



## Response

If successful, this method returns a `201 Created` response code and an [androidGeneralDeviceConfiguration](../resources/androidgeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androidgeneraldeviceconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.androidGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 2998

{
  "@odata.type": "#microsoft.graph.androidGeneralDeviceConfiguration",
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
  "appsBlockClipboardSharing": "Boolean",
  "appsBlockCopyPaste": "Boolean",
  "appsBlockYouTube": "Boolean",
  "appsHideList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsInstallAllowList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsLaunchBlockList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockDataRoaming": "Boolean",
  "cellularBlockMessaging": "Boolean",
  "cellularBlockVoiceRoaming": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "compliantAppListType": "String",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "dateAndTimeBlockChanges": "Boolean",
  "deviceSharingAllowed": "Boolean",
  "diagnosticDataBlockSubmission": "Boolean",
  "factoryResetBlocked": "Boolean",
  "googleAccountBlockAutoSync": "Boolean",
  "googlePlayStoreBlocked": "Boolean",
  "kioskModeApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "kioskModeBlockSleepButton": "Boolean",
  "kioskModeBlockVolumeButtons": "Boolean",
  "locationServicesBlocked": "Boolean",
  "nfcBlocked": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockTrustAgents": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "powerOffBlocked": "Boolean",
  "requiredPasswordComplexity": "String",
  "screenCaptureBlocked": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "storageBlockGoogleBackup": "Boolean",
  "storageBlockRemovableStorage": "Boolean",
  "storageRequireDeviceEncryption": "Boolean",
  "storageRequireRemovableStorageEncryption": "Boolean",
  "voiceAssistantBlocked": "Boolean",
  "voiceDialingBlocked": "Boolean",
  "webBrowserBlockAutofill": "Boolean",
  "webBrowserBlocked": "Boolean",
  "webBrowserBlockJavaScript": "Boolean",
  "webBrowserBlockPopups": "Boolean",
  "webBrowserCookieSettings": "String",
  "wiFiBlocked": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidGeneralDeviceConfiguration"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidGeneralDeviceConfiguration",
  "id": "cecfc858-c858-cecf-58c8-cfce58c8cfce",
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
  "appsBlockClipboardSharing": "Boolean",
  "appsBlockCopyPaste": "Boolean",
  "appsBlockYouTube": "Boolean",
  "appsHideList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsInstallAllowList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsLaunchBlockList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "bluetoothBlocked": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockDataRoaming": "Boolean",
  "cellularBlockMessaging": "Boolean",
  "cellularBlockVoiceRoaming": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "compliantAppListType": "String",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "dateAndTimeBlockChanges": "Boolean",
  "deviceSharingAllowed": "Boolean",
  "diagnosticDataBlockSubmission": "Boolean",
  "factoryResetBlocked": "Boolean",
  "googleAccountBlockAutoSync": "Boolean",
  "googlePlayStoreBlocked": "Boolean",
  "kioskModeApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "kioskModeBlockSleepButton": "Boolean",
  "kioskModeBlockVolumeButtons": "Boolean",
  "locationServicesBlocked": "Boolean",
  "nfcBlocked": "Boolean",
  "passwordBlockFingerprintUnlock": "Boolean",
  "passwordBlockTrustAgents": "Boolean",
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordBlockCount": "Integer",
  "passwordRequired": "Boolean",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "powerOffBlocked": "Boolean",
  "requiredPasswordComplexity": "String",
  "screenCaptureBlocked": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "storageBlockGoogleBackup": "Boolean",
  "storageBlockRemovableStorage": "Boolean",
  "storageRequireDeviceEncryption": "Boolean",
  "storageRequireRemovableStorageEncryption": "Boolean",
  "voiceAssistantBlocked": "Boolean",
  "voiceDialingBlocked": "Boolean",
  "webBrowserBlockAutofill": "Boolean",
  "webBrowserBlocked": "Boolean",
  "webBrowserBlockJavaScript": "Boolean",
  "webBrowserBlockPopups": "Boolean",
  "webBrowserCookieSettings": "String",
  "wiFiBlocked": "Boolean"
}
```

