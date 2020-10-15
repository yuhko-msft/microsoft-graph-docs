---
title: "passwordProfile resource type"
description: ""
localization_priority: Normal
author: "$(metadata.owner)"
ms.prod: ""
doc_type: "resourcePageType"
---

# passwordProfile resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

## Properties

| Property                             | Type    | Description |
| :----------------------------------- | :------ | :---------- |
| forceChangePasswordNextSignIn        | Boolean |             |
| forceChangePasswordNextSignInWithMfa | Boolean |             |
| password                             | String  |             |

## Relationships

None.

## JSON representation

The following is a JSON representation of the resource.

<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.passwordProfile",
}
-->

```json
{
  "@odata.type": "#microsoft.graph.passwordProfile",
  "forceChangePasswordNextSignIn": "Boolean",
  "forceChangePasswordNextSignInWithMfa": "Boolean",
  "password": "String"
}
```
