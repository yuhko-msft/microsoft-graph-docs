---
title: "managedEBookCategory resource type"
description: "Contains properties for a single Intune eBook category."
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# managedEBookCategory resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Contains properties for a single Intune eBook category.

## Methods

| Method                                                                      | Return Type                                                       | Description                                                         |
| :-------------------------------------------------------------------------- | :---------------------------------------------------------------- | :------------------------------------------------------------------ |
| [List managedEBookCategory](../api/intune-managedebookcategory-list.md)     | [managedEBookCategory](intune-managedEBookCategory.md) collection | List properties and relationships of a managedEBookCategory object. |
| [Create managedEBookCategory](../api/intune-managedebookcategory-create.md) | [managedEBookCategory](intune-managedEBookCategory.md)            | Create a new managedEBookCategory object.                           |
| [Get managedEBookCategory](../api/intune-managedebookcategory-get.md)       | [managedEBookCategory](intune-managedEBookCategory.md)            | Read properties and relationships of a managedEBookCategory object. |
| [Update managedEBookCategory](../api/intune-managedebookcategory-update.md) | [managedEBookCategory](intune-managedEBookCategory.md)            | Update the properties of a managedEBookCategory object.             |
| [Delete managedEBookCategory](../api/intune-managedebookcategory-delete.md) |                                                                   | Delete a managedEBookCategory object.                               |

## Properties

| Property             | Type           | Description                                                   |
| :------------------- | :------------- | :------------------------------------------------------------ |
| displayName          | String         | The name of the eBook category.                               |
| id                   | String         | The key of the entity. Read-only.                             |
| lastModifiedDateTime | DateTimeOffset | The date and time the ManagedEBookCategory was last modified. |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedEBookCategory",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.managedEBookCategory",
  "displayName": "String",
  "id": "String (identifier)",
  "lastModifiedDateTime": "DateTimeOffset"
}
```
