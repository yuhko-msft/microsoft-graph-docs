---
title: "oAuth2PermissionGrant resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# oAuth2PermissionGrant resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                 | Return Type                                                  | Description                                                           |
| :--------------------------------------------------------------------- | :----------------------------------------------------------- | :-------------------------------------------------------------------- |
| [List oAuth2PermissionGrant](../api/oauth2permissiongrant-list.md)     | [oAuth2PermissionGrant](oAuth2PermissionGrant.md) collection | List properties and relationships of an oAuth2PermissionGrant object. |
| [Create oAuth2PermissionGrant](../api/oauth2permissiongrant-create.md) | [oAuth2PermissionGrant](oAuth2PermissionGrant.md)            | Create a new oAuth2PermissionGrant object.                            |
| [Get oAuth2PermissionGrant](../api/oauth2permissiongrant-get.md)       | [oAuth2PermissionGrant](oAuth2PermissionGrant.md)            | Read properties and relationships of an oAuth2PermissionGrant object. |
| [Update oAuth2PermissionGrant](../api/oauth2permissiongrant-update.md) | [oAuth2PermissionGrant](oAuth2PermissionGrant.md)            | Update the properties of an oAuth2PermissionGrant object.             |
| [Delete oAuth2PermissionGrant](../api/oauth2permissiongrant-delete.md) |                                                              | Delete an oAuth2PermissionGrant object.                               |
| [delta](../api/oauth2permissiongrant-delta.md)                         |                                                              |                                                                       |

## Properties

| Property    | Type           | Description |
| :---------- | :------------- | :---------- |
| clientId    | String         |             |
| consentType | String         |             |
| expiryTime  | DateTimeOffset |             |
| id          | String         | Read-only.  |
| principalId | String         |             |
| resourceId  | String         |             |
| scope       | String         |             |
| startTime   | DateTimeOffset |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.oAuth2PermissionGrant",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.oAuth2PermissionGrant",
  "clientId": "String",
  "consentType": "String",
  "expiryTime": "DateTimeOffset",
  "id": "String (identifier)",
  "principalId": "String",
  "resourceId": "String",
  "scope": "String",
  "startTime": "DateTimeOffset"
}
```
