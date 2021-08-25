---
title: "inputClaim resource type"
description: "Base input claim."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# inputClaim resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base input claim.


Inherits from [claim](../resources/claim.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|claim|String|Describes the name or the location of the input claim value. Can be JSONPath.|
|indexed|Boolean|Whether this claim should be used to index the Verifiable Credential.|
|required|Boolean|Whether this claim is required. Inherited from [claim](../resources/claim.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.inputClaim"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.inputClaim",
  "required": "Boolean",
  "indexed": "Boolean",
  "claim": "String"
}
```

