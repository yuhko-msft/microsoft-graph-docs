---
title: "physicalOfficeAddress resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# physicalOfficeAddress resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property        | Type   | Description |
| :-------------- | :----- | :---------- |
| city            | String |             |
| countryOrRegion | String |             |
| officeLocation  | String |             |
| postalCode      | String |             |
| state           | String |             |
| street          | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.physicalOfficeAddress",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.physicalOfficeAddress",
  "city": "String",
  "countryOrRegion": "String",
  "officeLocation": "String",
  "postalCode": "String",
  "state": "String",
  "street": "String"
}
```
