---
title: "List iosGeneralDeviceConfigurations"
description: "Get a list of the iosGeneralDeviceConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List iosGeneralDeviceConfigurations
Namespace: microsoft.graph



Get a list of the [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.iosGeneralDeviceConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [iosGeneralDeviceConfiguration](../resources/iosgeneraldeviceconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_iosgeneraldeviceconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.iosGeneralDeviceConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.iosGeneralDeviceConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
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
  ]
}
```

