---
title: "Update emailThreatSubmissionPolicy"
description: "Update the properties of an emailThreatSubmissionPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update emailThreatSubmissionPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of an [emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) object.

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
PATCH /emailThreatSubmissionPolicy
PATCH /submission/emailThreatSubmissionPolicies/{emailThreatSubmissionPolicyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|isReportToMicrosoftEnabled|Boolean|If enabled, the email will be sent to microsoft for analysis. Required.|
|isReportToCustomizedAddressEnabled|Boolean|If enabled, the email will be sent to customizedReportRecipientAddress. Required.|
|isReportToThirdPartyAddressEnabled|Boolean|If enabled, the email will be sent to thirdPartyReportRecipientAddress.  Required.|
|isAskMeEnabled|Boolean|User could use 'Ask me before reporting the message' option Required.|
|isAlwaysReportEnabled|Boolean|User could use 'Always report the message' option Required.|
|isNeverReportEnabled|Boolean|User could use 'Never report the message' option Required.|
|onlyShowCustomizedMessageForPhishing|Boolean|If enabled, customized message only shows when email is reported as phishing. Required.|
|isCustomizedMessageEnabled|Boolean|If enabled, customized message is enabled. Required.|
|preSubmitMessageTitle|String|Customized message title before email is submitted Required.|
|preSubmitMessage|String|Customized message before email is submitted Required.|
|postSubmitMessageTitle|String|Customized message title after email is submitted Required.|
|postSubmitMessage|String|Customized message after email is submitted Required.|
|customizedReportRecipientAddress|String|When customized address enabled, the message will be sent to this address. Required.|
|thirdPartyReportRecipientAddress|String|When third party address enabled, the message will be sent to this address. Required.|
|isReviewEmailNotificationEnabled|Boolean|If enabled, system sends email notification to reporter when admin reviews the submission. Required.|
|isCustomizedNotificationSenderEnabled|Boolean|If enabled, notificationSenderAddress is used by review notification email. Required.|
|isOrganizationBrandingEnabled|Boolean|If enabled, tenant branding logo will be used in review notification message. Required.|
|junkReviewResultMessage|String|When user reported email is reivewed as junk by admin, this message will be used.  Required.|
|notJunkReviewResultMessage|String|When user reported email is reivewed as not junk by admin, this message will be used. Required.|
|phishingReviewResultMessage|String|When user reported email is reivewed as phishing by admin, this message will be used. Required.|
|reviewNotificationFooterMessage|String|Footer message used in review notification email. Required.|
|customizedNotificationSenderAddress|String|Customized notification sender address for review notification message. Required.|
|isReportFromQuarantineEnabled|Boolean|If enabled, submission could be created from security portal quarantine page. Required.|



## Response

If successful, this method returns a `200 OK` response code and an updated [emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_emailthreatsubmissionpolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/emailThreatSubmissionPolicy
Content-Type: application/json
Content-length: 1092

{
  "@odata.type": "#microsoft.graph.emailThreatSubmissionPolicy",
  "isReportToMicrosoftEnabled": "Boolean",
  "isReportToCustomizedAddressEnabled": "Boolean",
  "isReportToThirdPartyAddressEnabled": "Boolean",
  "isAskMeEnabled": "Boolean",
  "isAlwaysReportEnabled": "Boolean",
  "isNeverReportEnabled": "Boolean",
  "onlyShowCustomizedMessageForPhishing": "Boolean",
  "isCustomizedMessageEnabled": "Boolean",
  "preSubmitMessageTitle": "String",
  "preSubmitMessage": "String",
  "postSubmitMessageTitle": "String",
  "postSubmitMessage": "String",
  "customizedReportRecipientAddress": "String",
  "thirdPartyReportRecipientAddress": "String",
  "isReviewEmailNotificationEnabled": "Boolean",
  "isCustomizedNotificationSenderEnabled": "Boolean",
  "isOrganizationBrandingEnabled": "Boolean",
  "junkReviewResultMessage": "String",
  "notJunkReviewResultMessage": "String",
  "phishingReviewResultMessage": "String",
  "reviewNotificationFooterMessage": "String",
  "customizedNotificationSenderAddress": "String",
  "isReportFromQuarantineEnabled": "Boolean"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.emailThreatSubmissionPolicy",
  "id": "333b345b-345b-333b-5b34-3b335b343b33",
  "isReportToMicrosoftEnabled": "Boolean",
  "isReportToCustomizedAddressEnabled": "Boolean",
  "isReportToThirdPartyAddressEnabled": "Boolean",
  "isAskMeEnabled": "Boolean",
  "isAlwaysReportEnabled": "Boolean",
  "isNeverReportEnabled": "Boolean",
  "onlyShowCustomizedMessageForPhishing": "Boolean",
  "isCustomizedMessageEnabled": "Boolean",
  "preSubmitMessageTitle": "String",
  "preSubmitMessage": "String",
  "postSubmitMessageTitle": "String",
  "postSubmitMessage": "String",
  "customizedReportRecipientAddress": "String",
  "thirdPartyReportRecipientAddress": "String",
  "isReviewEmailNotificationEnabled": "Boolean",
  "isCustomizedNotificationSenderEnabled": "Boolean",
  "isOrganizationBrandingEnabled": "Boolean",
  "junkReviewResultMessage": "String",
  "notJunkReviewResultMessage": "String",
  "phishingReviewResultMessage": "String",
  "reviewNotificationFooterMessage": "String",
  "customizedNotificationSenderAddress": "String",
  "isReportFromQuarantineEnabled": "Boolean"
}
```

