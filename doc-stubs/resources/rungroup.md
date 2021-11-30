---
title: "runGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# runGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [run](../resources/run.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List runGroups](../api/rungroup-list.md)|[runGroup](../resources/rungroup.md) collection|Get a list of the [runGroup](../resources/rungroup.md) objects and their properties.|
|[Create runGroup](../api/industrydatahub-post-rungroups.md)|[runGroup](../resources/rungroup.md)|Create a new [runGroup](../resources/rungroup.md) object.|
|[Get runGroup](../api/rungroup-get.md)|[runGroup](../resources/rungroup.md)|Read the properties and relationships of a [runGroup](../resources/rungroup.md) object.|
|[Update runGroup](../api/rungroup-update.md)|[runGroup](../resources/rungroup.md)|Update the properties of a [runGroup](../resources/rungroup.md) object.|
|[Delete runGroup](../api/rungroup-delete.md)|None|Deletes a [runGroup](../resources/rungroup.md) object.|
|[List runProcess](../api/rungroup-list-process.md)|[runProcess](../resources/runprocess.md) collection|Get the runProcess resources from the process navigation property.|
|[Add runProcess](../api/rungroup-post-process.md)|[runProcess](../resources/runprocess.md)|Add process by posting to the process collection.|
|[List runs](../api/rungroup-list-runs.md)|[run](../resources/run.md) collection|Get the run resources from the runs navigation property.|
|[Create run](../api/rungroup-post-runs.md)|[run](../resources/run.md)|Create a new run object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|blockingError|[publicError](../resources/publicerror.md)|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|displayName|String|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|endDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|startDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|statistics|[runStatistics](../resources/runstatistics.md)|**TODO: Add Description** Inherited from [run](../resources/run.md).|
|status|runStatus|**TODO: Add Description** Inherited from [run](../resources/run.md). The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[runProcess](../resources/runprocess.md)|**TODO: Add Description** Inherited from [run](../resources/run.md)|
|runs|[run](../resources/run.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.runGroup",
  "baseType": "microsoft.industryData.run",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.runGroup",
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

