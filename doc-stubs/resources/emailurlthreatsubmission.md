---
title: "emailUrlThreatSubmission resource type"
description: "Used for submitting email to MDO by email url. Derived from emailThreatSubmission type."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailUrlThreatSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Used for submitting email to MDO by email url. Derived from emailThreatSubmission type.


Inherits from [emailThreatSubmission](../resources/emailthreatsubmission.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailUrlThreatSubmissions](../api/emailurlthreatsubmission-list.md)|[emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) collection|Get a list of the [emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) objects and their properties.|
|[Get emailUrlThreatSubmission](../api/emailurlthreatsubmission-get.md)|[emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md)|Read the properties and relationships of an [emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) object.|
|[Update emailUrlThreatSubmission](../api/emailurlthreatsubmission-update.md)|[emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md)|Update the properties of an [emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) object.|
|[Delete emailUrlThreatSubmission](../api/emailurlthreatsubmission-delete.md)|None|Deletes an [emailUrlThreatSubmission](../resources/emailurlthreatsubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReview|[submissionAdminReview](../resources/submissionadminreview.md)|User submission admin review Inherited from [threatSubmission](../resources/threatsubmission.md).|
|attackSimulationInfo|[attackSimulationInfo](../resources/attacksimulationinfo.md)|If the email is phishing simulation, the field will not be null. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md).|
|category|submissionCategory|not junk, spam, phishing or malware. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|clientSource|submissionClientSource|microsoft or other client. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `microsoft`, `other`, `unknownFutureValue`.|
|contentType|submissionContentType|email, url, email attachment, file or app. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `email`, `url`, `emailAttachment`, `file`, `app`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|The submitter of the threat submission. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|createdDateTime|DateTimeOffset|When the threat submission was created. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|id|String|Threat submission id. When creation on post, it is not necessary. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|messageId|String|The message id of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md).|
|messageUrl|String|The graph message url to be submitted.|
|originalCategory|submissionCategory|notJunk, spam, phishing, malware. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|receivedDateTime|DateTimeOffset|The received date time of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md).|
|recipientEmailAddress|String|The email recipient smtp address string. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md).|
|result|[submissionResult](../resources/submissionresult.md)|The threat submission check result. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|sender|String|The sender of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md).|
|senderIP|String|The sender IP of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md).|
|source|submissionSource|The threat submission source. Administrator or user. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `user`, `administrator`, `unknownFutureValue`.|
|status|longRunningOperationStatus|If the threat submission check is finished. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `skipped`, `unknownFutureValue`.|
|subject|String|The subject of the submitted email. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md).|
|tenantAllowOrBlockListAction|[tenantAllowOrBlockListAction](../resources/tenantalloworblocklistaction.md)|Used to auto add urls/attachments/senders of the email threat submission into tenant allow block list. Inherited from [emailThreatSubmission](../resources/emailthreatsubmission.md).|
|tenantId|String|The tenant id. When creation on post, it is not necessary. Extracted from token. Inherited from [threatSubmission](../resources/threatsubmission.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailUrlThreatSubmission",
  "baseType": "microsoft.graph.emailThreatSubmission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailUrlThreatSubmission",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "category": "String",
  "status": "String",
  "source": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.submissionUserIdentity"
  },
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "adminReview": {
    "@odata.type": "microsoft.graph.submissionAdminReview"
  },
  "tenantId": "String",
  "clientSource": "String",
  "recipientEmailAddress": "String",
  "messageId": "String",
  "subject": "String",
  "sender": "String",
  "senderIP": "String",
  "receivedDateTime": "String (timestamp)",
  "originalCategory": "String",
  "attackSimulationInfo": {
    "@odata.type": "microsoft.graph.attackSimulationInfo"
  },
  "tenantAllowOrBlockListAction": {
    "@odata.type": "microsoft.graph.tenantAllowOrBlockListAction"
  },
  "messageUrl": "String"
}
```

