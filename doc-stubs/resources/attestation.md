---
title: "attestation resource type"
description: "Base input attestation."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# attestation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base input attestation.


Inherits from [claim](../resources/claim.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|claims|[inputClaim](../resources/inputclaim.md) collection|Verifiable Credential claims required in the input attestations.|
|encrypted|Boolean|Whether to encrypt this input attestation.|
|required|Boolean|Whether this claim is required. Inherited from [claim](../resources/claim.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.attestation"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.attestation",
  "required": "Boolean",
  "encrypted": "Boolean",
  "claims": [
    {
      "@odata.type": "microsoft.graph.inputClaim"
    }
  ]
}
```

