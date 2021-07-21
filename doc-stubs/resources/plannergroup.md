---
title: "plannerGroup resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# plannerGroup resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List plannerGroups](../api/plannergroup-list.md)|[plannerGroup](../resources/plannergroup.md) collection|Get a list of the [plannerGroup](../resources/plannergroup.md) objects and their properties.|
|[Create plannerGroup](../api/plannergroup-create.md)|[plannerGroup](../resources/plannergroup.md)|Create a new [plannerGroup](../resources/plannergroup.md) object.|
|[Get plannerGroup](../api/plannergroup-get.md)|[plannerGroup](../resources/plannergroup.md)|Read the properties and relationships of a [plannerGroup](../resources/plannergroup.md) object.|
|[Update plannerGroup](../api/plannergroup-update.md)|[plannerGroup](../resources/plannergroup.md)|Update the properties of a [plannerGroup](../resources/plannergroup.md) object.|
|[Delete plannerGroup](../api/plannergroup-delete.md)|None|Deletes a [plannerGroup](../resources/plannergroup.md) object.|
|[List plans](../api/plannergroup-list-plans.md)|[plannerPlan](../resources/plannerplan.md) collection|Get the plannerPlan resources from the plans navigation property.|
|[Add plannerPlan](../api/plannergroup-post-plans.md)|[plannerPlan](../resources/plannerplan.md)|Add plans by posting to the plans collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md).|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|plans|[plannerPlan](../resources/plannerplan.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.plannerGroup",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.plannerGroup",
  "id": "String (identifier)"
}
```

