---
title: "unifiedRbacResouceScope resource type"
description: "A unifiedRbacResouceScope describes the scope of the resource exposed in the workload where unifiedRbacResourceAction can perform on."
localization_priority: Normal
author: "abhijeetsinha"
ms.prod: "microsoft-identity-platform"
doc_type: "resourcePageType"
---

# unifiedRbacResouceScope resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

A unifiedRbacResouceScope describes the scope of the resource exposed in the workload where unifiedRbacResourceAction can perform on.

## Methods

| Method       | Return Type | Description |
|:-------------|:------------|:------------|



## Properties

| Property     | Type        | Description |
|:-------------|:------------|:------------|
|id|String| Id of an app-specific container or resource representing the scope of the assignment. Usually the immutable id of the resource. The scope of an assignment determines the set of resources for which the principal has been granted access. Required. |
|displayName|String| Read-only property providing the display name of the app-specific resource represented by the app scope. Provided for display purposes since resourceScopeId is often an immutable, non-human-readable id. Read-only. |
|type|String| Read-only property describing the type of app-specific resource represented by the app scope. Provided for display purposes, so a user interface can convey to the user the kind of app specific resource represented by the app scope. Read-only |

## Relationships

None

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "optionalProperties": [

  ],
  "@odata.type": "microsoft.graph.unifiedRbacResouceScope",
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
  "description": "unifiedRbacResouceScope resource",
  "keywords": "",
  "section": "documentation",
  "tocPath": ""
}-->
