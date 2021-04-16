---
title: "Get windows10GeneralConfiguration"
description: "Read the properties and relationships of a windows10GeneralConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windows10GeneralConfiguration
Namespace: microsoft.graph



Read the properties and relationships of a [windows10GeneralConfiguration](../resources/windows10generalconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.windows10GeneralConfiguration not found
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

If successful, this method returns a `200 OK` response code and a [windows10GeneralConfiguration](../resources/windows10generalconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windows10generalconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windows10GeneralConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10GeneralConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.windows10GeneralConfiguration",
    "id": "da69cc71-cc71-da69-71cc-69da71cc69da",
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
    "accountsBlockAddingNonMicrosoftAccountEmail": "Boolean",
    "activateAppsWithVoice": "String",
    "antiTheftModeBlocked": "Boolean",
    "appManagementMSIAllowUserControlOverInstall": "Boolean",
    "appManagementMSIAlwaysInstallWithElevatedPrivileges": "Boolean",
    "appManagementPackageFamilyNamesToLaunchAfterLogOn": [
      "String"
    ],
    "appsAllowTrustedAppsSideloading": "String",
    "appsBlockWindowsStoreOriginatedApps": "Boolean",
    "authenticationAllowSecondaryDevice": "Boolean",
    "authenticationPreferredAzureADTenantDomainName": "String",
    "authenticationWebSignIn": "String",
    "bluetoothAllowedServices": [
      "String"
    ],
    "bluetoothBlockAdvertising": "Boolean",
    "bluetoothBlockDiscoverableMode": "Boolean",
    "bluetoothBlocked": "Boolean",
    "bluetoothBlockPrePairing": "Boolean",
    "bluetoothBlockPromptedProximalConnections": "Boolean",
    "cameraBlocked": "Boolean",
    "cellularBlockDataWhenRoaming": "Boolean",
    "cellularBlockVpn": "Boolean",
    "cellularBlockVpnWhenRoaming": "Boolean",
    "cellularData": "String",
    "certificatesBlockManualRootCertificateInstallation": "Boolean",
    "configureTimeZone": "String",
    "connectedDevicesServiceBlocked": "Boolean",
    "copyPasteBlocked": "Boolean",
    "cortanaBlocked": "Boolean",
    "cryptographyAllowFipsAlgorithmPolicy": "Boolean",
    "dataProtectionBlockDirectMemoryAccess": "Boolean",
    "defenderBlockEndUserAccess": "Boolean",
    "defenderBlockOnAccessProtection": "Boolean",
    "defenderCloudBlockLevel": "String",
    "defenderCloudExtendedTimeout": "Integer",
    "defenderCloudExtendedTimeoutInSeconds": "Integer",
    "defenderDaysBeforeDeletingQuarantinedMalware": "Integer",
    "defenderDetectedMalwareActions": {
      "@odata.type": "microsoft.graph.defenderDetectedMalwareActions"
    },
    "defenderDisableCatchupFullScan": "Boolean",
    "defenderDisableCatchupQuickScan": "Boolean",
    "defenderFileExtensionsToExclude": [
      "String"
    ],
    "defenderFilesAndFoldersToExclude": [
      "String"
    ],
    "defenderMonitorFileActivity": "String",
    "defenderPotentiallyUnwantedAppAction": "String",
    "defenderPotentiallyUnwantedAppActionSetting": "String",
    "defenderProcessesToExclude": [
      "String"
    ],
    "defenderPromptForSampleSubmission": "String",
    "defenderRequireBehaviorMonitoring": "Boolean",
    "defenderRequireCloudProtection": "Boolean",
    "defenderRequireNetworkInspectionSystem": "Boolean",
    "defenderRequireRealTimeMonitoring": "Boolean",
    "defenderScanArchiveFiles": "Boolean",
    "defenderScanDownloads": "Boolean",
    "defenderScanIncomingMail": "Boolean",
    "defenderScanMappedNetworkDrivesDuringFullScan": "Boolean",
    "defenderScanMaxCpu": "Integer",
    "defenderScanNetworkFiles": "Boolean",
    "defenderScanRemovableDrivesDuringFullScan": "Boolean",
    "defenderScanScriptsLoadedInInternetExplorer": "Boolean",
    "defenderScanType": "String",
    "defenderScheduledQuickScanTime": "String (time of day)",
    "defenderScheduledScanTime": "String (time of day)",
    "defenderScheduleScanEnableLowCpuPriority": "Boolean",
    "defenderSignatureUpdateIntervalInHours": "Integer",
    "defenderSubmitSamplesConsentType": "String",
    "defenderSystemScanSchedule": "String",
    "developerUnlockSetting": "String",
    "deviceManagementBlockFactoryResetOnMobile": "Boolean",
    "deviceManagementBlockManualUnenroll": "Boolean",
    "diagnosticsDataSubmissionMode": "String",
    "displayAppListWithGdiDPIScalingTurnedOff": [
      "String"
    ],
    "displayAppListWithGdiDPIScalingTurnedOn": [
      "String"
    ],
    "edgeAllowStartPagesModification": "Boolean",
    "edgeBlockAccessToAboutFlags": "Boolean",
    "edgeBlockAddressBarDropdown": "Boolean",
    "edgeBlockAutofill": "Boolean",
    "edgeBlockCompatibilityList": "Boolean",
    "edgeBlockDeveloperTools": "Boolean",
    "edgeBlocked": "Boolean",
    "edgeBlockEditFavorites": "Boolean",
    "edgeBlockExtensions": "Boolean",
    "edgeBlockFullScreenMode": "Boolean",
    "edgeBlockInPrivateBrowsing": "Boolean",
    "edgeBlockJavaScript": "Boolean",
    "edgeBlockLiveTileDataCollection": "Boolean",
    "edgeBlockPasswordManager": "Boolean",
    "edgeBlockPopups": "Boolean",
    "edgeBlockPrelaunch": "Boolean",
    "edgeBlockPrinting": "Boolean",
    "edgeBlockSavingHistory": "Boolean",
    "edgeBlockSearchEngineCustomization": "Boolean",
    "edgeBlockSearchSuggestions": "Boolean",
    "edgeBlockSendingDoNotTrackHeader": "Boolean",
    "edgeBlockSendingIntranetTrafficToInternetExplorer": "Boolean",
    "edgeBlockSideloadingExtensions": "Boolean",
    "edgeBlockTabPreloading": "Boolean",
    "edgeBlockWebContentOnNewTabPage": "Boolean",
    "edgeClearBrowsingDataOnExit": "Boolean",
    "edgeCookiePolicy": "String",
    "edgeDisableFirstRunPage": "Boolean",
    "edgeEnterpriseModeSiteListLocation": "String",
    "edgeFavoritesBarVisibility": "String",
    "edgeFavoritesListLocation": "String",
    "edgeFirstRunUrl": "String",
    "edgeHomeButtonConfiguration": {
      "@odata.type": "microsoft.graph.edgeHomeButtonConfiguration"
    },
    "edgeHomeButtonConfigurationEnabled": "Boolean",
    "edgeHomepageUrls": [
      "String"
    ],
    "edgeKioskModeRestriction": "String",
    "edgeKioskResetAfterIdleTimeInMinutes": "Integer",
    "edgeNewTabPageURL": "String",
    "edgeOpensWith": "String",
    "edgePreventCertificateErrorOverride": "Boolean",
    "edgeRequiredExtensionPackageFamilyNames": [
      "String"
    ],
    "edgeRequireSmartScreen": "Boolean",
    "edgeSearchEngine": {
      "@odata.type": "microsoft.graph.edgeSearchEngineBase"
    },
    "edgeSendIntranetTrafficToInternetExplorer": "Boolean",
    "edgeShowMessageWhenOpeningInternetExplorerSites": "String",
    "edgeSyncFavoritesWithInternetExplorer": "Boolean",
    "edgeTelemetryForMicrosoft365Analytics": "String",
    "enableAutomaticRedeployment": "Boolean",
    "energySaverOnBatteryThresholdPercentage": "Integer",
    "energySaverPluggedInThresholdPercentage": "Integer",
    "enterpriseCloudPrintDiscoveryEndPoint": "String",
    "enterpriseCloudPrintDiscoveryMaxLimit": "Integer",
    "enterpriseCloudPrintMopriaDiscoveryResourceIdentifier": "String",
    "enterpriseCloudPrintOAuthAuthority": "String",
    "enterpriseCloudPrintOAuthClientIdentifier": "String",
    "enterpriseCloudPrintResourceIdentifier": "String",
    "experienceBlockDeviceDiscovery": "Boolean",
    "experienceBlockErrorDialogWhenNoSIM": "Boolean",
    "experienceBlockTaskSwitcher": "Boolean",
    "experienceDoNotSyncBrowserSettings": "String",
    "findMyFiles": "String",
    "gameDvrBlocked": "Boolean",
    "inkWorkspaceAccess": "String",
    "inkWorkspaceAccessState": "String",
    "inkWorkspaceBlockSuggestedApps": "Boolean",
    "internetSharingBlocked": "Boolean",
    "locationServicesBlocked": "Boolean",
    "lockScreenActivateAppsWithVoice": "String",
    "lockScreenAllowTimeoutConfiguration": "Boolean",
    "lockScreenBlockActionCenterNotifications": "Boolean",
    "lockScreenBlockCortana": "Boolean",
    "lockScreenBlockToastNotifications": "Boolean",
    "lockScreenTimeoutInSeconds": "Integer",
    "logonBlockFastUserSwitching": "Boolean",
    "messagingBlockMMS": "Boolean",
    "messagingBlockRichCommunicationServices": "Boolean",
    "messagingBlockSync": "Boolean",
    "microsoftAccountBlocked": "Boolean",
    "microsoftAccountBlockSettingsSync": "Boolean",
    "microsoftAccountSignInAssistantSettings": "String",
    "networkProxyApplySettingsDeviceWide": "Boolean",
    "networkProxyAutomaticConfigurationUrl": "String",
    "networkProxyDisableAutoDetect": "Boolean",
    "networkProxyServer": {
      "@odata.type": "microsoft.graph.windows10NetworkProxyServer"
    },
    "nfcBlocked": "Boolean",
    "oneDriveDisableFileSync": "Boolean",
    "passwordBlockSimple": "Boolean",
    "passwordExpirationDays": "Integer",
    "passwordMinimumAgeInDays": "Integer",
    "passwordMinimumCharacterSetCount": "Integer",
    "passwordMinimumLength": "Integer",
    "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
    "passwordPreviousPasswordBlockCount": "Integer",
    "passwordRequired": "Boolean",
    "passwordRequiredType": "String",
    "passwordRequireWhenResumeFromIdleState": "Boolean",
    "passwordSignInFailureCountBeforeFactoryReset": "Integer",
    "personalizationDesktopImageUrl": "String",
    "personalizationLockScreenImageUrl": "String",
    "powerButtonActionOnBattery": "String",
    "powerButtonActionPluggedIn": "String",
    "powerHybridSleepOnBattery": "String",
    "powerHybridSleepPluggedIn": "String",
    "powerLidCloseActionOnBattery": "String",
    "powerLidCloseActionPluggedIn": "String",
    "powerSleepButtonActionOnBattery": "String",
    "powerSleepButtonActionPluggedIn": "String",
    "printerBlockAddition": "Boolean",
    "printerDefaultName": "String",
    "printerNames": [
      "String"
    ],
    "privacyAdvertisingId": "String",
    "privacyAutoAcceptPairingAndConsentPrompts": "Boolean",
    "privacyBlockActivityFeed": "Boolean",
    "privacyBlockInputPersonalization": "Boolean",
    "privacyBlockPublishUserActivities": "Boolean",
    "privacyDisableLaunchExperience": "Boolean",
    "resetProtectionModeBlocked": "Boolean",
    "safeSearchFilter": "String",
    "screenCaptureBlocked": "Boolean",
    "searchBlockDiacritics": "Boolean",
    "searchBlockWebResults": "Boolean",
    "searchDisableAutoLanguageDetection": "Boolean",
    "searchDisableIndexerBackoff": "Boolean",
    "searchDisableIndexingEncryptedItems": "Boolean",
    "searchDisableIndexingRemovableDrive": "Boolean",
    "searchDisableLocation": "Boolean",
    "searchDisableUseLocation": "Boolean",
    "searchEnableAutomaticIndexSizeManangement": "Boolean",
    "searchEnableRemoteQueries": "Boolean",
    "securityBlockAzureADJoinedDevicesAutoEncryption": "Boolean",
    "settingsBlockAccountsPage": "Boolean",
    "settingsBlockAddProvisioningPackage": "Boolean",
    "settingsBlockAppsPage": "Boolean",
    "settingsBlockChangeLanguage": "Boolean",
    "settingsBlockChangePowerSleep": "Boolean",
    "settingsBlockChangeRegion": "Boolean",
    "settingsBlockChangeSystemTime": "Boolean",
    "settingsBlockDevicesPage": "Boolean",
    "settingsBlockEaseOfAccessPage": "Boolean",
    "settingsBlockEditDeviceName": "Boolean",
    "settingsBlockGamingPage": "Boolean",
    "settingsBlockNetworkInternetPage": "Boolean",
    "settingsBlockPersonalizationPage": "Boolean",
    "settingsBlockPrivacyPage": "Boolean",
    "settingsBlockRemoveProvisioningPackage": "Boolean",
    "settingsBlockSettingsApp": "Boolean",
    "settingsBlockSystemPage": "Boolean",
    "settingsBlockTimeLanguagePage": "Boolean",
    "settingsBlockUpdateSecurityPage": "Boolean",
    "sharedUserAppDataAllowed": "Boolean",
    "smartScreenAppInstallControl": "String",
    "smartScreenBlockPromptOverride": "Boolean",
    "smartScreenBlockPromptOverrideForFiles": "Boolean",
    "smartScreenEnableAppInstallControl": "Boolean",
    "startBlockUnpinningAppsFromTaskbar": "Boolean",
    "startMenuAppListVisibility": "String",
    "startMenuHideChangeAccountSettings": "Boolean",
    "startMenuHideFrequentlyUsedApps": "Boolean",
    "startMenuHideHibernate": "Boolean",
    "startMenuHideLock": "Boolean",
    "startMenuHidePowerButton": "Boolean",
    "startMenuHideRecentJumpLists": "Boolean",
    "startMenuHideRecentlyAddedApps": "Boolean",
    "startMenuHideRestartOptions": "Boolean",
    "startMenuHideShutDown": "Boolean",
    "startMenuHideSignOut": "Boolean",
    "startMenuHideSleep": "Boolean",
    "startMenuHideSwitchAccount": "Boolean",
    "startMenuHideUserTile": "Boolean",
    "startMenuLayoutEdgeAssetsXml": "Binary",
    "startMenuLayoutXml": "Binary",
    "startMenuMode": "String",
    "startMenuPinnedFolderDocuments": "String",
    "startMenuPinnedFolderDownloads": "String",
    "startMenuPinnedFolderFileExplorer": "String",
    "startMenuPinnedFolderHomeGroup": "String",
    "startMenuPinnedFolderMusic": "String",
    "startMenuPinnedFolderNetwork": "String",
    "startMenuPinnedFolderPersonalFolder": "String",
    "startMenuPinnedFolderPictures": "String",
    "startMenuPinnedFolderSettings": "String",
    "startMenuPinnedFolderVideos": "String",
    "storageBlockRemovableStorage": "Boolean",
    "storageRequireMobileDeviceEncryption": "Boolean",
    "storageRestrictAppDataToSystemVolume": "Boolean",
    "storageRestrictAppInstallToSystemVolume": "Boolean",
    "systemTelemetryProxyServer": "String",
    "taskManagerBlockEndTask": "Boolean",
    "tenantLockdownRequireNetworkDuringOutOfBoxExperience": "Boolean",
    "uninstallBuiltInApps": "Boolean",
    "usbBlocked": "Boolean",
    "voiceRecordingBlocked": "Boolean",
    "webRtcBlockLocalhostIpAddress": "Boolean",
    "wiFiBlockAutomaticConnectHotspots": "Boolean",
    "wiFiBlocked": "Boolean",
    "wiFiBlockManualConfiguration": "Boolean",
    "wiFiScanInterval": "Integer",
    "windows10AppsForceUpdateSchedule": {
      "@odata.type": "microsoft.graph.windows10AppsForceUpdateSchedule"
    },
    "windowsSpotlightBlockConsumerSpecificFeatures": "Boolean",
    "windowsSpotlightBlocked": "Boolean",
    "windowsSpotlightBlockOnActionCenter": "Boolean",
    "windowsSpotlightBlockTailoredExperiences": "Boolean",
    "windowsSpotlightBlockThirdPartyNotifications": "Boolean",
    "windowsSpotlightBlockWelcomeExperience": "Boolean",
    "windowsSpotlightBlockWindowsTips": "Boolean",
    "windowsSpotlightConfigureOnLockScreen": "String",
    "windowsStoreBlockAutoUpdate": "Boolean",
    "windowsStoreBlocked": "Boolean",
    "windowsStoreEnablePrivateStoreOnly": "Boolean",
    "wirelessDisplayBlockProjectionToThisDevice": "Boolean",
    "wirelessDisplayBlockUserInputFromReceiver": "Boolean",
    "wirelessDisplayRequirePinForPairing": "Boolean"
  }
}
```

