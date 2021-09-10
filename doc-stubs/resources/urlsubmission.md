---
title: "urlSubmission resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# urlSubmission resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [submission](../resources/submission.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List urlSubmissions](../api/urlsubmission-list.md)|[urlSubmission](../resources/urlsubmission.md) collection|Get a list of the [urlSubmission](../resources/urlsubmission.md) objects and their properties.|
|[Create urlSubmission](../api/urlsubmission-create.md)|[urlSubmission](../resources/urlsubmission.md)|Create a new [urlSubmission](../resources/urlsubmission.md) object.|
|[Get urlSubmission](../api/urlsubmission-get.md)|[urlSubmission](../resources/urlsubmission.md)|Read the properties and relationships of an [urlSubmission](../resources/urlsubmission.md) object.|
|[Update urlSubmission](../api/urlsubmission-update.md)|[urlSubmission](../resources/urlsubmission.md)|Update the properties of an [urlSubmission](../resources/urlsubmission.md) object.|
|[Delete urlSubmission](../api/urlsubmission-delete.md)|None|Deletes an [urlSubmission](../resources/urlsubmission.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|submissionCategory|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `user`, `admin`, `unknownFutureValue`.|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|id|String|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|reason|submissionReason|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submission](../resources/submission.md).|
|status|submissionStatus|**TODO: Add Description** Inherited from [submission](../resources/submission.md). The possible values are: `pending`, `completed`, `unknownFutureValue`.|
|url|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.urlSubmission",
  "baseType": "microsoft.graph.submission",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.urlSubmission",
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
  "url": "String"
}
```

