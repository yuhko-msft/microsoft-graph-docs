---
title: "Enum values"
description: "Microsoft Graph enumeration values"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: enumTypes
---

### longRunningOperationStatus values 



|Member|
|:---|
|notStarted|
|running|
|succeeded|
|failed|
|skipped|
|unknownFutureValue|

### submissionCategory values 



|Member|
|:---|
|notJunk|
|spam|
|phishing|
|malware|
|unknownFutureValue|

### submissionClientSource values 



|Member|
|:---|
|microsoft|
|other|
|unknownFutureValue|

### submissionContentType values 



|Member|
|:---|
|email|
|url|
|emailAttachment|
|file|
|app|
|unknownFutureValue|

### submissionPolicyType values 



|Member|
|:---|
|unknown|
|exchangeTransportRule|
|antiMalwarePolicy|
|safeAttachmentPolicy|
|antiPhishPolicy|
|hostedContentFilterPolicy|
|unknownFutureValue|

### submissionResultCategory values 



|Member|
|:---|
|notJunk|
|spam|
|phishing|
|malware|
|allowedByPolicy|
|blockedByPolicy|
|spoof|
|unkown|
|noResultAvailable|
|unknownFutureValue|

### submissionResultDetail values 



|Member|
|:---|
|none|
|underInvestigation|
|simulatedThreat|
|allowedBySecOps|
|allowedByThirdPartyFilters|
|messageNotFound|
|urlFileShouldNotBeBlocked|
|urlFileShouldBeBlocked|
|urlFileCannotMakeDecision|
|domainImpersonation|
|userImpersonation|
|brandImpersonation|
|outboundShouldNotBeBlocked|
|outboundShouldBeBlocked|
|outboundBulk|
|outboundCannotMakeDecision|
|outboundNotRescanned|
|zeroHourAutoPurgeAllowed|
|zeroHourAutoPurgeBlocked|
|zeroHourAutoPurgeQuarantineReleased|
|onPremisesSkip|
|allowedByTenantAllowBlockList|
|blockedByTenantAllowBlockList|
|allowedByConnection|
|blockedByConnection|
|allowedByExchangeTransportRule|
|blockedByExchangeTransportRule|
|quarantineReleased|
|quarantineReleasedThenBlocked|
|junkMailRuleDisabled|
|allowedByUserSetting|
|blockedByUserSetting|
|allowedByTenant|
|blockedByTenant|
|invalidFalsePositive|
|invalidFalseNegative|
|spoofBlocked|
|goodReclassifiedAsBad|
|goodReclassifiedAsBulk|
|goodReclassifiedAsGood|
|goodReclassifiedAsCannotMakeDecision|
|badReclassifiedAsGood|
|badReclassifiedAsBulk|
|badReclassifiedAsBad|
|badReclassifiedAsCannotMakeDecision|
|unknownFutureValue|

### submissionSource values 



|Member|
|:---|
|user|
|administrator|
|unknownFutureValue|

### tenantAllowBlockListAction values 



|Member|
|:---|
|allow|
|block|
|unknownFutureValue|

### tenantAllowBlockListType values 



|Member|
|:---|
|url|
|fileHash|
|sender|
|recipient|
|unknownFutureValue|

### userMailBoxSetting values 



|Member|
|:---|
|none|
|junkMailDeletion|
|isFromAddressInAddressBook|
|isFromAddressInAddressSafeList|
|isFromAddressInAddressBlockList|
|isFromAddressInAddressImplicitSafeList|
|isFromAddressInAddressImplicitJunkList|
|isFromDomainInDomainSafeList|
|isFromDomainInDomainBlockList|
|isRecipientInRecipientSafeList|
|customRule|
|junkMailRule|
|senderPraPresent|
|fromFirstTimeSender|
|exclusive|
|priorSeenPass|
|senderAuthenticationSucceeded|
|isJunkMailRuleEnabled|
|unknownFutureValue|

