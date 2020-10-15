---
title: "linkedResource resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# linkedResource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                   | Return Type                                    | Description                                                   |
| :------------------------------------------------------- | :--------------------------------------------- | :------------------------------------------------------------ |
| [List linkedResource](../api/linkedresource-list.md)     | [linkedResource](linkedResource.md) collection | List properties and relationships of a linkedResource object. |
| [Create linkedResource](../api/linkedresource-create.md) | [linkedResource](linkedResource.md)            | Create a new linkedResource object.                           |
| [Get linkedResource](../api/linkedresource-get.md)       | [linkedResource](linkedResource.md)            | Read properties and relationships of a linkedResource object. |
| [Update linkedResource](../api/linkedresource-update.md) | [linkedResource](linkedResource.md)            | Update the properties of a linkedResource object.             |
| [Delete linkedResource](../api/linkedresource-delete.md) |                                                | Delete a linkedResource object.                               |

## Properties

| Property        | Type   | Description |
| :-------------- | :----- | :---------- |
| applicationName | String |             |
| displayName     | String |             |
| externalId      | String |             |
| id              | String | Read-only.  |
| webUrl          | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.linkedResource",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.linkedResource",
  "applicationName": "String",
  "displayName": "String",
  "externalId": "String",
  "id": "String (identifier)",
  "webUrl": "String"
}
```
