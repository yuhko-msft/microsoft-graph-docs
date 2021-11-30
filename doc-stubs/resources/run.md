---
title: "run resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# run resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List runs](../api/run-list.md)|[run](../resources/run.md) collection|Get a list of the [run](../resources/run.md) objects and their properties.|
|[Create run](../api/incomingflow-post-runs.md)|[run](../resources/run.md)|Create a new [run](../resources/run.md) object.|
|[Get run](../api/run-get.md)|[run](../resources/run.md)|Read the properties and relationships of a [run](../resources/run.md) object.|
|[Update run](../api/run-update.md)|[run](../resources/run.md)|Update the properties of a [run](../resources/run.md) object.|
|[Delete run](../api/run-delete.md)|None|Deletes a [run](../resources/run.md) object.|
|[List runProcess](../api/run-list-process.md)|[runProcess](../resources/runprocess.md) collection|Get the runProcess resources from the process navigation property.|
|[Add runProcess](../api/run-post-process.md)|[runProcess](../resources/runprocess.md)|Add process by posting to the process collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockingError|[publicError](../resources/publicerror.md)|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|statistics|[runStatistics](../resources/runstatistics.md)|**TODO: Add Description**|
|status|runStatus|**TODO: Add Description**. The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[runProcess](../resources/runprocess.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.run",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.run",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "blockingError": {
    "@odata.type": "microsoft.graph.publicError"
  },
  "statistics": {
    "@odata.type": "microsoft.graph.runStatistics"
  }
}
```

