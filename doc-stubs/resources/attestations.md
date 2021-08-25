---
title: "attestations resource type"
description: "Describes all required self-issued, IdToken, and presentation attestations."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# attestations resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Describes all required self-issued, IdToken, and presentation attestations.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|idTokens|[idTokenAttestations](../resources/idtokenattestations.md) collection|Describes attestation to map from an IdToken.|
|presentations|[presentationAttestations](../resources/presentationattestations.md) collection|Describes attestation to map from a Verifiable Presentation.|
|selfIssued|[selfIssuedAttestations](../resources/selfissuedattestations.md)|Describes all the input self-issued attestations.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.attestations"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.attestations",
  "selfIssued": {
    "@odata.type": "microsoft.graph.selfIssuedAttestations"
  },
  "idTokens": [
    {
      "@odata.type": "microsoft.graph.idTokenAttestations"
    }
  ],
  "presentations": [
    {
      "@odata.type": "microsoft.graph.presentationAttestations"
    }
  ]
}
```

