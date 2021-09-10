---
title: "security resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# security resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List securities](../api/security-list.md)|[security](../resources/security.md) collection|Get a list of the [security](../resources/security.md) objects and their properties.|
|[Create security](../api/security-create.md)|[security](../resources/security.md)|Create a new [security](../resources/security.md) object.|
|[Get security](../api/security-get.md)|[security](../resources/security.md)|Read the properties and relationships of a [security](../resources/security.md) object.|
|[Update security](../api/security-update.md)|[security](../resources/security.md)|Update the properties of a [security](../resources/security.md) object.|
|[Delete security](../api/security-delete.md)|None|Deletes a [security](../resources/security.md) object.|
|[List adminReviews](../api/security-list-adminreviews.md)|[adminReview](../resources/adminreview.md) collection|Get the adminReview resources from the adminReviews navigation property.|
|[Create adminReview](../api/security-post-adminreviews.md)|[adminReview](../resources/adminreview.md)|Create a new adminReview object.|
|[List submissions](../api/security-list-submissions.md)|[submission](../resources/submission.md) collection|Get the submission resources from the submissions navigation property.|
|[Create submission](../api/security-post-submissions.md)|[submission](../resources/submission.md)|Create a new submission object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|placeholder|String|GraML required|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|adminReviews|[adminReview](../resources/adminreview.md) collection|**TODO: Add Description**|
|submissions|[submission](../resources/submission.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.security",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.security",
  "placeholder": "String"
}
```

