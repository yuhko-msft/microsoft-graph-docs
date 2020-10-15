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

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property        | Type   | Description |
| :-------------- | :----- | :---------- |
| city            | String |             |
| countryOrRegion | String |             |
| postOfficeBox   | String |             |
| postalCode      | String |             |
| state           | String |             |
| street          | String |             |
| type            | String |             |

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
  "postOfficeBox": "String",
  "postalCode": "String",
  "state": "String",
  "street": "String",
  "type": "unknown | home | business | other"
}
```
