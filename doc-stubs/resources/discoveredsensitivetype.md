---
title: "discoveredSensitiveType resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# discoveredSensitiveType resource type

Namespace: microsoft.graph



**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|classificationAttributes|[classificationAttribute](../resources/classificationattribute.md) collection|**TODO: Add Description**|
|confidence|Int32|**TODO: Add Description**|
|count|Int32|**TODO: Add Description**|
|id|Guid|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.discoveredSensitiveType"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.discoveredSensitiveType",
  "classificationAttributes": [
    {
      "@odata.type": "microsoft.graph.classificationAttribute"
    }
  ],
  "confidence": "Integer",
  "count": "Integer",
  "id": "String (identifier)"
}
```

