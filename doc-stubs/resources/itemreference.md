---
title: "itemReference resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# itemReference resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|driveId|String|**TODO: Add Description**|
|driveType|String|**TODO: Add Description**|
|id|String|**TODO: Add Description**|
|name|String|**TODO: Add Description**|
|parent|[itemReference](../resources/itemreference.md)|**TODO: Add Description**|
|path|String|**TODO: Add Description**|
|shareId|String|**TODO: Add Description**|
|sharepointIds|[sharepointIds](../resources/sharepointids.md)|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.itemReference"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.itemReference",
  "driveId": "String",
  "driveType": "String",
  "id": "String (identifier)",
  "name": "String",
  "parent": {
    "@odata.type": "microsoft.graph.itemReference",
    "id": "String",
    "parent": {
      "@odata.type": "microsoft.graph.itemReference"
    },
    "path": "String",
    "shareId": "String",
    "sharepointIds": {
      "@odata.type": "microsoft.graph.sharepointIds"
    }
  },
  "path": "String",
  "shareId": "String",
  "sharepointIds": {
    "@odata.type": "microsoft.graph.sharepointIds"
  }
}
```

