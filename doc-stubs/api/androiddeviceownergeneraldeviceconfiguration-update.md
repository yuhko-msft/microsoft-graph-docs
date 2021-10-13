---
title: "Update androidDeviceOwnerGeneralDeviceConfiguration"
description: "Update the properties of an androidDeviceOwnerGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidDeviceOwnerGeneralDeviceConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [androidDeviceOwnerGeneralDeviceConfiguration](../resources/androiddeviceownergeneraldeviceconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Required.|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Optional.|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Optional.|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Optional.|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Optional.|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Required.|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Required.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Optional.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Required.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md). Required.|
|accountsBlockModification|Boolean|Indicates whether or not adding or removing accounts is disabled. Optional.|
|appsAllowInstallFromUnknownSources|Boolean|Indicates whether or not the user is allowed to enable to unknown sources setting. Optional.|
|appsAutoUpdatePolicy|androidDeviceOwnerAppAutoUpdatePolicyType|Indicates the value of the app auto update policy. The possible values are: `notConfigured`, `userChoice`, `never`, `wiFiOnly`, `always`. Optional.|
|appsDefaultPermissionPolicy|androidDeviceOwnerDefaultAppPermissionPolicyType|Indicates the permission policy for requests for runtime permissions if one is not defined for the app specifically. The possible values are: `deviceDefault`, `prompt`, `autoGrant`, `autoDeny`. Optional.|
|appsRecommendSkippingFirstUseHints|Boolean|Whether or not to recommend all apps skip any first-time-use hints they may have added. Optional.|
|azureAdSharedDeviceDataClearApps|[appListItem](../resources/applistitem.md) collection|A list of managed apps that will have their data cleared during a global sign-out in AAD shared device mode. This collection can contain a maximum of 500 elements. Optional.|
|bluetoothBlockConfiguration|Boolean|Indicates whether or not to block a user from configuring bluetooth. Optional.|
|bluetoothBlockContactSharing|Boolean|Indicates whether or not to block a user from sharing contacts via bluetooth. Optional.|
|cameraBlocked|Boolean|Indicates whether or not to disable the use of the camera. Optional.|
|cellularBlockWiFiTethering|Boolean|Indicates whether or not to block Wi-Fi tethering. Optional.|
|certificateCredentialConfigurationDisabled|Boolean|Indicates whether or not to block users from any certificate credential configuration. Optional.|
|dataRoamingBlocked|Boolean|Indicates whether or not to block a user from data roaming. Optional.|
|dateTimeConfigurationBlocked|Boolean|Indicates whether or not to block the user from manually changing the date or time on the device Optional.|
|enrollmentProfile|androidDeviceOwnerEnrollmentProfileType|Indicates which enrollment profile you want to configure. The possible values are: `notConfigured`, `dedicatedDevice`, `fullyManaged`. Required.|
|factoryResetBlocked|Boolean|Indicates whether or not the factory reset option in settings is disabled. Optional.|
|factoryResetDeviceAdministratorEmails|String collection|List of Google account emails that will be required to authenticate after a device is factory reset before it can be set up. Optional.|
|globalProxy|[androidDeviceOwnerGlobalProxy](../resources/androiddeviceownerglobalproxy.md)|Proxy is set up directly with host, port and excluded hosts. Optional.|
|googleAccountsBlocked|Boolean|Indicates whether or not google accounts will be blocked. Optional.|
|kioskCustomizationDeviceSettingsBlocked|Boolean|Indicates whether a user can access the device's Settings app while in Kiosk Mode. Optional.|
|kioskCustomizationPowerButtonActionsBlocked|Boolean|Whether the power menu is shown when a user long presses the Power button of a device in Kiosk Mode. Optional.|
|kioskCustomizationStatusBar|androidDeviceOwnerKioskCustomizationStatusBar|Indicates whether system info and notifications are disabled in Kiosk Mode. The possible values are: `notConfigured`, `notificationsAndSystemInfoEnabled`, `systemInfoOnly`. Optional.|
|kioskCustomizationSystemErrorWarnings|Boolean|Indicates whether system error dialogs for crashed or unresponsive apps are shown in Kiosk Mode. Optional.|
|kioskCustomizationSystemNavigation|androidDeviceOwnerKioskCustomizationSystemNavigation|Indicates which navigation features are enabled in Kiosk Mode. The possible values are: `notConfigured`, `navigationEnabled`, `homeButtonOnly`. Optional.|
|kioskModeAppOrderEnabled|Boolean|Whether or not to enable app ordering in Kiosk Mode. Optional.|
|kioskModeAppPositions|[androidDeviceOwnerKioskModeAppPositionItem](../resources/androiddeviceownerkioskmodeapppositionitem.md) collection|The ordering of items on Kiosk Mode Managed Home Screen. This collection can contain a maximum of 500 elements. Optional.|
|kioskModeApps|[appListItem](../resources/applistitem.md) collection|A list of managed apps that will be shown when the device is in Kiosk Mode. This collection can contain a maximum of 500 elements. Optional.|
|kioskModeAppsInFolderOrderedByName|Boolean|Whether or not to alphabetize applications within a folder in Kiosk Mode. Optional.|
|kioskModeBluetoothConfigurationEnabled|Boolean|Whether or not to allow a user to configure Bluetooth settings in Kiosk Mode. Optional.|
|kioskModeDebugMenuEasyAccessEnabled|Boolean|Whether or not to allow a user to easy access to the debug menu in Kiosk Mode. Optional.|
|kioskModeExitCode|String|Exit code to allow a user to escape from Kiosk Mode when the device is in Kiosk Mode. Optional.|
|kioskModeFlashlightConfigurationEnabled|Boolean|Whether or not to allow a user to use the flashlight in Kiosk Mode. Optional.|
|kioskModeFolderIcon|androidDeviceOwnerKioskModeFolderIcon|Folder icon configuration for managed home screen in Kiosk Mode. The possible values are: `notConfigured`, `darkSquare`, `darkCircle`, `lightSquare`, `lightCircle`. Optional.|
|kioskModeGridHeight|Int32|Number of rows for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999 Optional.|
|kioskModeGridWidth|Int32|Number of columns for Managed Home Screen grid with app ordering enabled in Kiosk Mode. Valid values 1 to 9999999 Optional.|
|kioskModeIconSize|androidDeviceOwnerKioskModeIconSize|Icon size configuration for managed home screen in Kiosk Mode. The possible values are: `notConfigured`, `smallest`, `small`, `regular`, `large`, `largest`. Optional.|
|kioskModeLockHomeScreen|Boolean|Whether or not to lock home screen to the end user in Kiosk Mode. Optional.|
|kioskModeManagedFolders|[androidDeviceOwnerKioskModeManagedFolder](../resources/androiddeviceownerkioskmodemanagedfolder.md) collection|A list of managed folders for a device in Kiosk Mode. This collection can contain a maximum of 500 elements. Optional.|
|kioskModeManagedHomeScreenAutoSignout|Boolean|Whether or not to automatically sign-out of MHS and Shared device mode applications after inactive for Managed Home Screen. Optional.|
|kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds|Int32|Number of seconds to give user notice before automatically signing them out for Managed Home Screen. Valid values 0 to 9999999 Optional.|
|kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds|Int32|Number of seconds device is inactive before automatically signing user out for Managed Home Screen. Valid values 0 to 9999999 Optional.|
|kioskModeManagedHomeScreenPinComplexity|kioskModeManagedHomeScreenPinComplexity|Complexity of PIN for sign-in session for Managed Home Screen. The possible values are: `notConfigured`, `simple`, `complex`. Optional.|
|kioskModeManagedHomeScreenPinRequired|Boolean|Whether or not require user to set a PIN for sign-in session for Managed Home Screen. Optional.|
|kioskModeManagedHomeScreenPinRequiredToResume|Boolean|Whether or not required user to enter session PIN if screensaver has appeared for Managed Home Screen. Optional.|
|kioskModeManagedHomeScreenSignInBackground|String|Custom URL background for sign-in screen for Managed Home Screen. Optional.|
|kioskModeManagedHomeScreenSignInBrandingLogo|String|Custom URL branding logo for sign-in screen and session pin page for Managed Home Screen. Optional.|
|kioskModeManagedHomeScreenSignInEnabled|Boolean|Whether or not show sign-in screen for Managed Home Screen. Optional.|
|kioskModeManagedSettingsEntryDisabled|Boolean|Whether or not to display the Managed Settings entry point on the managed home screen in Kiosk Mode. Optional.|
|kioskModeMediaVolumeConfigurationEnabled|Boolean|Whether or not to allow a user to change the media volume in Kiosk Mode. Optional.|
|kioskModeScreenOrientation|androidDeviceOwnerKioskModeScreenOrientation|Screen orientation configuration for managed home screen in Kiosk Mode. The possible values are: `notConfigured`, `portrait`, `landscape`, `autoRotate`. Optional.|
|kioskModeScreenSaverConfigurationEnabled|Boolean|Whether or not to enable screen saver mode or not in Kiosk Mode. Optional.|
|kioskModeScreenSaverDetectMediaDisabled|Boolean|Whether or not the device screen should show the screen saver if audio/video is playing in Kiosk Mode. Optional.|
|kioskModeScreenSaverDisplayTimeInSeconds|Int32|The number of seconds that the device will display the screen saver for in Kiosk Mode. Valid values 0 to 9999999 Optional.|
|kioskModeScreenSaverImageUrl|String|URL for an image that will be the device's screen saver in Kiosk Mode. Optional.|
|kioskModeScreenSaverStartDelayInSeconds|Int32|The number of seconds the device needs to be inactive for before the screen saver is shown in Kiosk Mode. Valid values 1 to 9999999 Optional.|
|kioskModeShowAppNotificationBadge|Boolean|Whether or not to display application notification badges in Kiosk Mode. Optional.|
|kioskModeShowDeviceInfo|Boolean|Whether or not to allow a user to access basic device information. Optional.|
|kioskModeVirtualHomeButtonEnabled|Boolean|Whether or not to display a virtual home button when the device is in Kiosk Mode. Optional.|
|kioskModeVirtualHomeButtonType|androidDeviceOwnerVirtualHomeButtonType|Indicates whether the virtual home button is a swipe up home button or a floating home button. The possible values are: `notConfigured`, `swipeUp`, `floating`. Optional.|
|kioskModeWallpaperUrl|String|URL to a publicly accessible image to use for the wallpaper when the device is in Kiosk Mode. Optional.|
|kioskModeWifiAllowedSsids|String collection|The restricted set of WIFI SSIDs available for the user to configure in Kiosk Mode. This collection can contain a maximum of 500 elements. Optional.|
|kioskModeWiFiConfigurationEnabled|Boolean|Whether or not to allow a user to configure Wi-Fi settings in Kiosk Mode. Optional.|
|microphoneForceMute|Boolean|Indicates whether or not to block unmuting the microphone on the device. Optional.|
|microsoftLauncherConfigurationEnabled|Boolean|Indicates whether or not to you want configure Microsoft Launcher. Optional.|
|microsoftLauncherCustomWallpaperAllowUserModification|Boolean|Indicates whether or not the user can modify the wallpaper to personalize their device. Optional.|
|microsoftLauncherCustomWallpaperEnabled|Boolean|Indicates whether or not to configure the wallpaper on the targeted devices. Optional.|
|microsoftLauncherCustomWallpaperImageUrl|String|Indicates the URL for the image file to use as the wallpaper on the targeted devices. Optional.|
|microsoftLauncherDockPresenceAllowUserModification|Boolean|Indicates whether or not the user can modify the device dock configuration on the device. Optional.|
|microsoftLauncherDockPresenceConfiguration|microsoftLauncherDockPresence|Indicates whether or not you want to configure the device dock. The possible values are: `notConfigured`, `show`, `hide`, `disabled`. Optional.|
|microsoftLauncherFeedAllowUserModification|Boolean|Indicates whether or not the user can modify the launcher feed on the device. Optional.|
|microsoftLauncherFeedEnabled|Boolean|Indicates whether or not you want to enable the launcher feed on the device. Optional.|
|microsoftLauncherSearchBarPlacementConfiguration|microsoftLauncherSearchBarPlacement|Indicates the search bar placement configuration on the device. The possible values are: `notConfigured`, `top`, `bottom`, `hide`. Optional.|
|networkEscapeHatchAllowed|Boolean|Indicates whether or not the device will allow connecting to a temporary network connection at boot time. Optional.|
|nfcBlockOutgoingBeam|Boolean|Indicates whether or not to block NFC outgoing beam. Optional.|
|passwordBlockKeyguard|Boolean|Indicates whether or not the keyguard is disabled. Optional.|
|passwordBlockKeyguardFeatures|androidKeyguardFeature collection|List of device keyguard features to block. This collection can contain a maximum of 7 elements. The possible values are: `notConfigured`, `camera`, `notifications`, `unredactedNotifications`, `trustAgents`, `fingerprint`, `remoteInput`, `allFeatures`. Required.|
|passwordExpirationDays|Int32|Indicates the amount of time that a password can be set for before it expires and a new password will be required. Valid values 1 to 365 Optional.|
|passwordMinimumLength|Int32|Indicates the minimum length of the password required on the device. Valid values 4 to 16 Optional.|
|passwordMinimumLetterCharacters|Int32|Indicates the minimum number of letter characters required for device password. Valid values 1 to 16 Optional.|
|passwordMinimumLowerCaseCharacters|Int32|Indicates the minimum number of lower case characters required for device password. Valid values 1 to 16 Optional.|
|passwordMinimumNonLetterCharacters|Int32|Indicates the minimum number of non-letter characters required for device password. Valid values 1 to 16 Optional.|
|passwordMinimumNumericCharacters|Int32|Indicates the minimum number of numeric characters required for device password. Valid values 1 to 16 Optional.|
|passwordMinimumSymbolCharacters|Int32|Indicates the minimum number of symbol characters required for device password. Valid values 1 to 16 Optional.|
|passwordMinimumUpperCaseCharacters|Int32|Indicates the minimum number of upper case letter characters required for device password. Valid values 1 to 16 Optional.|
|passwordMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out. Optional.|
|passwordPreviousPasswordCountToBlock|Int32|Indicates the length of password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24 Optional.|
|passwordRequiredType|androidDeviceOwnerRequiredPasswordType|Indicates the minimum password quality required on the device. The possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`. Optional.|
|passwordSignInFailureCountBeforeFactoryReset|Int32|Indicates the number of times a user can enter an incorrect password before the device is wiped. Valid values 4 to 11 Optional.|
|personalProfileAppsAllowInstallFromUnknownSources|Boolean|Indicates whether the user can install apps from unknown sources on the personal profile. Optional.|
|personalProfileCameraBlocked|Boolean|Indicates whether to disable the use of the camera on the personal profile. Optional.|
|personalProfilePersonalApplications|[appListItem](../resources/applistitem.md) collection|Policy applied to applications in the personal profile. This collection can contain a maximum of 500 elements. Optional.|
|personalProfilePlayStoreMode|personalProfilePersonalPlayStoreMode|Used together with PersonalProfilePersonalApplications to control how apps in the personal profile are allowed or blocked. The possible values are: `notConfigured`, `blockedApps`, `allowedApps`. Optional.|
|personalProfileScreenCaptureBlocked|Boolean|Indicates whether to disable the capability to take screenshots on the personal profile. Optional.|
|playStoreMode|androidDeviceOwnerPlayStoreMode|Indicates the Play Store mode of the device. The possible values are: `notConfigured`, `allowList`, `blockList`. Optional.|
|safeBootBlocked|Boolean|Indicates whether or not rebooting the device into safe boot is disabled. Optional.|
|screenCaptureBlocked|Boolean|Indicates whether or not to disable the capability to take screenshots. Optional.|
|securityAllowDebuggingFeatures|Boolean|Indicates whether or not to block the user from enabling debugging features on the device. Optional.|
|securityDeveloperSettingsEnabled|Boolean|Indicates whether or not the user is allowed to access developer settings like developer options and safe boot on the device. Optional.|
|securityRequireVerifyApps|Boolean|Indicates whether or not verify apps is required. Optional.|
|statusBarBlocked|Boolean|Indicates whether or the status bar is disabled, including notifications, quick settings and other screen overlays. Optional.|
|stayOnModes|androidDeviceOwnerBatteryPluggedMode collection|List of modes in which the device's display will stay powered-on. This collection can contain a maximum of 4 elements. The possible values are: `notConfigured`, `ac`, `usb`, `wireless`. Required.|
|storageAllowUsb|Boolean|Indicates whether or not to allow USB mass storage. Optional.|
|storageBlockExternalMedia|Boolean|Indicates whether or not to block external media. Optional.|
|storageBlockUsbFileTransfer|Boolean|Indicates whether or not to block USB file transfer. Optional.|
|systemUpdateInstallType|androidDeviceOwnerSystemUpdateInstallType|The type of system update configuration. The possible values are: `deviceDefault`, `postpone`, `windowed`, `automatic`. Optional.|
|systemUpdateWindowEndMinutesAfterMidnight|Int32|Indicates the number of minutes after midnight that the system update window ends. Valid values 0 to 1440 Optional.|
|systemUpdateWindowStartMinutesAfterMidnight|Int32|Indicates the number of minutes after midnight that the system update window starts. Valid values 0 to 1440 Optional.|
|systemWindowsBlocked|Boolean|Whether or not to block Android system prompt windows, like toasts, phone activities, and system alerts. Optional.|
|usersBlockAdd|Boolean|Indicates whether or not adding users and profiles is disabled. Optional.|
|usersBlockRemove|Boolean|Indicates whether or not to disable removing other users from the device. Optional.|
|volumeBlockAdjustment|Boolean|Indicates whether or not adjusting the master volume is disabled. Optional.|
|vpnAlwaysOnLockdownMode|Boolean|If an always on VPN package name is specified, whether or not to lock network traffic when that VPN is disconnected. Optional.|
|vpnAlwaysOnPackageIdentifier|String|Android app package name for app that will handle an always-on VPN connection. Optional.|
|wifiBlockEditConfigurations|Boolean|Indicates whether or not to block the user from editing the wifi connection settings. Optional.|
|wifiBlockEditPolicyDefinedConfigurations|Boolean|Indicates whether or not to block the user from editing just the networks defined by the policy. Optional.|
|workProfilePasswordExpirationDays|Int32|Indicates the number of days that a work profile password can be set before it expires and a new password will be required. Valid values 1 to 365 Optional.|
|workProfilePasswordMinimumLength|Int32|Indicates the minimum length of the work profile password. Valid values 4 to 16 Optional.|
|workProfilePasswordMinimumLetterCharacters|Int32|Indicates the minimum number of letter characters required for the work profile password. Valid values 1 to 16 Optional.|
|workProfilePasswordMinimumLowerCaseCharacters|Int32|Indicates the minimum number of lower-case characters required for the work profile password. Valid values 1 to 16 Optional.|
|workProfilePasswordMinimumNonLetterCharacters|Int32|Indicates the minimum number of non-letter characters required for the work profile password. Valid values 1 to 16 Optional.|
|workProfilePasswordMinimumNumericCharacters|Int32|Indicates the minimum number of numeric characters required for the work profile password. Valid values 1 to 16 Optional.|
|workProfilePasswordMinimumSymbolCharacters|Int32|Indicates the minimum number of symbol characters required for the work profile password. Valid values 1 to 16 Optional.|
|workProfilePasswordMinimumUpperCaseCharacters|Int32|Indicates the minimum number of upper-case letter characters required for the work profile password. Valid values 1 to 16 Optional.|
|workProfilePasswordPreviousPasswordCountToBlock|Int32|Indicates the length of the work profile password history, where the user will not be able to enter a new password that is the same as any password in the history. Valid values 0 to 24 Optional.|
|workProfilePasswordRequiredType|androidDeviceOwnerRequiredPasswordType|Indicates the minimum password quality required on the work profile password. The possible values are: `deviceDefault`, `required`, `numeric`, `numericComplex`, `alphabetic`, `alphanumeric`, `alphanumericWithSymbols`, `lowSecurityBiometric`, `customPassword`. Optional.|
|workProfilePasswordSignInFailureCountBeforeFactoryReset|Int32|Indicates the number of times a user can enter an incorrect work profile password before the device is wiped. Valid values 4 to 11 Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidDeviceOwnerGeneralDeviceConfiguration](../resources/androiddeviceownergeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androiddeviceownergeneraldeviceconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 7269

{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration",
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
  "accountsBlockModification": "Boolean",
  "appsAllowInstallFromUnknownSources": "Boolean",
  "appsAutoUpdatePolicy": "String",
  "appsDefaultPermissionPolicy": "String",
  "appsRecommendSkippingFirstUseHints": "Boolean",
  "azureAdSharedDeviceDataClearApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "bluetoothBlockConfiguration": "Boolean",
  "bluetoothBlockContactSharing": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "certificateCredentialConfigurationDisabled": "Boolean",
  "dataRoamingBlocked": "Boolean",
  "dateTimeConfigurationBlocked": "Boolean",
  "enrollmentProfile": "String",
  "factoryResetBlocked": "Boolean",
  "factoryResetDeviceAdministratorEmails": [
    "String"
  ],
  "globalProxy": {
    "@odata.type": "microsoft.graph.androidDeviceOwnerGlobalProxy"
  },
  "googleAccountsBlocked": "Boolean",
  "kioskCustomizationDeviceSettingsBlocked": "Boolean",
  "kioskCustomizationPowerButtonActionsBlocked": "Boolean",
  "kioskCustomizationStatusBar": "String",
  "kioskCustomizationSystemErrorWarnings": "Boolean",
  "kioskCustomizationSystemNavigation": "String",
  "kioskModeAppOrderEnabled": "Boolean",
  "kioskModeAppPositions": [
    {
      "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeAppPositionItem"
    }
  ],
  "kioskModeApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "kioskModeAppsInFolderOrderedByName": "Boolean",
  "kioskModeBluetoothConfigurationEnabled": "Boolean",
  "kioskModeDebugMenuEasyAccessEnabled": "Boolean",
  "kioskModeExitCode": "String",
  "kioskModeFlashlightConfigurationEnabled": "Boolean",
  "kioskModeFolderIcon": "String",
  "kioskModeGridHeight": "Integer",
  "kioskModeGridWidth": "Integer",
  "kioskModeIconSize": "String",
  "kioskModeLockHomeScreen": "Boolean",
  "kioskModeManagedFolders": [
    {
      "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeManagedFolder"
    }
  ],
  "kioskModeManagedHomeScreenAutoSignout": "Boolean",
  "kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds": "Integer",
  "kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds": "Integer",
  "kioskModeManagedHomeScreenPinComplexity": "String",
  "kioskModeManagedHomeScreenPinRequired": "Boolean",
  "kioskModeManagedHomeScreenPinRequiredToResume": "Boolean",
  "kioskModeManagedHomeScreenSignInBackground": "String",
  "kioskModeManagedHomeScreenSignInBrandingLogo": "String",
  "kioskModeManagedHomeScreenSignInEnabled": "Boolean",
  "kioskModeManagedSettingsEntryDisabled": "Boolean",
  "kioskModeMediaVolumeConfigurationEnabled": "Boolean",
  "kioskModeScreenOrientation": "String",
  "kioskModeScreenSaverConfigurationEnabled": "Boolean",
  "kioskModeScreenSaverDetectMediaDisabled": "Boolean",
  "kioskModeScreenSaverDisplayTimeInSeconds": "Integer",
  "kioskModeScreenSaverImageUrl": "String",
  "kioskModeScreenSaverStartDelayInSeconds": "Integer",
  "kioskModeShowAppNotificationBadge": "Boolean",
  "kioskModeShowDeviceInfo": "Boolean",
  "kioskModeVirtualHomeButtonEnabled": "Boolean",
  "kioskModeVirtualHomeButtonType": "String",
  "kioskModeWallpaperUrl": "String",
  "kioskModeWifiAllowedSsids": [
    "String"
  ],
  "kioskModeWiFiConfigurationEnabled": "Boolean",
  "microphoneForceMute": "Boolean",
  "microsoftLauncherConfigurationEnabled": "Boolean",
  "microsoftLauncherCustomWallpaperAllowUserModification": "Boolean",
  "microsoftLauncherCustomWallpaperEnabled": "Boolean",
  "microsoftLauncherCustomWallpaperImageUrl": "String",
  "microsoftLauncherDockPresenceAllowUserModification": "Boolean",
  "microsoftLauncherDockPresenceConfiguration": "String",
  "microsoftLauncherFeedAllowUserModification": "Boolean",
  "microsoftLauncherFeedEnabled": "Boolean",
  "microsoftLauncherSearchBarPlacementConfiguration": "String",
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
  "personalProfileAppsAllowInstallFromUnknownSources": "Boolean",
  "personalProfileCameraBlocked": "Boolean",
  "personalProfilePersonalApplications": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "personalProfilePlayStoreMode": "String",
  "personalProfileScreenCaptureBlocked": "Boolean",
  "playStoreMode": "String",
  "safeBootBlocked": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "securityAllowDebuggingFeatures": "Boolean",
  "securityDeveloperSettingsEnabled": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "statusBarBlocked": "Boolean",
  "stayOnModes": [
    "String"
  ],
  "storageAllowUsb": "Boolean",
  "storageBlockExternalMedia": "Boolean",
  "storageBlockUsbFileTransfer": "Boolean",
  "systemUpdateInstallType": "String",
  "systemUpdateWindowEndMinutesAfterMidnight": "Integer",
  "systemUpdateWindowStartMinutesAfterMidnight": "Integer",
  "systemWindowsBlocked": "Boolean",
  "usersBlockAdd": "Boolean",
  "usersBlockRemove": "Boolean",
  "volumeBlockAdjustment": "Boolean",
  "vpnAlwaysOnLockdownMode": "Boolean",
  "vpnAlwaysOnPackageIdentifier": "String",
  "wifiBlockEditConfigurations": "Boolean",
  "wifiBlockEditPolicyDefinedConfigurations": "Boolean",
  "workProfilePasswordExpirationDays": "Integer",
  "workProfilePasswordMinimumLength": "Integer",
  "workProfilePasswordMinimumLetterCharacters": "Integer",
  "workProfilePasswordMinimumLowerCaseCharacters": "Integer",
  "workProfilePasswordMinimumNonLetterCharacters": "Integer",
  "workProfilePasswordMinimumNumericCharacters": "Integer",
  "workProfilePasswordMinimumSymbolCharacters": "Integer",
  "workProfilePasswordMinimumUpperCaseCharacters": "Integer",
  "workProfilePasswordPreviousPasswordCountToBlock": "Integer",
  "workProfilePasswordRequiredType": "String",
  "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerGeneralDeviceConfiguration",
  "id": "b5e2d985-d985-b5e2-85d9-e2b585d9e2b5",
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
  "accountsBlockModification": "Boolean",
  "appsAllowInstallFromUnknownSources": "Boolean",
  "appsAutoUpdatePolicy": "String",
  "appsDefaultPermissionPolicy": "String",
  "appsRecommendSkippingFirstUseHints": "Boolean",
  "azureAdSharedDeviceDataClearApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "bluetoothBlockConfiguration": "Boolean",
  "bluetoothBlockContactSharing": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockWiFiTethering": "Boolean",
  "certificateCredentialConfigurationDisabled": "Boolean",
  "dataRoamingBlocked": "Boolean",
  "dateTimeConfigurationBlocked": "Boolean",
  "enrollmentProfile": "String",
  "factoryResetBlocked": "Boolean",
  "factoryResetDeviceAdministratorEmails": [
    "String"
  ],
  "globalProxy": {
    "@odata.type": "microsoft.graph.androidDeviceOwnerGlobalProxy"
  },
  "googleAccountsBlocked": "Boolean",
  "kioskCustomizationDeviceSettingsBlocked": "Boolean",
  "kioskCustomizationPowerButtonActionsBlocked": "Boolean",
  "kioskCustomizationStatusBar": "String",
  "kioskCustomizationSystemErrorWarnings": "Boolean",
  "kioskCustomizationSystemNavigation": "String",
  "kioskModeAppOrderEnabled": "Boolean",
  "kioskModeAppPositions": [
    {
      "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeAppPositionItem"
    }
  ],
  "kioskModeApps": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "kioskModeAppsInFolderOrderedByName": "Boolean",
  "kioskModeBluetoothConfigurationEnabled": "Boolean",
  "kioskModeDebugMenuEasyAccessEnabled": "Boolean",
  "kioskModeExitCode": "String",
  "kioskModeFlashlightConfigurationEnabled": "Boolean",
  "kioskModeFolderIcon": "String",
  "kioskModeGridHeight": "Integer",
  "kioskModeGridWidth": "Integer",
  "kioskModeIconSize": "String",
  "kioskModeLockHomeScreen": "Boolean",
  "kioskModeManagedFolders": [
    {
      "@odata.type": "microsoft.graph.androidDeviceOwnerKioskModeManagedFolder"
    }
  ],
  "kioskModeManagedHomeScreenAutoSignout": "Boolean",
  "kioskModeManagedHomeScreenInactiveSignOutDelayInSeconds": "Integer",
  "kioskModeManagedHomeScreenInactiveSignOutNoticeInSeconds": "Integer",
  "kioskModeManagedHomeScreenPinComplexity": "String",
  "kioskModeManagedHomeScreenPinRequired": "Boolean",
  "kioskModeManagedHomeScreenPinRequiredToResume": "Boolean",
  "kioskModeManagedHomeScreenSignInBackground": "String",
  "kioskModeManagedHomeScreenSignInBrandingLogo": "String",
  "kioskModeManagedHomeScreenSignInEnabled": "Boolean",
  "kioskModeManagedSettingsEntryDisabled": "Boolean",
  "kioskModeMediaVolumeConfigurationEnabled": "Boolean",
  "kioskModeScreenOrientation": "String",
  "kioskModeScreenSaverConfigurationEnabled": "Boolean",
  "kioskModeScreenSaverDetectMediaDisabled": "Boolean",
  "kioskModeScreenSaverDisplayTimeInSeconds": "Integer",
  "kioskModeScreenSaverImageUrl": "String",
  "kioskModeScreenSaverStartDelayInSeconds": "Integer",
  "kioskModeShowAppNotificationBadge": "Boolean",
  "kioskModeShowDeviceInfo": "Boolean",
  "kioskModeVirtualHomeButtonEnabled": "Boolean",
  "kioskModeVirtualHomeButtonType": "String",
  "kioskModeWallpaperUrl": "String",
  "kioskModeWifiAllowedSsids": [
    "String"
  ],
  "kioskModeWiFiConfigurationEnabled": "Boolean",
  "microphoneForceMute": "Boolean",
  "microsoftLauncherConfigurationEnabled": "Boolean",
  "microsoftLauncherCustomWallpaperAllowUserModification": "Boolean",
  "microsoftLauncherCustomWallpaperEnabled": "Boolean",
  "microsoftLauncherCustomWallpaperImageUrl": "String",
  "microsoftLauncherDockPresenceAllowUserModification": "Boolean",
  "microsoftLauncherDockPresenceConfiguration": "String",
  "microsoftLauncherFeedAllowUserModification": "Boolean",
  "microsoftLauncherFeedEnabled": "Boolean",
  "microsoftLauncherSearchBarPlacementConfiguration": "String",
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
  "personalProfileAppsAllowInstallFromUnknownSources": "Boolean",
  "personalProfileCameraBlocked": "Boolean",
  "personalProfilePersonalApplications": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "personalProfilePlayStoreMode": "String",
  "personalProfileScreenCaptureBlocked": "Boolean",
  "playStoreMode": "String",
  "safeBootBlocked": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "securityAllowDebuggingFeatures": "Boolean",
  "securityDeveloperSettingsEnabled": "Boolean",
  "securityRequireVerifyApps": "Boolean",
  "statusBarBlocked": "Boolean",
  "stayOnModes": [
    "String"
  ],
  "storageAllowUsb": "Boolean",
  "storageBlockExternalMedia": "Boolean",
  "storageBlockUsbFileTransfer": "Boolean",
  "systemUpdateInstallType": "String",
  "systemUpdateWindowEndMinutesAfterMidnight": "Integer",
  "systemUpdateWindowStartMinutesAfterMidnight": "Integer",
  "systemWindowsBlocked": "Boolean",
  "usersBlockAdd": "Boolean",
  "usersBlockRemove": "Boolean",
  "volumeBlockAdjustment": "Boolean",
  "vpnAlwaysOnLockdownMode": "Boolean",
  "vpnAlwaysOnPackageIdentifier": "String",
  "wifiBlockEditConfigurations": "Boolean",
  "wifiBlockEditPolicyDefinedConfigurations": "Boolean",
  "workProfilePasswordExpirationDays": "Integer",
  "workProfilePasswordMinimumLength": "Integer",
  "workProfilePasswordMinimumLetterCharacters": "Integer",
  "workProfilePasswordMinimumLowerCaseCharacters": "Integer",
  "workProfilePasswordMinimumNonLetterCharacters": "Integer",
  "workProfilePasswordMinimumNumericCharacters": "Integer",
  "workProfilePasswordMinimumSymbolCharacters": "Integer",
  "workProfilePasswordMinimumUpperCaseCharacters": "Integer",
  "workProfilePasswordPreviousPasswordCountToBlock": "Integer",
  "workProfilePasswordRequiredType": "String",
  "workProfilePasswordSignInFailureCountBeforeFactoryReset": "Integer"
}
```

