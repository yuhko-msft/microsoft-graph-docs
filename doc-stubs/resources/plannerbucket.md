---
title: "plannerBucket resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# plannerBucket resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [plannerDelta](../resources/plannerdelta.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List plannerBuckets](../api/plannerbucket-list.md)|[plannerBucket](../resources/plannerbucket.md) collection|Get a list of the [plannerBucket](../resources/plannerbucket.md) objects and their properties.|
|[Create plannerBucket](../api/plannerbucket-create.md)|[plannerBucket](../resources/plannerbucket.md)|Create a new [plannerBucket](../resources/plannerbucket.md) object.|
|[Get plannerBucket](../api/plannerbucket-get.md)|[plannerBucket](../resources/plannerbucket.md)|Read the properties and relationships of a [plannerBucket](../resources/plannerbucket.md) object.|
|[Update plannerBucket](../api/plannerbucket-update.md)|[plannerBucket](../resources/plannerbucket.md)|Update the properties of a [plannerBucket](../resources/plannerbucket.md) object.|
|[Delete plannerBucket](../api/plannerbucket-delete.md)|None|Deletes a [plannerBucket](../resources/plannerbucket.md) object.|
|[List tasks](../api/plannerbucket-list-tasks.md)|[plannerTask](../resources/plannertask.md) collection|Get the plannerTask resources from the tasks navigation property.|
|[Add plannerTask](../api/plannerbucket-post-tasks.md)|[plannerTask](../resources/plannertask.md)|Add tasks by posting to the tasks collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|
|name|String|**TODO: Add Description**|
|orderHint|String|**TODO: Add Description**|
|planId|String|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|tasks|[plannerTask](../resources/plannertask.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.plannerBucket",
  "baseType": "microsoft.graph.plannerDelta",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.plannerBucket",
  "id": "String (identifier)",
  "name": "String",
  "orderHint": "String",
  "planId": "String"
}
```

