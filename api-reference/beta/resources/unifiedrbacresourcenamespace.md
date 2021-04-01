---
title: "unifiedRbacResourceNamespace resource type"
description: "A unified resource namespace is a collection of namespaces for an RBAC application."
localization_priority: Normal
author: "abhijeetsinha"
ms.prod: "directory-management"
doc_type: "resourcePageType"
---

# unifiedRbacResourceNamespace resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A unifiedRbacResourceNamespace is a collection of unifiedRbacResourceAction for an rbacApplication or rbacApplicationMultiple.

## Methods

| Method       | Return Type | Description |
|:-------------|:------------|:------------|
| [List unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-list.md) | [unifiedRbacResourceNamespace](unifiedrbacresourcenamespace.md) collection | Read a list of unifiedRbacResourceNamespace objects, and their properties. |
| [Get unifiedRbacResourceNamespace](../api/unifiedrbacresourcenamespace-get.md) | [unifiedRbacResourceNamespace](unifiedrbacresourcenamespace.md) | Read the properties of a unifiedRbacResourceNamespace object. |

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|id|String| Id of the resource namespace. Required. |
|name|String| Display name for the resource namespace. Required.|
|resourceActions|[unifiedRbacResourceAction](unifiedrbacresourceaction.md) collection| A collection of resource actions in the namespace. |

## Relationships

None

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.unifiedRbacResourceNamespace",
  "baseType": "",
  "keyProperty": "id"
}-->

```json
{
  "id": "String (identifier)",
  "name": "String",
  "resourceActions": [{"@odata.type": "microsoft.graph.unifiedRbacResourceAction"}],
}
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "unifiedRbacResourceNamespace resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
