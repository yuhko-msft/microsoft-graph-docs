---
title: "Enum values"
description: "Microsoft Graph enumeration values"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: enumTypes
---

### actionState values 



|Member|
|:---|
|none|
|pending|
|canceled|
|active|
|done|
|failed|
|notSupported|

### adminConsentState values 



|Member|
|:---|
|notConfigured|
|granted|
|notGranted|

### appLogDecryptionAlgorithm values 



|Member|
|:---|
|aes256|

### appLogUploadState values 



|Member|
|:---|
|pending|
|completed|
|failed|

### chassisType values 



|Member|
|:---|
|unknown|
|desktop|
|laptop|
|worksWorkstation|
|enterpriseServer|
|phone|
|tablet|
|mobileOther|
|mobileUnknown|

### comanagementEligibleType values 



|Member|
|:---|
|comanaged|
|eligible|
|eligibleButNotAzureAdJoined|
|needsOsUpdate|
|ineligible|

### complianceState values 



|Member|
|:---|
|unknown|
|compliant|
|noncompliant|
|conflict|
|error|
|inGracePeriod|
|configManager|

### configurationManagerActionDeliveryStatus values 



|Member|
|:---|
|unknown|
|pendingDelivery|
|deliveredToConnectorService|
|failedToDeliverToConnectorService|
|deliveredToOnPremisesServer|

### configurationManagerActionType values 



|Member|
|:---|
|refreshMachinePolicy|
|refreshUserPolicy|
|wakeUpClient|
|appEvaluation|

### configurationManagerClientState values 



|Member|
|:---|
|unknown|
|installed|
|healthy|
|installFailed|
|updateFailed|
|communicationError|

### deviceAndAppManagementAssignmentFilterType values 



|Member|
|:---|
|none|
|include|
|exclude|

### deviceCustomAttributeValueType values 



|Member|
|:---|
|integer|
|string|
|dateTime|

### deviceEnrollmentType values 



|Member|
|:---|
|unknown|
|userEnrollment|
|deviceEnrollmentManager|
|appleBulkWithUser|
|appleBulkWithoutUser|
|windowsAzureADJoin|
|windowsBulkUserless|
|windowsAutoEnrollment|
|windowsBulkAzureDomainJoin|
|windowsCoManagement|
|windowsAzureADJoinUsingDeviceAuth|
|appleUserEnrollment|
|appleUserEnrollmentWithServiceAccount|
|azureAdJoinUsingAzureVmExtension|
|androidEnterpriseDedicatedDevice|
|androidEnterpriseFullyManaged|
|androidEnterpriseCorporateWorkProfile|

### deviceGuardLocalSystemAuthorityCredentialGuardState values 



|Member|
|:---|
|running|
|rebootRequired|
|notLicensed|
|notConfigured|
|virtualizationBasedSecurityNotRunning|

### deviceGuardVirtualizationBasedSecurityHardwareRequirementState values 



|Member|
|:---|
|meetHardwareRequirements|
|secureBootRequired|
|dmaProtectionRequired|
|hyperVNotSupportedForGuestVM|
|hyperVNotAvailable|

### deviceGuardVirtualizationBasedSecurityState values 



|Member|
|:---|
|running|
|rebootRequired|
|require64BitArchitecture|
|notLicensed|
|notConfigured|
|doesNotMeetHardwareRequirements|
|other|

### deviceLogCollectionTemplateType values 



|Member|
|:---|
|predefined|

### deviceManagementExchangeAccessState values 



|Member|
|:---|
|none|
|unknown|
|allowed|
|blocked|
|quarantined|

### deviceManagementExchangeAccessStateReason values 



|Member|
|:---|
|none|
|unknown|
|exchangeGlobalRule|
|exchangeIndividualRule|
|exchangeDeviceRule|
|exchangeUpgrade|
|exchangeMailboxPolicy|
|other|
|compliant|
|notCompliant|
|notEnrolled|
|unknownLocation|
|mfaRequired|
|azureADBlockDueToAccessPolicy|
|compromisedPassword|
|deviceNotKnownWithManagedApp|

### deviceManagementSubscriptions values 



|Member|
|:---|
|none|
|intune|
|office365|
|intunePremium|
|intune_EDU|
|intune_SMB|

### deviceManagementSubscriptionState values 



|Member|
|:---|
|pending|
|active|
|warning|
|disabled|
|deleted|
|blocked|
|lockedOut|

### deviceRegistrationState values 



|Member|
|:---|
|notRegistered|
|registered|
|revoked|
|keyConflict|
|approvalPending|
|certificateReset|
|notRegisteredPendingEnrollment|
|unknown|

### deviceType values 



|Member|
|:---|
|desktop|
|windowsRT|
|winMO6|
|nokia|
|windowsPhone|
|mac|
|winCE|
|winEmbedded|
|iPhone|
|iPad|
|iPod|
|android|
|iSocConsumer|
|unix|
|macMDM|
|holoLens|
|surfaceHub|
|androidForWork|
|androidEnterprise|
|windows10x|
|androidnGMS|
|chromeOS|
|linux|
|blackberry|
|palm|
|unknown|
|cloudPC|

### diskType values 



|Member|
|:---|
|unkown|
|hdd|
|ssd|

### globalDeviceHealthScriptState values 



|Member|
|:---|
|notConfigured|
|pending|
|enabled|

### healthState values 



|Member|
|:---|
|unknown|
|healthy|
|unhealthy|

### joinType values 



|Member|
|:---|
|unknown|
|azureADJoined|
|azureADRegistered|
|hybridAzureADJoined|

### lostModeState values 



|Member|
|:---|
|disabled|
|enabled|

### managedDeviceArchitecture values 



|Member|
|:---|
|unknown|
|x86|
|x64|
|arm|
|arM64|

### managedDeviceManagementFeatures values 



|Member|
|:---|
|none|
|microsoftManagedDesktop|

### managedDeviceOwnerType values 



|Member|
|:---|
|unknown|
|company|
|personal|

### managedDevicePartnerReportedHealthState values 



|Member|
|:---|
|unknown|
|activated|
|deactivated|
|secured|
|lowSeverity|
|mediumSeverity|
|highSeverity|
|unresponsive|
|compromised|
|misconfigured|

### managedDeviceRemoteAction values 



|Member|
|:---|
|retire|
|delete|
|fullScan|
|quickScan|
|signatureUpdate|
|wipe|
|customTextNotification|
|rebootNow|
|setDeviceName|
|syncDevice|
|deprovision|
|disable|
|reenable|
|moveDeviceToOrganizationalUnit|

### managedInstallerStatus values 



|Member|
|:---|
|disabled|
|enabled|

### managementAgentType values 



|Member|
|:---|
|eas|
|mdm|
|easMdm|
|intuneClient|
|easIntuneClient|
|configurationManagerClient|
|configurationManagerClientMdm|
|configurationManagerClientMdmEas|
|unknown|
|jamf|
|googleCloudDevicePolicyController|
|microsoft365ManagedMdm|
|windowsManagementCloudApi|
|intuneAosp|

### managementState values 



|Member|
|:---|
|managed|
|retirePending|
|retireFailed|
|wipePending|
|wipeFailed|
|unhealthy|
|deletePending|
|retireIssued|
|wipeIssued|
|wipeCanceled|
|retireCanceled|
|discovered|

### operatingSystemUpgradeEligibility values 



|Member|
|:---|
|upgraded|
|unknown|
|notCapable|
|capable|

### ownerType values 



|Member|
|:---|
|unknown|
|company|
|personal|

### remediationState values 



|Member|
|:---|
|unknown|
|skipped|
|success|
|remediationFailed|
|scriptError|

### remoteAction values 



|Member|
|:---|
|unknown|
|factoryReset|
|removeCompanyData|
|resetPasscode|
|remoteLock|
|enableLostMode|
|disableLostMode|
|locateDevice|
|rebootNow|
|recoverPasscode|
|cleanWindowsDevice|
|logoutSharedAppleDeviceActiveUser|
|quickScan|
|fullScan|
|windowsDefenderUpdateSignatures|
|factoryResetKeepEnrollmentData|
|updateDeviceAccount|
|automaticRedeployment|
|shutDown|
|rotateBitLockerKeys|
|rotateFileVaultKey|
|getFileVaultKey|
|setDeviceName|
|activateDeviceEsim|

### runAsAccountType values 



|Member|
|:---|
|system|
|user|

### runState values 



|Member|
|:---|
|unknown|
|success|
|fail|
|scriptError|
|pending|
|notApplicable|

### userExperienceAnalyticsHealthState values 



|Member|
|:---|
|unknown|
|insufficientData|
|needsAttention|
|meetingGoals|

### userExperienceAnalyticsInsightSeverity values 



|Member|
|:---|
|none|
|informational|
|warning|
|error|

### userExperienceAnalyticsOperatingSystemRestartCategory values 



|Member|
|:---|
|unknown|
|restartWithUpdate|
|restartWithoutUpdate|
|blueScreen|
|shutdownWithUpdate|
|shutdownWithoutUpdate|
|longPowerButtonPress|
|bootError|
|update|

### userExperienceAnalyticsSummarizedBy values 



|Member|
|:---|
|none|
|model|
|allRegressions|
|modelRegression|
|manufacturerRegression|
|operatingSystemVersionRegression|

### windowsDefenderProductStatus values 



|Member|
|:---|
|noStatus|
|serviceNotRunning|
|serviceStartedWithoutMalwareProtection|
|pendingFullScanDueToThreatAction|
|pendingRebootDueToThreatAction|
|pendingManualStepsDueToThreatAction|
|avSignaturesOutOfDate|
|asSignaturesOutOfDate|
|noQuickScanHappenedForSpecifiedPeriod|
|noFullScanHappenedForSpecifiedPeriod|
|systemInitiatedScanInProgress|
|systemInitiatedCleanInProgress|
|samplesPendingSubmission|
|productRunningInEvaluationMode|
|productRunningInNonGenuineMode|
|productExpired|
|offlineScanRequired|
|serviceShutdownAsPartOfSystemShutdown|
|threatRemediationFailedCritically|
|threatRemediationFailedNonCritically|
|noStatusFlagsSet|
|platformOutOfDate|
|platformUpdateInProgress|
|platformAboutToBeOutdated|
|signatureOrPlatformEndOfLifeIsPastOrIsImpending|
|windowsSModeSignaturesInUseOnNonWin10SInstall|

### windowsDeviceHealthState values 



|Member|
|:---|
|clean|
|fullScanPending|
|rebootPending|
|manualStepsPending|
|offlineScanPending|
|critical|

### windowsMalwareCategory values 



|Member|
|:---|
|invalid|
|adware|
|spyware|
|passwordStealer|
|trojanDownloader|
|worm|
|backdoor|
|remoteAccessTrojan|
|trojan|
|emailFlooder|
|keylogger|
|dialer|
|monitoringSoftware|
|browserModifier|
|cookie|
|browserPlugin|
|aolExploit|
|nuker|
|securityDisabler|
|jokeProgram|
|hostileActiveXControl|
|softwareBundler|
|stealthNotifier|
|settingsModifier|
|toolBar|
|remoteControlSoftware|
|trojanFtp|
|potentialUnwantedSoftware|
|icqExploit|
|trojanTelnet|
|exploit|
|filesharingProgram|
|malwareCreationTool|
|remote_Control_Software|
|tool|
|trojanDenialOfService|
|trojanDropper|
|trojanMassMailer|
|trojanMonitoringSoftware|
|trojanProxyServer|
|virus|
|known|
|unknown|
|spp|
|behavior|
|vulnerability|
|policy|
|enterpriseUnwantedSoftware|
|ransom|
|hipsRule|

### windowsMalwareExecutionState values 



|Member|
|:---|
|unknown|
|blocked|
|allowed|
|running|
|notRunning|

### windowsMalwareSeverity values 



|Member|
|:---|
|unknown|
|low|
|moderate|
|high|
|severe|

### windowsMalwareState values 



|Member|
|:---|
|unknown|
|detected|
|cleaned|
|quarantined|
|removed|
|allowed|
|blocked|
|cleanFailed|
|quarantineFailed|
|removeFailed|
|allowFailed|
|abandoned|
|blockFailed|

### windowsMalwareThreatState values 



|Member|
|:---|
|active|
|actionFailed|
|manualStepsRequired|
|fullScanRequired|
|rebootRequired|
|remediatedWithNonCriticalFailures|
|quarantined|
|removed|
|cleaned|
|allowed|
|noStatusCleared|

