---
title: "input resource type"
description: "Describes the Verifiable Credential input attestations."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# input resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Describes the Verifiable Credential input attestations.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|attestations|[attestations](../resources/attestations.md)|Describes all required self-issued, IdToken, and presentation attestations.|
|credentialIssuer|String|Full URL of issuance endpoint for this contract.|
|id|String|Identifies the input. Always set to "input".|
|issuer|String|DID of the Verifiable Credential issuer.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.input"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.input",
  "id": "String (identifier)",
  "credentialIssuer": "String",
  "issuer": "String",
  "attestations": {
    "@odata.type": "microsoft.graph.attestations"
  }
}
```

