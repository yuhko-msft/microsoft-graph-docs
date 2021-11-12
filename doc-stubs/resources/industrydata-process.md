---
title: "process resource type"
description: "Base class for all processes that the underlying scheduler executes in a run."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# process resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base class for all processes that the underlying scheduler executes in a run.
This is an abstract type.


Inherits from [mutableEntity](../resources/industrydata-mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List processes](../api/industrydata-process-list.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md) collection|Get a list of the [process](../resources/industrydata-process.md) objects and their properties.|
|[Create process](../api/industrydata-run-post-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md)|Create a new [process](../resources/industrydata-process.md) object.|
|[Get process](../api/industrydata-process-get.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md)|Read the properties and relationships of a [process](../resources/industrydata-process.md) object.|
|[Update process](../api/industrydata-process-update.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md)|Update the properties of a [process](../resources/industrydata-process.md) object.|
|[Delete process](../api/industrydata-process-delete.md)|None|Deletes a [process](../resources/industrydata-process.md) object.|
|[List runs](../api/industrydata-process-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-process-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process.|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time.|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.process",
  "baseType": "microsoft.graph.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.process",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

