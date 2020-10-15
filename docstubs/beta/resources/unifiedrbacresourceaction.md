---
title: "unifiedRbacResourceAction resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# unifiedRbacResourceAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Methods

| Method                                                                           | Return Type                                                          | Description                                                                        |
| :------------------------------------------------------------------------------- | :------------------------------------------------------------------- | :--------------------------------------------------------------------------------- |
| [List unifiedRbacResourceAction](../api/unifiedrbacresourceaction-list.md)       | [unifiedRbacResourceAction](unifiedRbacResourceAction.md) collection | List properties and relationships of an unifiedRbacResourceAction object.          |
| [Create unifiedRbacResourceAction](../api/unifiedrbacresourceaction-create.md)   | [unifiedRbacResourceAction](unifiedRbacResourceAction.md)            | Create a new unifiedRbacResourceAction object.                                     |
| [Get unifiedRbacResourceAction](../api/unifiedrbacresourceaction-get.md)         | [unifiedRbacResourceAction](unifiedRbacResourceAction.md)            | Read properties and relationships of an unifiedRbacResourceAction object.          |
| [Update unifiedRbacResourceAction](../api/unifiedrbacresourceaction-update.md)   | [unifiedRbacResourceAction](unifiedRbacResourceAction.md)            | Update the properties of an unifiedRbacResourceAction object.                      |
| [Delete unifiedRbacResourceAction](../api/unifiedrbacresourceaction-delete.md)   |                                                                      | Delete an unifiedRbacResourceAction object.                                        |
| [List resourceScope](../api/unifiedrbacresourceaction-list-resourcescope.md)     | unifiedRbacResourceScope                                             | Get the unifiedRbacResourceScope objects from a resourceScope navigation property. |
| [Create resourceScope](../api/unifiedrbacresourceaction-post-resourcescope.md)   | unifiedRbacResourceScope                                             | Create a new unifiedRbacResourceScope object.                                      |
| [Get resourceScope](../api/unifiedrbacresourceaction-get-resourcescope.md)       | unifiedRbacResourceScope                                             | Read the properties and relationships of an unifiedRbacResourceScope object.       |
| [Update resourceScope](../api/unifiedrbacresourceaction-update-resourcescope.md) | unifiedRbacResourceScope                                             | Update the properties of an unifiedRbacResourceScope object.                       |
| [Delete resourceScope](../api/unifiedrbacresourceaction-delete-resourcescope.md) |                                                                      | Delete an unifiedRbacResourceScope object.                                         |

## Properties

| Property        | Type   | Description |
| :-------------- | :----- | :---------- |
| actionVerb      | String |             |
| description     | String |             |
| id              | String | Read-only.  |
| name            | String |             |
| resourceScopeId | String |             |

## Relationships

| Relationship  | Type                                                                 | Description |
| :------------ | :------------------------------------------------------------------- | :---------- |
| resourceScope | [unifiedRbacResourceScope](../resources/unifiedrbacresourcescope.md) |             |

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.unifiedRbacResourceAction",
  "baseType": "microsoft.graph.entity",
  "openType": False
}
-->

```json
{
  "@odata.type": "#microsoft.graph.unifiedRbacResourceAction",
  "actionVerb": "String",
  "description": "String",
  "id": "String (identifier)",
  "name": "String",
  "resourceScopeId": "String"
}
```
