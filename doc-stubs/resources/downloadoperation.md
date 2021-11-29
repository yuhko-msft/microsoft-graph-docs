---
title: "downloadOperation resource type"
description: "This entity represents the asynchronous operation results from any operation that downloads content."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# downloadOperation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

This entity represents the asynchronous operation results from any operation that downloads content.


Inherits from [longRunningOperation](../resources/longrunningoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List downloadOperations](../api/downloadoperation-list.md)|[downloadOperation](../resources/downloadoperation.md) collection|Get a list of the [downloadOperation](../resources/downloadoperation.md) objects and their properties.|
|[Get downloadOperation](../api/downloadoperation-get.md)|[downloadOperation](../resources/downloadoperation.md)|Read the properties and relationships of a [downloadOperation](../resources/downloadoperation.md) object.|
|[Update downloadOperation](../api/downloadoperation-update.md)|[downloadOperation](../resources/downloadoperation.md)|Update the properties of a [downloadOperation](../resources/downloadoperation.md) object.|
|[Delete downloadOperation](../api/downloadoperation-delete.md)|None|Deletes a [downloadOperation](../resources/downloadoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|id|String|Unique identifier for the entity. Read-only. Inherited from [entity](../resources/entity.md).|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|resourceContent|Stream|Url to retrieve the downloaded content.|
|resourceLocation|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|
|status|longRunningOperationStatus|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md). The possible values are: `notstarted`, `running`, `succeeded`, `failed`.|
|statusDetail|String|**TODO: Add Description** Inherited from [longRunningOperation](../resources/longrunningoperation.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.downloadOperation",
  "baseType": "microsoft.graph.longRunningOperation",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.downloadOperation",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "lastActionDateTime": "String (timestamp)",
  "status": "String",
  "statusDetail": "String",
  "resourceLocation": "String",
  "resourceContent": "Stream"
}
```

