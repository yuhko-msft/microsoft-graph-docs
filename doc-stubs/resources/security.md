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
|[List adminReviewRequests](../api/security-list-adminreviewrequests.md)|[adminReviewRequest](../resources/adminreviewrequest.md) collection|Get the adminReviewRequest resources from the adminReviewRequests navigation property.|
|[Create adminReviewRequest](../api/security-post-adminreviewrequests.md)|[adminReviewRequest](../resources/adminreviewrequest.md)|Create a new adminReviewRequest object.|
|[List submissionRequests](../api/security-list-submissionrequests.md)|[submissionRequest](../resources/submissionrequest.md) collection|Get the submissionRequest resources from the submissionRequests navigation property.|
|[Create submissionRequest](../api/security-post-submissionrequests.md)|[submissionRequest](../resources/submissionrequest.md)|Create a new submissionRequest object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|placeholder|String|GraML required|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|adminReviewRequests|[adminReviewRequest](../resources/adminreviewrequest.md) collection|**TODO: Add Description**|
|submissionRequests|[submissionRequest](../resources/submissionrequest.md) collection|**TODO: Add Description**|

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

