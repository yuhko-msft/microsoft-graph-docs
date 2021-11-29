---
title: "oneRosterApiFilter resource type"
description: "Filter for reducing the volume of data imported from a OneRoster-based system."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# oneRosterApiFilter resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Filter for reducing the volume of data imported from a OneRoster-based system.


Inherits from [apiFilter](../resources/apifilter.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|schoolIds|String collection|Only import data from the specified schools.|
|termIds|String collection|Only import data related to the specified terms.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.oneRosterApiFilter"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.oneRosterApiFilter",
  "schoolIds": [
    "String"
  ],
  "termIds": [
    "String"
  ]
}
```

