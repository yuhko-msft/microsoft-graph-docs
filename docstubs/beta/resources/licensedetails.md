---
title: "licenseDetails resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# licenseDetails resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                   | Return Type                                    | Description                                                   |
| :------------------------------------------------------- | :--------------------------------------------- | :------------------------------------------------------------ |
| [List licenseDetails](../api/licensedetails-list.md)     | [licenseDetails](licenseDetails.md) collection | List properties and relationships of a licenseDetails object. |
| [Create licenseDetails](../api/licensedetails-create.md) | [licenseDetails](licenseDetails.md)            | Create a new licenseDetails object.                           |
| [Get licenseDetails](../api/licensedetails-get.md)       | [licenseDetails](licenseDetails.md)            | Read properties and relationships of a licenseDetails object. |
| [Update licenseDetails](../api/licensedetails-update.md) | [licenseDetails](licenseDetails.md)            | Update the properties of a licenseDetails object.             |
| [Delete licenseDetails](../api/licensedetails-delete.md) |                                                | Delete a licenseDetails object.                               |

## Properties

| Property      | Type                                                          | Description |
| :------------ | :------------------------------------------------------------ | :---------- |
| id            | String                                                        | Read-only.  |
| servicePlans  | [servicePlanInfo](../resources/serviceplaninfo.md) collection |             |
| skuId         | Guid                                                          |             |
| skuPartNumber | String                                                        |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.licenseDetails",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.licenseDetails",
  "id": "String (identifier)",
  "servicePlans": [{"@odata.type": "microsoft.graph.servicePlanInfo"}],
  "skuId": "Guid",
  "skuPartNumber": "String"
}
```
