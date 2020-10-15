---
title: "alternativeSecurityId resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# alternativeSecurityId resource type

Namespace: microsoft.graph

## Properties

| Property         | Type   | Description |
| :--------------- | :----- | :---------- |
| identityProvider | String |             |
| key              | Binary |             |
| type             | Int32  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.alternativeSecurityId",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.alternativeSecurityId",
  "identityProvider": "String",
  "key": "Binary",
  "type": "Int32"
}
```
