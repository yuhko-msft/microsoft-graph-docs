---
title: "adminReview resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# adminReview resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List adminReviews](../api/adminreview-list.md)|[adminReview](../resources/adminreview.md) collection|Get a list of the [adminReview](../resources/adminreview.md) objects and their properties.|
|[Create adminReview](../api/adminreview-post-adminreviews.md)|[adminReview](../resources/adminreview.md)|Create a new [adminReview](../resources/adminreview.md) object.|
|[Get adminReview](../api/adminreview-get.md)|[adminReview](../resources/adminreview.md)|Read the properties and relationships of an [adminReview](../resources/adminreview.md) object.|
|[Update adminReview](../api/adminreview-update.md)|[adminReview](../resources/adminreview.md)|Update the properties of an [adminReview](../resources/adminreview.md) object.|
|[Delete adminReview](../api/adminreview-delete.md)|None|Deletes an [adminReview](../resources/adminreview.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|reviewResult|submissionCategory|**TODO: Add Description**. The possible values are: `notJunk`, `spam`, `phishing`, `malware`, `unknownFutureValue`.|
|submissionId|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.adminReview",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.adminReview",
  "submissionId": "String",
  "reviewResult": "String",
  "id": "String (identifier)"
}
```

