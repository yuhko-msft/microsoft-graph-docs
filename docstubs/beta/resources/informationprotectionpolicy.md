---
title: "informationProtectionPolicy resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# informationProtectionPolicy resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                             | Return Type                                                               | Description                                                                    |
| :--------------------------------------------------------------------------------- | :------------------------------------------------------------------------ | :----------------------------------------------------------------------------- |
| [List informationProtectionPolicy](../api/informationprotectionpolicy-list.md)     | [informationProtectionPolicy](informationProtectionPolicy.md) collection  | List properties and relationships of an informationProtectionPolicy object.    |
| [Create informationProtectionPolicy](../api/informationprotectionpolicy-create.md) | [informationProtectionPolicy](informationProtectionPolicy.md)             | Create a new informationProtectionPolicy object.                               |
| [Get informationProtectionPolicy](../api/informationprotectionpolicy-get.md)       | [informationProtectionPolicy](informationProtectionPolicy.md)             | Read properties and relationships of an informationProtectionPolicy object.    |
| [Update informationProtectionPolicy](../api/informationprotectionpolicy-update.md) | [informationProtectionPolicy](informationProtectionPolicy.md)             | Update the properties of an informationProtectionPolicy object.                |
| [Delete informationProtectionPolicy](../api/informationprotectionpolicy-delete.md) |                                                                           | Delete an informationProtectionPolicy object.                                  |
| [List labels](../api/informationprotectionpolicy-list-labels.md)                   | [informationProtectionLabel](../resources/-informationprotectionlabel.md) | Get the informationProtectionLabel objects from a labels navigation property.  |
| [Create labels](../api/informationprotectionpolicy-post-labels.md)                 | [informationProtectionLabel](../resources/-informationprotectionlabel.md) | Create a new informationProtectionLabel object.                                |
| [Get labels](../api/informationprotectionpolicy-get-labels.md)                     | [informationProtectionLabel](../resources/-informationprotectionlabel.md) | Read the properties and relationships of an informationProtectionLabel object. |
| [Update labels](../api/informationprotectionpolicy-update-labels.md)               | [informationProtectionLabel](../resources/-informationprotectionlabel.md) | Update the properties of an informationProtectionLabel object.                 |
| [Delete labels](../api/informationprotectionpolicy-delete-labels.md)               |                                                                           | Delete an informationProtectionLabel object.                                   |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |

## Relationships

| Relationship | Type                                                                                | Description |
| :----------- | :---------------------------------------------------------------------------------- | :---------- |
| labels       | [informationProtectionLabel](../resources/informationprotectionlabel.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.informationProtectionPolicy",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.informationProtectionPolicy",
  "id": "String (identifier)"
}
```
