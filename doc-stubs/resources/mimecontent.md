---
title: "mimeContent resource type"
description: "Contains properties for a generic mime content."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mimeContent resource type

Namespace: microsoft.graph

Contains properties for a generic mime content.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|type|String|Indicates the content mime type.|
|value|Binary|The byte array that contains the actual content.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.mimeContent"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mimeContent",
  "type": "String",
  "value": "Binary"
}
```

