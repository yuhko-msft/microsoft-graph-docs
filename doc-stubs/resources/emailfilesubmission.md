---
title: "emailFileSubmission resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailFileSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [mailSubmission](../resources/mailsubmission.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailFileSubmissions](../api/emailfilesubmission-list.md)|[emailFileSubmission](../resources/emailfilesubmission.md) collection|Get a list of the [emailFileSubmission](../resources/emailfilesubmission.md) objects and their properties.|
|[Create emailFileSubmission](../api/emailfilesubmission-create.md)|[emailFileSubmission](../resources/emailfilesubmission.md)|Create a new [emailFileSubmission](../resources/emailfilesubmission.md) object.|
|[Get emailFileSubmission](../api/emailfilesubmission-get.md)|[emailFileSubmission](../resources/emailfilesubmission.md)|Read the properties and relationships of an [emailFileSubmission](../resources/emailfilesubmission.md) object.|
|[Update emailFileSubmission](../api/emailfilesubmission-update.md)|[emailFileSubmission](../resources/emailfilesubmission.md)|Update the properties of an [emailFileSubmission](../resources/emailfilesubmission.md) object.|
|[Delete emailFileSubmission](../api/emailfilesubmission-delete.md)|None|Deletes an [emailFileSubmission](../resources/emailfilesubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReviewInfo|[adminReviewInfo](../resources/adminreviewinfo.md)|User submission admin review info Inherited from [mailSubmission](../resources/mailsubmission.md).|
|attackSimulationInfo|[attackSimulationInfo](../resources/attacksimulationinfo.md)|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md).|
|category|submissionCategory|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `user`, `admin`, `unknownFutureValue`.|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|emailSubject|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md).|
|fileContent|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|networkMessageId|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md).|
|originalVerdict|submissionCategory|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|reason|submissionReason|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|receivedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md).|
|recipientEmail|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md).|
|rescanVerdict|submissionCategory|User submission rescan result Inherited from [mailSubmission](../resources/mailsubmission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|sender|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md).|
|senderIP|String|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md).|
|status|submissionStatus|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `pending`, `completed`, `unknownFutureValue`.|
|tablInfo|[tablInfo](../resources/tablinfo.md)|**TODO: Add Description** Inherited from [mailSubmission](../resources/mailsubmission.md).|
|tablPayload|[tablPayload](../resources/tablpayload.md)|Used for creation. Inherited from [mailSubmission](../resources/mailsubmission.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailFileSubmission",
  "baseType": "microsoft.graph.mailSubmission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailFileSubmission",
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
  },
  "fileContent": "String"
}
```

