---
title: "emailThreatSubmission resource type"
description: "An abstract type for email threat submission. Derived from threatSubmission type."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailThreatSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

An abstract type for email threat submission. Derived from threatSubmission type.
This is an abstract type.


Inherits from [threatSubmission](../resources/threatsubmission.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailThreatSubmissions](../api/emailthreatsubmission-list.md)|[emailThreatSubmission](../resources/emailthreatsubmission.md) collection|Get a list of the [emailThreatSubmission](../resources/emailthreatsubmission.md) objects and their properties.|
|[Create emailThreatSubmission](../api/submission-post-emailthreats.md)|[emailThreatSubmission](../resources/emailthreatsubmission.md)|Create a new [emailThreatSubmission](../resources/emailthreatsubmission.md) object.|
|[Get emailThreatSubmission](../api/emailthreatsubmission-get.md)|[emailThreatSubmission](../resources/emailthreatsubmission.md)|Read the properties and relationships of an [emailThreatSubmission](../resources/emailthreatsubmission.md) object.|
|[Update emailThreatSubmission](../api/emailthreatsubmission-update.md)|[emailThreatSubmission](../resources/emailthreatsubmission.md)|Update the properties of an [emailThreatSubmission](../resources/emailthreatsubmission.md) object.|
|[Delete emailThreatSubmission](../api/emailthreatsubmission-delete.md)|None|Deletes an [emailThreatSubmission](../resources/emailthreatsubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReview|[submissionAdminReview](../resources/submissionadminreview.md)|User submission admin review Inherited from [threatSubmission](../resources/threatsubmission.md).|
|attackSimulationInfo|[attackSimulationInfo](../resources/attacksimulationinfo.md)|If the email is phishing simulation, the field will not be null.|
|category|submissionCategory|not junk, spam, phishing or malware. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|clientSource|submissionClientSource|microsoft or other client. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `microsoft`, `other`, `unknownFutureValue`.|
|contentType|submissionContentType|email, url, email attachment, file or app. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `email`, `url`, `emailAttachment`, `file`, `app`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|The submitter of the threat submission. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|createdDateTime|DateTimeOffset|When the threat submission was created. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|id|String|Threat submission id. When creation on post, it is not necessary. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|messageId|String|The message id of the submitted email.|
|originalCategory|submissionCategory|notJunk, spam, phishing, malware. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|receivedDateTime|DateTimeOffset|The received date time of the submitted email.|
|recipientEmailAddress|String|The email recipient smtp address string.|
|result|[submissionResult](../resources/submissionresult.md)|The threat submission check result. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|sender|String|The sender of the submitted email.|
|senderIP|String|The sender IP of the submitted email.|
|source|submissionSource|The threat submission source. Administrator or user. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `user`, `administrator`, `unknownFutureValue`.|
|status|longRunningOperationStatus|If the threat submission check is finished. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `skipped`, `unknownFutureValue`.|
|subject|String|The subject of the submitted email.|
|tenantAllowOrBlockListAction|[tenantAllowOrBlockListAction](../resources/tenantalloworblocklistaction.md)|Used to auto add urls/attachments/senders of the email threat submission into tenant allow block list.|
|tenantId|String|The tenant id. When creation on post, it is not necessary. Extracted from token. Inherited from [threatSubmission](../resources/threatsubmission.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailThreatSubmission",
  "baseType": "microsoft.graph.threatSubmission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailThreatSubmission",
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
  }
}
```

