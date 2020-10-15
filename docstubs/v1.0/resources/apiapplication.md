---
title: "apiApplication resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# apiApplication resource type

Namespace: microsoft.graph

## Properties

| Property                    | Type                                                                            | Description |
| :-------------------------- | :------------------------------------------------------------------------------ | :---------- |
| acceptMappedClaims          | Boolean                                                                         |             |
| knownClientApplications     | Guid collection                                                                 |             |
| oauth2PermissionScopes      | [permissionScope](../resources/permissionscope.md) collection                   |             |
| preAuthorizedApplications   | [preAuthorizedApplication](../resources/preauthorizedapplication.md) collection |             |
| requestedAccessTokenVersion | Int32                                                                           |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.apiApplication",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.apiApplication",
  "acceptMappedClaims": "Boolean",
  "knownClientApplications": ["Guid"],
  "oauth2PermissionScopes": [{"@odata.type": "microsoft.graph.permissionScope"}],
  "preAuthorizedApplications": [{"@odata.type": "microsoft.graph.preAuthorizedApplication"}],
  "requestedAccessTokenVersion": "Int32"
}
```
