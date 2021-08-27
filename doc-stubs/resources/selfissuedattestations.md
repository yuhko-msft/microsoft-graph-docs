---
title: "selfIssuedAttestations resource type"
description: "Describes all the input self-issued attestations."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# selfIssuedAttestations resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Describes all the input self-issued attestations.


Inherits from [attestation](../resources/attestation.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|claims|[inputClaim](../resources/inputclaim.md) collection|Verifiable Credential claims required in the input attestations. Inherited from [attestation](../resources/attestation.md).|
|encrypted|Boolean|Whether to encrypt this input attestation. Inherited from [attestation](../resources/attestation.md).|
|id|String|Identifies the self-issued attestations. Always set to "selfAttested".|
|required|Boolean|Whether this claim is required. Inherited from [claim](../resources/claim.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.selfIssuedAttestations"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.selfIssuedAttestations",
  "required": "Boolean",
  "encrypted": "Boolean",
  "claims": [
    {
      "@odata.type": "microsoft.graph.inputClaim"
    }
  ],
  "id": "String (identifier)"
}
```

