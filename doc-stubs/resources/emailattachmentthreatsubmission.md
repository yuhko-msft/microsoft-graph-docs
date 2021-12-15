---
title: "emailAttachmentThreatSubmission resource type"
description: "Used for submitting email attachment to MDO. Derived from threatSubmission type."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailAttachmentThreatSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Used for submitting email attachment to MDO. Derived from threatSubmission type.


Inherits from [threatSubmission](../resources/threatsubmission.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailAttachmentThreatSubmissions](../api/emailattachmentthreatsubmission-list.md)|[emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md) collection|Get a list of the [emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md) objects and their properties.|
|[Create emailAttachmentThreatSubmission](../api/submission-post-emailattachmentthreats.md)|[emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md)|Create a new [emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md) object.|
|[Get emailAttachmentThreatSubmission](../api/emailattachmentthreatsubmission-get.md)|[emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md)|Read the properties and relationships of an [emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md) object.|
|[Update emailAttachmentThreatSubmission](../api/emailattachmentthreatsubmission-update.md)|[emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md)|Update the properties of an [emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md) object.|
|[Delete emailAttachmentThreatSubmission](../api/emailattachmentthreatsubmission-delete.md)|None|Deletes an [emailAttachmentThreatSubmission](../resources/emailattachmentthreatsubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReview|[submissionAdminReview](../resources/submissionadminreview.md)|User submission admin review Inherited from [threatSubmission](../resources/threatsubmission.md).|
|category|submissionCategory|not junk, spam, phishing or malware. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|clientSource|submissionClientSource|microsoft or other client. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `microsoft`, `other`, `unknownFutureValue`.|
|contentType|submissionContentType|email, url, email attachment, file or app. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `email`, `url`, `emailAttachment`, `file`, `app`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|The submitter of the threat submission. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|createdDateTime|DateTimeOffset|When the threat submission was created. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|fileContent|String|Base64 encoded file content.|
|fileName|String|The file name to be submitted.|
|id|String|Threat submission id. When creation on post, it is not necessary. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|result|[submissionResult](../resources/submissionresult.md)|The threat submission check result. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|source|submissionSource|The threat submission source. Administrator or user. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `user`, `administrator`, `unknownFutureValue`.|
|status|longRunningOperationStatus|If the threat submission check is finished. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `skipped`, `unknownFutureValue`.|
|tenantId|String|The tenant id. When creation on post, it is not necessary. Extracted from token. Inherited from [threatSubmission](../resources/threatsubmission.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailAttachmentThreatSubmission",
  "baseType": "microsoft.graph.threatSubmission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailAttachmentThreatSubmission",
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
  "fileName": "String",
  "fileContent": "String"
}
```

