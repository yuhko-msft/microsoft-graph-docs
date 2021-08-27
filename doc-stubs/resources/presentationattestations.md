---
title: "presentationAttestations resource type"
description: "Describes attestation to map from a Verifiable Presentation."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# presentationAttestations resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Describes attestation to map from a Verifiable Presentation.


Inherits from [trustedAttestation](../resources/trustedattestation.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|claims|[inputClaim](../resources/inputclaim.md) collection|Verifiable Credential claims required in the input attestations. Inherited from [attestation](../resources/attestation.md).|
|contracts|String collection|Full URL of trusted Verifiable Credential contracts.|
|credentialType|String|Verifiable Credential type.|
|encrypted|Boolean|Whether to encrypt this input attestation. Inherited from [attestation](../resources/attestation.md).|
|id|String|Verifiable Credential type.|
|issuers|[trustedIssuer](../resources/trustedissuer.md) collection|List of all trusted issuers. Inherited from [trustedAttestation](../resources/trustedattestation.md).|
|required|Boolean|Whether this claim is required. Inherited from [claim](../resources/claim.md).|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.presentationAttestations"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.presentationAttestations",
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
  ],
  "id": "String (identifier)",
  "credentialType": "String",
  "contracts": [
    "String"
  ]
}
```

