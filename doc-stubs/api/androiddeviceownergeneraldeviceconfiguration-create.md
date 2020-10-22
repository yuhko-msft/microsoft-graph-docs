---
title: "Create androidDeviceOwnerGeneralDeviceConfiguration"
description: "Create a new androidDeviceOwnerGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create androidDeviceOwnerGeneralDeviceConfiguration
Namespace: microsoft.graph

Create a new [androidDeviceOwnerGeneralDeviceConfiguration](../resources/androiddeviceownergeneraldeviceconfiguration.md) object.

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
POST ** Collection URI for microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceOwnerGeneralDeviceConfiguration](../resources/androiddeviceownergeneraldeviceconfiguration.md) object.

The following table shows the properties that are required when you create the [androidDeviceOwnerGeneralDeviceConfiguration](../resources/androiddeviceownergeneraldeviceconfiguration.md).

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
|accountsBlockModification|Boolean|**TODO: Add Description**|
|appsAllowInstallFromUnknownSources|Boolean|**TODO: Add Description**|
|appsAutoUpdatePolicy|androidDeviceOwnerAppAutoUpdatePolicyType|**TODO: Add Description**. Possible values are: `notConfigured`, `userChoice`, `never`, `wiFiOnly`, `always`.|
|appsDefaultPermissionPolicy|androidDeviceOwnerDefaultAppPermissionPolicyType|**TODO: Add Description**. Possible values are: `deviceDefault`, `prompt`, `autoGrant`, `autoDeny`.|
|appsRecommendSkippingFirstUseHints|Boolean|**TODO: Add Description**|
|bluetoothBlockConfiguration|Boolean|**TODO: Add Description**|
|bluetoothBlockContactSharing|Boolean|**TODO: Add Description**|
|cameraBlocked|Boolean|**TODO: Add Description**|
|cellularBlockWiFiTethering|Boolean|**TODO: Add Description**|
|certificateCredentialConfigurationDisabled|Boolean|**TODO: Add Description**|
|microsoftLauncherConfigurationEnabled|Boolean|**TODO: Add Description**|
|microsoftLauncherCustomWallpaperEnabled|Boolean|**TODO: Add Description**|
|microsoftLauncherCustomWallpaperImageUrl|String|**TODO: Add Description**|
|microsoftLauncherCustomWallpaperAllowUserModification|Boolean|**TODO: Add Description**|
|microsoftLauncherFeedEnabled|Boolean|**TODO: Add Description**|
|microsoftLauncherFeedAllowUserModification|Boolean|**TODO: Add Description**|
|microsoftLauncherDockPresenceConfiguration|microsoftLauncherDockPresence|**TODO: Add Description**. Possible values are: `notConfigured`, `show`, `hide`, `disabled`.|
|microsoftLauncherDockPresenceAllowUserModification|Boolean|**TODO: Add Description**|
|microsoftLauncherSearchBarPlacementConfiguration|microsoftLauncherSearchBarPlacement|**TODO: Add Description**. Possible values are: `notConfigured`, `top`, `bottom`, `hide`.|
|enrollmentProfile|androidDeviceOwnerEnrollmentProfileType|**TODO: Add Description**. Possible values are: `notConfigured`, `dedicatedDevice`, `fullyManaged`.|
|dataRoamingBlocked|Boolean|**TODO: Add Description**|
|dateTimeConfigurationBlocked|Boolean|**TODO: Add Description**|
|factoryResetDeviceAdministratorEmails|String collection|**TODO: Add Description**|
|factoryResetBlocked|Boolean|**TODO: Add Description**|
|globalProxy|[androidDeviceOwnerGlobalProxy](../resources/intune-androiddeviceownerglobalproxy.md)|**TODO: Add Description**|
|googleAccountsBlocked|Boolean|**TODO: Add Description**|
|kioskModeScreenSaverConfigurationEnabled|Boolean|**TODO: Add Description**|
|kioskModeScreenSaverImageUrl|String|**TODO: Add Description**|
|kioskModeScreenSaverDisplayTimeInSeconds|Int32|**TODO: Add Description**|
|kioskModeScreenSaverStartDelayInSeconds|Int32|**TODO: Add Description**|
|kioskModeScreenSaverDetectMediaDisabled|Boolean|**TODO: Add Description**|
|kioskModeApps|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|kioskModeWallpaperUrl|String|**TODO: Add Description**|
|kioskModeExitCode|String|**TODO: Add Description**|
|kioskModeVirtualHomeButtonEnabled|Boolean|**TODO: Add Description**|
|kioskModeVirtualHomeButtonType|androidDeviceOwnerVirtualHomeButtonType|**TODO: Add Description**. Possible values are: `notConfigured`, `swipeUp`, `floating`.|
|kioskModeBluetoothConfigurationEnabled|Boolean|**TODO: Add Description**|
|kioskModeWiFiConfigurationEnabled|Boolean|**TODO: Add Description**|
|kioskModeFlashlightConfigurationEnabled|Boolean|**TODO: Add Description**|
|kioskModeMediaVolumeConfigurationEnabled|Boolean|**TODO: Add Description**|
|kioskModeShowDeviceInfo|Boolean|**TODO: Add Description**|
|kioskModeManagedSettingsEntryDisabled|Boolean|**TODO: Add Description**|
|kioskModeDebugMenuEasyAccessEnabled|Boolean|**TODO: Add Description**|
|kioskModeShowAppNotificationBadge|Boolean|**TODO: Add Description**|
|kioskModeScreenOrientation|androidDeviceOwnerKioskModeScreenOrientation|**TODO: Add Description**. Possible values are: `notConfigured`, `portrait`, `landscape`, `autoRotate`.|
|kioskModeIconSize|androidDeviceOwnerKioskModeIconSize|**TODO: Add Description**. Possible values are: `notConfigured`, `smallest`, `small`, `regular`, `large`, `largest`.|
|kioskModeFolderIcon|androidDeviceOwnerKioskModeFolderIcon|**TODO: Add Description**. Possible values are: `notConfigured`, `darkSquare`, `darkCircle`, `lightSquare`, `lightCircle`.|
|kioskModeWifiAllowedSsids|String collection|**TODO: Add Description**|
|microphoneForceMute|Boolean|**TODO: Add Description**|
|networkEscapeHatchAllowed|Boolean|**TODO: Add Description**|
|nfcBlockOutgoingBeam|Boolean|**TODO: Add Description**|
|passwordBlockKeyguard|Boolean|**TODO: Add Description**|
|passwordBlockKeyguardFeatures|androidKeyguardFeature collection|**TODO: Add Description**. Possible values are: `notConfigured`, `camera`, `notifications`, `unredactedNotifications`, `trustAgents`, `fingerprint`, `remoteInput`, `allFeatures`.|
|passwordExpirationDays|Int32|**TODO: Add Description**|
|passwordMinimumLength|Int32|**TODO: Add Description**|
|passwordMinimumLetterCharacters|Int32|**TODO: Add Description**|
|passwordMinimumLowerCaseCharacters|Int32|**TODO: Add Description**|
|passwordMinimumNonLetterCharacters|Int32|**TODO: Add Description**|
|passwordMinimumNumericCharacters|Int32|**TODO: Add Description**|
|passwordMinimumSymbolCharacters|Int32|**TODO: Add Description**|
|passwordMinimumUpperCaseCharacters|Int32|**TODO: Add Description**|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passwordPreviousPasswordCountToBlock|Int32|**TODO: Add Description**|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|playStoreMode|androidDeviceOwnerPlayStoreMode|**TODO: Add Description**. Possible values are: `notConfigured`, `allowList`, `blockList`.|
|safeBootBlocked|Boolean|**TODO: Add Description**|
|screenCaptureBlocked|Boolean|**TODO: Add Description**|
|securityAllowDebuggingFeatures|Boolean|**TODO: Add Description**|
|securityRequireVerifyApps|Boolean|**TODO: Add Description**|
|statusBarBlocked|Boolean|**TODO: Add Description**|
|stayOnModes|androidDeviceOwnerBatteryPluggedMode collection|**TODO: Add Description**. Possible values are: `notConfigured`, `ac`, `usb`, `wireless`.|
|storageAllowUsb|Boolean|**TODO: Add Description**|
|storageBlockExternalMedia|Boolean|**TODO: Add Description**|
|storageBlockUsbFileTransfer|Boolean|**TODO: Add Description**|
|systemUpdateWindowStartMinutesAfterMidnight|Int32|**TODO: Add Description**|
|systemUpdateWindowEndMinutesAfterMidnight|Int32|**TODO: Add Description**|
|systemUpdateInstallType|androidDeviceOwnerSystemUpdateInstallType|**TODO: Add Description**. Possible values are: `deviceDefault`, `postpone`, `windowed`, `automatic`.|
|systemWindowsBlocked|Boolean|**TODO: Add Description**|
|usersBlockAdd|Boolean|**TODO: Add Description**|
|usersBlockRemove|Boolean|**TODO: Add Description**|
|volumeBlockAdjustment|Boolean|**TODO: Add Description**|
|vpnAlwaysOnLockdownMode|Boolean|**TODO: Add Description**|
|vpnAlwaysOnPackageIdentifier|String|**TODO: Add Description**|
|wifiBlockEditConfigurations|Boolean|**TODO: Add Description**|
|wifiBlockEditPolicyDefinedConfigurations|Boolean|**TODO: Add Description**|
|personalProfileAppsAllowInstallFromUnknownSources|Boolean|**TODO: Add Description**|
|personalProfileCameraBlocked|Boolean|**TODO: Add Description**|
|personalProfileScreenCaptureBlocked|Boolean|**TODO: Add Description**|
|workProfilePasswordExpirationDays|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumLength|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumNumericCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumNonLetterCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumLetterCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumLowerCaseCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumUpperCaseCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordMinimumSymbolCharacters|Int32|**TODO: Add Description**|
|workProfilePasswordPreviousPasswordCountToBlock|Int32|**TODO: Add Description**|
|workProfilePasswordSignInFailureCountBeforeFactoryReset|Int32|**TODO: Add Description**|
|workProfilePasswordRequiredType|androidDeviceOwnerRequiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`.|



## Response

If successful, this method returns a `201 Created` response code and an [androidDeviceOwnerGeneralDeviceConfiguration](../resources/androiddeviceownergeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_androiddeviceownergeneraldeviceconfiguration_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 5650

{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration",
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
  "accountsBlockModification": "Boolean",
  "appsAllowInstallFromUnknownSources": "Boolean",
  "appsAutoUpdatePolicy": "String",
  "appsDefaultPermissionPolicy": "String",
  "appsRecommendSkippingFirstUseHints": "Boolean",
  "bluetoothBlockConfiguration": "Boolean",
  "bluetoothBlockContactSharing": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "certificateCredentialConfigurationDisabled": "Boolean",
  "microsoftLauncherConfigurationEnabled": "Boolean",
  "microsoftLauncherCustomWallpaperEnabled": "Boolean",
  "microsoftLauncherCustomWallpaperImageUrl": "String",
  "microsoftLauncherCustomWallpaperAllowUserModification": "Boolean",
  "microsoftLauncherFeedEnabled": "Boolean",
  "microsoftLauncherFeedAllowUserModification": "Boolean",
  "microsoftLauncherDockPresenceConfiguration": "String",
  "microsoftLauncherDockPresenceAllowUserModification": "Boolean",
  "microsoftLauncherSearchBarPlacementConfiguration": "String",
  "enrollmentProfile": "String",
  "dataRoamingBlocked": "Boolean",
  "dateTimeConfigurationBlocked": "Boolean",
  "factoryResetDeviceAdministratorEmails": [
    "String"
  ],
  "factoryResetBlocked": "Boolean",
  "globalProxy": {
    "@odata.type": "microsoft.graph.androidDeviceOwnerGlobalProxy"
  },
  "googleAccountsBlocked": "Boolean",
  "kioskModeScreenSaverConfigurationEnabled": "Boolean",
  "kioskModeScreenSaverImageUrl": "String",
  "kioskModeScreenSaverDisplayTimeInSeconds": "Integer",
  "kioskModeScreenSaverStartDelayInSeconds": "Integer",
  "kioskModeScreenSaverDetectMediaDisabled": "Boolean",
  "kioskModeApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "kioskModeWallpaperUrl": "String",
  "kioskModeExitCode": "String",
  "kioskModeVirtualHomeButtonEnabled": "Boolean",
  "kioskModeVirtualHomeButtonType": "String",
  "kioskModeBluetoothConfigurationEnabled": "Boolean",
  "kioskModeWiFiConfigurationEnabled": "Boolean",
  "kioskModeFlashlightConfigurationEnabled": "Boolean",
  "kioskModeMediaVolumeConfigurationEnabled": "Boolean",
  "kioskModeShowDeviceInfo": "Boolean",
  "kioskModeManagedSettingsEntryDisabled": "Boolean",
  "kioskModeDebugMenuEasyAccessEnabled": "Boolean",
  "kioskModeShowAppNotificationBadge": "Boolean",
  "kioskModeScreenOrientation": "String",
  "kioskModeIconSize": "String",
  "kioskModeFolderIcon": "String",
  "kioskModeWifiAllowedSsids": [
    "String"
  ],
  "microphoneForceMute": "Boolean",
  "networkEscapeHatchAllowed": "Boolean",
  "nfcBlockOutgoingBeam": "Boolean",
  "passwordBlockKeyguard": "Boolean",
  "passwordBlockKeyguardFeatures": [
    "String"
  ],
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinimumLetterCharacters": "Integer",
  "passwordMinimumLowerCaseCharacters": "Integer",
  "passwordMinimumNonLetterCharacters": "Integer",
  "passwordMinimumNumericCharacters": "Integer",
  "passwordMinimumSymbolCharacters": "Integer",
  "passwordMinimumUpperCaseCharacters": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordCountToBlock": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "playStoreMode": "String",
  "safeBootBlocked": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "securityAllowDebuggingFeatures": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "statusBarBlocked": "Boolean",
  "stayOnModes": [
    "String"
  ],
  "storageAllowUsb": "Boolean",
  "storageBlockExternalMedia": "Boolean",
  "storageBlockUsbFileTransfer": "Boolean",
  "systemUpdateWindowStartMinutesAfterMidnight": "Integer",
  "systemUpdateWindowEndMinutesAfterMidnight": "Integer",
  "systemUpdateInstallType": "String",
  "systemWindowsBlocked": "Boolean",
  "usersBlockAdd": "Boolean",
  "usersBlockRemove": "Boolean",
  "volumeBlockAdjustment": "Boolean",
  "vpnAlwaysOnLockdownMode": "Boolean",
  "vpnAlwaysOnPackageIdentifier": "String",
  "wifiBlockEditConfigurations": "Boolean",
  "wifiBlockEditPolicyDefinedConfigurations": "Boolean",
  "personalProfileAppsAllowInstallFromUnknownSources": "Boolean",
  "personalProfileCameraBlocked": "Boolean",
  "personalProfileScreenCaptureBlocked": "Boolean",
  "workProfilePasswordExpirationDays": "Integer",
  "workProfilePasswordMinimumLength": "Integer",
  "workProfilePasswordMinimumNumericCharacters": "Integer",
  "workProfilePasswordMinimumNonLetterCharacters": "Integer",
  "workProfilePasswordMinimumLetterCharacters": "Integer",
  "workProfilePasswordMinimumLowerCaseCharacters": "Integer",
  "workProfilePasswordMinimumUpperCaseCharacters": "Integer",
  "workProfilePasswordMinimumSymbolCharacters": "Integer",
  "workProfilePasswordPreviousPasswordCountToBlock": "Integer",
  "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer",
  "workProfilePasswordRequiredType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration",
  "id": "0a652f70-2f70-0a65-702f-650a702f650a",
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
  "accountsBlockModification": "Boolean",
  "appsAllowInstallFromUnknownSources": "Boolean",
  "appsAutoUpdatePolicy": "String",
  "appsDefaultPermissionPolicy": "String",
  "appsRecommendSkippingFirstUseHints": "Boolean",
  "bluetoothBlockConfiguration": "Boolean",
  "bluetoothBlockContactSharing": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "certificateCredentialConfigurationDisabled": "Boolean",
  "microsoftLauncherConfigurationEnabled": "Boolean",
  "microsoftLauncherCustomWallpaperEnabled": "Boolean",
  "microsoftLauncherCustomWallpaperImageUrl": "String",
  "microsoftLauncherCustomWallpaperAllowUserModification": "Boolean",
  "microsoftLauncherFeedEnabled": "Boolean",
  "microsoftLauncherFeedAllowUserModification": "Boolean",
  "microsoftLauncherDockPresenceConfiguration": "String",
  "microsoftLauncherDockPresenceAllowUserModification": "Boolean",
  "microsoftLauncherSearchBarPlacementConfiguration": "String",
  "enrollmentProfile": "String",
  "dataRoamingBlocked": "Boolean",
  "dateTimeConfigurationBlocked": "Boolean",
  "factoryResetDeviceAdministratorEmails": [
    "String"
  ],
  "factoryResetBlocked": "Boolean",
  "globalProxy": {
    "@odata.type": "microsoft.graph.androidDeviceOwnerGlobalProxy"
  },
  "googleAccountsBlocked": "Boolean",
  "kioskModeScreenSaverConfigurationEnabled": "Boolean",
  "kioskModeScreenSaverImageUrl": "String",
  "kioskModeScreenSaverDisplayTimeInSeconds": "Integer",
  "kioskModeScreenSaverStartDelayInSeconds": "Integer",
  "kioskModeScreenSaverDetectMediaDisabled": "Boolean",
  "kioskModeApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "kioskModeWallpaperUrl": "String",
  "kioskModeExitCode": "String",
  "kioskModeVirtualHomeButtonEnabled": "Boolean",
  "kioskModeVirtualHomeButtonType": "String",
  "kioskModeBluetoothConfigurationEnabled": "Boolean",
  "kioskModeWiFiConfigurationEnabled": "Boolean",
  "kioskModeFlashlightConfigurationEnabled": "Boolean",
  "kioskModeMediaVolumeConfigurationEnabled": "Boolean",
  "kioskModeShowDeviceInfo": "Boolean",
  "kioskModeManagedSettingsEntryDisabled": "Boolean",
  "kioskModeDebugMenuEasyAccessEnabled": "Boolean",
  "kioskModeShowAppNotificationBadge": "Boolean",
  "kioskModeScreenOrientation": "String",
  "kioskModeIconSize": "String",
  "kioskModeFolderIcon": "String",
  "kioskModeWifiAllowedSsids": [
    "String"
  ],
  "microphoneForceMute": "Boolean",
  "networkEscapeHatchAllowed": "Boolean",
  "nfcBlockOutgoingBeam": "Boolean",
  "passwordBlockKeyguard": "Boolean",
  "passwordBlockKeyguardFeatures": [
    "String"
  ],
  "passwordExpirationDays": "Integer",
  "passwordMinimumLength": "Integer",
  "passwordMinimumLetterCharacters": "Integer",
  "passwordMinimumLowerCaseCharacters": "Integer",
  "passwordMinimumNonLetterCharacters": "Integer",
  "passwordMinimumNumericCharacters": "Integer",
  "passwordMinimumSymbolCharacters": "Integer",
  "passwordMinimumUpperCaseCharacters": "Integer",
  "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passwordPreviousPasswordCountToBlock": "Integer",
  "passwordRequiredType": "String",
  "passwordSignInFailureCountBeforeFactoryReset": "Integer",
  "playStoreMode": "String",
  "safeBootBlocked": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "securityAllowDebuggingFeatures": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "statusBarBlocked": "Boolean",
  "stayOnModes": [
    "String"
  ],
  "storageAllowUsb": "Boolean",
  "storageBlockExternalMedia": "Boolean",
  "storageBlockUsbFileTransfer": "Boolean",
  "systemUpdateWindowStartMinutesAfterMidnight": "Integer",
  "systemUpdateWindowEndMinutesAfterMidnight": "Integer",
  "systemUpdateInstallType": "String",
  "systemWindowsBlocked": "Boolean",
  "usersBlockAdd": "Boolean",
  "usersBlockRemove": "Boolean",
  "volumeBlockAdjustment": "Boolean",
  "vpnAlwaysOnLockdownMode": "Boolean",
  "vpnAlwaysOnPackageIdentifier": "String",
  "wifiBlockEditConfigurations": "Boolean",
  "wifiBlockEditPolicyDefinedConfigurations": "Boolean",
  "personalProfileAppsAllowInstallFromUnknownSources": "Boolean",
  "personalProfileCameraBlocked": "Boolean",
  "personalProfileScreenCaptureBlocked": "Boolean",
  "workProfilePasswordExpirationDays": "Integer",
  "workProfilePasswordMinimumLength": "Integer",
  "workProfilePasswordMinimumNumericCharacters": "Integer",
  "workProfilePasswordMinimumNonLetterCharacters": "Integer",
  "workProfilePasswordMinimumLetterCharacters": "Integer",
  "workProfilePasswordMinimumLowerCaseCharacters": "Integer",
  "workProfilePasswordMinimumUpperCaseCharacters": "Integer",
  "workProfilePasswordMinimumSymbolCharacters": "Integer",
  "workProfilePasswordPreviousPasswordCountToBlock": "Integer",
  "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer",
  "workProfilePasswordRequiredType": "String"
}
```

