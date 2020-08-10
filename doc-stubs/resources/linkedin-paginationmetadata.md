---
title: "PaginationMetadata resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# PaginationMetadata resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|continuationToken|String|**TODO: Add Description**|
|count|Int32|**TODO: Add Description**|
|endOfPaging|Boolean|**TODO: Add Description**|
|path|String collection|**TODO: Add Description**|
|start|Int32|**TODO: Add Description**|
|totalCount|Int32|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.PaginationMetadata"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.PaginationMetadata",
  "path": [
    "String"
  ],
  "start": "Integer",
  "count": "Integer",
  "totalCount": "Integer",
  "continuationToken": "String",
  "endOfPaging": "Boolean"
}
```

