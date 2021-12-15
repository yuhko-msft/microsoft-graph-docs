---
title: "emailThreatSubmissionPolicy resource type"
description: "Threat submission policy is used for customize your organization's experience when reporting potential threats and spam in Microsoft Outlook."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailThreatSubmissionPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Threat submission policy is used for customize your organization's experience when reporting potential threats and spam in Microsoft Outlook.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailThreatSubmissionPolicies](../api/emailthreatsubmissionpolicy-list.md)|[emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) collection|Get a list of the [emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) objects and their properties.|
|[Create emailThreatSubmissionPolicy](../api/submission-post-emailthreatsubmissionpolicies.md)|[emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md)|Create a new [emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) object.|
|[Get emailThreatSubmissionPolicy](../api/emailthreatsubmissionpolicy-get.md)|[emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md)|Read the properties and relationships of an [emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) object.|
|[Update emailThreatSubmissionPolicy](../api/emailthreatsubmissionpolicy-update.md)|[emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md)|Update the properties of an [emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) object.|
|[Delete emailThreatSubmissionPolicy](../api/emailthreatsubmissionpolicy-delete.md)|None|Deletes an [emailThreatSubmissionPolicy](../resources/emailthreatsubmissionpolicy.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|customizedNotificationSenderAddress|String|Customized notification sender address for review notification message.|
|customizedReportRecipientAddress|String|When customized address enabled, the message will be sent to this address.|
|id|String|Policy id.|
|isAlwaysReportEnabled|Boolean|User could use 'Always report the message' option|
|isAskMeEnabled|Boolean|User could use 'Ask me before reporting the message' option|
|isCustomizedMessageEnabled|Boolean|If enabled, customized message is enabled.|
|isCustomizedNotificationSenderEnabled|Boolean|If enabled, notificationSenderAddress is used by review notification email.|
|isNeverReportEnabled|Boolean|User could use 'Never report the message' option|
|isOrganizationBrandingEnabled|Boolean|If enabled, tenant branding logo will be used in review notification message.|
|isReportFromQuarantineEnabled|Boolean|If enabled, submission could be created from security portal quarantine page.|
|isReportToCustomizedAddressEnabled|Boolean|If enabled, the email will be sent to customizedReportRecipientAddress.|
|isReportToMicrosoftEnabled|Boolean|If enabled, the email will be sent to microsoft for analysis.|
|isReportToThirdPartyAddressEnabled|Boolean|If enabled, the email will be sent to thirdPartyReportRecipientAddress. |
|isReviewEmailNotificationEnabled|Boolean|If enabled, system sends email notification to reporter when admin reviews the submission.|
|junkReviewResultMessage|String|When user reported email is reivewed as junk by admin, this message will be used. |
|notJunkReviewResultMessage|String|When user reported email is reivewed as not junk by admin, this message will be used.|
|onlyShowCustomizedMessageForPhishing|Boolean|If enabled, customized message only shows when email is reported as phishing.|
|phishingReviewResultMessage|String|When user reported email is reivewed as phishing by admin, this message will be used.|
|postSubmitMessage|String|Customized message after email is submitted|
|postSubmitMessageTitle|String|Customized message title after email is submitted|
|preSubmitMessage|String|Customized message before email is submitted|
|preSubmitMessageTitle|String|Customized message title before email is submitted|
|reviewNotificationFooterMessage|String|Footer message used in review notification email.|
|thirdPartyReportRecipientAddress|String|When third party address enabled, the message will be sent to this address.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailThreatSubmissionPolicy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailThreatSubmissionPolicy",
  "id": "String (identifier)",
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

