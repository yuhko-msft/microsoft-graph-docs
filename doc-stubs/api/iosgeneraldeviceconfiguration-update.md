---
title: "Update iosGeneralDeviceConfiguration"
description: "Update the properties of an iosGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update iosGeneralDeviceConfiguration
Namespace: microsoft.graph



Update the properties of an [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.iosGeneralDeviceConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object.

The following table shows the properties that are required when you update the [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md).

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
|accountBlockModification|Boolean|Indicates whether or not to allow account modification when the device is in supervised mode.|
|activationLockAllowWhenSupervised|Boolean|Indicates whether or not to allow activation lock when the device is in the supervised mode.|
|airDropBlocked|Boolean|Indicates whether or not to allow AirDrop when the device is in supervised mode.|
|airDropForceUnmanagedDropTarget|Boolean|Indicates whether or not to cause AirDrop to be considered an unmanaged drop target (iOS 9.0 and later).|
|airPlayForcePairingPasswordForOutgoingRequests|Boolean|Indicates whether or not to enforce all devices receiving AirPlay requests from this device to use a pairing password.|
|airPrintBlockCredentialsStorage|Boolean|Indicates whether or not keychain storage of username and password for Airprint is blocked (iOS 11.0 and later).|
|airPrintBlocked|Boolean|Indicates whether or not AirPrint is blocked (iOS 11.0 and later).|
|airPrintBlockiBeaconDiscovery|Boolean|Indicates whether or not iBeacon discovery of AirPrint printers is blocked. This prevents spurious AirPrint Bluetooth beacons from phishing for network traffic (iOS 11.0 and later).|
|airPrintForceTrustedTLS|Boolean|Indicates if trusted certificates are required for TLS printing communication (iOS 11.0 and later).|
|appClipsBlocked|Boolean|Prevents a user from adding any App Clips and removes any existing App Clips on the device.|
|appleNewsBlocked|Boolean|Indicates whether or not to block the user from using News when the device is in supervised mode (iOS 9.0 and later).|
|applePersonalizedAdsBlocked|Boolean|Limits Apple personalized advertising when true. Available in iOS 14 and later.|
|appleWatchBlockPairing|Boolean|Indicates whether or not to allow Apple Watch pairing when the device is in supervised mode (iOS 9.0 and later).|
|appleWatchForceWristDetection|Boolean|Indicates whether or not to force a paired Apple Watch to use Wrist Detection (iOS 8.2 and later).|
|appRemovalBlocked|Boolean|Indicates if the removal of apps is allowed.|
|appsSingleAppModeList|[appListItem](../resources/applistitem.md) collection|Gets or sets the list of iOS apps allowed to autonomously enter Single App Mode. Supervised only. iOS 7.0 and later. This collection can contain a maximum of 500 elements.|
|appStoreBlockAutomaticDownloads|Boolean|Indicates whether or not to block the automatic downloading of apps purchased on other devices when the device is in supervised mode (iOS 9.0 and later).|
|appStoreBlocked|Boolean|Indicates whether or not to block the user from using the App Store. Requires a supervised device for iOS 13 and later.|
|appStoreBlockInAppPurchases|Boolean|Indicates whether or not to block the user from making in app purchases.|
|appStoreBlockUIAppInstallation|Boolean|Indicates whether or not to block the App Store app, not restricting installation through Host apps. Applies to supervised mode only (iOS 9.0 and later).|
|appStoreRequirePassword|Boolean|Indicates whether or not to require a password when using the app store.|
|appsVisibilityList|[appListItem](../resources/applistitem.md) collection|List of apps in the visibility list (either visible/launchable apps list or hidden/unlaunchable apps list, controlled by AppsVisibilityListType) (iOS 9.3 and later). This collection can contain a maximum of 10000 elements.|
|appsVisibilityListType|appListType|Type of list that is in the AppsVisibilityList. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|autoFillForceAuthentication|Boolean|Indicates whether or not to force user authentication before autofilling passwords and credit card information in Safari and other apps on supervised devices.|
|blockSystemAppRemoval|Boolean|Indicates whether or not the removal of system apps from the device is blocked on a supervised device (iOS 11.0 and later).|
|bluetoothBlockModification|Boolean|Indicates whether or not to allow modification of Bluetooth settings when the device is in supervised mode (iOS 10.0 and later).|
|cameraBlocked|Boolean|Indicates whether or not to block the user from accessing the camera of the device. Requires a supervised device for iOS 13 and later.|
|cellularBlockDataRoaming|Boolean|Indicates whether or not to block data roaming.|
|cellularBlockGlobalBackgroundFetchWhileRoaming|Boolean|Indicates whether or not to block global background fetch while roaming.|
|cellularBlockPerAppDataModification|Boolean|Indicates whether or not to allow changes to cellular app data usage settings when the device is in supervised mode.|
|cellularBlockPersonalHotspot|Boolean|Indicates whether or not to block Personal Hotspot.|
|cellularBlockPersonalHotspotModification|Boolean|Indicates whether or not to block the user from modifying the personal hotspot setting (iOS 12.2 or later).|
|cellularBlockPlanModification|Boolean|Indicates whether or not to allow users to change the settings of the cellular plan on a supervised device.|
|cellularBlockVoiceRoaming|Boolean|Indicates whether or not to block voice roaming.|
|certificatesBlockUntrustedTlsCertificates|Boolean|Indicates whether or not to block untrusted TLS certificates.|
|classroomAppBlockRemoteScreenObservation|Boolean|Indicates whether or not to allow remote screen observation by Classroom app when the device is in supervised mode (iOS 9.3 and later).|
|classroomAppForceUnpromptedScreenObservation|Boolean|Indicates whether or not to automatically give permission to the teacher of a managed course on the Classroom app to view a student's screen without prompting when the device is in supervised mode.|
|classroomForceAutomaticallyJoinClasses|Boolean|Indicates whether or not to automatically give permission to the teacher's requests, without prompting the student, when the device is in supervised mode.|
|classroomForceRequestPermissionToLeaveClasses|Boolean|Indicates whether a student enrolled in an unmanaged course via Classroom will request permission from the teacher when attempting to leave the course (iOS 11.3 and later).|
|classroomForceUnpromptedAppAndDeviceLock|Boolean|Indicates whether or not to allow the teacher to lock apps or the device without prompting the student. Supervised only.|
|compliantAppListType|appListType|List that is in the AppComplianceList. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|compliantAppsList|[appListItem](../resources/applistitem.md) collection|List of apps in the compliance (either allow list or block list, controlled by CompliantAppListType). This collection can contain a maximum of 10000 elements.|
|configurationProfileBlockChanges|Boolean|Indicates whether or not to block the user from installing configuration profiles and certificates interactively when the device is in supervised mode.|
|contactsAllowManagedToUnmanagedWrite|Boolean|Indicates whether or not managed apps can write contacts to unmanaged contacts accounts (iOS 12.0 and later).|
|contactsAllowUnmanagedToManagedRead|Boolean|Indicates whether or not unmanaged apps can read from managed contacts accounts (iOS 12.0 or later).|
|continuousPathKeyboardBlocked|Boolean|Indicates whether or not to block the continuous path keyboard when the device is supervised (iOS 13 or later).|
|dateAndTimeForceSetAutomatically|Boolean|Indicates whether or not the Date and Time "Set Automatically" feature is enabled and cannot be turned off by the user (iOS 12.0 and later).|
|definitionLookupBlocked|Boolean|Indicates whether or not to block definition lookup when the device is in supervised mode (iOS 8.1.3 and later ).|
|deviceBlockEnableRestrictions|Boolean|Indicates whether or not to allow the user to enables restrictions in the device settings when the device is in supervised mode.|
|deviceBlockEraseContentAndSettings|Boolean|Indicates whether or not to allow the use of the 'Erase all content and settings' option on the device when the device is in supervised mode.|
|deviceBlockNameModification|Boolean|Indicates whether or not to allow device name modification when the device is in supervised mode (iOS 9.0 and later).|
|diagnosticDataBlockSubmission|Boolean|Indicates whether or not to block diagnostic data submission.|
|diagnosticDataBlockSubmissionModification|Boolean|Indicates whether or not to allow diagnostics submission settings modification when the device is in supervised mode (iOS 9.3.2 and later).|
|documentsBlockManagedDocumentsInUnmanagedApps|Boolean|Indicates whether or not to block the user from viewing managed documents in unmanaged apps.|
|documentsBlockUnmanagedDocumentsInManagedApps|Boolean|Indicates whether or not to block the user from viewing unmanaged documents in managed apps.|
|emailInDomainSuffixes|String collection|An email address lacking a suffix that matches any of these strings will be considered out-of-domain.|
|enterpriseAppBlockTrust|Boolean|Indicates whether or not to block the user from trusting an enterprise app.|
|enterpriseAppBlockTrustModification|Boolean|\[Deprecated\] Configuring this setting and setting the value to 'true' has no effect on the device.|
|enterpriseBookBlockBackup|Boolean|Indicates whether or not Enterprise book back up is blocked.|
|enterpriseBookBlockMetadataSync|Boolean|Indicates whether or not Enterprise book notes and highlights sync is blocked.|
|esimBlockModification|Boolean|Indicates whether or not to allow the addition or removal of cellular plans on the eSIM of a supervised device.|
|faceTimeBlocked|Boolean|Indicates whether or not to block the user from using FaceTime. Requires a supervised device for iOS 13 and later.|
|filesNetworkDriveAccessBlocked|Boolean|Indicates if devices can access files or other resources on a network server using the Server Message Block (SMB) protocol. Available for devices running iOS and iPadOS, versions 13.0 and later.|
|filesUsbDriveAccessBlocked|Boolean|Indicates if sevices with access can connect to and open files on a USB drive. Available for devices running iOS and iPadOS, versions 13.0 and later.|
|findMyDeviceInFindMyAppBlocked|Boolean|Indicates whether or not to block Find My Device when the device is supervised (iOS 13 or later).|
|findMyFriendsBlocked|Boolean|Indicates whether or not to block changes to Find My Friends when the device is in supervised mode.|
|findMyFriendsInFindMyAppBlocked|Boolean|Indicates whether or not to block Find My Friends when the device is supervised (iOS 13 or later).|
|gameCenterBlocked|Boolean|Indicates whether or not to block the user from using Game Center when the device is in supervised mode.|
|gamingBlockGameCenterFriends|Boolean|Indicates whether or not to block the user from having friends in Game Center. Requires a supervised device for iOS 13 and later.|
|gamingBlockMultiplayer|Boolean|Indicates whether or not to block the user from using multiplayer gaming. Requires a supervised device for iOS 13 and later.|
|hostPairingBlocked|Boolean|indicates whether or not to allow host pairing to control the devices an iOS device can pair with when the iOS device is in supervised mode.|
|iBooksStoreBlocked|Boolean|Indicates whether or not to block the user from using the iBooks Store when the device is in supervised mode.|
|iBooksStoreBlockErotica|Boolean|Indicates whether or not to block the user from downloading media from the iBookstore that has been tagged as erotica.|
|iCloudBlockActivityContinuation|Boolean|Indicates whether or not to block the user from continuing work they started on iOS device to another iOS or macOS device.|
|iCloudBlockBackup|Boolean|Indicates whether or not to block iCloud backup. Requires a supervised device for iOS 13 and later.|
|iCloudBlockDocumentSync|Boolean|Indicates whether or not to block iCloud document sync. Requires a supervised device for iOS 13 and later.|
|iCloudBlockManagedAppsSync|Boolean|Indicates whether or not to block Managed Apps Cloud Sync.|
|iCloudBlockPhotoLibrary|Boolean|Indicates whether or not to block iCloud Photo Library.|
|iCloudBlockPhotoStreamSync|Boolean|Indicates whether or not to block iCloud Photo Stream Sync.|
|iCloudBlockSharedPhotoStream|Boolean|Indicates whether or not to block Shared Photo Stream.|
|iCloudRequireEncryptedBackup|Boolean|Indicates whether or not to require backups to iCloud be encrypted.|
|iTunesBlocked|Boolean|Indicates whether or not to block the iTunes app. Requires a supervised device for iOS 13 and later.|
|iTunesBlockExplicitContent|Boolean|Indicates whether or not to block the user from accessing explicit content in iTunes and the App Store. Requires a supervised device for iOS 13 and later.|
|iTunesBlockMusicService|Boolean|Indicates whether or not to block Music service and revert Music app to classic mode when the device is in supervised mode (iOS 9.3 and later and macOS 10.12 and later).|
|iTunesBlockRadio|Boolean|Indicates whether or not to block the user from using iTunes Radio when the device is in supervised mode (iOS 9.3 and later).|
|keyboardBlockAutoCorrect|Boolean|Indicates whether or not to block keyboard auto-correction when the device is in supervised mode (iOS 8.1.3 and later).|
|keyboardBlockDictation|Boolean|Indicates whether or not to block the user from using dictation input when the device is in supervised mode.|
|keyboardBlockPredictive|Boolean|Indicates whether or not to block predictive keyboards when device is in supervised mode (iOS 8.1.3 and later).|
|keyboardBlockShortcuts|Boolean|Indicates whether or not to block keyboard shortcuts when the device is in supervised mode (iOS 9.0 and later).|
|keyboardBlockSpellCheck|Boolean|Indicates whether or not to block keyboard spell-checking when the device is in supervised mode (iOS 8.1.3 and later).|
|keychainBlockCloudSync|Boolean|Indicates whether or not iCloud keychain synchronization is blocked. Requires a supervised device for iOS 13 and later.|
|kioskModeAllowAssistiveSpeak|Boolean|Indicates whether or not to allow assistive speak while in kiosk mode.|
|kioskModeAllowAssistiveTouchSettings|Boolean|Indicates whether or not to allow access to the Assistive Touch Settings while in kiosk mode.|
|kioskModeAllowAutoLock|Boolean|Indicates whether or not to allow device auto lock while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockAutoLock instead.|
|kioskModeAllowColorInversionSettings|Boolean|Indicates whether or not to allow access to the Color Inversion Settings while in kiosk mode.|
|kioskModeAllowRingerSwitch|Boolean|Indicates whether or not to allow use of the ringer switch while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockRingerSwitch instead.|
|kioskModeAllowScreenRotation|Boolean|Indicates whether or not to allow screen rotation while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockScreenRotation instead.|
|kioskModeAllowSleepButton|Boolean|Indicates whether or not to allow use of the sleep button while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockSleepButton instead.|
|kioskModeAllowTouchscreen|Boolean|Indicates whether or not to allow use of the touchscreen while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockTouchscreen instead.|
|kioskModeAllowVoiceControlModification|Boolean|Indicates whether or not to allow the user to toggle voice control in kiosk mode.|
|kioskModeAllowVoiceOverSettings|Boolean|Indicates whether or not to allow access to the voice over settings while in kiosk mode.|
|kioskModeAllowVolumeButtons|Boolean|Indicates whether or not to allow use of the volume buttons while in kiosk mode. This property's functionality is redundant with the OS default and is deprecated. Use KioskModeBlockVolumeButtons instead.|
|kioskModeAllowZoomSettings|Boolean|Indicates whether or not to allow access to the zoom settings while in kiosk mode.|
|kioskModeAppStoreUrl|String|URL in the app store to the app to use for kiosk mode. Use if KioskModeManagedAppId is not known.|
|kioskModeAppType|iosKioskModeAppType|Type of app to run in kiosk mode. Possible values are: `notConfigured`, `appStoreApp`, `managedApp`, `builtInApp`.|
|kioskModeBlockAutoLock|Boolean|Indicates whether or not to block device auto lock while in kiosk mode.|
|kioskModeBlockRingerSwitch|Boolean|Indicates whether or not to block use of the ringer switch while in kiosk mode.|
|kioskModeBlockScreenRotation|Boolean|Indicates whether or not to block screen rotation while in kiosk mode.|
|kioskModeBlockSleepButton|Boolean|Indicates whether or not to block use of the sleep button while in kiosk mode.|
|kioskModeBlockTouchscreen|Boolean|Indicates whether or not to block use of the touchscreen while in kiosk mode.|
|kioskModeBlockVolumeButtons|Boolean|Indicates whether or not to block the volume buttons while in Kiosk Mode.|
|kioskModeBuiltInAppId|String|ID for built-in apps to use for kiosk mode. Used when KioskModeManagedAppId and KioskModeAppStoreUrl are not set.|
|kioskModeEnableVoiceControl|Boolean|Indicates whether or not to enable voice control in kiosk mode.|
|kioskModeManagedAppId|String|Managed app id of the app to use for kiosk mode. If KioskModeManagedAppId is specified then KioskModeAppStoreUrl will be ignored.|
|kioskModeRequireAssistiveTouch|Boolean|Indicates whether or not to require assistive touch while in kiosk mode.|
|kioskModeRequireColorInversion|Boolean|Indicates whether or not to require color inversion while in kiosk mode.|
|kioskModeRequireMonoAudio|Boolean|Indicates whether or not to require mono audio while in kiosk mode.|
|kioskModeRequireVoiceOver|Boolean|Indicates whether or not to require voice over while in kiosk mode.|
|kioskModeRequireZoom|Boolean|Indicates whether or not to require zoom while in kiosk mode.|
|lockScreenBlockControlCenter|Boolean|Indicates whether or not to block the user from using control center on the lock screen.|
|lockScreenBlockNotificationView|Boolean|Indicates whether or not to block the user from using the notification view on the lock screen.|
|lockScreenBlockPassbook|Boolean|Indicates whether or not to block the user from using passbook when the device is locked.|
|lockScreenBlockTodayView|Boolean|Indicates whether or not to block the user from using the Today View on the lock screen.|
|mediaContentRatingApps|ratingAppsType|Media content rating settings for Apps. Possible values are: `allAllowed`, `allBlocked`, `agesAbove4`, `agesAbove9`, `agesAbove12`, `agesAbove17`.|
|mediaContentRatingAustralia|[mediaContentRatingAustralia](../resources/mediacontentratingaustralia.md)|Media content rating settings for Australia|
|mediaContentRatingCanada|[mediaContentRatingCanada](../resources/mediacontentratingcanada.md)|Media content rating settings for Canada|
|mediaContentRatingFrance|[mediaContentRatingFrance](../resources/mediacontentratingfrance.md)|Media content rating settings for France|
|mediaContentRatingGermany|[mediaContentRatingGermany](../resources/mediacontentratinggermany.md)|Media content rating settings for Germany|
|mediaContentRatingIreland|[mediaContentRatingIreland](../resources/mediacontentratingireland.md)|Media content rating settings for Ireland|
|mediaContentRatingJapan|[mediaContentRatingJapan](../resources/mediacontentratingjapan.md)|Media content rating settings for Japan|
|mediaContentRatingNewZealand|[mediaContentRatingNewZealand](../resources/mediacontentratingnewzealand.md)|Media content rating settings for New Zealand|
|mediaContentRatingUnitedKingdom|[mediaContentRatingUnitedKingdom](../resources/mediacontentratingunitedkingdom.md)|Media content rating settings for United Kingdom|
|mediaContentRatingUnitedStates|[mediaContentRatingUnitedStates](../resources/mediacontentratingunitedstates.md)|Media content rating settings for United States|
|messagesBlocked|Boolean|Indicates whether or not to block the user from using the Messages app on the supervised device.|
|networkUsageRules|[iosNetworkUsageRule](../resources/iosnetworkusagerule.md) collection|List of managed apps and the network rules that applies to them. This collection can contain a maximum of 1000 elements.|
|notificationsBlockSettingsModification|Boolean|Indicates whether or not to allow notifications settings modification (iOS 9.3 and later).|
|passcodeBlockFingerprintModification|Boolean|Block modification of registered Touch ID fingerprints when in supervised mode.|
|passcodeBlockFingerprintUnlock|Boolean|Indicates whether or not to block fingerprint unlock.|
|passcodeBlockModification|Boolean|Indicates whether or not to allow passcode modification on the supervised device (iOS 9.0 and later).|
|passcodeBlockSimple|Boolean|Indicates whether or not to block simple passcodes.|
|passcodeExpirationDays|Int32|Number of days before the passcode expires. Valid values 1 to 65535|
|passcodeMinimumCharacterSetCount|Int32|Number of character sets a passcode must contain. Valid values 0 to 4|
|passcodeMinimumLength|Int32|Minimum length of passcode. Valid values 4 to 14|
|passcodeMinutesOfInactivityBeforeLock|Int32|Minutes of inactivity before a passcode is required.|
|passcodeMinutesOfInactivityBeforeScreenTimeout|Int32|Minutes of inactivity before the screen times out.|
|passcodePreviousPasscodeBlockCount|Int32|Number of previous passcodes to block. Valid values 1 to 24|
|passcodeRequired|Boolean|Indicates whether or not to require a passcode.|
|passcodeRequiredType|requiredPasswordType|Type of passcode that is required. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passcodeSignInFailureCountBeforeWipe|Int32|Number of sign in failures allowed before wiping the device. Valid values 2 to 11|
|passwordBlockAirDropSharing|Boolean|Indicates whether or not to block sharing passwords with the AirDrop passwords feature iOS 12.0 and later).|
|passwordBlockAutoFill|Boolean|Indicates if the AutoFill passwords feature is allowed (iOS 12.0 and later).|
|passwordBlockProximityRequests|Boolean|Indicates whether or not to block requesting passwords from nearby devices (iOS 12.0 and later).|
|pkiBlockOTAUpdates|Boolean|Indicates whether or not over-the-air PKI updates are blocked. Setting this restriction to false does not disable CRL and OCSP checks (iOS 7.0 and later).|
|podcastsBlocked|Boolean|Indicates whether or not to block the user from using podcasts on the supervised device (iOS 8.0 and later).|
|privacyForceLimitAdTracking|Boolean|Indicates if ad tracking is limited.(iOS 7.0 and later).|
|proximityBlockSetupToNewDevice|Boolean|Indicates whether or not to enable the prompt to setup nearby devices with a supervised device.|
|safariBlockAutofill|Boolean|Indicates whether or not to block the user from using Auto fill in Safari. Requires a supervised device for iOS 13 and later.|
|safariBlocked|Boolean|Indicates whether or not to block the user from using Safari. Requires a supervised device for iOS 13 and later.|
|safariBlockJavaScript|Boolean|Indicates whether or not to block JavaScript in Safari.|
|safariBlockPopups|Boolean|Indicates whether or not to block popups in Safari.|
|safariCookieSettings|webBrowserCookieSettings|Cookie settings for Safari. Possible values are: `browserDefault`, `blockAlways`, `allowCurrentWebSite`, `allowFromWebsitesVisited`, `allowAlways`.|
|safariManagedDomains|String collection|URLs matching the patterns listed here will be considered managed.|
|safariPasswordAutoFillDomains|String collection|Users can save passwords in Safari only from URLs matching the patterns listed here. Applies to devices in supervised mode (iOS 9.3 and later).|
|safariRequireFraudWarning|Boolean|Indicates whether or not to require fraud warning in Safari.|
|screenCaptureBlocked|Boolean|Indicates whether or not to block the user from taking Screenshots.|
|sharedDeviceBlockTemporarySessions|Boolean|Indicates whether or not to block temporary sessions on Shared iPads (iOS 13.4 or later).|
|siriBlocked|Boolean|Indicates whether or not to block the user from using Siri.|
|siriBlockedWhenLocked|Boolean|Indicates whether or not to block the user from using Siri when locked.|
|siriBlockUserGeneratedContent|Boolean|Indicates whether or not to block Siri from querying user-generated content when used on a supervised device.|
|siriRequireProfanityFilter|Boolean|Indicates whether or not to prevent Siri from dictating, or speaking profane language on supervised device.|
|softwareUpdatesEnforcedDelayInDays|Int32|Sets how many days a software update will be delyed for a supervised device. Valid values 0 to 90|
|softwareUpdatesForceDelayed|Boolean|Indicates whether or not to delay user visibility of software updates when the device is in supervised mode.|
|spotlightBlockInternetResults|Boolean|Indicates whether or not to block Spotlight search from returning internet results on supervised device.|
|usbRestrictedModeBlocked|Boolean|Indicates if connecting to USB accessories while the device is locked is allowed (iOS 11.4.1 and later).|
|voiceDialingBlocked|Boolean|Indicates whether or not to block voice dialing.|
|vpnBlockCreation|Boolean|Indicates whether or not the creation of VPN configurations is blocked (iOS 11.0 and later).|
|wallpaperBlockModification|Boolean|Indicates whether or not to allow wallpaper modification on supervised device (iOS 9.0 and later) .|
|wiFiConnectOnlyToConfiguredNetworks|Boolean|Indicates whether or not to force the device to use only Wi-Fi networks from configuration profiles when the device is in supervised mode.|
|wifiPowerOnForced|Boolean|Indicates whether or not Wi-Fi remains on, even when device is in airplane mode. Available for devices running iOS and iPadOS, versions 13.0 and later.|



## Response

If successful, this method returns a `200 OK` response code and an updated [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_iosgeneraldeviceconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.iosGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 9404

{
  "@odata.type": "#microsoft.graph.iosGeneralDeviceConfiguration",
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
  "accountBlockModification": "Boolean",
  "activationLockAllowWhenSupervised": "Boolean",
  "airDropBlocked": "Boolean",
  "airDropForceUnmanagedDropTarget": "Boolean",
  "airPlayForcePairingPasswordForOutgoingRequests": "Boolean",
  "airPrintBlockCredentialsStorage": "Boolean",
  "airPrintBlocked": "Boolean",
  "airPrintBlockiBeaconDiscovery": "Boolean",
  "airPrintForceTrustedTLS": "Boolean",
  "appClipsBlocked": "Boolean",
  "appleNewsBlocked": "Boolean",
  "applePersonalizedAdsBlocked": "Boolean",
  "appleWatchBlockPairing": "Boolean",
  "appleWatchForceWristDetection": "Boolean",
  "appRemovalBlocked": "Boolean",
  "appsSingleAppModeList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appStoreBlockAutomaticDownloads": "Boolean",
  "appStoreBlocked": "Boolean",
  "appStoreBlockInAppPurchases": "Boolean",
  "appStoreBlockUIAppInstallation": "Boolean",
  "appStoreRequirePassword": "Boolean",
  "appsVisibilityList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsVisibilityListType": "String",
  "autoFillForceAuthentication": "Boolean",
  "blockSystemAppRemoval": "Boolean",
  "bluetoothBlockModification": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockDataRoaming": "Boolean",
  "cellularBlockGlobalBackgroundFetchWhileRoaming": "Boolean",
  "cellularBlockPerAppDataModification": "Boolean",
  "cellularBlockPersonalHotspot": "Boolean",
  "cellularBlockPersonalHotspotModification": "Boolean",
  "cellularBlockPlanModification": "Boolean",
  "cellularBlockVoiceRoaming": "Boolean",
  "certificatesBlockUntrustedTlsCertificates": "Boolean",
  "classroomAppBlockRemoteScreenObservation": "Boolean",
  "classroomAppForceUnpromptedScreenObservation": "Boolean",
  "classroomForceAutomaticallyJoinClasses": "Boolean",
  "classroomForceRequestPermissionToLeaveClasses": "Boolean",
  "classroomForceUnpromptedAppAndDeviceLock": "Boolean",
  "compliantAppListType": "String",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "configurationProfileBlockChanges": "Boolean",
  "contactsAllowManagedToUnmanagedWrite": "Boolean",
  "contactsAllowUnmanagedToManagedRead": "Boolean",
  "continuousPathKeyboardBlocked": "Boolean",
  "dateAndTimeForceSetAutomatically": "Boolean",
  "definitionLookupBlocked": "Boolean",
  "deviceBlockEnableRestrictions": "Boolean",
  "deviceBlockEraseContentAndSettings": "Boolean",
  "deviceBlockNameModification": "Boolean",
  "diagnosticDataBlockSubmission": "Boolean",
  "diagnosticDataBlockSubmissionModification": "Boolean",
  "documentsBlockManagedDocumentsInUnmanagedApps": "Boolean",
  "documentsBlockUnmanagedDocumentsInManagedApps": "Boolean",
  "emailInDomainSuffixes": [
    "String"
  ],
  "enterpriseAppBlockTrust": "Boolean",
  "enterpriseAppBlockTrustModification": "Boolean",
  "enterpriseBookBlockBackup": "Boolean",
  "enterpriseBookBlockMetadataSync": "Boolean",
  "esimBlockModification": "Boolean",
  "faceTimeBlocked": "Boolean",
  "filesNetworkDriveAccessBlocked": "Boolean",
  "filesUsbDriveAccessBlocked": "Boolean",
  "findMyDeviceInFindMyAppBlocked": "Boolean",
  "findMyFriendsBlocked": "Boolean",
  "findMyFriendsInFindMyAppBlocked": "Boolean",
  "gameCenterBlocked": "Boolean",
  "gamingBlockGameCenterFriends": "Boolean",
  "gamingBlockMultiplayer": "Boolean",
  "hostPairingBlocked": "Boolean",
  "iBooksStoreBlocked": "Boolean",
  "iBooksStoreBlockErotica": "Boolean",
  "iCloudBlockActivityContinuation": "Boolean",
  "iCloudBlockBackup": "Boolean",
  "iCloudBlockDocumentSync": "Boolean",
  "iCloudBlockManagedAppsSync": "Boolean",
  "iCloudBlockPhotoLibrary": "Boolean",
  "iCloudBlockPhotoStreamSync": "Boolean",
  "iCloudBlockSharedPhotoStream": "Boolean",
  "iCloudRequireEncryptedBackup": "Boolean",
  "iTunesBlocked": "Boolean",
  "iTunesBlockExplicitContent": "Boolean",
  "iTunesBlockMusicService": "Boolean",
  "iTunesBlockRadio": "Boolean",
  "keyboardBlockAutoCorrect": "Boolean",
  "keyboardBlockDictation": "Boolean",
  "keyboardBlockPredictive": "Boolean",
  "keyboardBlockShortcuts": "Boolean",
  "keyboardBlockSpellCheck": "Boolean",
  "keychainBlockCloudSync": "Boolean",
  "kioskModeAllowAssistiveSpeak": "Boolean",
  "kioskModeAllowAssistiveTouchSettings": "Boolean",
  "kioskModeAllowAutoLock": "Boolean",
  "kioskModeAllowColorInversionSettings": "Boolean",
  "kioskModeAllowRingerSwitch": "Boolean",
  "kioskModeAllowScreenRotation": "Boolean",
  "kioskModeAllowSleepButton": "Boolean",
  "kioskModeAllowTouchscreen": "Boolean",
  "kioskModeAllowVoiceControlModification": "Boolean",
  "kioskModeAllowVoiceOverSettings": "Boolean",
  "kioskModeAllowVolumeButtons": "Boolean",
  "kioskModeAllowZoomSettings": "Boolean",
  "kioskModeAppStoreUrl": "String",
  "kioskModeAppType": "String",
  "kioskModeBlockAutoLock": "Boolean",
  "kioskModeBlockRingerSwitch": "Boolean",
  "kioskModeBlockScreenRotation": "Boolean",
  "kioskModeBlockSleepButton": "Boolean",
  "kioskModeBlockTouchscreen": "Boolean",
  "kioskModeBlockVolumeButtons": "Boolean",
  "kioskModeBuiltInAppId": "String",
  "kioskModeEnableVoiceControl": "Boolean",
  "kioskModeManagedAppId": "String",
  "kioskModeRequireAssistiveTouch": "Boolean",
  "kioskModeRequireColorInversion": "Boolean",
  "kioskModeRequireMonoAudio": "Boolean",
  "kioskModeRequireVoiceOver": "Boolean",
  "kioskModeRequireZoom": "Boolean",
  "lockScreenBlockControlCenter": "Boolean",
  "lockScreenBlockNotificationView": "Boolean",
  "lockScreenBlockPassbook": "Boolean",
  "lockScreenBlockTodayView": "Boolean",
  "mediaContentRatingApps": "String",
  "mediaContentRatingAustralia": {
    "@odata.type": "microsoft.graph.mediaContentRatingAustralia"
  },
  "mediaContentRatingCanada": {
    "@odata.type": "microsoft.graph.mediaContentRatingCanada"
  },
  "mediaContentRatingFrance": {
    "@odata.type": "microsoft.graph.mediaContentRatingFrance"
  },
  "mediaContentRatingGermany": {
    "@odata.type": "microsoft.graph.mediaContentRatingGermany"
  },
  "mediaContentRatingIreland": {
    "@odata.type": "microsoft.graph.mediaContentRatingIreland"
  },
  "mediaContentRatingJapan": {
    "@odata.type": "microsoft.graph.mediaContentRatingJapan"
  },
  "mediaContentRatingNewZealand": {
    "@odata.type": "microsoft.graph.mediaContentRatingNewZealand"
  },
  "mediaContentRatingUnitedKingdom": {
    "@odata.type": "microsoft.graph.mediaContentRatingUnitedKingdom"
  },
  "mediaContentRatingUnitedStates": {
    "@odata.type": "microsoft.graph.mediaContentRatingUnitedStates"
  },
  "messagesBlocked": "Boolean",
  "networkUsageRules": [
    {
      "@odata.type": "microsoft.graph.iosNetworkUsageRule"
    }
  ],
  "notificationsBlockSettingsModification": "Boolean",
  "passcodeBlockFingerprintModification": "Boolean",
  "passcodeBlockFingerprintUnlock": "Boolean",
  "passcodeBlockModification": "Boolean",
  "passcodeBlockSimple": "Boolean",
  "passcodeExpirationDays": "Integer",
  "passcodeMinimumCharacterSetCount": "Integer",
  "passcodeMinimumLength": "Integer",
  "passcodeMinutesOfInactivityBeforeLock": "Integer",
  "passcodeMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passcodePreviousPasscodeBlockCount": "Integer",
  "passcodeRequired": "Boolean",
  "passcodeRequiredType": "String",
  "passcodeSignInFailureCountBeforeWipe": "Integer",
  "passwordBlockAirDropSharing": "Boolean",
  "passwordBlockAutoFill": "Boolean",
  "passwordBlockProximityRequests": "Boolean",
  "pkiBlockOTAUpdates": "Boolean",
  "podcastsBlocked": "Boolean",
  "privacyForceLimitAdTracking": "Boolean",
  "proximityBlockSetupToNewDevice": "Boolean",
  "safariBlockAutofill": "Boolean",
  "safariBlocked": "Boolean",
  "safariBlockJavaScript": "Boolean",
  "safariBlockPopups": "Boolean",
  "safariCookieSettings": "String",
  "safariManagedDomains": [
    "String"
  ],
  "safariPasswordAutoFillDomains": [
    "String"
  ],
  "safariRequireFraudWarning": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "sharedDeviceBlockTemporarySessions": "Boolean",
  "siriBlocked": "Boolean",
  "siriBlockedWhenLocked": "Boolean",
  "siriBlockUserGeneratedContent": "Boolean",
  "siriRequireProfanityFilter": "Boolean",
  "softwareUpdatesEnforcedDelayInDays": "Integer",
  "softwareUpdatesForceDelayed": "Boolean",
  "spotlightBlockInternetResults": "Boolean",
  "usbRestrictedModeBlocked": "Boolean",
  "voiceDialingBlocked": "Boolean",
  "vpnBlockCreation": "Boolean",
  "wallpaperBlockModification": "Boolean",
  "wiFiConnectOnlyToConfiguredNetworks": "Boolean",
  "wifiPowerOnForced": "Boolean"
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
  "@odata.type": "#microsoft.graph.iosGeneralDeviceConfiguration",
  "id": "2ea18f13-8f13-2ea1-138f-a12e138fa12e",
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
  "accountBlockModification": "Boolean",
  "activationLockAllowWhenSupervised": "Boolean",
  "airDropBlocked": "Boolean",
  "airDropForceUnmanagedDropTarget": "Boolean",
  "airPlayForcePairingPasswordForOutgoingRequests": "Boolean",
  "airPrintBlockCredentialsStorage": "Boolean",
  "airPrintBlocked": "Boolean",
  "airPrintBlockiBeaconDiscovery": "Boolean",
  "airPrintForceTrustedTLS": "Boolean",
  "appClipsBlocked": "Boolean",
  "appleNewsBlocked": "Boolean",
  "applePersonalizedAdsBlocked": "Boolean",
  "appleWatchBlockPairing": "Boolean",
  "appleWatchForceWristDetection": "Boolean",
  "appRemovalBlocked": "Boolean",
  "appsSingleAppModeList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appStoreBlockAutomaticDownloads": "Boolean",
  "appStoreBlocked": "Boolean",
  "appStoreBlockInAppPurchases": "Boolean",
  "appStoreBlockUIAppInstallation": "Boolean",
  "appStoreRequirePassword": "Boolean",
  "appsVisibilityList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsVisibilityListType": "String",
  "autoFillForceAuthentication": "Boolean",
  "blockSystemAppRemoval": "Boolean",
  "bluetoothBlockModification": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockDataRoaming": "Boolean",
  "cellularBlockGlobalBackgroundFetchWhileRoaming": "Boolean",
  "cellularBlockPerAppDataModification": "Boolean",
  "cellularBlockPersonalHotspot": "Boolean",
  "cellularBlockPersonalHotspotModification": "Boolean",
  "cellularBlockPlanModification": "Boolean",
  "cellularBlockVoiceRoaming": "Boolean",
  "certificatesBlockUntrustedTlsCertificates": "Boolean",
  "classroomAppBlockRemoteScreenObservation": "Boolean",
  "classroomAppForceUnpromptedScreenObservation": "Boolean",
  "classroomForceAutomaticallyJoinClasses": "Boolean",
  "classroomForceRequestPermissionToLeaveClasses": "Boolean",
  "classroomForceUnpromptedAppAndDeviceLock": "Boolean",
  "compliantAppListType": "String",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "configurationProfileBlockChanges": "Boolean",
  "contactsAllowManagedToUnmanagedWrite": "Boolean",
  "contactsAllowUnmanagedToManagedRead": "Boolean",
  "continuousPathKeyboardBlocked": "Boolean",
  "dateAndTimeForceSetAutomatically": "Boolean",
  "definitionLookupBlocked": "Boolean",
  "deviceBlockEnableRestrictions": "Boolean",
  "deviceBlockEraseContentAndSettings": "Boolean",
  "deviceBlockNameModification": "Boolean",
  "diagnosticDataBlockSubmission": "Boolean",
  "diagnosticDataBlockSubmissionModification": "Boolean",
  "documentsBlockManagedDocumentsInUnmanagedApps": "Boolean",
  "documentsBlockUnmanagedDocumentsInManagedApps": "Boolean",
  "emailInDomainSuffixes": [
    "String"
  ],
  "enterpriseAppBlockTrust": "Boolean",
  "enterpriseAppBlockTrustModification": "Boolean",
  "enterpriseBookBlockBackup": "Boolean",
  "enterpriseBookBlockMetadataSync": "Boolean",
  "esimBlockModification": "Boolean",
  "faceTimeBlocked": "Boolean",
  "filesNetworkDriveAccessBlocked": "Boolean",
  "filesUsbDriveAccessBlocked": "Boolean",
  "findMyDeviceInFindMyAppBlocked": "Boolean",
  "findMyFriendsBlocked": "Boolean",
  "findMyFriendsInFindMyAppBlocked": "Boolean",
  "gameCenterBlocked": "Boolean",
  "gamingBlockGameCenterFriends": "Boolean",
  "gamingBlockMultiplayer": "Boolean",
  "hostPairingBlocked": "Boolean",
  "iBooksStoreBlocked": "Boolean",
  "iBooksStoreBlockErotica": "Boolean",
  "iCloudBlockActivityContinuation": "Boolean",
  "iCloudBlockBackup": "Boolean",
  "iCloudBlockDocumentSync": "Boolean",
  "iCloudBlockManagedAppsSync": "Boolean",
  "iCloudBlockPhotoLibrary": "Boolean",
  "iCloudBlockPhotoStreamSync": "Boolean",
  "iCloudBlockSharedPhotoStream": "Boolean",
  "iCloudRequireEncryptedBackup": "Boolean",
  "iTunesBlocked": "Boolean",
  "iTunesBlockExplicitContent": "Boolean",
  "iTunesBlockMusicService": "Boolean",
  "iTunesBlockRadio": "Boolean",
  "keyboardBlockAutoCorrect": "Boolean",
  "keyboardBlockDictation": "Boolean",
  "keyboardBlockPredictive": "Boolean",
  "keyboardBlockShortcuts": "Boolean",
  "keyboardBlockSpellCheck": "Boolean",
  "keychainBlockCloudSync": "Boolean",
  "kioskModeAllowAssistiveSpeak": "Boolean",
  "kioskModeAllowAssistiveTouchSettings": "Boolean",
  "kioskModeAllowAutoLock": "Boolean",
  "kioskModeAllowColorInversionSettings": "Boolean",
  "kioskModeAllowRingerSwitch": "Boolean",
  "kioskModeAllowScreenRotation": "Boolean",
  "kioskModeAllowSleepButton": "Boolean",
  "kioskModeAllowTouchscreen": "Boolean",
  "kioskModeAllowVoiceControlModification": "Boolean",
  "kioskModeAllowVoiceOverSettings": "Boolean",
  "kioskModeAllowVolumeButtons": "Boolean",
  "kioskModeAllowZoomSettings": "Boolean",
  "kioskModeAppStoreUrl": "String",
  "kioskModeAppType": "String",
  "kioskModeBlockAutoLock": "Boolean",
  "kioskModeBlockRingerSwitch": "Boolean",
  "kioskModeBlockScreenRotation": "Boolean",
  "kioskModeBlockSleepButton": "Boolean",
  "kioskModeBlockTouchscreen": "Boolean",
  "kioskModeBlockVolumeButtons": "Boolean",
  "kioskModeBuiltInAppId": "String",
  "kioskModeEnableVoiceControl": "Boolean",
  "kioskModeManagedAppId": "String",
  "kioskModeRequireAssistiveTouch": "Boolean",
  "kioskModeRequireColorInversion": "Boolean",
  "kioskModeRequireMonoAudio": "Boolean",
  "kioskModeRequireVoiceOver": "Boolean",
  "kioskModeRequireZoom": "Boolean",
  "lockScreenBlockControlCenter": "Boolean",
  "lockScreenBlockNotificationView": "Boolean",
  "lockScreenBlockPassbook": "Boolean",
  "lockScreenBlockTodayView": "Boolean",
  "mediaContentRatingApps": "String",
  "mediaContentRatingAustralia": {
    "@odata.type": "microsoft.graph.mediaContentRatingAustralia"
  },
  "mediaContentRatingCanada": {
    "@odata.type": "microsoft.graph.mediaContentRatingCanada"
  },
  "mediaContentRatingFrance": {
    "@odata.type": "microsoft.graph.mediaContentRatingFrance"
  },
  "mediaContentRatingGermany": {
    "@odata.type": "microsoft.graph.mediaContentRatingGermany"
  },
  "mediaContentRatingIreland": {
    "@odata.type": "microsoft.graph.mediaContentRatingIreland"
  },
  "mediaContentRatingJapan": {
    "@odata.type": "microsoft.graph.mediaContentRatingJapan"
  },
  "mediaContentRatingNewZealand": {
    "@odata.type": "microsoft.graph.mediaContentRatingNewZealand"
  },
  "mediaContentRatingUnitedKingdom": {
    "@odata.type": "microsoft.graph.mediaContentRatingUnitedKingdom"
  },
  "mediaContentRatingUnitedStates": {
    "@odata.type": "microsoft.graph.mediaContentRatingUnitedStates"
  },
  "messagesBlocked": "Boolean",
  "networkUsageRules": [
    {
      "@odata.type": "microsoft.graph.iosNetworkUsageRule"
    }
  ],
  "notificationsBlockSettingsModification": "Boolean",
  "passcodeBlockFingerprintModification": "Boolean",
  "passcodeBlockFingerprintUnlock": "Boolean",
  "passcodeBlockModification": "Boolean",
  "passcodeBlockSimple": "Boolean",
  "passcodeExpirationDays": "Integer",
  "passcodeMinimumCharacterSetCount": "Integer",
  "passcodeMinimumLength": "Integer",
  "passcodeMinutesOfInactivityBeforeLock": "Integer",
  "passcodeMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passcodePreviousPasscodeBlockCount": "Integer",
  "passcodeRequired": "Boolean",
  "passcodeRequiredType": "String",
  "passcodeSignInFailureCountBeforeWipe": "Integer",
  "passwordBlockAirDropSharing": "Boolean",
  "passwordBlockAutoFill": "Boolean",
  "passwordBlockProximityRequests": "Boolean",
  "pkiBlockOTAUpdates": "Boolean",
  "podcastsBlocked": "Boolean",
  "privacyForceLimitAdTracking": "Boolean",
  "proximityBlockSetupToNewDevice": "Boolean",
  "safariBlockAutofill": "Boolean",
  "safariBlocked": "Boolean",
  "safariBlockJavaScript": "Boolean",
  "safariBlockPopups": "Boolean",
  "safariCookieSettings": "String",
  "safariManagedDomains": [
    "String"
  ],
  "safariPasswordAutoFillDomains": [
    "String"
  ],
  "safariRequireFraudWarning": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "sharedDeviceBlockTemporarySessions": "Boolean",
  "siriBlocked": "Boolean",
  "siriBlockedWhenLocked": "Boolean",
  "siriBlockUserGeneratedContent": "Boolean",
  "siriRequireProfanityFilter": "Boolean",
  "softwareUpdatesEnforcedDelayInDays": "Integer",
  "softwareUpdatesForceDelayed": "Boolean",
  "spotlightBlockInternetResults": "Boolean",
  "usbRestrictedModeBlocked": "Boolean",
  "voiceDialingBlocked": "Boolean",
  "vpnBlockCreation": "Boolean",
  "wallpaperBlockModification": "Boolean",
  "wiFiConnectOnlyToConfiguredNetworks": "Boolean",
  "wifiPowerOnForced": "Boolean"
}
```

