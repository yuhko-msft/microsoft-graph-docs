---
title: "WhoPlusSearchMatch resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# WhoPlusSearchMatch resource type

Namespace: microsoft.graph.linkedIn

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|matchedTerms|[WhoPlusSearchMatchTerm](../resources/linkedin-whoplussearchmatchterm.md) collection|**TODO: Add Description**|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.linkedIn.WhoPlusSearchMatch"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.linkedIn.WhoPlusSearchMatch",
  "id": "String (identifier)",
  "matchedTerms": [
    {
      "@odata.type": "microsoft.graph.linkedIn.WhoPlusSearchMatchTerm"
    }
  ]
}
```

