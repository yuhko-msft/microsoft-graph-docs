---
title: "physicalAddress resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# physicalAddress resource type

Namespace: microsoft.graph

## Properties

| Property        | Type   | Description |
| :-------------- | :----- | :---------- |
| city            | String |             |
| countryOrRegion | String |             |
| postalCode      | String |             |
| state           | String |             |
| street          | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.physicalAddress",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.physicalAddress",
  "city": "String",
  "countryOrRegion": "String",
  "postalCode": "String",
  "state": "String",
  "street": "String"
}
```
