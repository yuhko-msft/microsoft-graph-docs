---
title: "operation resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# operation resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List operations](../api/operation-list.md)|[operation](../resources/operation.md) collection|Get a list of the [operation](../resources/operation.md) objects and their properties.|
|[Create operation](../api/operation-create.md)|[operation](../resources/operation.md)|Create a new [operation](../resources/operation.md) object.|
|[Get operation](../api/operation-get.md)|[operation](../resources/operation.md)|Read the properties and relationships of an [operation](../resources/operation.md) object.|
|[Update operation](../api/operation-update.md)|[operation](../resources/operation.md)|Update the properties of an [operation](../resources/operation.md) object.|
|[Delete operation](../api/operation-delete.md)|None|Deletes an [operation](../resources/operation.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|lastActionDateTime|DateTimeOffset|**TODO: Add Description**|
|status|operationStatus|**TODO: Add Description**. Possible values are: `NotStarted`, `Running`, `Completed`, `Failed`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.operation",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.operation",
  "status": "String",
  "createdDateTime": "String (timestamp)",
  "lastActionDateTime": "String (timestamp)"
}
```

