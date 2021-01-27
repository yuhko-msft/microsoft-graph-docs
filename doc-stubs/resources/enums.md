---
title: "Enum values"
description: "Microsoft Graph enumeration values"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: enumTypes
---

### advancedBitLockerState values 



|Member|
|:---|
|success|
|noUserConsent|
|osVolumeUnprotected|
|osVolumeTpmRequired|
|osVolumeTpmOnlyRequired|
|osVolumeTpmPinRequired|
|osVolumeTpmStartupKeyRequired|
|osVolumeTpmPinStartupKeyRequired|
|osVolumeEncryptionMethodMismatch|
|recoveryKeyBackupFailed|
|fixedDriveNotEncrypted|
|fixedDriveEncryptionMethodMismatch|
|loggedOnUserNonAdmin|
|windowsRecoveryEnvironmentNotConfigured|
|tpmNotAvailable|
|tpmNotReady|
|networkError|

### androidDeviceOwnerEnrollmentMode values 



|Member|
|:---|
|corporateOwnedDedicatedDevice|
|corporateOwnedFullyManaged|
|corporateOwnedWorkProfile|

### androidVpnConnectionType values 



|Member|
|:---|
|ciscoAnyConnect|
|pulseSecure|
|f5EdgeClient|
|dellSonicWallMobileConnect|
|checkPointCapsuleVpn|
|citrix|
|microsoftTunnel|
|netMotionMobility|
|microsoftProtect|

### androidWorkProfileVpnConnectionType values 



|Member|
|:---|
|ciscoAnyConnect|
|pulseSecure|
|f5EdgeClient|
|dellSonicWallMobileConnect|
|checkPointCapsuleVpn|
|citrix|
|paloAltoGlobalProtect|
|microsoftTunnel|
|netMotionMobility|
|microsoftProtect|

### appleVpnConnectionType values 



|Member|
|:---|
|ciscoAnyConnect|
|pulseSecure|
|f5EdgeClient|
|dellSonicWallMobileConnect|
|checkPointCapsuleVpn|
|customVpn|
|ciscoIPSec|
|citrix|
|ciscoAnyConnectV2|
|paloAltoGlobalProtect|
|zscalerPrivateAccess|
|f5Access2018|
|citrixSso|
|paloAltoGlobalProtectV2|
|ikEv2|
|alwaysOn|
|microsoftTunnel|
|netMotionMobility|
|microsoftProtect|

### assignmentFilterEvaluationResult values 



|Member|
|:---|
|unknown|
|match|
|notMatch|
|inconclusive|
|failure|
|notEvaluated|

### dataSourceContainerStatus values 



|Member|
|:---|
|Active|
|Released|
|UnknownFutureValue|

### dataSourceScopes values 



|Member|
|:---|
|none|
|allTenantMailboxes|
|allTenantSites|
|allCaseCustodians|
|allCaseNoncustodialDataSources|
|unknownFutureValue|

### deviceComplianceScriptRuleDataType values 



|Member|
|:---|
|none|
|boolean|
|int64|
|double|
|string|
|dateTime|
|version|
|base64|
|xml|
|booleanArray|
|int64Array|
|doubleArray|
|stringArray|
|dateTimeArray|
|versionArray|

### deviceComplianceScriptRulesValidationError values 



|Member|
|:---|
|none|
|jsonFileInvalid|
|jsonFileMissing|
|jsonFileTooLarge|
|rulesMissing|
|duplicateRules|
|tooManyRulesSpecified|
|operatorMissing|
|operatorNotSupported|
|datatypeMissing|
|datatypeNotSupported|
|operatorDataTypeCombinationNotSupported|
|moreInfoUriMissing|
|moreInfoUriInvalid|
|moreInfoUriTooLarge|
|descriptionMissing|
|descriptionInvalid|
|descriptionTooLarge|
|titleMissing|
|titleInvalid|
|titleTooLarge|
|operandMissing|
|operandInvalid|
|operandTooLarge|
|settingNameMissing|
|settingNameInvalid|
|settingNameTooLarge|
|englishLocaleMissing|
|duplicateLocales|
|unrecognizedLocale|
|unknown|
|remediationStringsMissing|

### deviceComplianceScriptRulOperator values 



|Member|
|:---|
|none|
|and|
|or|
|isEquals|
|notEquals|
|greaterThan|
|lessThan|
|between|
|notBetween|
|greaterEquals|
|lessEquals|
|dayTimeBetween|
|beginsWith|
|notBeginsWith|
|endsWith|
|notEndsWith|
|contains|
|notContains|
|allOf|
|oneOf|
|noneOf|
|setEquals|
|orderedSetEquals|
|subsetOf|
|excludesAll|

### deviceManagementConfigurationControlType values 



|Member|
|:---|
|default|
|dropdown|
|smallTextBox|
|largeTextBox|
|toggle|
|multiheaderGrid|
|contextPane|

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
|cloudPC|
|linux|
|blackberry|
|palm|
|unknown|

### managedAppDataStorageLocation values 



|Member|
|:---|
|oneDriveForBusiness|
|sharePoint|
|box|
|localStorage|

### microsoftTunnelLogCollectionStatus values 



|Member|
|:---|
|pending|
|completed|
|failed|

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

### windowsAutopilotDeploymentState values 



|Member|
|:---|
|unknown|
|success|
|inProgress|
|failure|
|successWithTimeout|
|notAttempted|
|disabled|

### windowsQualityUpdateClassification values 



|Member|
|:---|
|all|
|security|
|nonSecurity|

