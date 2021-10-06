---
title: "run resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# run resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**
This is an abstract type.

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List runs](../api/industrydata-run-list.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get a list of the [run](../resources/industrydata-run.md) objects and their properties.|
|[Create run](../api/industrydata-run-create.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Create a new [run](../resources/industrydata-run.md) object.|
|[Get run](../api/industrydata-run-get.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Read the properties and relationships of a [run](../resources/industrydata-run.md) object.|
|[Update run](../api/industrydata-run-update.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Update the properties of a [run](../resources/industrydata-run.md) object.|
|[Delete run](../api/industrydata-run-delete.md)|None|Deletes a [run](../resources/industrydata-run.md) object.|
|[List process](../api/industrydata-run-list-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md) collection|Get the process resources from the process navigation property.|
|[Add process](../api/industrydata-run-post-process.md)|[microsoft.graph.industryData.process](../resources/industrydata-process.md)|Add process by posting to the process collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|endDateTime|DateTimeOffset|**TODO: Add Description**|
|startDateTime|DateTimeOffset|**TODO: Add Description**|
|statistics|[microsoft.graph.industryData.runStatistics](../resources/industrydata-runstatistics.md)|**TODO: Add Description**|
|status|runStatus|**TODO: Add Description**. The possible values are: `running`, `failed`, `completed`, `completedWithErrors`, `completedWithWarnings`, `unknownFutureValue`.|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|process|[process](../resources/industrydata-process.md)|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.industryData.run",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.run",
  "displayName": "String",
  "startDateTime": "String (timestamp)",
  "endDateTime": "String (timestamp)",
  "status": "String",
  "statistics": {
    "@odata.type": "microsoft.graph.industryData.runStatistics"
  }
}
```

