---
title: "exchangeAdmin resource type"
description: "Entity that acts as a container for administrator functionality."
author: "rsuven"
ms.localizationpriority: medium
ms.prod: "security"
doc_type: resourcePageType
---

# exchangeAdmin resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Entity that acts as a container for administrator functionality in Exchange Online.

## Properties
None.

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
| messageTraces | [messageTrace](messagetrace.md) collection | Basic information about one or more email messages as they flow through their Exchange Online organization. Read-only. |


## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.exchangeAdmin",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.exchangeAdmin"
}
```