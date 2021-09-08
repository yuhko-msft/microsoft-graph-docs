---
title: "urlSubmissionRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# urlSubmissionRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [submissionRequest](../resources/submissionrequest.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List urlSubmissionRequests](../api/urlsubmissionrequest-list.md)|[urlSubmissionRequest](../resources/urlsubmissionrequest.md) collection|Get a list of the [urlSubmissionRequest](../resources/urlsubmissionrequest.md) objects and their properties.|
|[Create urlSubmissionRequest](../api/urlsubmissionrequest-create.md)|[urlSubmissionRequest](../resources/urlsubmissionrequest.md)|Create a new [urlSubmissionRequest](../resources/urlsubmissionrequest.md) object.|
|[Get urlSubmissionRequest](../api/urlsubmissionrequest-get.md)|[urlSubmissionRequest](../resources/urlsubmissionrequest.md)|Read the properties and relationships of an [urlSubmissionRequest](../resources/urlsubmissionrequest.md) object.|
|[Update urlSubmissionRequest](../api/urlsubmissionrequest-update.md)|[urlSubmissionRequest](../resources/urlsubmissionrequest.md)|Update the properties of an [urlSubmissionRequest](../resources/urlsubmissionrequest.md) object.|
|[Delete urlSubmissionRequest](../api/urlsubmissionrequest-delete.md)|None|Deletes an [urlSubmissionRequest](../resources/urlsubmissionrequest.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|submissionCategory|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|channel|submissionChannel|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `user`, `admin`, `unknownFutureValue`.|
|contentType|submissionContentType|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `mail`, `url`, `file`, `unknownFutureValue`.|
|createdBy|[submissionUserIdentity](../resources/submissionuseridentity.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|id|String|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|reason|submissionReason|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `shouldBlock`, `shouldAllow`, `undefined`, `unknownFutureValue`.|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md).|
|status|submissionStatus|**TODO: Add Description** Inherited from [submissionRequest](../resources/submissionrequest.md). The possible values are: `pending`, `completed`, `unknownFutureValue`.|
|url|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.urlSubmissionRequest",
  "baseType": "microsoft.graph.submissionRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.urlSubmissionRequest",
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

