---
title: "Get iosGeneralDeviceConfiguration"
description: "Read the properties and relationships of an iosGeneralDeviceConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosGeneralDeviceConfiguration
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Read the properties and relationships of an [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.iosGeneralDeviceConfiguration not found
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

If successful, this method returns a `200 OK` response code and an [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_iosgeneraldeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosGeneralDeviceConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosGeneralDeviceConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

