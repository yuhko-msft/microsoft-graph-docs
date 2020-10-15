---
title: "subscribedSku resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# subscribedSku resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                 | Return Type                                  | Description                                                  |
| :----------------------------------------------------- | :------------------------------------------- | :----------------------------------------------------------- |
| [List subscribedSku](../api/subscribedsku-list.md)     | [subscribedSku](subscribedSku.md) collection | List properties and relationships of a subscribedSku object. |
| [Create subscribedSku](../api/subscribedsku-create.md) | [subscribedSku](subscribedSku.md)            | Create a new subscribedSku object.                           |
| [Get subscribedSku](../api/subscribedsku-get.md)       | [subscribedSku](subscribedSku.md)            | Read properties and relationships of a subscribedSku object. |
| [Update subscribedSku](../api/subscribedsku-update.md) | [subscribedSku](subscribedSku.md)            | Update the properties of a subscribedSku object.             |
| [Delete subscribedSku](../api/subscribedsku-delete.md) |                                              | Delete a subscribedSku object.                               |

## Properties

| Property         | Type                                                          | Description |
| :--------------- | :------------------------------------------------------------ | :---------- |
| appliesTo        | String                                                        |             |
| capabilityStatus | String                                                        |             |
| consumedUnits    | Int32                                                         |             |
| id               | String                                                        | Read-only.  |
| prepaidUnits     | [licenseUnitsDetail](../resources/licenseunitsdetail.md)      |             |
| servicePlans     | [servicePlanInfo](../resources/serviceplaninfo.md) collection |             |
| skuId            | Guid                                                          |             |
| skuPartNumber    | String                                                        |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.subscribedSku",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.subscribedSku",
  "appliesTo": "String",
  "capabilityStatus": "String",
  "consumedUnits": "Int32",
  "id": "String (identifier)",
  "prepaidUnits": {"@odata.type": "microsoft.graph.licenseUnitsDetail"},
  "servicePlans": [{"@odata.type": "microsoft.graph.servicePlanInfo"}],
  "skuId": "Guid",
  "skuPartNumber": "String"
}
```
