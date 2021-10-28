---
title: "teamworkHierarchy resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkHierarchy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamworkHierarchies](../api/teamworkhierarchy-list.md)|[teamworkHierarchy](../resources/teamworkhierarchy.md) collection|Get a list of the [teamworkHierarchy](../resources/teamworkhierarchy.md) objects and their properties.|
|[Create teamworkHierarchy](../api/teamworkhierarchy-post-hierarchies.md)|[teamworkHierarchy](../resources/teamworkhierarchy.md)|Create a new [teamworkHierarchy](../resources/teamworkhierarchy.md) object.|
|[Get teamworkHierarchy](../api/teamworkhierarchy-get.md)|[teamworkHierarchy](../resources/teamworkhierarchy.md)|Read the properties and relationships of a [teamworkHierarchy](../resources/teamworkhierarchy.md) object.|
|[Update teamworkHierarchy](../api/teamworkhierarchy-update.md)|[teamworkHierarchy](../resources/teamworkhierarchy.md)|Update the properties of a [teamworkHierarchy](../resources/teamworkhierarchy.md) object.|
|[Delete teamworkHierarchy](../api/teamworkhierarchy-delete.md)|None|Deletes a [teamworkHierarchy](../resources/teamworkhierarchy.md) object.|
|[List nodes](../api/teamworkhierarchy-list-nodes.md)|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md) collection|Get the teamworkHierarchyNode resources from the nodes navigation property.|
|[Create teamworkHierarchyNode](../api/teamworkhierarchy-post-nodes.md)|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md)|Create a new teamworkHierarchyNode object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|displayName|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|rootNodesUrls|String collection|**TODO: Add Description**|
|topics|String collection|**TODO: Add Description**|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|nodes|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamworkHierarchy",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkHierarchy",
  "id": "String (identifier)",
  "displayName": "String",
  "rootNodesUrls": [
    "String"
  ],
  "topics": [
    "String"
  ]
}
```

