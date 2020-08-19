---
title: "cancelMediaProcessingOperation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# cancelMediaProcessingOperation resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [commsOperation](../resources/commsoperation.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List cancelMediaProcessingOperations](../api/cancelmediaprocessingoperation-list.md)|[cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) collection|Get a list of the [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) objects and their properties.|
|[Create cancelMediaProcessingOperation](../api/cancelmediaprocessingoperation-create.md)|[cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md)|Create a new [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) object.|
|[Get cancelMediaProcessingOperation](../api/cancelmediaprocessingoperation-get.md)|[cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md)|Read the properties and relationships of a [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) object.|
|[Update cancelMediaProcessingOperation](../api/cancelmediaprocessingoperation-update.md)|[cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md)|Update the properties of a [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) object.|
|[Delete cancelMediaProcessingOperation](../api/cancelmediaprocessingoperation-delete.md)|None|Deletes a [cancelMediaProcessingOperation](../resources/cancelmediaprocessingoperation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|clientContext|String|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|resultInfo|[resultInfo](../resources/resultinfo.md)|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md)|
|status|operationStatus|**TODO: Add Description** Inherited from [commsOperation](../resources/commsoperation.md). Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.cancelMediaProcessingOperation",
  "baseType": "microsoft.graph.commsOperation",
  "openType": true
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.cancelMediaProcessingOperation",
  "id": "String (identifier)",
  "status": "String",
  "clientContext": "String",
  "resultInfo": {
    "@odata.type": "microsoft.graph.resultInfo"
  }
}
```

