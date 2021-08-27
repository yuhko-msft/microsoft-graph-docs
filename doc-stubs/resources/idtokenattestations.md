---
title: "idTokenAttestations resource type"
description: "Describes attestation to map from an IdToken."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# idTokenAttestations resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Describes attestation to map from an IdToken.


Inherits from [trustedAttestation](../resources/trustedattestation.md).

## Properties
|Property|Type|Description|
|:---|:---|:---|
|claims|[inputClaim](../resources/inputclaim.md) collection|Verifiable Credential claims required in the input attestations. Inherited from [attestation](../resources/attestation.md).|
|client_id|String|OIDC client ID.|
|configuration|String|Full URL of OIDC configuration endpoint.|
|encrypted|Boolean|Whether to encrypt this input attestation. Inherited from [attestation](../resources/attestation.md).|
|id|String|Full URL of OIDC configuration endpoint.|
|issuers|[trustedIssuer](../resources/trustedissuer.md) collection|List of all trusted issuers. Inherited from [trustedAttestation](../resources/trustedattestation.md).|
|redirect_uri|String|OIDC redirect URI.|
|required|Boolean|Whether this claim is required. Inherited from [claim](../resources/claim.md).|
|scope|String|OIDC scope.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.idTokenAttestations"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.idTokenAttestations",
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
  "configuration": "String",
  "client_id": "String",
  "redirect_uri": "String",
  "scope": "String"
}
```

