---
title: "authenticationAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# authenticationAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                               | Return Type                                                | Description                                                          |
| :------------------------------------------------------------------- | :--------------------------------------------------------- | :------------------------------------------------------------------- |
| [List authenticationAction](../api/authenticationaction-list.md)     | [authenticationAction](authenticationAction.md) collection | List properties and relationships of an authenticationAction object. |
| [Create authenticationAction](../api/authenticationaction-create.md) | [authenticationAction](authenticationAction.md)            | Create a new authenticationAction object.                            |
| [Get authenticationAction](../api/authenticationaction-get.md)       | [authenticationAction](authenticationAction.md)            | Read properties and relationships of an authenticationAction object. |
| [Update authenticationAction](../api/authenticationaction-update.md) | [authenticationAction](authenticationAction.md)            | Update the properties of an authenticationAction object.             |
| [Delete authenticationAction](../api/authenticationaction-delete.md) |                                                            | Delete an authenticationAction object.                               |

## Properties

| Property     | Type                                                                     | Description |
| :----------- | :----------------------------------------------------------------------- | :---------- |
| id           | String                                                                   | Read-only.  |
| priority     | Int32                                                                    |             |
| sourceFilter | [authenticationSourceFilter](../resources/authenticationsourcefilter.md) |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationAction",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.authenticationAction",
  "id": "String (identifier)",
  "priority": "Int32",
  "sourceFilter": {"@odata.type": "microsoft.graph.authenticationSourceFilter"}
}
```
