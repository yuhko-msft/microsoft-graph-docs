---
title: "Create email"
description: "Create a new email object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create email
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [email](../resources/email.md) object.

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
POST /security/emailEvent/emails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [email](../resources/email.md) object.

You can specify the following properties when creating an **email**.

|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|networkMessageId|String|**TODO: Add Description** Required.|
|internetMessageId|String|**TODO: Add Description** Required.|
|senderMailFromAddress|String|**TODO: Add Description** Required.|
|senderFromAddress|String|**TODO: Add Description** Required.|
|senderDisplayName|String|**TODO: Add Description** Required.|
|returnPath|String|**TODO: Add Description** Required.|
|senderIPv4|String|**TODO: Add Description** Required.|
|recipientEmailAddress|String|**TODO: Add Description** Required.|
|subject|String|**TODO: Add Description** Required.|
|emailClusterId|String|**TODO: Add Description** Required.|
|directionality|directionality|**TODO: Add Description**. The possible values are: `inbound`, `outbound`, `intraOrg`. Required.|
|originalDeliveryAction|deliveryAction|**TODO: Add Description**. The possible values are: `delivered`, `deliveredToJunk`, `blocked`, `replaced`. Required.|
|latestDeliveryLocation|deliveryLocation|**TODO: Add Description**. The possible values are: `inboxOrFolder`, `onPremisesOrExternal`, `junk`, `quarantine`, `failed`, `dropped`, `deletedItems`. Required.|
|threatTypes|threatType|**TODO: Add Description**. The possible values are: `spam`, `malware`, `phish`, `none`. Required.|
|detectionMethods|detectionMethods|**TODO: Add Description**. The possible values are: `generalFilter`, `impersonationBrand`, `spoofExternalDomain`, `spoofDmarc`, `impersonationDomain`, `fileDetonation`, `fileReputation`, `fileDetonationReputation`, `fingerPrintMatching`, `mailboxIntelligenceImpersonation`, `domainReputation`, `spoofIntraOrg`, `advancedFilter`, `antiMalwareEngine`, `mixedAnalysisDetection`, `urlMaliciousReputation`, `urlDetonation`, `urlDetonationReputation`, `impersonationUser`, `campaign`. Required.|
|threatDetails|[threatDetails](../resources/threatdetails.md)|**TODO: Add Description** Required.|
|pishConfidenceLevel|String|**TODO: Add Description** Required.|
|spamConfidenceLevel|String|**TODO: Add Description** Required.|
|emailPolicyAction|emailActionPolicy|**TODO: Add Description**. The possible values are: `moveMessageToJunkMailFolder`, `addXHeader`, `modifySubject`, `deleteMessage`, `sendToQuarantine`, `noActionTaken`, `bccMessage`, `redirectMessage`. Required.|
|emailPolicy|emailPolicy|**TODO: Add Description**. The possible values are: `antispam`, `antiSpamHighConfidence`, `antiPhishingSpoof`, `antiPhishingDomainImpersonation`, `antiPhishingUserImpersonation`, `antiMalware`, `safeAttachments`, `exchangeTransportRule`, `antiPhishingGraphImpersonation`, `antiSpamBulkMail`, `antiSpamPhishing`. Required.|
|attachmentCount|String|**TODO: Add Description** Required.|
|urlCount|String|**TODO: Add Description** Required.|
|language|String|**TODO: Add Description** Required.|
|connectors|String|**TODO: Add Description** Required.|
|recipientTags|String|**TODO: Add Description** Required.|
|senderTags|String|**TODO: Add Description** Required.|
|alertIds|String|**TODO: Add Description** Required.|
|submissionId|String|**TODO: Add Description** Required.|
|junkMailboxRule|String|**TODO: Add Description** Required.|
|bulkComplaintLevel|String|**TODO: Add Description** Required.|
|dmarc|String|**TODO: Add Description** Required.|
|dkim|String|**TODO: Add Description** Required.|
|spf|String|**TODO: Add Description** Required.|
|compositeAuthentication|String|**TODO: Add Description** Required.|
|attachments|String|**TODO: Add Description** Required.|
|urls|String|**TODO: Add Description** Required.|
|emailOverrides|String|**TODO: Add Description** Required.|
|distributionList|String|**TODO: Add Description** Required.|
|senderMailFromDomain|String|**TODO: Add Description** Required.|
|senderFromDomain|String|**TODO: Add Description** Required.|
|domainOwner|String|**TODO: Add Description** Required.|
|domainCreationDate|String|**TODO: Add Description** Required.|
|location|String|**TODO: Add Description** Required.|
|exchangeTransportRules|String|**TODO: Add Description** Required.|
|originalDeliveryLocation|deliveryLocation|**TODO: Add Description**. The possible values are: `inboxOrFolder`, `onPremisesOrExternal`, `junk`, `quarantine`, `failed`, `dropped`, `deletedItems`. Required.|



## Response

If successful, this method returns a `201 Created` response code and an [email](../resources/email.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_email_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/security/emailEvent/emails
Content-Type: application/json
Content-length: 1492

{
  "@odata.type": "#microsoft.graph.email",
  "networkMessageId": "String",
  "internetMessageId": "String",
  "senderMailFromAddress": "String",
  "senderFromAddress": "String",
  "senderDisplayName": "String",
  "returnPath": "String",
  "senderIPv4": "String",
  "recipientEmailAddress": "String",
  "subject": "String",
  "emailClusterId": "String",
  "directionality": "String",
  "originalDeliveryAction": "String",
  "latestDeliveryLocation": "String",
  "threatTypes": "String",
  "detectionMethods": "String",
  "threatDetails": {
    "@odata.type": "microsoft.graph.threatDetails"
  },
  "pishConfidenceLevel": "String",
  "spamConfidenceLevel": "String",
  "emailPolicyAction": "String",
  "emailPolicy": "String",
  "attachmentCount": "String",
  "urlCount": "String",
  "language": "String",
  "connectors": "String",
  "recipientTags": "String",
  "senderTags": "String",
  "alertIds": "String",
  "submissionId": "String",
  "junkMailboxRule": "String",
  "bulkComplaintLevel": "String",
  "dmarc": "String",
  "dkim": "String",
  "spf": "String",
  "compositeAuthentication": "String",
  "attachments": "String",
  "urls": "String",
  "emailOverrides": "String",
  "distributionList": "String",
  "senderMailFromDomain": "String",
  "senderFromDomain": "String",
  "domainOwner": "String",
  "domainCreationDate": "String",
  "location": "String",
  "exchangeTransportRules": "String",
  "originalDeliveryLocation": "String"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.email"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.email",
  "id": "39b5b8db-b8db-39b5-dbb8-b539dbb8b539",
  "createdDateTime": "String (timestamp)",
  "networkMessageId": "String",
  "internetMessageId": "String",
  "senderMailFromAddress": "String",
  "senderFromAddress": "String",
  "senderDisplayName": "String",
  "returnPath": "String",
  "senderIPv4": "String",
  "recipientEmailAddress": "String",
  "subject": "String",
  "emailClusterId": "String",
  "directionality": "String",
  "originalDeliveryAction": "String",
  "latestDeliveryLocation": "String",
  "threatTypes": "String",
  "detectionMethods": "String",
  "threatDetails": {
    "@odata.type": "microsoft.graph.threatDetails"
  },
  "pishConfidenceLevel": "String",
  "spamConfidenceLevel": "String",
  "emailPolicyAction": "String",
  "emailPolicy": "String",
  "attachmentCount": "String",
  "urlCount": "String",
  "language": "String",
  "connectors": "String",
  "recipientTags": "String",
  "senderTags": "String",
  "alertIds": "String",
  "submissionId": "String",
  "junkMailboxRule": "String",
  "bulkComplaintLevel": "String",
  "dmarc": "String",
  "dkim": "String",
  "spf": "String",
  "compositeAuthentication": "String",
  "attachments": "String",
  "urls": "String",
  "emailOverrides": "String",
  "distributionList": "String",
  "senderMailFromDomain": "String",
  "senderFromDomain": "String",
  "domainOwner": "String",
  "domainCreationDate": "String",
  "location": "String",
  "exchangeTransportRules": "String",
  "originalDeliveryLocation": "String"
}
```

