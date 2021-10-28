---
title: "teamworkHierarchyNode resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# teamworkHierarchyNode resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List teamworkHierarchyNodes](../api/teamworkhierarchynode-list.md)|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md) collection|Get a list of the [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) objects and their properties.|
|[Create teamworkHierarchyNode](../api/teamworkhierarchy-post-nodes.md)|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md)|Create a new [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object.|
|[Get teamworkHierarchyNode](../api/teamworkhierarchynode-get.md)|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md)|Read the properties and relationships of a [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object.|
|[Update teamworkHierarchyNode](../api/teamworkhierarchynode-update.md)|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md)|Update the properties of a [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object.|
|[Delete teamworkHierarchyNode](../api/teamworkhierarchynode-delete.md)|None|Deletes a [teamworkHierarchyNode](../resources/teamworkhierarchynode.md) object.|
|[getDescendants](../api/teamworkhierarchynode-getdescendants.md)|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md) collection|Gets all descendants for given team id.|
|[getAncestors](../api/teamworkhierarchynode-getancestors.md)|[teamworkHierarchyNode](../resources/teamworkhierarchynode.md) collection|Gets all the ancestors for given team id.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|attributes|String collection|**TODO: Add Description**|
|childNodesUrls|String collection|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|groupId|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|parentNodesUrls|String collection|**TODO: Add Description**|
|teamId|String|**TODO: Add Description**|
|topicsToChannelMap|String|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.teamworkHierarchyNode",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.teamworkHierarchyNode",
  "id": "String (identifier)",
  "displayName": "String",
  "teamId": "String",
  "groupId": "String",
  "parentNodesUrls": [
    "String"
  ],
  "attributes": [
    "String"
  ],
  "topicsToChannelMap": "String",
  "childNodesUrls": [
    "String"
  ]
}
```

