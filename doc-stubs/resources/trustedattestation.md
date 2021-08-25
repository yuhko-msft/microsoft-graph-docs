---
title: "trustedAttestation resource type"
description: "Base attestation that needs to be trusted."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# trustedAttestation resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Base attestation that needs to be trusted.


Inherits from [attestation](../resources/attestation.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|claims|[inputClaim](../resources/inputclaim.md) collection|Verifiable Credential claims required in the input attestations. Inherited from [attestation](../resources/attestation.md).|
|encrypted|Boolean|Whether to encrypt this input attestation. Inherited from [attestation](../resources/attestation.md).|
|issuers|[trustedIssuer](../resources/trustedissuer.md) collection|List of all trusted issuers.|
|required|Boolean|Whether this claim is required. Inherited from [claim](../resources/claim.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.trustedAttestation"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.trustedAttestation",
  "required": "Boolean",
  "encrypted": "Boolean",
  "claims": [
    {
      "@odata.type": "microsoft.graph.inputClaim"
    }
  ],
  "issuers": [
    {
      "@odata.type": "microsoft.graph.trustedIssuer"
    }
  ]
}
```

