---
title: "Get windows10EndpointProtectionConfiguration"
description: "Read the properties and relationships of a windows10EndpointProtectionConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windows10EndpointProtectionConfiguration
Namespace: microsoft.graph



Read the properties and relationships of a [windows10EndpointProtectionConfiguration](../resources/windows10endpointprotectionconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.windows10EndpointProtectionConfiguration not found
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

If successful, this method returns a `200 OK` response code and a [windows10EndpointProtectionConfiguration](../resources/windows10endpointprotectionconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windows10endpointprotectionconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windows10EndpointProtectionConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10EndpointProtectionConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.windows10EndpointProtectionConfiguration",
    "id": "3bbe6d2d-6d2d-3bbe-2d6d-be3b2d6dbe3b",
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
    "applicationGuardAllowCameraMicrophoneRedirection": "Boolean",
    "applicationGuardAllowFileSaveOnHost": "Boolean",
    "applicationGuardAllowPersistence": "Boolean",
    "applicationGuardAllowPrintToLocalPrinters": "Boolean",
    "applicationGuardAllowPrintToNetworkPrinters": "Boolean",
    "applicationGuardAllowPrintToPDF": "Boolean",
    "applicationGuardAllowPrintToXPS": "Boolean",
    "applicationGuardAllowVirtualGPU": "Boolean",
    "applicationGuardBlockClipboardSharing": "String",
    "applicationGuardBlockFileTransfer": "String",
    "applicationGuardBlockNonEnterpriseContent": "Boolean",
    "applicationGuardCertificateThumbprints": [
      "String"
    ],
    "applicationGuardEnabled": "Boolean",
    "applicationGuardEnabledOptions": "String",
    "applicationGuardForceAuditing": "Boolean",
    "appLockerApplicationControl": "String",
    "bitLockerAllowStandardUserEncryption": "Boolean",
    "bitLockerDisableWarningForOtherDiskEncryption": "Boolean",
    "bitLockerEnableStorageCardEncryptionOnMobile": "Boolean",
    "bitLockerEncryptDevice": "Boolean",
    "bitLockerFixedDrivePolicy": {
      "@odata.type": "microsoft.graph.bitLockerFixedDrivePolicy"
    },
    "bitLockerRecoveryPasswordRotation": "String",
    "bitLockerRemovableDrivePolicy": {
      "@odata.type": "microsoft.graph.bitLockerRemovableDrivePolicy"
    },
    "bitLockerSystemDrivePolicy": {
      "@odata.type": "microsoft.graph.bitLockerSystemDrivePolicy"
    },
    "defenderAdditionalGuardedFolders": [
      "String"
    ],
    "defenderAdobeReaderLaunchChildProcess": "String",
    "defenderAdvancedRansomewareProtectionType": "String",
    "defenderAllowBehaviorMonitoring": "Boolean",
    "defenderAllowCloudProtection": "Boolean",
    "defenderAllowEndUserAccess": "Boolean",
    "defenderAllowIntrusionPreventionSystem": "Boolean",
    "defenderAllowOnAccessProtection": "Boolean",
    "defenderAllowRealTimeMonitoring": "Boolean",
    "defenderAllowScanArchiveFiles": "Boolean",
    "defenderAllowScanDownloads": "Boolean",
    "defenderAllowScanNetworkFiles": "Boolean",
    "defenderAllowScanRemovableDrivesDuringFullScan": "Boolean",
    "defenderAllowScanScriptsLoadedInInternetExplorer": "Boolean",
    "defenderAttackSurfaceReductionExcludedPaths": [
      "String"
    ],
    "defenderBlockEndUserAccess": "Boolean",
    "defenderBlockPersistenceThroughWmiType": "String",
    "defenderCheckForSignaturesBeforeRunningScan": "Boolean",
    "defenderCloudBlockLevel": "String",
    "defenderCloudExtendedTimeoutInSeconds": "Integer",
    "defenderDaysBeforeDeletingQuarantinedMalware": "Integer",
    "defenderDetectedMalwareActions": {
      "@odata.type": "microsoft.graph.defenderDetectedMalwareActions"
    },
    "defenderDisableBehaviorMonitoring": "Boolean",
    "defenderDisableCatchupFullScan": "Boolean",
    "defenderDisableCatchupQuickScan": "Boolean",
    "defenderDisableCloudProtection": "Boolean",
    "defenderDisableIntrusionPreventionSystem": "Boolean",
    "defenderDisableOnAccessProtection": "Boolean",
    "defenderDisableRealTimeMonitoring": "Boolean",
    "defenderDisableScanArchiveFiles": "Boolean",
    "defenderDisableScanDownloads": "Boolean",
    "defenderDisableScanNetworkFiles": "Boolean",
    "defenderDisableScanRemovableDrivesDuringFullScan": "Boolean",
    "defenderDisableScanScriptsLoadedInInternetExplorer": "Boolean",
    "defenderEmailContentExecution": "String",
    "defenderEmailContentExecutionType": "String",
    "defenderEnableLowCpuPriority": "Boolean",
    "defenderEnableScanIncomingMail": "Boolean",
    "defenderEnableScanMappedNetworkDrivesDuringFullScan": "Boolean",
    "defenderExploitProtectionXml": "Binary",
    "defenderExploitProtectionXmlFileName": "String",
    "defenderFileExtensionsToExclude": [
      "String"
    ],
    "defenderFilesAndFoldersToExclude": [
      "String"
    ],
    "defenderGuardedFoldersAllowedAppPaths": [
      "String"
    ],
    "defenderGuardMyFoldersType": "String",
    "defenderNetworkProtectionType": "String",
    "defenderOfficeAppsExecutableContentCreationOrLaunch": "String",
    "defenderOfficeAppsExecutableContentCreationOrLaunchType": "String",
    "defenderOfficeAppsLaunchChildProcess": "String",
    "defenderOfficeAppsLaunchChildProcessType": "String",
    "defenderOfficeAppsOtherProcessInjection": "String",
    "defenderOfficeAppsOtherProcessInjectionType": "String",
    "defenderOfficeCommunicationAppsLaunchChildProcess": "String",
    "defenderOfficeMacroCodeAllowWin32Imports": "String",
    "defenderOfficeMacroCodeAllowWin32ImportsType": "String",
    "defenderPotentiallyUnwantedAppAction": "String",
    "defenderPreventCredentialStealingType": "String",
    "defenderProcessCreation": "String",
    "defenderProcessCreationType": "String",
    "defenderProcessesToExclude": [
      "String"
    ],
    "defenderScanDirection": "String",
    "defenderScanMaxCpuPercentage": "Integer",
    "defenderScanType": "String",
    "defenderScheduledQuickScanTime": "String (time of day)",
    "defenderScheduledScanDay": "String",
    "defenderScheduledScanTime": "String (time of day)",
    "defenderScriptDownloadedPayloadExecution": "String",
    "defenderScriptDownloadedPayloadExecutionType": "String",
    "defenderScriptObfuscatedMacroCode": "String",
    "defenderScriptObfuscatedMacroCodeType": "String",
    "defenderSecurityCenterBlockExploitProtectionOverride": "Boolean",
    "defenderSecurityCenterDisableAccountUI": "Boolean",
    "defenderSecurityCenterDisableAppBrowserUI": "Boolean",
    "defenderSecurityCenterDisableClearTpmUI": "Boolean",
    "defenderSecurityCenterDisableFamilyUI": "Boolean",
    "defenderSecurityCenterDisableHardwareUI": "Boolean",
    "defenderSecurityCenterDisableHealthUI": "Boolean",
    "defenderSecurityCenterDisableNetworkUI": "Boolean",
    "defenderSecurityCenterDisableNotificationAreaUI": "Boolean",
    "defenderSecurityCenterDisableRansomwareUI": "Boolean",
    "defenderSecurityCenterDisableSecureBootUI": "Boolean",
    "defenderSecurityCenterDisableTroubleshootingUI": "Boolean",
    "defenderSecurityCenterDisableVirusUI": "Boolean",
    "defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI": "Boolean",
    "defenderSecurityCenterHelpEmail": "String",
    "defenderSecurityCenterHelpPhone": "String",
    "defenderSecurityCenterHelpURL": "String",
    "defenderSecurityCenterITContactDisplay": "String",
    "defenderSecurityCenterNotificationsFromApp": "String",
    "defenderSecurityCenterOrganizationDisplayName": "String",
    "defenderSignatureUpdateIntervalInHours": "Integer",
    "defenderSubmitSamplesConsentType": "String",
    "defenderUntrustedExecutable": "String",
    "defenderUntrustedExecutableType": "String",
    "defenderUntrustedUSBProcess": "String",
    "defenderUntrustedUSBProcessType": "String",
    "deviceGuardEnableSecureBootWithDMA": "Boolean",
    "deviceGuardEnableVirtualizationBasedSecurity": "Boolean",
    "deviceGuardLaunchSystemGuard": "String",
    "deviceGuardLocalSystemAuthorityCredentialGuardSettings": "String",
    "deviceGuardSecureBootWithDMA": "String",
    "dmaGuardDeviceEnumerationPolicy": "String",
    "firewallBlockStatefulFTP": "Boolean",
    "firewallCertificateRevocationListCheckMethod": "String",
    "firewallIdleTimeoutForSecurityAssociationInSeconds": "Integer",
    "firewallIPSecExemptionsAllowDHCP": "Boolean",
    "firewallIPSecExemptionsAllowICMP": "Boolean",
    "firewallIPSecExemptionsAllowNeighborDiscovery": "Boolean",
    "firewallIPSecExemptionsAllowRouterDiscovery": "Boolean",
    "firewallIPSecExemptionsNone": "Boolean",
    "firewallMergeKeyingModuleSettings": "Boolean",
    "firewallPacketQueueingMethod": "String",
    "firewallPreSharedKeyEncodingMethod": "String",
    "firewallProfileDomain": {
      "@odata.type": "microsoft.graph.windowsFirewallNetworkProfile"
    },
    "firewallProfilePrivate": {
      "@odata.type": "microsoft.graph.windowsFirewallNetworkProfile"
    },
    "firewallProfilePublic": {
      "@odata.type": "microsoft.graph.windowsFirewallNetworkProfile"
    },
    "firewallRules": [
      {
        "@odata.type": "microsoft.graph.windowsFirewallRule"
      }
    ],
    "lanManagerAuthenticationLevel": "String",
    "lanManagerWorkstationDisableInsecureGuestLogons": "Boolean",
    "localSecurityOptionsAdministratorAccountName": "String",
    "localSecurityOptionsAdministratorElevationPromptBehavior": "String",
    "localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares": "Boolean",
    "localSecurityOptionsAllowPKU2UAuthenticationRequests": "Boolean",
    "localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager": "String",
    "localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool": "Boolean",
    "localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn": "Boolean",
    "localSecurityOptionsAllowUIAccessApplicationElevation": "Boolean",
    "localSecurityOptionsAllowUIAccessApplicationsForSecureLocations": "Boolean",
    "localSecurityOptionsAllowUndockWithoutHavingToLogon": "Boolean",
    "localSecurityOptionsBlockMicrosoftAccounts": "Boolean",
    "localSecurityOptionsBlockRemoteLogonWithBlankPassword": "Boolean",
    "localSecurityOptionsBlockRemoteOpticalDriveAccess": "Boolean",
    "localSecurityOptionsBlockUsersInstallingPrinterDrivers": "Boolean",
    "localSecurityOptionsClearVirtualMemoryPageFile": "Boolean",
    "localSecurityOptionsClientDigitallySignCommunicationsAlways": "Boolean",
    "localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers": "Boolean",
    "localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation": "Boolean",
    "localSecurityOptionsDisableAdministratorAccount": "Boolean",
    "localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees": "Boolean",
    "localSecurityOptionsDisableGuestAccount": "Boolean",
    "localSecurityOptionsDisableServerDigitallySignCommunicationsAlways": "Boolean",
    "localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees": "Boolean",
    "localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts": "Boolean",
    "localSecurityOptionsDoNotRequireCtrlAltDel": "Boolean",
    "localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange": "Boolean",
    "localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser": "String",
    "localSecurityOptionsGuestAccountName": "String",
    "localSecurityOptionsHideLastSignedInUser": "Boolean",
    "localSecurityOptionsHideUsernameAtSignIn": "Boolean",
    "localSecurityOptionsInformationDisplayedOnLockScreen": "String",
    "localSecurityOptionsInformationShownOnLockScreen": "String",
    "localSecurityOptionsLogOnMessageText": "String",
    "localSecurityOptionsLogOnMessageTitle": "String",
    "localSecurityOptionsMachineInactivityLimit": "Integer",
    "localSecurityOptionsMachineInactivityLimitInMinutes": "Integer",
    "localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients": "String",
    "localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers": "String",
    "localSecurityOptionsOnlyElevateSignedExecutables": "Boolean",
    "localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares": "Boolean",
    "localSecurityOptionsSmartCardRemovalBehavior": "String",
    "localSecurityOptionsStandardUserElevationPromptBehavior": "String",
    "localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation": "Boolean",
    "localSecurityOptionsUseAdminApprovalMode": "Boolean",
    "localSecurityOptionsUseAdminApprovalModeForAdministrators": "Boolean",
    "localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations": "Boolean",
    "smartScreenBlockOverrideForFiles": "Boolean",
    "smartScreenEnableInShell": "Boolean",
    "userRightsAccessCredentialManagerAsTrustedCaller": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsActAsPartOfTheOperatingSystem": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsAllowAccessFromNetwork": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsBackupData": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsBlockAccessFromNetwork": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsChangeSystemTime": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsCreateGlobalObjects": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsCreatePageFile": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsCreatePermanentSharedObjects": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsCreateSymbolicLinks": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsCreateToken": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsDebugPrograms": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsDelegation": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsDenyLocalLogOn": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsGenerateSecurityAudits": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsImpersonateClient": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsIncreaseSchedulingPriority": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsLoadUnloadDrivers": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsLocalLogOn": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsLockMemory": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsManageAuditingAndSecurityLogs": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsManageVolumes": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsModifyFirmwareEnvironment": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsModifyObjectLabels": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsProfileSingleProcess": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsRemoteDesktopServicesLogOn": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsRemoteShutdown": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsRestoreData": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "userRightsTakeOwnership": {
      "@odata.type": "microsoft.graph.deviceManagementUserRightsSetting"
    },
    "windowsDefenderTamperProtection": "String",
    "xboxServicesAccessoryManagementServiceStartupMode": "String",
    "xboxServicesEnableXboxGameSaveTask": "Boolean",
    "xboxServicesLiveAuthManagerServiceStartupMode": "String",
    "xboxServicesLiveGameSaveServiceStartupMode": "String",
    "xboxServicesLiveNetworkingServiceStartupMode": "String"
  }
}
```

