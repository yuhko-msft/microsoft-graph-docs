---
title: "privateLinkResource resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# privateLinkResource resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                             | Return Type                                              | Description                                                        |
| :----------------------------------------------------------------- | :------------------------------------------------------- | :----------------------------------------------------------------- |
| [List privateLinkResource](../api/privatelinkresource-list.md)     | [privateLinkResource](privateLinkResource.md) collection | List properties and relationships of a privateLinkResource object. |
| [Create privateLinkResource](../api/privatelinkresource-create.md) | [privateLinkResource](privateLinkResource.md)            | Create a new privateLinkResource object.                           |
| [Get privateLinkResource](../api/privatelinkresource-get.md)       | [privateLinkResource](privateLinkResource.md)            | Read properties and relationships of a privateLinkResource object. |
| [Update privateLinkResource](../api/privatelinkresource-update.md) | [privateLinkResource](privateLinkResource.md)            | Update the properties of a privateLinkResource object.             |
| [Delete privateLinkResource](../api/privatelinkresource-delete.md) |                                                          | Delete a privateLinkResource object.                               |

## Properties

| Property         | Type              | Description |
| :--------------- | :---------------- | :---------- |
| allowedTenantIds | String collection |             |
| armResourceId    | String            |             |
| id               | String            | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.privateLinkResource",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.privateLinkResource",
  "allowedTenantIds": ["String"],
  "armResourceId": "String",
  "id": "String (identifier)"
}
```
