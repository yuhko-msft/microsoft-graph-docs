---
title: "informationProtection resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# informationProtection resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                 | Return Type                                                                 | Description                                                                     |
| :--------------------------------------------------------------------- | :-------------------------------------------------------------------------- | :------------------------------------------------------------------------------ |
| [List informationProtection](../api/informationprotection-list.md)     | [informationProtection](informationProtection.md) collection                | List properties and relationships of an informationProtection object.           |
| [Create informationProtection](../api/informationprotection-create.md) | [informationProtection](informationProtection.md)                           | Create a new informationProtection object.                                      |
| [Get informationProtection](../api/informationprotection-get.md)       | [informationProtection](informationProtection.md)                           | Read properties and relationships of an informationProtection object.           |
| [Update informationProtection](../api/informationprotection-update.md) | [informationProtection](informationProtection.md)                           | Update the properties of an informationProtection object.                       |
| [Delete informationProtection](../api/informationprotection-delete.md) |                                                                             | Delete an informationProtection object.                                         |
| [List policy](../api/informationprotection-list-policy.md)             | [informationProtectionPolicy](../resources/-informationprotectionpolicy.md) | Get the informationProtectionPolicy objects from a policy navigation property.  |
| [Create policy](../api/informationprotection-post-policy.md)           | [informationProtectionPolicy](../resources/-informationprotectionpolicy.md) | Create a new informationProtectionPolicy object.                                |
| [Get policy](../api/informationprotection-get-policy.md)               | [informationProtectionPolicy](../resources/-informationprotectionpolicy.md) | Read the properties and relationships of an informationProtectionPolicy object. |
| [Update policy](../api/informationprotection-update-policy.md)         | [informationProtectionPolicy](../resources/-informationprotectionpolicy.md) | Update the properties of an informationProtectionPolicy object.                 |
| [Delete policy](../api/informationprotection-delete-policy.md)         |                                                                             | Delete an informationProtectionPolicy object.                                   |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship | Type                                                                       | Description |
| :----------- | :------------------------------------------------------------------------- | :---------- |
| policy       | [informationProtectionPolicy](../resources/informationprotectionpolicy.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.informationProtection",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.informationProtection",
}
```
