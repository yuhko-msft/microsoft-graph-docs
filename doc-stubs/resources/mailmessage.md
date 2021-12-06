---
title: "mailMessage resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mailMessage resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mailMessages](../api/mailmessage-list.md)|[mailMessage](../resources/mailmessage.md) collection|Get a list of the [mailMessage](../resources/mailmessage.md) objects and their properties.|
|[Create mailMessage](../api/emailsecurityeventsroot-post-mailmessages.md)|[mailMessage](../resources/mailmessage.md)|Create a new [mailMessage](../resources/mailmessage.md) object.|
|[Get mailMessage](../api/mailmessage-get.md)|[mailMessage](../resources/mailmessage.md)|Read the properties and relationships of a [mailMessage](../resources/mailmessage.md) object.|
|[Update mailMessage](../api/mailmessage-update.md)|[mailMessage](../resources/mailmessage.md)|Update the properties of a [mailMessage](../resources/mailmessage.md) object.|
|[Delete mailMessage](../api/mailmessage-delete.md)|None|Deletes a [mailMessage](../resources/mailmessage.md) object.|
|[softDelete](../api/mailmessage-softdelete.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[hardDelete](../api/mailmessage-harddelete.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[moveToJunk](../api/mailmessage-movetojunk.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[movetoDeletedItems](../api/mailmessage-movetodeleteditems.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[movetoInbox](../api/mailmessage-movetoinbox.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|alertId|String|Comma separated values containing ID of any alert associated with the email.|
|attachment|[securityEmailAttachments](../resources/securityemailattachments.md) collection|Collection of the Attachments in the Email.|
|attachmentCount|String|Number of attachments in the email.|
|bulkComplaintLevel|String|Bulk complaint level (BCL), The bulk complaint level (BCL) of the message. A higher BCL indicates a bulk mail message is more likely to generate complaints (and is therefore more likely to be spam).|
|compositeAuthentication|String|This is a value used by Microsoft 365 to combine email authentication like SPF, DKIM, and DMARC, to determine if the message is authentic.|
|connector|String|Email Connectors if set up, determine organizational mail flow and how the email was routed.|
|createdDateTime|DateTimeOffset|Date and time when the email record was logged.|
|detectionMethod|detectionMethod|Methods used to detect malware, phishing, or other threats found in the email. The possible values are: `generalFilter`, `impersonationBrand`, `spoofExternalDomain`, `spoofDmarc`, `impersonationDomain`, `fileDetonation`, `fileReputation`, `fileDetonationReputation`, `fingerPrintMatching`, `mailboxIntelligenceImpersonation`, `domainReputation`, `spoofIntraOrg`, `advancedFilter`, `antiMalwareEngine`, `mixedAnalysisDetection`, `urlMaliciousReputation`, `urlDetonation`, `urlDetonationReputation`, `impersonationUser`, `campaign`, `unknownFutureValue`.|
|directionality|directionality|Direction of the email relative to your network. The possible values are: `inbound`, `outbound`, `intraOrg`, `unknownFutureValue`.|
|distributionList|String|Distribution list details to which the email was sent.|
|domainBasedMessageAuthentication|String|Domain-based Message Authentication. Indicates whether it was pass/fail/soft fail etc.|
|domainCreationDate|String|Shows the date on which the domain was created.|
|domainKeysIdentifiedMail|String|DomainKeys identified mail (DKIM). Indicates whether it was pass/fail/soft fail etc.|
|domainOwner|String|Domain owner is the listed owner of the sending domain.|
|emailClusterId|String|Identifier for the group of similar emails clustered based on heuristic analysis of their contents.|
|exchangeTransportRule|String|Name of the ETRs which are part of the email.|
|id|String|Unique identifier for the record as logged by Defender for office.|
|internetMessageId|String|Public-facing identifier for the email that is set by the sending email system. The message ID in the format specified by RFC2822.|
|junkMailboxRule|String|Junk mailbox rule, It is a rule set on the mailbox, which if enabled allows EOP to move messages to the Junk Email folder based on the spam filtering verdict action “Move message to Junk Email folder” or Blocked Senders list.|
|language|String|Detected language of the email content.|
|latestDeliveryLocation|deliveryLocation|Location where the email is currently placed after post delivery actions. The possible values are: `inboxOrFolder`, `onPremisesOrExternal`, `junk`, `quarantine`, `failed`, `dropped`, `deletedItems`, `unknownFutureValue`.|
|location|String|It is the last detected location of the sending IP address mail server.|
|networkMessageId|String|Internal identifier id for the email- generated by Microsoft 365.|
|originalDeliveryAction|deliveryAction|Original Delivery action of the email, whether it was: Delivered, Junked, Blocked, or Replaced. The possible values are: `delivered`, `deliveredToJunk`, `blocked`, `replaced`, `unknownFutureValue`.|
|originalDeliveryLocation|deliveryLocation|Location where the email was delivered originally. The possible values are: `inboxOrFolder`, `onPremisesOrExternal`, `junk`, `quarantine`, `failed`, `dropped`, `deletedItems`, `unknownFutureValue`.|
|pishConfidenceLevel|String|Indicates the degree of confidence with which the phish threat was identified. Can be Normal or High.|
|policy|emailPolicy|Action policy that took effect: . The possible values are: `antispam`, `antiSpamHighConfidence`, `antiPhishingSpoof`, `antiPhishingDomainImpersonation`, `antiPhishingUserImpersonation`, `antiMalware`, `safeAttachments`, `exchangeTransportRule`, `antiPhishingGraphImpersonation`, `antiSpamBulkMail`, `antiSpamPhishing`, `unknownFutureValue`.|
|policyAction|emailActionPolicy|Action taken on the email based on the configured policy. We will get enums in this field. The possible values are: `moveMessageToJunkMailFolder`, `addXHeader`, `modifySubject`, `redirectMessage`, `deleteMessage`, `sendToQuarantine`, `noActionTaken`, `bccMessage`, `unknownFutureValue`.|
|recipientEmailAddress|String|Email address of the recipient, or email address of the recipient after distribution list expansion.|
|recipientTag|String|Tags applied to the recipient when they received the email. This is a comma separated list.|
|returnPath|String|Return-path is a the field that indicates where and how bounced emails will be processed.|
|senderDisplayName|String|Name of the sender displayed in the address book, typically a combination of a given or first name, a middle initial, and a last name or surname.|
|senderEmailFromAddress|String|Sender email address in the MAIL FROM header, also known as the envelope sender or the P1 sender.|
|senderEmailFromDomain|String|Sender domain in the MAIL FROM header, also known as the envelope sender or the Return-Path address.|
|senderFromAddress|String|Sender email address in the FROM header, which is visible to email recipients on their email clients. Also known as P2 Sender.|
|senderFromDomain|String|Sender domain in the FROM header, which is visible to email recipients on their email clients. Also known as P2 Sender Domain.|
|senderIPv4|String|IPv4 address of the last detected mail server that relayed the message.|
|senderPolicyFramework|String|Sender Policy Framework (SPF). Indicates whether it was pass/fail/soft fail etc.|
|senderTag|String|Tags applied to the sender when they send the email. This is a comma separated list.|
|spamConfidenceLevel|String|Indicates the degree of confidence with which the spam threat was identified. Can be Normal or High.|
|subject|String|Subject of the email.|
|submissionId|String|Comma separated values containing ID of any Submissions associated with the email.|
|threatDetail|[threatDetail](../resources/threatdetail.md)|Contain the threat information and detection details.|
|threatType|threatType|Verdict from the email filtering stack on whether the email contains malware, phishing, or other threats. The possible values are: `spam`, `malware`, `phish`, `none`, `unknownFutureValue`.|
|url|[securityEmailUrls](../resources/securityemailurls.md) collection|Collection of URLs in the email.|
|urlCount|String|Number of embedded URLs in the email.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mailMessage",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mailMessage",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "networkMessageId": "String",
  "internetMessageId": "String",
  "senderEmailFromAddress": "String",
  "senderFromAddress": "String",
  "senderDisplayName": "String",
  "returnPath": "String",
  "senderIPv4": "String",
  "recipientEmailAddress": "String",
  "subject": "String",
  "emailClusterId": "String",
  "directionality": "String",
  "originalDeliveryLocation": "String",
  "originalDeliveryAction": "String",
  "latestDeliveryLocation": "String",
  "threatType": "String",
  "detectionMethod": "String",
  "threatDetail": {
    "@odata.type": "microsoft.graph.threatDetail"
  },
  "pishConfidenceLevel": "String",
  "spamConfidenceLevel": "String",
  "policyAction": "String",
  "policy": "String",
  "attachmentCount": "String",
  "urlCount": "String",
  "language": "String",
  "connector": "String",
  "recipientTag": "String",
  "senderTag": "String",
  "alertId": "String",
  "submissionId": "String",
  "junkMailboxRule": "String",
  "bulkComplaintLevel": "String",
  "domainBasedMessageAuthentication": "String",
  "domainKeysIdentifiedMail": "String",
  "senderPolicyFramework": "String",
  "compositeAuthentication": "String",
  "attachment": [
    {
      "@odata.type": "microsoft.graph.securityEmailAttachments"
    }
  ],
  "url": [
    {
      "@odata.type": "microsoft.graph.securityEmailUrls"
    }
  ],
  "distributionList": "String",
  "senderEmailFromDomain": "String",
  "senderFromDomain": "String",
  "domainOwner": "String",
  "domainCreationDate": "String",
  "location": "String",
  "exchangeTransportRule": "String"
}
```

