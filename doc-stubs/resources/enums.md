---
title: "Enum values"
description: "Microsoft Graph enumeration values"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: enumTypes
---

### activityType values 



|Member|
|:---|
|signin|
|user|
|unknownFutureValue|
|servicePrincipal|

### cloudAppSecuritySessionControlType values 



|Member|
|:---|
|mcasConfigured|
|monitorOnly|
|blockDownloads|
|unknownFutureValue|

### conditionalAccessClientApp values 



|Member|
|:---|
|all|
|browser|
|mobileAppsAndDesktopClients|
|exchangeActiveSync|
|easSupported|
|other|
|unknownFutureValue|

### conditionalAccessDevicePlatform values 



|Member|
|:---|
|android|
|iOS|
|windows|
|windowsPhone|
|macOS|
|all|
|unknownFutureValue|

### conditionalAccessGrantControl values 



|Member|
|:---|
|block|
|mfa|
|compliantDevice|
|domainJoinedDevice|
|approvedApplication|
|compliantApplication|
|passwordChange|
|unknownFutureValue|

### conditionalAccessPolicyState values 



|Member|
|:---|
|enabled|
|disabled|
|enabledForReportingButNotEnforced|

### continuousAccessEvaluationMode values 



|Member|
|:---|
|strictEnforcement|
|disabled|
|unknownFutureValue|

### countryLookupMethodType values 



|Member|
|:---|
|clientIpAddress|
|authenticatorAppGps|
|unknownFutureValue|

### dayOfWeek values 



|Member|
|:---|
|sunday|
|monday|
|tuesday|
|wednesday|
|thursday|
|friday|
|saturday|

### filterMode values 



|Member|
|:---|
|include|
|exclude|

### persistentBrowserSessionMode values 



|Member|
|:---|
|always|
|never|

### riskDetail values 



|Member|
|:---|
|none|
|adminGeneratedTemporaryPassword|
|userPerformedSecuredPasswordChange|
|userPerformedSecuredPasswordReset|
|adminConfirmedSigninSafe|
|aiConfirmedSigninSafe|
|userPassedMFADrivenByRiskBasedPolicy|
|adminDismissedAllRiskForUser|
|adminConfirmedSigninCompromised|
|hidden|
|adminConfirmedUserCompromised|
|unknownFutureValue|
|adminConfirmedServicePrincipalCompromised|
|adminDismissedAllRiskForServicePrincipal|

### riskDetectionTimingType values 



|Member|
|:---|
|notDefined|
|realtime|
|nearRealtime|
|offline|
|unknownFutureValue|

### riskEventType values 



|Member|
|:---|
|unlikelyTravel|
|anonymizedIPAddress|
|maliciousIPAddress|
|unfamiliarFeatures|
|malwareInfectedIPAddress|
|suspiciousIPAddress|
|leakedCredentials|
|investigationsThreatIntelligence|
|generic|
|adminConfirmedUserCompromised|
|mcasImpossibleTravel|
|mcasSuspiciousInboxManipulationRules|
|investigationsThreatIntelligenceSigninLinked|
|maliciousIPAddressValidCredentialsBlockedIP|
|unknownFutureValue|

### riskLevel values 



|Member|
|:---|
|low|
|medium|
|high|
|hidden|
|none|
|unknownFutureValue|

### riskState values 



|Member|
|:---|
|none|
|confirmedSafe|
|remediated|
|dismissed|
|atRisk|
|confirmedCompromised|
|unknownFutureValue|

### signinFrequencyType values 



|Member|
|:---|
|days|
|hours|

### tokenIssuerType values 



|Member|
|:---|
|AzureAD|
|ADFederationServices|
|UnknownFutureValue|
|AzureADBackupAuth|
|ADFederationServicesMFAAdapter|
|NPSExtension|

