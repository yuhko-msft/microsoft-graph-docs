---
title: "fileSubmission resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# fileSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [submission](../resources/submission.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List fileSubmissions](../api/filesubmission-list.md)|[fileSubmission](../resources/filesubmission.md) collection|Get a list of the [fileSubmission](../resources/filesubmission.md) objects and their properties.|
|[Create fileSubmission](../api/filesubmission-create.md)|[fileSubmission](../resources/filesubmission.md)|Create a new [fileSubmission](../resources/filesubmission.md) object.|
|[Get fileSubmission](../api/filesubmission-get.md)|[fileSubmission](../resources/filesubmission.md)|Read the properties and relationships of a [fileSubmission](../resources/filesubmission.md) object.|
|[Update fileSubmission](../api/filesubmission-update.md)|[fileSubmission](../resources/filesubmission.md)|Update the properties of a [fileSubmission](../resources/filesubmission.md) object.|
|[Delete fileSubmission](../api/filesubmission-delete.md)|None|Deletes a [fileSubmission](../resources/filesubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|submissionCategory|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `user`, `admin`, `unknownFutureValue`.|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|fileContent|String|**TODO: Add Description**|
|fileName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|reason|submissionReason|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|status|submissionStatus|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `pending`, `completed`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.fileSubmission",
  "baseType": "microsoft.graph.submission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.fileSubmission",
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
  "fileName": "String",
  "fileContent": "String"
}
```

