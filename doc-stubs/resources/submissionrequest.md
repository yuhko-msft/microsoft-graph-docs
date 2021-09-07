---
title: "submissionRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# submissionRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List submissionRequests](../api/submissionrequest-list.md)|[submissionRequest](../resources/submissionrequest.md) collection|Get a list of the [submissionRequest](../resources/submissionrequest.md) objects and their properties.|
|[Create submissionRequest](../api/submissionrequest-create.md)|[submissionRequest](../resources/submissionrequest.md)|Create a new [submissionRequest](../resources/submissionrequest.md) object.|
|[Get submissionRequest](../api/submissionrequest-get.md)|[submissionRequest](../resources/submissionrequest.md)|Read the properties and relationships of a [submissionRequest](../resources/submissionrequest.md) object.|
|[Update submissionRequest](../api/submissionrequest-update.md)|[submissionRequest](../resources/submissionrequest.md)|Update the properties of a [submissionRequest](../resources/submissionrequest.md) object.|
|[Delete submissionRequest](../api/submissionrequest-delete.md)|None|Deletes a [submissionRequest](../resources/submissionrequest.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|category|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|channel|submissionChannel|**TODO: Add Description**. The possible values are: `user`, `admin`.|
|contentType|submissionContentType|**TODO: Add Description**. The possible values are: `mail`, `url`, `file`.|
|createdBy|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|reason|submissionReason|**TODO: Add Description**. The possible values are: `shouldBlock`, `shouldUnblock`.|
|result|[submissionResult](../resources/submissionresult.md)|**TODO: Add Description**|
|status|submissionStatus|**TODO: Add Description**. The possible values are: `pending`, `completed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.submissionRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.submissionRequest",
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
  }
}
```

