---
title: "userReportRefreshProcess resource type"
description: "The process that will trigger user report refresh process in SDS
An instance of systemProcess created for a tenant"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# userReportRefreshProcess resource type

Namespace: microsoft.graph.industryData

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

The process that will trigger user report refresh process in SDS
An instance of systemProcess created for a tenant


Inherits from [systemProcess](../resources/industrydata-systemprocess.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List userReportRefreshProcesses](../api/industrydata-userreportrefreshprocess-list.md)|[microsoft.graph.industryData.userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md) collection|Get a list of the [userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md) objects and their properties.|
|[Get userReportRefreshProcess](../api/industrydata-userreportrefreshprocess-get.md)|[microsoft.graph.industryData.userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md)|Read the properties and relationships of a [userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md) object.|
|[Update userReportRefreshProcess](../api/industrydata-userreportrefreshprocess-update.md)|[microsoft.graph.industryData.userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md)|Update the properties of a [userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md) object.|
|[Delete userReportRefreshProcess](../api/industrydata-userreportrefreshprocess-delete.md)|None|Deletes a [userReportRefreshProcess](../resources/industrydata-userreportrefreshprocess.md) object.|
|[List runs](../api/industrydata-userreportrefreshprocess-list-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md) collection|Get the run resources from the runs navigation property.|
|[Add run](../api/industrydata-userreportrefreshprocess-post-runs.md)|[microsoft.graph.industryData.run](../resources/industrydata-run.md)|Add runs by posting to the runs collection.|

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
  "@odata.type": "microsoft.graph.industryData.userReportRefreshProcess",
  "baseType": "microsoft.graph.industryData.systemProcess",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.industryData.userReportRefreshProcess",
  "eTag": "String",
  "displayName": "String",
  "readinessStatus": "String"
}
```

