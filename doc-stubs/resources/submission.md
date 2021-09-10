---
title: "submission resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# submission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List submissions](../api/submission-list.md)|[submission](../resources/submission.md) collection|Get a list of the [submission](../resources/submission.md) objects and their properties.|
|[Create submission](../api/submission-post-submissions.md)|[submission](../resources/submission.md)|Create a new [submission](../resources/submission.md) object.|
|[Get submission](../api/submission-get.md)|[submission](../resources/submission.md)|Read the properties and relationships of a [submission](../resources/submission.md) object.|
|[Update submission](../api/submission-update.md)|[submission](../resources/submission.md)|Update the properties of a [submission](../resources/submission.md) object.|
|[Delete submission](../api/submission-delete.md)|None|Deletes a [submission](../resources/submission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description**. The possible values are: `user`, `admin`, `unknownFutureValue`.|
|contentType|submissionContentType|**TODO: Add Description**. The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|reason|submissionReason|**TODO: Add Description**. The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description**|
|status|submissionStatus|**TODO: Add Description**. The possible values are: `pending`, `completed`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.submission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.submission",
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
  }
}
```

