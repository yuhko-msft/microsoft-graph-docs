---
title: "trustedIssuer resource type"
description: "Describes an issuer that can be trusted."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# trustedIssuer resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Describes an issuer that can be trusted.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|iss|String|Identifies the trusted issuer e.g. DID, URI.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.trustedIssuer"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.trustedIssuer",
  "iss": "String"
}
```

