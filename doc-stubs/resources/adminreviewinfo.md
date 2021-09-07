---
title: "adminReviewInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# adminReviewInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|reviewBy|String|**TODO: Add Description**|
|reviewed|Boolean|**TODO: Add Description**|
|reviewResult|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`.|
|reviewTime|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.adminReviewInfo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.adminReviewInfo",
  "reviewed": "Boolean",
  "reviewTime": "String",
  "reviewResult": "String",
  "reviewBy": "String"
}
```

