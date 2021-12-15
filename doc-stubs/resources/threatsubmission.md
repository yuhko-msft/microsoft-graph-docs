---
title: "threatSubmission resource type"
description: "An abstract type for threat submission. "
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# threatSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

An abstract type for threat submission. 
This is an abstract type.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List threatSubmissions](../api/threatsubmission-list.md)|[threatSubmission](../resources/threatsubmission.md) collection|Get a list of the [threatSubmission](../resources/threatsubmission.md) objects and their properties.|
|[Get threatSubmission](../api/threatsubmission-get.md)|[threatSubmission](../resources/threatsubmission.md)|Read the properties and relationships of a [threatSubmission](../resources/threatsubmission.md) object.|
|[Update threatSubmission](../api/threatsubmission-update.md)|[threatSubmission](../resources/threatsubmission.md)|Update the properties of a [threatSubmission](../resources/threatsubmission.md) object.|
|[Delete threatSubmission](../api/threatsubmission-delete.md)|None|Deletes a [threatSubmission](../resources/threatsubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReview|[submissionAdminReview](../resources/submissionadminreview.md)|User submission admin review|
|category|submissionCategory|not junk, spam, phishing or malware. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|clientSource|submissionClientSource|microsoft or other client. The possible values are: `microsoft`, `other`, `unknownFutureValue`.|
|contentType|submissionContentType|email, url, email attachment, file or app. The possible values are: `email`, `url`, `emailAttachment`, `file`, `app`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|The submitter of the threat submission.|
|createdDateTime|DateTimeOffset|When the threat submission was created.|
|id|String|Threat submission id. When creation on post, it is not necessary.|
|result|[submissionResult](../resources/submissionresult.md)|The threat submission check result.|
|source|submissionSource|The threat submission source. Administrator or user. The possible values are: `user`, `administrator`, `unknownFutureValue`.|
|status|longRunningOperationStatus|If the threat submission check is finished. The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `skipped`, `unknownFutureValue`.|
|tenantId|String|The tenant id. When creation on post, it is not necessary. Extracted from token.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.threatSubmission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.threatSubmission",
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
  "clientSource": "String"
}
```

