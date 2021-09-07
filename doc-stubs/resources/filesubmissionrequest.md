---
title: "fileSubmissionRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileSubmissionRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [submissionRequest](../resources/submissionrequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fileSubmissionRequests](../api/filesubmissionrequest-list.md)|[fileSubmissionRequest](../resources/filesubmissionrequest.md) collection|Get a list of the [fileSubmissionRequest](../resources/filesubmissionrequest.md) objects and their properties.|
|[Create fileSubmissionRequest](../api/filesubmissionrequest-create.md)|[fileSubmissionRequest](../resources/filesubmissionrequest.md)|Create a new [fileSubmissionRequest](../resources/filesubmissionrequest.md) object.|
|[Get fileSubmissionRequest](../api/filesubmissionrequest-get.md)|[fileSubmissionRequest](../resources/filesubmissionrequest.md)|Read the properties and relationships of a [fileSubmissionRequest](../resources/filesubmissionrequest.md) object.|
|[Update fileSubmissionRequest](../api/filesubmissionrequest-update.md)|[fileSubmissionRequest](../resources/filesubmissionrequest.md)|Update the properties of a [fileSubmissionRequest](../resources/filesubmissionrequest.md) object.|
|[Delete fileSubmissionRequest](../api/filesubmissionrequest-delete.md)|None|Deletes a [fileSubmissionRequest](../resources/filesubmissionrequest.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|submissionCategory|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `user`, `admin`.|
|contentData|String|**TODO: Add Description**|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `mail`, `url`, `file`.|
|createdBy|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|fileName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|reason|submissionReason|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `shouldBlock`, `shouldUnblock`.|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|status|submissionStatus|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `pending`, `completed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileSubmissionRequest",
  "baseType": "microsoft.graph.submissionRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileSubmissionRequest",
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
  "fileName": "String",
  "contentData": "String"
}
```

