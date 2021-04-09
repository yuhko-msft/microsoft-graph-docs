---
title: "iosGeneralDeviceConfiguration resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosGeneralDeviceConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List iosGeneralDeviceConfigurations](../api/iosgeneraldeviceconfiguration-list.md)|[iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) collection|Get a list of the [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) objects and their properties.|
|[Create iosGeneralDeviceConfiguration](../api/iosgeneraldeviceconfiguration-create.md)|[iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md)|Create a new [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object.|
|[Get iosGeneralDeviceConfiguration](../api/iosgeneraldeviceconfiguration-get.md)|[iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md)|Read the properties and relationships of an [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object.|
|[Update iosGeneralDeviceConfiguration](../api/iosgeneraldeviceconfiguration-update.md)|[iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md)|Update the properties of an [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object.|
|[Delete iosGeneralDeviceConfiguration](../api/iosgeneraldeviceconfiguration-delete.md)|None|Deletes an [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|accountBlockModification|Boolean|**TODO: Add Description**|
|activationLockAllowWhenSupervised|Boolean|**TODO: Add Description**|
|airDropBlocked|Boolean|**TODO: Add Description**|
|airDropForceUnmanagedDropTarget|Boolean|**TODO: Add Description**|
|airPlayForcePairingPasswordForOutgoingRequests|Boolean|**TODO: Add Description**|
|airPrintBlockCredentialsStorage|Boolean|**TODO: Add Description**|
|airPrintBlocked|Boolean|**TODO: Add Description**|
|airPrintBlockiBeaconDiscovery|Boolean|**TODO: Add Description**|
|airPrintForceTrustedTLS|Boolean|**TODO: Add Description**|
|appClipsBlocked|Boolean|**TODO: Add Description**|
|appleNewsBlocked|Boolean|**TODO: Add Description**|
|applePersonalizedAdsBlocked|Boolean|**TODO: Add Description**|
|appleWatchBlockPairing|Boolean|**TODO: Add Description**|
|appleWatchForceWristDetection|Boolean|**TODO: Add Description**|
|appRemovalBlocked|Boolean|**TODO: Add Description**|
|appsSingleAppModeList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|appStoreBlockAutomaticDownloads|Boolean|**TODO: Add Description**|
|appStoreBlocked|Boolean|**TODO: Add Description**|
|appStoreBlockInAppPurchases|Boolean|**TODO: Add Description**|
|appStoreBlockUIAppInstallation|Boolean|**TODO: Add Description**|
|appStoreRequirePassword|Boolean|**TODO: Add Description**|
|appsVisibilityList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|appsVisibilityListType|appListType|**TODO: Add Description**. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|autoFillForceAuthentication|Boolean|**TODO: Add Description**|
|blockSystemAppRemoval|Boolean|**TODO: Add Description**|
|bluetoothBlockModification|Boolean|**TODO: Add Description**|
|cameraBlocked|Boolean|**TODO: Add Description**|
|cellularBlockDataRoaming|Boolean|**TODO: Add Description**|
|cellularBlockGlobalBackgroundFetchWhileRoaming|Boolean|**TODO: Add Description**|
|cellularBlockPerAppDataModification|Boolean|**TODO: Add Description**|
|cellularBlockPersonalHotspot|Boolean|**TODO: Add Description**|
|cellularBlockPersonalHotspotModification|Boolean|**TODO: Add Description**|
|cellularBlockPlanModification|Boolean|**TODO: Add Description**|
|cellularBlockVoiceRoaming|Boolean|**TODO: Add Description**|
|certificatesBlockUntrustedTlsCertificates|Boolean|**TODO: Add Description**|
|classroomAppBlockRemoteScreenObservation|Boolean|**TODO: Add Description**|
|classroomAppForceUnpromptedScreenObservation|Boolean|**TODO: Add Description**|
|classroomForceAutomaticallyJoinClasses|Boolean|**TODO: Add Description**|
|classroomForceRequestPermissionToLeaveClasses|Boolean|**TODO: Add Description**|
|classroomForceUnpromptedAppAndDeviceLock|Boolean|**TODO: Add Description**|
|compliantAppListType|appListType|**TODO: Add Description**. Possible values are: `none`, `appsInListCompliant`, `appsNotInListCompliant`.|
|compliantAppsList|[appListItem](../resources/intune-applistitem.md) collection|**TODO: Add Description**|
|configurationProfileBlockChanges|Boolean|**TODO: Add Description**|
|contactsAllowManagedToUnmanagedWrite|Boolean|**TODO: Add Description**|
|contactsAllowUnmanagedToManagedRead|Boolean|**TODO: Add Description**|
|continuousPathKeyboardBlocked|Boolean|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|dateAndTimeForceSetAutomatically|Boolean|**TODO: Add Description**|
|definitionLookupBlocked|Boolean|**TODO: Add Description**|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceBlockEnableRestrictions|Boolean|**TODO: Add Description**|
|deviceBlockEraseContentAndSettings|Boolean|**TODO: Add Description**|
|deviceBlockNameModification|Boolean|**TODO: Add Description**|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|diagnosticDataBlockSubmission|Boolean|**TODO: Add Description**|
|diagnosticDataBlockSubmissionModification|Boolean|**TODO: Add Description**|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|documentsBlockManagedDocumentsInUnmanagedApps|Boolean|**TODO: Add Description**|
|documentsBlockUnmanagedDocumentsInManagedApps|Boolean|**TODO: Add Description**|
|emailInDomainSuffixes|String collection|**TODO: Add Description**|
|enterpriseAppBlockTrust|Boolean|**TODO: Add Description**|
|enterpriseAppBlockTrustModification|Boolean|**TODO: Add Description**|
|enterpriseBookBlockBackup|Boolean|**TODO: Add Description**|
|enterpriseBookBlockMetadataSync|Boolean|**TODO: Add Description**|
|esimBlockModification|Boolean|**TODO: Add Description**|
|faceTimeBlocked|Boolean|**TODO: Add Description**|
|filesNetworkDriveAccessBlocked|Boolean|**TODO: Add Description**|
|filesUsbDriveAccessBlocked|Boolean|**TODO: Add Description**|
|findMyDeviceInFindMyAppBlocked|Boolean|**TODO: Add Description**|
|findMyFriendsBlocked|Boolean|**TODO: Add Description**|
|findMyFriendsInFindMyAppBlocked|Boolean|**TODO: Add Description**|
|gameCenterBlocked|Boolean|**TODO: Add Description**|
|gamingBlockGameCenterFriends|Boolean|**TODO: Add Description**|
|gamingBlockMultiplayer|Boolean|**TODO: Add Description**|
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
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|iTunesBlocked|Boolean|**TODO: Add Description**|
|iTunesBlockExplicitContent|Boolean|**TODO: Add Description**|
|iTunesBlockMusicService|Boolean|**TODO: Add Description**|
|iTunesBlockRadio|Boolean|**TODO: Add Description**|
|keyboardBlockAutoCorrect|Boolean|**TODO: Add Description**|
|keyboardBlockDictation|Boolean|**TODO: Add Description**|
|keyboardBlockPredictive|Boolean|**TODO: Add Description**|
|keyboardBlockShortcuts|Boolean|**TODO: Add Description**|
|keyboardBlockSpellCheck|Boolean|**TODO: Add Description**|
|keychainBlockCloudSync|Boolean|**TODO: Add Description**|
|kioskModeAllowAssistiveSpeak|Boolean|**TODO: Add Description**|
|kioskModeAllowAssistiveTouchSettings|Boolean|**TODO: Add Description**|
|kioskModeAllowAutoLock|Boolean|**TODO: Add Description**|
|kioskModeAllowColorInversionSettings|Boolean|**TODO: Add Description**|
|kioskModeAllowRingerSwitch|Boolean|**TODO: Add Description**|
|kioskModeAllowScreenRotation|Boolean|**TODO: Add Description**|
|kioskModeAllowSleepButton|Boolean|**TODO: Add Description**|
|kioskModeAllowTouchscreen|Boolean|**TODO: Add Description**|
|kioskModeAllowVoiceControlModification|Boolean|**TODO: Add Description**|
|kioskModeAllowVoiceOverSettings|Boolean|**TODO: Add Description**|
|kioskModeAllowVolumeButtons|Boolean|**TODO: Add Description**|
|kioskModeAllowZoomSettings|Boolean|**TODO: Add Description**|
|kioskModeAppStoreUrl|String|**TODO: Add Description**|
|kioskModeAppType|iosKioskModeAppType|**TODO: Add Description**. Possible values are: `notConfigured`, `appStoreApp`, `managedApp`, `builtInApp`.|
|kioskModeBlockAutoLock|Boolean|**TODO: Add Description**|
|kioskModeBlockRingerSwitch|Boolean|**TODO: Add Description**|
|kioskModeBlockScreenRotation|Boolean|**TODO: Add Description**|
|kioskModeBlockSleepButton|Boolean|**TODO: Add Description**|
|kioskModeBlockTouchscreen|Boolean|**TODO: Add Description**|
|kioskModeBlockVolumeButtons|Boolean|**TODO: Add Description**|
|kioskModeBuiltInAppId|String|**TODO: Add Description**|
|kioskModeEnableVoiceControl|Boolean|**TODO: Add Description**|
|kioskModeManagedAppId|String|**TODO: Add Description**|
|kioskModeRequireAssistiveTouch|Boolean|**TODO: Add Description**|
|kioskModeRequireColorInversion|Boolean|**TODO: Add Description**|
|kioskModeRequireMonoAudio|Boolean|**TODO: Add Description**|
|kioskModeRequireVoiceOver|Boolean|**TODO: Add Description**|
|kioskModeRequireZoom|Boolean|**TODO: Add Description**|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|lockScreenBlockControlCenter|Boolean|**TODO: Add Description**|
|lockScreenBlockNotificationView|Boolean|**TODO: Add Description**|
|lockScreenBlockPassbook|Boolean|**TODO: Add Description**|
|lockScreenBlockTodayView|Boolean|**TODO: Add Description**|
|mediaContentRatingApps|ratingAppsType|**TODO: Add Description**. Possible values are: `allAllowed`, `allBlocked`, `agesAbove4`, `agesAbove9`, `agesAbove12`, `agesAbove17`.|
|mediaContentRatingAustralia|[mediaContentRatingAustralia](../resources/intune-mediacontentratingaustralia.md)|**TODO: Add Description**|
|mediaContentRatingCanada|[mediaContentRatingCanada](../resources/intune-mediacontentratingcanada.md)|**TODO: Add Description**|
|mediaContentRatingFrance|[mediaContentRatingFrance](../resources/intune-mediacontentratingfrance.md)|**TODO: Add Description**|
|mediaContentRatingGermany|[mediaContentRatingGermany](../resources/intune-mediacontentratinggermany.md)|**TODO: Add Description**|
|mediaContentRatingIreland|[mediaContentRatingIreland](../resources/intune-mediacontentratingireland.md)|**TODO: Add Description**|
|mediaContentRatingJapan|[mediaContentRatingJapan](../resources/intune-mediacontentratingjapan.md)|**TODO: Add Description**|
|mediaContentRatingNewZealand|[mediaContentRatingNewZealand](../resources/intune-mediacontentratingnewzealand.md)|**TODO: Add Description**|
|mediaContentRatingUnitedKingdom|[mediaContentRatingUnitedKingdom](../resources/intune-mediacontentratingunitedkingdom.md)|**TODO: Add Description**|
|mediaContentRatingUnitedStates|[mediaContentRatingUnitedStates](../resources/intune-mediacontentratingunitedstates.md)|**TODO: Add Description**|
|messagesBlocked|Boolean|**TODO: Add Description**|
|networkUsageRules|[iosNetworkUsageRule](../resources/intune-iosnetworkusagerule.md) collection|**TODO: Add Description**|
|nfcBlocked|Boolean|**TODO: Add Description**|
|notificationsBlockSettingsModification|Boolean|**TODO: Add Description**|
|passcodeBlockFingerprintModification|Boolean|**TODO: Add Description**|
|passcodeBlockFingerprintUnlock|Boolean|**TODO: Add Description**|
|passcodeBlockModification|Boolean|**TODO: Add Description**|
|passcodeBlockSimple|Boolean|**TODO: Add Description**|
|passcodeExpirationDays|Int32|**TODO: Add Description**|
|passcodeMinimumCharacterSetCount|Int32|**TODO: Add Description**|
|passcodeMinimumLength|Int32|**TODO: Add Description**|
|passcodeMinutesOfInactivityBeforeLock|Int32|**TODO: Add Description**|
|passcodeMinutesOfInactivityBeforeScreenTimeout|Int32|**TODO: Add Description**|
|passcodePreviousPasscodeBlockCount|Int32|**TODO: Add Description**|
|passcodeRequired|Boolean|**TODO: Add Description**|
|passcodeRequiredType|requiredPasswordType|**TODO: Add Description**. Possible values are: `deviceDefault`, `alphanumeric`, `numeric`.|
|passcodeSignInFailureCountBeforeWipe|Int32|**TODO: Add Description**|
|passwordBlockAirDropSharing|Boolean|**TODO: Add Description**|
|passwordBlockAutoFill|Boolean|**TODO: Add Description**|
|passwordBlockProximityRequests|Boolean|**TODO: Add Description**|
|pkiBlockOTAUpdates|Boolean|**TODO: Add Description**|
|podcastsBlocked|Boolean|**TODO: Add Description**|
|privacyForceLimitAdTracking|Boolean|**TODO: Add Description**|
|proximityBlockSetupToNewDevice|Boolean|**TODO: Add Description**|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|safariBlockAutofill|Boolean|**TODO: Add Description**|
|safariBlocked|Boolean|**TODO: Add Description**|
|safariBlockJavaScript|Boolean|**TODO: Add Description**|
|safariBlockPopups|Boolean|**TODO: Add Description**|
|safariCookieSettings|webBrowserCookieSettings|**TODO: Add Description**. Possible values are: `browserDefault`, `blockAlways`, `allowCurrentWebSite`, `allowFromWebsitesVisited`, `allowAlways`.|
|safariManagedDomains|String collection|**TODO: Add Description**|
|safariPasswordAutoFillDomains|String collection|**TODO: Add Description**|
|safariRequireFraudWarning|Boolean|**TODO: Add Description**|
|screenCaptureBlocked|Boolean|**TODO: Add Description**|
|sharedDeviceBlockTemporarySessions|Boolean|**TODO: Add Description**|
|siriBlocked|Boolean|**TODO: Add Description**|
|siriBlockedWhenLocked|Boolean|**TODO: Add Description**|
|siriBlockUserGeneratedContent|Boolean|**TODO: Add Description**|
|siriRequireProfanityFilter|Boolean|**TODO: Add Description**|
|softwareUpdatesEnforcedDelayInDays|Int32|**TODO: Add Description**|
|softwareUpdatesForceDelayed|Boolean|**TODO: Add Description**|
|spotlightBlockInternetResults|Boolean|**TODO: Add Description**|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|usbRestrictedModeBlocked|Boolean|**TODO: Add Description**|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|voiceDialingBlocked|Boolean|**TODO: Add Description**|
|vpnBlockCreation|Boolean|**TODO: Add Description**|
|wallpaperBlockModification|Boolean|**TODO: Add Description**|
|wiFiConnectOnlyToConfiguredNetworks|Boolean|**TODO: Add Description**|
|wifiPowerOnForced|Boolean|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/intune-deviceconfigurationassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/intune-settingstatedevicesummary.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/intune-deviceconfigurationdevicestatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/intune-deviceconfigurationdeviceoverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/intune-deviceconfigurationgroupassignment.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatuses|[deviceConfigurationUserStatus](../resources/intune-deviceconfigurationuserstatus.md) collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/intune-deviceconfigurationuseroverview.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.iosGeneralDeviceConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosGeneralDeviceConfiguration",
  "id": "String (identifier)",
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

