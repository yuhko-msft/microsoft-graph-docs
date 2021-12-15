---
title: "urlThreatSubmission resource type"
description: "Used for submitting url to MDO. Derived from threatSubmission type."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# urlThreatSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Used for submitting url to MDO. Derived from threatSubmission type.


Inherits from [threatSubmission](../resources/threatsubmission.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List urlThreatSubmissions](../api/urlthreatsubmission-list.md)|[urlThreatSubmission](../resources/urlthreatsubmission.md) collection|Get a list of the [urlThreatSubmission](../resources/urlthreatsubmission.md) objects and their properties.|
|[Create urlThreatSubmission](../api/submission-post-urlthreats.md)|[urlThreatSubmission](../resources/urlthreatsubmission.md)|Create a new [urlThreatSubmission](../resources/urlthreatsubmission.md) object.|
|[Get urlThreatSubmission](../api/urlthreatsubmission-get.md)|[urlThreatSubmission](../resources/urlthreatsubmission.md)|Read the properties and relationships of an [urlThreatSubmission](../resources/urlthreatsubmission.md) object.|
|[Update urlThreatSubmission](../api/urlthreatsubmission-update.md)|[urlThreatSubmission](../resources/urlthreatsubmission.md)|Update the properties of an [urlThreatSubmission](../resources/urlthreatsubmission.md) object.|
|[Delete urlThreatSubmission](../api/urlthreatsubmission-delete.md)|None|Deletes an [urlThreatSubmission](../resources/urlthreatsubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReview|[submissionAdminReview](../resources/submissionadminreview.md)|User submission admin review Inherited from [threatSubmission](../resources/threatsubmission.md).|
|category|submissionCategory|not junk, spam, phishing or malware. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|clientSource|submissionClientSource|microsoft or other client. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `microsoft`, `other`, `unknownFutureValue`.|
|contentType|submissionContentType|email, url, email attachment, file or app. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `email`, `url`, `emailAttachment`, `file`, `app`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|The submitter of the threat submission. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|createdDateTime|DateTimeOffset|When the threat submission was created. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|id|String|Threat submission id. When creation on post, it is not necessary. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|result|[submissionResult](../resources/submissionresult.md)|The threat submission check result. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|source|submissionSource|The threat submission source. Administrator or user. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `user`, `administrator`, `unknownFutureValue`.|
|status|longRunningOperationStatus|If the threat submission check is finished. Inherited from [threatSubmission](../resources/threatsubmission.md). The possible values are: `notStarted`, `running`, `succeeded`, `failed`, `skipped`, `unknownFutureValue`.|
|tenantId|String|The tenant id. When creation on post, it is not necessary. Extracted from token. Inherited from [threatSubmission](../resources/threatsubmission.md).|
|webUrl|String|The webUrl to be submitted.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.urlThreatSubmission",
  "baseType": "microsoft.graph.threatSubmission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.urlThreatSubmission",
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
  "webUrl": "String"
}
```

