---
title: "ediscovery resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# ediscovery resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                            | Return Type                                       | Description                                                        |
| :------------------------------------------------ | :------------------------------------------------ | :----------------------------------------------------------------- |
| [List ediscovery](../api/ediscovery-list.md)      | [ediscovery](ediscovery.md) collection            | List properties and relationships of an ediscovery object.         |
| [Create ediscovery](../api/ediscovery-create.md)  | [ediscovery](ediscovery.md)                       | Create a new ediscovery object.                                    |
| [Get ediscovery](../api/ediscovery-get.md)        | [ediscovery](ediscovery.md)                       | Read properties and relationships of an ediscovery object.         |
| [Update ediscovery](../api/ediscovery-update.md)  | [ediscovery](ediscovery.md)                       | Update the properties of an ediscovery object.                     |
| [Delete ediscovery](../api/ediscovery-delete.md)  |                                                   | Delete an ediscovery object.                                       |
| [List cases](../api/ediscovery-list-cases.md)     | [ediscoveryCase](../resources/-ediscoverycase.md) | Get the ediscoveryCase objects from a cases navigation property.   |
| [Create cases](../api/ediscovery-post-cases.md)   | [ediscoveryCase](../resources/-ediscoverycase.md) | Create a new ediscoveryCase object.                                |
| [Get cases](../api/ediscovery-get-cases.md)       | [ediscoveryCase](../resources/-ediscoverycase.md) | Read the properties and relationships of an ediscoveryCase object. |
| [Update cases](../api/ediscovery-update-cases.md) | [ediscoveryCase](../resources/-ediscoverycase.md) | Update the properties of an ediscoveryCase object.                 |
| [Delete cases](../api/ediscovery-delete-cases.md) |                                                   | Delete an ediscoveryCase object.                                   |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship | Type                                                        | Description |
| :----------- | :---------------------------------------------------------- | :---------- |
| cases        | [ediscoveryCase](../resources/ediscoverycase.md) collection |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.ediscovery",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.ediscovery",
}
```
