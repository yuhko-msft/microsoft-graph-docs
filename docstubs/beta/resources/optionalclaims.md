---
title: "optionalClaims resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# optionalClaims resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property    | Type                                                      | Description |
| :---------- | :-------------------------------------------------------- | :---------- |
| accessToken | [optionalClaim](../resources/optionalclaim.md) collection |             |
| idToken     | [optionalClaim](../resources/optionalclaim.md) collection |             |
| saml2Token  | [optionalClaim](../resources/optionalclaim.md) collection |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.optionalClaims",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.optionalClaims",
  "accessToken": [{"@odata.type": "microsoft.graph.optionalClaim"}],
  "idToken": [{"@odata.type": "microsoft.graph.optionalClaim"}],
  "saml2Token": [{"@odata.type": "microsoft.graph.optionalClaim"}]
}
```
