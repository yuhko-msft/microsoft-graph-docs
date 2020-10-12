---
title: "compliance resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# compliance resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                      | Return Type                               | Description                                                        |
| :---------------------------------------------------------- | :---------------------------------------- | :----------------------------------------------------------------- |
| [List compliance](../api/compliance-list.md)                | [compliance](compliance.md) collection    | List properties and relationships of a compliance object.          |
| [Create compliance](../api/compliance-create.md)            | [compliance](compliance.md)               | Create a new compliance object.                                    |
| [Get compliance](../api/compliance-get.md)                  | [compliance](compliance.md)               | Read properties and relationships of a compliance object.          |
| [Update compliance](../api/compliance-update.md)            | [compliance](compliance.md)               | Update the properties of a compliance object.                      |
| [Delete compliance](../api/compliance-delete.md)            |                                           | Delete a compliance object.                                        |
| [List ediscovery](../api/compliance-list-ediscovery.md)     | [ediscovery](../resources/-ediscovery.md) | Get the ediscovery objects from an ediscovery navigation property. |
| [Create ediscovery](../api/compliance-post-ediscovery.md)   | [ediscovery](../resources/-ediscovery.md) | Create a new ediscovery object.                                    |
| [Get ediscovery](../api/compliance-get-ediscovery.md)       | [ediscovery](../resources/-ediscovery.md) | Read the properties and relationships of an ediscovery object.     |
| [Update ediscovery](../api/compliance-update-ediscovery.md) | [ediscovery](../resources/-ediscovery.md) | Update the properties of an ediscovery object.                     |
| [Delete ediscovery](../api/compliance-delete-ediscovery.md) |                                           | Delete an ediscovery object.                                       |

## Properties

| Property | Type | Description |
| :------- | :--- | :---------- |

## Relationships

| Relationship | Type                                     | Description |
| :----------- | :--------------------------------------- | :---------- |
| ediscovery   | [ediscovery](../resources/ediscovery.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.compliance",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.compliance",
}
```
