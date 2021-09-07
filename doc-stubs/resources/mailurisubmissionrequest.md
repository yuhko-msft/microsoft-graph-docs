---
title: "mailUriSubmissionRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mailUriSubmissionRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mailUriSubmissionRequests](../api/mailurisubmissionrequest-list.md)|[mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md) collection|Get a list of the [mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md) objects and their properties.|
|[Create mailUriSubmissionRequest](../api/mailurisubmissionrequest-create.md)|[mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md)|Create a new [mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md) object.|
|[Get mailUriSubmissionRequest](../api/mailurisubmissionrequest-get.md)|[mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md)|Read the properties and relationships of a [mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md) object.|
|[Update mailUriSubmissionRequest](../api/mailurisubmissionrequest-update.md)|[mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md)|Update the properties of a [mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md) object.|
|[Delete mailUriSubmissionRequest](../api/mailurisubmissionrequest-delete.md)|None|Deletes a [mailUriSubmissionRequest](../resources/mailurisubmissionrequest.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminReviewInfo|[adminReviewInfo](../resources/adminreviewinfo.md)|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|category|submissionCategory|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `user`, `admin`.|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `mail`, `url`, `file`.|
|createdBy|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|emailSubject|String|**TODO: Add Description** Inherited from [mailSubmissionRequest](../resources/mailsubmissionrequest.md).|
|id|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|messageUri|String|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.mailUriSubmissionRequest",
  "baseType": "microsoft.graph.mailSubmissionRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mailUriSubmissionRequest",
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
  "messageUri": "String"
}
```

