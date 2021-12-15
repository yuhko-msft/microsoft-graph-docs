---
title: "submissionResult resource type"
description: "Threat submission result when threat submission is processed by system."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# submissionResult resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Threat submission result when threat submission is processed by system.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|submissionResultCategory|The submission result category. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `allowedByPolicy`, `blockedByPolicy`, `spoof`, `unkown`, `noResultAvailable`, `unknownFutureValue`.|
|detail|submissionResultDetail|The submission result detail. The possible values are: `none`, `underInvestigation`, `simulatedThreat`, `allowedBySecOps`, `allowedByThirdPartyFilters`, `messageNotFound`, `urlFileShouldNotBeBlocked`, `urlFileShouldBeBlocked`, `urlFileCannotMakeDecision`, `domainImpersonation`, `userImpersonation`, `brandImpersonation`, `outboundShouldNotBeBlocked`, `outboundShouldBeBlocked`, `outboundBulk`, `outboundCannotMakeDecision`, `outboundNotRescanned`, `zeroHourAutoPurgeAllowed`, `zeroHourAutoPurgeBlocked`, `zeroHourAutoPurgeQuarantineReleased`, `onPremisesSkip`, `allowedByTenantAllowBlockList`, `blockedByTenantAllowBlockList`, `allowedByConnection`, `blockedByConnection`, `allowedByExchangeTransportRule`, `blockedByExchangeTransportRule`, `quarantineReleased`, `quarantineReleasedThenBlocked`, `junkMailRuleDisabled`, `allowedByUserSetting`, `blockedByUserSetting`, `allowedByTenant`, `blockedByTenant`, `invalidFalsePositive`, `invalidFalseNegative`, `spoofBlocked`, `goodReclassifiedAsBad`, `goodReclassifiedAsBulk`, `goodReclassifiedAsGood`, `goodReclassifiedAsCannotMakeDecision`, `badReclassifiedAsGood`, `badReclassifiedAsBulk`, `badReclassifiedAsBad`, `badReclassifiedAsCannotMakeDecision`, `unknownFutureValue`.|
|detectedFiles|[submissionDetectedFile](../resources/submissiondetectedfile.md) collection|Detected files in the email submission.|
|detectedUrls|String collection|Detected urls in the email submission.|
|policyId|String|The policy id for policy hit email submission.|
|policyType|submissionPolicyType|The submission policy type. The possible values are: `unknown`, `exchangeTransportRule`, `antiMalwarePolicy`, `safeAttachmentPolicy`, `antiPhishPolicy`, `hostedContentFilterPolicy`, `unknownFutureValue`.|
|userMailboxSetting|userMailBoxSetting|The user mailbox setting flag string which is a comma separated string. The possible values are: `none`, `junkMailDeletion`, `isFromAddressInAddressBook`, `isFromAddressInAddressSafeList`, `isFromAddressInAddressBlockList`, `isFromAddressInAddressImplicitSafeList`, `isFromAddressInAddressImplicitJunkList`, `isFromDomainInDomainSafeList`, `isFromDomainInDomainBlockList`, `isRecipientInRecipientSafeList`, `customRule`, `junkMailRule`, `senderPraPresent`, `fromFirstTimeSender`, `exclusive`, `priorSeenPass`, `senderAuthenticationSucceeded`, `isJunkMailRuleEnabled`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.submissionResult"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.submissionResult",
  "detail": "String",
  "category": "String",
  "policyType": "String",
  "policyId": "String",
  "userMailboxSetting": "String",
  "detectedUrls": [
    "String"
  ],
  "detectedFiles": [
    {
      "@odata.type": "microsoft.graph.submissionDetectedFile"
    }
  ]
}
```

