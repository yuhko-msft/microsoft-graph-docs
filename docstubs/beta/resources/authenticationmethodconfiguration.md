---
title: "authenticationMethodConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# authenticationMethodConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                         | Return Type                                                                          | Description                                                                       |
| :--------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------- | :-------------------------------------------------------------------------------- |
| [List authenticationMethodConfiguration](../api/authenticationmethodconfiguration-list.md)     | [authenticationMethodConfiguration](authenticationMethodConfiguration.md) collection | List properties and relationships of an authenticationMethodConfiguration object. |
| [Create authenticationMethodConfiguration](../api/authenticationmethodconfiguration-create.md) | [authenticationMethodConfiguration](authenticationMethodConfiguration.md)            | Create a new authenticationMethodConfiguration object.                            |
| [Get authenticationMethodConfiguration](../api/authenticationmethodconfiguration-get.md)       | [authenticationMethodConfiguration](authenticationMethodConfiguration.md)            | Read properties and relationships of an authenticationMethodConfiguration object. |
| [Update authenticationMethodConfiguration](../api/authenticationmethodconfiguration-update.md) | [authenticationMethodConfiguration](authenticationMethodConfiguration.md)            | Update the properties of an authenticationMethodConfiguration object.             |
| [Delete authenticationMethodConfiguration](../api/authenticationmethodconfiguration-delete.md) |                                                                                      | Delete an authenticationMethodConfiguration object.                               |

## Properties

| Property | Type   | Description |
| :------- | :----- | :---------- |
| id       | String | Read-only.  |
| state    | String |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.authenticationMethodConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.authenticationMethodConfiguration",
  "id": "String (identifier)",
  "state": "enabled | disabled"
}
```
