---
title: "tablInfo resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# tablInfo resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**

## Properties
|Property|Type|Description|
|:---|:---|:---|
|action|tablAction|**TODO: Add Description**. The possible values are: `allow`, `block`, `unknownFutureValue`.|
|results|[tablEntryResult](../resources/tablentryresult.md) collection|**TODO: Add Description**|
|status|tablStatus|**TODO: Add Description**. The possible values are: `pending`, `completed`, `unknownFutureValue`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.tablInfo"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.tablInfo",
  "status": "String",
  "action": "String",
  "results": [
    {
      "@odata.type": "microsoft.graph.tablEntryResult"
    }
  ]
}
```

