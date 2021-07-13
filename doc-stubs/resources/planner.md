---
title: "planner resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# planner resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get planner](../api/planner-get.md)|[planner](../resources/planner.md)|Read the properties and relationships of a [planner](../resources/planner.md) object.|
|[Update planner](../api/planner-update.md)|[planner](../resources/planner.md)|Update the properties of a [planner](../resources/planner.md) object.|
|[List buckets](../api/planner-list-buckets.md)|[plannerBucket](../resources/plannerbucket.md) collection|Get the plannerBucket resources from the buckets navigation property.|
|[Create plannerBucket](../api/planner-post-buckets.md)|[plannerBucket](../resources/plannerbucket.md)|Create a new plannerBucket object.|
|[List plans](../api/planner-list-plans.md)|[plannerPlan](../resources/plannerplan.md) collection|Get the plannerPlan resources from the plans navigation property.|
|[Create plannerPlan](../api/planner-post-plans.md)|[plannerPlan](../resources/plannerplan.md)|Create a new plannerPlan object.|
|[List rosters](../api/planner-list-rosters.md)|[plannerRoster](../resources/plannerroster.md) collection|Get the plannerRoster resources from the rosters navigation property.|
|[Create plannerRoster](../api/planner-post-rosters.md)|[plannerRoster](../resources/plannerroster.md)|Create a new plannerRoster object.|
|[List tasks](../api/planner-list-tasks.md)|[plannerTask](../resources/plannertask.md) collection|Get the plannerTask resources from the tasks navigation property.|
|[Create plannerTask](../api/planner-post-tasks.md)|[plannerTask](../resources/plannertask.md)|Create a new plannerTask object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|buckets|[plannerBucket](../resources/plannerbucket.md) collection|**TODO: Add Description**|
|plans|[plannerPlan](../resources/plannerplan.md) collection|**TODO: Add Description**|
|rosters|[plannerRoster](../resources/plannerroster.md) collection|**TODO: Add Description**|
|tasks|[plannerTask](../resources/plannertask.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.planner",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.planner"
}
```

