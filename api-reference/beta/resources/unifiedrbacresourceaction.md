---
title: "unifiedRbacResouceAction resource type"
description: "A unifiedRbacResourceAction defines "
localization_priority: Normal
author: "abhijeetsinha"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# unifiedRbacResouceAction resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A unifiedRbacResouceAction defines the action and it's properties related to application specific permissions.

## Methods

| Method       | Return Type | Description |
|:-------------|:------------|:------------|
| [List unifiedRbacResouceAction](../api/unifiedrbacresourceaction-list.md) | [unifiedRbacResouceAction](unifiedrbacresourceaction.md) collection | Read a list of unifiedRbacResouceAction objects, and their properties. |
| [Get unifiedRbacResouceAction](../api/unifiedrbacresourceaction-get.md) | [unifiedRbacResouceAction](unifiedrbacresourceaction.md) | Read the properties of a unifiedRbacResouceAction object. |

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|id|String| Id of the action. Required. |
|name|String| Display name of the action. This will be used when creating custom role. Required. |
|description|String| Description of the action. |
|actionVerb|String| Action verb for the operation. |
|resourceScopeId|String| Action applicable resource id. |
|resourceScope|UnifiedRbacResourceScope| Action applicable resource reference. Read-only. |

## Relationships

None

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.unifiedRbacResouceAction",
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
  "description": "unifiedRbacResouceAction resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
