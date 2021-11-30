---
title: "runProcess resource type"
description: "Base class for all processes that the underlying scheduler executes in a run."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# runProcess resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base class for all processes that the underlying scheduler executes in a run.
This is an abstract type.


Inherits from [mutableEntity](../resources/mutableentity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List runProcesses](../api/runprocess-list.md)|[runProcess](../resources/runprocess.md) collection|Get a list of the [runProcess](../resources/runprocess.md) objects and their properties.|
|[Create runProcess](../api/run-post-process.md)|[runProcess](../resources/runprocess.md)|Create a new [runProcess](../resources/runprocess.md) object.|
|[Get runProcess](../api/runprocess-get.md)|[runProcess](../resources/runprocess.md)|Read the properties and relationships of a [runProcess](../resources/runprocess.md) object.|
|[Update runProcess](../api/runprocess-update.md)|[runProcess](../resources/runprocess.md)|Update the properties of a [runProcess](../resources/runprocess.md) object.|
|[Delete runProcess](../api/runprocess-delete.md)|None|Deletes a [runProcess](../resources/runprocess.md) object.|
|[List runs](../api/runprocess-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/runprocess-post-runs.md)|[run](../resources/run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/mutableentity.md).|
|readinessStatus|readinessStatus|**TODO: Add Description**. The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[run](../resources/run.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.runProcess",
  "baseType": "microsoft.industryData.mutableEntity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.runProcess",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

