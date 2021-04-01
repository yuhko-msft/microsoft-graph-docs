---
title: "unifiedRbacResourceScope resource type"
description: "A unifiedRbacResourceScope describes the scope of the resource exposed in the workload where unifiedRbacResourceAction can perform on."
localization_priority: Normal
author: "abhijeetsinha"
ms.prod: "directory-management"
doc_type: "resourcePageType"
---

# unifiedRbacResourceScope resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A unifiedRbacResourceScope describes the scope of the resource exposed in the workload where unifiedRbacResourceAction can perform on.

## Methods
None

## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|id|String| The identifier of an app-specific container or resource that represents the scope of the assignment. Usually the immutable id of the resource. The scope of an assignment determines the set of resources for which the principal has been granted access. Required. |
|displayName|String| Read-only property providing the display name of the app-specific resource represented by the app scope. Provided for display purposes since resourceScopeId is often an immutable, non-human-readable id. Read-only. |
|type|String| Read-only property that describes the type of app-specific resource represented by the app scope. Provided for display purposes, so that a user interface can convey to the user the kind of app-specific resource represented by the app scope. Read-only |

## Relationships

None

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.unifiedRbacResourceScope",
  "baseType": "",
  "keyProperty": "id"
}-->

```json
{
  "id": "String (identifier)",
  "displayName": "String",
  "type": "String",
}
```

<!-- uuid: 16cd6b66-4b1a-43a1-adaf-3a886856ed98
2019-02-04 14:57:30 UTC -->
<!-- {
  "type": "#page.annotation",
  "description": "unifiedRbacResourceScope resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
