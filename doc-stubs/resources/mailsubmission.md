---
title: "mailSubmission resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mailSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [submission](../resources/submission.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mailSubmissions](../api/mailsubmission-list.md)|[mailSubmission](../resources/mailsubmission.md) collection|Get a list of the [mailSubmission](../resources/mailsubmission.md) objects and their properties.|
|[Create mailSubmission](../api/mailsubmission-create.md)|[mailSubmission](../resources/mailsubmission.md)|Create a new [mailSubmission](../resources/mailsubmission.md) object.|
|[Get mailSubmission](../api/mailsubmission-get.md)|[mailSubmission](../resources/mailsubmission.md)|Read the properties and relationships of a [mailSubmission](../resources/mailsubmission.md) object.|
|[Update mailSubmission](../api/mailsubmission-update.md)|[mailSubmission](../resources/mailsubmission.md)|Update the properties of a [mailSubmission](../resources/mailsubmission.md) object.|
|[Delete mailSubmission](../api/mailsubmission-delete.md)|None|Deletes a [mailSubmission](../resources/mailsubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReviewInfo|[adminReviewInfo](../resources/adminreviewinfo.md)|User submission admin review info|
|attackSimulationInfo|[attackSimulationInfo](../resources/attacksimulationinfo.md)|**TODO: Add Description**|
|category|submissionCategory|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `user`, `admin`, `unknownFutureValue`.|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|emailSubject|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|networkMessageId|String|**TODO: Add Description**|
|originalVerdict|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|reason|submissionReason|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|receivedDateTime|DateTimeOffset|**TODO: Add Description**|
|recipientEmail|String|**TODO: Add Description**|
|rescanVerdict|submissionCategory|User submission rescan result. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|sender|String|**TODO: Add Description**|
|senderIP|String|**TODO: Add Description**|
|status|submissionStatus|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `pending`, `completed`, `unknownFutureValue`.|
|tablInfo|[tablInfo](../resources/tablinfo.md)|**TODO: Add Description**|
|tablPayload|[tablPayload](../resources/tablpayload.md)|Used for creation.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mailSubmission",
  "baseType": "microsoft.graph.submission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mailSubmission",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": {
    "@odata.type": "microsoft.graph.submissionUserIdentity"
  },
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "recipientEmail": "String",
  "networkMessageId": "String",
  "emailSubject": "String",
  "sender": "String",
  "senderIP": "String",
  "rescanVerdict": "String",
  "adminReviewInfo": {
    "@odata.type": "microsoft.graph.adminReviewInfo"
  },
  "receivedDateTime": "String (timestamp)",
  "originalVerdict": "String",
  "attackSimulationInfo": {
    "@odata.type": "microsoft.graph.attackSimulationInfo"
  },
  "tablInfo": {
    "@odata.type": "microsoft.graph.tablInfo"
  },
  "tablPayload": {
    "@odata.type": "microsoft.graph.tablPayload"
  }
}
```

