---
title: "downloadOperation resource type"
description: "This entity represents the asynchronous operation results from any operation that downloads content."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# downloadOperation resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity represents the asynchronous operation results from any operation that downloads content.


Inherits from [longRunningOperation](../resources/industrydata-longrunningoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List downloadOperations](../api/industrydata-downloadoperation-list.md)|[microsoft.graph.industryData.downloadOperation](../resources/industrydata-downloadoperation.md) collection|Get a list of the [downloadOperation](../resources/industrydata-downloadoperation.md) objects and their properties.|
|[Get downloadOperation](../api/industrydata-downloadoperation-get.md)|[microsoft.graph.industryData.downloadOperation](../resources/industrydata-downloadoperation.md)|Read the properties and relationships of a [downloadOperation](../resources/industrydata-downloadoperation.md) object.|
|[Update downloadOperation](../api/industrydata-downloadoperation-update.md)|[microsoft.graph.industryData.downloadOperation](../resources/industrydata-downloadoperation.md)|Update the properties of a [downloadOperation](../resources/industrydata-downloadoperation.md) object.|
|[Delete downloadOperation](../api/industrydata-downloadoperation-delete.md)|None|Deletes a [downloadOperation](../resources/industrydata-downloadoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|resourceContent|Stream|Url to retrieve the downloaded content.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.downloadOperation",
  "baseType": "microsoft.graph.longRunningOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.downloadOperation",
  "resourceContent": "Stream"
}
```

