---
title: "Update windows10EndpointProtectionConfiguration"
description: "Update the properties of a windows10EndpointProtectionConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windows10EndpointProtectionConfiguration
Namespace: microsoft.graph



Update the properties of a [windows10EndpointProtectionConfiguration](../resources/windows10endpointprotectionconfiguration.md) object.

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
PATCH ** Entity URI for microsoft.graph.windows10EndpointProtectionConfiguration not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10EndpointProtectionConfiguration](../resources/windows10endpointprotectionconfiguration.md) object.

The following table shows the properties that are required when you update the [windows10EndpointProtectionConfiguration](../resources/windows10endpointprotectionconfiguration.md).

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
|applicationGuardAllowCameraMicrophoneRedirection|Boolean|Gets or sets whether applications inside Microsoft Defender Application Guard can access the device’s camera and microphone.|
|applicationGuardAllowFileSaveOnHost|Boolean|Allow users to download files from Edge in the application guard container and save them on the host file system|
|applicationGuardAllowPersistence|Boolean|Allow persisting user generated data inside the App Guard Containter (favorites, cookies, web passwords, etc.)|
|applicationGuardAllowPrintToLocalPrinters|Boolean|Allow printing to Local Printers from Container|
|applicationGuardAllowPrintToNetworkPrinters|Boolean|Allow printing to Network Printers from Container|
|applicationGuardAllowPrintToPDF|Boolean|Allow printing to PDF from Container|
|applicationGuardAllowPrintToXPS|Boolean|Allow printing to XPS from Container|
|applicationGuardAllowVirtualGPU|Boolean|Allow application guard to use virtual GPU|
|applicationGuardBlockClipboardSharing|applicationGuardBlockClipboardSharingType|Block clipboard to share data from Host to Container, or from Container to Host, or both ways, or neither ways. Possible values are: `notConfigured`, `blockBoth`, `blockHostToContainer`, `blockContainerToHost`, `blockNone`.|
|applicationGuardBlockFileTransfer|applicationGuardBlockFileTransferType|Block clipboard to transfer image file, text file or neither of them. Possible values are: `notConfigured`, `blockImageAndTextFile`, `blockImageFile`, `blockNone`, `blockTextFile`.|
|applicationGuardBlockNonEnterpriseContent|Boolean|Block enterprise sites to load non-enterprise content, such as third party plug-ins|
|applicationGuardCertificateThumbprints|String collection|Allows certain device level Root Certificates to be shared with the Microsoft Defender Application Guard container.|
|applicationGuardEnabled|Boolean|Enable Windows Defender Application Guard|
|applicationGuardEnabledOptions|applicationGuardEnabledOptions|Enable Windows Defender Application Guard for newer Windows builds. Possible values are: `notConfigured`, `enabledForEdge`, `enabledForOffice`, `enabledForEdgeAndOffice`.|
|applicationGuardForceAuditing|Boolean|Force auditing will persist Windows logs and events to meet security/compliance criteria (sample events are user login-logoff, use of privilege rights, software installation, system changes, etc.)|
|appLockerApplicationControl|appLockerApplicationControlType|Enables the Admin to choose what types of app to allow on devices. Possible values are: `notConfigured`, `enforceComponentsAndStoreApps`, `auditComponentsAndStoreApps`, `enforceComponentsStoreAppsAndSmartlocker`, `auditComponentsStoreAppsAndSmartlocker`.|
|bitLockerAllowStandardUserEncryption|Boolean|Allows the admin to allow standard users to enable encrpytion during Azure AD Join.|
|bitLockerDisableWarningForOtherDiskEncryption|Boolean|Allows the Admin to disable the warning prompt for other disk encryption on the user machines.|
|bitLockerEnableStorageCardEncryptionOnMobile|Boolean|Allows the admin to require encryption to be turned on using BitLocker. This policy is valid only for a mobile SKU.|
|bitLockerEncryptDevice|Boolean|Allows the admin to require encryption to be turned on using BitLocker.|
|bitLockerFixedDrivePolicy|[bitLockerFixedDrivePolicy](../resources/bitlockerfixeddrivepolicy.md)|BitLocker Fixed Drive Policy.|
|bitLockerRecoveryPasswordRotation|bitLockerRecoveryPasswordRotationType|This setting initiates a client-driven recovery password rotation after an OS drive recovery (either by using bootmgr or WinRE). Possible values are: `notConfigured`, `disabled`, `enabledForAzureAd`, `enabledForAzureAdAndHybrid`.|
|bitLockerRemovableDrivePolicy|[bitLockerRemovableDrivePolicy](../resources/bitlockerremovabledrivepolicy.md)|BitLocker Removable Drive Policy.|
|bitLockerSystemDrivePolicy|[bitLockerSystemDrivePolicy](../resources/bitlockersystemdrivepolicy.md)|BitLocker System Drive Policy.|
|defenderAdditionalGuardedFolders|String collection|List of folder paths to be added to the list of protected folders|
|defenderAdobeReaderLaunchChildProcess|defenderProtectionType|Value indicating the behavior of Adobe Reader from creating child processes. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderAdvancedRansomewareProtectionType|defenderProtectionType|Value indicating use of advanced protection against ransomeware. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderAllowBehaviorMonitoring|Boolean|Allows or disallows Windows Defender Behavior Monitoring functionality.|
|defenderAllowCloudProtection|Boolean|To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.|
|defenderAllowEndUserAccess|Boolean|Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.|
|defenderAllowIntrusionPreventionSystem|Boolean|Allows or disallows Windows Defender Intrusion Prevention functionality.|
|defenderAllowOnAccessProtection|Boolean|Allows or disallows Windows Defender On Access Protection functionality.|
|defenderAllowRealTimeMonitoring|Boolean|Allows or disallows Windows Defender Realtime Monitoring functionality.|
|defenderAllowScanArchiveFiles|Boolean|Allows or disallows scanning of archives.|
|defenderAllowScanDownloads|Boolean|Allows or disallows Windows Defender IOAVP Protection functionality.|
|defenderAllowScanNetworkFiles|Boolean|Allows or disallows a scanning of network files.|
|defenderAllowScanRemovableDrivesDuringFullScan|Boolean|Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.|
|defenderAllowScanScriptsLoadedInInternetExplorer|Boolean|Allows or disallows Windows Defender Script Scanning functionality.|
|defenderAttackSurfaceReductionExcludedPaths|String collection|List of exe files and folders to be excluded from attack surface reduction rules|
|defenderBlockEndUserAccess|Boolean|Allows or disallows user access to the Windows Defender UI. If disallowed, all Windows Defender notifications will also be suppressed.|
|defenderBlockPersistenceThroughWmiType|defenderAttackSurfaceType|Value indicating the behavior of Block persistence through WMI event subscription. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderCheckForSignaturesBeforeRunningScan|Boolean|This policy setting allows you to manage whether a check for new virus and spyware definitions will occur before running a scan.|
|defenderCloudBlockLevel|defenderCloudBlockLevelType|Added in Windows 10, version 1709. This policy setting determines how aggressive Windows Defender Antivirus will be in blocking and scanning suspicious files. Value type is integer. This feature requires the "Join Microsoft MAPS" setting enabled in order to function. Possible values are: `notConfigured`, `high`, `highPlus`, `zeroTolerance`.|
|defenderCloudExtendedTimeoutInSeconds|Int32|Added in Windows 10, version 1709. This feature allows Windows Defender Antivirus to block a suspicious file for up to 60 seconds, and scan it in the cloud to make sure it's safe. Value type is integer, range is 0 - 50. This feature depends on three other MAPS settings the must all be enabled- "Configure the 'Block at First Sight' feature; "Join Microsoft MAPS"; "Send file samples when further analysis is required". Valid values 0 to 50|
|defenderDaysBeforeDeletingQuarantinedMalware|Int32|Time period (in days) that quarantine items will be stored on the system. Valid values 0 to 90|
|defenderDetectedMalwareActions|[defenderDetectedMalwareActions](../resources/defenderdetectedmalwareactions.md)|Allows an administrator to specify any valid threat severity levels and the corresponding default action ID to take.|
|defenderDisableBehaviorMonitoring|Boolean|Allows or disallows Windows Defender Behavior Monitoring functionality.|
|defenderDisableCatchupFullScan|Boolean|This policy setting allows you to configure catch-up scans for scheduled full scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.|
|defenderDisableCatchupQuickScan|Boolean|This policy setting allows you to configure catch-up scans for scheduled quick scans. A catch-up scan is a scan that is initiated because a regularly scheduled scan was missed. Usually these scheduled scans are missed because the computer was turned off at the scheduled time.|
|defenderDisableCloudProtection|Boolean|To best protect your PC, Windows Defender will send information to Microsoft about any problems it finds. Microsoft will analyze that information, learn more about problems affecting you and other customers, and offer improved solutions.|
|defenderDisableIntrusionPreventionSystem|Boolean|Allows or disallows Windows Defender Intrusion Prevention functionality.|
|defenderDisableOnAccessProtection|Boolean|Allows or disallows Windows Defender On Access Protection functionality.|
|defenderDisableRealTimeMonitoring|Boolean|Allows or disallows Windows Defender Realtime Monitoring functionality.|
|defenderDisableScanArchiveFiles|Boolean|Allows or disallows scanning of archives.|
|defenderDisableScanDownloads|Boolean|Allows or disallows Windows Defender IOAVP Protection functionality.|
|defenderDisableScanNetworkFiles|Boolean|Allows or disallows a scanning of network files.|
|defenderDisableScanRemovableDrivesDuringFullScan|Boolean|Allows or disallows a full scan of removable drives. During a quick scan, removable drives may still be scanned.|
|defenderDisableScanScriptsLoadedInInternetExplorer|Boolean|Allows or disallows Windows Defender Script Scanning functionality.|
|defenderEmailContentExecution|defenderProtectionType|Value indicating if execution of executable content (exe, dll, ps, js, vbs, etc) should be dropped from email (webmail/mail-client). Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderEmailContentExecutionType|defenderAttackSurfaceType|Value indicating if execution of executable content (exe, dll, ps, js, vbs, etc) should be dropped from email (webmail/mail-client). Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderEnableLowCpuPriority|Boolean|This policy setting allows you to enable or disable low CPU priority for scheduled scans.|
|defenderEnableScanIncomingMail|Boolean|Allows or disallows scanning of email.|
|defenderEnableScanMappedNetworkDrivesDuringFullScan|Boolean|Allows or disallows a full scan of mapped network drives.|
|defenderExploitProtectionXml|Binary|Xml content containing information regarding exploit protection details.|
|defenderExploitProtectionXmlFileName|String|Name of the file from which DefenderExploitProtectionXml was obtained.|
|defenderFileExtensionsToExclude|String collection|File extensions to exclude from scans and real time protection.|
|defenderFilesAndFoldersToExclude|String collection|Files and folder to exclude from scans and real time protection.|
|defenderGuardedFoldersAllowedAppPaths|String collection|List of paths to exe that are allowed to access protected folders|
|defenderGuardMyFoldersType|folderProtectionType|Value indicating the behavior of protected folders. Possible values are: `userDefined`, `enable`, `auditMode`, `blockDiskModification`, `auditDiskModification`.|
|defenderNetworkProtectionType|defenderProtectionType|Value indicating the behavior of NetworkProtection. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderOfficeAppsExecutableContentCreationOrLaunch|defenderProtectionType|Value indicating the behavior of Office applications/macros creating or launching executable content. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderOfficeAppsExecutableContentCreationOrLaunchType|defenderAttackSurfaceType|Value indicating the behavior of Office applications/macros creating or launching executable content. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderOfficeAppsLaunchChildProcess|defenderProtectionType|Value indicating the behavior of Office application launching child processes. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderOfficeAppsLaunchChildProcessType|defenderAttackSurfaceType|Value indicating the behavior of Office application launching child processes. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderOfficeAppsOtherProcessInjection|defenderProtectionType|Value indicating the behavior of  Office applications injecting into other processes. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderOfficeAppsOtherProcessInjectionType|defenderAttackSurfaceType|Value indicating the behavior of Office applications injecting into other processes. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderOfficeCommunicationAppsLaunchChildProcess|defenderProtectionType|Value indicating the behavior of Office communication applications, including Microsoft Outlook, from creating child processes. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderOfficeMacroCodeAllowWin32Imports|defenderProtectionType|Value indicating the behavior of Win32 imports from Macro code in Office. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderOfficeMacroCodeAllowWin32ImportsType|defenderAttackSurfaceType|Value indicating the behavior of Win32 imports from Macro code in Office. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderPotentiallyUnwantedAppAction|defenderProtectionType|Added in Windows 10, version 1607. Specifies the level of detection for potentially unwanted applications (PUAs). Windows Defender alerts you when potentially unwanted software is being downloaded or attempts to install itself on your computer. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderPreventCredentialStealingType|defenderProtectionType|Value indicating if credential stealing from the Windows local security authority subsystem is permitted. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderProcessCreation|defenderProtectionType|Value indicating response to process creations originating from PSExec and WMI commands. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderProcessCreationType|defenderAttackSurfaceType|Value indicating response to process creations originating from PSExec and WMI commands. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderProcessesToExclude|String collection|Processes to exclude from scans and real time protection.|
|defenderScanDirection|defenderRealtimeScanDirection|Controls which sets of files should be monitored. Possible values are: `monitorAllFiles`, `monitorIncomingFilesOnly`, `monitorOutgoingFilesOnly`.|
|defenderScanMaxCpuPercentage|Int32|Represents the average CPU load factor for the Windows Defender scan (in percent). The default value is 50. Valid values 0 to 100|
|defenderScanType|defenderScanType|Selects whether to perform a quick scan or full scan. Possible values are: `userDefined`, `disabled`, `quick`, `full`.|
|defenderScheduledQuickScanTime|TimeOfDay|Selects the time of day that the Windows Defender quick scan should run. For example, a value of 0=12:00AM, a value of 60=1:00AM, a value of 120=2:00, and so on, up to a value of 1380=11:00PM. The default value is 120|
|defenderScheduledScanDay|weeklySchedule|Selects the day that the Windows Defender scan should run. Possible values are: `userDefined`, `everyday`, `sunday`, `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`, `noScheduledScan`.|
|defenderScheduledScanTime|TimeOfDay|Selects the time of day that the Windows Defender scan should run.|
|defenderScriptDownloadedPayloadExecution|defenderProtectionType|Value indicating the behavior of js/vbs executing payload downloaded from Internet. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderScriptDownloadedPayloadExecutionType|defenderAttackSurfaceType|Value indicating the behavior of js/vbs executing payload downloaded from Internet. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderScriptObfuscatedMacroCode|defenderProtectionType|Value indicating the behavior of obfuscated js/vbs/ps/macro code. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderScriptObfuscatedMacroCodeType|defenderAttackSurfaceType|Value indicating the behavior of obfuscated js/vbs/ps/macro code. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderSecurityCenterBlockExploitProtectionOverride|Boolean|Indicates whether or not to block user from overriding Exploit Protection settings.|
|defenderSecurityCenterDisableAccountUI|Boolean|Used to disable the display of the account protection area.|
|defenderSecurityCenterDisableAppBrowserUI|Boolean|Used to disable the display of the app and browser protection area.|
|defenderSecurityCenterDisableClearTpmUI|Boolean|Used to disable the display of the Clear TPM button.|
|defenderSecurityCenterDisableFamilyUI|Boolean|Used to disable the display of the family options area.|
|defenderSecurityCenterDisableHardwareUI|Boolean|Used to disable the display of the hardware protection area.|
|defenderSecurityCenterDisableHealthUI|Boolean|Used to disable the display of the device performance and health area.|
|defenderSecurityCenterDisableNetworkUI|Boolean|Used to disable the display of the firewall and network protection area.|
|defenderSecurityCenterDisableNotificationAreaUI|Boolean|Used to disable the display of the notification area control. The user needs to either sign out and sign in or reboot the computer for this setting to take effect.|
|defenderSecurityCenterDisableRansomwareUI|Boolean|Used to disable the display of the ransomware protection area. |
|defenderSecurityCenterDisableSecureBootUI|Boolean|Used to disable the display of the secure boot area under Device security.|
|defenderSecurityCenterDisableTroubleshootingUI|Boolean|Used to disable the display of the security process troubleshooting under Device security.|
|defenderSecurityCenterDisableVirusUI|Boolean|Used to disable the display of the virus and threat protection area.|
|defenderSecurityCenterDisableVulnerableTpmFirmwareUpdateUI|Boolean|Used to disable the display of update TPM Firmware when a vulnerable firmware is detected.|
|defenderSecurityCenterHelpEmail|String|The email address that is displayed to users.|
|defenderSecurityCenterHelpPhone|String|The phone number or Skype ID that is displayed to users.|
|defenderSecurityCenterHelpURL|String|The help portal URL this is displayed to users.|
|defenderSecurityCenterITContactDisplay|defenderSecurityCenterITContactDisplayType|Configure where to display IT contact information to end users. Possible values are: `notConfigured`, `displayInAppAndInNotifications`, `displayOnlyInApp`, `displayOnlyInNotifications`.|
|defenderSecurityCenterNotificationsFromApp|defenderSecurityCenterNotificationsFromAppType|Notifications to show from the displayed areas of app. Possible values are: `notConfigured`, `blockNoncriticalNotifications`, `blockAllNotifications`.|
|defenderSecurityCenterOrganizationDisplayName|String|The company name that is displayed to the users.|
|defenderSignatureUpdateIntervalInHours|Int32|Specifies the interval (in hours) that will be used to check for signatures, so instead of using the ScheduleDay and ScheduleTime the check for new signatures will be set according to the interval. Valid values 0 to 24|
|defenderSubmitSamplesConsentType|defenderSubmitSamplesConsentType|Checks for the user consent level in Windows Defender to send data. Possible values are: `sendSafeSamplesAutomatically`, `alwaysPrompt`, `neverSend`, `sendAllSamplesAutomatically`.|
|defenderUntrustedExecutable|defenderProtectionType|Value indicating response to executables that don't meet a prevalence, age, or trusted list criteria. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderUntrustedExecutableType|defenderAttackSurfaceType|Value indicating response to executables that don't meet a prevalence, age, or trusted list criteria. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|defenderUntrustedUSBProcess|defenderProtectionType|Value indicating response to untrusted and unsigned processes that run from USB. Possible values are: `userDefined`, `enable`, `auditMode`, `warn`, `notConfigured`.|
|defenderUntrustedUSBProcessType|defenderAttackSurfaceType|Value indicating response to untrusted and unsigned processes that run from USB. Possible values are: `userDefined`, `block`, `auditMode`, `warn`, `disable`.|
|deviceGuardEnableSecureBootWithDMA|Boolean|This property will be deprecated in May 2019 and will be replaced with property DeviceGuardSecureBootWithDMA. Specifies whether Platform Security Level is enabled at next reboot.|
|deviceGuardEnableVirtualizationBasedSecurity|Boolean|Turns On Virtualization Based Security(VBS).|
|deviceGuardLaunchSystemGuard|enablement|Allows the IT admin to configure the launch of System Guard. Possible values are: `notConfigured`, `enabled`, `disabled`.|
|deviceGuardLocalSystemAuthorityCredentialGuardSettings|deviceGuardLocalSystemAuthorityCredentialGuardType|Turn on Credential Guard when Platform Security Level with Secure Boot and Virtualization Based Security are both enabled. Possible values are: `notConfigured`, `enableWithUEFILock`, `enableWithoutUEFILock`, `disable`.|
|deviceGuardSecureBootWithDMA|secureBootWithDMAType|Specifies whether Platform Security Level is enabled at next reboot. Possible values are: `notConfigured`, `withoutDMA`, `withDMA`.|
|dmaGuardDeviceEnumerationPolicy|dmaGuardDeviceEnumerationPolicyType|This policy is intended to provide additional security against external DMA capable devices. It allows for more control over the enumeration of external DMA capable devices incompatible with DMA Remapping/device memory isolation and sandboxing. This policy only takes effect when Kernel DMA Protection is supported and enabled by the system firmware. Kernel DMA Protection is a platform feature that cannot be controlled via policy or by end user. It has to be supported by the system at the time of manufacturing. To check if the system supports Kernel DMA Protection, please check the Kernel DMA Protection field in the Summary page of MSINFO32.exe. Possible values are: `deviceDefault`, `blockAll`, `allowAll`.|
|firewallBlockStatefulFTP|Boolean|Blocks stateful FTP connections to the device|
|firewallCertificateRevocationListCheckMethod|firewallCertificateRevocationListCheckMethodType|Specify how the certificate revocation list is to be enforced. Possible values are: `deviceDefault`, `none`, `attempt`, `require`.|
|firewallIdleTimeoutForSecurityAssociationInSeconds|Int32|Configures the idle timeout for security associations, in seconds, from 300 to 3600 inclusive. This is the period after which security associations will expire and be deleted. Valid values 300 to 3600|
|firewallIPSecExemptionsAllowDHCP|Boolean|Configures IPSec exemptions to allow both IPv4 and IPv6 DHCP traffic|
|firewallIPSecExemptionsAllowICMP|Boolean|Configures IPSec exemptions to allow ICMP|
|firewallIPSecExemptionsAllowNeighborDiscovery|Boolean|Configures IPSec exemptions to allow neighbor discovery IPv6 ICMP type-codes|
|firewallIPSecExemptionsAllowRouterDiscovery|Boolean|Configures IPSec exemptions to allow router discovery IPv6 ICMP type-codes|
|firewallIPSecExemptionsNone|Boolean|Configures IPSec exemptions to no exemptions|
|firewallMergeKeyingModuleSettings|Boolean|If an authentication set is not fully supported by a keying module, direct the module to ignore only unsupported authentication suites rather than the entire set|
|firewallPacketQueueingMethod|firewallPacketQueueingMethodType|Configures how packet queueing should be applied in the tunnel gateway scenario. Possible values are: `deviceDefault`, `disabled`, `queueInbound`, `queueOutbound`, `queueBoth`.|
|firewallPreSharedKeyEncodingMethod|firewallPreSharedKeyEncodingMethodType|Select the preshared key encoding to be used. Possible values are: `deviceDefault`, `none`, `utF8`.|
|firewallProfileDomain|[windowsFirewallNetworkProfile](../resources/windowsfirewallnetworkprofile.md)|Configures the firewall profile settings for domain networks|
|firewallProfilePrivate|[windowsFirewallNetworkProfile](../resources/windowsfirewallnetworkprofile.md)|Configures the firewall profile settings for private networks|
|firewallProfilePublic|[windowsFirewallNetworkProfile](../resources/windowsfirewallnetworkprofile.md)|Configures the firewall profile settings for public networks|
|firewallRules|[windowsFirewallRule](../resources/windowsfirewallrule.md) collection|Configures the firewall rule settings. This collection can contain a maximum of 150 elements.|
|lanManagerAuthenticationLevel|lanManagerAuthenticationLevel|This security setting determines which challenge/response authentication protocol is used for network logons. Possible values are: `lmAndNltm`, `lmNtlmAndNtlmV2`, `lmAndNtlmOnly`, `lmAndNtlmV2`, `lmNtlmV2AndNotLm`, `lmNtlmV2AndNotLmOrNtm`.|
|lanManagerWorkstationDisableInsecureGuestLogons|Boolean|If enabled,the SMB client will allow insecure guest logons. If not configured, the SMB client will reject insecure guest logons.|
|localSecurityOptionsAdministratorAccountName|String|Define a different account name to be associated with the security identifier (SID) for the account “Administrator”.|
|localSecurityOptionsAdministratorElevationPromptBehavior|localSecurityOptionsAdministratorElevationPromptBehaviorType|Define the behavior of the elevation prompt for admins in Admin Approval Mode. Possible values are: `notConfigured`, `elevateWithoutPrompting`, `promptForCredentialsOnTheSecureDesktop`, `promptForConsentOnTheSecureDesktop`, `promptForCredentials`, `promptForConsent`, `promptForConsentForNonWindowsBinaries`.|
|localSecurityOptionsAllowAnonymousEnumerationOfSAMAccountsAndShares|Boolean|This security setting determines whether to allows anonymous users to perform certain activities, such as enumerating the names of domain accounts and network shares.|
|localSecurityOptionsAllowPKU2UAuthenticationRequests|Boolean|Block PKU2U authentication requests to this device to use online identities.|
|localSecurityOptionsAllowRemoteCallsToSecurityAccountsManager|String|Edit the default Security Descriptor Definition Language string to allow or deny users and groups to make remote calls to the SAM.|
|localSecurityOptionsAllowRemoteCallsToSecurityAccountsManagerHelperBool|Boolean|UI helper boolean for LocalSecurityOptionsAllowRemoteCallsToSecurityAccountsManager entity|
|localSecurityOptionsAllowSystemToBeShutDownWithoutHavingToLogOn|Boolean|This security setting determines whether a computer can be shut down without having to log on to Windows.|
|localSecurityOptionsAllowUIAccessApplicationElevation|Boolean|Allow UIAccess apps to prompt for elevation without using the secure desktop.|
|localSecurityOptionsAllowUIAccessApplicationsForSecureLocations|Boolean|Allow UIAccess apps to prompt for elevation without using the secure desktop.Default is enabled|
|localSecurityOptionsAllowUndockWithoutHavingToLogon|Boolean|Prevent a portable computer from being undocked without having to log in.|
|localSecurityOptionsBlockMicrosoftAccounts|Boolean|Prevent users from adding new Microsoft accounts to this computer.|
|localSecurityOptionsBlockRemoteLogonWithBlankPassword|Boolean|Enable Local accounts that are not password protected to log on from locations other than the physical device.Default is enabled|
|localSecurityOptionsBlockRemoteOpticalDriveAccess|Boolean|Enabling this settings allows only interactively logged on user to access CD-ROM media.|
|localSecurityOptionsBlockUsersInstallingPrinterDrivers|Boolean|Restrict installing printer drivers as part of connecting to a shared printer to admins only.|
|localSecurityOptionsClearVirtualMemoryPageFile|Boolean|This security setting determines whether the virtual memory pagefile is cleared when the system is shut down.|
|localSecurityOptionsClientDigitallySignCommunicationsAlways|Boolean|This security setting determines whether packet signing is required by the SMB client component.|
|localSecurityOptionsClientSendUnencryptedPasswordToThirdPartySMBServers|Boolean|If this security setting is enabled, the Server Message Block (SMB) redirector is allowed to send plaintext passwords to non-Microsoft SMB servers that do not support password encryption during authentication.|
|localSecurityOptionsDetectApplicationInstallationsAndPromptForElevation|Boolean|App installations requiring elevated privileges will prompt for admin credentials.Default is enabled|
|localSecurityOptionsDisableAdministratorAccount|Boolean|Determines whether the Local Administrator account is enabled or disabled.|
|localSecurityOptionsDisableClientDigitallySignCommunicationsIfServerAgrees|Boolean|This security setting determines whether the SMB client attempts to negotiate SMB packet signing.|
|localSecurityOptionsDisableGuestAccount|Boolean|Determines if the Guest account is enabled or disabled.|
|localSecurityOptionsDisableServerDigitallySignCommunicationsAlways|Boolean|This security setting determines whether packet signing is required by the SMB server component.|
|localSecurityOptionsDisableServerDigitallySignCommunicationsIfClientAgrees|Boolean|This security setting determines whether the SMB server will negotiate SMB packet signing with clients that request it.|
|localSecurityOptionsDoNotAllowAnonymousEnumerationOfSAMAccounts|Boolean|This security setting determines what additional permissions will be granted for anonymous connections to the computer.|
|localSecurityOptionsDoNotRequireCtrlAltDel|Boolean|Require CTRL+ALT+DEL to be pressed before a user can log on.|
|localSecurityOptionsDoNotStoreLANManagerHashValueOnNextPasswordChange|Boolean|This security setting determines if, at the next password change, the LAN Manager (LM) hash value for the new password is stored. It’s not stored by default.|
|localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUser|localSecurityOptionsFormatAndEjectOfRemovableMediaAllowedUserType|Define who is allowed to format and eject removable NTFS media. Possible values are: `notConfigured`, `administrators`, `administratorsAndPowerUsers`, `administratorsAndInteractiveUsers`.|
|localSecurityOptionsGuestAccountName|String|Define a different account name to be associated with the security identifier (SID) for the account “Guest”.|
|localSecurityOptionsHideLastSignedInUser|Boolean|Do not display the username of the last person who signed in on this device.|
|localSecurityOptionsHideUsernameAtSignIn|Boolean|Do not display the username of the person signing in to this device after credentials are entered and before the device’s desktop is shown.|
|localSecurityOptionsInformationDisplayedOnLockScreen|localSecurityOptionsInformationDisplayedOnLockScreenType|Configure the user information that is displayed when the session is locked. If not configured, user display name, domain and username are shown. Possible values are: `notConfigured`, `administrators`, `administratorsAndPowerUsers`, `administratorsAndInteractiveUsers`.|
|localSecurityOptionsInformationShownOnLockScreen|localSecurityOptionsInformationShownOnLockScreenType|Configure the user information that is displayed when the session is locked. If not configured, user display name, domain and username are shown. Possible values are: `notConfigured`, `userDisplayNameDomainUser`, `userDisplayNameOnly`, `doNotDisplayUser`.|
|localSecurityOptionsLogOnMessageText|String|Set message text for users attempting to log in.|
|localSecurityOptionsLogOnMessageTitle|String|Set message title for users attempting to log in.|
|localSecurityOptionsMachineInactivityLimit|Int32|Define maximum minutes of inactivity on the interactive desktop’s login screen until the screen saver runs. Valid values 0 to 9999|
|localSecurityOptionsMachineInactivityLimitInMinutes|Int32|Define maximum minutes of inactivity on the interactive desktop’s login screen until the screen saver runs. Valid values 0 to 9999|
|localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedClients|localSecurityOptionsMinimumSessionSecurity|This security setting allows a client to require the negotiation of 128-bit encryption and/or NTLMv2 session security. Possible values are: `none`, `requireNtmlV2SessionSecurity`, `require128BitEncryption`, `ntlmV2And128BitEncryption`.|
|localSecurityOptionsMinimumSessionSecurityForNtlmSspBasedServers|localSecurityOptionsMinimumSessionSecurity|This security setting allows a server to require the negotiation of 128-bit encryption and/or NTLMv2 session security. Possible values are: `none`, `requireNtmlV2SessionSecurity`, `require128BitEncryption`, `ntlmV2And128BitEncryption`.|
|localSecurityOptionsOnlyElevateSignedExecutables|Boolean|Enforce PKI certification path validation for a given executable file before it is permitted to run.|
|localSecurityOptionsRestrictAnonymousAccessToNamedPipesAndShares|Boolean|By default, this security setting restricts anonymous access to shares and pipes to the settings for named pipes that can be accessed anonymously and Shares that can be accessed anonymously|
|localSecurityOptionsSmartCardRemovalBehavior|localSecurityOptionsSmartCardRemovalBehaviorType|This security setting determines what happens when the smart card for a logged-on user is removed from the smart card reader. Possible values are: `lockWorkstation`, `noAction`, `forceLogoff`, `disconnectRemoteDesktopSession`.|
|localSecurityOptionsStandardUserElevationPromptBehavior|localSecurityOptionsStandardUserElevationPromptBehaviorType|Define the behavior of the elevation prompt for standard users. Possible values are: `notConfigured`, `automaticallyDenyElevationRequests`, `promptForCredentialsOnTheSecureDesktop`, `promptForCredentials`.|
|localSecurityOptionsSwitchToSecureDesktopWhenPromptingForElevation|Boolean|Enable all elevation requests to go to the interactive user's desktop rather than the secure desktop. Prompt behavior policy settings for admins and standard users are used.|
|localSecurityOptionsUseAdminApprovalMode|Boolean|Defines whether the built-in admin account uses Admin Approval Mode or runs all apps with full admin privileges.Default is enabled|
|localSecurityOptionsUseAdminApprovalModeForAdministrators|Boolean|Define whether Admin Approval Mode and all UAC policy settings are enabled, default is enabled|
|localSecurityOptionsVirtualizeFileAndRegistryWriteFailuresToPerUserLocations|Boolean|Virtualize file and registry write failures to per user locations|
|smartScreenBlockOverrideForFiles|Boolean|Allows IT Admins to control whether users can can ignore SmartScreen warnings and run malicious files.|
|smartScreenEnableInShell|Boolean|Allows IT Admins to configure SmartScreen for Windows.|
|userRightsAccessCredentialManagerAsTrustedCaller|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right is used by Credential Manager during Backup/Restore. Users' saved credentials might be compromised if this privilege is given to other entities. Only states NotConfigured and Allowed are supported|
|userRightsActAsPartOfTheOperatingSystem|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right allows a process to impersonate any user without authentication. The process can therefore gain access to the same local resources as that user. Only states NotConfigured and Allowed are supported|
|userRightsAllowAccessFromNetwork|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users and groups are allowed to connect to the computer over the network. State Allowed is supported.|
|userRightsBackupData|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when backing up files and directories. Only states NotConfigured and Allowed are supported|
|userRightsBlockAccessFromNetwork|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users and groups are block from connecting to the computer over the network. State Block is supported.|
|userRightsChangeSystemTime|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users and groups can change the time and date on the internal clock of the computer. Only states NotConfigured and Allowed are supported|
|userRightsCreateGlobalObjects|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This security setting determines whether users can create global objects that are available to all sessions. Users who can create global objects could affect processes that run under other users' sessions, which could lead to application failure or data corruption. Only states NotConfigured and Allowed are supported|
|userRightsCreatePageFile|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users and groups can call an internal API to create and change the size of a page file. Only states NotConfigured and Allowed are supported|
|userRightsCreatePermanentSharedObjects|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which accounts can be used by processes to create a directory object using the object manager. Only states NotConfigured and Allowed are supported|
|userRightsCreateSymbolicLinks|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines if the user can create a symbolic link from the computer to which they are logged on. Only states NotConfigured and Allowed are supported|
|userRightsCreateToken|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users/groups can be used by processes to create a token that can then be used to get access to any local resources when the process uses an internal API to create an access token. Only states NotConfigured and Allowed are supported|
|userRightsDebugPrograms|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can attach a debugger to any process or to the kernel. Only states NotConfigured and Allowed are supported|
|userRightsDelegation|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can set the Trusted for Delegation setting on a user or computer object. Only states NotConfigured and Allowed are supported.|
|userRightsDenyLocalLogOn|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users cannot log on to the computer. States NotConfigured, Blocked are supported |
|userRightsGenerateSecurityAudits|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which accounts can be used by a process to add entries to the security log. The security log is used to trace unauthorized system access.  Only states NotConfigured and Allowed are supported.|
|userRightsImpersonateClient|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|Assigning this user right to a user allows programs running on behalf of that user to impersonate a client. Requiring this user right for this kind of impersonation prevents an unauthorized user from convincing a client to connect to a service that they have created and then impersonating that client, which can elevate the unauthorized user's permissions to administrative or system levels. Only states NotConfigured and Allowed are supported.|
|userRightsIncreaseSchedulingPriority|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which accounts can use a process with Write Property access to another process to increase the execution priority assigned to the other process. Only states NotConfigured and Allowed are supported.|
|userRightsLoadUnloadDrivers|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can dynamically load and unload device drivers or other code in to kernel mode. Only states NotConfigured and Allowed are supported.|
|userRightsLocalLogOn|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can log on to the computer. States NotConfigured, Allowed are supported |
|userRightsLockMemory|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which accounts can use a process to keep data in physical memory, which prevents the system from paging the data to virtual memory on disk. Only states NotConfigured and Allowed are supported.|
|userRightsManageAuditingAndSecurityLogs|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can specify object access auditing options for individual resources, such as files, Active Directory objects, and registry keys. Only states NotConfigured and Allowed are supported.|
|userRightsManageVolumes|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users and groups can run maintenance tasks on a volume, such as remote defragmentation. Only states NotConfigured and Allowed are supported.|
|userRightsModifyFirmwareEnvironment|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines who can modify firmware environment values. Only states NotConfigured and Allowed are supported.|
|userRightsModifyObjectLabels|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which user accounts can modify the integrity label of objects, such as files, registry keys, or processes owned by other users. Only states NotConfigured and Allowed are supported.|
|userRightsProfileSingleProcess|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can use performance monitoring tools to monitor the performance of system processes. Only states NotConfigured and Allowed are supported.|
|userRightsRemoteDesktopServicesLogOn|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users and groups are prohibited from logging on as a Remote Desktop Services client. Only states NotConfigured and Blocked are supported|
|userRightsRemoteShutdown|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users are allowed to shut down a computer from a remote location on the network. Misuse of this user right can result in a denial of service. Only states NotConfigured and Allowed are supported.|
|userRightsRestoreData|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can bypass file, directory, registry, and other persistent objects permissions when restoring backed up files and directories, and determines which users can set any valid security principal as the owner of an object. Only states NotConfigured and Allowed are supported.|
|userRightsTakeOwnership|[deviceManagementUserRightsSetting](../resources/devicemanagementuserrightssetting.md)|This user right determines which users can take ownership of any securable object in the system, including Active Directory objects, files and folders, printers, registry keys, processes, and threads. Only states NotConfigured and Allowed are supported.|
|windowsDefenderTamperProtection|windowsDefenderTamperProtectionOptions|Configure windows defender TamperProtection settings. Possible values are: `notConfigured`, `enable`, `disable`.|
|xboxServicesAccessoryManagementServiceStartupMode|serviceStartType|This setting determines whether the Accessory management service's start type is Automatic(2), Manual(3), Disabled(4). Default: Manual. Possible values are: `manual`, `automatic`, `disabled`.|
|xboxServicesEnableXboxGameSaveTask|Boolean|This setting determines whether xbox game save is enabled (1) or disabled (0).|
|xboxServicesLiveAuthManagerServiceStartupMode|serviceStartType|This setting determines whether Live Auth Manager service's start type is Automatic(2), Manual(3), Disabled(4). Default: Manual. Possible values are: `manual`, `automatic`, `disabled`.|
|xboxServicesLiveGameSaveServiceStartupMode|serviceStartType|This setting determines whether Live Game save service's start type is Automatic(2), Manual(3), Disabled(4). Default: Manual. Possible values are: `manual`, `automatic`, `disabled`.|
|xboxServicesLiveNetworkingServiceStartupMode|serviceStartType|This setting determines whether Networking service's start type is Automatic(2), Manual(3), Disabled(4). Default: Manual. Possible values are: `manual`, `automatic`, `disabled`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [windows10EndpointProtectionConfiguration](../resources/windows10endpointprotectionconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windows10endpointprotectionconfiguration"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windows10EndpointProtectionConfiguration not found
Content-Type: application/json
Content-length: 15901

{
  "@odata.type": "#microsoft.graph.windows10EndpointProtectionConfiguration",
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
```

