---
title: "adminReviewRequest resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# adminReviewRequest resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List adminReviewRequests](../api/adminreviewrequest-list.md)|[adminReviewRequest](../resources/adminreviewrequest.md) collection|Get a list of the [adminReviewRequest](../resources/adminreviewrequest.md) objects and their properties.|
|[Create adminReviewRequest](../api/adminreviewrequest-post-adminreviewrequests.md)|[adminReviewRequest](../resources/adminreviewrequest.md)|Create a new [adminReviewRequest](../resources/adminreviewrequest.md) object.|
|[Get adminReviewRequest](../api/adminreviewrequest-get.md)|[adminReviewRequest](../resources/adminreviewrequest.md)|Read the properties and relationships of an [adminReviewRequest](../resources/adminreviewrequest.md) object.|
|[Update adminReviewRequest](../api/adminreviewrequest-update.md)|[adminReviewRequest](../resources/adminreviewrequest.md)|Update the properties of an [adminReviewRequest](../resources/adminreviewrequest.md) object.|
|[Delete adminReviewRequest](../api/adminreviewrequest-delete.md)|None|Deletes an [adminReviewRequest](../resources/adminreviewrequest.md) object.|

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
  "@odata.type": "microsoft.graph.adminReviewRequest",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.adminReviewRequest",
  "submissionId": "String",
  "reviewResult": "String",
  "id": "String (identifier)"
}
```

