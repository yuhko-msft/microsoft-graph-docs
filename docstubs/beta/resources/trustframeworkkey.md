---
title: "trustFrameworkKey resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# trustFrameworkKey resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property | Type              | Description |
| :------- | :---------------- | :---------- |
| d        | String            |             |
| dp       | String            |             |
| dq       | String            |             |
| e        | String            |             |
| exp      | Int64             |             |
| k        | String            |             |
| kid      | String            |             |
| kty      | String            |             |
| n        | String            |             |
| nbf      | Int64             |             |
| p        | String            |             |
| q        | String            |             |
| qi       | String            |             |
| use      | String            |             |
| x5c      | String collection |             |
| x5t      | String            |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.trustFrameworkKey",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.trustFrameworkKey",
  "d": "String",
  "dp": "String",
  "dq": "String",
  "e": "String",
  "exp": "Int64",
  "k": "String",
  "kid": "String",
  "kty": "String",
  "n": "String",
  "nbf": "Int64",
  "p": "String",
  "q": "String",
  "qi": "String",
  "use": "String",
  "x5c": ["String"],
  "x5t": "String"
}
```
