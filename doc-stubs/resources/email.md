---
title: "email resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# email resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emails](../api/email-list.md)|[email](../resources/email.md) collection|Get a list of the [email](../resources/email.md) objects and their properties.|
|[Create email](../api/emaileventroot-post-emails.md)|[email](../resources/email.md)|Create a new [email](../resources/email.md) object.|
|[Get email](../api/email-get.md)|[email](../resources/email.md)|Read the properties and relationships of an [email](../resources/email.md) object.|
|[Update email](../api/email-update.md)|[email](../resources/email.md)|Update the properties of an [email](../resources/email.md) object.|
|[Delete email](../api/email-delete.md)|None|Deletes an [email](../resources/email.md) object.|
|[softDelete](../api/email-softdelete.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[hardDelete](../api/email-harddelete.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[moveToJunk](../api/email-movetojunk.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[movetoDeletedItems](../api/email-movetodeleteditems.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|
|[movetoInbox](../api/email-movetoinbox.md)|[remediationResponse](../resources/remediationresponse.md)|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|alertId|String|**TODO: Add Description**|
|attachment|String|**TODO: Add Description**|
|attachmentCount|String|**TODO: Add Description**|
|bulkComplaintLevel|String|**TODO: Add Description**|
|clusterId|String|**TODO: Add Description**|
|compositeAuthentication|String|**TODO: Add Description**|
|connector|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|detectionMethod|detectionMethod|**TODO: Add Description**. The possible values are: `generalFilter`, `impersonationBrand`, `spoofExternalDomain`, `spoofDmarc`, `impersonationDomain`, `fileDetonation`, `fileReputation`, `fileDetonationReputation`, `fingerPrintMatching`, `mailboxIntelligenceImpersonation`, `domainReputation`, `spoofIntraOrg`, `advancedFilter`, `antiMalwareEngine`, `mixedAnalysisDetection`, `urlMaliciousReputation`, `urlDetonation`, `urlDetonationReputation`, `impersonationUser`, `campaign`.|
|directionality|directionality|**TODO: Add Description**. The possible values are: `inbound`, `outbound`, `intraOrg`.|
|distributionList|String|**TODO: Add Description**|
|dkim|String|**TODO: Add Description**|
|dmarc|String|**TODO: Add Description**|
|domainCreationDate|String|**TODO: Add Description**|
|domainOwner|String|**TODO: Add Description**|
|exchangeTransportRule|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|internetMessageId|String|**TODO: Add Description**|
|junkMailboxRule|String|**TODO: Add Description**|
|language|String|**TODO: Add Description**|
|latestDeliveryLocation|deliveryLocation|**TODO: Add Description**. The possible values are: `inboxOrFolder`, `onPremisesOrExternal`, `junk`, `quarantine`, `failed`, `dropped`, `deletedItems`.|
|location|String|**TODO: Add Description**|
|networkMessageId|String|**TODO: Add Description**|
|originalDeliveryAction|deliveryAction|**TODO: Add Description**. The possible values are: `delivered`, `deliveredToJunk`, `blocked`, `replaced`.|
|originalDeliveryLocation|deliveryLocation|**TODO: Add Description**. The possible values are: `inboxOrFolder`, `onPremisesOrExternal`, `junk`, `quarantine`, `failed`, `dropped`, `deletedItems`.|
|override|String|**TODO: Add Description**|
|pishConfidenceLevel|String|**TODO: Add Description**|
|policy|emailPolicy|**TODO: Add Description**. The possible values are: `antispam`, `antiSpamHighConfidence`, `antiPhishingSpoof`, `antiPhishingDomainImpersonation`, `antiPhishingUserImpersonation`, `antiMalware`, `safeAttachments`, `exchangeTransportRule`, `antiPhishingGraphImpersonation`, `antiSpamBulkMail`, `antiSpamPhishing`.|
|policyAction|emailActionPolicy|**TODO: Add Description**. The possible values are: `moveMessageToJunkMailFolder`, `addXHeader`, `modifySubject`, `deleteMessage`, `sendToQuarantine`, `noActionTaken`, `bccMessage`, `redirectMessage`.|
|recipientEmailAddress|String|**TODO: Add Description**|
|recipientTag|String|**TODO: Add Description**|
|returnPath|String|**TODO: Add Description**|
|senderDisplayName|String|**TODO: Add Description**|
|senderEmailFromAddress|String|**TODO: Add Description**|
|senderEmailFromDomain|String|**TODO: Add Description**|
|senderFromAddress|String|**TODO: Add Description**|
|senderFromDomain|String|**TODO: Add Description**|
|senderIPv4|String|**TODO: Add Description**|
|senderTag|String|**TODO: Add Description**|
|spamConfidenceLevel|String|**TODO: Add Description**|
|spf|String|**TODO: Add Description**|
|subject|String|**TODO: Add Description**|
|submissionId|String|**TODO: Add Description**|
|threatDetail|[threatDetail](../resources/threatdetail.md)|**TODO: Add Description**|
|threatType|threatType|**TODO: Add Description**. The possible values are: `spam`, `malware`, `phish`, `none`.|
|url|String|**TODO: Add Description**|
|urlCount|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.email",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.email",
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
  "clusterId": "String",
  "directionality": "String",
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
  "dmarc": "String",
  "dkim": "String",
  "spf": "String",
  "compositeAuthentication": "String",
  "attachment": "String",
  "url": "String",
  "override": "String",
  "distributionList": "String",
  "senderEmailFromDomain": "String",
  "senderFromDomain": "String",
  "domainOwner": "String",
  "domainCreationDate": "String",
  "location": "String",
  "exchangeTransportRule": "String",
  "originalDeliveryLocation": "String"
}
```

