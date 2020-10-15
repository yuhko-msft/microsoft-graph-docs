---
title: "certificateBasedAuthConfiguration resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# certificateBasedAuthConfiguration resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                                         | Return Type                                                                          | Description                                                                      |
| :--------------------------------------------------------------------------------------------- | :----------------------------------------------------------------------------------- | :------------------------------------------------------------------------------- |
| [List certificateBasedAuthConfiguration](../api/certificatebasedauthconfiguration-list.md)     | [certificateBasedAuthConfiguration](certificateBasedAuthConfiguration.md) collection | List properties and relationships of a certificateBasedAuthConfiguration object. |
| [Create certificateBasedAuthConfiguration](../api/certificatebasedauthconfiguration-create.md) | [certificateBasedAuthConfiguration](certificateBasedAuthConfiguration.md)            | Create a new certificateBasedAuthConfiguration object.                           |
| [Get certificateBasedAuthConfiguration](../api/certificatebasedauthconfiguration-get.md)       | [certificateBasedAuthConfiguration](certificateBasedAuthConfiguration.md)            | Read properties and relationships of a certificateBasedAuthConfiguration object. |
| [Update certificateBasedAuthConfiguration](../api/certificatebasedauthconfiguration-update.md) | [certificateBasedAuthConfiguration](certificateBasedAuthConfiguration.md)            | Update the properties of a certificateBasedAuthConfiguration object.             |
| [Delete certificateBasedAuthConfiguration](../api/certificatebasedauthconfiguration-delete.md) |                                                                                      | Delete a certificateBasedAuthConfiguration object.                               |

## Properties

| Property               | Type                                                                    | Description |
| :--------------------- | :---------------------------------------------------------------------- | :---------- |
| certificateAuthorities | [certificateAuthority](../resources/certificateauthority.md) collection |             |
| id                     | String                                                                  | Read-only.  |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.certificateBasedAuthConfiguration",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.certificateBasedAuthConfiguration",
  "certificateAuthorities": [{"@odata.type": "microsoft.graph.certificateAuthority"}],
  "id": "String (identifier)"
}
```
