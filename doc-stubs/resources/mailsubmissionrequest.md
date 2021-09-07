---
title: "mailSubmissionRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mailSubmissionRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [submissionRequest](../resources/submissionrequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mailSubmissionRequests](../api/mailsubmissionrequest-list.md)|[mailSubmissionRequest](../resources/mailsubmissionrequest.md) collection|Get a list of the [mailSubmissionRequest](../resources/mailsubmissionrequest.md) objects and their properties.|
|[Create mailSubmissionRequest](../api/mailsubmissionrequest-create.md)|[mailSubmissionRequest](../resources/mailsubmissionrequest.md)|Create a new [mailSubmissionRequest](../resources/mailsubmissionrequest.md) object.|
|[Get mailSubmissionRequest](../api/mailsubmissionrequest-get.md)|[mailSubmissionRequest](../resources/mailsubmissionrequest.md)|Read the properties and relationships of a [mailSubmissionRequest](../resources/mailsubmissionrequest.md) object.|
|[Update mailSubmissionRequest](../api/mailsubmissionrequest-update.md)|[mailSubmissionRequest](../resources/mailsubmissionrequest.md)|Update the properties of a [mailSubmissionRequest](../resources/mailsubmissionrequest.md) object.|
|[Delete mailSubmissionRequest](../api/mailsubmissionrequest-delete.md)|None|Deletes a [mailSubmissionRequest](../resources/mailsubmissionrequest.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReviewInfo|[adminReviewInfo](../resources/adminreviewinfo.md)|**TODO: Add Description**|
|category|submissionCategory|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `user`, `admin`.|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `mail`, `url`, `file`.|
|createdBy|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|emailSubject|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|networkMessageId|String|**TODO: Add Description**|
|reason|submissionReason|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `shouldBlock`, `shouldUnblock`.|
|recipientEmail|String|**TODO: Add Description**|
|rescanResult|String|**TODO: Add Description**|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|sender|String|**TODO: Add Description**|
|senderIP|String|**TODO: Add Description**|
|status|submissionStatus|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `pending`, `completed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mailSubmissionRequest",
  "baseType": "microsoft.graph.submissionRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mailSubmissionRequest",
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
  }
}
```

