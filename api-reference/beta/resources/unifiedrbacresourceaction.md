---
title: "unifiedRbacResourceAction resource type"
description: "A unifiedRbacResourceAction defines the action and it's properties related to application specific permissions"
localization_priority: Normal
author: "abhijeetsinha"
ms.prod: "directory-management"
doc_type: "resourcePageType"
---

# unifiedRbacResourceAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A unifiedRbacResourceAction defines the action and it's properties related to application specific permissions.

## Methods

| Method       | Return Type | Description |
|:-------------|:------------|:------------|
| [List unifiedRbacResourceAction](../api/unifiedrbacresourceaction-list.md) | [unifiedRbacResourceAction](unifiedrbacresourceaction.md) collection | Read a list of unifiedRbacResourceAction objects, and their properties. |
| [Get unifiedRbacResourceAction](../api/unifiedrbacresourceaction-get.md) | [unifiedRbacResourceAction](unifiedrbacresourceaction.md) | Read the properties of a unifiedRbacResourceAction object. |

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|id|String| The identifier of the action. Required. |
|name|String| Display name of the action. This will be used when creating custom role. Required. |
|description|String| Description of the action. |
|actionVerb|String| Action verb for the operation. It can have these values - GET, POST, PATCH, DELETE or null. |
|resourceScopeId|String| Resource type the permission is applicable on. |
|resourceScope|[UnifiedRbacResourceScope](unifiedrbacresourcescope.md)| Property referncing the resource type on which the action is applicable. Read-only. |

## Relationships

None

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.unifiedRbacResourceAction",
  "baseType": "",
  "keyProperty": "id"
}-->

```json
{
  "id": "String (identifier)",
  "name": "String",
  "description": "String",
  "actionVerb": "String",
  "resourceScopeId": "String",
  "resourceScope": {"@odata.type": "microsoft.graph.unifiedRbacResourceScope"}
}
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "unifiedRbacResourceAction resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
