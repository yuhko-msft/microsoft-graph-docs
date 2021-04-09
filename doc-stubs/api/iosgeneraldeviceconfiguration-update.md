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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

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
|accountBlockModification|Boolean|**TODO: Add Description**|
|activationLockAllowWhenSupervised|Boolean|**TODO: Add Description**|
|airDropBlocked|Boolean|**TODO: Add Description**|
|airDropForceUnmanagedDropTarget|Boolean|**TODO: Add Description**|
|airPlayForcePairingPasswordForOutgoingRequests|Boolean|**TODO: Add Description**|
|appleWatchBlockPairing|Boolean|**TODO: Add Description**|
|appleWatchForceWristDetection|Boolean|**TODO: Add Description**|
|appleNewsBlocked|Boolean|**TODO: Add Description**|
|appsSingleAppModeList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|appsVisibilityList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|appsVisibilityListType|appListType|**TODO: Add Description**. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|appStoreBlockAutomaticDownloads|Boolean|**TODO: Add Description**|
|appStoreBlocked|Boolean|**TODO: Add Description**|
|appStoreBlockInAppPurchases|Boolean|**TODO: Add Description**|
|appStoreBlockUIAppInstallation|Boolean|**TODO: Add Description**|
|appStoreRequirePassword|Boolean|**TODO: Add Description**|
|autoFillForceAuthentication|Boolean|**TODO: Add Description**|
|bluetoothBlockModification|Boolean|**TODO: Add Description**|
|cameraBlocked|Boolean|**TODO: Add Description**|
|cellularBlockDataRoaming|Boolean|**TODO: Add Description**|
|cellularBlockGlobalBackgroundFetchWhileRoaming|Boolean|**TODO: Add Description**|
|cellularBlockPerAppDataModification|Boolean|**TODO: Add Description**|
|cellularBlockPersonalHotspot|Boolean|**TODO: Add Description**|
|cellularBlockPlanModification|Boolean|**TODO: Add Description**|
|cellularBlockVoiceRoaming|Boolean|**TODO: Add Description**|
|certificatesBlockUntrustedTlsCertificates|Boolean|**TODO: Add Description**|
|classroomAppBlockRemoteScreenObservation|Boolean|**TODO: Add Description**|
|classroomAppForceUnpromptedScreenObservation|Boolean|**TODO: Add Description**|
|classroomForceAutomaticallyJoinClasses|Boolean|**TODO: Add Description**|
|classroomForceUnpromptedAppAndDeviceLock|Boolean|**TODO: Add Description**|
|compliantAppsList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|compliantAppListType|appListType|**TODO: Add Description**. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|configurationProfileBlockChanges|Boolean|**TODO: Add Description**|
|definitionLookupBlocked|Boolean|**TODO: Add Description**|
|deviceBlockEnableRestrictions|Boolean|**TODO: Add Description**|
|deviceBlockEraseContentAndSettings|Boolean|**TODO: Add Description**|
|deviceBlockNameModification|Boolean|**TODO: Add Description**|
|diagnosticDataBlockSubmission|Boolean|**TODO: Add Description**|
|diagnosticDataBlockSubmissionModification|Boolean|**TODO: Add Description**|
|documentsBlockManagedDocumentsInUnmanagedApps|Boolean|**TODO: Add Description**|
|documentsBlockUnmanagedDocumentsInManagedApps|Boolean|**TODO: Add Description**|
|emailInDomainSuffixes|String collection|**TODO: Add Description**|
|enterpriseAppBlockTrust|Boolean|**TODO: Add Description**|
|enterpriseAppBlockTrustModification|Boolean|**TODO: Add Description**|
|esimBlockModification|Boolean|**TODO: Add Description**|
|faceTimeBlocked|Boolean|**TODO: Add Description**|
|findMyFriendsBlocked|Boolean|**TODO: Add Description**|
|gamingBlockGameCenterFriends|Boolean|**TODO: Add Description**|
|gamingBlockMultiplayer|Boolean|**TODO: Add Description**|
|gameCenterBlocked|Boolean|**TODO: Add Description**|
|hostPairingBlocked|Boolean|**TODO: Add Description**|
|iBooksStoreBlocked|Boolean|**TODO: Add Description**|
|iBooksStoreBlockErotica|Boolean|**TODO: Add Description**|
|iCloudBlockActivityContinuation|Boolean|**TODO: Add Description**|
|iCloudBlockBackup|Boolean|**TODO: Add Description**|
|iCloudBlockDocumentSync|Boolean|**TODO: Add Description**|
|iCloudBlockManagedAppsSync|Boolean|**TODO: Add Description**|
|iCloudBlockPhotoLibrary|Boolean|**TODO: Add Description**|
|iCloudBlockPhotoStreamSync|Boolean|**TODO: Add Description**|
|iCloudBlockSharedPhotoStream|Boolean|**TODO: Add Description**|
|iCloudRequireEncryptedBackup|Boolean|**TODO: Add Description**|
|iTunesBlockExplicitContent|Boolean|**TODO: Add Description**|
|iTunesBlockMusicService|Boolean|**TODO: Add Description**|
|iTunesBlockRadio|Boolean|**TODO: Add Description**|
|keyboardBlockAutoCorrect|Boolean|**TODO: Add Description**|
|keyboardBlockDictation|Boolean|**TODO: Add Description**|
|keyboardBlockPredictive|Boolean|**TODO: Add Description**|
|keyboardBlockShortcuts|Boolean|**TODO: Add Description**|
|keyboardBlockSpellCheck|Boolean|**TODO: Add Description**|
|kioskModeAllowAssistiveSpeak|Boolean|**TODO: Add Description**|
|kioskModeAllowAssistiveTouchSettings|Boolean|**TODO: Add Description**|
|kioskModeAllowAutoLock|Boolean|**TODO: Add Description**|
|kioskModeBlockAutoLock|Boolean|**TODO: Add Description**|
|kioskModeAllowColorInversionSettings|Boolean|**TODO: Add Description**|
|kioskModeAllowRingerSwitch|Boolean|**TODO: Add Description**|
|kioskModeBlockRingerSwitch|Boolean|**TODO: Add Description**|
|kioskModeAllowScreenRotation|Boolean|**TODO: Add Description**|
|kioskModeBlockScreenRotation|Boolean|**TODO: Add Description**|
|kioskModeAllowSleepButton|Boolean|**TODO: Add Description**|
|kioskModeBlockSleepButton|Boolean|**TODO: Add Description**|
|kioskModeAllowTouchscreen|Boolean|**TODO: Add Description**|
|kioskModeBlockTouchscreen|Boolean|**TODO: Add Description**|
|kioskModeEnableVoiceControl|Boolean|**TODO: Add Description**|
|kioskModeAllowVoiceControlModification|Boolean|**TODO: Add Description**|
|kioskModeAllowVoiceOverSettings|Boolean|**TODO: Add Description**|
|kioskModeAllowVolumeButtons|Boolean|**TODO: Add Description**|
|kioskModeBlockVolumeButtons|Boolean|**TODO: Add Description**|
|kioskModeAllowZoomSettings|Boolean|**TODO: Add Description**|
|kioskModeAppStoreUrl|String|**TODO: Add Description**|
|kioskModeBuiltInAppId|String|**TODO: Add Description**|
|kioskModeRequireAssistiveTouch|Boolean|**TODO: Add Description**|
|kioskModeRequireColorInversion|Boolean|**TODO: Add Description**|
|kioskModeRequireMonoAudio|Boolean|**TODO: Add Description**|
|kioskModeRequireVoiceOver|Boolean|**TODO: Add Description**|
|kioskModeRequireZoom|Boolean|**TODO: Add Description**|
|kioskModeManagedAppId|String|**TODO: Add Description**|
|lockScreenBlockControlCenter|Boolean|**TODO: Add Description**|
|lockScreenBlockNotificationView|Boolean|**TODO: Add Description**|
|lockScreenBlockPassbook|Boolean|**TODO: Add Description**|
|lockScreenBlockTodayView|Boolean|**TODO: Add Description**|
|mediaContentRatingAustralia|[mediaContentRatingAustralia](../resources/intune-mediacontentratingaustralia.md)|**TODO: Add Description**|
|mediaContentRatingCanada|[mediaContentRatingCanada](../resources/intune-mediacontentratingcanada.md)|**TODO: Add Description**|
|mediaContentRatingFrance|[mediaContentRatingFrance](../resources/intune-mediacontentratingfrance.md)|**TODO: Add Description**|
|mediaContentRatingGermany|[mediaContentRatingGermany](../resources/intune-mediacontentratinggermany.md)|**TODO: Add Description**|
|mediaContentRatingIreland|[mediaContentRatingIreland](../resources/intune-mediacontentratingireland.md)|**TODO: Add Description**|
|mediaContentRatingJapan|[mediaContentRatingJapan](../resources/intune-mediacontentratingjapan.md)|**TODO: Add Description**|
|mediaContentRatingNewZealand|[mediaContentRatingNewZealand](../resources/intune-mediacontentratingnewzealand.md)|**TODO: Add Description**|
|mediaContentRatingUnitedKingdom|[mediaContentRatingUnitedKingdom](../resources/intune-mediacontentratingunitedkingdom.md)|**TODO: Add Description**|
|mediaContentRatingUnitedStates|[mediaContentRatingUnitedStates](../resources/intune-mediacontentratingunitedstates.md)|**TODO: Add Description**|
|networkUsageRules|[iosNetworkUsageRule](../resources/intune-iosnetworkusagerule.md) collection|**TODO: Add Description**|
|mediaContentRatingApps|ratingAppsType|**TODO: Add Description**. Possible values are: `allAllowed`, `allBlocked`, `agesAbove4`, `agesAbove9`, `agesAbove12`, `agesAbove17`.|
|messagesBlocked|Boolean|**TODO: Add Description**|
|notificationsBlockSettingsModification|Boolean|**TODO: Add Description**|
|passcodeBlockFingerprintUnlock|Boolean|**TODO: Add Description**|
|passcodeBlockFingerprintModification|Boolean|**TODO: Add Description**|
|passcodeBlockModification|Boolean|**TODO: Add Description**|
|passcodeBlockSimple|Boolean|**TODO: Add Description**|
|passcodeExpirationDays|Int32|**TODO: Add Description**|
|passcodeMinimumLength|Int32|**TODO: Add Description**|
|passcodeMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passcodeMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passcodeMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passcodePreviousPasscodeBlockCount|Int32|**TODO: Add Description**|
|passcodeSignInFailureCountBeforeWipe|Int32|**TODO: Add Description**|
|passcodeRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passcodeRequired|Boolean|**TODO: Add Description**|
|podcastsBlocked|Boolean|**TODO: Add Description**|
|proximityBlockSetupToNewDevice|Boolean|**TODO: Add Description**|
|safariBlockAutofill|Boolean|**TODO: Add Description**|
|safariBlockJavaScript|Boolean|**TODO: Add Description**|
|safariBlockPopups|Boolean|**TODO: Add Description**|
|safariBlocked|Boolean|**TODO: Add Description**|
|safariCookieSettings|webBrowserCookieSettings|**TODO: Add Description**. Possible values are: `browserDefault`, `blockAlways`, `allowCurrentWebSite`, `allowFromWebsitesVisited`, `allowAlways`.|
|safariManagedDomains|String collection|**TODO: Add Description**|
|safariPasswordAutoFillDomains|String collection|**TODO: Add Description**|
|safariRequireFraudWarning|Boolean|**TODO: Add Description**|
|screenCaptureBlocked|Boolean|**TODO: Add Description**|
|siriBlocked|Boolean|**TODO: Add Description**|
|siriBlockedWhenLocked|Boolean|**TODO: Add Description**|
|siriBlockUserGeneratedContent|Boolean|**TODO: Add Description**|
|siriRequireProfanityFilter|Boolean|**TODO: Add Description**|
|softwareUpdatesEnforcedDelayInDays|Int32|**TODO: Add Description**|
|softwareUpdatesForceDelayed|Boolean|**TODO: Add Description**|
|spotlightBlockInternetResults|Boolean|**TODO: Add Description**|
|voiceDialingBlocked|Boolean|**TODO: Add Description**|
|wallpaperBlockModification|Boolean|**TODO: Add Description**|
|wiFiConnectOnlyToConfiguredNetworks|Boolean|**TODO: Add Description**|
|classroomForceRequestPermissionToLeaveClasses|Boolean|**TODO: Add Description**|
|keychainBlockCloudSync|Boolean|**TODO: Add Description**|
|pkiBlockOTAUpdates|Boolean|**TODO: Add Description**|
|privacyForceLimitAdTracking|Boolean|**TODO: Add Description**|
|enterpriseBookBlockBackup|Boolean|**TODO: Add Description**|
|enterpriseBookBlockMetadataSync|Boolean|**TODO: Add Description**|
|airPrintBlocked|Boolean|**TODO: Add Description**|
|airPrintBlockCredentialsStorage|Boolean|**TODO: Add Description**|
|airPrintForceTrustedTLS|Boolean|**TODO: Add Description**|
|airPrintBlockiBeaconDiscovery|Boolean|**TODO: Add Description**|
|filesNetworkDriveAccessBlocked|Boolean|**TODO: Add Description**|
|filesUsbDriveAccessBlocked|Boolean|**TODO: Add Description**|
|wifiPowerOnForced|Boolean|**TODO: Add Description**|
|blockSystemAppRemoval|Boolean|**TODO: Add Description**|
|vpnBlockCreation|Boolean|**TODO: Add Description**|
|appRemovalBlocked|Boolean|**TODO: Add Description**|
|usbRestrictedModeBlocked|Boolean|**TODO: Add Description**|
|passwordBlockAutoFill|Boolean|**TODO: Add Description**|
|passwordBlockProximityRequests|Boolean|**TODO: Add Description**|
|passwordBlockAirDropSharing|Boolean|**TODO: Add Description**|
|dateAndTimeForceSetAutomatically|Boolean|**TODO: Add Description**|
|contactsAllowManagedToUnmanagedWrite|Boolean|**TODO: Add Description**|
|contactsAllowUnmanagedToManagedRead|Boolean|**TODO: Add Description**|
|cellularBlockPersonalHotspotModification|Boolean|**TODO: Add Description**|
|continuousPathKeyboardBlocked|Boolean|**TODO: Add Description**|
|findMyDeviceInFindMyAppBlocked|Boolean|**TODO: Add Description**|
|findMyFriendsInFindMyAppBlocked|Boolean|**TODO: Add Description**|
|iTunesBlocked|Boolean|**TODO: Add Description**|
|sharedDeviceBlockTemporarySessions|Boolean|**TODO: Add Description**|
|appClipsBlocked|Boolean|**TODO: Add Description**|
|applePersonalizedAdsBlocked|Boolean|**TODO: Add Description**|
|nfcBlocked|Boolean|**TODO: Add Description**|
|kioskModeAppType|iosKioskModeAppType|**TODO: Add Description**. Possible values are: `notConfigured`, `appStoreApp`, `managedApp`, `builtInApp`.|



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
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosGeneralDeviceConfiguration not found
Content-Type: application/json
Content-length: 9432

{
  "@odata.type": "#microsoft.graph.iosGeneralDeviceConfiguration",
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
  "accountBlockModification": "Boolean",
  "activationLockAllowWhenSupervised": "Boolean",
  "airDropBlocked": "Boolean",
  "airDropForceUnmanagedDropTarget": "Boolean",
  "airPlayForcePairingPasswordForOutgoingRequests": "Boolean",
  "appleWatchBlockPairing": "Boolean",
  "appleWatchForceWristDetection": "Boolean",
  "appleNewsBlocked": "Boolean",
  "appsSingleAppModeList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsVisibilityList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsVisibilityListType": "String",
  "appStoreBlockAutomaticDownloads": "Boolean",
  "appStoreBlocked": "Boolean",
  "appStoreBlockInAppPurchases": "Boolean",
  "appStoreBlockUIAppInstallation": "Boolean",
  "appStoreRequirePassword": "Boolean",
  "autoFillForceAuthentication": "Boolean",
  "bluetoothBlockModification": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockDataRoaming": "Boolean",
  "cellularBlockGlobalBackgroundFetchWhileRoaming": "Boolean",
  "cellularBlockPerAppDataModification": "Boolean",
  "cellularBlockPersonalHotspot": "Boolean",
  "cellularBlockPlanModification": "Boolean",
  "cellularBlockVoiceRoaming": "Boolean",
  "certificatesBlockUntrustedTlsCertificates": "Boolean",
  "classroomAppBlockRemoteScreenObservation": "Boolean",
  "classroomAppForceUnpromptedScreenObservation": "Boolean",
  "classroomForceAutomaticallyJoinClasses": "Boolean",
  "classroomForceUnpromptedAppAndDeviceLock": "Boolean",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "compliantAppListType": "String",
  "configurationProfileBlockChanges": "Boolean",
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
  "esimBlockModification": "Boolean",
  "faceTimeBlocked": "Boolean",
  "findMyFriendsBlocked": "Boolean",
  "gamingBlockGameCenterFriends": "Boolean",
  "gamingBlockMultiplayer": "Boolean",
  "gameCenterBlocked": "Boolean",
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
  "iTunesBlockExplicitContent": "Boolean",
  "iTunesBlockMusicService": "Boolean",
  "iTunesBlockRadio": "Boolean",
  "keyboardBlockAutoCorrect": "Boolean",
  "keyboardBlockDictation": "Boolean",
  "keyboardBlockPredictive": "Boolean",
  "keyboardBlockShortcuts": "Boolean",
  "keyboardBlockSpellCheck": "Boolean",
  "kioskModeAllowAssistiveSpeak": "Boolean",
  "kioskModeAllowAssistiveTouchSettings": "Boolean",
  "kioskModeAllowAutoLock": "Boolean",
  "kioskModeBlockAutoLock": "Boolean",
  "kioskModeAllowColorInversionSettings": "Boolean",
  "kioskModeAllowRingerSwitch": "Boolean",
  "kioskModeBlockRingerSwitch": "Boolean",
  "kioskModeAllowScreenRotation": "Boolean",
  "kioskModeBlockScreenRotation": "Boolean",
  "kioskModeAllowSleepButton": "Boolean",
  "kioskModeBlockSleepButton": "Boolean",
  "kioskModeAllowTouchscreen": "Boolean",
  "kioskModeBlockTouchscreen": "Boolean",
  "kioskModeEnableVoiceControl": "Boolean",
  "kioskModeAllowVoiceControlModification": "Boolean",
  "kioskModeAllowVoiceOverSettings": "Boolean",
  "kioskModeAllowVolumeButtons": "Boolean",
  "kioskModeBlockVolumeButtons": "Boolean",
  "kioskModeAllowZoomSettings": "Boolean",
  "kioskModeAppStoreUrl": "String",
  "kioskModeBuiltInAppId": "String",
  "kioskModeRequireAssistiveTouch": "Boolean",
  "kioskModeRequireColorInversion": "Boolean",
  "kioskModeRequireMonoAudio": "Boolean",
  "kioskModeRequireVoiceOver": "Boolean",
  "kioskModeRequireZoom": "Boolean",
  "kioskModeManagedAppId": "String",
  "lockScreenBlockControlCenter": "Boolean",
  "lockScreenBlockNotificationView": "Boolean",
  "lockScreenBlockPassbook": "Boolean",
  "lockScreenBlockTodayView": "Boolean",
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
  "networkUsageRules": [
    {
      "@odata.type": "microsoft.graph.iosNetworkUsageRule"
    }
  ],
  "mediaContentRatingApps": "String",
  "messagesBlocked": "Boolean",
  "notificationsBlockSettingsModification": "Boolean",
  "passcodeBlockFingerprintUnlock": "Boolean",
  "passcodeBlockFingerprintModification": "Boolean",
  "passcodeBlockModification": "Boolean",
  "passcodeBlockSimple": "Boolean",
  "passcodeExpirationDays": "Integer",
  "passcodeMinimumLength": "Integer",
  "passcodeMinutesOfInactivityBeforeLock": "Integer",
  "passcodeMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passcodeMinimumCharacterSetCount": "Integer",
  "passcodePreviousPasscodeBlockCount": "Integer",
  "passcodeSignInFailureCountBeforeWipe": "Integer",
  "passcodeRequiredType": "String",
  "passcodeRequired": "Boolean",
  "podcastsBlocked": "Boolean",
  "proximityBlockSetupToNewDevice": "Boolean",
  "safariBlockAutofill": "Boolean",
  "safariBlockJavaScript": "Boolean",
  "safariBlockPopups": "Boolean",
  "safariBlocked": "Boolean",
  "safariCookieSettings": "String",
  "safariManagedDomains": [
    "String"
  ],
  "safariPasswordAutoFillDomains": [
    "String"
  ],
  "safariRequireFraudWarning": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "siriBlocked": "Boolean",
  "siriBlockedWhenLocked": "Boolean",
  "siriBlockUserGeneratedContent": "Boolean",
  "siriRequireProfanityFilter": "Boolean",
  "softwareUpdatesEnforcedDelayInDays": "Integer",
  "softwareUpdatesForceDelayed": "Boolean",
  "spotlightBlockInternetResults": "Boolean",
  "voiceDialingBlocked": "Boolean",
  "wallpaperBlockModification": "Boolean",
  "wiFiConnectOnlyToConfiguredNetworks": "Boolean",
  "classroomForceRequestPermissionToLeaveClasses": "Boolean",
  "keychainBlockCloudSync": "Boolean",
  "pkiBlockOTAUpdates": "Boolean",
  "privacyForceLimitAdTracking": "Boolean",
  "enterpriseBookBlockBackup": "Boolean",
  "enterpriseBookBlockMetadataSync": "Boolean",
  "airPrintBlocked": "Boolean",
  "airPrintBlockCredentialsStorage": "Boolean",
  "airPrintForceTrustedTLS": "Boolean",
  "airPrintBlockiBeaconDiscovery": "Boolean",
  "filesNetworkDriveAccessBlocked": "Boolean",
  "filesUsbDriveAccessBlocked": "Boolean",
  "wifiPowerOnForced": "Boolean",
  "blockSystemAppRemoval": "Boolean",
  "vpnBlockCreation": "Boolean",
  "appRemovalBlocked": "Boolean",
  "usbRestrictedModeBlocked": "Boolean",
  "passwordBlockAutoFill": "Boolean",
  "passwordBlockProximityRequests": "Boolean",
  "passwordBlockAirDropSharing": "Boolean",
  "dateAndTimeForceSetAutomatically": "Boolean",
  "contactsAllowManagedToUnmanagedWrite": "Boolean",
  "contactsAllowUnmanagedToManagedRead": "Boolean",
  "cellularBlockPersonalHotspotModification": "Boolean",
  "continuousPathKeyboardBlocked": "Boolean",
  "findMyDeviceInFindMyAppBlocked": "Boolean",
  "findMyFriendsInFindMyAppBlocked": "Boolean",
  "iTunesBlocked": "Boolean",
  "sharedDeviceBlockTemporarySessions": "Boolean",
  "appClipsBlocked": "Boolean",
  "applePersonalizedAdsBlocked": "Boolean",
  "nfcBlocked": "Boolean",
  "kioskModeAppType": "String"
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
  "accountBlockModification": "Boolean",
  "activationLockAllowWhenSupervised": "Boolean",
  "airDropBlocked": "Boolean",
  "airDropForceUnmanagedDropTarget": "Boolean",
  "airPlayForcePairingPasswordForOutgoingRequests": "Boolean",
  "appleWatchBlockPairing": "Boolean",
  "appleWatchForceWristDetection": "Boolean",
  "appleNewsBlocked": "Boolean",
  "appsSingleAppModeList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsVisibilityList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "appsVisibilityListType": "String",
  "appStoreBlockAutomaticDownloads": "Boolean",
  "appStoreBlocked": "Boolean",
  "appStoreBlockInAppPurchases": "Boolean",
  "appStoreBlockUIAppInstallation": "Boolean",
  "appStoreRequirePassword": "Boolean",
  "autoFillForceAuthentication": "Boolean",
  "bluetoothBlockModification": "Boolean",
  "cameraBlocked": "Boolean",
  "cellularBlockDataRoaming": "Boolean",
  "cellularBlockGlobalBackgroundFetchWhileRoaming": "Boolean",
  "cellularBlockPerAppDataModification": "Boolean",
  "cellularBlockPersonalHotspot": "Boolean",
  "cellularBlockPlanModification": "Boolean",
  "cellularBlockVoiceRoaming": "Boolean",
  "certificatesBlockUntrustedTlsCertificates": "Boolean",
  "classroomAppBlockRemoteScreenObservation": "Boolean",
  "classroomAppForceUnpromptedScreenObservation": "Boolean",
  "classroomForceAutomaticallyJoinClasses": "Boolean",
  "classroomForceUnpromptedAppAndDeviceLock": "Boolean",
  "compliantAppsList": [
    {
      "@odata.type": "microsoft.graph.appListItem"
    }
  ],
  "compliantAppListType": "String",
  "configurationProfileBlockChanges": "Boolean",
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
  "esimBlockModification": "Boolean",
  "faceTimeBlocked": "Boolean",
  "findMyFriendsBlocked": "Boolean",
  "gamingBlockGameCenterFriends": "Boolean",
  "gamingBlockMultiplayer": "Boolean",
  "gameCenterBlocked": "Boolean",
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
  "iTunesBlockExplicitContent": "Boolean",
  "iTunesBlockMusicService": "Boolean",
  "iTunesBlockRadio": "Boolean",
  "keyboardBlockAutoCorrect": "Boolean",
  "keyboardBlockDictation": "Boolean",
  "keyboardBlockPredictive": "Boolean",
  "keyboardBlockShortcuts": "Boolean",
  "keyboardBlockSpellCheck": "Boolean",
  "kioskModeAllowAssistiveSpeak": "Boolean",
  "kioskModeAllowAssistiveTouchSettings": "Boolean",
  "kioskModeAllowAutoLock": "Boolean",
  "kioskModeBlockAutoLock": "Boolean",
  "kioskModeAllowColorInversionSettings": "Boolean",
  "kioskModeAllowRingerSwitch": "Boolean",
  "kioskModeBlockRingerSwitch": "Boolean",
  "kioskModeAllowScreenRotation": "Boolean",
  "kioskModeBlockScreenRotation": "Boolean",
  "kioskModeAllowSleepButton": "Boolean",
  "kioskModeBlockSleepButton": "Boolean",
  "kioskModeAllowTouchscreen": "Boolean",
  "kioskModeBlockTouchscreen": "Boolean",
  "kioskModeEnableVoiceControl": "Boolean",
  "kioskModeAllowVoiceControlModification": "Boolean",
  "kioskModeAllowVoiceOverSettings": "Boolean",
  "kioskModeAllowVolumeButtons": "Boolean",
  "kioskModeBlockVolumeButtons": "Boolean",
  "kioskModeAllowZoomSettings": "Boolean",
  "kioskModeAppStoreUrl": "String",
  "kioskModeBuiltInAppId": "String",
  "kioskModeRequireAssistiveTouch": "Boolean",
  "kioskModeRequireColorInversion": "Boolean",
  "kioskModeRequireMonoAudio": "Boolean",
  "kioskModeRequireVoiceOver": "Boolean",
  "kioskModeRequireZoom": "Boolean",
  "kioskModeManagedAppId": "String",
  "lockScreenBlockControlCenter": "Boolean",
  "lockScreenBlockNotificationView": "Boolean",
  "lockScreenBlockPassbook": "Boolean",
  "lockScreenBlockTodayView": "Boolean",
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
  "networkUsageRules": [
    {
      "@odata.type": "microsoft.graph.iosNetworkUsageRule"
    }
  ],
  "mediaContentRatingApps": "String",
  "messagesBlocked": "Boolean",
  "notificationsBlockSettingsModification": "Boolean",
  "passcodeBlockFingerprintUnlock": "Boolean",
  "passcodeBlockFingerprintModification": "Boolean",
  "passcodeBlockModification": "Boolean",
  "passcodeBlockSimple": "Boolean",
  "passcodeExpirationDays": "Integer",
  "passcodeMinimumLength": "Integer",
  "passcodeMinutesOfInactivityBeforeLock": "Integer",
  "passcodeMinutesOfInactivityBeforeScreenTimeout": "Integer",
  "passcodeMinimumCharacterSetCount": "Integer",
  "passcodePreviousPasscodeBlockCount": "Integer",
  "passcodeSignInFailureCountBeforeWipe": "Integer",
  "passcodeRequiredType": "String",
  "passcodeRequired": "Boolean",
  "podcastsBlocked": "Boolean",
  "proximityBlockSetupToNewDevice": "Boolean",
  "safariBlockAutofill": "Boolean",
  "safariBlockJavaScript": "Boolean",
  "safariBlockPopups": "Boolean",
  "safariBlocked": "Boolean",
  "safariCookieSettings": "String",
  "safariManagedDomains": [
    "String"
  ],
  "safariPasswordAutoFillDomains": [
    "String"
  ],
  "safariRequireFraudWarning": "Boolean",
  "screenCaptureBlocked": "Boolean",
  "siriBlocked": "Boolean",
  "siriBlockedWhenLocked": "Boolean",
  "siriBlockUserGeneratedContent": "Boolean",
  "siriRequireProfanityFilter": "Boolean",
  "softwareUpdatesEnforcedDelayInDays": "Integer",
  "softwareUpdatesForceDelayed": "Boolean",
  "spotlightBlockInternetResults": "Boolean",
  "voiceDialingBlocked": "Boolean",
  "wallpaperBlockModification": "Boolean",
  "wiFiConnectOnlyToConfiguredNetworks": "Boolean",
  "classroomForceRequestPermissionToLeaveClasses": "Boolean",
  "keychainBlockCloudSync": "Boolean",
  "pkiBlockOTAUpdates": "Boolean",
  "privacyForceLimitAdTracking": "Boolean",
  "enterpriseBookBlockBackup": "Boolean",
  "enterpriseBookBlockMetadataSync": "Boolean",
  "airPrintBlocked": "Boolean",
  "airPrintBlockCredentialsStorage": "Boolean",
  "airPrintForceTrustedTLS": "Boolean",
  "airPrintBlockiBeaconDiscovery": "Boolean",
  "filesNetworkDriveAccessBlocked": "Boolean",
  "filesUsbDriveAccessBlocked": "Boolean",
  "wifiPowerOnForced": "Boolean",
  "blockSystemAppRemoval": "Boolean",
  "vpnBlockCreation": "Boolean",
  "appRemovalBlocked": "Boolean",
  "usbRestrictedModeBlocked": "Boolean",
  "passwordBlockAutoFill": "Boolean",
  "passwordBlockProximityRequests": "Boolean",
  "passwordBlockAirDropSharing": "Boolean",
  "dateAndTimeForceSetAutomatically": "Boolean",
  "contactsAllowManagedToUnmanagedWrite": "Boolean",
  "contactsAllowUnmanagedToManagedRead": "Boolean",
  "cellularBlockPersonalHotspotModification": "Boolean",
  "continuousPathKeyboardBlocked": "Boolean",
  "findMyDeviceInFindMyAppBlocked": "Boolean",
  "findMyFriendsInFindMyAppBlocked": "Boolean",
  "iTunesBlocked": "Boolean",
  "sharedDeviceBlockTemporarySessions": "Boolean",
  "appClipsBlocked": "Boolean",
  "applePersonalizedAdsBlocked": "Boolean",
  "nfcBlocked": "Boolean",
  "kioskModeAppType": "String"
}
```

