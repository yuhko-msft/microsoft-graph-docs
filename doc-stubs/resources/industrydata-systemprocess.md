---
title: "systemProcess resource type"
description: "Abstract class for system level processes
System processes will be consisting of tasks which don't need any tenant or user context"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# systemProcess resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Abstract class for system level processes
System processes will be consisting of tasks which don't need any tenant or user context
This is an abstract type.


Inherits from [process](../resources/industrydata-process.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List systemProcesses](../api/industrydata-systemprocess-list.md)|[microsoft.graph.industryData.systemProcess](../resources/industrydata-systemprocess.md) collection|Get a list of the [systemProcess](../resources/industrydata-systemprocess.md) objects and their properties.|
|[Get systemProcess](../api/industrydata-systemprocess-get.md)|[microsoft.graph.industryData.systemProcess](../resources/industrydata-systemprocess.md)|Read the properties and relationships of a [systemProcess](../resources/industrydata-systemprocess.md) object.|
|[Update systemProcess](../api/industrydata-systemprocess-update.md)|[microsoft.graph.industryData.systemProcess](../resources/industrydata-systemprocess.md)|Update the properties of a [systemProcess](../resources/industrydata-systemprocess.md) object.|
|[Delete systemProcess](../api/industrydata-systemprocess-delete.md)|None|Deletes a [systemProcess](../resources/industrydata-systemprocess.md) object.|
|[List runs](../api/industrydata-systemprocess-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-systemprocess-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|Name of the process. Inherited from [process](../resources/industrydata-process.md).|
|eTag|String|Individual eTag for an entity to provide standard web concurrency control. Inherited from [mutableEntity](../resources/industrydata-mutableentity.md).|
|readinessStatus|readinessStatus|The state of the process from creation through to ready to do work. Inherited from [process](../resources/industrydata-process.md). The possible values are: `notReady`, `ready`, `failed`, `deleted`, `expired`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|runs|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|The read-only set of runs that have been executed for this process. Ordered by time. Inherited from [process](../resources/process.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.systemProcess",
  "baseType": "microsoft.graph.industryData.process",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.systemProcess",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

