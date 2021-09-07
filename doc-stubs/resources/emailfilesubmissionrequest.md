---
title: "emailFileSubmissionRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# emailFileSubmissionRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List emailFileSubmissionRequests](../api/emailfilesubmissionrequest-list.md)|[emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) collection|Get a list of the [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) objects and their properties.|
|[Create emailFileSubmissionRequest](../api/emailfilesubmissionrequest-create.md)|[emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md)|Create a new [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.|
|[Get emailFileSubmissionRequest](../api/emailfilesubmissionrequest-get.md)|[emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md)|Read the properties and relationships of an [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.|
|[Update emailFileSubmissionRequest](../api/emailfilesubmissionrequest-update.md)|[emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md)|Update the properties of an [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.|
|[Delete emailFileSubmissionRequest](../api/emailfilesubmissionrequest-delete.md)|None|Deletes an [emailFileSubmissionRequest](../resources/emailfilesubmissionrequest.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReviewInfo|[adminReviewInfo](../resources/adminreviewinfo.md)|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|category|submissionCategory|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `user`, `admin`.|
|contentData|String|**TODO: Add Description**|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `mail`, `url`, `file`.|
|createdBy|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|emailSubject|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|id|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|networkMessageId|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|reason|submissionReason|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `shouldBlock`, `shouldUnblock`.|
|recipientEmail|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|rescanResult|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|sender|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|senderIP|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|status|submissionStatus|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `pending`, `completed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.emailFileSubmissionRequest",
  "baseType": "microsoft.graph.mailSubmissionRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.emailFileSubmissionRequest",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "contentType": "String",
  "category": "String",
  "reason": "String",
  "status": "String",
  "channel": "String",
  "createdBy": "String",
  "result": {
    "@odata.type": "microsoft.graph.submissionResult"
  },
  "recipientEmail": "String",
  "networkMessageId": "String",
  "emailSubject": "String",
  "sender": "String",
  "senderIP": "String",
  "rescanResult": "String",
  "adminReviewInfo": {
    "@odata.type": "microsoft.graph.adminReviewInfo"
  },
  "contentData": "String"
}
```

